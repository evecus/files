package com.silm.live.ui.account

import android.annotation.SuppressLint
import android.webkit.CookieManager
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import android.view.ViewGroup
import androidx.compose.ui.viewinterop.AndroidView
import com.silm.live.data.SettingsStore
import kotlinx.coroutines.launch

/**
 * 账号登录页（对齐 Flutter 的 WebView 登录机制）：
 *  - 内嵌 WebView 打开对应平台站点，用户手动完成登录（验证码/扫码等）
 *  - 点「保存登录态」读取 WebView Cookie，校验含登录字段后存入 SettingsStore
 *  - 抖音登录态用于直播搜索；快手登录态用于搜索风控与弹幕
 */
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("SetJavaScriptEnabled")
@Composable
fun AccountLoginScreen(platform: String, onBack: () -> Unit) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val snackbar = remember { SnackbarHostState() }

    val title = if (platform == "douyin") "登录抖音" else "登录快手"
    val homeUrl = if (platform == "douyin") "https://www.douyin.com/" else "https://live.kuaishou.com/"
    val cookieUrls = if (platform == "douyin") {
        listOf("https://www.douyin.com", "https://douyin.com", "https://live.douyin.com")
    } else {
        listOf("https://live.kuaishou.com", "https://www.kuaishou.com", "https://kuaishou.com")
    }

    var webView by remember { mutableStateOf<WebView?>(null) }
    var progress by remember { mutableStateOf(0f) }
    var saving by remember { mutableStateOf(false) }

    fun saveLogin() {
        if (saving) return
        saving = true
        val cookie = cookieUrls
            .mapNotNull { CookieManager.getInstance().getCookie(it) }
            .flatMap { c -> c.split(";") }
            .mapNotNull { part ->
                val kv = part.trim().split("=", limit = 2)
                if (kv.size == 2 && kv[0].isNotBlank() && kv[1].isNotBlank()) kv[0].trim() to kv[1].trim() else null
            }
            .toMap(LinkedHashMap())
            .entries.joinToString("; ") { "${it.key}=${it.value}" }

        val hasLogin = when (platform) {
            "douyin" -> listOf("sessionid=", "sid_guard=", "sid_tt=", "uid_tt=", "login_status=1")
                .any { cookie.lowercase().contains(it) }
            else -> listOf("kuaishou.live.web_st", "kuaishou.server.web_st", "passToken")
                .any { cookie.contains(it) }
        }

        scope.launch {
            if (cookie.isEmpty()) {
                snackbar.showSnackbar("未读取到 Cookie，请先在页面中打开并登录")
            } else if (!hasLogin) {
                snackbar.showSnackbar("还没有检测到登录态，请先在页面中完成登录")
            } else {
                if (platform == "douyin") {
                    SettingsStore.setDouyinCookie(context, cookie)
                    snackbar.showSnackbar("抖音登录态已保存，可用于搜索")
                } else {
                    SettingsStore.setKuaishouCookie(context, cookie)
                    snackbar.showSnackbar("快手登录态已保存，可用于搜索")
                }
                onBack()
            }
            saving = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(title) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                },
                actions = {
                    androidx.compose.material3.TextButton(
                        onClick = { saveLogin() },
                        enabled = !saving,
                    ) { Text(if (saving) "保存中…" else "保存登录态") }
                },
            )
        },
        snackbarHost = { SnackbarHost(snackbar) },
    ) { padding ->
        Column(Modifier.padding(padding).fillMaxSize()) {
            if (progress < 1f) {
                LinearProgressIndicator(
                    progress = { progress },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
            Text(
                text = if (platform == "douyin")
                    "在页面中登录抖音账号（短信/扫码均可），登录成功后点右上角「保存登录态」。"
                else
                    "在页面中登录快手账号，登录成功后点右上角「保存登录态」。",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp, vertical = 8.dp),
            )
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { ctx ->
                    WebView(ctx).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT,
                        )
                        settings.javaScriptEnabled = true
                        settings.domStorageEnabled = true
                        settings.userAgentString =
                            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36 Edg/125.0.0.0"
                        CookieManager.getInstance().setAcceptCookie(true)
                        CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)
                        webViewClient = object : WebViewClient() {
                            override fun shouldOverrideUrlLoading(
                                view: WebView?,
                                request: WebResourceRequest?,
                            ): Boolean = false

                            override fun onPageFinished(view: WebView?, url: String?) {
                                progress = 1f
                            }
                        }
                        loadUrl(homeUrl)
                        webView = this
                    }
                },
                onRelease = { it.destroy() },
            )
        }
    }

    BackHandler(enabled = webView?.canGoBack() == true) {
        webView?.goBack()
    }
}

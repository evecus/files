package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sy3 extends WebViewClient {
    public final /* synthetic */ od2 a;

    public sy3(od2 od2Var) {
        this.a = od2Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        webView.evaluateJavascript("\n(function(){\n  if (window.__dyHook) return;\n  window.__dyHook = true;\n  window.__dyQr = null;\n  window.__dyPoll = null;\n  window.__dyPollAt = 0;\n  function save(url, text) {\n    try {\n      if (url.indexOf('/passport/web/get_qrcode/') >= 0) window.__dyQr = text;\n      else if (url.indexOf('/passport/web/check_qrconnect/') >= 0) {\n        window.__dyPoll = text;\n        window.__dyPollAt = Date.now();\n      }\n    } catch (e) {}\n  }\n  var open = XMLHttpRequest.prototype.open;\n  var send = XMLHttpRequest.prototype.send;\n  XMLHttpRequest.prototype.open = function(method, url) {\n    try { this.__dyUrl = String(url || ''); } catch (e) {}\n    return open.apply(this, arguments);\n  };\n  XMLHttpRequest.prototype.send = function() {\n    var xhr = this;\n    try {\n      xhr.addEventListener('load', function() {\n        // 页面换码的请求用 responseType=json，这时读 responseText 会抛异常\n        var text = '';\n        try { text = xhr.responseText; } catch (e) {\n          try { text = JSON.stringify(xhr.response); } catch (e2) { text = ''; }\n        }\n        save(xhr.__dyUrl, text);\n      });\n    } catch (e) {}\n    return send.apply(this, arguments);\n  };\n  if (window.fetch) {\n    var origFetch = window.fetch;\n    window.fetch = function(input) {\n      var url = '';\n      try { url = typeof input === 'string' ? input : ((input && input.url) || ''); } catch (e) {}\n      return origFetch.apply(this, arguments).then(function(res) {\n        try { res.clone().text().then(function(t) { save(url, t); }); } catch (e) {}\n        return res;\n      });\n    };\n  }\n})()\n", null);
        od2 od2Var = this.a;
        if (((qb0) od2Var.e).isActive()) {
            ((qb0) od2Var.e).S(wd5.a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        webView.evaluateJavascript("\n(function(){\n  if (window.__dyHook) return;\n  window.__dyHook = true;\n  window.__dyQr = null;\n  window.__dyPoll = null;\n  window.__dyPollAt = 0;\n  function save(url, text) {\n    try {\n      if (url.indexOf('/passport/web/get_qrcode/') >= 0) window.__dyQr = text;\n      else if (url.indexOf('/passport/web/check_qrconnect/') >= 0) {\n        window.__dyPoll = text;\n        window.__dyPollAt = Date.now();\n      }\n    } catch (e) {}\n  }\n  var open = XMLHttpRequest.prototype.open;\n  var send = XMLHttpRequest.prototype.send;\n  XMLHttpRequest.prototype.open = function(method, url) {\n    try { this.__dyUrl = String(url || ''); } catch (e) {}\n    return open.apply(this, arguments);\n  };\n  XMLHttpRequest.prototype.send = function() {\n    var xhr = this;\n    try {\n      xhr.addEventListener('load', function() {\n        // 页面换码的请求用 responseType=json，这时读 responseText 会抛异常\n        var text = '';\n        try { text = xhr.responseText; } catch (e) {\n          try { text = JSON.stringify(xhr.response); } catch (e2) { text = ''; }\n        }\n        save(xhr.__dyUrl, text);\n      });\n    } catch (e) {}\n    return send.apply(this, arguments);\n  };\n  if (window.fetch) {\n    var origFetch = window.fetch;\n    window.fetch = function(input) {\n      var url = '';\n      try { url = typeof input === 'string' ? input : ((input && input.url) || ''); } catch (e) {}\n      return origFetch.apply(this, arguments).then(function(res) {\n        try { res.clone().text().then(function(t) { save(url, t); }); } catch (e) {}\n        return res;\n      });\n    };\n  }\n})()\n", null);
    }
}

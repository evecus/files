package com.github.mytv.dv;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import coil3.ComponentRegistry;
import coil3.ImageLoader;
import coil3.SingletonImageLoader;
import coil3.Uri;
import coil3.network.okhttp.OkHttpNetworkFetcher;
import com.github.mytv.dv.CrashActivity;
import com.github.mytv.dv.MyApplication;
import com.github.mytv.dv.model.VideoPlayUrlResolver;
import com.github.mytv.dv.widget.WidgetRefreshScheduler;
import com.whl.quickjs.android.QuickJSLoader;
import defpackage.fj0;
import defpackage.g54;
import defpackage.h54;
import defpackage.hu2;
import defpackage.i42;
import defpackage.k;
import defpackage.ne5;
import defpackage.oe5;
import defpackage.os0;
import defpackage.p70;
import defpackage.q53;
import defpackage.r53;
import defpackage.s24;
import defpackage.s53;
import defpackage.sx0;
import defpackage.tf0;
import defpackage.ur0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MyApplication extends Application implements SingletonImageLoader.Factory, tf0 {
    public static final q53 Companion = new q53();
    public hu2 I;

    @Override // coil3.SingletonImageLoader.Factory
    public final ImageLoader newImageLoader(Context context) {
        context.getClass();
        ne5 ne5Var = oe5.a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        oe5.a(builder);
        OkHttpClient build = builder.addInterceptor(new r53()).build();
        ImageLoader.Builder builder2 = new ImageLoader.Builder(context);
        ComponentRegistry.Builder builder3 = new ComponentRegistry.Builder();
        builder3.add(OkHttpNetworkFetcher.factory(build), s24.a(Uri.class));
        return builder2.components(builder3.build()).build();
    }

    @Override // android.app.Application
    public final void onCreate() {
        Object g54Var;
        super.onCreate();
        Companion.getClass();
        WidgetRefreshScheduler.INSTANCE.scheduleAll(this);
        VideoPlayUrlResolver.INSTANCE.init(this);
        registerActivityLifecycleCallbacks(new s53());
        try {
            QuickJSLoader.init();
            g54Var = Integer.valueOf(Log.i("myDV", "QuickJSLoader initialised"));
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        Throwable a = h54.a(g54Var);
        if (a != null) {
            Log.w("myDV", "QuickJSLoader.init() failed (QuickJS not available?)", a);
        }
        os0 os0Var = sx0.a;
        p70.g0(i42.H(ur0.I), null, null, new k((Object) this, (fj0) null, (byte) 13), 3);
        Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: p53
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                MyApplication myApplication = MyApplication.this;
                q53 q53Var = MyApplication.Companion;
                Log.e("myDV_CRASH", "=== 应用崩溃 ===", th2);
                try {
                    StringWriter stringWriter = new StringWriter();
                    th2.printStackTrace(new PrintWriter(stringWriter));
                    StringBuilder sb = new StringBuilder("━━ myDV 崩溃报告 ━━\n");
                    sb.append("时间: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
                    sb.append('\n');
                    sb.append("设备: " + Build.BRAND + " " + Build.MODEL);
                    sb.append("\n应用版本: 2.3.43 (43)\n");
                    sb.append("Android: " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + ")");
                    sb.append('\n');
                    String name = thread.getName();
                    StringBuilder sb2 = new StringBuilder("线程: ");
                    sb2.append(name);
                    sb.append(sb2.toString());
                    sb.append("\n\n━━ 异常信息 ━━\n");
                    sb.append(th2.getClass().getName() + ": " + th2.getMessage());
                    sb.append('\n');
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        sb.append("根因: " + cause.getClass().getName() + ": " + cause.getMessage());
                        sb.append('\n');
                    }
                    sb.append("\n━━ 堆栈跟踪 ━━\n");
                    sb.append(stringWriter.toString());
                    String sb3 = sb.toString();
                    Intent intent = new Intent(myApplication, (Class<?>) CrashActivity.class);
                    intent.addFlags(268468224);
                    intent.putExtra("crash_info", sb3);
                    myApplication.startActivity(intent);
                } catch (Exception e) {
                    Log.e("myDV_CRASH", "启动CrashActivity失败", e);
                }
                Thread.sleep(500L);
                Process.killProcess(Process.myPid());
            }
        });
        Log.i("myDV", "Application onCreate 完成");
    }
}

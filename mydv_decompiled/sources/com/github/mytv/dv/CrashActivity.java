package com.github.mytv.dv;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.github.mytv.dv.CrashActivity;
import defpackage.nk;
import defpackage.tl0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CrashActivity extends nk {
    public static final tl0 Companion = new tl0();

    @Override // defpackage.nk, defpackage.ic0, defpackage.hc0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = getIntent().getStringExtra("crash_info");
        if (stringExtra == null) {
            stringExtra = "未知错误";
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(32, 48, 32, 32);
        linearLayout.setBackgroundColor(-15658735);
        TextView textView = new TextView(this);
        textView.setText("💥 应用崩溃了");
        textView.setTextSize(28.0f);
        textView.setTextColor(-119723);
        textView.setPadding(0, 0, 0, 16);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this);
        textView2.setText("请截图或复制以下信息反馈给开发者：");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-1426063361);
        textView2.setPadding(0, 0, 0, 24);
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding(0, 0, 0, 16);
        Button button = new Button(this);
        button.setText("📋 复制日志");
        button.setTextSize(14.0f);
        button.setTextColor(-1);
        button.setBackgroundColor(-119723);
        button.setPadding(32, 16, 32, 16);
        button.setOnClickListener(new View.OnClickListener() { // from class: rl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tl0 tl0Var = CrashActivity.Companion;
                CrashActivity crashActivity = CrashActivity.this;
                Object systemService = crashActivity.getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager == null) {
                    Toast.makeText(crashActivity, "无法访问剪贴板", 0).show();
                } else {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("crash_log", stringExtra));
                    Toast.makeText(crashActivity, "已复制到剪贴板", 0).show();
                }
            }
        });
        linearLayout2.addView(button);
        Button button2 = new Button(this);
        button2.setText("🔄 重启应用");
        button2.setTextSize(14.0f);
        button2.setTextColor(-1);
        button2.setBackgroundColor(-13421773);
        button2.setPadding(32, 16, 32, 16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(16);
        button2.setLayoutParams(layoutParams);
        button2.setOnClickListener(new View.OnClickListener() { // from class: sl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tl0 tl0Var = CrashActivity.Companion;
                CrashActivity crashActivity = CrashActivity.this;
                Intent launchIntentForPackage = crashActivity.getPackageManager().getLaunchIntentForPackage(crashActivity.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268468224);
                }
                crashActivity.startActivity(launchIntentForPackage);
                crashActivity.finishAffinity();
            }
        });
        linearLayout2.addView(button2);
        linearLayout.addView(linearLayout2);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TextView textView3 = new TextView(this);
        textView3.setText(stringExtra);
        textView3.setTextSize(11.0f);
        textView3.setTextColor(-3355444);
        textView3.setBackgroundColor(-15066598);
        textView3.setPadding(24, 24, 24, 24);
        textView3.setTypeface(Typeface.MONOSPACE);
        textView3.setTextIsSelectable(true);
        scrollView.addView(textView3);
        linearLayout.addView(scrollView);
        setContentView(linearLayout);
    }
}

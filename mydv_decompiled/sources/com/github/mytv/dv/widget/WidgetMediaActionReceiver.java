package com.github.mytv.dv.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.er0;
import defpackage.ik;
import defpackage.kx2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetMediaActionReceiver extends BroadcastReceiver {
    public static final String ACTION_MEDIA = "com.github.mytv.dv.widget.MEDIA";
    public static final String EXTRA_KEY_CODE = "key_code";
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        int intExtra = intent.getIntExtra(EXTRA_KEY_CODE, -1);
        if (intExtra >= 0) {
            kx2.Companion.getClass();
            kx2 kx2Var = kx2.c;
            if (kx2Var != null) {
                kx2Var.a.getWindow().getDecorView().post(new ik(kx2Var, intExtra, (byte) 2));
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}

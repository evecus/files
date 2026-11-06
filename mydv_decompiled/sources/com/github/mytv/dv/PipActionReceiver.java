package com.github.mytv.dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.fw4;
import defpackage.hu2;
import defpackage.zm3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class PipActionReceiver extends BroadcastReceiver {
    public static final zm3 Companion = new zm3();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        context.getClass();
        intent.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        hu2 hu2Var = ((MyApplication) applicationContext).I;
        if (hu2Var == null || (action = intent.getAction()) == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -1510700556) {
            if (hashCode == -880071915) {
                if (action.equals("com.github.mytv.dv.PIP_NEXT")) {
                    fw4 fw4Var = hu2Var.R;
                    Boolean bool = Boolean.TRUE;
                    fw4Var.getClass();
                    fw4Var.i(null, bool);
                    return;
                }
                return;
            }
            if (hashCode != -880006314 || !action.equals("com.github.mytv.dv.PIP_PLAY")) {
                return;
            }
        } else if (!action.equals("com.github.mytv.dv.PIP_PAUSE")) {
            return;
        }
        fw4 fw4Var2 = hu2Var.P;
        fw4Var2.i(null, Integer.valueOf(((Number) fw4Var2.getValue()).intValue() + 1));
    }
}

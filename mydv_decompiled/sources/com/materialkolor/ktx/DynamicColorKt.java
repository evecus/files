package com.materialkolor.ktx;

import defpackage.a90;
import defpackage.b51;
import defpackage.k51;
import defpackage.mw2;
import defpackage.qb;
import defpackage.tm1;
import defpackage.ut0;
import defpackage.zs1;
import java.util.HashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DynamicColorKt {
    public static final long getColor(b51 b51Var, k51 k51Var) {
        b51Var.getClass();
        k51Var.getClass();
        tm1 tm1Var = b51Var.j;
        HashMap hashMap = b51Var.k;
        zs1 zs1Var = (zs1) hashMap.get(k51Var);
        if (zs1Var == null) {
            zs1Var = (k51Var.l == a90.L ? mw2.c : mw2.b).e(b51Var, k51Var);
            if (hashMap.size() > 4) {
                hashMap.clear();
            }
            hashMap.put(k51Var, zs1Var);
        }
        int i = zs1Var.a;
        Double d = tm1Var != null ? (Double) tm1Var.invoke(k51Var) : null;
        if (tm1Var != null && d != null) {
            i = (i & 16777215) | (ut0.r((int) Math.rint(d.doubleValue() * 255.0d), 0, 255) << 24);
        }
        return qb.i(i);
    }
}

package com.materialkolor.ktx;

import defpackage.aw2;
import defpackage.bw2;
import defpackage.de0;
import defpackage.fe0;
import defpackage.go1;
import defpackage.h51;
import defpackage.k51;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MaterialDynamicColorsKt {
    public static final bw2 getColors(h51 h51Var, fe0 fe0Var, int i) {
        h51Var.getClass();
        k51 c = h51Var.c(fe0Var);
        go1 go1Var = (go1) fe0Var;
        boolean g = go1Var.g(c);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            ((Boolean) h51Var.d.getValue()).booleanValue();
            c.getClass();
            Q = new bw2();
            go1Var.o0(Q);
        }
        return (bw2) Q;
    }

    public static final aw2 getM3Colors(h51 h51Var, fe0 fe0Var, int i) {
        h51Var.getClass();
        k51 c = h51Var.c(fe0Var);
        go1 go1Var = (go1) fe0Var;
        boolean g = go1Var.g(c);
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = new aw2();
            go1Var.o0(Q);
        }
        return (aw2) Q;
    }
}

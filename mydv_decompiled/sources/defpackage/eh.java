package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class eh {
    public static final ku4 a = qb.g0(0.0f, 0.0f, null, 7);

    static {
        Map map = js5.a;
        qb.g0(0.0f, 0.0f, new r11(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final cw4 a(float f, ve1 ve1Var, String str, fe0 fe0Var, int i) {
        return c(new r11(f), p70.H, ve1Var, null, str, fe0Var, ((i << 3) & 896) | 24576, 8);
    }

    public static final cw4 b(float f, bj bjVar, String str, fe0 fe0Var, int i) {
        bj bjVar2;
        if (bjVar == a) {
            go1 go1Var = (go1) fe0Var;
            go1Var.d0(1144115775);
            boolean d = go1Var.d(0.01f);
            Object Q = go1Var.Q();
            if (d || Q == de0.a) {
                Q = qb.g0(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                go1Var.o0(Q);
            }
            go1Var.q(false);
            bjVar2 = (ku4) Q;
        } else {
            go1 go1Var2 = (go1) fe0Var;
            go1Var2.d0(1144225701);
            go1Var2.q(false);
            bjVar2 = bjVar;
        }
        return c(Float.valueOf(f), p70.F, bjVar2, null, str, fe0Var, 24576, 0);
    }

    public static final cw4 c(Object obj, ub5 ub5Var, bj bjVar, Float f, String str, fe0 fe0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        go1 go1Var = (go1) fe0Var;
        Object Q = go1Var.Q();
        Object obj2 = de0.a;
        if (Q == obj2) {
            Q = ad4.w(null);
            go1Var.o0(Q);
        }
        t43 t43Var = (t43) Q;
        Object Q2 = go1Var.Q();
        if (Q2 == obj2) {
            Q2 = new bh(obj, ub5Var, f);
            go1Var.o0(Q2);
        }
        bh bhVar = (bh) Q2;
        t43 x = ad4.x(null, go1Var);
        if (f != null && (bjVar instanceof ku4)) {
            ku4 ku4Var = (ku4) bjVar;
            if (!j42.c(ku4Var.c, f)) {
                bjVar = new ku4(ku4Var.a, ku4Var.b, f);
            }
        }
        t43 x2 = ad4.x(bjVar, go1Var);
        Object Q3 = go1Var.Q();
        if (Q3 == obj2) {
            Q3 = qb.g(-1, 6, null);
            go1Var.o0(Q3);
        }
        k20 k20Var = (k20) Q3;
        boolean i3 = go1Var.i(k20Var) | ((((i & 14) ^ 6) > 4 && go1Var.i(obj)) || (6 & i) == 4);
        Object Q4 = go1Var.Q();
        if (i3 || Q4 == obj2) {
            Q4 = new k9(k20Var, obj, (byte) 1);
            go1Var.o0(Q4);
        }
        mw2.L(go1Var, (rm1) Q4);
        boolean i4 = go1Var.i(k20Var) | go1Var.i(bhVar) | go1Var.g(x2) | go1Var.g(x);
        Object Q5 = go1Var.Q();
        if (i4 || Q5 == obj2) {
            Object dhVar = new dh(k20Var, bhVar, x2, x, null);
            go1Var.o0(dhVar);
            Q5 = dhVar;
        }
        mw2.h(go1Var, (hn1) Q5, k20Var);
        cw4 cw4Var = (cw4) t43Var.getValue();
        return cw4Var == null ? bhVar.c : cw4Var;
    }
}

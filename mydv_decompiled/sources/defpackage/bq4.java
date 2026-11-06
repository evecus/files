package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class bq4 {
    static {
        qb.g0(0.0f, 0.0f, null, 7);
    }

    public static final cw4 a(long j, bj bjVar, String str, fe0 fe0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        go1 go1Var = (go1) fe0Var;
        boolean g = go1Var.g(x70.f(j));
        Object Q = go1Var.Q();
        if (g || Q == de0.a) {
            Q = hf1.s(hh.M, new kh(x70.f(j), (byte) 3), go1Var);
        }
        int i3 = i << 6;
        return eh.c(new x70(j), (ub5) Q, bjVar, null, str2, go1Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }
}

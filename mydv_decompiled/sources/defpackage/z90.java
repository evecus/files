package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class z90 {
    public static final ba0 a = new ba0(i42.d, q8.V);

    public static final ba0 a(mp mpVar, tv tvVar, fe0 fe0Var, int i) {
        if (mpVar.equals(i42.d) && tvVar.equals(q8.V)) {
            go1 go1Var = (go1) fe0Var;
            go1Var.d0(-1446604504);
            go1Var.q(false);
            return a;
        }
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.d0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && go1Var2.g(mpVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !go1Var2.g(tvVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object Q = go1Var2.Q();
        if (z3 || Q == de0.a) {
            Q = new ba0(mpVar, tvVar);
            go1Var2.o0(Q);
        }
        ba0 ba0Var = (ba0) Q;
        go1Var2.q(false);
        return ba0Var;
    }
}

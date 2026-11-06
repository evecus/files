package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class t74 {
    public static final u74 a = new u74(i42.b, q8.S);

    public static final u74 a(ip ipVar, uv uvVar, fe0 fe0Var, int i) {
        if (ipVar.equals(i42.b) && j42.c(uvVar, q8.S)) {
            go1 go1Var = (go1) fe0Var;
            go1Var.d0(-1073830487);
            go1Var.q(false);
            return a;
        }
        go1 go1Var2 = (go1) fe0Var;
        go1Var2.d0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && go1Var2.g(ipVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !go1Var2.g(uvVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object Q = go1Var2.Q();
        if (z3 || Q == de0.a) {
            Q = new u74(ipVar, uvVar);
            go1Var2.o0(Q);
        }
        u74 u74Var = (u74) Q;
        go1Var2.q(false);
        return u74Var;
    }
}

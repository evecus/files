package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class zt0 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ bu0 J;

    public /* synthetic */ zt0(bu0 bu0Var, byte b) {
        this.I = b;
        this.J = bu0Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        k64 k64Var;
        byte b = this.I;
        bu0 bu0Var = this.J;
        switch (b) {
            case 0:
                z54 z54Var = (z54) j42.r(bu0Var, d64.b);
                e64 e64Var = bu0Var.S;
                if (z54Var == null) {
                    if (e64Var != null) {
                        bu0Var.k0(e64Var);
                    }
                    bu0Var.S = null;
                } else if (e64Var == null) {
                    t33 t33Var = bu0Var.K;
                    zt0 zt0Var = bu0Var.Y;
                    qb5 qb5Var = c64.a;
                    e64 e64Var2 = new e64();
                    e64Var2.j0(new ue(t33Var, zt0Var));
                    bu0Var.j0(e64Var2);
                    bu0Var.S = e64Var2;
                }
                return wd5.a;
            default:
                h23 h23Var = ((fw2) j42.r(bu0Var, lw2.b)).d;
                s64 s64Var = (s64) j42.r(bu0Var, d64.a);
                z54 z54Var2 = (z54) j42.r(bu0Var, d64.b);
                p64 p64Var = bu0Var.W;
                if (p64Var != null && j42.c(bu0Var.U, s64Var) && j42.c(bu0Var.T, z54Var2) && j42.c(bu0Var.V, h23Var)) {
                    return p64Var;
                }
                o64 n64Var = bu0Var.O ? new n64() : k04.y0;
                if (bu0Var.P) {
                    r64 r64Var = s64Var.a;
                    k64Var = new j64();
                } else {
                    k64Var = k04.w0;
                }
                p64 p64Var2 = new p64(bu0Var.L, bu0Var.M, bu0Var.X, n64Var, k64Var, bu0Var.Q ? new l64() : k04.x0, bu0Var.R ? new h64() : k04.v0);
                bu0Var.W = p64Var2;
                bu0Var.U = s64Var;
                bu0Var.T = z54Var2;
                bu0Var.V = h23Var;
                return p64Var2;
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ej3 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ jj3 J;

    public /* synthetic */ ej3(jj3 jj3Var, byte b) {
        this.I = b;
        this.J = jj3Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        int h;
        int j;
        byte b = this.I;
        jj3 jj3Var = this.J;
        switch (b) {
            case 0:
                return Integer.valueOf(jj3Var.k.a() ? jj3Var.r.h() : jj3Var.d.b.h());
            case 1:
                gk3 gk3Var = jj3Var.q;
                boolean a = jj3Var.k.a();
                bj3 bj3Var = jj3Var.d;
                if (!a) {
                    h = bj3Var.b.h();
                } else if (gk3Var.h() != -1) {
                    h = gk3Var.h();
                } else {
                    float abs = Math.abs(bj3Var.c.h());
                    iu0 iu0Var = jj3Var.n;
                    mj3 mj3Var = nj3.a;
                    if (abs >= Math.abs(Math.min(iu0Var.P(56.0f), jj3Var.m() / 2.0f) / jj3Var.m())) {
                        boolean booleanValue = ((Boolean) jj3Var.F.getValue()).booleanValue();
                        int i = jj3Var.e;
                        h = booleanValue ? i + 1 : i;
                    } else {
                        h = bj3Var.b.h();
                    }
                }
                j = jj3Var.j(h);
                break;
            case 2:
                j = jj3Var.l();
                break;
            default:
                return new uj3(Boolean.valueOf(jj3Var.k.a()), Float.valueOf(jj3Var.d.c.h()));
        }
        return Integer.valueOf(j);
    }
}

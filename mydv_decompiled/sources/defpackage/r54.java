package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class r54 implements ty0 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ v54 J;

    public /* synthetic */ r54(v54 v54Var, byte b) {
        this.I = b;
        this.J = v54Var;
    }

    @Override // defpackage.ty0
    public final double b(double d) {
        byte b = this.I;
        v54 v54Var = this.J;
        switch (b) {
            case 0:
                return ut0.p(v54Var.k.b(d), v54Var.e, v54Var.f);
            default:
                return v54Var.n.b(ut0.p(d, v54Var.e, v54Var.f));
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class kf2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ lf2 J;

    public /* synthetic */ kf2(lf2 lf2Var, byte b) {
        this.I = b;
        this.J = lf2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        lf2 lf2Var = this.J;
        switch (b) {
            case 0:
                return Float.valueOf(lf2Var.J.b());
            case 1:
                return Float.valueOf(lf2Var.J.e());
            default:
                return Float.valueOf(lf2Var.J.a() - lf2Var.J.d());
        }
    }
}

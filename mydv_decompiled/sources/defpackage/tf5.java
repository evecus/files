package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tf5 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ tf5(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                hu2Var.v(ab4.Q);
                break;
            default:
                hu2Var.j.r();
                hu2Var.v(ab4.J);
                break;
        }
        return wd5Var;
    }
}

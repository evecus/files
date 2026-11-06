package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rw3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ gx3 J;
    public final /* synthetic */ rv4 K;

    public /* synthetic */ rw3(gx3 gx3Var, rv4 rv4Var, byte b) {
        this.I = b;
        this.J = gx3Var;
        this.K = rv4Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rv4 rv4Var = this.K;
        gx3 gx3Var = this.J;
        switch (b) {
            case 0:
                gx3Var.B.remove(rv4Var);
                break;
            default:
                gx3Var.C.remove(rv4Var);
                break;
        }
        return wd5Var;
    }
}

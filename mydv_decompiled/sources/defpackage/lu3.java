package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lu3 implements rm1 {
    public final /* synthetic */ dl4 I;
    public final /* synthetic */ hu2 J;
    public final /* synthetic */ rm1 K;
    public final /* synthetic */ t43 L;

    public lu3(dl4 dl4Var, hu2 hu2Var, rm1 rm1Var, t43 t43Var) {
        this.I = dl4Var;
        this.J = hu2Var;
        this.K = rm1Var;
        this.L = t43Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        dl4 dl4Var = this.I;
        if (dl4Var.b()) {
            this.L.setValue(dl4Var);
        } else {
            this.J.H(dl4Var.a);
            this.K.invoke();
        }
        return wd5.a;
    }
}

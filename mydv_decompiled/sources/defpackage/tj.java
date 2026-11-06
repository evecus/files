package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tj implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ rm1 K;

    public /* synthetic */ tj(boolean z, rm1 rm1Var, byte b) {
        this.I = b;
        this.J = z;
        this.K = rm1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.K;
        boolean z = this.J;
        switch (b) {
            case 0:
                if (!z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 1:
                if (z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            case 2:
                if (!z) {
                    rm1Var.invoke();
                    break;
                }
                break;
            default:
                if (!z) {
                    rm1Var.invoke();
                    break;
                }
                break;
        }
        return wd5Var;
    }
}

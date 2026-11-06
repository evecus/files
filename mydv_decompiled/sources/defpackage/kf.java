package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kf implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;

    public /* synthetic */ kf(rm1 rm1Var, byte b) {
        this.I = b;
        this.J = rm1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        rm1 rm1Var = this.J;
        switch (b) {
            case 0:
                rm1Var.invoke();
                break;
            case 1:
                rm1Var.invoke();
                break;
            default:
                rm1Var.invoke();
                break;
        }
    }
}

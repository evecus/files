package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class im4 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ bw0 J;

    public /* synthetic */ im4(bw0 bw0Var, byte b) {
        this.I = b;
        this.J = bw0Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        bw0 bw0Var = this.J;
        switch (b) {
            case 0:
                z70 z70Var = (z70) obj;
                z70Var.getClass();
                return (z70Var == z70.M && bw0Var.d) ? "中（电视推荐）" : z70Var.I;
            default:
                v90 v90Var = (v90) obj;
                v90Var.getClass();
                return (v90Var == v90.K && bw0Var.e) ? "自动（本机关闭）" : v90Var.I;
        }
    }
}

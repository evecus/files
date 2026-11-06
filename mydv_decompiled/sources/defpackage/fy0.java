package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fy0 implements rm1 {
    public final /* synthetic */ boolean I;
    public final /* synthetic */ da J;
    public final /* synthetic */ String K;

    public /* synthetic */ fy0(boolean z, da daVar, String str) {
        this.I = z;
        this.J = daVar;
        this.K = str;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        boolean z = this.I;
        da daVar = this.J;
        String str = this.K;
        if (z) {
            v94 v94Var = (v94) daVar.J;
            synchronized (v94Var.c) {
            }
        }
        return wd5.a;
    }
}

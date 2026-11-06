package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt1 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ hu2 K;
    public final /* synthetic */ ab4 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ t43 O;

    public /* synthetic */ vt1(boolean z, hu2 hu2Var, ab4 ab4Var, t43 t43Var, boolean z2, t43 t43Var2, byte b) {
        this.I = b;
        this.J = z;
        this.K = hu2Var;
        this.L = ab4Var;
        this.M = t43Var;
        this.N = z2;
        this.O = t43Var2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                i42.Q(this.J, this.K, this.L, this.M, this.N, this.O, ((Boolean) obj).booleanValue());
                break;
            default:
                i42.Q(this.J, this.K, this.L, this.M, this.N, this.O, false);
                break;
        }
        return wd5Var;
    }
}

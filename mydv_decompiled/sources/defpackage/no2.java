package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class no2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ String J;
    public final /* synthetic */ hv4 K;

    public /* synthetic */ no2(String str, hv4 hv4Var, byte b) {
        this.I = b;
        this.J = str;
        this.K = hv4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fe0 fe0Var = (fe0) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    p9.a(this.J, this.K, null, true, go1Var, 3072, 4);
                    break;
                }
            case 1:
                go1 go1Var2 = (go1) fe0Var;
                if (!go1Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var2.W();
                    break;
                } else {
                    p9.a(this.J, this.K, null, false, go1Var2, 0, 12);
                    break;
                }
            default:
                go1 go1Var3 = (go1) fe0Var;
                if (!go1Var3.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var3.W();
                    break;
                } else {
                    p9.a(this.J, this.K, null, false, go1Var3, 0, 12);
                    break;
                }
        }
        return wd5Var;
    }
}

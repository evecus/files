package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jv3 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ Enum L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ jv3(ow3 ow3Var, boolean z, boolean z2, rm1 rm1Var, l13 l13Var, int i) {
        this.L = ow3Var;
        this.J = z;
        this.K = z2;
        this.M = rm1Var;
        this.N = l13Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.N;
        Object obj4 = this.M;
        Enum r5 = this.L;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                mw3.p((ow3) r5, this.J, this.K, (rm1) obj4, (l13) obj3, (fe0) obj, mu0.X(1));
                break;
            default:
                so3 so3Var = (so3) r5;
                t43 t43Var = (t43) obj4;
                t43 t43Var2 = (t43) obj3;
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(intValue & 1, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    boolean z = (((String) t43Var.getValue()) == null || this.J || this.K) ? false : true;
                    String str = (String) t43Var.getValue();
                    if (str == null) {
                        str = "";
                    }
                    on5.r(z, str, ((Boolean) t43Var2.getValue()).booleanValue(), so3Var, null, go1Var, 0, 16);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ jv3(boolean z, boolean z2, so3 so3Var, t43 t43Var, t43 t43Var2) {
        this.J = z;
        this.K = z2;
        this.L = so3Var;
        this.M = t43Var;
        this.N = t43Var2;
    }
}

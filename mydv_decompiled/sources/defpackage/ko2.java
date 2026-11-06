package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ko2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ l13 K;

    public /* synthetic */ ko2(l13 l13Var, rm1 rm1Var) {
        this.I = (byte) 0;
        this.K = l13Var;
        this.J = rm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        l13 l13Var = this.K;
        wd5 wd5Var = wd5.a;
        rm1 rm1Var = this.J;
        switch (b) {
            case 0:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                byte b2 = 0;
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(1 & intValue, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    p70.q(ut0.D(), "暂无直播", this.K, "请检查网络或稍后重试", rw4.I, false, p70.u0(747146090, new po2(rm1Var, b2), go1Var), go1Var, 1600560, 32);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                qg5.r(rm1Var, l13Var, (fe0) obj, mu0.X(49));
                break;
            case 2:
                ((Integer) obj2).getClass();
                mw3.b(rm1Var, l13Var, (fe0) obj, mu0.X(1));
                break;
            default:
                ((Integer) obj2).getClass();
                qe4.f(rm1Var, l13Var, (fe0) obj, mu0.X(1));
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ ko2(rm1 rm1Var, l13 l13Var, int i, byte b) {
        this.I = b;
        this.J = rm1Var;
        this.K = l13Var;
    }
}

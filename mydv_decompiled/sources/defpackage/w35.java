package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w35 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public final /* synthetic */ cw4 J;
    public final /* synthetic */ t35 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ ea5 O;
    public final /* synthetic */ m65 P;
    public final /* synthetic */ m65 Q;
    public final /* synthetic */ in1 R;

    public /* synthetic */ w35(cw4 cw4Var, t35 t35Var, boolean z, boolean z2, boolean z3, ea5 ea5Var, m65 m65Var, m65 m65Var2, in1 in1Var, int i) {
        this.J = cw4Var;
        this.K = t35Var;
        this.L = z;
        this.M = z2;
        this.N = z3;
        this.O = ea5Var;
        this.P = m65Var;
        this.Q = m65Var2;
        this.R = in1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                kb4.c(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (fe0) obj, mu0.X(1));
                break;
            default:
                fe0 fe0Var = (fe0) obj;
                int intValue = ((Integer) obj2).intValue();
                go1 go1Var = (go1) fe0Var;
                if (!go1Var.T(1 & intValue, (intValue & 3) != 2)) {
                    go1Var.W();
                    break;
                } else {
                    kb4.c(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, go1Var, 0);
                    break;
                }
        }
        return wd5Var;
    }

    public /* synthetic */ w35(ba5 ba5Var, t35 t35Var, boolean z, boolean z2, boolean z3, ea5 ea5Var, m65 m65Var, m65 m65Var2, in1 in1Var) {
        this.J = ba5Var;
        this.K = t35Var;
        this.L = z;
        this.M = z2;
        this.N = z3;
        this.O = ea5Var;
        this.P = m65Var;
        this.Q = m65Var2;
        this.R = in1Var;
    }
}

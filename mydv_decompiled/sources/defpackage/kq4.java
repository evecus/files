package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kq4 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ hn1 J;
    public final /* synthetic */ long K;
    public final /* synthetic */ rq4 L;

    public /* synthetic */ kq4(int i, long j, hn1 hn1Var, rq4 rq4Var) {
        this.L = rq4Var;
        this.K = j;
        this.J = hn1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                eg5.a(mu0.X(1), this.K, (fe0) obj, this.J, this.L);
                return wd5Var;
            default:
                fe0 fe0Var = (fe0) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    go1 go1Var = (go1) fe0Var;
                    if (go1Var.F()) {
                        go1Var.W();
                        return wd5Var;
                    }
                }
                go1 go1Var2 = (go1) fe0Var;
                Object Q = go1Var2.Q();
                if (Q == de0.a) {
                    Q = lq4.I;
                    go1Var2.o0(Q);
                }
                rm1 rm1Var = (rm1) ((v72) Q);
                go1Var2.e0(-683746039);
                go1Var2.e0(-548224868);
                if (!(go1Var2.a instanceof zo)) {
                    qb.S();
                    throw null;
                }
                go1Var2.b0();
                if (go1Var2.S) {
                    go1Var2.l(rm1Var);
                } else {
                    go1Var2.r0();
                }
                qi4.k(go1Var2, new fa4((byte) 19), new v11(this.K));
                qi4.k(go1Var2, new fa4((byte) 20), this.L);
                this.J.invoke(go1Var2, 0);
                go1Var2.q(true);
                go1Var2.q(false);
                go1Var2.q(false);
                return wd5Var;
        }
    }

    public /* synthetic */ kq4(hn1 hn1Var, long j, rq4 rq4Var) {
        this.J = hn1Var;
        this.K = j;
        this.L = rq4Var;
    }
}

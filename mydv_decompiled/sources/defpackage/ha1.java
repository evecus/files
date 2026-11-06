package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ha1 extends r92 implements tm1 {
    public final /* synthetic */ r95 J;
    public final /* synthetic */ ta1 K;
    public final /* synthetic */ bc1 L;
    public final /* synthetic */ on4 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha1(r95 r95Var, ta1 ta1Var, bc1 bc1Var, on4 on4Var) {
        super(1);
        this.J = r95Var;
        this.K = ta1Var;
        this.L = bc1Var;
        this.M = on4Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        int ordinal = ((aa1) obj).ordinal();
        r95 r95Var = null;
        bc1 bc1Var = this.L;
        if (ordinal == 0) {
            ga4 ga4Var = this.K.a.d;
            if (ga4Var != null) {
                r95Var = new r95(ga4Var.b);
            } else {
                ga4 ga4Var2 = bc1Var.a.d;
                if (ga4Var2 != null) {
                    r95Var = new r95(ga4Var2.b);
                }
            }
        } else if (ordinal == 1) {
            r95Var = this.J;
        } else {
            if (ordinal != 2) {
                s83.v();
                return null;
            }
            ga4 ga4Var3 = bc1Var.a.d;
            r95Var = new r95(ga4Var3 != null ? ga4Var3.b : this.M.h);
        }
        return new r95(r95Var != null ? r95Var.a : r95.b);
    }
}

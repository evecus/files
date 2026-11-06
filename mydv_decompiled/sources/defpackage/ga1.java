package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ga1 extends r92 implements tm1 {
    public final /* synthetic */ ta1 J;
    public final /* synthetic */ bc1 K;
    public final /* synthetic */ on4 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(ta1 ta1Var, bc1 bc1Var, on4 on4Var) {
        super(1);
        this.J = ta1Var;
        this.K = bc1Var;
        this.L = on4Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        int ordinal = ((aa1) obj).ordinal();
        float f = 1.0f;
        if (ordinal == 0) {
            ga4 ga4Var = this.J.a.d;
            if (ga4Var != null) {
                f = ga4Var.a;
            }
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                s83.v();
                return null;
            }
            ga4 ga4Var2 = this.K.a.d;
            f = ga4Var2 != null ? ga4Var2.a : this.L.g;
        }
        return Float.valueOf(f);
    }
}

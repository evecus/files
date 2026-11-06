package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qa1 extends r92 implements tm1 {
    public final /* synthetic */ sa1 J;
    public final /* synthetic */ long K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa1(sa1 sa1Var, long j) {
        super(1);
        this.J = sa1Var;
        this.K = j;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        long j;
        tm1 tm1Var;
        tm1 tm1Var2;
        aa1 aa1Var = (aa1) obj;
        aa1 aa1Var2 = aa1.K;
        sa1 sa1Var = this.J;
        if (aa1Var == aa1Var2 && sa1Var.N.a.b == null) {
            j = sa1Var.O.i;
        } else {
            xq4 xq4Var = sa1Var.M.a.b;
            long j2 = this.K;
            long j3 = (xq4Var == null || (tm1Var2 = xq4Var.a) == null) ? 0L : ((r22) tm1Var2.invoke(new z22(j2))).a;
            xq4 xq4Var2 = sa1Var.N.a.b;
            long j4 = (xq4Var2 == null || (tm1Var = xq4Var2.a) == null) ? 0L : ((r22) tm1Var.invoke(new z22(j2))).a;
            int ordinal = aa1Var.ordinal();
            if (ordinal == 0) {
                j = j3;
            } else if (ordinal == 1) {
                j = 0;
            } else {
                if (ordinal != 2) {
                    s83.v();
                    return null;
                }
                j = j4;
            }
        }
        return new r22(j);
    }
}

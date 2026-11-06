package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ri extends r92 implements in1 {
    public final /* synthetic */ tm1 J;
    public final /* synthetic */ ea5 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(tm1 tm1Var, ea5 ea5Var) {
        super(3);
        this.J = tm1Var;
        this.K = ea5Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        ww2 ww2Var = (ww2) obj;
        bn3 u = ((pw2) obj2).u(((dh0) obj3).a);
        if (ww2Var.N()) {
            if (!((Boolean) this.J.invoke(this.K.d.getValue())).booleanValue()) {
                j = 0;
                return ww2Var.A((int) (j >> 32), (int) (4294967295L & j), p91.I, new kh(u, (byte) 2));
            }
        }
        j = (u.I << 32) | (u.J & 4294967295L);
        return ww2Var.A((int) (j >> 32), (int) (4294967295L & j), p91.I, new kh(u, (byte) 2));
    }
}

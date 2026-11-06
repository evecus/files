package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc4 extends a8 implements hn1 {
    public final /* synthetic */ byte P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc4(fc4 fc4Var, byte b) {
        super(2, fc4Var, fc4.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4);
        this.P = b;
        switch (b) {
            case 1:
                super(2, fc4Var, fc4.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.P;
        wd5 wd5Var = wd5.a;
        Object obj3 = this.I;
        switch (b) {
            case 0:
                fc4 fc4Var = (fc4) obj3;
                p70.g0(fc4Var.d0.c(), null, null, new ec4(fc4Var, ((ji5) obj).a, null, (byte) 1), 3);
                break;
            default:
                fc4 fc4Var2 = (fc4) obj3;
                p70.g0(fc4Var2.d0.c(), null, null, new ec4(fc4Var2, ((ji5) obj).a, null, (byte) 2), 3);
                break;
        }
        return wd5Var;
    }
}

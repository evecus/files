package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class et2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ gt2 J;

    public /* synthetic */ et2(gt2 gt2Var, byte b) {
        this.I = b;
        this.J = gt2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        gt2 gt2Var = this.J;
        switch (b) {
            case 0:
                gt2Var.l0();
                return wd5.a;
            case 1:
                return new pd3(gt2Var.W);
            default:
                ca2 ca2Var = (ca2) gt2Var.U.getValue();
                return new pd3(ca2Var != null ? ca2Var.M(0L) : 9205357640488583168L);
        }
    }
}

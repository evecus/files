package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt1 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ct1 J;

    public /* synthetic */ bt1(ct1 ct1Var, byte b) {
        this.I = b;
        this.J = ct1Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ct1 ct1Var = this.J;
        switch (b) {
            case 0:
                jc5 jc5Var = ct1Var.P;
                if (jc5Var == null) {
                    throw hf1.q("Font resolution state is not set.");
                }
                jc5Var.getValue();
                return wd5Var;
            default:
                jc5 jc5Var2 = ct1Var.P;
                if (jc5Var2 == null) {
                    throw hf1.q("Font resolution state is not set.");
                }
                jc5Var2.getValue();
                return wd5Var;
        }
    }
}

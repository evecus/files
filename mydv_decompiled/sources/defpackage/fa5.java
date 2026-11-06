package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class fa5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ea5 J;

    public /* synthetic */ fa5(ea5 ea5Var, byte b) {
        this.I = b;
        this.J = ea5Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        ea5 ea5Var = this.J;
        switch (b) {
            case 0:
                return new ga5(ea5Var, (byte) 1);
            default:
                return new ga5(ea5Var, (byte) 0);
        }
    }
}

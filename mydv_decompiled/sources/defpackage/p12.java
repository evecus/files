package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p12 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ u12 J;

    public /* synthetic */ p12(u12 u12Var, byte b) {
        this.I = b;
        this.J = u12Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        u12 u12Var = this.J;
        la5 la5Var = (la5) obj;
        switch (b) {
            case 0:
                la5Var.getClass();
                u12 u12Var2 = (u12) la5Var;
                vu5 vu5Var = u12Var.J;
                if (!j42.c(u12Var2.I, vu5Var)) {
                    u12Var2.I = vu5Var;
                    u12Var2.j0();
                }
                return ka5.J;
            default:
                la5Var.getClass();
                u12Var.I = ((u12) la5Var).J;
                return Boolean.FALSE;
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gc implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ vw0 J;

    public /* synthetic */ gc(vw0 vw0Var, byte b) {
        this.I = b;
        this.J = vw0Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        vw0 vw0Var = this.J;
        switch (b) {
            case 0:
                vw0Var.show();
                return new x7(vw0Var, (byte) 1);
            default:
                if (vw0Var.N.a) {
                    vw0Var.M.invoke();
                }
                return wd5.a;
        }
    }
}

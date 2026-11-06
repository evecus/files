package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tn2 implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t43 b;

    public /* synthetic */ tn2(t43 t43Var, byte b) {
        this.a = b;
        this.b = t43Var;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        t43 t43Var = this.b;
        switch (b) {
            case 0:
                tm1 tm1Var = (tm1) t43Var.getValue();
                if (tm1Var != null) {
                    tm1Var.invoke(Boolean.FALSE);
                    break;
                }
                break;
            default:
                tm1 tm1Var2 = (tm1) t43Var.getValue();
                if (tm1Var2 != null) {
                    tm1Var2.invoke(Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}

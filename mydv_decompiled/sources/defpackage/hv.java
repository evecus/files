package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hv implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ y55 J;
    public final /* synthetic */ tm1 K;

    public /* synthetic */ hv(y55 y55Var, tm1 tm1Var, byte b) {
        this.I = b;
        this.J = y55Var;
        this.K = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        tm1 tm1Var = this.K;
        y55 y55Var = this.J;
        switch (b) {
            case 0:
                u55 u55Var = (u55) obj;
                if (y55Var != null) {
                    y55Var.a.setValue(u55Var);
                }
                if (tm1Var != null) {
                    tm1Var.invoke(u55Var);
                }
                return wd5.a;
            default:
                y55Var.c.add(tm1Var);
                return new ow0(y55Var, tm1Var, (byte) 5);
        }
    }
}

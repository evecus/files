package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ad2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;

    public /* synthetic */ ad2(int i, tm1 tm1Var) {
        this.I = (byte) 1;
        this.J = tm1Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                return (vr1) tm1Var.invoke((rd2) obj);
            case 1:
                ((Integer) obj2).getClass();
                qe4.a(tm1Var, (fe0) obj, mu0.X(1));
                return wd5.a;
            default:
                Enum r2 = (Enum) obj;
                ((Boolean) obj2).booleanValue();
                r2.getClass();
                return (String) tm1Var.invoke(r2);
        }
    }

    public /* synthetic */ ad2(tm1 tm1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
    }
}

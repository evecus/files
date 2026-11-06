package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y41 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ tm1 J;

    public /* synthetic */ y41(tm1 tm1Var, byte b) {
        this.I = b;
        this.J = tm1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        b51 b51Var;
        byte b = this.I;
        tm1 tm1Var = this.J;
        switch (b) {
            case 0:
                k51 k51Var = (k51) obj;
                double d = 50.0d;
                if (k51Var != null && (b51Var = (b51) tm1Var.invoke(k51Var)) != null) {
                    d = b51Var.a(k51Var);
                }
                return Double.valueOf(d);
            case 1:
                ns4 ns4Var = (ns4) tm1Var.invoke((us4) obj);
                synchronized (ws4.c) {
                    ws4.d = ws4.d.h(ns4Var.g());
                }
                return ns4Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return tm1Var.invoke(l);
        }
    }
}

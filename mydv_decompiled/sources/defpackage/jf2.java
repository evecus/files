package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class jf2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ lf2 J;

    public /* synthetic */ jf2(lf2 lf2Var, byte b) {
        this.I = b;
        this.J = lf2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        lf2 lf2Var = this.J;
        switch (b) {
            case 0:
                me2 me2Var = (me2) lf2Var.I.invoke();
                int a = me2Var.a();
                int i = 0;
                while (true) {
                    if (i >= a) {
                        i = -1;
                    } else if (!me2Var.c(i).equals(obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            default:
                int intValue = ((Integer) obj).intValue();
                me2 me2Var2 = (me2) lf2Var.I.invoke();
                if (intValue < 0 || intValue >= me2Var2.a()) {
                    t02.a("Can't scroll to index " + intValue + ", it is out of bounds [0, " + me2Var2.a() + ")");
                }
                p70.g0(lf2Var.getCoroutineScope(), null, null, new ou(lf2Var, intValue, null, (byte) 1), 3);
                return Boolean.TRUE;
        }
    }
}

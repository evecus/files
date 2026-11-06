package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vl2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ki1 J;

    public /* synthetic */ vl2(ki1 ki1Var, byte b) {
        this.I = b;
        this.J = ki1Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ki1 ki1Var = this.J;
        switch (b) {
            case 0:
                ei1 ei1Var = (ei1) obj;
                ei1Var.getClass();
                ei1Var.c(new vl2(ki1Var, (byte) 1));
                break;
            case 1:
                int i = ((oh1) obj).a;
                if (i != 5) {
                    if (i != 6) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                int i2 = ((oh1) obj).a;
                if (i2 != 5 && i2 != 6) {
                    if (i2 != 3) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 3:
                ei1 ei1Var2 = (ei1) obj;
                ei1Var2.getClass();
                ei1Var2.h(ki1Var);
                break;
            case 4:
                ei1 ei1Var3 = (ei1) obj;
                ei1Var3.getClass();
                ei1Var3.c(new vl2(ki1Var, (byte) 2));
                break;
            default:
                ei1 ei1Var4 = (ei1) obj;
                ei1Var4.getClass();
                ei1Var4.h(ki1Var);
                break;
        }
        return wd5Var;
    }
}

package defpackage;

import com.github.mytv.dv.model.LiveRoom;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oo2 implements rm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ hu2 K;

    public /* synthetic */ oo2(t43 t43Var, hu2 hu2Var) {
        this.I = (byte) 1;
        this.J = t43Var;
        this.K = hu2Var;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.J;
        hu2 hu2Var = this.K;
        switch (b) {
            case 0:
                boolean booleanValue = ((Boolean) t43Var.getValue()).booleanValue();
                op2 op2Var = hu2Var.n;
                if (!booleanValue) {
                    fw4 fw4Var = op2Var.r;
                    Boolean bool = Boolean.FALSE;
                    fw4Var.getClass();
                    fw4Var.i(null, bool);
                    op2Var.F();
                    break;
                } else {
                    fw4 fw4Var2 = op2Var.C;
                    Boolean bool2 = Boolean.FALSE;
                    fw4Var2.getClass();
                    fw4Var2.i(null, bool2);
                    break;
                }
            case 1:
                LiveRoom liveRoom = (LiveRoom) t43Var.getValue();
                if (liveRoom != null) {
                    hu2Var.I(liveRoom.getOwner());
                    break;
                }
                break;
            case 2:
                hu2Var.G((String) t43Var.getValue());
                break;
            default:
                hu2Var.G((String) t43Var.getValue());
                break;
        }
        return wd5Var;
    }

    public /* synthetic */ oo2(hu2 hu2Var, t43 t43Var, byte b) {
        this.I = b;
        this.K = hu2Var;
        this.J = t43Var;
    }
}

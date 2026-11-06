package defpackage;

import com.github.mytv.dv.model.LiveRoom;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vo2 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ hu2 J;

    public /* synthetic */ vo2(hu2 hu2Var, byte b) {
        this.I = b;
        this.J = hu2Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        Float f = null;
        wd5 wd5Var = wd5.a;
        hu2 hu2Var = this.J;
        switch (b) {
            case 0:
                LiveRoom liveRoom = (LiveRoom) obj;
                int intValue = ((Integer) obj2).intValue();
                liveRoom.getClass();
                hu2Var.n.D(liveRoom, intValue);
                break;
            case 1:
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                if (intValue2 > 0 && intValue3 > 0) {
                    f = Float.valueOf(intValue2 / intValue3);
                }
                hu2Var.J.setValue(f);
                break;
            default:
                int intValue4 = ((Integer) obj).intValue();
                int intValue5 = ((Integer) obj2).intValue();
                if (intValue4 > 0 && intValue5 > 0) {
                    f = Float.valueOf(intValue4 / intValue5);
                }
                hu2Var.J.setValue(f);
                break;
        }
        return wd5Var;
    }
}

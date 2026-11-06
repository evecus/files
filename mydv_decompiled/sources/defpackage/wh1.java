package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wh1 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ArrayList J;
    public final /* synthetic */ t43 K;

    public /* synthetic */ wh1(ArrayList arrayList, t43 t43Var, byte b) {
        this.I = b;
        this.J = arrayList;
        this.K = t43Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.K;
        ArrayList arrayList = this.J;
        switch (b) {
            case 0:
                c32 c32Var = (c32) obj;
                if (c32Var instanceof th1) {
                    arrayList.add(c32Var);
                } else if (c32Var instanceof uh1) {
                    arrayList.remove(((uh1) c32Var).a);
                }
                t43Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                c32 c32Var2 = (c32) obj;
                if (c32Var2 instanceof vs3) {
                    arrayList.add(c32Var2);
                } else if (c32Var2 instanceof ws3) {
                    arrayList.remove(((ws3) c32Var2).a);
                } else if (c32Var2 instanceof us3) {
                    arrayList.remove(((us3) c32Var2).a);
                }
                t43Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return wd5Var;
    }
}

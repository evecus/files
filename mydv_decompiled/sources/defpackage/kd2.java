package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kd2 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ t43 J;
    public final /* synthetic */ ArrayList K;
    public final /* synthetic */ List L;

    public /* synthetic */ kd2(t43 t43Var, ArrayList arrayList, List list, boolean z, byte b) {
        this.I = b;
        this.J = t43Var;
        this.K = arrayList;
        this.L = list;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        List list = this.L;
        ArrayList arrayList = this.K;
        t43 t43Var = this.J;
        wd5 wd5Var = wd5.a;
        an3 an3Var = (an3) obj;
        switch (b) {
            case 0:
                an3Var.I = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((md2) arrayList.get(i)).l(an3Var);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((md2) list.get(i2)).l(an3Var);
                }
                an3Var.I = false;
                t43Var.getValue();
                break;
            default:
                an3Var.I = true;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((vf2) arrayList.get(i3)).l(an3Var);
                }
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((vf2) list.get(i4)).l(an3Var);
                }
                an3Var.I = false;
                t43Var.getValue();
                break;
        }
        return wd5Var;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class xi3 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ArrayList J;

    public /* synthetic */ xi3(ArrayList arrayList, byte b) {
        this.I = b;
        this.J = arrayList;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ArrayList arrayList = this.J;
        switch (b) {
            case 0:
                an3 an3Var = (an3) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    yw2 yw2Var = (yw2) arrayList.get(i);
                    List list = yw2Var.b;
                    boolean z = yw2Var.g;
                    if (yw2Var.k == Integer.MIN_VALUE) {
                        t02.a("position() should be called first");
                    }
                    int size2 = list.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        bn3 bn3Var = (bn3) list.get(i2);
                        int i3 = size;
                        long c = r22.c((r12[r13 + 1] & 4294967295L) | (yw2Var.i[i2 * 2] << 32), yw2Var.c);
                        if (z) {
                            an3.p(an3Var, bn3Var, c);
                        } else {
                            an3.l(an3Var, bn3Var, c);
                        }
                        i2++;
                        size = i3;
                    }
                }
                break;
            default:
                an3 an3Var2 = (an3) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    an3.j(an3Var2, (bn3) arrayList.get(i4), 0, 0, null, 12);
                }
                break;
        }
        return wd5Var;
    }
}

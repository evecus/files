package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hm5 implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ long K;
    public final /* synthetic */ Object L;

    public /* synthetic */ hm5(Object obj, long j, Object obj2, byte b) {
        this.I = b;
        this.J = obj;
        this.K = j;
        this.L = obj2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.L;
        Object obj3 = this.J;
        switch (b) {
            case 0:
                ((Long) obj).longValue();
                long longValue = ((Number) ((rm1) obj3).invoke()).longValue();
                float s = ut0.s(longValue, 0L, r8) / this.K;
                ta1 ta1Var = on5.a;
                ((fk3) obj2).i(s);
                break;
            case 1:
                ((Long) obj).longValue();
                long longValue2 = ((Number) ((rm1) obj3).invoke()).longValue();
                float s2 = ut0.s(longValue2, 0L, r8) / this.K;
                ta1 ta1Var2 = on5.a;
                ((fk3) obj2).i(s2);
                break;
            default:
                ArrayList arrayList = (ArrayList) obj3;
                pe2 pe2Var = (pe2) obj2;
                an3 an3Var = (an3) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ug2 ug2Var = (ug2) arrayList.get(i);
                    pe2Var.J.N();
                    boolean z = ug2Var.d;
                    if (ug2Var.o == Integer.MIN_VALUE) {
                        t02.a("position() should be called first");
                    }
                    List list = ug2Var.c;
                    int size2 = list.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        bn3 bn3Var = (bn3) list.get(i2);
                        if (z) {
                            int i3 = bn3Var.J;
                        } else {
                            int i4 = bn3Var.I;
                        }
                        long j = ug2Var.r;
                        ug2Var.h.a(i2, ug2Var.b);
                        an3.l(an3Var, bn3Var, r22.c(j, this.K));
                        i2++;
                        pe2Var = pe2Var;
                        wd5Var = wd5Var;
                    }
                }
                break;
        }
        return wd5Var;
    }
}

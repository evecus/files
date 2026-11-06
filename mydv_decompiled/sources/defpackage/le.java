package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class le implements uw2 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ le(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, List list, int i) {
        byte b = this.a;
        return i82.j(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, List list, int i) {
        byte b = this.a;
        return i82.m(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo35measure3p2s80s(ww2 ww2Var, List list, long j) {
        ArrayList arrayList;
        int i;
        int i2;
        uj3 uj3Var;
        byte b = this.a;
        p91 p91Var = p91.I;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((vq3) obj).setParentLayoutDirection((da2) obj2);
                return ww2Var.A(0, 0, p91Var, new t5((byte) 8));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = list.get(i3);
                    if (!(((pw2) obj3).z() instanceof e65)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((rm1) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        m14 m14Var = (m14) list2.get(i4);
                        if (m14Var != null) {
                            float f = m14Var.b;
                            float f2 = m14Var.a;
                            pw2 pw2Var = (pw2) arrayList2.get(i4);
                            int floor = (int) Math.floor(m14Var.c - f2);
                            float f3 = m14Var.d - f;
                            i = size2;
                            i2 = i4;
                            uj3Var = new uj3(pw2Var.u(eh0.b(0, floor, 0, (int) Math.floor(f3), 5)), new r22((Math.round(f) & 4294967295L) | (Math.round(f2) << 32)));
                        } else {
                            i = size2;
                            i2 = i4;
                            uj3Var = null;
                        }
                        if (uj3Var != null) {
                            arrayList3.add(uj3Var);
                        }
                        i4 = i2 + 1;
                        size2 = i;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Object obj4 = list.get(i5);
                    if (((pw2) obj4).z() instanceof e65) {
                        arrayList4.add(obj4);
                    }
                }
                return ww2Var.A(dh0.h(j), dh0.g(j), p91Var, new ap3((Object) arrayList, (Object) qb.U(arrayList4, (rm1) obj), (byte) 13));
        }
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, List list, int i) {
        byte b = this.a;
        return i82.p(this, b42Var, list, i);
    }

    @Override // defpackage.uw2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, List list, int i) {
        byte b = this.a;
        return i82.s(this, b42Var, list, i);
    }
}

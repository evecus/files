package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class pj {
    public static final oj a = new oj("");

    public static final ArrayList a(List list, int i, int i2) {
        if (i > i2) {
            r02.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            nj njVar = (nj) list.get(i3);
            int i4 = njVar.b;
            int i5 = njVar.c;
            if (c(i, i2, i4, i5)) {
                arrayList.add(new nj(njVar.d, Math.max(i, njVar.b) - i, Math.min(i2, i5) - i, njVar.a));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static final List b(oj ojVar, int i, int i2, t5 t5Var) {
        List list;
        if (i == i2 || (list = ojVar.I) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= ojVar.J.length()) {
            if (t5Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) t5Var.invoke(((nj) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            nj njVar = (nj) list.get(i3);
            if (t5Var != null ? ((Boolean) t5Var.invoke(njVar.a)).booleanValue() : true) {
                int i4 = njVar.b;
                int i5 = njVar.c;
                if (c(i, i2, i4, i5)) {
                    arrayList2.add(new nj(njVar.d, ut0.r(njVar.b, i, i2) - i, ut0.r(i5, i, i2) - i, (kj) njVar.a));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean c(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}

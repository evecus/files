package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ok2 extends qk2 {
    public static final Class c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(Object obj, long j, int i) {
        List list = (List) we5.j(j, obj);
        if (list.isEmpty()) {
            List bh2Var = list instanceof ch2 ? new bh2(i) : new ArrayList(i);
            we5.p(obj, j, bh2Var);
            return bh2Var;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            we5.p(obj, j, arrayList);
            return arrayList;
        }
        if (!(list instanceof he5)) {
            return list;
        }
        bh2 bh2Var2 = new bh2(list.size() + i);
        bh2Var2.addAll((he5) list);
        we5.p(obj, j, bh2Var2);
        return bh2Var2;
    }
}

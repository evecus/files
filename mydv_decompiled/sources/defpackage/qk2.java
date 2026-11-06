package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class qk2 {
    public static final ok2 a = new ok2();
    public static final pk2 b = new pk2();

    public void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) we5.j(j, obj);
        if (list instanceof ch2) {
            unmodifiableList = ((ch2) list).i();
        } else if (ok2.c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        we5.p(obj, j, unmodifiableList);
    }

    public void b(bp1 bp1Var, Object obj, long j) {
        List list = (List) we5.j(j, obj);
        List d = ok2.d(bp1Var, j, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        we5.p(bp1Var, j, list);
    }

    public List c(long j, Object obj) {
        return ok2.d(obj, j, 10);
    }
}

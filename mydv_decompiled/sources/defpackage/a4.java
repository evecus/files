package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class a4 extends y2 {
    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.w1, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract a4 d(int i, Object obj);

    public abstract a4 e(Object obj);

    public a4 f(Collection collection) {
        rm3 h = h();
        h.addAll(collection);
        return h.e();
    }

    public abstract rm3 h();

    @Override // defpackage.y2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract a4 j(z3 z3Var);

    public abstract a4 l(int i);

    @Override // defpackage.y2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract a4 m(int i, Object obj);

    @Override // defpackage.y2, java.util.List
    public final List subList(int i, int i2) {
        return jp0.h(this, i, i2);
    }
}

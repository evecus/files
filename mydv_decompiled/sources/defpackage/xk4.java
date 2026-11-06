package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xk4 extends wk4 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.I).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.I.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.J.apply(next)) {
                return next;
            }
        }
        zy.k();
        return null;
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new xk4(((SortedSet) this.I).headSet(obj), this.J);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.I;
        while (true) {
            Object last = sortedSet.last();
            if (this.J.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new xk4(((SortedSet) this.I).subSet(obj, obj2), this.J);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new xk4(((SortedSet) this.I).tailSet(obj), this.J);
    }
}

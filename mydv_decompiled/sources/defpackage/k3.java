package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k3 extends n3 implements NavigableSet {
    public final /* synthetic */ i33 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(i33 i33Var, NavigableMap navigableMap) {
        super(i33Var, navigableMap);
        this.L = i33Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return c().ceilingKey(obj);
    }

    @Override // defpackage.n3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final NavigableMap c() {
        return (NavigableMap) ((SortedMap) this.I);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((i3) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new k3(this.L, c().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return c().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new k3(this.L, c().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return c().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return c().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        f3 f3Var = (f3) iterator();
        if (!f3Var.hasNext()) {
            return null;
        }
        Object next = f3Var.next();
        f3Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new k3(this.L, c().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new k3(this.L, c().tailMap(obj, z));
    }

    @Override // defpackage.n3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.n3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.n3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}

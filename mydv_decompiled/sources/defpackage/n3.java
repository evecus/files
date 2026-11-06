package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class n3 extends i3 implements SortedSet {
    public final /* synthetic */ i33 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(i33 i33Var, SortedMap sortedMap) {
        super(i33Var, sortedMap);
        this.K = i33Var;
    }

    public SortedMap c() {
        return (SortedMap) this.I;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return c().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new n3(this.K, c().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return c().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new n3(this.K, c().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new n3(this.K, c().tailMap(obj));
    }
}

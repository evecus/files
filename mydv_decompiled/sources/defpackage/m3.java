package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class m3 extends g3 implements SortedMap {
    public SortedSet M;
    public final /* synthetic */ i33 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(i33 i33Var, SortedMap sortedMap) {
        super(i33Var, sortedMap);
        this.N = i33Var;
    }

    public SortedSet b() {
        return new n3(this.N, d());
    }

    @Override // defpackage.g3, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.M;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet b = b();
        this.M = b;
        return b;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.K;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new m3(this.N, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new m3(this.N, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new m3(this.N, d().tailMap(obj));
    }
}

package j$.util;

import java.util.SortedSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class r0 extends q1 {
    public final /* synthetic */ SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.q1, j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f.comparator();
    }
}

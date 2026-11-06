package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ly1 extends vx1 {
    public final ey1 J;

    public ly1(ey1 ey1Var) {
        this.J = ey1Var;
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.J.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final ee5 iterator() {
        return new jy1(this.J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.J.N;
    }
}

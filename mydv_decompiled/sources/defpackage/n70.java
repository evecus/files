package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class n70 extends AbstractCollection {
    public final Collection I;
    public final nv2 J;

    public n70(Collection collection, nv2 nv2Var) {
        collection.getClass();
        this.I = collection;
        this.J = nv2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.I.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.I.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new m52(this.I.iterator(), this.J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.I.size();
    }
}

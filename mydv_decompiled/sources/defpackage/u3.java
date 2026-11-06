package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class u3 extends AbstractCollection {
    public final /* synthetic */ a3 I;

    public u3(a3 a3Var) {
        this.I = a3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.I.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.I.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c3(this.I);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.I.N;
    }
}

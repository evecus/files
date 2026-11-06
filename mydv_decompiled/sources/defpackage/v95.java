package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class v95 implements Iterator, w72 {
    public final Iterator I;
    public final /* synthetic */ ep1 J;

    public v95(ep1 ep1Var) {
        this.J = ep1Var;
        this.I = ((oj4) ep1Var.c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.J.b.invoke(this.I.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ge5 implements Iterator {
    public Iterator I;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.I.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

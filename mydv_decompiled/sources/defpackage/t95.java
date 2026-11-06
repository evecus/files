package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class t95 implements Iterator {
    public final Iterator I;

    public t95(Iterator it) {
        it.getClass();
        this.I = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.I.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.I.remove();
    }
}

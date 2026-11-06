package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class z2 implements ListIterator, w72 {
    public int I;
    public int J;

    public z2(int i, int i2) {
        this.I = i;
        this.J = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.I < this.J;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.I > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.I;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.I - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

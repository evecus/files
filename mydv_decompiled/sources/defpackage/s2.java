package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class s2 extends ee5 implements ListIterator {
    public final int I;
    public int J;

    public s2(int i, int i2) {
        sp0.x(i2, i);
        this.I = i;
        this.J = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.J < this.I;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.J > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        int i = this.J;
        this.J = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.J;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            zy.k();
            return null;
        }
        int i = this.J - 1;
        this.J = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.J - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

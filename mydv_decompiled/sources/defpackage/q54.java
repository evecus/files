package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q54 implements ListIterator, w72 {
    public final ListIterator I;
    public final /* synthetic */ xv2 J;

    public q54(xv2 xv2Var, int i) {
        this.J = xv2Var;
        List list = (List) xv2Var.J;
        if (i >= 0 && i <= xv2Var.c()) {
            this.I = list.listIterator(xv2Var.c() - i);
            return;
        }
        StringBuilder C = hf1.C("Position index ", i, " must be in range [");
        C.append(new u22(0, xv2Var.c(), 1));
        C.append("].");
        throw new IndexOutOfBoundsException(C.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.I.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.I.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.I.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.J.size() - 1) - this.I.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.I.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.J.size() - 1) - this.I.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

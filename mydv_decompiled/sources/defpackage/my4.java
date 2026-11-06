package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class my4 implements ListIterator, w72 {
    public final /* synthetic */ p24 I;
    public final /* synthetic */ ny4 J;

    public my4(p24 p24Var, ny4 ny4Var) {
        this.I = p24Var;
        this.J = ny4Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.I.I < this.J.L - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.I.I >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        p24 p24Var = this.I;
        int i = p24Var.I + 1;
        ny4 ny4Var = this.J;
        j42.n0(i, ny4Var.L);
        p24Var.I = i;
        return ny4Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.I.I + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        p24 p24Var = this.I;
        int i = p24Var.I;
        ny4 ny4Var = this.J;
        j42.n0(i, ny4Var.L);
        p24Var.I = i - 1;
        return ny4Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.I.I;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}

package defpackage;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class he5 extends AbstractList implements ch2, RandomAccess {
    public final bh2 I;

    public he5(bh2 bh2Var) {
        this.I = bh2Var;
    }

    @Override // defpackage.ch2
    public final void b(f00 f00Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ch2
    public final List g() {
        return DesugarCollections.unmodifiableList(this.I.J);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.I.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ge5 ge5Var = new ge5();
        ge5Var.I = this.I.iterator();
        return ge5Var;
    }

    @Override // defpackage.ch2
    public final Object k(int i) {
        return this.I.J.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        fe5 fe5Var = new fe5();
        fe5Var.I = this.I.listIterator(i);
        return fe5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I.size();
    }

    @Override // defpackage.ch2
    public final ch2 i() {
        return this;
    }
}

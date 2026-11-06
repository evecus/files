package defpackage;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ul2 extends AbstractSequentialList implements Serializable {
    public final List I;
    public final pn1 J;

    public ul2(List list, pn1 pn1Var) {
        list.getClass();
        this.I = list;
        this.J = pn1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.I.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new sl2(this, this.I.listIterator(i), (byte) 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.I.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.I.size();
    }
}

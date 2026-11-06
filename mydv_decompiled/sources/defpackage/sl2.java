package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sl2 extends t95 implements ListIterator {
    public final /* synthetic */ byte J;
    public final /* synthetic */ AbstractList K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl2(AbstractList abstractList, ListIterator listIterator, byte b) {
        super(listIterator);
        this.J = b;
        this.K = abstractList;
    }

    @Override // defpackage.t95
    public final Object a(Object obj) {
        byte b = this.J;
        AbstractList abstractList = this.K;
        switch (b) {
            case 0:
                return ((tl2) abstractList).J.apply(obj);
            default:
                return ((ul2) abstractList).J.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.I).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.I).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.I).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.I).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

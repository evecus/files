package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w2 extends v2 implements ListIterator {
    public final /* synthetic */ y2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(y2 y2Var, int i) {
        super(y2Var, (byte) 0);
        this.L = y2Var;
        int c = y2Var.c();
        if (i < 0 || i > c) {
            zy.o(r7.x(i, c, "index: ", ", size: "));
            throw null;
        }
        this.J = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.J > 0;
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
        return this.L.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.J - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

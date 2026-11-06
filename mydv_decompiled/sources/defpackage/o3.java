package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o3 extends f3 implements ListIterator {
    public final /* synthetic */ p3 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p3 p3Var, int i) {
        super(p3Var, ((List) p3Var.J).listIterator(i));
        this.M = p3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        p3 p3Var = this.M;
        boolean isEmpty = p3Var.isEmpty();
        b().add(obj);
        p3Var.N.N++;
        if (isEmpty) {
            p3Var.c();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.J;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p3 p3Var) {
        super(p3Var);
        this.M = p3Var;
    }
}

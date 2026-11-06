package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class my1 extends vx1 {
    public final transient ey1 J;

    public my1(ey1 ey1Var) {
        this.J = ey1Var;
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.J.c(obj);
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        ay1 listIterator = ((dy1) this.J.M.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((vx1) listIterator.next()).d(i, objArr);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final ee5 iterator() {
        return new ky1(this.J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.J.N;
    }
}

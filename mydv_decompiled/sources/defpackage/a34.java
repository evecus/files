package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class a34 extends sy1 {
    public final transient iy1 L;
    public final transient b34 M;

    public a34(iy1 iy1Var, b34 b34Var) {
        this.L = iy1Var;
        this.M = b34Var;
    }

    @Override // defpackage.sy1, defpackage.vx1
    public final dy1 c() {
        return this.M;
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.L.get(obj) != null;
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        return this.M.d(i, objArr);
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public final ee5 iterator() {
        return this.M.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((c34) this.L).N;
    }
}

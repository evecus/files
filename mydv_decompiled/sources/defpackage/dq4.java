package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dq4 extends sy1 {
    public final transient Object L;

    public dq4(Object obj) {
        obj.getClass();
        this.L = obj;
    }

    @Override // defpackage.sy1, defpackage.vx1
    public final dy1 c() {
        return dy1.t(this.L);
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.L.equals(obj);
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        objArr[i] = this.L;
        return i + 1;
    }

    @Override // defpackage.sy1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.L.hashCode();
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public final ee5 iterator() {
        return new p52(this.L);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.L.toString() + ']';
    }
}

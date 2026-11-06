package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e34 extends sy1 {
    public static final Object[] Q;
    public static final e34 R;
    public final transient Object[] L;
    public final transient int M;
    public final transient Object[] N;
    public final transient int O;
    public final transient int P;

    static {
        Object[] objArr = new Object[0];
        Q = objArr;
        R = new e34(0, 0, 0, objArr, objArr);
    }

    public e34(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.L = objArr;
        this.M = i;
        this.N = objArr2;
        this.O = i2;
        this.P = i3;
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.N;
            if (objArr.length != 0) {
                int Y = ut0.Y(obj);
                while (true) {
                    int i = Y & this.O;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    Y = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.L;
        int i2 = this.P;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.vx1
    public final Object[] e() {
        return this.L;
    }

    @Override // defpackage.vx1
    public final int f() {
        return this.P;
    }

    @Override // defpackage.vx1
    public final int h() {
        return 0;
    }

    @Override // defpackage.sy1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.M;
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public final ee5 iterator() {
        return c().listIterator(0);
    }

    @Override // defpackage.sy1
    public final dy1 p() {
        return dy1.m(this.P, this.L);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.P;
    }
}

package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x24 extends dy1 {
    public static final x24 M = new x24(0, new Object[0]);
    public final transient Object[] K;
    public final transient int L;

    public x24(int i, Object[] objArr) {
        this.K = objArr;
        this.L = i;
    }

    @Override // defpackage.dy1, defpackage.vx1
    public final int d(int i, Object[] objArr) {
        Object[] objArr2 = this.K;
        int i2 = this.L;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.vx1
    public final Object[] e() {
        return this.K;
    }

    @Override // defpackage.vx1
    public final int f() {
        return this.L;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sp0.u(i, this.L);
        Object obj = this.K[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.vx1
    public final int h() {
        return 0;
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.L;
    }
}

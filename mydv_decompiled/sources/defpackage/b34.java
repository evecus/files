package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b34 extends dy1 {
    public final transient Object[] K;
    public final transient boolean L;
    public final transient int M;

    /* JADX WARN: Multi-variable type inference failed */
    public b34(Object[] objArr, int i, int i2) {
        this.K = objArr;
        this.L = i;
        this.M = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sp0.u(i, this.M);
        Object obj = this.K[(i * 2) + (this.L ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.M;
    }
}

package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class y24 extends dy1 {
    public final /* synthetic */ z24 K;

    public y24(z24 z24Var) {
        this.K = z24Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        z24 z24Var = this.K;
        sp0.u(i, z24Var.N);
        Object[] objArr = z24Var.M;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.K.N;
    }
}

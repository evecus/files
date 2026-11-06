package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hm3 extends w3 {
    public final dm3 I;

    public hm3(dm3 dm3Var) {
        this.I = dm3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.w3
    public final int c() {
        return this.I.N;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.I.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.I.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ta5[] ta5VarArr = new ta5[8];
        for (int i = 0; i < 8; i++) {
            ta5VarArr[i] = new va5((byte) 1);
        }
        return new gm3(this.I, ta5VarArr);
    }
}

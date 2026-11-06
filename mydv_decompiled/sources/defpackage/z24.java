package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class z24 extends sy1 {
    public final transient iy1 L;
    public final transient Object[] M;
    public final transient int N;

    public z24(iy1 iy1Var, Object[] objArr, int i) {
        this.L = iy1Var;
        this.M = objArr;
        this.N = i;
    }

    @Override // defpackage.vx1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.L.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vx1
    public final int d(int i, Object[] objArr) {
        return c().d(i, objArr);
    }

    @Override // defpackage.vx1
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public final ee5 iterator() {
        return c().listIterator(0);
    }

    @Override // defpackage.sy1
    public final dy1 p() {
        return new y24(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.N;
    }
}

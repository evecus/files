package defpackage;

import j$.util.Map;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class dm3 extends AbstractMap implements nm3, Map, a82, j$.util.Map {
    public bm3 I;
    public jp J = new jp(27);
    public sa5 K;
    public Object L;
    public int M;
    public int N;

    public dm3(bm3 bm3Var) {
        this.I = bm3Var;
        this.K = bm3Var.I;
        this.N = bm3Var.J;
    }

    @Override // defpackage.nm3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bm3 build() {
        sa5 sa5Var = this.K;
        bm3 bm3Var = this.I;
        if (sa5Var != bm3Var.I) {
            this.J = new jp((byte) 27);
            bm3Var = new bm3(this.K, this.N);
        }
        this.I = bm3Var;
        return bm3Var;
    }

    public final void b(int i) {
        this.N = i;
        this.M++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.K = sa5.e;
        b(0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.K.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new fm3(this, (byte) 0);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.K.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new fm3(this, (byte) 1);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.L = null;
        this.K = this.K.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.L;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        bm3 bm3Var = null;
        bm3 bm3Var2 = map instanceof bm3 ? (bm3) map : null;
        if (bm3Var2 == null) {
            dm3 dm3Var = map instanceof dm3 ? (dm3) map : null;
            if (dm3Var != null) {
                bm3Var = dm3Var.build();
            }
        } else {
            bm3Var = bm3Var2;
        }
        if (bm3Var == null) {
            super.putAll(map);
            return;
        }
        hu0 hu0Var = new hu0();
        hu0Var.a = 0;
        int i = this.N;
        this.K = this.K.m(bm3Var.I, 0, hu0Var, this);
        int i2 = (bm3Var.J + i) - hu0Var.a;
        if (i != i2) {
            b(i2);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.N;
        sa5 o = this.K.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = sa5.e;
        }
        this.K = o;
        return i != this.N;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.N;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new hm3(this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.L = null;
        sa5 n = this.K.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = sa5.e;
        }
        this.K = n;
        return this.L;
    }
}

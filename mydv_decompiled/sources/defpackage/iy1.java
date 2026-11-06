package defpackage;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class iy1 implements Map, Serializable, j$.util.Map {
    public transient z24 I;
    public transient a34 J;
    public transient b34 K;

    public static iy1 a(Map map) {
        if ((map instanceof iy1) && !(map instanceof SortedMap)) {
            return (iy1) map;
        }
        Set entrySet = map.entrySet();
        hy1 hy1Var = new hy1(entrySet instanceof Collection ? entrySet.size() : 4);
        hy1Var.c(entrySet);
        return hy1Var.a(true);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sy1 entrySet() {
        z24 z24Var = this.I;
        if (z24Var != null) {
            return z24Var;
        }
        c34 c34Var = (c34) this;
        z24 z24Var2 = new z24(c34Var, c34Var.M, c34Var.N);
        this.I = z24Var2;
        return z24Var2;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final sy1 keySet() {
        a34 a34Var = this.J;
        if (a34Var != null) {
            return a34Var;
        }
        c34 c34Var = (c34) this;
        a34 a34Var2 = new a34(c34Var, new b34(c34Var.M, 0, c34Var.N));
        this.J = a34Var2;
        return a34Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
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

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final vx1 values() {
        b34 b34Var = this.K;
        if (b34Var != null) {
            return b34Var;
        }
        c34 c34Var = (c34) this;
        b34 b34Var2 = new b34(c34Var.M, 1, c34Var.N);
        this.K = b34Var2;
        return b34Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return lq2.C(obj, this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return kb4.I(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((c34) this).size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        return lq2.o0(this);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }
}

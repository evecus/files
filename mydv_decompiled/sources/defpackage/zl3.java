package defpackage;

import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zl3 extends bm3 implements am3, Map {
    public static final zl3 L = new zl3(sa5.e, 0);

    @Override // defpackage.xe0
    public final Object Q(xx3 xx3Var) {
        return p70.r0(this, xx3Var);
    }

    @Override // defpackage.bm3
    /* renamed from: a */
    public final dm3 builder() {
        yl3 yl3Var = new yl3(this);
        yl3Var.O = this;
        return yl3Var;
    }

    @Override // defpackage.bm3, defpackage.om3
    public final nm3 builder() {
        yl3 yl3Var = new yl3(this);
        yl3Var.O = this;
        return yl3Var;
    }

    public final zl3 c(xx3 xx3Var, dh5 dh5Var) {
        ac4 u = this.I.u(xx3Var.hashCode(), 0, xx3Var, dh5Var);
        return u == null ? this : new zl3((sa5) u.J, this.J + (u.I ? 1 : 0));
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

    @Override // defpackage.bm3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof xx3) {
            return super.containsKey((xx3) obj);
        }
        return false;
    }

    @Override // defpackage.bm3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof dh5) {
            return super.containsValue((dh5) obj);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // defpackage.bm3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof xx3) {
            return (dh5) super.get((xx3) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof xx3) ? obj2 : (dh5) Map.CC.$default$getOrDefault(this, (xx3) obj, (dh5) obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}

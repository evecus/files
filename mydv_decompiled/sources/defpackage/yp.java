package defpackage;

import j$.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yp extends oo4 implements Map, j$.util.Map {
    public tp L;
    public vp M;
    public xp N;

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
    public final Set entrySet() {
        tp tpVar = this.L;
        if (tpVar != null) {
            return tpVar;
        }
        tp tpVar2 = new tp(this, (byte) 0);
        this.L = tpVar2;
        return tpVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.K;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.K;
    }

    @Override // java.util.Map
    public final Set keySet() {
        vp vpVar = this.M;
        if (vpVar != null) {
            return vpVar;
        }
        vp vpVar2 = new vp(this);
        this.M = vpVar2;
        return vpVar2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        int size = map.size() + this.K;
        int i = this.K;
        int[] iArr = this.I;
        if (iArr.length < size) {
            this.I = Arrays.copyOf(iArr, size);
            this.J = Arrays.copyOf(this.J, size * 2);
        }
        if (this.K != i) {
            y9.e();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        xp xpVar = this.N;
        if (xpVar != null) {
            return xpVar;
        }
        xp xpVar2 = new xp(this);
        this.N = xpVar2;
        return xpVar2;
    }
}

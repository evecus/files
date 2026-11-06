package defpackage;

import j$.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yl3 extends dm3 {
    public zl3 O;

    @Override // defpackage.dm3, defpackage.nm3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zl3 build() {
        sa5 sa5Var = this.K;
        zl3 zl3Var = this.O;
        if (sa5Var != zl3Var.I) {
            this.J = new jp((byte) 27);
            zl3Var = new zl3(this.K, this.N);
        }
        this.O = zl3Var;
        return zl3Var;
    }

    @Override // defpackage.dm3, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof xx3) {
            return super.containsKey((xx3) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof dh5) {
            return super.containsValue((dh5) obj);
        }
        return false;
    }

    @Override // defpackage.dm3, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof xx3) {
            return (dh5) super.get((xx3) obj);
        }
        return null;
    }

    @Override // defpackage.dm3, java.util.Map, j$.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof xx3) ? obj2 : (dh5) Map.CC.$default$getOrDefault(this, (xx3) obj, (dh5) obj2);
    }

    @Override // defpackage.dm3, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof xx3) {
            return (dh5) super.remove((xx3) obj);
        }
        return null;
    }
}

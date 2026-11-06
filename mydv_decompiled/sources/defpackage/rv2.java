package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rv2 extends AbstractMap {
    public final /* synthetic */ byte I = 0;
    public final Object J;
    public final Object K;

    public rv2(Map map, qv2 qv2Var) {
        map.getClass();
        this.J = map;
        this.K = qv2Var;
    }

    public final void a() {
        ut0.o(b());
    }

    public final Iterator b() {
        byte b = this.I;
        Object obj = this.J;
        switch (b) {
            case 0:
                return new m52(((Map) obj).entrySet().iterator(), new nv2((qv2) this.K, (byte) 1));
            default:
                return ((Iterable) obj).iterator();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        switch (this.I) {
            case 0:
                ((Map) this.J).clear();
                break;
            default:
                a();
                break;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.I) {
            case 0:
                return ((Map) this.J).containsKey(obj);
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new e3(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        byte b = this.I;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                Map map = (Map) this.J;
                Object obj3 = map.get(obj);
                if (obj3 != null || map.containsKey(obj)) {
                    return ((qv2) obj2).c(obj, obj3);
                }
                return null;
            default:
                if (!(obj instanceof g04)) {
                    return null;
                }
                g04 g04Var = (g04) obj;
                pa5 pa5Var = (pa5) ((qa5) obj2).a.get(g04Var.I);
                if (pa5Var == null || !pa5Var.I.equals(g04Var)) {
                    return null;
                }
                return pa5Var.J;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        switch (this.I) {
            case 0:
                return ((Map) this.J).keySet();
            default:
                return super.keySet();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        switch (this.I) {
            case 0:
                Map map = (Map) this.J;
                if (map.containsKey(obj)) {
                    return ((qv2) this.K).c(obj, map.remove(obj));
                }
                return null;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.I) {
            case 0:
                return ((Map) this.J).size();
            default:
                return ((qa5) this.K).a.size();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        switch (this.I) {
            case 0:
                return new t3(this);
            default:
                return super.values();
        }
    }

    public rv2(qa5 qa5Var, Collection collection) {
        this.K = qa5Var;
        this.J = collection;
    }
}

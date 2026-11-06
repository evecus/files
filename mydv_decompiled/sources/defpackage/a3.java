package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class a3 extends v3 implements wk2, Serializable {
    public final transient Map M;
    public transient int N;

    public a3(Map map) {
        sp0.o(map.isEmpty());
        this.M = map;
    }

    @Override // defpackage.v3, defpackage.g33
    public final Collection a() {
        return super.a();
    }

    @Override // defpackage.g33
    public final void clear() {
        Map map = this.M;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.N = 0;
    }

    @Override // defpackage.v3
    public Map d() {
        return new g3(this, this.M);
    }

    @Override // defpackage.v3
    public Set f() {
        return new i3(this, this.M);
    }

    @Override // defpackage.v3
    public final Collection g() {
        return new u3(this);
    }

    @Override // defpackage.g33
    public final List get(Object obj) {
        Collection collection = (Collection) this.M.get(obj);
        if (collection == null) {
            collection = j();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new l3(this, obj, list, null) : new p3(this, obj, list, null);
    }

    @Override // defpackage.v3
    public final Iterator h() {
        return new d3(this);
    }

    public abstract Collection j();

    @Override // defpackage.g33
    public final boolean put(Object obj, Object obj2) {
        Map map = this.M;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.N++;
            return true;
        }
        Collection j = j();
        if (!j.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.N++;
        map.put(obj, j);
        return true;
    }

    @Override // defpackage.g33
    public final int size() {
        return this.N;
    }

    @Override // defpackage.v3, defpackage.g33
    public final Collection values() {
        return super.values();
    }
}

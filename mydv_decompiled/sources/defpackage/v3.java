package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class v3 implements g33 {
    public transient Collection I;
    public transient Set J;
    public transient Collection K;
    public transient Map L;

    @Override // defpackage.g33
    public Collection a() {
        Collection collection = this.I;
        if (collection != null) {
            return collection;
        }
        Collection e = e();
        this.I = e;
        return e;
    }

    @Override // defpackage.g33
    public Map b() {
        Map map = this.L;
        if (map != null) {
            return map;
        }
        Map d = d();
        this.L = d;
        return d;
    }

    public boolean c(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        throw new AssertionError("should never be called");
    }

    public Collection e() {
        return new t3(this, (byte) 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g33) {
            return b().equals(((g33) obj).b());
        }
        return false;
    }

    public Set f() {
        throw new AssertionError("unreachable");
    }

    public abstract Collection g();

    public abstract Iterator h();

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        get(str).addAll(arrayList);
    }

    @Override // defpackage.g33
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // defpackage.g33
    public Set keySet() {
        Set set = this.J;
        if (set != null) {
            return set;
        }
        Set f = f();
        this.J = f;
        return f;
    }

    @Override // defpackage.g33
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }

    @Override // defpackage.g33
    public Collection values() {
        Collection collection = this.K;
        if (collection != null) {
            return collection;
        }
        Collection g = g();
        this.K = g;
        return g;
    }
}

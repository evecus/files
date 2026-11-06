package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class h3 implements Iterator {
    public final Iterator I;
    public Object J = null;
    public Collection K = null;
    public Iterator L = o52.I;
    public final /* synthetic */ a3 M;

    public h3(a3 a3Var) {
        this.M = a3Var;
        this.I = a3Var.M.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.I.hasNext() || this.L.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.L.hasNext()) {
            Map.Entry entry = (Map.Entry) this.I.next();
            this.J = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.K = collection;
            this.L = collection.iterator();
        }
        return a(this.J, this.L.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.L.remove();
        Collection collection = this.K;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.I.remove();
        }
        a3 a3Var = this.M;
        a3Var.N--;
    }

    public Object a(Object obj, Object obj2) {
        return obj2;
    }
}

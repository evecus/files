package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class f3 implements Iterator {
    public final /* synthetic */ byte I = 0;
    public final Iterator J;
    public Object K;
    public final /* synthetic */ Object L;

    public f3(p3 p3Var) {
        this.L = p3Var;
        Collection collection = p3Var.J;
        this.K = collection;
        this.J = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        p3 p3Var = (p3) this.L;
        p3Var.d();
        if (p3Var.J == ((Collection) this.K)) {
            return;
        }
        y9.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.I) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.J.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.I;
        Iterator it = this.J;
        switch (b) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.K = (Collection) entry.getValue();
                return ((g3) this.L).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.K = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.I;
        Object obj = this.L;
        Iterator it = this.J;
        switch (b) {
            case 0:
                sp0.A(((Collection) this.K) != null, "no calls to next() since the last call to remove()");
                it.remove();
                ((g3) obj).L.N -= ((Collection) this.K).size();
                ((Collection) this.K).clear();
                this.K = null;
                break;
            case 1:
                sp0.A(((Map.Entry) this.K) != null, "no calls to next() since the last call to remove()");
                Collection collection = (Collection) ((Map.Entry) this.K).getValue();
                it.remove();
                ((i3) obj).J.N -= collection.size();
                collection.clear();
                this.K = null;
                break;
            default:
                it.remove();
                p3 p3Var = (p3) obj;
                p3Var.M.N--;
                p3Var.e();
                break;
        }
    }

    public f3(p3 p3Var, ListIterator listIterator) {
        this.L = p3Var;
        this.K = p3Var.J;
        this.J = listIterator;
    }

    public f3(i3 i3Var, Iterator it) {
        this.J = it;
        this.L = i3Var;
    }

    public f3(g3 g3Var) {
        this.L = g3Var;
        this.J = g3Var.K.entrySet().iterator();
    }
}

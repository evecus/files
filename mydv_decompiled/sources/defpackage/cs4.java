package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cs4 implements Iterator {
    public int I = -1;
    public boolean J;
    public Iterator K;
    public final /* synthetic */ yr4 L;

    public cs4(yr4 yr4Var) {
        this.L = yr4Var;
    }

    public final Iterator a() {
        Iterator it = this.K;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.L.K.entrySet().iterator();
        this.K = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.I + 1;
        yr4 yr4Var = this.L;
        return i < yr4Var.J.size() || (!yr4Var.K.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.J = true;
        int i = this.I + 1;
        this.I = i;
        yr4 yr4Var = this.L;
        return i < yr4Var.J.size() ? (Map.Entry) yr4Var.J.get(this.I) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.J) {
            zy.i("remove() was called before next()");
            return;
        }
        this.J = false;
        int i = yr4.O;
        yr4 yr4Var = this.L;
        yr4Var.b();
        if (this.I >= yr4Var.J.size()) {
            a().remove();
            return;
        }
        int i2 = this.I;
        this.I = i2 - 1;
        yr4Var.g(i2);
    }
}

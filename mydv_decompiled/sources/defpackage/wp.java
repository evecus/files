package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wp implements Iterator, Map.Entry {
    public int I;
    public int J = -1;
    public boolean K;
    public final /* synthetic */ yp L;

    public wp(yp ypVar) {
        this.L = ypVar;
        this.I = ypVar.K - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.K) {
            zy.i("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.J;
            yp ypVar = this.L;
            if (j42.c(key, ypVar.e(i)) && j42.c(entry.getValue(), ypVar.h(this.J))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.K) {
            return this.L.e(this.J);
        }
        zy.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.K) {
            return this.L.h(this.J);
        }
        zy.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.J < this.I;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.K) {
            zy.i("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.J;
        yp ypVar = this.L;
        Object e = ypVar.e(i);
        Object h = ypVar.h(this.J);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        this.J++;
        this.K = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.K) {
            s83.r();
            return;
        }
        this.L.f(this.J);
        this.J--;
        this.I--;
        this.K = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.K) {
            return this.L.g(this.J, obj);
        }
        zy.i("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

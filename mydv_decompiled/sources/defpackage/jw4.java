package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jw4 implements Iterator, w72 {
    public final it4 I;
    public final Iterator J;
    public int K;
    public Map.Entry L;
    public Map.Entry M;
    public final /* synthetic */ byte N;

    public jw4(it4 it4Var, Iterator it, byte b) {
        this.N = b;
        this.I = it4Var;
        this.J = it;
        this.K = it4Var.f().d;
        a();
    }

    public final void a() {
        this.L = this.M;
        Iterator it = this.J;
        this.M = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.M != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.N) {
            case 0:
                a();
                if (this.L == null) {
                    s83.r();
                    break;
                } else {
                    break;
                }
            case 1:
                Map.Entry entry = this.M;
                if (entry == null) {
                    s83.r();
                    break;
                } else {
                    a();
                    break;
                }
            default:
                Map.Entry entry2 = this.M;
                if (entry2 == null) {
                    s83.r();
                    break;
                } else {
                    a();
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        it4 it4Var = this.I;
        if (it4Var.f().d != this.K) {
            y9.e();
            return;
        }
        Map.Entry entry = this.L;
        if (entry == null) {
            s83.r();
            return;
        }
        it4Var.remove(entry.getKey());
        this.L = null;
        this.K = it4Var.f().d;
    }
}

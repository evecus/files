package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dp1 implements Iterator, w72 {
    public Object I;
    public int J = -2;
    public final /* synthetic */ ep1 K;

    public dp1(ep1 ep1Var) {
        this.K = ep1Var;
    }

    public final void a() {
        Object invoke;
        int i = this.J;
        ep1 ep1Var = this.K;
        if (i == -2) {
            invoke = ((rm1) ep1Var.c).invoke();
        } else {
            tm1 tm1Var = ep1Var.b;
            Object obj = this.I;
            obj.getClass();
            invoke = tm1Var.invoke(obj);
        }
        this.I = invoke;
        this.J = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.J < 0) {
            a();
        }
        return this.J == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.J < 0) {
            a();
        }
        if (this.J == 0) {
            zy.k();
            return null;
        }
        Object obj = this.I;
        obj.getClass();
        this.J = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

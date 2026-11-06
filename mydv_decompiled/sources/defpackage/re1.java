package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class re1 implements Iterator, w72 {
    public final Iterator J;
    public Object L;
    public final /* synthetic */ oj4 M;
    public final /* synthetic */ byte I = 0;
    public int K = -1;

    public re1(se1 se1Var) {
        this.M = se1Var;
        this.J = new v95((ep1) se1Var.b);
    }

    public void a() {
        Object next;
        se1 se1Var = (se1) this.M;
        do {
            Iterator it = this.J;
            if (!it.hasNext()) {
                this.K = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((yv3) se1Var.c).invoke(next)).booleanValue());
        this.L = next;
        this.K = 1;
    }

    public void b() {
        Iterator it = this.J;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((se1) this.M).c.invoke(next)).booleanValue()) {
                this.K = 1;
                this.L = next;
                return;
            }
        }
        this.K = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.I) {
            case 0:
                if (this.K == -1) {
                    a();
                }
                if (this.K == 1) {
                }
                break;
            default:
                if (this.K == -1) {
                    b();
                }
                if (this.K == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.I) {
            case 0:
                if (this.K == -1) {
                    a();
                }
                if (this.K == 0) {
                    zy.k();
                    break;
                } else {
                    Object obj = this.L;
                    this.L = null;
                    this.K = -1;
                    break;
                }
            default:
                if (this.K == -1) {
                    b();
                }
                if (this.K == 0) {
                    zy.k();
                    break;
                } else {
                    Object obj2 = this.L;
                    this.L = null;
                    this.K = -1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public re1(se1 se1Var, byte b) {
        this.M = se1Var;
        this.J = se1Var.b.iterator();
    }
}

package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class it1 implements ListIterator, w72 {
    public final /* synthetic */ byte I;
    public int J;
    public int K;
    public int L;
    public final Object M;

    public it1(kk2 kk2Var, int i) {
        int i2;
        this.I = (byte) 1;
        this.M = kk2Var;
        this.J = i;
        this.K = -1;
        i2 = ((AbstractList) kk2Var).modCount;
        this.L = i2;
    }

    public void a() {
        int i;
        i = ((AbstractList) ((kk2) this.M).M).modCount;
        if (i == this.L) {
            return;
        }
        y9.e();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                kk2 kk2Var = (kk2) this.M;
                int i2 = this.J;
                this.J = i2 + 1;
                kk2Var.add(i2, obj);
                this.K = -1;
                i = ((AbstractList) kk2Var).modCount;
                this.L = i;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.I) {
            case 0:
                if (this.J < this.L) {
                    break;
                }
                break;
            default:
                if (this.J < ((kk2) this.M).K) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.I) {
            case 0:
                if (this.J > this.K) {
                }
                break;
            default:
                if (this.J > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.I;
        Object obj = this.M;
        switch (b) {
            case 0:
                e43 e43Var = ((kt1) obj).I;
                int i = this.J;
                this.J = i + 1;
                Object g = e43Var.g(i);
                g.getClass();
                return (k13) g;
            default:
                a();
                int i2 = this.J;
                kk2 kk2Var = (kk2) obj;
                if (i2 >= kk2Var.K) {
                    zy.k();
                    return null;
                }
                this.J = i2 + 1;
                this.K = i2;
                return kk2Var.I[kk2Var.J + i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.I) {
            case 0:
                return this.J - this.K;
            default:
                return this.J;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.I;
        Object obj = this.M;
        switch (b) {
            case 0:
                e43 e43Var = ((kt1) obj).I;
                int i = this.J - 1;
                this.J = i;
                Object g = e43Var.g(i);
                g.getClass();
                return (k13) g;
            default:
                a();
                int i2 = this.J;
                if (i2 <= 0) {
                    zy.k();
                    return null;
                }
                int i3 = i2 - 1;
                this.J = i3;
                this.K = i3;
                kk2 kk2Var = (kk2) obj;
                return kk2Var.I[kk2Var.J + i3];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.I) {
            case 0:
                return (this.J - this.K) - 1;
            default:
                return this.J - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                kk2 kk2Var = (kk2) this.M;
                a();
                int i2 = this.K;
                if (i2 == -1) {
                    zy.i("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                kk2Var.d(i2);
                this.J = this.K;
                this.K = -1;
                i = ((AbstractList) kk2Var).modCount;
                this.L = i;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.I) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                a();
                int i = this.K;
                if (i != -1) {
                    ((kk2) this.M).set(i, obj);
                    return;
                } else {
                    zy.i("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
        }
    }

    public it1(kt1 kt1Var, int i, int i2, int i3) {
        this.I = (byte) 0;
        this.M = kt1Var;
        this.J = i;
        this.K = i2;
        this.L = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public it1(kt1 kt1Var, int i, int i2) {
        this(kt1Var, (i2 & 1) != 0 ? 0 : i, 0, kt1Var.I.b);
        this.I = (byte) 0;
    }
}

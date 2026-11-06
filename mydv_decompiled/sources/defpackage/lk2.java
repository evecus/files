package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lk2 implements ListIterator, w72 {
    public int J;
    public int L;
    public final Object M;
    public final /* synthetic */ byte I = 1;
    public int K = -1;

    public lk2(gt4 gt4Var, int i) {
        this.M = gt4Var;
        this.J = i - 1;
        this.L = j42.E(gt4Var);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((mk2) this.M)).modCount;
        if (i == this.L) {
            return;
        }
        y9.e();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                a();
                mk2 mk2Var = (mk2) obj2;
                int i2 = this.J;
                this.J = i2 + 1;
                mk2Var.add(i2, obj);
                this.K = -1;
                i = ((AbstractList) mk2Var).modCount;
                this.L = i;
                break;
            default:
                b();
                gt4 gt4Var = (gt4) obj2;
                gt4Var.add(this.J + 1, obj);
                this.K = -1;
                this.J++;
                this.L = j42.E(gt4Var);
                break;
        }
    }

    public void b() {
        if (j42.E((gt4) this.M) == this.L) {
            return;
        }
        y9.e();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.I;
        Object obj = this.M;
        switch (b) {
            case 0:
                if (this.J < ((mk2) obj).J) {
                    break;
                }
                break;
            default:
                if (this.J < ((gt4) obj).size() - 1) {
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
                if (this.J > 0) {
                }
                break;
            default:
                if (this.J >= 0) {
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
                a();
                int i = this.J;
                mk2 mk2Var = (mk2) obj;
                if (i >= mk2Var.J) {
                    zy.k();
                    return null;
                }
                this.J = i + 1;
                this.K = i;
                return mk2Var.I[i];
            default:
                b();
                int i2 = this.J + 1;
                this.K = i2;
                gt4 gt4Var = (gt4) obj;
                j42.n0(i2, gt4Var.size());
                Object obj2 = gt4Var.get(i2);
                this.J = i2;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.I) {
            case 0:
                return this.J;
            default:
                return this.J + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.I;
        Object obj = this.M;
        switch (b) {
            case 0:
                a();
                int i = this.J;
                if (i <= 0) {
                    zy.k();
                    return null;
                }
                int i2 = i - 1;
                this.J = i2;
                this.K = i2;
                return ((mk2) obj).I[i2];
            default:
                b();
                gt4 gt4Var = (gt4) obj;
                j42.n0(this.J, gt4Var.size());
                int i3 = this.J;
                this.K = i3;
                this.J--;
                return gt4Var.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.I) {
            case 0:
                return this.J - 1;
            default:
                return this.J;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        byte b = this.I;
        Object obj = this.M;
        switch (b) {
            case 0:
                mk2 mk2Var = (mk2) obj;
                a();
                int i2 = this.K;
                if (i2 == -1) {
                    zy.i("Call next() or previous() before removing element from the iterator.");
                    break;
                } else {
                    mk2Var.d(i2);
                    this.J = this.K;
                    this.K = -1;
                    i = ((AbstractList) mk2Var).modCount;
                    this.L = i;
                    break;
                }
            default:
                b();
                gt4 gt4Var = (gt4) obj;
                gt4Var.remove(this.K);
                this.J--;
                this.K = -1;
                this.L = j42.E(gt4Var);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                a();
                int i = this.K;
                if (i == -1) {
                    zy.i("Call next() or previous() before replacing element from the iterator.");
                    break;
                } else {
                    ((mk2) obj2).set(i, obj);
                    break;
                }
            default:
                gt4 gt4Var = (gt4) obj2;
                b();
                int i2 = this.K;
                if (i2 < 0) {
                    zy.i("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    break;
                } else {
                    gt4Var.set(i2, obj);
                    this.L = j42.E(gt4Var);
                    break;
                }
        }
    }

    public lk2(mk2 mk2Var, int i) {
        int i2;
        this.M = mk2Var;
        this.J = i;
        i2 = ((AbstractList) mk2Var).modCount;
        this.L = i2;
    }
}

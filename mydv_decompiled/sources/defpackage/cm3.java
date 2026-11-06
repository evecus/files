package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class cm3 implements Iterator, w72 {
    public final ta5[] I;
    public int J;
    public boolean K = true;

    public cm3(sa5 sa5Var, ta5[] ta5VarArr) {
        this.I = ta5VarArr;
        ta5VarArr[0].a(sa5Var.d, Integer.bitCount(sa5Var.a) * 2, 0);
        this.J = 0;
        a();
    }

    public final void a() {
        int i = this.J;
        ta5[] ta5VarArr = this.I;
        ta5 ta5Var = ta5VarArr[i];
        if (ta5Var.K < ta5Var.J) {
            return;
        }
        while (-1 < i) {
            int b = b(i);
            if (b == -1) {
                ta5 ta5Var2 = ta5VarArr[i];
                int i2 = ta5Var2.K;
                Object[] objArr = ta5Var2.I;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    ta5Var2.K = i2 + 1;
                    b = b(i);
                }
            }
            if (b != -1) {
                this.J = b;
                return;
            }
            if (i > 0) {
                ta5 ta5Var3 = ta5VarArr[i - 1];
                int i3 = ta5Var3.K;
                int length2 = ta5Var3.I.length;
                ta5Var3.K = i3 + 1;
            }
            ta5VarArr[i].a(sa5.e.d, 0, 0);
            i--;
        }
        this.K = false;
    }

    public final int b(int i) {
        ta5[] ta5VarArr = this.I;
        ta5 ta5Var = ta5VarArr[i];
        int i2 = ta5Var.K;
        if (i2 < ta5Var.J) {
            return i;
        }
        Object[] objArr = ta5Var.I;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        sa5 sa5Var = (sa5) obj;
        if (i == 6) {
            ta5 ta5Var2 = ta5VarArr[i + 1];
            Object[] objArr2 = sa5Var.d;
            ta5Var2.a(objArr2, objArr2.length, 0);
        } else {
            ta5VarArr[i + 1].a(sa5Var.d, Integer.bitCount(sa5Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.K;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.K) {
            zy.k();
            return null;
        }
        Object next = this.I[this.J].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

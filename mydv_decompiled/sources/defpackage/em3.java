package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public class em3 extends cm3 {
    public final dm3 L;
    public Object M;
    public boolean N;
    public int O;

    public em3(dm3 dm3Var, ta5[] ta5VarArr) {
        super(dm3Var.K, ta5VarArr);
        this.L = dm3Var;
        this.O = dm3Var.M;
    }

    public final void c(int i, sa5 sa5Var, Object obj, int i2) {
        int i3 = i2 * 5;
        ta5[] ta5VarArr = this.I;
        if (i3 <= 30) {
            int k = 1 << oh4.k(i, i3);
            if (sa5Var.h(k)) {
                ta5VarArr[i2].a(sa5Var.d, Integer.bitCount(sa5Var.a) * 2, sa5Var.f(k));
                this.J = i2;
                return;
            } else {
                int t = sa5Var.t(k);
                sa5 s = sa5Var.s(t);
                ta5VarArr[i2].a(sa5Var.d, Integer.bitCount(sa5Var.a) * 2, t);
                c(i, s, obj, i2 + 1);
                return;
            }
        }
        ta5 ta5Var = ta5VarArr[i2];
        Object[] objArr = sa5Var.d;
        ta5Var.a(objArr, objArr.length, 0);
        while (true) {
            ta5 ta5Var2 = ta5VarArr[i2];
            if (j42.c(ta5Var2.I[ta5Var2.K], obj)) {
                this.J = i2;
                return;
            } else {
                ta5VarArr[i2].K += 2;
            }
        }
    }

    @Override // defpackage.cm3, java.util.Iterator
    public final Object next() {
        if (this.L.M != this.O) {
            y9.e();
            return null;
        }
        if (!this.K) {
            zy.k();
            return null;
        }
        ta5 ta5Var = this.I[this.J];
        this.M = ta5Var.I[ta5Var.K];
        this.N = true;
        return super.next();
    }

    @Override // defpackage.cm3, java.util.Iterator
    public final void remove() {
        if (!this.N) {
            s83.r();
            return;
        }
        boolean z = this.K;
        dm3 dm3Var = this.L;
        if (!z) {
            p70.x(dm3Var).remove(this.M);
        } else {
            if (!z) {
                zy.k();
                return;
            }
            ta5 ta5Var = this.I[this.J];
            Object obj = ta5Var.I[ta5Var.K];
            p70.x(dm3Var).remove(this.M);
            c(obj != null ? obj.hashCode() : 0, dm3Var.K, obj, 0);
        }
        this.M = null;
        this.N = false;
        this.O = dm3Var.M;
    }
}

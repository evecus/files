package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cu4 implements Cloneable {
    public /* synthetic */ boolean I;
    public /* synthetic */ int[] J;
    public /* synthetic */ Object[] K;
    public /* synthetic */ int L;

    public cu4(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.J = new int[i5];
        this.K = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.L;
        if (i2 != 0 && i <= this.J[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (this.I && i2 >= this.J.length) {
            qb.H(this);
        }
        int i3 = this.L;
        if (i3 >= this.J.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.J = Arrays.copyOf(this.J, i7);
            this.K = Arrays.copyOf(this.K, i7);
        }
        this.J[i3] = i;
        this.K[i3] = obj;
        this.L = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cu4 clone() {
        Object clone = super.clone();
        clone.getClass();
        cu4 cu4Var = (cu4) clone;
        cu4Var.J = (int[]) this.J.clone();
        cu4Var.K = (Object[]) this.K.clone();
        return cu4Var;
    }

    public final int c(int i) {
        if (this.I) {
            qb.H(this);
        }
        return this.J[i];
    }

    public final void d(int i, Object obj) {
        int g = o7.g(this.L, i, this.J);
        if (g >= 0) {
            this.K[g] = obj;
            return;
        }
        int i2 = ~g;
        int i3 = this.L;
        if (i2 < i3) {
            Object[] objArr = this.K;
            if (objArr[i2] == qb.p) {
                this.J[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.I && i3 >= this.J.length) {
            qb.H(this);
            i2 = ~o7.g(this.L, i, this.J);
        }
        int i4 = this.L;
        if (i4 >= this.J.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            this.J = Arrays.copyOf(this.J, i8);
            this.K = Arrays.copyOf(this.K, i8);
        }
        int i9 = this.L;
        if (i9 - i2 != 0) {
            int[] iArr = this.J;
            int i10 = i2 + 1;
            dq.O0(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.K;
            dq.Q0(i10, i2, this.L, objArr2, objArr2);
        }
        this.J[i2] = i;
        this.K[i2] = obj;
        this.L++;
    }

    public final int e() {
        if (this.I) {
            qb.H(this);
        }
        return this.L;
    }

    public final Object f(int i) {
        if (this.I) {
            qb.H(this);
        }
        Object[] objArr = this.K;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.L * 28);
        sb.append('{');
        int i = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object f = f(i2);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

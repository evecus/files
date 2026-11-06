package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bs2 implements Cloneable {
    public /* synthetic */ boolean I;
    public /* synthetic */ long[] J;
    public /* synthetic */ Object[] K;
    public /* synthetic */ int L;

    public bs2(int i) {
        if (i == 0) {
            this.J = o7.f;
            this.K = o7.g;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.J = new long[i5];
        this.K = new Object[i5];
    }

    public final void a(long j, Object obj) {
        int i = this.L;
        if (i != 0 && j <= this.J[i - 1]) {
            g(j, obj);
            return;
        }
        if (this.I) {
            long[] jArr = this.J;
            if (i >= jArr.length) {
                Object[] objArr = this.K;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj2 = objArr[i3];
                    if (obj2 != eu5.o) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj2;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.I = false;
                this.L = i2;
                i = i2;
            }
        }
        if (i >= this.J.length) {
            int i4 = (i + 1) * 8;
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
            int i7 = i4 / 8;
            this.J = Arrays.copyOf(this.J, i7);
            this.K = Arrays.copyOf(this.K, i7);
        }
        this.J[i] = j;
        this.K[i] = obj;
        this.L = i + 1;
    }

    public final void b() {
        int i = this.L;
        Object[] objArr = this.K;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.L = 0;
        this.I = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bs2 clone() {
        Object clone = super.clone();
        clone.getClass();
        bs2 bs2Var = (bs2) clone;
        bs2Var.J = (long[]) this.J.clone();
        bs2Var.K = (Object[]) this.K.clone();
        return bs2Var;
    }

    public final Object d(long j) {
        Object obj;
        int h = o7.h(this.J, this.L, j);
        if (h < 0 || (obj = this.K[h]) == eu5.o) {
            return null;
        }
        return obj;
    }

    public final Object e(long j) {
        Object obj;
        int h = o7.h(this.J, this.L, j);
        if (h < 0 || (obj = this.K[h]) == eu5.o) {
            return -1L;
        }
        return obj;
    }

    public final long f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.L)) {
            dq2.H0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.I) {
            long[] jArr = this.J;
            Object[] objArr = this.K;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != eu5.o) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.I = false;
            this.L = i3;
        }
        return this.J[i];
    }

    public final void g(long j, Object obj) {
        Object obj2 = eu5.o;
        int h = o7.h(this.J, this.L, j);
        if (h >= 0) {
            this.K[h] = obj;
            return;
        }
        int i = ~h;
        int i2 = this.L;
        if (i < i2) {
            Object[] objArr = this.K;
            if (objArr[i] == obj2) {
                this.J[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.I) {
            long[] jArr = this.J;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.K;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.I = false;
                this.L = i3;
                i = ~o7.h(this.J, i3, j);
            }
        }
        int i5 = this.L;
        if (i5 >= this.J.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.J = Arrays.copyOf(this.J, i9);
            this.K = Arrays.copyOf(this.K, i9);
        }
        int i10 = this.L;
        if (i10 - i != 0) {
            long[] jArr2 = this.J;
            int i11 = i + 1;
            dq.P0(i11, i, i10, jArr2, jArr2);
            Object[] objArr3 = this.K;
            dq.Q0(i11, i, this.L, objArr3, objArr3);
        }
        this.J[i] = j;
        this.K[i] = obj;
        this.L++;
    }

    public final void h(long j) {
        int h = o7.h(this.J, this.L, j);
        if (h >= 0) {
            Object[] objArr = this.K;
            Object obj = objArr[h];
            Object obj2 = eu5.o;
            if (obj != obj2) {
                objArr[h] = obj2;
                this.I = true;
            }
        }
    }

    public final int i() {
        if (this.I) {
            int i = this.L;
            long[] jArr = this.J;
            Object[] objArr = this.K;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != eu5.o) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.I = false;
            this.L = i2;
        }
        return this.L;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.L)) {
            dq2.H0("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.I) {
            long[] jArr = this.J;
            Object[] objArr = this.K;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != eu5.o) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.I = false;
            this.L = i3;
        }
        return this.K[i];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.L * 28);
        sb.append('{');
        int i = this.L;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append('=');
            Object j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ bs2(Object obj) {
        this(10);
    }
}

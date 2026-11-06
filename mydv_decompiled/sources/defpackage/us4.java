package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class us4 implements Iterable, w72 {
    public static final us4 M = new us4(null, 0, 0, 0);
    public final long I;
    public final long J;
    public final long K;
    public final long[] L;

    public us4(long[] jArr, long j, long j2, long j3) {
        this.I = j;
        this.J = j2;
        this.K = j3;
        this.L = jArr;
    }

    public final us4 c(us4 us4Var) {
        long[] jArr;
        us4 us4Var2 = this;
        us4 us4Var3 = M;
        if (us4Var == us4Var3) {
            return us4Var2;
        }
        if (us4Var2 == us4Var3) {
            return us4Var3;
        }
        long j = us4Var.K;
        long j2 = us4Var.K;
        long[] jArr2 = us4Var.L;
        long j3 = us4Var.J;
        long j4 = us4Var.I;
        long j5 = us4Var2.K;
        if (j == j5 && jArr2 == (jArr = us4Var2.L)) {
            return new us4(jArr, us4Var2.I & (~j4), us4Var2.J & (~j3), j5);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                us4Var2 = us4Var2.d(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    us4Var2 = us4Var2.d(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    us4Var2 = us4Var2.d(i2 + j2 + 64);
                }
            }
        }
        return us4Var2;
    }

    public final us4 d(long j) {
        long[] jArr;
        int c;
        long[] jArr2;
        long j2 = j - this.K;
        if (j42.n(j2, 0L) >= 0 && j42.n(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.J;
            if ((j4 & j3) != 0) {
                return new us4(this.L, this.I, j4 & (~j3), this.K);
            }
        } else if (j42.n(j2, 64L) >= 0 && j42.n(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.I;
            if ((j6 & j5) != 0) {
                return new us4(this.L, j6 & (~j5), this.J, this.K);
            }
        } else if (j42.n(j2, 0L) < 0 && (jArr = this.L) != null && (c = oh4.c(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (c > 0) {
                    dq.P0(0, 0, c, jArr, jArr3);
                }
                if (c < i) {
                    dq.P0(c, c + 1, length, jArr, jArr3);
                }
                jArr2 = jArr3;
            }
            return new us4(jArr2, this.I, this.J, this.K);
        }
        return this;
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.K;
        return (j42.n(j2, 0L) < 0 || j42.n(j2, 64L) >= 0) ? (j42.n(j2, 64L) < 0 || j42.n(j2, 128L) >= 0) ? j42.n(j2, 0L) <= 0 && (jArr = this.L) != null && oh4.c(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.I) != 0 : ((1 << ((int) j2)) & this.J) != 0;
    }

    public final us4 f(us4 us4Var) {
        us4 us4Var2;
        long[] jArr;
        us4 us4Var3 = this;
        us4 us4Var4 = M;
        if (us4Var == us4Var4) {
            return us4Var3;
        }
        if (us4Var3 == us4Var4) {
            return us4Var;
        }
        long j = us4Var.K;
        long j2 = us4Var.K;
        long[] jArr2 = us4Var.L;
        long j3 = us4Var.J;
        long j4 = us4Var.I;
        long j5 = us4Var3.K;
        long j6 = us4Var3.J;
        long j7 = us4Var3.I;
        if (j == j5 && jArr2 == (jArr = us4Var3.L)) {
            return new us4(jArr, j7 | j4, j6 | j3, j5);
        }
        long[] jArr3 = us4Var3.L;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    us4Var3 = us4Var3.h(j8);
                }
            }
            if (j3 != 0) {
                for (int i = 0; i < 64; i++) {
                    if (((1 << i) & j3) != 0) {
                        us4Var3 = us4Var3.h(i + j2);
                    }
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        us4Var3 = us4Var3.h(i2 + j2 + 64);
                    }
                }
            }
            return us4Var3;
        }
        if (jArr3 != null) {
            us4Var2 = us4Var;
            for (long j9 : jArr3) {
                us4Var2 = us4Var2.h(j9);
            }
        } else {
            us4Var2 = us4Var;
        }
        long j10 = us4Var3.K;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    us4Var2 = us4Var2.h(i3 + j10);
                }
            }
        }
        if (j7 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j7) != 0) {
                    us4Var2 = us4Var2.h(i4 + j10 + 64);
                }
            }
        }
        return us4Var2;
    }

    public final us4 h(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.K;
        long j6 = j - j5;
        long j7 = 0;
        int n = j42.n(j6, 0L);
        long j8 = this.J;
        if (n < 0 || j42.n(j6, 64L) >= 0) {
            int n2 = j42.n(j6, 64L);
            long j9 = this.I;
            int i2 = 64;
            if (n2 < 0 || j42.n(j6, 128L) >= 0) {
                int n3 = j42.n(j6, 128L);
                long[] jArr3 = this.L;
                if (n3 < 0) {
                    if (jArr3 == null) {
                        return new us4(new long[]{j}, this.I, this.J, this.K);
                    }
                    int c = oh4.c(jArr3, j);
                    if (c < 0) {
                        int i3 = -(c + 1);
                        int length = jArr3.length;
                        long[] jArr4 = new long[length + 1];
                        dq.P0(0, 0, i3, jArr3, jArr4);
                        dq.P0(i3 + 1, i3, length, jArr3, jArr4);
                        jArr4[i3] = j;
                        return new us4(jArr4, this.I, this.J, this.K);
                    }
                } else if (!e(j)) {
                    long j10 = ((j + 1) / 64) * 64;
                    if (j42.n(j10, 0L) < 0) {
                        j10 = 9223372036854775680L;
                    }
                    long j11 = j9;
                    ep epVar = null;
                    while (true) {
                        if (j42.n(j5, j10) >= 0) {
                            j2 = j5;
                            j3 = j8;
                            break;
                        }
                        if (j8 != j7) {
                            if (epVar == null) {
                                epVar = new ep(jArr3);
                            }
                            int i4 = 0;
                            i = i2;
                            while (i4 < i) {
                                if ((j8 & (1 << i4)) != j7) {
                                    j4 = j7;
                                    ((v33) epVar.J).a(i4 + j5);
                                } else {
                                    j4 = j7;
                                }
                                i4++;
                                j7 = j4;
                            }
                        } else {
                            i = i2;
                        }
                        long j12 = j7;
                        if (j11 == j12) {
                            j2 = j10;
                            j3 = j12;
                            break;
                        }
                        j5 += 64;
                        j7 = j12;
                        j8 = j11;
                        i2 = i;
                        j11 = j7;
                    }
                    if (epVar != null) {
                        v33 v33Var = (v33) epVar.J;
                        int i5 = v33Var.b;
                        if (i5 == 0) {
                            jArr2 = null;
                        } else {
                            long[] jArr5 = new long[i5];
                            long[] jArr6 = v33Var.a;
                            for (int i6 = 0; i6 < i5; i6++) {
                                jArr5[i6] = jArr6[i6];
                            }
                            jArr2 = jArr5;
                        }
                        if (jArr2 != null) {
                            jArr = jArr2;
                            return new us4(jArr, j11, j3, j2).h(j);
                        }
                    }
                    jArr = jArr3;
                    return new us4(jArr, j11, j3, j2).h(j);
                }
            } else {
                long j13 = 1 << (((int) j6) - 64);
                if ((j9 & j13) == 0) {
                    return new us4(this.L, j9 | j13, this.J, this.K);
                }
            }
        } else {
            long j14 = 1 << ((int) j6);
            if ((j8 & j14) == 0) {
                return new us4(this.L, this.I, j8 | j14, this.K);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new fq(new ts4(this, null), (byte) 1).iterator();
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(p70.J(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null ? obj2 instanceof CharSequence : true) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append((CharSequence) obj2.toString());
            }
        }
        sb.append((CharSequence) "");
        return obj + " [" + sb.toString() + "]";
    }
}

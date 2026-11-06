package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class z51 extends x51 {
    public final int r;
    public final int s;
    public final int[] t;
    public final jr2 u;

    public z51(int i, int[] iArr, jr2 jr2Var) {
        this.s = i;
        this.r = iArr.length == 1 ? 2 : 3;
        this.t = iArr;
        this.u = jr2Var;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return X(e41Var.P());
    }

    @Override // defpackage.e41
    public final int J() {
        return this.s;
    }

    @Override // defpackage.e41
    public final e41 P() {
        int i;
        jr2 jr2Var = this.u;
        int e = jr2Var.e();
        if (e == 0) {
            s83.r();
            return null;
        }
        int i2 = this.s;
        int[] iArr = this.t;
        int i3 = 1;
        if (e != 1) {
            jr2 jr2Var2 = (jr2) jr2Var.clone();
            int i4 = (i2 + 63) >>> 6;
            jr2 jr2Var3 = new jr2(i4);
            long[] jArr = jr2Var3.I;
            jr2.g(jArr, i2);
            int length = iArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                jr2.g(jArr, iArr[length]);
            }
            int i5 = 0;
            jr2.g(jArr, 0);
            jr2 jr2Var4 = new jr2(i4);
            jr2Var4.I[0] = 1;
            jr2 jr2Var5 = new jr2(i4);
            int[] iArr2 = new int[2];
            iArr2[0] = e;
            iArr2[1] = i2 + 1;
            jr2[] jr2VarArr = {jr2Var2, jr2Var3};
            int[] iArr3 = new int[2];
            iArr3[0] = 1;
            iArr3[1] = 0;
            jr2[] jr2VarArr2 = {jr2Var4, jr2Var5};
            int i6 = iArr2[1];
            int i7 = i6 - iArr2[0];
            while (true) {
                if (i7 < 0) {
                    i7 = -i7;
                    iArr2[i3] = i6;
                    iArr3[i3] = i5;
                    i3 = 1 - i3;
                    i6 = iArr2[i3];
                    i5 = iArr3[i3];
                }
                i = 1 - i3;
                jr2VarArr[i3].b(jr2VarArr[i], iArr2[i], i7);
                int f = jr2VarArr[i3].f(i6);
                if (f == 0) {
                    break;
                }
                int i8 = iArr3[i];
                jr2VarArr2[i3].b(jr2VarArr2[i], i8, i7);
                int i9 = i8 + i7;
                if (i9 > i5) {
                    i5 = i9;
                } else if (i9 == i5) {
                    i5 = jr2VarArr2[i3].f(i5);
                }
                i7 += f - i6;
                i6 = f;
            }
            jr2Var = jr2VarArr2[i];
        }
        return new z51(i2, iArr, jr2Var);
    }

    @Override // defpackage.e41
    public final boolean S() {
        return this.u.l();
    }

    @Override // defpackage.e41
    public final boolean T() {
        for (long j : this.u.I) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        int i;
        long[] jArr;
        int i2;
        jr2 jr2Var = ((z51) e41Var).u;
        jr2 jr2Var2 = this.u;
        int e = jr2Var2.e();
        int i3 = this.s;
        int[] iArr = this.t;
        if (e == 0) {
            jr2Var = jr2Var2;
        } else {
            int e2 = jr2Var.e();
            if (e2 != 0) {
                if (e > e2) {
                    jr2Var2 = jr2Var;
                    jr2Var = jr2Var2;
                    e2 = e;
                    e = e2;
                }
                int i4 = (e + 63) >>> 6;
                int i5 = (e2 + 63) >>> 6;
                int i6 = ((e + e2) + 62) >>> 6;
                if (i4 != 1) {
                    int i7 = (e2 + 70) >>> 6;
                    int[] iArr2 = new int[16];
                    int i8 = i7 << 4;
                    long[] jArr2 = new long[i8];
                    iArr2[1] = i7;
                    System.arraycopy(jr2Var.I, 0, jArr2, i7, i5);
                    int i9 = 2;
                    int i10 = i7;
                    while (i9 < 16) {
                        int i11 = i10 + i7;
                        iArr2[i9] = i11;
                        if ((i9 & 1) == 0) {
                            jr2.p(jArr2, i11 >>> 1, jArr2, i11, i7, 1);
                        } else {
                            int i12 = i11 - i7;
                            for (int i13 = 0; i13 < i7; i13++) {
                                jArr2[i11 + i13] = jArr2[i7 + i13] ^ jArr2[i12 + i13];
                            }
                        }
                        i9++;
                        i10 = i11;
                    }
                    long[] jArr3 = new long[i8];
                    jr2.p(jArr2, 0, jArr3, 0, i8, 4);
                    long[] jArr4 = jr2Var2.I;
                    int i14 = i6 << 3;
                    long[] jArr5 = new long[i14];
                    int i15 = 0;
                    while (i15 < i4) {
                        int i16 = i3;
                        int i17 = i15;
                        long j = jArr4[i15];
                        while (true) {
                            jArr = jArr4;
                            i2 = i14;
                            int i18 = iArr2[((int) j) & 15];
                            int i19 = iArr2[((int) (j >>> 4)) & 15];
                            for (int i20 = 0; i20 < i7; i20++) {
                                int i21 = i17 + i20;
                                jArr5[i21] = jArr5[i21] ^ (jArr2[i18 + i20] ^ jArr3[i19 + i20]);
                            }
                            j >>>= 8;
                            if (j == 0) {
                                break;
                            }
                            i17 += i6;
                            i14 = i2;
                            jArr4 = jArr;
                        }
                        i15++;
                        i14 = i2;
                        i3 = i16;
                        jArr4 = jArr;
                    }
                    i = i3;
                    while (true) {
                        int i22 = i14 - i6;
                        if (i22 == 0) {
                            break;
                        }
                        jr2.d(jArr5, i22 - i6, jArr5, i22, i6, 8);
                        i14 = i22;
                    }
                    jr2Var = new jr2(jArr5, jr2.o(jArr5, i6, i, iArr));
                    return new z51(i, iArr, jr2Var);
                }
                long j2 = jr2Var2.I[0];
                if (j2 != 1) {
                    long[] jArr6 = new long[i6];
                    jr2.n(j2, jr2Var.I, i5, jArr6);
                    jr2Var = new jr2(jArr6, jr2.o(jArr6, i6, i3, iArr));
                }
            }
        }
        i = i3;
        return new z51(i, iArr, jr2Var);
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return Z(e41Var, e41Var2, e41Var3);
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        jr2 jr2Var = ((z51) e41Var).u;
        jr2 jr2Var2 = ((z51) e41Var2).u;
        jr2 jr2Var3 = ((z51) e41Var3).u;
        jr2 jr2Var4 = this.u;
        jr2 m = jr2Var4.m(jr2Var);
        jr2 m2 = jr2Var2.m(jr2Var3);
        if (m == jr2Var4 || m == jr2Var) {
            m = (jr2) m.clone();
        }
        m.c(m2);
        long[] jArr = m.I;
        int length = jArr.length;
        int i = this.s;
        int[] iArr = this.t;
        int o = jr2.o(jArr, length, i, iArr);
        if (o < jArr.length) {
            long[] jArr2 = new long[o];
            m.I = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, o);
        }
        return new z51(i, iArr, m);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z51)) {
            return false;
        }
        z51 z51Var = (z51) obj;
        return this.s == z51Var.s && this.r == z51Var.r && Arrays.equals(this.t, z51Var.t) && this.u.equals(z51Var.u);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.u.hashCode() ^ this.s;
        int[] iArr = this.t;
        if (iArr == null) {
            i = 0;
        } else {
            int length = iArr.length;
            int i2 = length + 1;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = (i2 * TsExtractor.TS_STREAM_TYPE_AIT) ^ iArr[length];
            }
            i = i2;
        }
        return i ^ hashCode;
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        jr2 jr2Var = (jr2) this.u.clone();
        jr2Var.c(((z51) e41Var).u);
        return new z51(this.s, this.t, jr2Var);
    }

    @Override // defpackage.e41
    public final e41 l() {
        jr2 jr2Var;
        jr2 jr2Var2 = this.u;
        if (jr2Var2.I.length == 0) {
            jr2Var = new jr2(new long[]{1});
        } else {
            int max = Math.max(1, jr2Var2.j());
            long[] jArr = new long[max];
            long[] jArr2 = jr2Var2.I;
            System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, max));
            jArr[0] = jArr[0] ^ 1;
            jr2Var = new jr2(jArr);
        }
        return new z51(this.s, this.t, jr2Var);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        jr2 jr2Var = this.u;
        long[] jArr = jr2Var.I;
        int i = 0;
        while (true) {
            if (i >= jArr.length) {
                break;
            }
            if (jArr[i] == 0) {
                i++;
            } else if (!jr2Var.l()) {
                return s0(this.s - 1);
            }
        }
        return this;
    }

    @Override // defpackage.e41
    public final e41 q0() {
        jr2 jr2Var = this.u;
        int j = jr2Var.j();
        int i = this.s;
        int[] iArr = this.t;
        if (j != 0) {
            int i2 = j << 1;
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                long j2 = jr2Var.I[i3 >>> 1];
                int i4 = i3 + 1;
                jArr[i3] = jr2.k((int) j2);
                i3 += 2;
                jArr[i4] = jr2.k((int) (j2 >>> 32));
            }
            jr2Var = new jr2(jArr, jr2.o(jArr, i2, i, iArr));
        }
        return new z51(i, iArr, jr2Var);
    }

    @Override // defpackage.e41
    public final int r() {
        return this.u.e();
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        jr2 jr2Var;
        jr2 jr2Var2 = ((z51) e41Var).u;
        jr2 jr2Var3 = ((z51) e41Var2).u;
        jr2 jr2Var4 = this.u;
        int j = jr2Var4.j();
        if (j == 0) {
            jr2Var = jr2Var4;
        } else {
            int i = j << 1;
            long[] jArr = new long[i];
            int i2 = 0;
            while (i2 < i) {
                long j2 = jr2Var4.I[i2 >>> 1];
                int i3 = i2 + 1;
                jArr[i2] = jr2.k((int) j2);
                i2 += 2;
                jArr[i3] = jr2.k((int) (j2 >>> 32));
            }
            jr2Var = new jr2(jArr, i);
        }
        jr2 m = jr2Var2.m(jr2Var3);
        if (jr2Var == jr2Var4) {
            jr2Var = (jr2) jr2Var.clone();
        }
        jr2Var.c(m);
        long[] jArr2 = jr2Var.I;
        int length = jArr2.length;
        int i4 = this.s;
        int[] iArr = this.t;
        int o = jr2.o(jArr2, length, i4, iArr);
        if (o < jArr2.length) {
            long[] jArr3 = new long[o];
            jr2Var.I = jArr3;
            System.arraycopy(jArr2, 0, jArr3, 0, o);
        }
        return new z51(i4, iArr, jr2Var);
    }

    @Override // defpackage.e41
    public final e41 s0(int i) {
        if (i < 1) {
            return this;
        }
        jr2 jr2Var = this.u;
        int j = jr2Var.j();
        int i2 = this.s;
        int[] iArr = this.t;
        if (j != 0) {
            int i3 = ((i2 + 63) >>> 6) << 1;
            long[] jArr = new long[i3];
            System.arraycopy(jr2Var.I, 0, jArr, 0, j);
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i4 = j << 1;
                while (true) {
                    j--;
                    if (j >= 0) {
                        long j2 = jArr[j];
                        jArr[i4 - 1] = jr2.k((int) (j2 >>> 32));
                        i4 -= 2;
                        jArr[i4] = jr2.k((int) j2);
                    }
                }
                j = jr2.o(jArr, i3, i2, iArr);
            }
            jr2Var = new jr2(jArr, j);
        }
        return new z51(i2, iArr, jr2Var);
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        return k(e41Var);
    }

    @Override // defpackage.e41
    public final boolean v0() {
        long[] jArr = this.u.I;
        return jArr.length > 0 && (jArr[0] & 1) != 0;
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        jr2 jr2Var = this.u;
        int j = jr2Var.j();
        if (j == 0) {
            return n51.a;
        }
        int i = j - 1;
        long j2 = jr2Var.I[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        boolean z = false;
        for (int i3 = 7; i3 >= 0; i3--) {
            byte b = (byte) (j2 >>> (i3 * 8));
            if (z || b != 0) {
                bArr[i2] = b;
                i2++;
                z = true;
            }
        }
        byte[] bArr2 = new byte[(i * 8) + i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = bArr[i4];
        }
        for (int i5 = j - 2; i5 >= 0; i5--) {
            long j3 = jr2Var.I[i5];
            int i6 = 7;
            while (i6 >= 0) {
                bArr2[i2] = (byte) (j3 >>> (i6 * 8));
                i6--;
                i2++;
            }
        }
        return new BigInteger(1, bArr2);
    }
}

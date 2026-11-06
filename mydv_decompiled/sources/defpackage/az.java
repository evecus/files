package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class az implements Closeable {
    public cz I;
    public boolean J;
    public kh4 K;
    public byte[] M;
    public long L = -1;
    public int N = -1;
    public int O = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.I == null) {
            zy.i("not attached to a buffer");
            return;
        }
        this.I = null;
        this.K = null;
        this.L = -1L;
        this.M = null;
        this.N = -1;
        this.O = -1;
    }

    public final void e(long j) {
        cz czVar = this.I;
        if (czVar == null) {
            zy.i("not attached to a buffer");
            return;
        }
        if (!this.J) {
            zy.i("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = czVar.J;
        if (j <= j2) {
            if (j < 0) {
                s83.h(r7.A("newSize < 0: ", j));
                return;
            }
            long j3 = j2 - j;
            while (true) {
                if (j3 <= 0) {
                    break;
                }
                kh4 kh4Var = czVar.I;
                kh4Var.getClass();
                kh4 kh4Var2 = kh4Var.g;
                kh4Var2.getClass();
                int i = kh4Var2.c;
                long j4 = i - kh4Var2.b;
                if (j4 > j3) {
                    kh4Var2.c = i - ((int) j3);
                    break;
                } else {
                    czVar.I = kh4Var2.a();
                    ph4.a(kh4Var2);
                    j3 -= j4;
                }
            }
            this.K = null;
            this.L = j;
            this.M = null;
            this.N = -1;
            this.O = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                kh4 a0 = czVar.a0(i2);
                int min = (int) Math.min(j5, 8192 - a0.c);
                int i3 = a0.c + min;
                a0.c = i3;
                j5 -= min;
                if (z) {
                    this.K = a0;
                    this.L = j2;
                    this.M = a0.a;
                    this.N = i3 - min;
                    this.O = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        czVar.J = j;
    }

    public final int g(long j) {
        cz czVar = this.I;
        if (czVar == null) {
            zy.i("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = czVar.J;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.K = null;
                    this.L = j;
                    this.M = null;
                    this.N = -1;
                    this.O = -1;
                    return -1;
                }
                kh4 kh4Var = czVar.I;
                kh4 kh4Var2 = this.K;
                long j3 = 0;
                if (kh4Var2 != null) {
                    long j4 = this.L - (this.N - kh4Var2.b);
                    if (j4 > j) {
                        kh4Var2 = kh4Var;
                        kh4Var = kh4Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    kh4Var2 = kh4Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        kh4Var2.getClass();
                        long j5 = (kh4Var2.c - kh4Var2.b) + j3;
                        if (j < j5) {
                            break;
                        }
                        kh4Var2 = kh4Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        kh4Var.getClass();
                        kh4Var = kh4Var.g;
                        kh4Var.getClass();
                        j2 -= kh4Var.c - kh4Var.b;
                    }
                    kh4Var2 = kh4Var;
                    j3 = j2;
                }
                if (this.J) {
                    kh4Var2.getClass();
                    if (kh4Var2.d) {
                        byte[] bArr = kh4Var2.a;
                        kh4 kh4Var3 = new kh4(Arrays.copyOf(bArr, bArr.length), kh4Var2.b, kh4Var2.c, false, true);
                        if (czVar.I == kh4Var2) {
                            czVar.I = kh4Var3;
                        }
                        kh4Var2.b(kh4Var3);
                        kh4 kh4Var4 = kh4Var3.g;
                        kh4Var4.getClass();
                        kh4Var4.a();
                        kh4Var2 = kh4Var3;
                    }
                }
                this.K = kh4Var2;
                this.L = j;
                kh4Var2.getClass();
                this.M = kh4Var2.a;
                int i = kh4Var2.b + ((int) (j - j3));
                this.N = i;
                int i2 = kh4Var2.c;
                this.O = i2;
                return i2 - i;
            }
        }
        StringBuilder A = hf1.A(j, "offset=", " > size=");
        A.append(czVar.J);
        throw new ArrayIndexOutOfBoundsException(A.toString());
    }
}

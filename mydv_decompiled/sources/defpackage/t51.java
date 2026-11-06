package defpackage;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public final class t51 extends p51 {
    public int h;
    public int i;
    public int j;
    public int k;
    public h61 l;

    public t51(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.d = bigInteger3;
        this.e = bigInteger4;
        e41 e41Var = null;
        this.l = new h61(this, e41Var, e41Var, (byte) 0);
        this.b = h(bigInteger);
        this.c = h(bigInteger2);
        this.f = (byte) 6;
    }

    @Override // defpackage.v51
    public final v51 a() {
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        e41 e41Var = this.b;
        e41 e41Var2 = this.c;
        BigInteger bigInteger = this.d;
        BigInteger bigInteger2 = this.e;
        t51 t51Var = new t51(i, i2, i3, i4);
        t51Var.h = i;
        t51Var.i = i2;
        t51Var.j = i3;
        t51Var.k = i4;
        t51Var.d = bigInteger;
        t51Var.e = bigInteger2;
        e41 e41Var3 = null;
        t51Var.l = new h61(t51Var, e41Var3, e41Var3, (byte) 0);
        t51Var.b = e41Var;
        t51Var.c = e41Var2;
        t51Var.f = (byte) 6;
        return t51Var;
    }

    @Override // defpackage.v51
    public final j16 b(g61[] g61VarArr, int i) {
        int i2 = this.i;
        int i3 = this.k;
        int i4 = (this.h + 63) >>> 6;
        int i5 = this.j;
        int[] iArr = (i5 == 0 && i3 == 0) ? new int[]{i2} : new int[]{i2, i5, i3};
        long[] jArr = new long[i * i4 * 2];
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            g61 g61Var = g61VarArr[i7];
            long[] jArr2 = ((z51) g61Var.b).u.I;
            System.arraycopy(jArr2, 0, jArr, i6, jArr2.length);
            int i8 = i6 + i4;
            long[] jArr3 = ((z51) g61Var.c).u.I;
            System.arraycopy(jArr3, 0, jArr, i8, jArr3.length);
            i6 = i8 + i4;
        }
        return new s51(this, i, i4, jArr, iArr);
    }

    @Override // defpackage.v51
    public final e41 h(BigInteger bigInteger) {
        if (bigInteger != null && bigInteger.signum() >= 0) {
            int bitLength = bigInteger.bitLength();
            int i = this.h;
            if (bitLength <= i) {
                int i2 = this.j;
                int i3 = this.k;
                int i4 = i2 | i3;
                int i5 = this.i;
                char c = 2;
                int i6 = 1;
                int[] iArr = i4 == 0 ? new int[]{i5} : new int[]{i5, i2, i3};
                jr2 jr2Var = new jr2();
                if (bigInteger.signum() < 0) {
                    s83.t("invalid F2m field value");
                    return null;
                }
                if (bigInteger.signum() == 0) {
                    jr2Var.I = new long[]{0};
                } else {
                    byte[] byteArray = bigInteger.toByteArray();
                    int length = byteArray.length;
                    if (byteArray[0] == 0) {
                        length--;
                    } else {
                        i6 = 0;
                    }
                    int i7 = (length + 7) / 8;
                    jr2Var.I = new long[i7];
                    int i8 = i7 - 1;
                    int i9 = (length % 8) + i6;
                    if (i6 < i9) {
                        long j = 0;
                        while (i6 < i9) {
                            j = (j << 8) | (byteArray[i6] & 255);
                            i6++;
                            c = c;
                        }
                        jr2Var.I[i8] = j;
                        i8 = i7 - 2;
                    }
                    while (i8 >= 0) {
                        long j2 = 0;
                        int i10 = 0;
                        while (i10 < 8) {
                            j2 = (j2 << 8) | (byteArray[i6] & 255);
                            i10++;
                            i6++;
                        }
                        jr2Var.I[i8] = j2;
                        i8--;
                    }
                }
                return new z51(i, iArr, jr2Var);
            }
        }
        s83.t("x value invalid in F2m field element");
        return null;
    }

    @Override // defpackage.v51
    public final int j() {
        return this.h;
    }

    @Override // defpackage.v51
    public final g61 k() {
        return this.l;
    }

    public t51(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }
}

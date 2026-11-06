package defpackage;

import java.math.BigInteger;
import java.util.Random;

/* loaded from: classes2.dex */
public final class a61 extends y51 {
    public final BigInteger r;
    public final BigInteger s;
    public final BigInteger t;

    public a61(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.r = bigInteger;
        this.s = bigInteger2;
        this.t = bigInteger3;
    }

    @Override // defpackage.e41
    public final e41 B(e41 e41Var) {
        return new a61(this.r, this.s, C0(this.t, B0(e41Var.w0())));
    }

    public final BigInteger B0(BigInteger bigInteger) {
        BigInteger bigInteger2 = zv.a;
        BigInteger bigInteger3 = this.r;
        if (!bigInteger3.testBit(0)) {
            s83.t("'M' must be odd");
            return null;
        }
        if (bigInteger3.signum() != 1) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > bigInteger3.bitLength()) {
            bigInteger = bigInteger.mod(bigInteger3);
        }
        int bitLength = bigInteger3.bitLength();
        int[] K = dq2.K(bitLength, bigInteger3);
        int[] K2 = dq2.K(bitLength, bigInteger);
        int length = K.length;
        int[] iArr = new int[length];
        if (jl2.Y(K, K2, iArr) != 0) {
            return dq2.L0(length, iArr);
        }
        throw new ArithmeticException("BigInteger not invertible.");
    }

    public final BigInteger C0(BigInteger bigInteger, BigInteger bigInteger2) {
        return D0(bigInteger.multiply(bigInteger2));
    }

    public final BigInteger D0(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.r;
        BigInteger bigInteger3 = this.s;
        if (bigInteger3 == null) {
            return bigInteger.mod(bigInteger2);
        }
        boolean z = bigInteger.signum() < 0;
        if (z) {
            bigInteger = bigInteger.abs();
        }
        int bitLength = bigInteger2.bitLength();
        boolean equals = bigInteger3.equals(n51.b);
        while (bigInteger.bitLength() > bitLength + 1) {
            BigInteger shiftRight = bigInteger.shiftRight(bitLength);
            BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
            if (!equals) {
                shiftRight = shiftRight.multiply(bigInteger3);
            }
            bigInteger = shiftRight.add(subtract);
        }
        while (bigInteger.compareTo(bigInteger2) >= 0) {
            bigInteger = bigInteger.subtract(bigInteger2);
        }
        return (!z || bigInteger.signum() == 0) ? bigInteger : bigInteger2.subtract(bigInteger);
    }

    @Override // defpackage.e41
    public final int J() {
        return this.r.bitLength();
    }

    @Override // defpackage.e41
    public final e41 P() {
        return new a61(this.r, this.s, B0(this.t));
    }

    @Override // defpackage.e41
    public final e41 X(e41 e41Var) {
        return new a61(this.r, this.s, C0(this.t, e41Var.w0()));
    }

    @Override // defpackage.e41
    public final e41 Y(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return new a61(this.r, this.s, D0(this.t.multiply(e41Var.w0()).subtract(e41Var2.w0().multiply(e41Var3.w0()))));
    }

    @Override // defpackage.e41
    public final e41 Z(e41 e41Var, e41 e41Var2, e41 e41Var3) {
        return new a61(this.r, this.s, D0(this.t.multiply(e41Var.w0()).add(e41Var2.w0().multiply(e41Var3.w0()))));
    }

    @Override // defpackage.e41
    public final e41 a0() {
        BigInteger bigInteger = this.t;
        if (bigInteger.signum() == 0) {
            return this;
        }
        BigInteger bigInteger2 = this.s;
        BigInteger bigInteger3 = this.r;
        return new a61(bigInteger3, bigInteger2, bigInteger3.subtract(bigInteger));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a61)) {
            return false;
        }
        a61 a61Var = (a61) obj;
        return this.r.equals(a61Var.r) && this.t.equals(a61Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() ^ this.r.hashCode();
    }

    @Override // defpackage.e41
    public final e41 k(e41 e41Var) {
        BigInteger add = this.t.add(e41Var.w0());
        BigInteger bigInteger = this.r;
        if (add.compareTo(bigInteger) >= 0) {
            add = add.subtract(bigInteger);
        }
        return new a61(bigInteger, this.s, add);
    }

    @Override // defpackage.e41
    public final e41 l() {
        BigInteger add = this.t.add(n51.b);
        BigInteger bigInteger = this.r;
        if (add.compareTo(bigInteger) == 0) {
            add = n51.a;
        }
        return new a61(bigInteger, this.s, add);
    }

    @Override // defpackage.e41
    public final e41 p0() {
        BigInteger bigInteger;
        if (T() || S()) {
            return this;
        }
        BigInteger bigInteger2 = this.r;
        int i = 0;
        if (!bigInteger2.testBit(0)) {
            throw new RuntimeException("not done yet");
        }
        int i2 = 1;
        boolean testBit = bigInteger2.testBit(1);
        e41 e41Var = null;
        BigInteger bigInteger3 = this.s;
        BigInteger bigInteger4 = this.t;
        BigInteger bigInteger5 = n51.b;
        if (testBit) {
            a61 a61Var = new a61(bigInteger2, bigInteger3, bigInteger4.modPow(bigInteger2.shiftRight(2).add(bigInteger5), bigInteger2));
            if (a61Var.q0().equals(this)) {
                return a61Var;
            }
            return null;
        }
        boolean testBit2 = bigInteger2.testBit(2);
        BigInteger bigInteger6 = n51.c;
        if (testBit2) {
            BigInteger modPow = bigInteger4.modPow(bigInteger2.shiftRight(3), bigInteger2);
            BigInteger C0 = C0(modPow, bigInteger4);
            if (C0(C0, modPow).equals(bigInteger5)) {
                a61 a61Var2 = new a61(bigInteger2, bigInteger3, C0);
                if (a61Var2.q0().equals(this)) {
                    return a61Var2;
                }
                return null;
            }
            a61 a61Var3 = new a61(bigInteger2, bigInteger3, D0(C0.multiply(bigInteger6.modPow(bigInteger2.shiftRight(2), bigInteger2))));
            if (a61Var3.q0().equals(this)) {
                return a61Var3;
            }
            return null;
        }
        BigInteger shiftRight = bigInteger2.shiftRight(1);
        if (!bigInteger4.modPow(shiftRight, bigInteger2).equals(bigInteger5)) {
            return null;
        }
        BigInteger shiftLeft = bigInteger4.shiftLeft(1);
        if (shiftLeft.compareTo(bigInteger2) >= 0) {
            shiftLeft = shiftLeft.subtract(bigInteger2);
        }
        BigInteger shiftLeft2 = shiftLeft.shiftLeft(1);
        if (shiftLeft2.compareTo(bigInteger2) >= 0) {
            shiftLeft2 = shiftLeft2.subtract(bigInteger2);
        }
        BigInteger add = shiftRight.add(bigInteger5);
        BigInteger subtract = bigInteger2.subtract(bigInteger5);
        Random random = new Random();
        while (true) {
            e41 e41Var2 = e41Var;
            BigInteger bigInteger7 = new BigInteger(bigInteger2.bitLength(), random);
            if (bigInteger7.compareTo(bigInteger2) >= 0 || !D0(bigInteger7.multiply(bigInteger7).subtract(shiftLeft2)).modPow(shiftRight, bigInteger2).equals(subtract)) {
                e41Var = e41Var2;
                bigInteger6 = bigInteger6;
            } else {
                int bitLength = add.bitLength();
                int i3 = i;
                int lowestSetBit = add.getLowestSetBit();
                int i4 = bitLength - i2;
                BigInteger bigInteger8 = shiftRight;
                BigInteger bigInteger9 = bigInteger5;
                BigInteger bigInteger10 = bigInteger9;
                BigInteger bigInteger11 = bigInteger10;
                BigInteger bigInteger12 = bigInteger6;
                Random random2 = random;
                BigInteger bigInteger13 = bigInteger7;
                while (true) {
                    bigInteger = subtract;
                    if (i4 < lowestSetBit + 1) {
                        break;
                    }
                    bigInteger11 = C0(bigInteger11, bigInteger9);
                    if (add.testBit(i4)) {
                        bigInteger9 = C0(bigInteger11, bigInteger4);
                        BigInteger C02 = C0(bigInteger10, bigInteger13);
                        bigInteger6 = D0(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger11)));
                        bigInteger13 = D0(bigInteger13.multiply(bigInteger13).subtract(bigInteger9.shiftLeft(1)));
                        bigInteger10 = C02;
                    } else {
                        BigInteger D0 = D0(bigInteger10.multiply(bigInteger6).subtract(bigInteger11));
                        BigInteger D02 = D0(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(bigInteger11)));
                        bigInteger6 = D0(bigInteger6.multiply(bigInteger6).subtract(bigInteger11.shiftLeft(1)));
                        bigInteger13 = D02;
                        bigInteger10 = D0;
                        bigInteger9 = bigInteger11;
                    }
                    i4--;
                    subtract = bigInteger;
                }
                BigInteger C03 = C0(bigInteger11, bigInteger9);
                BigInteger C04 = C0(C03, bigInteger4);
                BigInteger D03 = D0(bigInteger10.multiply(bigInteger6).subtract(C03));
                BigInteger D04 = D0(bigInteger13.multiply(bigInteger6).subtract(bigInteger7.multiply(C03)));
                BigInteger D05 = D0(C03.multiply(C04));
                for (int i5 = 1; i5 <= lowestSetBit; i5++) {
                    D03 = C0(D03, D04);
                    D04 = D0(D04.multiply(D04).subtract(D05.shiftLeft(1)));
                    D05 = D0(D05.multiply(D05));
                }
                BigInteger[] bigIntegerArr = new BigInteger[2];
                bigIntegerArr[i3] = D03;
                bigIntegerArr[1] = D04;
                BigInteger bigInteger14 = bigIntegerArr[i3];
                BigInteger bigInteger15 = bigIntegerArr[1];
                if (C0(bigInteger15, bigInteger15).equals(shiftLeft2)) {
                    if (bigInteger15.testBit(i3)) {
                        bigInteger15 = bigInteger2.subtract(bigInteger15);
                    }
                    return new a61(bigInteger2, bigInteger3, bigInteger15.shiftRight(1));
                }
                if (bigInteger14.equals(bigInteger5)) {
                    i = i3;
                    i2 = 1;
                    e41Var = e41Var2;
                    shiftRight = bigInteger8;
                    bigInteger6 = bigInteger12;
                    random = random2;
                    subtract = bigInteger;
                } else {
                    if (!bigInteger14.equals(bigInteger)) {
                        return e41Var2;
                    }
                    subtract = bigInteger;
                    i = i3;
                    i2 = 1;
                    e41Var = e41Var2;
                    shiftRight = bigInteger8;
                    bigInteger6 = bigInteger12;
                    random = random2;
                }
            }
        }
    }

    @Override // defpackage.e41
    public final e41 q0() {
        BigInteger bigInteger = this.t;
        return new a61(this.r, this.s, C0(bigInteger, bigInteger));
    }

    @Override // defpackage.e41
    public final e41 r0(e41 e41Var, e41 e41Var2) {
        BigInteger w0 = e41Var.w0();
        BigInteger w02 = e41Var2.w0();
        BigInteger bigInteger = this.t;
        return new a61(this.r, this.s, D0(bigInteger.multiply(bigInteger).add(w0.multiply(w02))));
    }

    @Override // defpackage.e41
    public final e41 t0(e41 e41Var) {
        BigInteger subtract = this.t.subtract(e41Var.w0());
        int signum = subtract.signum();
        BigInteger bigInteger = this.r;
        if (signum < 0) {
            subtract = subtract.add(bigInteger);
        }
        return new a61(bigInteger, this.s, subtract);
    }

    @Override // defpackage.e41
    public final BigInteger w0() {
        return this.t;
    }
}

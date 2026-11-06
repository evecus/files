package defpackage;

import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class l0 extends u0 {
    public static final y K = new y(l0.class, (byte) 9);
    public static final l0[] L = new l0[17];
    public static final l0 M;
    public static final l0 N;
    public final byte[] I;
    public final int J;

    static {
        int i = 0;
        while (true) {
            l0[] l0VarArr = L;
            if (i >= 17) {
                M = l0VarArr[0];
                N = l0VarArr[1];
                return;
            } else {
                l0VarArr[i] = new l0(i);
                i++;
            }
        }
    }

    public l0(byte[] bArr) {
        if (B(bArr)) {
            s83.t("malformed integer");
            throw null;
        }
        this.I = bArr;
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            } else {
                i = i2;
            }
        }
        this.J = i;
    }

    public static boolean B(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || ox3.c("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public static l0 D(int i) {
        return (((long) i) < 0 || i >= 17) ? new l0(i) : L[i];
    }

    public static l0 v(Object obj) {
        if (obj == null || (obj instanceof l0)) {
            return (l0) obj;
        }
        if (!(obj instanceof byte[])) {
            s83.t("illegal object in getInstance: ".concat(obj.getClass().getName()));
            return null;
        }
        try {
            return (l0) K.g((byte[]) obj);
        } catch (Exception e) {
            j0.h(e);
            return null;
        }
    }

    public static int z(int i, byte[] bArr) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i2 = bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i2;
            }
            i2 = (i2 << 8) | (bArr[max] & 255);
        }
    }

    public final int A() {
        byte[] bArr = this.I;
        int length = bArr.length;
        int i = this.J;
        if (length - i <= 4) {
            return z(i, bArr);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final long C() {
        byte[] bArr = this.I;
        int length = bArr.length;
        int i = this.J;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int length2 = bArr.length;
        int max = Math.max(i, length2 - 8);
        long j = bArr[max];
        while (true) {
            max++;
            if (max >= length2) {
                return j;
            }
            j = (j << 8) | (bArr[max] & 255);
        }
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (u0Var instanceof l0) {
            return Arrays.equals(this.I, ((l0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 2, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    public final String toString() {
        return x().toString();
    }

    public final BigInteger w() {
        return new BigInteger(1, this.I);
    }

    public final BigInteger x() {
        return new BigInteger(this.I);
    }

    public final boolean y(int i) {
        byte[] bArr = this.I;
        int length = bArr.length;
        int i2 = this.J;
        return length - i2 <= 4 && z(i2, bArr) == i;
    }

    public l0(long j) {
        this.I = BigInteger.valueOf(j).toByteArray();
        this.J = 0;
    }

    public l0(BigInteger bigInteger) {
        this.I = bigInteger.toByteArray();
        this.J = 0;
    }

    public l0(int i) {
        this.I = BigInteger.valueOf(i).toByteArray();
        this.J = 0;
    }
}

package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v0 extends u0 {
    public static final y K = new y(v0.class, 16);
    public static final ConcurrentHashMap L = new ConcurrentHashMap();
    public final byte[] I;
    public String J = null;

    public v0(byte[] bArr) {
        this.I = bArr;
    }

    public static v0 v(byte[] bArr, int i, boolean z) {
        v0 v0Var = (v0) L.get(new p0(bArr, i));
        if (v0Var != null) {
            return v0Var;
        }
        if (!w(i, bArr)) {
            s83.t("invalid relative OID contents");
            return null;
        }
        if (z) {
            bArr = g4.x(bArr, 0, i);
        }
        return new v0(bArr);
    }

    public static boolean w(int i, byte[] bArr) {
        if (ox3.c("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (i < 1) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            if (z && (bArr[i2] & 255) == 128) {
                return false;
            }
            z = (bArr[i2] & 128) == 0;
        }
        return z;
    }

    public static boolean x(int i, String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                return true;
            }
            char charAt = str.charAt(i3);
            if (charAt != '.') {
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                i2++;
                length = i3;
            } else {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
                length = i3;
            }
        }
        return false;
    }

    public static void y(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public static void z(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (this == u0Var) {
            return true;
        }
        if (u0Var instanceof v0) {
            return Arrays.equals(this.I, ((v0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 13, z);
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
        String str;
        synchronized (this) {
            str = this.J;
            if (str == null) {
                byte[] bArr = this.I;
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                BigInteger bigInteger = null;
                long j = 0;
                for (int i = 0; i != bArr.length; i++) {
                    byte b = bArr[i];
                    if (j <= 72057594037927808L) {
                        long j2 = j + (b & Byte.MAX_VALUE);
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append('.');
                            }
                            sb.append(j2);
                            j = 0;
                        } else {
                            j = j2 << 7;
                        }
                    } else {
                        if (bigInteger == null) {
                            bigInteger = BigInteger.valueOf(j);
                        }
                        BigInteger or = bigInteger.or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                        if ((b & 128) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                sb.append('.');
                            }
                            sb.append(or);
                            bigInteger = null;
                            j = 0;
                        } else {
                            bigInteger = or.shiftLeft(7);
                        }
                    }
                }
                str = sb.toString();
                this.J = str;
            }
        }
        return str;
    }
}

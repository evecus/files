package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q0 extends u0 {
    public static final y K = new y(q0.class, 13);
    public static final ConcurrentHashMap L = new ConcurrentHashMap();
    public final byte[] I;
    public String J;

    public q0(String str) {
        char charAt;
        if (str.length() > 16385) {
            s83.t("exceeded OID contents length limit");
            throw null;
        }
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
            int i = 2;
            if (v0.x(2, str) && (charAt == '2' || str.length() == 3 || str.charAt(3) == '.' || ((str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4'))) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length() / 2);
                int charAt2 = (str.charAt(0) - '0') * 40;
                int i2 = 2;
                while (true) {
                    int i3 = i + 1;
                    if (i3 >= str.length()) {
                        C(byteArrayOutputStream, str, i2, i3, charAt2);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        w(byteArray.length);
                        this.I = byteArray;
                        this.J = str;
                        return;
                    }
                    if (str.charAt(i3) == '.') {
                        C(byteArrayOutputStream, str, i2, i3, charAt2);
                        i2 = i + 2;
                        charAt2 = 0;
                        i = i2;
                    } else {
                        i = i3;
                    }
                }
            }
        }
        s83.t(r7.C("string ", str, " not a valid OID"));
        throw null;
    }

    public static String B(byte[] bArr) {
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
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
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
                        sb.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    public static void C(ByteArrayOutputStream byteArrayOutputStream, String str, int i, int i2, int i3) {
        String substring = str.substring(i, i2);
        if (substring.length() <= 18) {
            v0.y(byteArrayOutputStream, Long.parseLong(substring) + i3);
        } else {
            v0.z(byteArrayOutputStream, new BigInteger(substring).add(BigInteger.valueOf(i3)));
        }
    }

    public static void w(int i) {
        if (i <= 4096) {
            return;
        }
        s83.t("exceeded OID contents length limit");
    }

    public static q0 x(byte[] bArr, int i, boolean z) {
        q0 q0Var = (q0) L.get(new p0(bArr, i));
        if (q0Var != null) {
            return q0Var;
        }
        if (!v0.w(i, bArr)) {
            s83.t("invalid OID contents");
            return null;
        }
        if (z) {
            bArr = g4.x(bArr, 0, i);
        }
        return new q0(bArr, null);
    }

    public static q0 z(e0 e0Var) {
        if (e0Var == null || (e0Var instanceof q0)) {
            return (q0) e0Var;
        }
        u0 d = e0Var.d();
        if (d instanceof q0) {
            return (q0) d;
        }
        s83.t("illegal object in getInstance: ".concat(e0Var.getClass().getName()));
        return null;
    }

    public final q0 A() {
        byte[] bArr = this.I;
        p0 p0Var = new p0(bArr, bArr.length);
        ConcurrentHashMap concurrentHashMap = L;
        q0 q0Var = (q0) concurrentHashMap.get(p0Var);
        if (q0Var != null) {
            return q0Var;
        }
        synchronized (concurrentHashMap) {
            try {
                if (concurrentHashMap.containsKey(p0Var)) {
                    this = (q0) concurrentHashMap.get(p0Var);
                } else {
                    concurrentHashMap.put(p0Var, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
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
        if (u0Var instanceof q0) {
            return Arrays.equals(this.I, ((q0) u0Var).I);
        }
        return false;
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 6, z);
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
        return y();
    }

    public final q0 v(String str) {
        String str2;
        int i;
        byte[] bArr;
        y yVar = v0.K;
        if (str.length() > 16383) {
            str2 = "exceeded relative OID contents length limit";
        } else {
            if (v0.x(0, str)) {
                int length = str.length();
                byte[] bArr2 = this.I;
                if (length <= 2) {
                    w(bArr2.length + 1);
                    int charAt = str.charAt(0) - '0';
                    if (str.length() == 2) {
                        charAt = (charAt * 10) + (str.charAt(1) - '0');
                    }
                    int length2 = bArr2.length;
                    bArr = new byte[length2 + 1];
                    System.arraycopy(bArr2, 0, bArr, 0, length2);
                    bArr[length2] = (byte) charAt;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() + 1) / 2);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        i = i2 + 1;
                        if (i >= str.length()) {
                            break;
                        }
                        if (str.charAt(i) == '.') {
                            String substring = str.substring(i3, i);
                            if (substring.length() <= 18) {
                                v0.y(byteArrayOutputStream, Long.parseLong(substring));
                            } else {
                                v0.z(byteArrayOutputStream, new BigInteger(substring));
                            }
                            i3 = i2 + 2;
                            i2 = i3;
                        } else {
                            i2 = i;
                        }
                    }
                    String substring2 = str.substring(i3, i);
                    if (substring2.length() <= 18) {
                        v0.y(byteArrayOutputStream, Long.parseLong(substring2));
                    } else {
                        v0.z(byteArrayOutputStream, new BigInteger(substring2));
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    w(bArr2.length + byteArray.length);
                    bArr = new byte[bArr2.length + byteArray.length];
                    System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
                    System.arraycopy(byteArray, 0, bArr, bArr2.length, byteArray.length);
                }
                return new q0(bArr, r7.C(y(), ".", str));
            }
            str2 = r7.C("string ", str, " not a valid relative OID");
        }
        s83.t(str2);
        return null;
    }

    public final synchronized String y() {
        String str;
        str = this.J;
        if (str == null) {
            str = B(this.I);
            this.J = str;
        }
        return str;
    }

    public q0(byte[] bArr, String str) {
        this.I = bArr;
        this.J = str;
    }
}

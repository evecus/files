package defpackage;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;

/* loaded from: classes2.dex */
public class i0 extends u0 {
    public static final y J = new y(i0.class, (byte) 6);
    public final byte[] I;

    public i0(byte[] bArr) {
        if (bArr.length < 4) {
            s83.t("GeneralizedTime string too short");
            throw null;
        }
        this.I = bArr;
        if (A(0) && A(1) && A(2) && A(3)) {
            return;
        }
        s83.t("illegal characters in GeneralizedTime string");
        throw null;
    }

    public static String B(String str) {
        StringBuilder sb;
        String str2;
        String sb2;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            sb2 = substring.substring(0, 4).concat(substring.substring(i));
        } else {
            if (i2 == 1) {
                sb = new StringBuilder(substring.substring(0, i));
                str2 = "00";
            } else {
                if (i2 != 2) {
                    return str;
                }
                sb = new StringBuilder(substring.substring(0, i));
                str2 = "0";
            }
            sb.append(str2);
            sb.append(substring.substring(i));
            sb2 = sb.toString();
        }
        return str.substring(0, 14).concat(sb2);
    }

    public static String w(int i) {
        return i < 10 ? hf1.u(i, "0") : Integer.toString(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        if ((r1 + 1) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (defpackage.eu5.x0(r1, r5) <= 14) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.i0 x(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10
            if (r0 < r1) goto L88
            r2 = 0
            boolean r2 = defpackage.eu5.K(r5, r2, r1)
            if (r2 == 0) goto L88
            r2 = 4
            boolean r2 = defpackage.eu5.z0(r2, r5)
            if (r2 == 0) goto L88
            boolean r2 = defpackage.eu5.y0(r1, r5)
            r3 = 14
            if (r2 == 0) goto L32
            int r1 = defpackage.eu5.x0(r1, r5)
            r2 = 59
            if (r1 > r2) goto L88
            r1 = 12
            boolean r4 = defpackage.eu5.y0(r1, r5)
            if (r4 == 0) goto L32
            int r1 = defpackage.eu5.x0(r1, r5)
            if (r1 > r2) goto L88
            r1 = r3
        L32:
            if (r1 >= r0) goto L51
            r2 = r5[r1]
            r4 = 46
            if (r2 == r4) goto L3e
            r4 = 44
            if (r2 != r4) goto L51
        L3e:
            int r1 = r1 + 1
            r2 = r1
        L41:
            if (r2 >= r0) goto L4e
            r4 = r5[r2]
            boolean r4 = defpackage.eu5.J(r4)
            if (r4 == 0) goto L4e
            int r2 = r2 + 1
            goto L41
        L4e:
            if (r2 == r1) goto L88
            r1 = r2
        L51:
            if (r1 != r0) goto L54
            goto L82
        L54:
            r2 = r5[r1]
            r4 = 90
            if (r2 != r4) goto L5f
            int r1 = r1 + 1
            if (r1 != r0) goto L88
            goto L82
        L5f:
            boolean r0 = defpackage.eu5.L(r1, r5)
            if (r0 != 0) goto L82
            int r0 = r1 + 3
            int r2 = r5.length
            if (r0 != r2) goto L88
            r0 = r5[r1]
            r2 = 43
            if (r0 == r2) goto L74
            r2 = 45
            if (r0 != r2) goto L88
        L74:
            int r1 = r1 + 1
            boolean r0 = defpackage.eu5.y0(r1, r5)
            if (r0 == 0) goto L88
            int r0 = defpackage.eu5.x0(r1, r5)
            if (r0 > r3) goto L88
        L82:
            i0 r0 = new i0
            r0.<init>(r5)
            return r0
        L88:
            java.lang.String r5 = "invalid GeneralizedTime format"
            defpackage.s83.t(r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0.x(byte[]):i0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i0 y(e0 e0Var) {
        if (e0Var == 0 || (e0Var instanceof i0)) {
            return (i0) e0Var;
        }
        u0 d = e0Var.d();
        if (d instanceof i0) {
            return (i0) d;
        }
        if (!(e0Var instanceof byte[])) {
            s83.t("illegal object in getInstance: ".concat(e0Var.getClass().getName()));
            return null;
        }
        try {
            return (i0) J.g((byte[]) e0Var);
        } catch (Exception e) {
            j0.h(e);
            return null;
        }
    }

    public final boolean A(int i) {
        byte b;
        byte[] bArr = this.I;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (!(u0Var instanceof i0)) {
            return false;
        }
        return Arrays.equals(this.I, ((i0) u0Var).I);
    }

    @Override // defpackage.u0
    public void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 24, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004f, code lost:
    
        if (r7[r0 - 2] != 48) goto L37;
     */
    @Override // defpackage.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.u0 t() {
        /*
            r7 = this;
            java.lang.String r0 = "org.bouncycastle.asn1.allow_non_der_time"
            r1 = 0
            java.lang.String r0 = defpackage.ox3.b(r0)     // Catch: java.security.AccessControlException -> L10
            if (r0 != 0) goto Lb
            r0 = 1
            goto L11
        Lb:
            boolean r0 = defpackage.ox3.d(r0)     // Catch: java.security.AccessControlException -> L10
            goto L11
        L10:
            r0 = r1
        L11:
            byte[] r7 = r7.I
            if (r0 != 0) goto L5a
            int r0 = r7.length
            r2 = 15
            if (r0 < r2) goto L52
            int r3 = r0 + (-1)
            r4 = r7[r3]
            r5 = 90
            if (r4 != r5) goto L52
        L22:
            r4 = 57
            r5 = 14
            r6 = 48
            if (r1 == r5) goto L33
            r5 = r7[r1]
            if (r5 < r6) goto L52
            if (r5 > r4) goto L52
            int r1 = r1 + 1
            goto L22
        L33:
            if (r0 != r2) goto L36
            goto L5a
        L36:
            r1 = r7[r5]
            r5 = 46
            if (r1 != r5) goto L52
            r1 = 17
            if (r0 < r1) goto L52
        L40:
            if (r2 == r3) goto L4b
            r1 = r7[r2]
            if (r1 < r6) goto L52
            if (r1 > r4) goto L52
            int r2 = r2 + 1
            goto L40
        L4b:
            int r0 = r0 + (-2)
            r0 = r7[r0]
            if (r0 == r6) goto L52
            goto L5a
        L52:
            en0 r7 = new en0
            java.lang.String r0 = "cannot emit GeneralizedTime as DER: not in DER format (see Properties.ASN1_ALLOW_NON_DER_TIME)"
            r7.<init>(r0)
            throw r7
        L5a:
            hn0 r0 = new hn0
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0.t():u0");
    }

    public final SimpleDateFormat v() {
        SimpleDateFormat simpleDateFormat = z() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz", yq2.a) : (A(12) && A(13)) ? new SimpleDateFormat("yyyyMMddHHmmssz", yq2.a) : (A(10) && A(11)) ? new SimpleDateFormat("yyyyMMddHHmmz", yq2.a) : new SimpleDateFormat("yyyyMMddHHz", yq2.a);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    public final boolean z() {
        int i = 0;
        while (true) {
            byte[] bArr = this.I;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }
}

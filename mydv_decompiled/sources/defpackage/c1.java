package defpackage;

import java.security.AccessControlException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c1 extends u0 {
    public static final y J = new y(c1.class, (byte) 20);
    public final byte[] I;

    public c1(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length < 2) {
            s83.t("UTCTime string too short");
            throw null;
        }
        this.I = bArr;
        if (bArr.length <= 0 || (b = bArr[0]) < 48 || b > 57 || bArr.length <= 1 || (b2 = bArr[1]) < 48 || b2 > 57) {
            s83.t("illegal characters in UTCTime string");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        if (defpackage.eu5.L(12, r13) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0056, code lost:
    
        if (r13[12] == 90) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005b, code lost:
    
        if (r13[10] == 90) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c1 v(byte[] r13) {
        /*
            int r0 = r13.length
            r1 = 59
            r2 = 8
            r3 = 2
            r4 = 12
            r5 = 17
            r6 = 15
            r7 = 13
            r8 = 10
            r9 = 0
            r10 = 11
            if (r0 == r10) goto L1d
            if (r0 == r7) goto L1d
            if (r0 == r6) goto L1d
            if (r0 == r5) goto L1d
        L1b:
            r12 = r9
            goto L5d
        L1d:
            boolean r11 = defpackage.eu5.K(r13, r9, r8)
            if (r11 == 0) goto L1b
            boolean r11 = defpackage.eu5.z0(r3, r13)
            if (r11 == 0) goto L1b
            int r11 = defpackage.eu5.x0(r2, r13)
            if (r11 <= r1) goto L30
            goto L1b
        L30:
            r11 = 90
            r12 = 1
            if (r0 == r10) goto L59
            if (r0 == r7) goto L4e
            if (r0 == r6) goto L49
            if (r0 == r5) goto L3c
            goto L1b
        L3c:
            boolean r0 = defpackage.eu5.A0(r13)
            if (r0 == 0) goto L1b
            boolean r0 = defpackage.eu5.L(r4, r13)
            if (r0 == 0) goto L1b
            goto L5d
        L49:
            boolean r12 = defpackage.eu5.L(r8, r13)
            goto L5d
        L4e:
            boolean r0 = defpackage.eu5.A0(r13)
            if (r0 == 0) goto L1b
            r0 = r13[r4]
            if (r0 != r11) goto L1b
            goto L5d
        L59:
            r0 = r13[r8]
            if (r0 != r11) goto L1b
        L5d:
            if (r12 != 0) goto L8a
            int r0 = r13.length
            if (r0 != r4) goto L83
            boolean r0 = defpackage.eu5.K(r13, r9, r8)
            if (r0 == 0) goto L83
            boolean r0 = defpackage.eu5.z0(r3, r13)
            if (r0 == 0) goto L83
            int r0 = defpackage.eu5.x0(r2, r13)
            if (r0 > r1) goto L83
            boolean r0 = defpackage.eu5.A0(r13)
            if (r0 == 0) goto L83
            java.lang.String r0 = "org.bouncycastle.asn1.allow_zoneless_utctime"
            boolean r0 = defpackage.ox3.c(r0)
            if (r0 == 0) goto L83
            goto L8a
        L83:
            java.lang.String r13 = "invalid UTCTime format"
            defpackage.s83.t(r13)
            r13 = 0
            return r13
        L8a:
            c1 r0 = new c1
            r0.<init>(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1.v(byte[]):c1");
    }

    @Override // defpackage.u0, defpackage.n0
    public final int hashCode() {
        return g4.N(this.I);
    }

    @Override // defpackage.u0
    public final boolean m(u0 u0Var) {
        if (!(u0Var instanceof c1)) {
            return false;
        }
        return Arrays.equals(this.I, ((c1) u0Var).I);
    }

    @Override // defpackage.u0
    public final void n(uu2 uu2Var, boolean z) {
        uu2Var.P(this.I, 23, z);
    }

    @Override // defpackage.u0
    public final boolean o() {
        return false;
    }

    @Override // defpackage.u0
    public final int q(boolean z) {
        return uu2.z(this.I.length, z);
    }

    @Override // defpackage.u0
    public final u0 t() {
        boolean z;
        int i;
        try {
            String b = ox3.b("org.bouncycastle.asn1.allow_non_der_time");
            z = b == null ? true : ox3.d(b);
        } catch (AccessControlException unused) {
            z = false;
        }
        if (!z) {
            byte[] bArr = this.I;
            if (bArr.length == 13 && bArr[12] == 90) {
                while (i != 12) {
                    byte b2 = bArr[i];
                    i = (b2 >= 48 && b2 <= 57) ? i + 1 : 0;
                }
            }
            throw new en0("cannot emit UTCTime as DER: not in DER format (see Properties.ASN1_ALLOW_NON_DER_TIME)");
        }
        return this;
    }

    public final String toString() {
        return ix4.a(this.I);
    }
}

package okhttp3.internal;

import defpackage.cz;
import defpackage.dq;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jx4;
import defpackage.qx4;
import defpackage.s83;
import defpackage.u22;
import defpackage.ut0;
import defpackage.v24;
import okhttp3.internal.idn.IdnaMappingTableInstanceKt;
import okhttp3.internal.idn.Punycode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class _HostnamesCommonKt {
    private static final v24 VERIFY_AS_IP_ADDRESS = new v24("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static final boolean canParseAsIpAddress(String str) {
        str.getClass();
        return VERIFY_AS_IP_ADDRESS.e(str);
    }

    public static final byte[] canonicalizeInetAddress(byte[] bArr) {
        bArr.getClass();
        if (!isMappedIpv4Address(bArr)) {
            return bArr;
        }
        u22 c0 = ut0.c0(12, 16);
        c0.getClass();
        return c0.isEmpty() ? new byte[0] : dq.V0(bArr, c0.I, c0.J + 1);
    }

    public static final boolean containsInvalidHostnameAsciiCodes(String str) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (j42.m(charAt, 31) <= 0 || j42.m(charAt, 127) >= 0 || jx4.I(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean containsInvalidLabelLengths(String str) {
        str.getClass();
        int length = str.length();
        if (1 <= length && length < 254) {
            int i = 0;
            while (true) {
                int I = jx4.I(str, '.', i, 4);
                int length2 = I == -1 ? str.length() - i : I - i;
                if (1 > length2 || length2 >= 64) {
                    break;
                }
                if (I == -1 || I == str.length() - 1) {
                    break;
                }
                i = I + 1;
            }
            return false;
        }
        return true;
    }

    public static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        str.getClass();
        bArr.getClass();
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (j42.m(charAt, 48) < 0 || j42.m(charAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] decodeIpv6(java.lang.String r10, int r11, int r12) {
        /*
            r10.getClass()
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        Lc:
            if (r11 >= r12) goto L79
            if (r4 != r0) goto L12
            goto L7d
        L12:
            int r7 = r11 + 2
            if (r7 > r12) goto L2a
            java.lang.String r8 = "::"
            boolean r8 = defpackage.qx4.z(r2, r10, r11, r8)
            if (r8 == 0) goto L2a
            if (r5 == r3) goto L22
            goto L7d
        L22:
            int r4 = r4 + 2
            r5 = r4
            if (r7 != r12) goto L28
            goto L79
        L28:
            r6 = r7
            goto L4c
        L2a:
            if (r4 == 0) goto L36
            java.lang.String r7 = ":"
            boolean r7 = defpackage.qx4.z(r2, r10, r11, r7)
            if (r7 == 0) goto L38
            int r11 = r11 + 1
        L36:
            r6 = r11
            goto L4c
        L38:
            java.lang.String r7 = "."
            boolean r11 = defpackage.qx4.z(r2, r10, r11, r7)
            if (r11 == 0) goto L7d
            int r11 = r4 + (-2)
            boolean r10 = decodeIpv4Suffix(r10, r6, r12, r1, r11)
            if (r10 != 0) goto L49
            goto L7d
        L49:
            int r4 = r4 + 2
            goto L79
        L4c:
            r7 = r2
            r11 = r6
        L4e:
            if (r11 >= r12) goto L60
            char r8 = r10.charAt(r11)
            int r8 = okhttp3.internal._UtilCommonKt.parseHexDigit(r8)
            if (r8 == r3) goto L60
            int r7 = r7 << 4
            int r7 = r7 + r8
            int r11 = r11 + 1
            goto L4e
        L60:
            int r8 = r11 - r6
            if (r8 == 0) goto L7d
            r9 = 4
            if (r8 <= r9) goto L68
            goto L7d
        L68:
            int r8 = r4 + 1
            int r9 = r7 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r8] = r7
            goto Lc
        L79:
            if (r4 == r0) goto L8b
            if (r5 != r3) goto L7f
        L7d:
            r10 = 0
            return r10
        L7f:
            int r10 = r4 - r5
            int r10 = 16 - r10
            defpackage.dq.R0(r1, r10, r5, r1, r4)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal._HostnamesCommonKt.decodeIpv6(java.lang.String, int, int):byte[]");
    }

    public static final String idnToAscii(String str) {
        str.getClass();
        cz czVar = new cz();
        czVar.k0(str);
        cz czVar2 = new cz();
        while (!czVar.p()) {
            if (!IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE().map(czVar.R(), czVar2)) {
                return null;
            }
        }
        czVar.k0(_NormalizeJvmKt.normalizeNfc(czVar2.Q()));
        Punycode punycode = Punycode.INSTANCE;
        String decode = punycode.decode(czVar.Q());
        if (decode != null && decode.equals(_NormalizeJvmKt.normalizeNfc(decode))) {
            return punycode.encode(decode);
        }
        return null;
    }

    public static final String inet4AddressToAscii(byte[] bArr) {
        bArr.getClass();
        if (bArr.length != 4) {
            s83.t("Failed requirement.");
            return null;
        }
        cz czVar = new cz();
        czVar.e0(_UtilCommonKt.and(bArr[0], 255));
        czVar.d0(46);
        czVar.e0(_UtilCommonKt.and(bArr[1], 255));
        czVar.d0(46);
        czVar.e0(_UtilCommonKt.and(bArr[2], 255));
        czVar.d0(46);
        czVar.e0(_UtilCommonKt.and(bArr[3], 255));
        return czVar.Q();
    }

    public static final String inet6AddressToAscii(byte[] bArr) {
        bArr.getClass();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        cz czVar = new cz();
        while (i2 < bArr.length) {
            if (i2 == i) {
                czVar.d0(58);
                i2 += i4;
                if (i2 == 16) {
                    czVar.d0(58);
                }
            } else {
                if (i2 > 0) {
                    czVar.d0(58);
                }
                czVar.f0((_UtilCommonKt.and(bArr[i2], 255) << 8) | _UtilCommonKt.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return czVar.Q();
    }

    private static final boolean isMappedIpv4Address(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    public static final String toCanonicalHost(String str) {
        str.getClass();
        if (jx4.D(str, ":", false)) {
            byte[] decodeIpv6 = (qx4.y(str, "[", false) && qx4.s(str, "]", false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (decodeIpv6 != null) {
                byte[] canonicalizeInetAddress = canonicalizeInetAddress(decodeIpv6);
                if (canonicalizeInetAddress.length == 16) {
                    return inet6AddressToAscii(canonicalizeInetAddress);
                }
                if (canonicalizeInetAddress.length == 4) {
                    return inet4AddressToAscii(canonicalizeInetAddress);
                }
                throw new AssertionError(hf1.t('\'', "Invalid IPv6 address: '", str));
            }
        } else {
            String idnToAscii = idnToAscii(str);
            if (idnToAscii != null && idnToAscii.length() != 0 && !containsInvalidHostnameAsciiCodes(idnToAscii) && !containsInvalidLabelLengths(idnToAscii)) {
                return idnToAscii;
            }
        }
        return null;
    }
}

package okhttp3.internal.url;

import defpackage.cz;
import defpackage.jx4;
import defpackage.z50;
import java.nio.charset.Charset;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class _UrlKt {
    public static final String FORM_ENCODE_SET = " !\"#$&'()+,/:;<=>?@[\\]^`{|}~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    public static final String canonicalize(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        str2.getClass();
        return canonicalizeWithCharset$default(str, i, i2, str2, z, z2, z3, z4, null, 128, null);
    }

    public static /* synthetic */ String canonicalize$default(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            z3 = false;
        }
        if ((i3 & 64) != 0) {
            z4 = false;
        }
        return canonicalize(str, i, i2, str2, z, z2, z3, z4);
    }

    public static final String canonicalizeWithCharset(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        str.getClass();
        str2.getClass();
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || jx4.E(str2, (char) codePointAt) || ((codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i3, i2)))) || (codePointAt == 43 && z3)))) {
                cz czVar = new cz();
                czVar.j0(i, i3, str);
                writeCanonicalized(czVar, str, i3, i2, str2, z, z2, z3, z4, charset);
                return czVar.Q();
            }
            i3 += Character.charCount(codePointAt);
        }
        return str.substring(i, i2);
    }

    public static /* synthetic */ String canonicalizeWithCharset$default(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            z3 = false;
        }
        if ((i3 & 64) != 0) {
            z4 = false;
        }
        if ((i3 & 128) != 0) {
            charset = null;
        }
        return canonicalizeWithCharset(str, i, i2, str2, z, z2, z3, z4, charset);
    }

    public static final char[] getHEX_DIGITS() {
        return HEX_DIGITS;
    }

    public static final boolean isPercentEncoded(String str, int i, int i2) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.parseHexDigit(str.charAt(i + 1)) != -1 && _UtilCommonKt.parseHexDigit(str.charAt(i3)) != -1;
    }

    public static final String percentDecode(String str, int i, int i2, boolean z) {
        str.getClass();
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                cz czVar = new cz();
                czVar.j0(i, i3, str);
                writePercentDecoded(czVar, str, i3, i2, z);
                return czVar.Q();
            }
        }
        return str.substring(i, i2);
    }

    public static /* synthetic */ String percentDecode$default(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return percentDecode(str, i, i2, z);
    }

    public static final void writeCanonicalized(cz czVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        czVar.getClass();
        str.getClass();
        str2.getClass();
        cz czVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 32 && str2 == FORM_ENCODE_SET) {
                    czVar.k0("+");
                } else if (codePointAt == 43 && z3) {
                    czVar.k0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z4) || jx4.E(str2, (char) codePointAt) || (codePointAt == 37 && (!z || (z2 && !isPercentEncoded(str, i, i2)))))) {
                    if (czVar2 == null) {
                        czVar2 = new cz();
                    }
                    if (charset == null || charset.equals(z50.a)) {
                        czVar2.l0(codePointAt);
                    } else {
                        czVar2.i0(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!czVar2.p()) {
                        byte readByte = czVar2.readByte();
                        czVar.d0(37);
                        char[] cArr = HEX_DIGITS;
                        czVar.d0(cArr[((readByte & 255) >> 4) & 15]);
                        czVar.d0(cArr[readByte & 15]);
                    }
                } else {
                    czVar.l0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static final void writePercentDecoded(cz czVar, String str, int i, int i2, boolean z) {
        int i3;
        czVar.getClass();
        str.getClass();
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt != 37 || (i3 = i + 2) >= i2) {
                if (codePointAt == 43 && z) {
                    czVar.d0(32);
                    i++;
                }
                czVar.l0(codePointAt);
                i += Character.charCount(codePointAt);
            } else {
                int parseHexDigit = _UtilCommonKt.parseHexDigit(str.charAt(i + 1));
                int parseHexDigit2 = _UtilCommonKt.parseHexDigit(str.charAt(i3));
                if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                    czVar.d0((parseHexDigit << 4) + parseHexDigit2);
                    i = Character.charCount(codePointAt) + i3;
                }
                czVar.l0(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }
    }
}

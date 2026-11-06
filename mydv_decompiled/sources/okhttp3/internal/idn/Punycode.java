package okhttp3.internal.idn;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import defpackage.cz;
import defpackage.h00;
import defpackage.jp;
import defpackage.jx4;
import defpackage.qx4;
import defpackage.s22;
import defpackage.ut0;
import defpackage.zy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;
    private static final h00 PREFIX;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;
    public static final Punycode INSTANCE = new Punycode();
    private static final String PREFIX_STRING = "xn--";

    static {
        h00 h00Var = h00.L;
        PREFIX = jp.h("xn--");
    }

    private Punycode() {
    }

    private final int adapt(int i, int i2, boolean z) {
        int i3 = z ? i / DAMP : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [char] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    private final List<Integer> codePoints(String str, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            int charAt = str.charAt(i);
            if (55296 <= charAt && charAt < 57344) {
                int i3 = i + 1;
                char charAt2 = i3 < i2 ? str.charAt(i3) : (char) 0;
                if (Character.isLowSurrogate(charAt) || !Character.isLowSurrogate(charAt2)) {
                    charAt = 63;
                } else {
                    charAt = 65536 + (((charAt & AnalyticsListener.EVENT_DRM_KEYS_LOADED) << 10) | (charAt2 & 1023));
                    i = i3;
                }
            }
            arrayList.add(Integer.valueOf(charAt));
            i++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean decodeLabel(String str, int i, int i2, cz czVar) {
        int i3;
        int i4;
        int i5 = 1;
        if (!qx4.v(i, 0, 4, str, PREFIX_STRING, true)) {
            czVar.j0(i, i2, str);
            return true;
        }
        int i6 = i + 4;
        ArrayList arrayList = new ArrayList();
        int M = jx4.M(str, '-', i2, 4);
        char c = '0';
        char c2 = '[';
        char c3 = '{';
        if (M >= i6) {
            while (i6 < M) {
                int i7 = i6 + 1;
                char charAt = str.charAt(i6);
                if (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && (('0' > charAt || charAt >= ':') && charAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(charAt));
                i6 = i7;
            }
            i6++;
        }
        int i8 = 128;
        int i9 = INITIAL_BIAS;
        int i10 = 0;
        while (i6 < i2) {
            int i11 = i5;
            s22 Z = ut0.Z(ut0.c0(36, Log.LOG_LEVEL_OFF), 36);
            int i12 = Z.I;
            int i13 = Z.J;
            int i14 = Z.K;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                i3 = i10;
                int i15 = i11;
                while (i6 != i2) {
                    int i16 = i6 + 1;
                    char charAt2 = str.charAt(i6);
                    if ('a' <= charAt2 && charAt2 < c3) {
                        i4 = charAt2 - 'a';
                    } else if ('A' <= charAt2 && charAt2 < c2) {
                        i4 = charAt2 - 'A';
                    } else {
                        if (c > charAt2 || charAt2 >= ':') {
                            return false;
                        }
                        i4 = charAt2 - 22;
                    }
                    int i17 = i15;
                    int i18 = i4 * i17;
                    int i19 = i3;
                    if (i19 > Log.LOG_LEVEL_OFF - i18) {
                        return false;
                    }
                    i3 = i19 + i18;
                    int i20 = i12 <= i9 ? i11 : i12 >= i9 + 26 ? 26 : i12 - i9;
                    if (i4 >= i20) {
                        int i21 = 36 - i20;
                        if (i17 > Log.LOG_LEVEL_OFF / i21) {
                            return false;
                        }
                        i15 = i17 * i21;
                        if (i12 != i13) {
                            i12 += i14;
                            i6 = i16;
                            c = '0';
                            c2 = '[';
                            c3 = '{';
                        }
                    }
                    i6 = i16;
                }
                return false;
            }
            i3 = i10;
            i9 = adapt(i3 - i10, arrayList.size() + 1, i10 == 0 ? i11 : false);
            int size = i3 / (arrayList.size() + 1);
            if (i8 > Log.LOG_LEVEL_OFF - size) {
                return false;
            }
            i8 += size;
            int size2 = i3 % (arrayList.size() + 1);
            if (i8 > 1114111) {
                return false;
            }
            arrayList.add(size2, Integer.valueOf(i8));
            i10 = size2 + 1;
            i5 = i11;
            c = '0';
            c2 = '[';
            c3 = '{';
        }
        boolean z = i5;
        int size3 = arrayList.size();
        int i22 = 0;
        while (i22 < size3) {
            Object obj = arrayList.get(i22);
            i22++;
            czVar.l0(((Number) obj).intValue());
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean encodeLabel(String str, int i, int i2, cz czVar) {
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        if (!requiresEncode(str, i, i2)) {
            czVar.j0(i, i2, str);
            return true;
        }
        czVar.c0(PREFIX);
        List<Integer> codePoints = codePoints(str, i, i2);
        Iterator<Integer> it = codePoints.iterator();
        int i7 = 0;
        while (true) {
            i3 = 128;
            if (!it.hasNext()) {
                break;
            }
            int intValue = it.next().intValue();
            if (intValue < 128) {
                czVar.d0(intValue);
                i7++;
            }
        }
        if (i7 > 0) {
            czVar.d0(45);
        }
        int i8 = INITIAL_BIAS;
        int i9 = 0;
        int i10 = i7;
        while (i10 < codePoints.size()) {
            Iterator<T> it2 = codePoints.iterator();
            if (!it2.hasNext()) {
                zy.k();
                return false;
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int intValue2 = ((Number) next).intValue();
                if (intValue2 < i3) {
                    intValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int intValue3 = ((Number) next2).intValue();
                    if (intValue3 < i3) {
                        intValue3 = Integer.MAX_VALUE;
                    }
                    if (intValue2 > intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it2.hasNext());
            }
            int intValue4 = ((Number) next).intValue();
            int i11 = (i10 + 1) * (intValue4 - i3);
            if (i9 <= Log.LOG_LEVEL_OFF - i11) {
                int i12 = i9 + i11;
                Iterator<Integer> it3 = codePoints.iterator();
                while (it3.hasNext()) {
                    int intValue5 = it3.next().intValue();
                    if (intValue5 < intValue4) {
                        if (i12 != Integer.MAX_VALUE) {
                            i12++;
                        }
                    } else if (intValue5 == intValue4) {
                        s22 Z = ut0.Z(ut0.c0(36, Log.LOG_LEVEL_OFF), 36);
                        int i13 = Z.I;
                        int i14 = Z.J;
                        int i15 = Z.K;
                        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                            i5 = i12;
                            while (true) {
                                if (i13 <= i8) {
                                    i4 = i6;
                                } else {
                                    i4 = i6;
                                    i6 = i13 >= i8 + 26 ? 26 : i13 - i8;
                                }
                                if (i5 < i6) {
                                    break;
                                }
                                int i16 = i5 - i6;
                                int i17 = 36 - i6;
                                czVar.d0(getPunycodeDigit((i16 % i17) + i6));
                                i5 = i16 / i17;
                                if (i13 == i14) {
                                    break;
                                }
                                i13 += i15;
                                i6 = i4;
                            }
                        } else {
                            i4 = i6;
                            i5 = i12;
                        }
                        czVar.d0(getPunycodeDigit(i5));
                        int i18 = i10 + 1;
                        i8 = adapt(i12, i18, i10 == i7 ? i4 : false);
                        i10 = i18;
                        i12 = 0;
                        i6 = i4;
                    }
                }
                i9 = i12 + 1;
                i3 = intValue4 + 1;
            }
            return false;
        }
        return i6;
    }

    private final int getPunycodeDigit(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }

    private final boolean requiresEncode(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) >= 128) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final String decode(String str) {
        int I;
        str.getClass();
        int length = str.length();
        cz czVar = new cz();
        for (int i = 0; i < length; i = I + 1) {
            I = jx4.I(str, '.', i, 4);
            if (I == -1) {
                I = length;
            }
            if (!decodeLabel(str, i, I, czVar)) {
                return null;
            }
            if (I >= length) {
                break;
            }
            czVar.d0(46);
        }
        return czVar.Q();
    }

    public final String encode(String str) {
        int I;
        str.getClass();
        int length = str.length();
        cz czVar = new cz();
        for (int i = 0; i < length; i = I + 1) {
            I = jx4.I(str, '.', i, 4);
            if (I == -1) {
                I = length;
            }
            if (!encodeLabel(str, i, I, czVar)) {
                return null;
            }
            if (I >= length) {
                break;
            }
            czVar.d0(46);
        }
        return czVar.Q();
    }

    public final h00 getPREFIX() {
        return PREFIX;
    }

    public final String getPREFIX_STRING() {
        return PREFIX_STRING;
    }
}

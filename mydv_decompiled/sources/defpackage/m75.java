package defpackage;

import java.text.ParseException;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class m75 extends n0 implements d0 {
    public final u0 I;

    public m75(u0 u0Var) {
        if ((u0Var instanceof c1) || (u0Var instanceof i0)) {
            this.I = u0Var;
        } else {
            s83.t("unknown object passed to Time");
            throw null;
        }
    }

    public static m75 m(e0 e0Var) {
        if (e0Var == null || (e0Var instanceof m75)) {
            return (m75) e0Var;
        }
        if (e0Var instanceof c1) {
            return new m75((c1) e0Var);
        }
        if (e0Var instanceof i0) {
            return new m75((i0) e0Var);
        }
        s83.t("unknown object in factory: ".concat(e0Var.getClass().getName()));
        return null;
    }

    @Override // defpackage.e0
    public final u0 d() {
        return this.I;
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        String substring;
        String sb2;
        u0 u0Var = this.I;
        if (u0Var instanceof c1) {
            String a = ix4.a(((c1) u0Var).I);
            if (a.indexOf(45) >= 0 || a.indexOf(43) >= 0) {
                int indexOf = a.indexOf(45);
                if (indexOf < 0) {
                    indexOf = a.indexOf(43);
                }
                if (indexOf == a.length() - 3) {
                    a = a.concat("00");
                }
                if (indexOf == 10) {
                    sb = new StringBuilder(a.substring(0, 10));
                    sb.append("00GMT");
                    sb.append(a.substring(10, 13));
                    sb.append(":");
                    substring = a.substring(13, 15);
                } else {
                    sb = new StringBuilder(a.substring(0, 12));
                    sb.append("GMT");
                    sb.append(a.substring(12, 15));
                    sb.append(":");
                    substring = a.substring(15, 17);
                }
                sb.append(substring);
                sb2 = sb.toString();
            } else {
                sb2 = a.length() == 11 ? a.substring(0, 10).concat("00GMT+00:00") : a.substring(0, 12).concat("GMT+00:00");
            }
            return sb2.charAt(0) < '5' ? "20".concat(sb2) : "19".concat(sb2);
        }
        i0 i0Var = (i0) u0Var;
        String a2 = ix4.a(i0Var.I);
        if (a2.charAt(a2.length() - 1) == 'Z') {
            return a2.substring(0, a2.length() - 1).concat("GMT+00:00");
        }
        int length = a2.length();
        char charAt = a2.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && a2.indexOf("GMT") == length - 9) {
            return a2;
        }
        int length2 = a2.length();
        int i = length2 - 5;
        char charAt2 = a2.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb3 = new StringBuilder(a2.substring(0, i));
            sb3.append("GMT");
            int i2 = length2 - 2;
            sb3.append(a2.substring(i, i2));
            sb3.append(":");
            sb3.append(a2.substring(i2));
            return sb3.toString();
        }
        int length3 = a2.length() - 3;
        char charAt3 = a2.charAt(length3);
        if (charAt3 == '-' || charAt3 == '+') {
            return a2.substring(0, length3) + "GMT" + a2.substring(length3) + ":00";
        }
        StringBuilder sb4 = new StringBuilder(a2);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (3600000 * i3)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (i0Var.z()) {
                    a2 = i0.B(a2);
                }
                if (timeZone.inDaylightTime(i0Var.v().parse(a2 + "GMT" + str + i0.w(i3) + ":" + i0.w(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        sb4.append("GMT" + str + i0.w(i3) + ":" + i0.w(i4));
        return sb4.toString();
    }
}

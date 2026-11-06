package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jx4 extends qx4 {
    public static ArrayList C(String str) {
        ol4 ol4Var = new ol4((byte) 17);
        hc4.j(64, 64);
        int length = str.length();
        int i = 0;
        ArrayList arrayList = new ArrayList((length / 64) + (length % 64 == 0 ? 0 : 1));
        while (i >= 0 && i < length) {
            int i2 = i + 64;
            arrayList.add(ol4Var.invoke(str.subSequence(i, (i2 < 0 || i2 > length) ? length : i2)));
            i = i2;
        }
        return arrayList;
    }

    public static boolean D(CharSequence charSequence, String str, boolean z) {
        charSequence.getClass();
        str.getClass();
        return J(charSequence, str, 0, z, 2) >= 0;
    }

    public static boolean E(CharSequence charSequence, char c) {
        charSequence.getClass();
        return I(charSequence, c, 0, 2) >= 0;
    }

    public static String F(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            length = 0;
        }
        return f0(length, str);
    }

    public static boolean G(CharSequence charSequence, String str) {
        return charSequence instanceof String ? qx4.s((String) charSequence, str, false) : R(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static final int H(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        u22 u22Var = new u22(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = u22Var.K;
        int i3 = u22Var.J;
        int i4 = u22Var.I;
        if (!z2 || !(str instanceof String)) {
            boolean z3 = z;
            if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
                while (true) {
                    CharSequence charSequence2 = charSequence;
                    boolean z4 = z3;
                    int i5 = i4;
                    if (!R(str, 0, charSequence2, i5, str.length(), z4)) {
                        if (i5 == i3) {
                            break;
                        }
                        i4 = i5 + i2;
                        charSequence = charSequence2;
                        z3 = z4;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i2 > 0 && i4 <= i3) || (i2 < 0 && i3 <= i4)) {
            int i6 = i4;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (!qx4.v(0, i6, str.length(), str2, (String) charSequence, z5)) {
                    if (i6 == i3) {
                        break;
                    }
                    i6 += i2;
                    str = str2;
                    z = z5;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int I(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? K(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return H(charSequence, str, i, z);
    }

    public static final int K(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(dq.l1(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (o7.q(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean L(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!o7.H(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int M(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            charSequence.getClass();
            i = charSequence.length() - 1;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(dq.l1(cArr), i);
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (o7.q(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int N(String str, int i, String str2) {
        int i2;
        if ((i & 2) != 0) {
            str.getClass();
            i2 = str.length() - 1;
        } else {
            i2 = 0;
        }
        str.getClass();
        str2.getClass();
        return str.lastIndexOf(str2, i2);
    }

    public static List O(CharSequence charSequence) {
        bk2 bk2Var = new bk2(charSequence);
        if (!bk2Var.hasNext()) {
            return o91.I;
        }
        Object next = bk2Var.next();
        if (!bk2Var.hasNext()) {
            return p70.j0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (bk2Var.hasNext()) {
            arrayList.add(bk2Var.next());
        }
        return arrayList;
    }

    public static String P(int i, String str) {
        CharSequence charSequence;
        str.getClass();
        if (i < 0) {
            s83.t(r7.z("Desired length ", i, " is less than zero."));
            return null;
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static char Q(String str) {
        b4 b4Var = f04.I;
        if (str.length() != 0) {
            return str.charAt(f04.I.h(str.length()));
        }
        s83.l("Char sequence is empty.");
        return (char) 0;
    }

    public static final boolean R(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!o7.q(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String S(String str, String str2) {
        str.getClass();
        return qx4.y(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String T(String str, String str2) {
        str.getClass();
        return G(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static String U(String str) {
        str.getClass();
        return (str.length() >= 2 && qx4.y(str, "\"", false) && G(str, "\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static final void V(int i) {
        if (i >= 0) {
            return;
        }
        s83.h(hf1.u(i, "Limit must be non-negative, but was "));
    }

    public static final List W(CharSequence charSequence, String str, int i) {
        V(i);
        int H = H(charSequence, str, 0, false);
        if (H == -1 || i == 1) {
            return p70.j0(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        do {
            arrayList.add(charSequence.subSequence(i3, H).toString());
            i3 = str.length() + H;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            H = H(charSequence, str, i3, false);
        } while (H != -1);
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public static List X(CharSequence charSequence, String[] strArr, int i) {
        byte b = 2;
        byte b2 = 0;
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return W(charSequence, str, i2);
            }
        }
        V(i2);
        List asList = Arrays.asList(strArr);
        asList.getClass();
        sj4 sj4Var = new sj4(new gu0(charSequence, i2, new ka2(asList, b)), b2);
        ArrayList arrayList = new ArrayList(p70.J(sj4Var, 10));
        Iterator it = sj4Var.iterator();
        while (true) {
            fu0 fu0Var = (fu0) it;
            if (!fu0Var.hasNext()) {
                return arrayList;
            }
            u22 u22Var = (u22) fu0Var.next();
            u22Var.getClass();
            arrayList.add(charSequence.subSequence(u22Var.I, u22Var.J + 1).toString());
        }
    }

    public static List Y(String str, char[] cArr) {
        str.getClass();
        byte b = 0;
        if (cArr.length == 1) {
            return W(str, String.valueOf(cArr[0]), 0);
        }
        V(0);
        sj4 sj4Var = new sj4(new gu0(str, 0, new rd(cArr, (byte) 16)), b);
        ArrayList arrayList = new ArrayList(p70.J(sj4Var, 10));
        Iterator it = sj4Var.iterator();
        while (true) {
            fu0 fu0Var = (fu0) it;
            if (!fu0Var.hasNext()) {
                return arrayList;
            }
            u22 u22Var = (u22) fu0Var.next();
            u22Var.getClass();
            arrayList.add(str.subSequence(u22Var.I, u22Var.J + 1).toString());
        }
    }

    public static String Z(char c, String str, String str2) {
        str.getClass();
        int I = I(str, c, 0, 6);
        return I == -1 ? str2 : str.substring(I + 1, str.length());
    }

    public static String a0(String str, String str2) {
        int J = J(str, str2, 0, false, 6);
        return J == -1 ? str : str.substring(str2.length() + J, str.length());
    }

    public static String b0(char c, String str, String str2) {
        int M = M(str, c, 0, 6);
        return M == -1 ? str2 : str.substring(M + 1, str.length());
    }

    public static String c0(String str, char c) {
        str.getClass();
        str.getClass();
        int I = I(str, c, 0, 6);
        return I == -1 ? str : str.substring(0, I);
    }

    public static String d0(String str, char c) {
        str.getClass();
        str.getClass();
        int M = M(str, c, 0, 6);
        return M == -1 ? str : str.substring(0, M);
    }

    public static CharSequence e0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            s83.h(r7.z("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String f0(int i, String str) {
        str.getClass();
        if (i < 0) {
            s83.h(r7.z("Requested character count ", i, " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence g0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean H = o7.H(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!H) {
                    break;
                }
                length--;
            } else if (H) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String h0(String str, char... cArr) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = str.charAt(!z ? i : length);
            int length2 = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    i2 = -1;
                    break;
                }
                if (charAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class kx4 extends qi4 {
    public static String o(String str, String str2) {
        return qj4.y(new ep1(new fq(str, (byte) 2), new pu0(str2, (byte) 7)), "\n");
    }

    public static String p(String str) {
        List O = jx4.O(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : O) {
            if (!jx4.L((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p70.J(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!o7.H(str2.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
        Integer num = (Integer) o70.d1(arrayList2);
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        O.size();
        ol4 ol4Var = new ol4((byte) 16);
        int size2 = O.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = O.iterator();
        while (true) {
            String str3 = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length2);
                o70.Y0(arrayList3, sb, null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            String str4 = (String) next;
            if ((i != 0 && i != size2) || !jx4.L(str4)) {
                str4.getClass();
                if (intValue < 0) {
                    s83.h(r7.z("Requested character count ", intValue, " is less than zero."));
                    return null;
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str3 = (String) ol4Var.invoke(str4.substring(length3));
                if (str3 == null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i4;
        }
    }

    public static String q(String str) {
        String str2;
        if (jx4.L("|")) {
            s83.t("marginPrefix must be non-blank string.");
            return null;
        }
        List O = jx4.O(str);
        int length = str.length();
        O.size();
        ol4 ol4Var = new ol4((byte) 16);
        int size = O.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : O) {
            int i2 = i + 1;
            if (i < 0) {
                p70.A0();
                throw null;
            }
            String str3 = (String) obj;
            if ((i == 0 || i == size) && jx4.L(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!o7.H(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && qx4.z(false, str3, i3, "|")) ? str3.substring("|".length() + i3) : null;
                if (substring != null && (str2 = (String) ol4Var.invoke(substring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        o70.Y0(arrayList, sb, null, 124);
        return sb.toString();
    }
}

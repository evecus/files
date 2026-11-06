package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ox3 {
    public static final ThreadLocal a = new ThreadLocal();

    public static int a(int i, String str) {
        String b = b(str);
        return b != null ? Integer.parseInt(b) : i;
    }

    public static String b(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new nx3(str, (byte) 0));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new nx3(str, (byte) 1)) : str2;
    }

    public static boolean c(String str) {
        try {
            return d(b(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean d(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
    }
}

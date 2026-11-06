package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class zw0 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        q0 q0Var = u53.a;
        hashMap.put("SHA-256", q0Var);
        q0 q0Var2 = u53.b;
        hashMap.put("SHA-512", q0Var2);
        q0 q0Var3 = u53.c;
        hashMap.put("SHAKE128", q0Var3);
        q0 q0Var4 = u53.d;
        hashMap.put("SHAKE256", q0Var4);
        q0 q0Var5 = u53.e;
        hashMap.put("SHAKE256-LEN", q0Var5);
        hashMap2.put(q0Var, "SHA-256");
        hashMap2.put(q0Var2, "SHA-512");
        hashMap2.put(q0Var3, "SHAKE128");
        hashMap2.put(q0Var4, "SHAKE256");
        hashMap2.put(q0Var5, "SHAKE256-LEN");
    }

    public static xw0 a(q0 q0Var) {
        if (u53.a.r(q0Var)) {
            return new f84();
        }
        if (u53.b.r(q0Var)) {
            return new h84();
        }
        if (u53.c.r(q0Var)) {
            return new i84(128);
        }
        if (u53.d.r(q0Var)) {
            return new i84(256);
        }
        if (u53.e.r(q0Var)) {
            return new i84(256);
        }
        hn3.i(q0Var, "unrecognized digest OID: ");
        return null;
    }

    public static String b(q0 q0Var) {
        String str = (String) b.get(q0Var);
        if (str != null) {
            return str;
        }
        hn3.i(q0Var, "unrecognized digest oid: ");
        return null;
    }

    public static q0 c(String str) {
        q0 q0Var = (q0) a.get(str);
        if (q0Var != null) {
            return q0Var;
        }
        s83.t(hf1.w("unrecognized digest name: ", str));
        return null;
    }
}

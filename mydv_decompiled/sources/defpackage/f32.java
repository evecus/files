package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class f32 {
    public static final v24 a = new v24("-----BEGIN(?: EC)? PRIVATE KEY-----[\\s\\S]+?-----END(?: EC)? PRIVATE KEY-----");

    public static void a(e32 e32Var, String str, String str2) {
        String g = g(str2);
        if (jx4.L(g)) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String x = qx4.x(qx4.x(qx4.x(lowerCase, "-", "", false), "_", "", false), " ", "", false);
        if (x.equals("ticket") || x.equals("bdticket") || qx4.s(x, "ticket", false)) {
            if (jx4.L(e32Var.a)) {
                e32Var.a = g;
                return;
            }
            return;
        }
        if (x.equals("tssign") || qx4.s(x, "tssign", false)) {
            if (jx4.L(e32Var.b)) {
                e32Var.b = g;
            }
        } else if (x.equals("privatekey") || x.equals("prik") || qx4.s(x, "privatekey", false)) {
            if (jx4.L(e32Var.c)) {
                e32Var.c = c(g);
            }
        } else if (x.equals("servercert") && jx4.L(e32Var.d)) {
            e32Var.d = g;
        }
    }

    public static void b(e32 e32Var, String str) {
        zv2 a2;
        if (jx4.L(e32Var.c) && (a2 = v24.a(a, str)) != null) {
            String group = a2.a.group();
            group.getClass();
            e32Var.c = c(group);
        }
    }

    public static String c(String str) {
        int i = 0;
        String x = qx4.x(qx4.x(jx4.g0(str).toString(), "\\r", "", false), "\\n", "\n", false);
        if (qx4.y(x, "-----BEGIN", false)) {
            return x;
        }
        Pattern compile = Pattern.compile("\\s+");
        compile.getClass();
        String replaceAll = compile.matcher(x).replaceAll("");
        replaceAll.getClass();
        if (replaceAll.length() <= 80) {
            return x;
        }
        Pattern compile2 = Pattern.compile("[A-Za-z0-9+/=]+");
        compile2.getClass();
        if (!compile2.matcher(replaceAll).matches()) {
            return x;
        }
        StringBuilder sb = new StringBuilder("-----BEGIN PRIVATE KEY-----\n");
        ArrayList C = jx4.C(replaceAll);
        int size = C.size();
        while (i < size) {
            Object obj = C.get(i);
            i++;
            sb.append((String) obj);
            sb.append('\n');
        }
        sb.append("-----END PRIVATE KEY-----");
        return sb.toString();
    }

    public static d32 d(String str, String str2) {
        str.getClass();
        str2.getClass();
        String obj = jx4.g0(str).toString();
        e32 e32Var = new e32();
        e32Var.a = "";
        e32Var.b = "";
        e32Var.c = "";
        e32Var.d = "";
        b(e32Var, obj);
        e(e32Var, obj);
        f(e32Var, obj);
        if (!jx4.L(str2)) {
            e32Var.c = c(str2);
        }
        return new d32(obj, e32Var.a, e32Var.b, e32Var.c, e32Var.d);
    }

    public static void e(e32 e32Var, String str) {
        Object g54Var;
        Object g54Var2;
        String obj = jx4.g0(str).toString();
        if (jx4.L(obj)) {
            return;
        }
        try {
            g54Var = new JSONObject(obj);
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        if (!(g54Var instanceof g54)) {
            h(e32Var, (JSONObject) g54Var);
        }
        if (h54.a(g54Var) != null) {
            try {
                g54Var2 = new JSONArray(obj);
            } catch (Throwable th2) {
                g54Var2 = new g54(th2);
            }
            if (g54Var2 instanceof g54) {
                return;
            }
            h(e32Var, (JSONArray) g54Var2);
        }
    }

    public static void f(e32 e32Var, String str) {
        bk2 bk2Var = new bk2(str);
        while (bk2Var.hasNext()) {
            String T = jx4.T(jx4.g0((String) bk2Var.next()).toString(), ",");
            if (!jx4.L(T)) {
                List k0 = p70.k0(Integer.valueOf(jx4.I(T, '=', 0, 6)), Integer.valueOf(jx4.I(T, ':', 0, 6)));
                ArrayList arrayList = new ArrayList();
                for (Object obj : k0) {
                    if (((Number) obj).intValue() > 0) {
                        arrayList.add(obj);
                    }
                }
                Integer num = (Integer) o70.d1(arrayList);
                if (num != null) {
                    int intValue = num.intValue();
                    a(e32Var, jx4.h0(jx4.g0(T.substring(0, intValue)).toString(), '\"', '\'', ','), jx4.h0(jx4.g0(T.substring(intValue + 1)).toString(), '\"', '\'', ','));
                }
            }
        }
    }

    public static String g(String str) {
        return qx4.x(qx4.x(jx4.h0(jx4.g0(str).toString(), '\"', '\''), "\\r", "", false), "\\n", "\n", false);
    }

    public static void h(e32 e32Var, Object obj) {
        if (!(obj instanceof JSONObject)) {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    h(e32Var, jSONArray.opt(i));
                }
                return;
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if ((opt instanceof JSONObject) || (opt instanceof JSONArray)) {
                h(e32Var, opt);
            } else if (!j42.c(opt, JSONObject.NULL) && opt != null) {
                String obj2 = opt.toString();
                next.getClass();
                a(e32Var, next, obj2);
                String g = g(obj2);
                if (!jx4.L(g)) {
                    b(e32Var, g);
                    if (qx4.y(g, "{", false) || qx4.y(g, "[", false)) {
                        e(e32Var, g);
                    }
                    f(e32Var, g);
                }
            }
        }
    }
}

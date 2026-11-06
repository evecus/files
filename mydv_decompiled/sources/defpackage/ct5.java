package defpackage;

import android.content.Context;
import android.util.Log;
import coil3.network.internal.UtilsKt;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ct5 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final v24 b = new v24("\\{\\{([A-Z_]+)\\}\\}");

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                sb.append("&quot;");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else if (charAt != '\'') {
                sb.append(charAt);
            } else {
                sb.append("&#39;");
            }
        }
        return sb.toString();
    }

    public static h63 b(Context context, fl4 fl4Var, String str, Map map) {
        context.getClass();
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put((String) entry.getKey(), a((String) entry.getValue()));
            }
            hashMap.put("THEME_CSS", d(context, fl4Var));
            hashMap.put("PANEL_HEAD", c(context, "panel-head.html"));
            h63 b2 = k63.b("text/html; charset=utf-8", 2, b.f(c(context, str), new e35((Object) hashMap, (byte) 6)));
            b2.e(UtilsKt.CACHE_CONTROL, "no-store");
            return b2;
        } catch (Exception e) {
            Log.e("WebPanelPage", "渲染 " + str + " 失败", e);
            return k63.b("text/plain; charset=utf-8", 29, "页面加载失败: " + e.getMessage());
        }
    }

    public static String c(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            InputStream open = context.getAssets().open("web/".concat(str));
            open.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, z50.a), 8192);
            try {
                obj = wi4.u(bufferedReader);
                bufferedReader.close();
                Object putIfAbsent = concurrentHashMap.putIfAbsent(str, obj);
                if (putIfAbsent != null) {
                    obj = putIfAbsent;
                }
            } finally {
            }
        }
        return (String) obj;
    }

    public static String d(Context context, fl4 fl4Var) {
        t80 e = fl4Var.e();
        s90 f = fl4Var.f();
        z70 d = fl4Var.d();
        int i = fl4Var.a.getInt("global_seed_argb", 0);
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        x70 x70Var = valueOf != null ? new x70(qb.i(valueOf.intValue())) : null;
        return hf1.x(":root{color-scheme:light;", e(c74.a(context, e, f, d, x70Var, false)), "}@media (prefers-color-scheme:dark){:root{color-scheme:dark;", e(c74.a(context, e, f, d, x70Var, true)), "}}");
    }

    public static String e(k80 k80Var) {
        return o70.Z0(p70.k0(new uj3("primary", new x70(k80Var.a)), new uj3("on-primary", new x70(k80Var.b)), new uj3("primary-container", new x70(k80Var.c)), new uj3("on-primary-container", new x70(k80Var.d)), new uj3("secondary", new x70(k80Var.f)), new uj3("on-secondary", new x70(k80Var.g)), new uj3("secondary-container", new x70(k80Var.h)), new uj3("on-secondary-container", new x70(k80Var.i)), new uj3("tertiary", new x70(k80Var.j)), new uj3("on-tertiary", new x70(k80Var.k)), new uj3("tertiary-container", new x70(k80Var.l)), new uj3("on-tertiary-container", new x70(k80Var.m)), new uj3("error", new x70(k80Var.w)), new uj3("on-error", new x70(k80Var.x)), new uj3("error-container", new x70(k80Var.y)), new uj3("on-error-container", new x70(k80Var.z)), new uj3("surface", new x70(k80Var.p)), new uj3("surface-dim", new x70(k80Var.E)), new uj3("surface-bright", new x70(k80Var.D)), new uj3("sc-lowest", new x70(k80Var.J)), new uj3("sc-low", new x70(k80Var.I)), new uj3("sc", new x70(k80Var.F)), new uj3("sc-high", new x70(k80Var.G)), new uj3("sc-highest", new x70(k80Var.H)), new uj3("on-surface", new x70(k80Var.q)), new uj3("on-surface-variant", new x70(k80Var.s)), new uj3("outline", new x70(k80Var.A)), new uj3("outline-variant", new x70(k80Var.B)), new uj3("inverse-surface", new x70(k80Var.u)), new uj3("inverse-on-surface", new x70(k80Var.v)), new uj3("inverse-primary", new x70(k80Var.e))), "", null, null, 0, new m45((byte) 18), 30);
    }
}

package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tc4 {
    public static final sc4 Companion = new sc4();
    public final SharedPreferences a;
    public final fw4 b;
    public final p04 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [g54] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    public tc4(Application application) {
        ?? g54Var;
        SharedPreferences sharedPreferences = application.getSharedPreferences("search_history", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("history", null);
        Object obj = o91.I;
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                u22 c0 = ut0.c0(0, jSONArray.length());
                g54Var = new ArrayList();
                Iterator it = c0.iterator();
                while (((t22) it).K) {
                    String optString = jSONArray.optString(((l22) it).nextInt());
                    optString.getClass();
                    if (jx4.L(optString)) {
                        optString = null;
                    }
                    if (optString != null) {
                        g54Var.add(optString);
                    }
                }
            } catch (Throwable th) {
                g54Var = new g54(th);
            }
            obj = (List) (g54Var instanceof g54 ? obj : g54Var);
        }
        fw4 c = o7.c(obj);
        this.b = c;
        this.c = sv2.j(c);
    }
}

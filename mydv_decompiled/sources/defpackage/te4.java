package defpackage;

import android.util.Log;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class te4 implements ag1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ye4 J;

    public /* synthetic */ te4(ye4 ye4Var, byte b) {
        this.I = b;
        this.J = ye4Var;
    }

    @Override // defpackage.ag1
    public final Object emit(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                this.J.B((String) obj);
                break;
            case 1:
                String str = (String) obj;
                ye4 ye4Var = this.J;
                ye4Var.c.c(str, "search.query");
                rv4 rv4Var = ye4Var.X;
                if (rv4Var != null) {
                    rv4Var.e(null);
                }
                ye4Var.j.b(str);
                break;
            default:
                String str2 = (String) obj;
                zc4 zc4Var = this.J.d;
                zc4Var.getClass();
                str2.getClass();
                zc4Var.l = str2;
                wc4 wc4Var = zc4Var.j;
                if (wc4Var != null) {
                    try {
                        String jSONObject = new JSONObject().put("type", "tv_text").put("text", str2).toString();
                        jSONObject.getClass();
                        wc4Var.d(jSONObject);
                    } catch (Exception e) {
                        Log.w("SearchInputServer", "回传电视文字失败", e);
                    }
                }
                break;
        }
        return wd5.a;
    }
}

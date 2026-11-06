package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s34 extends k05 implements hn1 {
    public final /* synthetic */ Context I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s34(Context context, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = context;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new s34(this.I, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((s34) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Context context = this.I;
        mu0.V(obj);
        Exception e = null;
        for (String str : t34.g) {
            try {
                Response execute = t34.a.newCall(new Request.Builder().url(str).header("User-Agent", "myDV-Android/" + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName).build()).execute();
                try {
                    if (execute.isSuccessful()) {
                        ResponseBody body = execute.body();
                        String string = body != null ? body.string() : null;
                        if (string != null) {
                            r34 a = t34.a(string, str);
                            SharedPreferences sharedPreferences = t34.i;
                            if (sharedPreferences == null) {
                                j42.g0("prefs");
                                throw null;
                            }
                            sharedPreferences.edit().putInt("license_required_version", a.a.d).apply();
                            fw4 fw4Var = t34.b;
                            fw4Var.getClass();
                            fw4Var.i(null, a);
                            fw4 fw4Var2 = t34.c;
                            Boolean bool = Boolean.FALSE;
                            fw4Var2.getClass();
                            fw4Var2.i(null, bool);
                            execute.close();
                            return a;
                        }
                    }
                    execute.close();
                } finally {
                }
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        }
        r34 r34Var = new r34(t34.h, null, (String) t34.g.get(0));
        fw4 fw4Var3 = t34.b;
        fw4Var3.getClass();
        fw4Var3.i(null, r34Var);
        fw4 fw4Var4 = t34.d;
        String str2 = "获取配置失败: " + (e != null ? e.getMessage() : null) + "，使用默认配置";
        fw4Var4.getClass();
        fw4Var4.i(null, str2);
        fw4 fw4Var5 = t34.c;
        Boolean bool2 = Boolean.FALSE;
        fw4Var5.getClass();
        fw4Var5.i(null, bool2);
        return r34Var;
    }
}

package defpackage;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pz0 extends k05 implements hn1 {
    public final /* synthetic */ n11 I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(n11 n11Var, String str, String str2, String str3, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = n11Var;
        this.J = str;
        this.K = str2;
        this.L = str3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new pz0(this.I, this.J, this.K, this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((pz0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        String str;
        mu0.V(obj);
        Request.Builder url = new Request.Builder().url(this.J);
        zy0 zy0Var = n11.Companion;
        n11 n11Var = this.I;
        n11Var.getClass();
        n11.F0(url, this.K, this.L);
        Response execute = n11Var.d.newCall(url.get().build()).execute();
        try {
            String header$default = Response.header$default(execute, "x-ms-token", null, 2, null);
            if (header$default != null) {
                String str2 = jx4.L(header$default) ? null : header$default;
                if (str2 != null) {
                    n11Var.C0(str2);
                }
            }
            ResponseBody body = execute.body();
            if (body == null || (str = body.string()) == null) {
                str = "";
            }
            if (!execute.isSuccessful()) {
                throw new Exception("HTTP " + execute.code() + ": " + jx4.f0(300, str));
            }
            if (!jx4.L(str)) {
                execute.close();
                return str;
            }
            throw new Exception("服务器返回空响应 (HTTP " + execute.code() + ")，搜索请求可能被拦截");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                i42.h0(execute, th);
                throw th2;
            }
        }
    }
}

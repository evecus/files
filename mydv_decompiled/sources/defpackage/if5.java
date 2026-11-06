package defpackage;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class if5 extends k05 implements hn1 {
    public final /* synthetic */ String I;
    public final /* synthetic */ OkHttpClient J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if5(String str, OkHttpClient okHttpClient, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = str;
        this.J = okHttpClient;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new if5(this.I, this.J, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((if5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Response execute;
        int code;
        boolean z;
        mu0.V(obj);
        boolean z2 = false;
        try {
            execute = this.J.newCall(new Request.Builder().url(this.I).head().header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36").header("Accept", "*/*").build()).execute();
            try {
                code = execute.code();
            } finally {
            }
        } catch (Exception unused) {
        }
        if (200 > code || code >= 400) {
            if (execute.code() != 405) {
                z = false;
                i42.h0(execute, null);
                z2 = z;
                return Boolean.valueOf(z2);
            }
        }
        z = true;
        i42.h0(execute, null);
        z2 = z;
        return Boolean.valueOf(z2);
    }
}

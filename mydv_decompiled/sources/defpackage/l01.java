package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l01 extends k05 implements hn1 {
    public /* synthetic */ Object I;
    public final /* synthetic */ n11 J;
    public final /* synthetic */ String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(fj0 fj0Var, n11 n11Var, String str) {
        super(2, fj0Var);
        this.J = n11Var;
        this.K = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        l01 l01Var = new l01(fj0Var, this.J, this.K);
        l01Var.I = obj;
        return l01Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((l01) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v37 */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        g54 g54Var;
        String str;
        mu0.V(obj);
        long currentTimeMillis = System.currentTimeMillis();
        n11 n11Var = this.J;
        if (!jx4.L(n11Var.h) && currentTimeMillis - n11Var.i < 60000) {
            return n11Var.h;
        }
        try {
            Response execute = n11Var.d.newCall(new Request.Builder().url("https://www.douyin.com/service/2/abtest_config/").header("accept", "*/*").header("accept-language", "zh-CN,zh;q=0.9,en;q=0.8").header("cache-control", "no-cache").header("pragma", "no-cache").header("priority", "u=1, i").header("referer", "https://www.douyin.com/?recommend=1").header("sec-ch-ua", "\"Not/A)Brand\";v=\"8\", \"Chromium\";v=\"147\", \"Google Chrome\";v=\"147\"").header("sec-ch-ua-mobile", "?0").header("sec-ch-ua-platform", "\"Windows\"").header("sec-fetch-dest", "empty").header("sec-fetch-mode", "cors").header("sec-fetch-site", "same-origin").header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36").header("x-secsdk-csrf-request", "1").header("x-secsdk-csrf-version", "1.2.22").header("Cookie", this.K).head().build()).execute();
            try {
                String header$default = Response.header$default(execute, "X-Ware-Csrf-Token", null, 2, null);
                String str2 = "";
                String str3 = header$default;
                if (header$default == null) {
                    str3 = "";
                }
                List Y = jx4.Y(str3, new char[]{','});
                ArrayList arrayList = new ArrayList(p70.J(Y, 10));
                Iterator it = Y.iterator();
                while (it.hasNext()) {
                    arrayList.add(jx4.g0((String) it.next()).toString());
                }
                String str4 = (String) o70.V0(1, arrayList);
                if (str4 != null) {
                    str2 = str4;
                }
                String str5 = jx4.L(str2) ? str3 : str2;
                if (jx4.L(str5)) {
                    String str6 = n11Var.h;
                    str = jx4.L(str6) ? "DOWNGRADE" : str6;
                } else {
                    n11Var.h = str5;
                    n11Var.i = currentTimeMillis;
                    str = str5;
                }
                i42.h0(execute, null);
                g54Var = str;
            } finally {
            }
        } catch (Throwable th) {
            g54Var = new g54(th);
        }
        if (h54.a(g54Var) == null) {
            return g54Var;
        }
        String str7 = n11Var.h;
        return jx4.L(str7) ? "DOWNGRADE" : str7;
    }
}

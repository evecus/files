package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sz0 extends k05 implements hn1 {
    public final /* synthetic */ n11 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(n11 n11Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = n11Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new sz0(this.I, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((sz0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        n11 n11Var = this.I;
        mu0.V(obj);
        try {
            Log.d("LiveWS", "[ttwid] fetchLiveTtwid: requesting https://live.douyin.com ...");
            Response execute = n11Var.d.newCall(new Request.Builder().url("https://live.douyin.com").header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.5845.97 Safari/537.36 Core/1.116.567.400 QQBrowser/19.7.6764.400").get().build()).execute();
            try {
                Log.d("LiveWS", "[ttwid] fetchLiveTtwid response: http=" + execute.code() + ", Set-Cookie count=" + execute.headers("Set-Cookie").size());
                Iterator<T> it = execute.headers("Set-Cookie").iterator();
                while (it.hasNext()) {
                    uj3 r0 = n11.r0((String) it.next());
                    fl4 fl4Var = n11Var.a;
                    if (j42.c(r0 != null ? (String) r0.I : null, "ttwid")) {
                        Object obj2 = r0.J;
                        Log.d("LiveWS", "[ttwid] fetchLiveTtwid OK: " + jx4.f0(30, (String) obj2) + "...");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fl4Var.h());
                        linkedHashMap.put("ttwid", obj2);
                        fl4Var.H(o70.Z0(linkedHashMap.entrySet(), "; ", null, null, 0, new m90((byte) 19), 30));
                        execute.close();
                        return obj2;
                    }
                }
                execute.close();
                return null;
            } finally {
            }
        } catch (Exception e) {
            Log.w("LiveWS", "[ttwid] fetchLiveTtwid FAILED: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return null;
        }
    }
}

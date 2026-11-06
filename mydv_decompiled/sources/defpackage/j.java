package defpackage;

import android.util.Log;
import com.whl.quickjs.wrapper.QuickJSContext;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, String str, String str2, String str3, String str4, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = sVar;
        this.K = str;
        this.L = str2;
        this.M = str3;
        this.N = str4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                return new j((s) this.J, (String) obj5, (String) obj4, (String) obj3, (String) obj2, fj0Var);
            default:
                j jVar = new j((ly) obj5, (na3) obj4, (k9) obj3, (ls) obj2, fj0Var);
                jVar.J = obj;
                return jVar;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((j) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object[] objArr = 0;
        switch (this.I) {
            case 0:
                mu0.V(obj);
                try {
                    QuickJSContext quickJSContext = ((s) this.J).e;
                    if (quickJSContext != null) {
                        String str = jx4.L((String) this.K) ? "undefined" : "'" + s.b((String) this.K) + "'";
                        String str2 = (String) this.L;
                        Object evaluate = quickJSContext.evaluate("(function(){ try { return getABogus('" + s.b((String) this.M) + "', '" + s.b((String) this.N) + "', " + str + ", " + (str2 != null ? "'" + s.b(str2) + "'" : "undefined") + "); } catch(e) { return JSON.stringify({ok:false,error:String(e)}); } })()");
                        String str3 = evaluate instanceof String ? (String) evaluate : null;
                        if (str3 != null) {
                            Log.d("ABogusSigner", "getABogus raw result (" + str3.length() + " chars): " + jx4.f0(150, str3));
                            return s.e(str3);
                        }
                    }
                } catch (Exception e) {
                    Log.e("ABogusSigner", "getABogus failed", e);
                    Throwable cause = e.getCause();
                    for (int i = 0; cause != null && i < 3; i++) {
                        String simpleName = cause.getClass().getSimpleName();
                        String message = cause.getMessage();
                        Log.e("ABogusSigner", "  Caused by: " + simpleName + ": " + (message != null ? jx4.f0(200, message) : null));
                        cause = cause.getCause();
                    }
                }
                return "";
            default:
                mu0.V(obj);
                dl0 dl0Var = (dl0) this.J;
                ly lyVar = (ly) this.K;
                p70.g0(dl0Var, null, null, new ni(lyVar, (na3) this.L, (k9) this.M, (fj0) null, (byte) 1), 3);
                return p70.g0(dl0Var, null, null, new ky(lyVar, (ls) this.N, null, objArr == true ? 1 : 0), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ly lyVar, na3 na3Var, k9 k9Var, ls lsVar, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = lyVar;
        this.L = na3Var;
        this.M = k9Var;
        this.N = lsVar;
    }
}

package defpackage;

import android.content.Context;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.VideoPlayUrlResolverKt;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jj5 extends k05 implements hn1 {
    public final /* synthetic */ is0 I;
    public final /* synthetic */ Context J;
    public final /* synthetic */ OkHttpClient K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj5(is0 is0Var, Context context, OkHttpClient okHttpClient, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = is0Var;
        this.J = context;
        this.K = okHttpClient;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = t43Var4;
        this.P = t43Var5;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new jj5(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        jj5 jj5Var = (jj5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        jj5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        boolean booleanValue = ((Boolean) this.L.getValue()).booleanValue();
        wd5 wd5Var = wd5.a;
        if (booleanValue) {
            Aweme aweme = (Aweme) o70.V0(this.I.o() + 1, (List) this.M.getValue());
            if (aweme != null) {
                Aweme aweme2 = (Aweme) ((Map) this.N.getValue()).get(aweme.getAwemeId());
                if (!((Boolean) this.O.getValue()).booleanValue() || aweme2 != null) {
                    sn5.a.d(this.J, VideoPlayUrlResolverKt.resolveFinalPlayUrl(aweme.getVideo(), (lq5) this.P.getValue(), aweme2), this.K);
                    return wd5Var;
                }
            }
        }
        return wd5Var;
    }
}

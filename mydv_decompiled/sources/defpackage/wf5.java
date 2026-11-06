package defpackage;

import android.content.Context;
import com.github.mytv.dv.model.Aweme;
import com.github.mytv.dv.model.VideoPlayUrlResolverKt;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wf5 extends k05 implements hn1 {
    public final /* synthetic */ List I;
    public final /* synthetic */ is0 J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ OkHttpClient L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf5(List list, is0 is0Var, Context context, OkHttpClient okHttpClient, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = list;
        this.J = is0Var;
        this.K = context;
        this.L = okHttpClient;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = t43Var3;
        this.P = t43Var4;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new wf5(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        wf5 wf5Var = (wf5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        wf5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        mu0.V(obj);
        boolean booleanValue = ((Boolean) this.M.getValue()).booleanValue();
        wd5 wd5Var = wd5.a;
        if (booleanValue && (aweme = (Aweme) o70.V0(this.J.o() + 1, this.I)) != null) {
            Aweme aweme2 = (Aweme) ((Map) this.N.getValue()).get(aweme.getAwemeId());
            if (!((Boolean) this.O.getValue()).booleanValue() || aweme2 != null) {
                sn5.a.d(this.K, VideoPlayUrlResolverKt.resolveFinalPlayUrl(aweme.getVideo(), (lq5) this.P.getValue(), aweme2), this.L);
                return wd5Var;
            }
        }
        return wd5Var;
    }
}

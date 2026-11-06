package defpackage;

import android.util.Log;
import androidx.media3.exoplayer.ExoPlayer;
import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class um5 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ t43 S;
    public /* synthetic */ Object T;
    public final /* synthetic */ Object U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um5(Aweme aweme, boolean z, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, t43 t43Var9, t43 t43Var10, fj0 fj0Var) {
        super(2, fj0Var);
        this.T = aweme;
        this.K = z;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.O = t43Var4;
        this.P = t43Var5;
        this.Q = t43Var6;
        this.R = t43Var7;
        this.S = t43Var8;
        this.U = t43Var9;
        this.V = t43Var10;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.V;
        Object obj3 = this.U;
        switch (b) {
            case 0:
                return new um5((Aweme) this.T, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, (t43) obj3, (t43) obj2, fj0Var);
            default:
                t43 t43Var = this.R;
                t43 t43Var2 = this.S;
                um5 um5Var = new um5(this.K, this.L, this.M, (ExoPlayer) obj3, this.N, this.O, (String) obj2, this.P, this.Q, t43Var, t43Var2, fj0Var);
                um5Var.T = obj;
                return um5Var;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((um5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return el0.I;
            default:
                return ((um5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        Object obj2 = this.V;
        Object obj3 = this.U;
        t43 t43Var = this.L;
        boolean z = this.K;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                Aweme aweme = (Aweme) this.T;
                boolean z2 = this.J;
                try {
                    if (z2) {
                        if (!z2) {
                            zy.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mu0.V(obj);
                        throw new d92();
                    }
                    mu0.V(obj);
                    ta1 ta1Var = on5.a;
                    t43Var.setValue(Boolean.TRUE);
                    Log.d("VideoItem", "占位开始: awemeId=" + aweme.getAwemeId() + " source=" + ((pn5) this.M.getValue()) + " separateFetch=" + z);
                    Boolean bool = Boolean.FALSE;
                    this.N.setValue(bool);
                    this.O.setValue(bool);
                    this.P.setValue(bool);
                    this.Q.setValue(bool);
                    this.R.setValue(null);
                    this.S.setValue(bool);
                    ((t43) obj3).setValue(bool);
                    ((t43) obj2).setValue(bool);
                    this.J = true;
                    rt0.g(this);
                    return el0Var;
                } catch (Throwable th) {
                    on5.I(aweme, t43Var, "session_end");
                    throw th;
                }
            default:
                dl0 dl0Var = (dl0) this.T;
                boolean z3 = this.J;
                wd5 wd5Var = wd5.a;
                if (!z3) {
                    mu0.V(obj);
                    if (!z) {
                        w84 w = wi4.w(new gu1(t43Var, (byte) 3));
                        lo5 lo5Var = new lo5(dl0Var, this.M, (ExoPlayer) obj3, this.L, this.N, this.O, (String) obj2, this.P, this.Q, this.R, this.S, null);
                        this.T = null;
                        this.J = true;
                        if (ut0.x(w, lo5Var, this) == el0Var) {
                            return el0Var;
                        }
                    }
                } else {
                    if (!z3) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return wd5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um5(boolean z, t43 t43Var, t43 t43Var2, ExoPlayer exoPlayer, t43 t43Var3, t43 t43Var4, String str, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = t43Var;
        this.M = t43Var2;
        this.U = exoPlayer;
        this.N = t43Var3;
        this.O = t43Var4;
        this.V = str;
        this.P = t43Var5;
        this.Q = t43Var6;
        this.R = t43Var7;
        this.S = t43Var8;
    }
}

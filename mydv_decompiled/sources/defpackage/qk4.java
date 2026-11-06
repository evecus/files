package defpackage;

import android.content.Context;
import androidx.compose.runtime.Recomposer;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qk4 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(t43 t43Var, t43 t43Var2, t43 t43Var3, ExoPlayer exoPlayer, ExoPlayer exoPlayer2, t43 t43Var4, t43 t43Var5, t43 t43Var6, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = t43Var;
        this.L = t43Var2;
        this.M = t43Var3;
        this.N = exoPlayer;
        this.O = exoPlayer2;
        this.P = t43Var4;
        this.Q = t43Var5;
        this.R = t43Var6;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.R;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        Object obj5 = this.O;
        Object obj6 = this.N;
        Object obj7 = this.M;
        Object obj8 = this.L;
        switch (b) {
            case 0:
                qk4 qk4Var = new qk4((Recomposer) obj8, (vo) obj7, (fw4) obj6, (Context) obj5, (y34) obj4, (a85) obj3, (z75) obj2, fj0Var);
                qk4Var.K = obj;
                return qk4Var;
            default:
                return new qk4((t43) this.K, (t43) obj8, (t43) obj7, (ExoPlayer) obj6, (ExoPlayer) obj5, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var);
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
        return ((qk4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.R;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        Object obj5 = this.O;
        Object obj6 = this.N;
        Object obj7 = this.M;
        Object obj8 = this.L;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                Recomposer recomposer = (Recomposer) obj8;
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    dl0 dl0Var = (dl0) this.K;
                    q24 q24Var = new q24();
                    q24Var.I = recomposer.getChangeCount();
                    dw4 currentState = recomposer.getCurrentState();
                    jm2 jm2Var = new jm2((vo) obj7, recomposer, q24Var, (fw4) obj6, (Context) obj5, (y34) obj4, (a85) obj3, (z75) obj2, dl0Var, null);
                    this.J = true;
                    if (ut0.x(currentState, jm2Var, this) == el0Var) {
                        break;
                    }
                } else if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    zf1 p = o7.p(wi4.w(new yj(this.K, obj8, obj7, (byte) 16)));
                    no5 no5Var = new no5((ExoPlayer) obj6, (ExoPlayer) obj5, (t43) obj4, (t43) obj3, (t43) obj2);
                    this.J = true;
                    if (p.collect(no5Var, this) == el0Var) {
                        break;
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                    break;
                }
                break;
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(Recomposer recomposer, vo voVar, fw4 fw4Var, Context context, y34 y34Var, a85 a85Var, z75 z75Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = recomposer;
        this.M = voVar;
        this.N = fw4Var;
        this.O = context;
        this.P = y34Var;
        this.Q = a85Var;
        this.R = z75Var;
    }
}

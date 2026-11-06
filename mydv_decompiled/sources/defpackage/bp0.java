package defpackage;

import android.view.SurfaceView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bp0 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public boolean J;
    public final /* synthetic */ boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ t43 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(r41 r41Var, boolean z, boolean z2, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = r41Var;
        this.J = z;
        this.K = z2;
        this.M = t43Var;
        this.N = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        switch (b) {
            case 0:
                bp0 bp0Var = new bp0((rm1) obj2, this.K, (hk3) this.N, fj0Var);
                bp0Var.L = obj;
                return bp0Var;
            default:
                t43 t43Var = this.N;
                return new bp0((r41) this.L, this.J, this.K, (t43) obj2, t43Var, fj0Var);
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
                return ((bp0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            default:
                ((bp0) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        boolean z = this.K;
        Object obj2 = this.M;
        wd5 wd5Var = wd5.a;
        t43 t43Var = this.N;
        switch (b) {
            case 0:
                rm1 rm1Var = (rm1) obj2;
                hk3 hk3Var = (hk3) t43Var;
                dl0 dl0Var = (dl0) this.L;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    long longValue = ((Number) rm1Var.invoke()).longValue();
                    if (longValue < 0) {
                        longValue = 0;
                    }
                    hk3Var.i(longValue);
                    if (!z) {
                        return wd5Var;
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                while (i42.u0(dl0Var)) {
                    m1 m1Var = new m1(rm1Var, hk3Var, (byte) 4);
                    this.L = dl0Var;
                    this.J = true;
                    Object e0 = ut0.e0(m1Var, this);
                    el0 el0Var = el0.I;
                    if (e0 == el0Var) {
                        return el0Var;
                    }
                }
                return wd5Var;
            default:
                mu0.V(obj);
                ta1 ta1Var = on5.a;
                ExoPlayer exoPlayer = (ExoPlayer) ((t43) obj2).getValue();
                if (exoPlayer != null) {
                    r41 r41Var = (r41) this.L;
                    SurfaceView b2 = r41Var != null ? r41Var.b() : null;
                    boolean z3 = this.J;
                    if (z3 && b2 != null) {
                        exoPlayer.setVideoSurfaceView(b2);
                    } else if (!z3 && z && ((PlayerView) t43Var.getValue()) != null) {
                        PlayerView playerView = (PlayerView) t43Var.getValue();
                        playerView.getClass();
                        playerView.setPlayer(null);
                        playerView.setPlayer(exoPlayer);
                    }
                }
                return wd5Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(rm1 rm1Var, boolean z, hk3 hk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = rm1Var;
        this.K = z;
        this.N = hk3Var;
    }
}

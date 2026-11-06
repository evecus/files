package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class be4 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be4(ag2 ag2Var, List list, List list2, boolean z, boolean z2, rm1 rm1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = ag2Var;
        this.N = list;
        this.O = list2;
        this.K = z;
        this.L = z2;
        this.P = rm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        switch (b) {
            case 0:
                return new be4((ag2) obj5, (List) obj4, (List) obj3, this.K, this.L, (rm1) obj2, fj0Var);
            default:
                return new be4(this.K, this.L, (t43) obj5, (t43) obj4, (t43) obj3, (fk3) obj2, fj0Var);
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
        return ((be4) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.P;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        el0 el0Var = el0.I;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    t03 t03Var = new t03(o7.p(wi4.w(new fw3((ag2) obj5, (List) obj4, (byte) 1))), (byte) 3);
                    sd4 sd4Var = new sd4((List) obj3, this.K, this.L, (rm1) obj2, (byte) 2);
                    this.J = true;
                    if (t03Var.collect(sd4Var, this) == el0Var) {
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
                    ta1 ta1Var = on5.a;
                    if (!((Boolean) ((t43) obj5).getValue()).booleanValue() || !this.K || this.L || ((Boolean) ((t43) obj4).getValue()).booleanValue()) {
                    }
                } else if (!z2) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mu0.V(obj);
                }
                do {
                    ta1 ta1Var2 = on5.a;
                    ExoPlayer exoPlayer = (ExoPlayer) ((t43) obj3).getValue();
                    if (exoPlayer != null) {
                        fk3 fk3Var = (fk3) obj2;
                        long currentPosition = exoPlayer.getCurrentPosition();
                        long duration = exoPlayer.getDuration();
                        if (duration < 0) {
                            duration = 0;
                        }
                        if (duration > 0) {
                            fk3Var.i(currentPosition / duration);
                        }
                    }
                    this.J = true;
                } while (rt0.n(500L, this) != el0Var);
                break;
        }
        return el0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be4(boolean z, boolean z2, t43 t43Var, t43 t43Var2, t43 t43Var3, fk3 fk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = z2;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = t43Var3;
        this.P = fk3Var;
    }
}

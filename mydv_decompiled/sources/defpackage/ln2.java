package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.github.mytv.dv.model.LiveRoom;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ln2 implements PointerInputEventHandler {
    public final /* synthetic */ pq5 I;
    public final /* synthetic */ rm1 J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ LiveRoom L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ rm1 N;
    public final /* synthetic */ rm1 O;
    public final /* synthetic */ rm1 P;
    public final /* synthetic */ rm1 Q;

    public ln2(pq5 pq5Var, rm1 rm1Var, tm1 tm1Var, LiveRoom liveRoom, t43 t43Var, rm1 rm1Var2, rm1 rm1Var3, rm1 rm1Var4, rm1 rm1Var5) {
        this.I = pq5Var;
        this.J = rm1Var;
        this.K = tm1Var;
        this.L = liveRoom;
        this.M = t43Var;
        this.N = rm1Var2;
        this.O = rm1Var3;
        this.P = rm1Var4;
        this.Q = rm1Var5;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(xp3 xp3Var, fj0 fj0Var) {
        pq5 pq5Var = this.I;
        rm1 rm1Var = this.J;
        tm1 tm1Var = this.K;
        LiveRoom liveRoom = this.L;
        t43 t43Var = this.M;
        rm1 rm1Var2 = this.N;
        Object d = z15.d(xp3Var, null, new ww(pq5Var, rm1Var, tm1Var, liveRoom, t43Var, rm1Var2, (byte) 1), null, new zt1(pq5Var, xp3Var, this.O, this.P, this.Q, t43Var, rm1Var2), fj0Var, 5);
        return d == el0.I ? d : wd5.a;
    }
}

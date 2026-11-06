package defpackage;

import com.github.mytv.dv.model.Aweme;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dn5 extends k05 implements hn1 {
    public final /* synthetic */ t43 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ kq5 K;
    public final /* synthetic */ Aweme L;
    public final /* synthetic */ s33 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ s33 O;
    public final /* synthetic */ s33 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ s33 S;
    public final /* synthetic */ t43 T;
    public final /* synthetic */ t43 U;
    public final /* synthetic */ t43 V;
    public final /* synthetic */ t43 W;
    public final /* synthetic */ t43 X;
    public final /* synthetic */ t43 Y;
    public final /* synthetic */ t43 Z;
    public final /* synthetic */ s33 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn5(t43 t43Var, boolean z, kq5 kq5Var, Aweme aweme, s33 s33Var, t43 t43Var2, s33 s33Var2, s33 s33Var3, t43 t43Var3, t43 t43Var4, s33 s33Var4, t43 t43Var5, t43 t43Var6, t43 t43Var7, t43 t43Var8, t43 t43Var9, t43 t43Var10, t43 t43Var11, s33 s33Var5, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = t43Var;
        this.J = z;
        this.K = kq5Var;
        this.L = aweme;
        this.M = s33Var;
        this.N = t43Var2;
        this.O = s33Var2;
        this.P = s33Var3;
        this.Q = t43Var3;
        this.R = t43Var4;
        this.S = s33Var4;
        this.T = t43Var5;
        this.U = t43Var6;
        this.V = t43Var7;
        this.W = t43Var8;
        this.X = t43Var9;
        this.Y = t43Var10;
        this.Z = t43Var11;
        this.a0 = s33Var5;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new dn5(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        dn5 dn5Var = (dn5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        dn5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        ta1 ta1Var = on5.a;
        t43 t43Var = this.I;
        if (((Boolean) t43Var.getValue()).booleanValue()) {
            on5.z0(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0);
        } else {
            t43Var.setValue(Boolean.TRUE);
        }
        return wd5.a;
    }
}

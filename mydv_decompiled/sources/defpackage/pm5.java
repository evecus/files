package defpackage;

import com.github.mytv.dv.model.Aweme;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pm5 extends k05 implements hn1 {
    public final /* synthetic */ boolean I;
    public final /* synthetic */ kq5 J;
    public final /* synthetic */ Set K;
    public final /* synthetic */ dl0 L;
    public final /* synthetic */ hk3 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ hk3 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ Aweme Q;
    public final /* synthetic */ t43 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm5(boolean z, kq5 kq5Var, Set set, dl0 dl0Var, hk3 hk3Var, t43 t43Var, hk3 hk3Var2, t43 t43Var2, Aweme aweme, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = z;
        this.J = kq5Var;
        this.K = set;
        this.L = dl0Var;
        this.M = hk3Var;
        this.N = t43Var;
        this.O = hk3Var2;
        this.P = t43Var2;
        this.Q = aweme;
        this.R = t43Var3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new pm5(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        pm5 pm5Var = (pm5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        pm5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        boolean z = this.I;
        wd5 wd5Var = wd5.a;
        if (z && this.J != null) {
            ta1 ta1Var = on5.a;
            hk3 hk3Var = this.M;
            if (hk3Var.h() > 0) {
                t43 t43Var = this.N;
                if (((String) t43Var.getValue()).length() != 0) {
                    long h = this.O.h();
                    if (h >= 0 && !((Set) this.P.getValue()).contains(new Long(h))) {
                        Long l = new Long(h);
                        Set set = this.K;
                        if (!set.contains(l)) {
                            long j = 24000 + h;
                            long h2 = hk3Var.h();
                            long j2 = j > h2 ? h2 : j;
                            set.add(new Long(h));
                            p70.g0(this.L, null, null, new om5(this.J, this.Q, h, j2, h, this.K, this.M, t43Var, this.R, this.P, null), 3);
                        }
                    }
                }
            }
        }
        return wd5Var;
    }
}

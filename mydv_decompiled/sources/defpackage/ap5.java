package defpackage;

import com.github.mytv.dv.model.DanmakuResponse;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ap5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ kq5 J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ long M;
    public final /* synthetic */ long N;
    public final /* synthetic */ long O;
    public final /* synthetic */ String P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap5(kq5 kq5Var, String str, String str2, long j, long j2, long j3, String str3, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = kq5Var;
        this.K = str;
        this.L = str2;
        this.M = j;
        this.N = j2;
        this.O = j3;
        this.P = str3;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ap5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ap5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object K;
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            n11 n11Var = this.J.a;
            this.I = true;
            K = n11Var.K(this.K, this.L, this.M, this.N, this.O, this.P, this);
            el0 el0Var = el0.I;
            if (K == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
            K = ((h54) obj).I;
        }
        if (!(K instanceof g54) && (K = ((DanmakuResponse) K).getDanmakuList()) == null) {
            K = o91.I;
        }
        return new h54(K);
    }
}

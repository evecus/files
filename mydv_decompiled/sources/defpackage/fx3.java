package defpackage;

import com.github.mytv.dv.model.MixInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fx3 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ gx3 J;
    public final /* synthetic */ MixInfo K;
    public final /* synthetic */ int L;
    public final /* synthetic */ String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx3(gx3 gx3Var, MixInfo mixInfo, int i, String str, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = gx3Var;
        this.K = mixInfo;
        this.L = i;
        this.M = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new fx3(this.J, this.K, this.L, this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((fx3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        try {
            if (!z) {
                mu0.V(obj);
                kq5 kq5Var = this.J.b;
                String mixId = this.K.getMixId();
                int i = this.L;
                String str = this.M;
                this.I = true;
                Object J = kq5Var.J(i, this, mixId, str);
                el0 el0Var = el0.I;
                if (J == el0Var) {
                    return el0Var;
                }
            } else {
                if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                Object obj2 = ((h54) obj).I;
            }
        } catch (Exception unused) {
        }
        return wd5.a;
    }
}

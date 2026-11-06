package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jw3 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ List J;
    public final /* synthetic */ gu3 K;
    public final /* synthetic */ rm1 L;
    public final /* synthetic */ zg2 M;
    public final /* synthetic */ Map N;
    public final /* synthetic */ int O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jw3(List list, gu3 gu3Var, rm1 rm1Var, zg2 zg2Var, Map map, int i, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = list;
        this.K = gu3Var;
        this.L = rm1Var;
        this.M = zg2Var;
        this.N = map;
        this.O = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new jw3(this.J, this.K, this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((jw3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        fj0 fj0Var = null;
        wd5 wd5Var = wd5.a;
        if (!z) {
            mu0.V(obj);
            if (!this.J.isEmpty()) {
                gu3 gu3Var = this.K;
                if (gu3Var.c && !gu3Var.a && !gu3Var.b) {
                    w84 w = wi4.w(new wa1(this.M, this.N, this.O, (byte) 3));
                    byte b = 2;
                    uv3 uv3Var = new uv3(b, fj0Var, b);
                    this.I = true;
                    Object L = sp0.L(w, uv3Var, this);
                    el0 el0Var = el0.I;
                    if (L == el0Var) {
                        return el0Var;
                    }
                }
            }
            return wd5Var;
        }
        if (!z) {
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        this.L.invoke();
        return wd5Var;
    }
}

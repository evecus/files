package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ex3 extends k05 implements tm1 {
    public boolean I;
    public final /* synthetic */ gx3 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ n24 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex3(gx3 gx3Var, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var) {
        super(1, fj0Var);
        this.J = gx3Var;
        this.K = i;
        this.L = i2;
        this.M = z;
        this.N = n24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new ex3(this.J, this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        return ((ex3) create((fj0) obj)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        Object G;
        boolean z = this.I;
        int i = this.L;
        n24 n24Var = this.N;
        boolean z2 = this.M;
        gx3 gx3Var = this.J;
        try {
            if (!z) {
                mu0.V(obj);
                kq5 kq5Var = gx3Var.b;
                int i2 = gx3Var.w0;
                this.I = true;
                G = kq5Var.G(i2, this);
                el0 el0Var = el0.I;
                if (G == el0Var) {
                    return el0Var;
                }
            } else {
                if (!z) {
                    zy.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mu0.V(obj);
                G = ((h54) obj).I;
            }
            int i3 = gx3Var.y;
            wd5 wd5Var = wd5.a;
            if (this.K == i3) {
                if (!(G instanceof g54)) {
                    List list = (List) G;
                    fw4 fw4Var = gx3Var.s0;
                    if (z2) {
                        fw4Var.h(gx3.p((List) fw4Var.getValue(), list));
                    } else {
                        fw4Var.h(list);
                        gx3Var.u0.i(null, Boolean.TRUE);
                    }
                    gx3Var.x0 = !list.isEmpty();
                    gx3Var.w0 += list.size();
                }
                if (h54.a(G) != null) {
                    n24Var.I = true;
                }
            }
            gx3Var.N(i, z2, gx3Var.x0, n24Var.I);
            return wd5Var;
        } catch (Throwable th) {
            int i4 = gx3Var.y;
            gx3Var.N(i, z2, gx3Var.x0, n24Var.I);
            throw th;
        }
    }
}

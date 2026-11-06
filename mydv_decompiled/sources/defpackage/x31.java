package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x31 extends r92 implements tm1 {
    public final /* synthetic */ byte J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x31(Object obj, Object obj2, byte b) {
        super(1);
        this.J = b;
        this.K = obj;
        this.L = obj2;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        ve1 ve1Var;
        ve1 ve1Var2;
        wd5 wd5Var;
        byte b = this.J;
        wd5 wd5Var2 = wd5.a;
        Object obj2 = this.L;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                y31 y31Var = (y31) obj;
                r10 r10Var = (r10) obj3;
                iu0 u = y31Var.S().u();
                da2 C = y31Var.S().C();
                o10 q = y31Var.S().q();
                long H = y31Var.S().H();
                jr1 jr1Var = (jr1) y31Var.S().c;
                tm1 tm1Var = (tm1) obj2;
                pn pnVar = r10Var.J;
                iu0 u2 = pnVar.u();
                da2 C2 = pnVar.C();
                o10 q2 = pnVar.q();
                long H2 = pnVar.H();
                jr1 jr1Var2 = (jr1) pnVar.c;
                pnVar.V(u);
                pnVar.W(C);
                pnVar.U(q);
                pnVar.X(H);
                pnVar.c = jr1Var;
                q.f();
                try {
                    tm1Var.invoke(r10Var);
                    return wd5Var2;
                } finally {
                    q.n();
                    pnVar.V(u2);
                    pnVar.W(C2);
                    pnVar.U(q2);
                    pnVar.X(H2);
                    pnVar.c = jr1Var2;
                }
            case 1:
                z95 z95Var = (z95) obj;
                aa1 aa1Var = aa1.I;
                aa1 aa1Var2 = aa1.J;
                if (z95Var.c(aa1Var, aa1Var2)) {
                    ga4 ga4Var = ((ta1) obj3).a.d;
                    return (ga4Var == null || (ve1Var2 = ga4Var.c) == null) ? ma1.b : ve1Var2;
                }
                if (!z95Var.c(aa1Var2, aa1.K)) {
                    return ma1.b;
                }
                ga4 ga4Var2 = ((bc1) obj2).a.d;
                return (ga4Var2 == null || (ve1Var = ga4Var2.c) == null) ? ma1.b : ve1Var;
            default:
                Throwable th = (Throwable) obj;
                ((am0) obj3).invoke(th);
                iz izVar = (iz) ((mc3) obj2).c;
                izVar.g(th, false);
                do {
                    Object a = a50.a(izVar.f());
                    if (a == null) {
                        wd5Var = null;
                    } else {
                        lp4 lp4Var = (lp4) a;
                        if (lp4Var instanceof kp4) {
                            ((kp4) lp4Var).b.S(new ub0(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        }
                        wd5Var = wd5Var2;
                    }
                } while (wd5Var != null);
                return wd5Var2;
        }
    }
}

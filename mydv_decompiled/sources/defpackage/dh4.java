package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dh4 extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh4(Object obj, Object obj2, Object obj3, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        byte b = this.I;
        Object obj = this.M;
        Object obj2 = this.K;
        switch (b) {
            case 0:
                return new dh4((jh4) obj2, this.L, (ea5) obj, fj0Var, (byte) 0);
            case 1:
                return new dh4((jh4) obj2, this.L, (ea5) obj, fj0Var, (byte) 1);
            default:
                return new dh4((a85) obj2, (SessionWorker) this.L, (vo) obj, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
        }
        return ((dh4) create(fj0Var)).invokeSuspend(wd5Var);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        Object obj2 = this.M;
        Object obj3 = this.K;
        el0 el0Var = el0.I;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                boolean z = this.J;
                if (!z) {
                    mu0.V(obj);
                    hp0 hp0Var = new hp0((jh4) obj3, obj4, (ea5) obj2, null);
                    this.J = true;
                    return i42.o0(hp0Var, this) == el0Var ? el0Var : wd5Var;
                }
                if (z) {
                    mu0.V(obj);
                    return wd5Var;
                }
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ea5 ea5Var = (ea5) obj2;
                jh4 jh4Var = (jh4) obj3;
                boolean z2 = this.J;
                if (!z2) {
                    mu0.V(obj);
                    jh4Var.k();
                    jk3 jk3Var = jh4Var.b;
                    jh4Var.m = Long.MIN_VALUE;
                    jh4Var.q(0.0f);
                    float f = obj4.equals(jh4Var.c.getValue()) ? -4.0f : obj4.equals(jk3Var.getValue()) ? -5.0f : -3.0f;
                    ea5Var.s(obj4);
                    ea5Var.p(0L);
                    jk3Var.setValue(obj4);
                    jh4Var.q(0.0f);
                    jh4Var.g(obj4);
                    ea5Var.l(f);
                    if (f == -3.0f) {
                        this.J = true;
                        if (jh4Var.t(this) == el0Var) {
                            return el0Var;
                        }
                    }
                } else {
                    if (!z2) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                ea5Var.k();
                return wd5Var;
            default:
                SessionWorker sessionWorker = (SessionWorker) obj4;
                boolean z3 = this.J;
                if (!z3) {
                    mu0.V(obj);
                    z75 z75Var = sessionWorker.c;
                    wd3 wd3Var = new wd3(sessionWorker);
                    this.J = true;
                    if (fb4.T((a85) obj3, sessionWorker.getApplicationContext(), (vo) obj2, z75Var, wd3Var, this) == el0Var) {
                        return el0Var;
                    }
                } else {
                    if (!z3) {
                        zy.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mu0.V(obj);
                }
                return nl2.a();
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fh4 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ jh4 M;
    public final /* synthetic */ ea5 N;
    public final /* synthetic */ float O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh4(Object obj, Object obj2, jh4 jh4Var, ea5 ea5Var, float f, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = obj;
        this.L = obj2;
        this.M = jh4Var;
        this.N = ea5Var;
        this.O = f;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        fh4 fh4Var = new fh4(this.K, this.L, this.M, this.N, this.O, fj0Var);
        fh4Var.J = obj;
        return fh4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((fh4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        wd5 wd5Var = wd5.a;
        jh4 jh4Var = this.M;
        if (!z) {
            mu0.V(obj);
            dl0 dl0Var = (dl0) this.J;
            Object obj2 = this.K;
            Object obj3 = this.L;
            if (j42.c(obj2, obj3)) {
                jh4Var.o = null;
                if (j42.c(jh4Var.c.getValue(), obj2)) {
                    return wd5Var;
                }
            } else {
                jh4Var.l();
            }
            boolean c = j42.c(obj2, obj3);
            float f = this.O;
            if (!c) {
                ea5 ea5Var = this.N;
                ea5Var.s(obj2);
                ea5Var.p(0L);
                jh4Var.b.setValue(obj2);
                ea5Var.l(f);
            }
            jh4Var.q(f);
            if (jh4Var.n.j()) {
                p70.g0(dl0Var, null, null, new h40(jh4Var, (fj0) null, (byte) 19), 3);
            } else {
                jh4Var.m = Long.MIN_VALUE;
            }
            this.I = true;
            Object t = jh4Var.t(this);
            el0 el0Var = el0.I;
            if (t == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        jh4Var.p();
        return wd5Var;
    }
}

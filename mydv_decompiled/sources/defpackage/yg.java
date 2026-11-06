package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yg extends k05 implements tm1 {
    public cj I;
    public n24 J;
    public boolean K;
    public final /* synthetic */ bh L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ a25 N;
    public final /* synthetic */ long O;
    public final /* synthetic */ tm1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(bh bhVar, Object obj, a25 a25Var, long j, tm1 tm1Var, fj0 fj0Var) {
        super(1, fj0Var);
        this.L = bhVar;
        this.M = obj;
        this.N = a25Var;
        this.O = j;
        this.P = tm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new yg(this.L, this.M, this.N, this.O, this.P, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        return ((yg) create((fj0) obj)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        bh bhVar;
        cj cjVar;
        n24 n24Var;
        long j;
        xg xgVar;
        cj cjVar2;
        n24 n24Var2;
        CancellationException cancellationException;
        a25 a25Var = this.N;
        boolean z = this.K;
        bh bhVar2 = this.L;
        if (!z) {
            mu0.V(obj);
            try {
                bhVar2.c.K = (hj) bhVar2.a.a.invoke(this.M);
                bhVar2.e.setValue(a25Var.c);
                bhVar2.d.setValue(Boolean.TRUE);
                cj cjVar3 = bhVar2.c;
                cjVar = new cj(cjVar3.I, cjVar3.J.getValue(), i42.m0(cjVar3.K), cjVar3.L, Long.MIN_VALUE, cjVar3.N);
                n24Var = new n24();
                j = this.O;
                xgVar = new xg(bhVar2, cjVar, this.P, n24Var, (byte) 0);
                bhVar = bhVar2;
            } catch (CancellationException e) {
                e = e;
                bhVar = bhVar2;
                cancellationException = e;
                bhVar.c();
                throw cancellationException;
            }
            try {
                this.I = cjVar;
                this.J = n24Var;
                this.K = true;
                Object a = ad4.a(cjVar, a25Var, j, xgVar, this);
                el0 el0Var = el0.I;
                if (a == el0Var) {
                    return el0Var;
                }
                cjVar2 = cjVar;
                n24Var2 = n24Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                bhVar.c();
                throw cancellationException;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n24Var2 = this.J;
            cjVar2 = this.I;
            try {
                mu0.V(obj);
                bhVar = bhVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                bhVar = bhVar2;
                bhVar.c();
                throw cancellationException;
            }
        }
        xi xiVar = n24Var2.I ? xi.I : xi.J;
        bhVar.c();
        return new zi(cjVar2, xiVar);
    }
}

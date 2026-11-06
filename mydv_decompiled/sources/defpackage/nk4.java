package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nk4 extends k05 implements tm1 {
    public final /* synthetic */ a85 I;
    public final /* synthetic */ SessionWorker J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk4(a85 a85Var, SessionWorker sessionWorker, fj0 fj0Var) {
        super(1, fj0Var);
        this.I = a85Var;
        this.J = sessionWorker;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new nk4(this.I, this.J, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        nk4 nk4Var = (nk4) create((fj0) obj);
        wd5 wd5Var = wd5.a;
        nk4Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        mu0.V(obj);
        this.I.b(this.J.c.c);
        return wd5.a;
    }
}

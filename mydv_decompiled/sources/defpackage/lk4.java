package defpackage;

import androidx.glance.session.SessionWorker;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lk4 extends gj0 {
    public int I;
    public Object J;
    public /* synthetic */ Object K;
    public final /* synthetic */ SessionWorker L;
    public int M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk4(SessionWorker sessionWorker, gj0 gj0Var) {
        super(gj0Var);
        this.L = sessionWorker;
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.doWork(this);
    }
}

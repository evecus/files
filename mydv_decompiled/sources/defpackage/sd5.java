package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sd5 extends k05 implements jn1 {
    public boolean I;
    public /* synthetic */ Throwable J;
    public /* synthetic */ long K;

    @Override // defpackage.jn1
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        sd5 sd5Var = new sd5(4, (fj0) obj4);
        sd5Var.J = (Throwable) obj2;
        sd5Var.K = longValue;
        return sd5Var.invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            Throwable th = this.J;
            long j = this.K;
            fr2.e().d(td5.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, td5.b);
            this.I = true;
            Object n = rt0.n(min, this);
            el0 el0Var = el0.I;
            if (n == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return Boolean.TRUE;
    }
}

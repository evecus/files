package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class og extends k05 implements hn1 {
    public byte I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ qg K;
    public final /* synthetic */ long L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(boolean z, qg qgVar, long j, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = qgVar;
        this.L = j;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new og(this.J, this.K, this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((og) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        byte b = this.I;
        if (b == 0) {
            mu0.V(obj);
            d93 d93Var = this.K.I;
            el0 el0Var = el0.I;
            if (this.J) {
                this.I = (byte) 2;
                Object a = d93Var.a(this.L, 0L, this);
                if (a != el0Var) {
                    obj = a;
                    long j = ((ji5) obj).a;
                }
            } else {
                this.I = (byte) 1;
                Object a2 = d93Var.a(0L, this.L, this);
                if (a2 != el0Var) {
                    obj = a2;
                    long j2 = ((ji5) obj).a;
                }
            }
            return el0Var;
        }
        if (b == 1) {
            mu0.V(obj);
            long j22 = ((ji5) obj).a;
        } else {
            if (b != 2) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
            long j3 = ((ji5) obj).a;
        }
        return wd5.a;
    }
}

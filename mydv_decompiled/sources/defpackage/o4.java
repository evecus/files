package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o4 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ fc4 J;
    public final /* synthetic */ float K;
    public final /* synthetic */ float L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(fc4 fc4Var, float f, float f2, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = fc4Var;
        this.K = f;
        this.L = f2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new o4(this.J, this.K, this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((o4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        boolean z = this.I;
        if (!z) {
            mu0.V(obj);
            this.I = true;
            Object b0 = j42.b0(this.J.l0, (Float.floatToRawIntBits(this.K) << 32) | (Float.floatToRawIntBits(this.L) & 4294967295L), this);
            el0 el0Var = el0.I;
            if (b0 == el0Var) {
                return el0Var;
            }
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mu0.V(obj);
        }
        return wd5.a;
    }
}

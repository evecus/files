package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lc4 extends k05 implements hn1 {
    public oc4 I;
    public q24 J;
    public long K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ oc4 N;
    public final /* synthetic */ q24 O;
    public final /* synthetic */ long P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc4(oc4 oc4Var, q24 q24Var, long j, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = oc4Var;
        this.O = q24Var;
        this.P = j;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        lc4 lc4Var = new lc4(this.N, this.O, this.P, fj0Var);
        lc4Var.M = obj;
        return lc4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((lc4) create((mc4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        oc4 oc4Var;
        q24 q24Var;
        oc4 oc4Var2;
        long j;
        boolean z = this.L;
        pg3 pg3Var = pg3.J;
        if (!z) {
            mu0.V(obj);
            mc4 mc4Var = (mc4) this.M;
            oc4Var = this.N;
            kc4 kc4Var = new kc4(oc4Var, mc4Var);
            gf1 gf1Var = oc4Var.c;
            q24 q24Var2 = this.O;
            long j2 = q24Var2.I;
            pg3 pg3Var2 = oc4Var.d;
            long j3 = this.P;
            float e = oc4Var.e(pg3Var2 == pg3Var ? ji5.d(j3) : ji5.e(j3));
            this.M = oc4Var;
            this.I = oc4Var;
            this.J = q24Var2;
            this.K = j2;
            this.L = true;
            obj = gf1Var.a(kc4Var, e, this);
            el0 el0Var = el0.I;
            if (obj == el0Var) {
                return el0Var;
            }
            q24Var = q24Var2;
            oc4Var2 = oc4Var;
            j = j2;
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.K;
            q24Var = this.J;
            oc4Var = this.I;
            oc4Var2 = (oc4) this.M;
            mu0.V(obj);
        }
        float e2 = oc4Var2.e(((Number) obj).floatValue());
        q24Var.I = oc4Var.d == pg3Var ? ji5.b(j, e2, 0.0f, 2) : ji5.b(j, 0.0f, e2, 1);
        return wd5.a;
    }
}

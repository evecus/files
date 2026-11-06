package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g43 extends f54 implements hn1 {
    public h43 J;
    public i43 K;
    public long[] L;
    public int M;
    public boolean N;
    public /* synthetic */ Object O;
    public final /* synthetic */ i43 P;
    public final /* synthetic */ h43 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g43(i43 i43Var, h43 h43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = i43Var;
        this.Q = h43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        g43 g43Var = new g43(this.P, this.Q, fj0Var);
        g43Var.O = obj;
        return g43Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((g43) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        pj4 pj4Var;
        i43 i43Var;
        long[] jArr;
        int i;
        h43 h43Var;
        boolean z = this.N;
        if (!z) {
            mu0.V(obj);
            pj4Var = (pj4) this.O;
            i43Var = this.P;
            f43 f43Var = i43Var.J;
            jArr = f43Var.c;
            i = f43Var.e;
            h43Var = this.Q;
        } else {
            if (!z) {
                zy.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.M;
            jArr = this.L;
            i43Var = this.K;
            h43Var = this.J;
            pj4Var = (pj4) this.O;
            mu0.V(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return wd5.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        h43Var.J = i;
        Object obj2 = i43Var.J.b[i];
        this.O = pj4Var;
        this.J = h43Var;
        this.K = i43Var;
        this.L = jArr;
        this.M = i2;
        this.N = true;
        pj4Var.d(this, obj2);
        return el0.I;
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gj3 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ jj3 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ float M;
    public final /* synthetic */ bj N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj3(jj3 jj3Var, int i, float f, bj bjVar, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = jj3Var;
        this.L = i;
        this.M = f;
        this.N = bjVar;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        gj3 gj3Var = new gj3(this.K, this.L, this.M, this.N, fj0Var);
        gj3Var.J = obj;
        return gj3Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((gj3) create((rb4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    @Override // defpackage.fu
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z = this.I;
        wd5 wd5Var = wd5.a;
        byte b = 1;
        if (z) {
            if (z) {
                mu0.V(obj);
                return wd5Var;
            }
            zy.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mu0.V(obj);
        rb4 rb4Var = (rb4) this.J;
        jj3 jj3Var = this.K;
        wf2 wf2Var = new wf2(rb4Var, jj3Var, b);
        this.I = true;
        mj3 mj3Var = nj3.a;
        int i2 = this.L;
        jj3Var.q.i(jj3Var.j(new Integer(i2).intValue()));
        boolean z2 = i2 > jj3Var.e;
        int e = (wf2Var.e() - jj3Var.e) + 1;
        if (((z2 && i2 > wf2Var.e()) || (!z2 && i2 < jj3Var.e)) && Math.abs(i2 - jj3Var.e) >= 3) {
            if (z2) {
                i = i2 - e;
                int i3 = jj3Var.e;
                if (i < i3) {
                    i = i3;
                }
            } else {
                int i4 = e + i2;
                i = jj3Var.e;
                if (i4 <= i) {
                    i = i4;
                }
            }
            wf2Var.f(i);
        }
        Object b2 = ad4.b(0.0f, wf2Var.b(i2) + this.M, this.N, new bj1(new o24(), wf2Var, (byte) 14), this, 4);
        el0 el0Var = el0.I;
        if (b2 != el0Var) {
            b2 = wd5Var;
        }
        return b2 == el0Var ? el0Var : wd5Var;
    }
}

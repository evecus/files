package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class aw3 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ int K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ hu2 M;
    public final /* synthetic */ ow3 N;
    public final /* synthetic */ ki1 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw3(int i, boolean z, hu2 hu2Var, ow3 ow3Var, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = i;
        this.L = z;
        this.M = hu2Var;
        this.N = ow3Var;
        this.O = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        aw3 aw3Var = new aw3(this.K, this.L, this.M, this.N, this.O, fj0Var);
        aw3Var.J = obj;
        return aw3Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((aw3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:4)(2:13|14))(4:15|(4:17|(2:19|(1:21))|22|(1:24))|8|9)|5|6|7|8|9) */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            hu2 r0 = r4.M
            gx3 r0 = r0.p
            java.lang.Object r1 = r4.J
            dl0 r1 = (defpackage.dl0) r1
            boolean r2 = r4.I
            r3 = 1
            if (r2 == 0) goto L1a
            if (r2 != r3) goto L13
            defpackage.mu0.V(r5)
            goto L41
        L13:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L1a:
            defpackage.mu0.V(r5)
            int r5 = r4.K
            if (r5 <= 0) goto L46
            boolean r5 = r4.L
            if (r5 != 0) goto L32
            r0.s()
            ow3 r5 = r4.N
            ow3 r2 = defpackage.ow3.R
            if (r5 != r2) goto L32
            r5 = 0
            r0.L(r5)
        L32:
            r4.J = r1
            r4.I = r3
            r0 = 100
            java.lang.Object r5 = defpackage.rt0.n(r0, r4)
            el0 r0 = defpackage.el0.I
            if (r5 != r0) goto L41
            return r0
        L41:
            ki1 r4 = r4.O
            defpackage.ki1.a(r4)     // Catch: java.lang.Throwable -> L46
        L46:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

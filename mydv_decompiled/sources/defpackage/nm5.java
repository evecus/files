package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nm5 extends k05 implements hn1 {
    public boolean I;
    public /* synthetic */ Object J;
    public final /* synthetic */ tm1 K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ ki1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm5(tm1 tm1Var, boolean z, boolean z2, t43 t43Var, t43 t43Var2, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = tm1Var;
        this.L = z;
        this.M = z2;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        nm5 nm5Var = new nm5(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
        nm5Var.J = obj;
        return nm5Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((nm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:4)(2:13|14))(6:15|(1:17)|18|(2:20|(2:26|(1:28)))|8|9)|5|6|7|8|9) */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.J
            dl0 r0 = (defpackage.dl0) r0
            boolean r1 = r4.I
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            defpackage.mu0.V(r5)
            goto L60
        Lf:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            r4 = 0
            return r4
        L16:
            defpackage.mu0.V(r5)
            t43 r5 = r4.N
            tm1 r1 = r4.K
            if (r1 == 0) goto L2d
            ta1 r3 = defpackage.on5.a
            java.lang.Object r3 = r5.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            r1.invoke(r3)
        L2d:
            boolean r1 = r4.L
            if (r1 != 0) goto L65
            ta1 r1 = defpackage.on5.a
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L65
            t43 r5 = r4.O
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L65
            boolean r5 = r4.M
            if (r5 == 0) goto L65
            r4.J = r0
            r4.I = r2
            r0 = 100
            java.lang.Object r5 = defpackage.rt0.n(r0, r4)
            el0 r0 = defpackage.el0.I
            if (r5 != r0) goto L60
            return r0
        L60:
            ki1 r4 = r4.P
            defpackage.ki1.a(r4)     // Catch: java.lang.Throwable -> L65
        L65:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

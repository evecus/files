package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sm5 extends k05 implements hn1 {
    public final /* synthetic */ so3 I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm5(so3 so3Var, boolean z, boolean z2, boolean z3, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = so3Var;
        this.J = z;
        this.K = z2;
        this.L = z3;
        this.M = t43Var;
        this.N = t43Var2;
        this.O = t43Var3;
        this.P = t43Var4;
        this.Q = t43Var5;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new sm5(this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        sm5 sm5Var = (sm5) create((dl0) obj, (fj0) obj2);
        wd5 wd5Var = wd5.a;
        sm5Var.invokeSuspend(wd5Var);
        return wd5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (((java.lang.Boolean) r2.M.getValue()).booleanValue() != false) goto L9;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            defpackage.mu0.V(r3)
            so3 r3 = r2.I
            so3 r0 = defpackage.so3.K
            boolean r1 = r2.K
            if (r3 != r0) goto L21
            boolean r3 = r2.J
            if (r3 == 0) goto L21
            if (r1 == 0) goto L21
            ta1 r3 = defpackage.on5.a
            t43 r3 = r2.M
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2a
        L21:
            ta1 r3 = defpackage.on5.a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            t43 r0 = r2.N
            r0.setValue(r3)
        L2a:
            if (r1 == 0) goto L3a
            boolean r3 = r2.L
            if (r3 != 0) goto L3a
            t43 r3 = r2.O
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L47
        L3a:
            t43 r3 = r2.P
            r0 = 0
            r3.setValue(r0)
            t43 r2 = r2.Q
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.setValue(r3)
        L47:
            wd5 r2 = defpackage.wd5.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

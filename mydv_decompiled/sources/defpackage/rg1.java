package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rg1 extends k05 implements in1 {
    public ag1 I;
    public byte J;
    public /* synthetic */ ag1 K;
    public /* synthetic */ Object L;
    public final /* synthetic */ hn1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg1(hn1 hn1Var, fj0 fj0Var) {
        super(3, fj0Var);
        this.M = hn1Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rg1 rg1Var = new rg1(this.M, (fj0) obj3);
        rg1Var.K = (ag1) obj;
        rg1Var.L = obj2;
        return rg1Var.invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r0.emit(r8, r7) == r6) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r8 == r6) goto L15;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ag1 r0 = r7.K
            java.lang.Object r1 = r7.L
            byte r2 = r7.J
            r3 = 2
            r4 = 1
            r5 = 0
            el0 r6 = defpackage.el0.I
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.mu0.V(r8)
            goto L44
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r5
        L1b:
            ag1 r0 = r7.I
            defpackage.mu0.V(r8)
            goto L35
        L21:
            defpackage.mu0.V(r8)
            r7.K = r5
            r7.L = r5
            r7.I = r0
            r7.J = r4
            hn1 r8 = r7.M
            java.lang.Object r8 = r8.invoke(r1, r7)
            if (r8 != r6) goto L35
            goto L43
        L35:
            r7.K = r5
            r7.L = r5
            r7.I = r5
            r7.J = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r6) goto L44
        L43:
            return r6
        L44:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

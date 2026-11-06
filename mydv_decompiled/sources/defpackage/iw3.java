package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class iw3 extends k05 implements hn1 {
    public byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ tn5 K;
    public final /* synthetic */ int L;
    public final /* synthetic */ zg2 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ rm1 O;
    public final /* synthetic */ ki1 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw3(tn5 tn5Var, int i, zg2 zg2Var, int i2, rm1 rm1Var, ki1 ki1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = tn5Var;
        this.L = i;
        this.M = zg2Var;
        this.N = i2;
        this.O = rm1Var;
        this.P = ki1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        iw3 iw3Var = new iw3(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var);
        iw3Var.J = obj;
        return iw3Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((iw3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (defpackage.ut0.E(getContext()).E(r7, r6) == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (defpackage.zg2.i(r6.M, r6.N, r6) == r5) goto L20;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.J
            dl0 r0 = (defpackage.dl0) r0
            byte r1 = r6.I
            wd5 r2 = defpackage.wd5.a
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L16
            defpackage.mu0.V(r7)
            goto L54
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L1d:
            defpackage.mu0.V(r7)
            goto L3c
        L21:
            defpackage.mu0.V(r7)
            tn5 r7 = r6.K
            if (r7 != 0) goto L29
            return r2
        L29:
            int r7 = r6.L
            if (r7 < 0) goto L59
            r6.J = r0
            r6.I = r4
            zg2 r7 = r6.M
            int r1 = r6.N
            java.lang.Object r7 = defpackage.zg2.i(r7, r1, r6)
            if (r7 != r5) goto L3c
            goto L53
        L3c:
            yv3 r7 = new yv3
            r7.<init>(r4)
            r6.J = r0
            r6.I = r3
            tk0 r0 = r6.getContext()
            s13 r0 = defpackage.ut0.E(r0)
            java.lang.Object r7 = r0.E(r7, r6)
            if (r7 != r5) goto L54
        L53:
            return r5
        L54:
            ki1 r7 = r6.P
            defpackage.ki1.a(r7)     // Catch: java.lang.Throwable -> L59
        L59:
            rm1 r6 = r6.O
            r6.invoke()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

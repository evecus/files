package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lj5 extends k05 implements hn1 {
    public int I;
    public byte J;
    public final /* synthetic */ is0 K;
    public final /* synthetic */ zd1 L;
    public final /* synthetic */ String M;
    public final /* synthetic */ hu2 N;
    public final /* synthetic */ t43 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj5(is0 is0Var, zd1 zd1Var, String str, hu2 hu2Var, t43 t43Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = is0Var;
        this.L = zd1Var;
        this.M = str;
        this.N = hu2Var;
        this.O = t43Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new lj5(this.K, this.L, this.M, this.N, this.O, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((lj5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r7.N(r2, r6) == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (defpackage.rt0.n(350, r6) == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r7 == r4) goto L22;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.J
            r1 = 3
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L24
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L17
            defpackage.mu0.V(r7)
            h54 r7 = (defpackage.h54) r7
            java.lang.Object r6 = r7.I
            goto L74
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L1e:
            int r0 = r6.I
            defpackage.mu0.V(r7)
            goto L5e
        L24:
            int r0 = r6.I
            defpackage.mu0.V(r7)
            goto L51
        L2a:
            defpackage.mu0.V(r7)
            is0 r7 = r6.K
            bj3 r0 = r7.d
            gk3 r0 = r0.b
            int r0 = r0.h()
            int r0 = r0 + r3
            t43 r5 = r6.O
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r0 >= r5) goto L51
            r6.I = r0
            r6.J = r3
            java.lang.Object r7 = defpackage.jj3.g(r7, r0, r6)
            if (r7 != r4) goto L51
            goto L73
        L51:
            r6.I = r0
            r6.J = r2
            r2 = 350(0x15e, double:1.73E-321)
            java.lang.Object r7 = defpackage.rt0.n(r2, r6)
            if (r7 != r4) goto L5e
            goto L73
        L5e:
            zd1 r7 = r6.L
            java.lang.String r2 = r6.M
            r7.b(r2)
            hu2 r7 = r6.N
            kq5 r7 = r7.g
            r6.I = r0
            r6.J = r1
            java.lang.Object r6 = r7.N(r2, r6)
            if (r6 != r4) goto L74
        L73:
            return r4
        L74:
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

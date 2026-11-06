package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public final /* synthetic */ t33 K;
    public final /* synthetic */ vs3 L;
    public final /* synthetic */ u1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(t33 t33Var, vs3 vs3Var, u1 u1Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = t33Var;
        this.L = vs3Var;
        this.M = u1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new r1(this.K, this.L, this.M, fj0Var, (byte) 0);
            default:
                return new r1(this.K, this.L, this.M, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((r1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (defpackage.rt0.n(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.a(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (defpackage.rt0.n(r4, r10) == r6) goto L31;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.I
            wd5 r1 = defpackage.wd5.a
            u1 r2 = r10.M
            t33 r3 = r10.K
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            el0 r6 = defpackage.el0.I
            r7 = 1
            r8 = 2
            vs3 r9 = r10.L
            switch(r0) {
                case 0: goto L44;
                default: goto L14;
            }
        L14:
            byte r0 = r10.J
            if (r0 == 0) goto L29
            if (r0 == r7) goto L25
            if (r0 != r8) goto L20
            defpackage.mu0.V(r11)
            goto L41
        L20:
            defpackage.zy.i(r5)
            r1 = r4
            goto L43
        L25:
            defpackage.mu0.V(r11)
            goto L37
        L29:
            defpackage.mu0.V(r11)
            long r4 = defpackage.t60.a
            r10.J = r7
            java.lang.Object r11 = defpackage.rt0.n(r4, r10)
            if (r11 != r6) goto L37
            goto L3f
        L37:
            r10.J = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L41
        L3f:
            r1 = r6
            goto L43
        L41:
            r2.V = r9
        L43:
            return r1
        L44:
            byte r0 = r10.J
            if (r0 == 0) goto L59
            if (r0 == r7) goto L55
            if (r0 != r8) goto L50
            defpackage.mu0.V(r11)
            goto L71
        L50:
            defpackage.zy.i(r5)
            r1 = r4
            goto L73
        L55:
            defpackage.mu0.V(r11)
            goto L67
        L59:
            defpackage.mu0.V(r11)
            long r4 = defpackage.t60.a
            r10.J = r7
            java.lang.Object r11 = defpackage.rt0.n(r4, r10)
            if (r11 != r6) goto L67
            goto L6f
        L67:
            r10.J = r8
            java.lang.Object r10 = r3.a(r9, r10)
            if (r10 != r6) goto L71
        L6f:
            r1 = r6
            goto L73
        L71:
            r2.Z = r9
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

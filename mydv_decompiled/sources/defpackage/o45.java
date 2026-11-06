package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o45 extends k05 implements tm1 {
    public byte I;
    public final /* synthetic */ u45 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o45(u45 u45Var, fj0 fj0Var) {
        super(1, fj0Var);
        this.J = u45Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        return new o45(this.J, fj0Var);
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        return ((o45) create((fj0) obj)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r13 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0028, code lost:
    
        if (r5.t(r13) == r6) goto L28;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.I
            r1 = 0
            wd5 r2 = defpackage.wd5.a
            r3 = 2
            r4 = 1
            u45 r5 = r13.J
            el0 r6 = defpackage.el0.I
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 != r3) goto L15
            defpackage.mu0.V(r14)
            goto L6c
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r13)
            return r1
        L1b:
            defpackage.mu0.V(r14)
            goto L2b
        L1f:
            defpackage.mu0.V(r14)
            r13.I = r4
            java.lang.Object r14 = r5.t(r13)
            if (r14 != r6) goto L2b
            goto L6b
        L2b:
            uj3 r14 = r5.f()
            if (r14 == 0) goto L6c
            java.lang.Object r0 = r14.I
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r14.J
            d65 r14 = (defpackage.d65) r14
            long r8 = r14.a
            wn3 r14 = r5.i
            if (r14 == 0) goto L6c
            r13.I = r3
            r11 = r14
            co3 r11 = (defpackage.co3) r11
            int r14 = r12.length()
            if (r14 != 0) goto L4c
            goto L52
        L4c:
            boolean r14 = defpackage.d65.c(r8)
            if (r14 == 0) goto L54
        L52:
            r13 = r2
            goto L65
        L54:
            zn3 r7 = new zn3
            r10 = 0
            r7.<init>(r8, r10, r11, r12)
            tk0 r14 = r11.a
            ao3 r0 = new ao3
            r0.<init>(r11, r7, r1)
            java.lang.Object r13 = defpackage.p70.D0(r14, r0, r13)
        L65:
            if (r13 != r6) goto L68
            goto L69
        L68:
            r13 = r2
        L69:
            if (r13 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r5.A = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o45.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

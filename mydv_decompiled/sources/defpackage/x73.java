package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class x73 extends k05 implements hn1 {
    public byte I;
    public final /* synthetic */ float J;
    public final /* synthetic */ jh4 K;
    public final /* synthetic */ p63 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x73(float f, jh4 jh4Var, p63 p63Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = f;
        this.K = jh4Var;
        this.L = p63Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new x73(this.J, this.K, this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((x73) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (defpackage.j42.c(r3.b.getValue(), r4) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9 != r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
    
        if (r3.o(r4, r3.b.getValue(), r9) == r8) goto L29;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.I
            wd5 r1 = defpackage.wd5.a
            jh4 r3 = r9.K
            r2 = 0
            float r4 = r9.J
            r5 = 2
            r6 = 1
            el0 r8 = defpackage.el0.I
            if (r0 == 0) goto L22
            if (r0 == r6) goto L1e
            if (r0 != r5) goto L17
            defpackage.mu0.V(r10)
            return r1
        L17:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r9)
            r9 = 0
            return r9
        L1e:
            defpackage.mu0.V(r10)
            goto L38
        L22:
            defpackage.mu0.V(r10)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 <= 0) goto L38
            r9.I = r6
            jk3 r10 = r3.b
            java.lang.Object r10 = r10.getValue()
            java.lang.Object r10 = r3.o(r4, r10, r9)
            if (r10 != r8) goto L38
            goto L70
        L38:
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 != 0) goto L71
            r9.I = r5
            ea5 r5 = r3.e
            if (r5 != 0) goto L44
        L42:
            r9 = r1
            goto L6e
        L44:
            jk3 r10 = r3.c
            java.lang.Object r10 = r10.getValue()
            p63 r4 = r9.L
            boolean r10 = defpackage.j42.c(r10, r4)
            if (r10 == 0) goto L5f
            jk3 r10 = r3.b
            java.lang.Object r10 = r10.getValue()
            boolean r10 = defpackage.j42.c(r10, r4)
            if (r10 == 0) goto L5f
            goto L42
        L5f:
            l53 r10 = r3.l
            dh4 r2 = new dh4
            r6 = 0
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r9 = defpackage.l53.a(r10, r2, r9)
            if (r9 != r8) goto L42
        L6e:
            if (r9 != r8) goto L71
        L70:
            return r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

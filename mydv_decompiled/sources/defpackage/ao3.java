package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ao3 extends k05 implements hn1 {
    public m53 I;
    public co3 J;
    public byte K;
    public final /* synthetic */ co3 L;
    public final /* synthetic */ hn1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao3(co3 co3Var, hn1 hn1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = co3Var;
        this.M = hn1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new ao3(this.L, this.M, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ao3) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x003f, code lost:
    
        if (r11.e(r10) == r6) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [m53] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [m53] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v7, types: [m53] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.K
            x41 r1 = defpackage.x41.MILLISECONDS
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            el0 r6 = defpackage.el0.I
            if (r0 == 0) goto L2e
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.mu0.V(r11)
            return r11
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            return r5
        L1c:
            m53 r0 = r10.I
            defpackage.mu0.V(r11)     // Catch: java.lang.Throwable -> L22
            goto L71
        L22:
            r10 = move-exception
            goto L9b
        L25:
            co3 r0 = r10.J
            m53 r4 = r10.I
            defpackage.mu0.V(r11)
            r11 = r4
            goto L42
        L2e:
            defpackage.mu0.V(r11)
            co3 r0 = r10.L
            o53 r11 = r0.e
            r10.I = r11
            r10.J = r0
            r10.K = r4
            java.lang.Object r4 = r11.e(r10)
            if (r4 != r6) goto L42
            goto L99
        L42:
            android.view.textclassifier.TextClassifier r4 = r0.f     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L50
            boolean r7 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L4d
            if (r7 == 0) goto L76
            goto L50
        L4d:
            r10 = move-exception
            r0 = r11
            goto L9b
        L50:
            jp r4 = defpackage.t41.J     // Catch: java.lang.Throwable -> L4d
            r7 = 300(0x12c, double:1.48E-321)
            long r7 = defpackage.sp0.o0(r7, r1)     // Catch: java.lang.Throwable -> L4d
            zg0 r4 = new zg0     // Catch: java.lang.Throwable -> L4d
            r4.<init>(r0, r5, r2)     // Catch: java.lang.Throwable -> L4d
            r10.I = r11     // Catch: java.lang.Throwable -> L4d
            r10.J = r5     // Catch: java.lang.Throwable -> L4d
            r10.K = r3     // Catch: java.lang.Throwable -> L4d
            long r7 = defpackage.rt0.K(r7)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = defpackage.qi4.n(r7, r4, r10)     // Catch: java.lang.Throwable -> L4d
            if (r0 != r6) goto L6e
            goto L99
        L6e:
            r9 = r0
            r0 = r11
            r11 = r9
        L71:
            android.view.textclassifier.TextClassifier r4 = defpackage.hn3.c(r11)     // Catch: java.lang.Throwable -> L22
            r11 = r0
        L76:
            r11.g(r5)
            jp r11 = defpackage.t41.J
            r7 = 200(0xc8, double:9.9E-322)
            long r0 = defpackage.sp0.o0(r7, r1)
            gu2 r11 = new gu2
            hn1 r3 = r10.M
            r7 = 4
            r11.<init>(r4, r3, r5, r7)
            r10.I = r5
            r10.J = r5
            r10.K = r2
            long r0 = defpackage.rt0.K(r0)
            java.lang.Object r10 = defpackage.qi4.n(r0, r11, r10)
            if (r10 != r6) goto L9a
        L99:
            return r6
        L9a:
            return r10
        L9b:
            r0.g(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

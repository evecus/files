package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u00 extends q40 {
    public final hn1 M;

    public /* synthetic */ u00(hn1 hn1Var) {
        this(hn1Var, l91.I, -2, ez.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.q40, defpackage.p40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.bu3 r5, defpackage.fj0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.t00
            if (r0 == 0) goto L13
            r0 = r6
            t00 r0 = (defpackage.t00) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L1a
        L13:
            t00 r0 = new t00
            gj0 r6 = (defpackage.gj0) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            bu3 r5 = r0.I
            defpackage.mu0.V(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L30:
            defpackage.mu0.V(r6)
            r0.I = r5
            r0.L = r3
            java.lang.Object r4 = super.d(r5, r0)
            el0 r6 = defpackage.el0.I
            if (r4 != r6) goto L40
            return r6
        L40:
            iz r4 = r5.M
            boolean r4 = r4.y()
            if (r4 == 0) goto L4b
            wd5 r4 = defpackage.wd5.a
            return r4
        L4b:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.zy.i(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.d(bu3, fj0):java.lang.Object");
    }

    @Override // defpackage.q40, defpackage.p40
    public final p40 e(tk0 tk0Var, int i, ez ezVar) {
        return new u00(this.M, tk0Var, i, ezVar);
    }

    public u00(hn1 hn1Var, tk0 tk0Var, int i, ez ezVar) {
        super(hn1Var, tk0Var, i, ezVar);
        this.M = hn1Var;
    }
}

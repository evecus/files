package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nm4 extends k05 implements hn1 {
    public byte I;
    public /* synthetic */ Object J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ hu2 L;
    public final /* synthetic */ qu2 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm4(boolean z, hu2 hu2Var, qu2 qu2Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.L = hu2Var;
        this.M = qu2Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        nm4 nm4Var = new nm4(this.K, this.L, this.M, fj0Var);
        nm4Var.J = obj;
        return nm4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((nm4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r8 == r1) goto L18;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.J
            dl0 r0 = (defpackage.dl0) r0
            byte r1 = r7.I
            wd5 r2 = defpackage.wd5.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.mu0.V(r8)
            goto L5b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r5
        L1b:
            defpackage.mu0.V(r8)
            return r2
        L1f:
            defpackage.mu0.V(r8)
            hu2 r8 = r7.L
            mb5 r8 = r8.q
            el0 r1 = defpackage.el0.I
            boolean r6 = r7.K
            if (r6 != 0) goto L43
            r7.J = r5
            r7.I = r4
            r8.getClass()
            os0 r0 = defpackage.sx0.a
            ur0 r0 = defpackage.ur0.I
            kb5 r3 = new kb5
            r3.<init>(r8, r5, r4)
            java.lang.Object r7 = defpackage.p70.D0(r0, r3, r7)
            if (r7 != r1) goto L81
            goto L5a
        L43:
            r7.J = r0
            r7.I = r3
            r8.getClass()
            os0 r0 = defpackage.sx0.a
            ur0 r0 = defpackage.ur0.I
            kb5 r3 = new kb5
            r4 = 0
            r3.<init>(r8, r5, r4)
            java.lang.Object r8 = defpackage.p70.D0(r0, r3, r7)
            if (r8 != r1) goto L5b
        L5a:
            return r1
        L5b:
            java.lang.Number r8 = (java.lang.Number) r8
            long r0 = r8.longValue()
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 <= 0) goto L81
            qu2 r7 = r7.M
            jb5 r8 = defpackage.mb5.Companion     // Catch: java.lang.Throwable -> L81
            r8.getClass()     // Catch: java.lang.Throwable -> L81
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "android.media.tv.action.REQUEST_CHANNEL_BROWSABLE"
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = "android.media.tv.extra.CHANNEL_ID"
            android.content.Intent r8 = r8.putExtra(r3, r0)     // Catch: java.lang.Throwable -> L81
            r8.getClass()     // Catch: java.lang.Throwable -> L81
            r7.L0(r8)     // Catch: java.lang.Throwable -> L81
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

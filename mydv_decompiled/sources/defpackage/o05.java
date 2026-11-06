package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o05 extends k05 implements hn1 {
    public byte I;
    public final /* synthetic */ long J;
    public final /* synthetic */ q05 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o05(long j, q05 q05Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = j;
        this.K = q05Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new o05(this.J, this.K, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((o05) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (defpackage.rt0.n(8, r10) == r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        if (defpackage.rt0.n(r3 - 8, r10) == r7) goto L15;
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
            r1 = 8
            long r3 = r10.J
            r5 = 2
            r6 = 1
            el0 r7 = defpackage.el0.I
            if (r0 == 0) goto L1f
            if (r0 == r6) goto L1b
            if (r0 != r5) goto L14
            defpackage.mu0.V(r11)
            goto L36
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r10)
            r10 = 0
            return r10
        L1b:
            defpackage.mu0.V(r11)
            goto L2d
        L1f:
            defpackage.mu0.V(r11)
            long r8 = r3 - r1
            r10.I = r6
            java.lang.Object r11 = defpackage.rt0.n(r8, r10)
            if (r11 != r7) goto L2d
            goto L35
        L2d:
            r10.I = r5
            java.lang.Object r11 = defpackage.rt0.n(r1, r10)
            if (r11 != r7) goto L36
        L35:
            return r7
        L36:
            q05 r10 = r10.K
            k10 r10 = r10.K
            if (r10 == 0) goto L49
            mp3 r11 = new mp3
            r11.<init>(r3)
            g54 r0 = new g54
            r0.<init>(r11)
            r10.resumeWith(r0)
        L49:
            wd5 r10 = defpackage.wd5.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o05.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

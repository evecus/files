package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class zv4 extends k05 implements in1 {
    public byte I;
    public /* synthetic */ ag1 J;
    public /* synthetic */ int K;
    public final /* synthetic */ aw4 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv4(aw4 aw4Var, fj0 fj0Var) {
        super(3, fj0Var);
        this.L = aw4Var;
    }

    @Override // defpackage.in1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        zv4 zv4Var = new zv4(this.L, (fj0) obj3);
        zv4Var.J = (ag1) obj;
        zv4Var.K = intValue;
        return zv4Var.invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r4.emit(defpackage.qn4.K, r16) != r13) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (defpackage.rt0.n(r2, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r4.emit(defpackage.qn4.J, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r4.emit(defpackage.qn4.I, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (defpackage.rt0.n(r14, r16) == r13) goto L34;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            aw4 r1 = r0.L
            long r2 = r1.J
            ag1 r4 = r0.J
            int r5 = r0.K
            byte r6 = r0.I
            r7 = 0
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            el0 r13 = defpackage.el0.I
            if (r6 == 0) goto L37
            if (r6 == r12) goto L33
            if (r6 == r11) goto L2f
            if (r6 == r10) goto L2b
            if (r6 == r9) goto L27
            if (r6 != r8) goto L21
            goto L33
        L21:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r7
        L27:
            defpackage.mu0.V(r17)
            goto L7c
        L2b:
            defpackage.mu0.V(r17)
            goto L6f
        L2f:
            defpackage.mu0.V(r17)
            goto L5a
        L33:
            defpackage.mu0.V(r17)
            goto L8b
        L37:
            defpackage.mu0.V(r17)
            if (r5 <= 0) goto L4b
            r0.J = r7
            r0.K = r5
            r0.I = r12
            qn4 r1 = defpackage.qn4.I
            java.lang.Object r0 = r4.emit(r1, r0)
            if (r0 != r13) goto L8b
            goto L8a
        L4b:
            long r14 = r1.I
            r0.J = r4
            r0.K = r5
            r0.I = r11
            java.lang.Object r1 = defpackage.rt0.n(r14, r0)
            if (r1 != r13) goto L5a
            goto L8a
        L5a:
            r11 = 0
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 <= 0) goto L7c
            r0.J = r4
            r0.K = r5
            r0.I = r10
            qn4 r1 = defpackage.qn4.J
            java.lang.Object r1 = r4.emit(r1, r0)
            if (r1 != r13) goto L6f
            goto L8a
        L6f:
            r0.J = r4
            r0.K = r5
            r0.I = r9
            java.lang.Object r1 = defpackage.rt0.n(r2, r0)
            if (r1 != r13) goto L7c
            goto L8a
        L7c:
            r0.J = r7
            r0.K = r5
            r0.I = r8
            qn4 r1 = defpackage.qn4.K
            java.lang.Object r0 = r4.emit(r1, r0)
            if (r0 != r13) goto L8b
        L8a:
            return r13
        L8b:
            wd5 r0 = defpackage.wd5.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

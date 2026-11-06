package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xg1 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 1;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg1(sn4 sn4Var, zf1 zf1Var, fw4 fw4Var, Object obj, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = sn4Var;
        this.M = zf1Var;
        this.N = fw4Var;
        this.K = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        Object obj4 = this.L;
        switch (b) {
            case 0:
                return new xg1((sn4) obj4, (zf1) obj3, (fw4) obj2, this.K, fj0Var);
            default:
                xg1 xg1Var = new xg1((jh4) obj4, (p63) obj3, (ea5) obj2, fj0Var);
                xg1Var.K = obj;
                return xg1Var;
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
        return ((xg1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r0 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (defpackage.ad4.b(r2, 0.0f, r3, r3, r18, 4) == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        if (r13.collect(r14, r18) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (r13.collect(r14, r18) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
    
        if (defpackage.sp0.L(r0, r2, r18) == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0108, code lost:
    
        if (defpackage.ut0.x(r0, r12, r18) == r6) goto L51;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg1(jh4 jh4Var, p63 p63Var, ea5 ea5Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = jh4Var;
        this.M = p63Var;
        this.N = ea5Var;
    }
}

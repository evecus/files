package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e50 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public byte J;
    public final /* synthetic */ boolean K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(hu2 hu2Var, boolean z, String str, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = hu2Var;
        this.K = z;
        this.M = str;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        boolean z = this.K;
        switch (b) {
            case 0:
                e50 e50Var = new e50((f50) obj2, z, fj0Var);
                e50Var.L = obj;
                return e50Var;
            default:
                return new e50((hu2) this.L, z, (String) obj2, fj0Var);
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
        return ((e50) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0050, code lost:
    
        if (r0 == r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0068, code lost:
    
        if (r0 == r7) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
    
        if (r0 == r7) goto L71;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e50.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(f50 f50Var, boolean z, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = f50Var;
        this.K = z;
    }
}

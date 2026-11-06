package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nc4 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public long J;
    public long K;
    public byte L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc4(Object obj, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.M = obj;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                nc4 nc4Var = new nc4((oc4) this.M, fj0Var, (byte) 0);
                nc4Var.K = ((ji5) obj).a;
                return nc4Var;
            default:
                return new nc4((ye4) this.M, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                long j = ((ji5) obj).a;
                nc4 nc4Var = new nc4((oc4) this.M, (fj0) obj2, (byte) 0);
                nc4Var.K = j;
                return nc4Var.invokeSuspend(wd5Var);
            default:
                return ((nc4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r6.t(true, r14) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (defpackage.rt0.n(r0, r14) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (r15 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

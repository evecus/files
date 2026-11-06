package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uk1 extends f54 implements hn1 {
    public final /* synthetic */ byte J;
    public byte K;
    public /* synthetic */ Object L;
    public Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk1(Object obj, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.J = b;
        this.M = obj;
        this.N = obj2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.J;
        Object obj2 = this.N;
        switch (b) {
            case 0:
                uk1 uk1Var = new uk1((tk0) this.M, (hn1) obj2, fj0Var, (byte) 0);
                uk1Var.L = obj;
                return uk1Var;
            case 1:
                uk1 uk1Var2 = new uk1((s35) obj2, fj0Var);
                uk1Var2.L = obj;
                return uk1Var2;
            default:
                uk1 uk1Var3 = new uk1((lp3) this.M, (r24) obj2, fj0Var, (byte) 2);
                uk1Var3.L = obj;
                return uk1Var3;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        q05 q05Var = (q05) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((uk1) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d2, code lost:
    
        if (defpackage.e21.j(r5, r2, r18) == r7) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r5 != r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r3 == r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013d, code lost:
    
        if (r4 != r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0124, code lost:
    
        if (r3 == r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c1, code lost:
    
        if (defpackage.e21.j(r5, r2, r18) != r7) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab A[Catch: CancellationException -> 0x0192, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0192, blocks: (B:91:0x01ab, B:96:0x01b9, B:104:0x018e, B:106:0x0199), top: B:82:0x0174 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ae -> B:8:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x013d -> B:49:0x0141). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01c1 -> B:74:0x01a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01d2 -> B:74:0x01a5). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk1(s35 s35Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = (byte) 1;
        this.N = s35Var;
    }
}

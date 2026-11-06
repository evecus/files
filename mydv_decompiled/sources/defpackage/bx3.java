package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bx3 extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ gx3 K;
    public final /* synthetic */ String L;
    public final /* synthetic */ long M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ boolean P;
    public final /* synthetic */ n24 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx3(gx3 gx3Var, String str, long j, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var) {
        super(1, fj0Var);
        this.I = (byte) 1;
        this.K = gx3Var;
        this.L = str;
        this.M = j;
        this.N = i;
        this.O = i2;
        this.P = z;
        this.Q = n24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new bx3(this.L, this.K, this.M, this.N, this.O, this.P, this.Q, fj0Var, (byte) 0);
            case 1:
                return new bx3(this.K, this.L, this.M, this.N, this.O, this.P, this.Q, fj0Var);
            default:
                return new bx3(this.L, this.K, this.M, this.N, this.O, this.P, this.Q, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
        }
        return ((bx3) create(fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0282, code lost:
    
        if (r9 != r6.A) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (r9 != r6.A) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
    
        if (r9 == r6.A) goto L89;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx3(String str, gx3 gx3Var, long j, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.L = str;
        this.K = gx3Var;
        this.M = j;
        this.N = i;
        this.O = i2;
        this.P = z;
        this.Q = n24Var;
    }
}

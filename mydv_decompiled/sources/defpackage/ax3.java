package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ax3 extends k05 implements tm1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ gx3 K;
    public final /* synthetic */ long L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ n24 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax3(gx3 gx3Var, long j, int i, int i2, boolean z, n24 n24Var, fj0 fj0Var, byte b) {
        super(1, fj0Var);
        this.I = b;
        this.K = gx3Var;
        this.L = j;
        this.M = i;
        this.N = i2;
        this.O = z;
        this.P = n24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new ax3(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 0);
            case 1:
                return new ax3(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 1);
            default:
                return new ax3(this.K, this.L, this.M, this.N, this.O, this.P, fj0Var, (byte) 2);
        }
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        fj0 fj0Var = (fj0) obj;
        switch (b) {
        }
        return ((ax3) create(fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x015f A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x0020, B:8:0x0042, B:13:0x0050, B:15:0x0058, B:18:0x0063, B:19:0x0069, B:22:0x0075, B:23:0x00a7, B:25:0x00ad, B:27:0x00dc, B:28:0x013d, B:29:0x0159, B:31:0x015f, B:33:0x00eb, B:34:0x0111, B:36:0x0117, B:38:0x0139, B:43:0x0036), top: B:4:0x001c }] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

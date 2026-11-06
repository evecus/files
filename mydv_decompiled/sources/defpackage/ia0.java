package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ia0 extends k05 implements hn1 {
    public Object[] I;
    public k20 J;
    public byte[] K;
    public int L;
    public int M;
    public int N;
    public byte O;
    public /* synthetic */ Object P;
    public final /* synthetic */ zf1[] Q;
    public final /* synthetic */ rm1 R;
    public final /* synthetic */ in1 S;
    public final /* synthetic */ ag1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(zf1[] zf1VarArr, rm1 rm1Var, in1 in1Var, ag1 ag1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.Q = zf1VarArr;
        this.R = rm1Var;
        this.S = in1Var;
        this.T = ag1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        ia0 ia0Var = new ia0(this.Q, this.R, this.S, this.T, fj0Var);
        ia0Var.P = obj;
        return ia0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((ia0) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0133, code lost:
    
        if (r15.invoke(r14, r7, r19) == r9) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce A[LOOP:0: B:18:0x00ce->B:25:0x00ef, LOOP_START, PHI: r3 r14
      0x00ce: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:14:0x00c9, B:25:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r14v6 iz1) = (r14v5 iz1), (r14v10 iz1) binds: [B:14:0x00c9, B:25:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0133 -> B:7:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0138 -> B:9:0x0118). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

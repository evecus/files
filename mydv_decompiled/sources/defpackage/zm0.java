package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zm0 extends k05 implements hn1 {
    public o95 I;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ a74 N;
    public final /* synthetic */ tm1 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm0(fj0 fj0Var, tm1 tm1Var, a74 a74Var, boolean z, boolean z2) {
        super(2, fj0Var);
        this.L = z;
        this.M = z2;
        this.N = a74Var;
        this.O = tm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        zm0 zm0Var = new zm0(fj0Var, this.O, this.N, this.L, this.M);
        zm0Var.K = obj;
        return zm0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((zm0) create((p95) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r12 != r9) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b5  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fs4 extends k05 implements hn1 {
    public o24 I;
    public byte J;
    public final /* synthetic */ is4 K;
    public final /* synthetic */ float L;
    public final /* synthetic */ tm1 M;
    public final /* synthetic */ rb4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs4(is4 is4Var, float f, tm1 tm1Var, rb4 rb4Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = is4Var;
        this.L = f;
        this.M = tm1Var;
        this.N = rb4Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new fs4(this.K, this.L, this.M, this.N, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((fs4) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
    
        if (r1 == r13) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [es4] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

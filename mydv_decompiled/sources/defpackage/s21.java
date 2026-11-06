package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s21 extends f54 implements hn1 {
    public kp3 J;
    public int K;
    public byte L;
    public /* synthetic */ Object M;
    public final /* synthetic */ n24 N;
    public final /* synthetic */ r24 O;
    public final /* synthetic */ r24 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s21(n24 n24Var, r24 r24Var, r24 r24Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = n24Var;
        this.O = r24Var;
        this.P = r24Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        s21 s21Var = new s21(this.N, this.O, this.P, fj0Var);
        s21Var.M = obj;
        return s21Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((s21) create((q05) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r8 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce A[EDGE_INSN: B:70:0x00ce->B:13:0x00ce BREAK  A[LOOP:0: B:7:0x00bb->B:10:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00bd  */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00af -> B:6:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

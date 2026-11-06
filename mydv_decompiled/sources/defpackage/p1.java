package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class p1 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public byte J;
    public final /* synthetic */ long K;
    public Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q24 q24Var, q24 q24Var2, k32 k32Var, long j, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 1;
        this.L = q24Var;
        this.M = q24Var2;
        this.N = k32Var;
        this.K = j;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.N;
        Object obj3 = this.M;
        switch (b) {
            case 0:
                return new p1(obj3, this.K, (t33) obj2, fj0Var, (byte) 0);
            case 1:
                return new p1((q24) this.L, (q24) obj3, (k32) obj2, this.K, fj0Var);
            case 2:
                return new p1((a35) this.L, this.K, (f35) obj3, (z25) obj2, fj0Var);
            default:
                return new p1(obj3, this.K, (t33) obj2, fj0Var, (byte) 3);
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
        return ((p1) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r0.a(r6, r9) == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (r10.a(r1, r9) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        if (new defpackage.n45(r10.K, r9, 0).invokeSuspend(r0) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ed, code lost:
    
        if (defpackage.ry5.o(r9) == r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
    
        if (defpackage.rt0.n((r7 - r5) / 1000000, r9) == r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017f, code lost:
    
        if (r0.a(r1, r9) == r4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0174, code lost:
    
        if (r0.a(r10, r9) == r4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x015d, code lost:
    
        if (r10.W(r9) == r4) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(a35 a35Var, long j, f35 f35Var, z25 z25Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 2;
        this.L = a35Var;
        this.K = j;
        this.M = f35Var;
        this.N = z25Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, long j, t33 t33Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.M = obj;
        this.K = j;
        this.N = t33Var;
    }
}

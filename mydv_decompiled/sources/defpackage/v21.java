package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v21 extends f54 implements hn1 {
    public final /* synthetic */ byte J;
    public byte K;
    public /* synthetic */ Object L;
    public Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ dn1 O;
    public final /* synthetic */ dn1 P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v21(df0 df0Var, j10 j10Var, rd rdVar, vr2 vr2Var, v1 v1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = (byte) 0;
        this.M = df0Var;
        this.N = j10Var;
        this.O = rdVar;
        this.P = vr2Var;
        this.Q = v1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.J;
        Object obj2 = this.Q;
        dn1 dn1Var = this.P;
        dn1 dn1Var2 = this.O;
        Object obj3 = this.N;
        switch (b) {
            case 0:
                v21 v21Var = new v21((df0) this.M, (j10) obj3, (rd) dn1Var2, (vr2) dn1Var, (v1) obj2, fj0Var);
                v21Var.L = obj;
                return v21Var;
            case 1:
                v21 v21Var2 = new v21(obj3, dn1Var2, dn1Var, obj2, fj0Var, (byte) 1);
                v21Var2.L = obj;
                return v21Var2;
            default:
                v21 v21Var3 = new v21(obj3, dn1Var2, dn1Var, obj2, fj0Var, (byte) 2);
                v21Var3.L = obj;
                return v21Var3;
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
        return ((v21) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r4 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r6 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (r0 == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        if (r1 == r9) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        if (r3 == r9) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v21.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v21(Object obj, dn1 dn1Var, dn1 dn1Var2, Object obj2, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.J = b;
        this.N = obj;
        this.O = dn1Var;
        this.P = dn1Var2;
        this.Q = obj2;
    }
}

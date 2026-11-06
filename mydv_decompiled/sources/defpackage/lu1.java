package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lu1 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu1(bh bhVar, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = bhVar;
        this.L = t43Var;
        this.M = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.M;
        Object obj3 = this.L;
        switch (b) {
            case 0:
                return new lu1((bh) this.K, (t43) obj3, (t43) obj2, fj0Var);
            default:
                lu1 lu1Var = new lu1((tk0) obj3, (zf1) obj2, fj0Var);
                lu1Var.K = obj;
                return lu1Var;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        switch (b) {
            case 0:
                return ((lu1) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5Var);
            default:
                return ((lu1) create((au3) obj, (fj0) obj2)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (defpackage.bh.a(r0, r3, r1, null, null, r11, 12) == r8) goto L36;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu1(tk0 tk0Var, zf1 zf1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = tk0Var;
        this.M = zf1Var;
    }
}

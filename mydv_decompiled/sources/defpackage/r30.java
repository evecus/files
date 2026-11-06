package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class r30 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public final /* synthetic */ int J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(int i, t43 t43Var, s33 s33Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = i;
        this.K = t43Var;
        this.L = s33Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.L;
        int i = this.J;
        Object obj3 = this.K;
        switch (b) {
            case 0:
                return new r30(i, (t43) obj3, (s33) obj2, fj0Var);
            default:
                return new r30((String) obj3, i, (cy3) obj2, fj0Var);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((r30) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return wd5Var;
            default:
                return ((r30) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x065e, code lost:
    
        r0 = new defpackage.hp1[]{r7, r3}[1].b;
        r3 = r8 - r0.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0670, code lost:
    
        if (r4 >= r3) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0672, code lost:
    
        r14[r34 + r4] = 0;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0679, code lost:
    
        java.lang.System.arraycopy(r0, 0, r14, r34 + r3, r0.length);
        r0 = new byte[r8];
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0682, code lost:
    
        if (r1 >= r8) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0684, code lost:
    
        r0[r1] = (byte) r14[r6 + r1];
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0796, code lost:
    
        if (r9 < 8) goto L330;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x034b A[LOOP:2: B:68:0x0349->B:69:0x034b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x035c  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r30.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(String str, int i, cy3 cy3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = str;
        this.J = i;
        this.L = cy3Var;
    }
}

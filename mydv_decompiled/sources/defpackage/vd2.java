package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class vd2 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;
    public final /* synthetic */ gc4 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd2(gc4 gc4Var, int i, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = gc4Var;
        this.J = i;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.I) {
            case 0:
                return new vd2((wd2) this.K, this.J, fj0Var, (byte) 0);
            default:
                return new vd2((zg2) this.K, this.J, fj0Var, (byte) 1);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        rb4 rb4Var = (rb4) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((vd2) create(rb4Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((vd2) create(rb4Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return wd5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5 A[LOOP:1: B:31:0x00d3->B:32:0x00d5, LOOP_END] */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

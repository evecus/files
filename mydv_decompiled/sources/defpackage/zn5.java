package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zn5 extends f54 implements hn1 {
    public int J;
    public int K;
    public int L;
    public long M;
    public boolean N;
    public /* synthetic */ Object O;
    public final /* synthetic */ ao5 P;
    public final /* synthetic */ float Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn5(ao5 ao5Var, float f, fj0 fj0Var) {
        super(2, fj0Var);
        this.P = ao5Var;
        this.Q = f;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        zn5 zn5Var = new zn5(this.P, this.Q, fj0Var);
        zn5Var.O = obj;
        return zn5Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((zn5) create((q05) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004a -> B:5:0x004d). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

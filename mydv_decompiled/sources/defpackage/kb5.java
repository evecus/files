package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kb5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public o53 J;
    public mb5 K;
    public boolean L;
    public final /* synthetic */ mb5 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb5(mb5 mb5Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.M = mb5Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        mb5 mb5Var = this.M;
        switch (b) {
            case 0:
                return new kb5(mb5Var, fj0Var, (byte) 0);
            default:
                return new kb5(mb5Var, fj0Var, (byte) 1);
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
        return ((kb5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:6)(2:37|38))(4:39|(2:41|(1:43))|26|27)|7|8|(4:11|(3:13|14|15)(1:17)|16|9)|18|19|(2:21|23)|24|25|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        new java.lang.Integer(android.util.Log.w("TvChannelPublisher", "删除电视频道失败", r0));
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

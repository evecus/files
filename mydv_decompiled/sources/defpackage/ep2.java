package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ep2 extends k05 implements hn1 {
    public final /* synthetic */ byte I = 0;
    public boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ t43 L;
    public final /* synthetic */ t43 M;
    public final /* synthetic */ t43 N;
    public /* synthetic */ Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(boolean z, hu2 hu2Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, hk3 hk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.O = hu2Var;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
        this.P = t43Var4;
        this.Q = t43Var5;
        this.R = t43Var6;
        this.S = hk3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.S;
        Object obj3 = this.R;
        Object obj4 = this.Q;
        Object obj5 = this.P;
        switch (b) {
            case 0:
                return new ep2(this.K, (hu2) this.O, this.L, this.M, this.N, (t43) obj5, (t43) obj4, (t43) obj3, (hk3) obj2, fj0Var);
            default:
                t43 t43Var = this.M;
                t43 t43Var2 = this.N;
                ep2 ep2Var = new ep2(this.K, (ki1) obj5, (ki1) obj4, (ki1) obj3, (ki1) obj2, this.L, t43Var, t43Var2, fj0Var);
                ep2Var.O = obj;
                return ep2Var;
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
        return ((ep2) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f8 -> B:33:0x00fc). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(boolean z, ki1 ki1Var, ki1 ki1Var2, ki1 ki1Var3, ki1 ki1Var4, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = z;
        this.P = ki1Var;
        this.Q = ki1Var2;
        this.R = ki1Var3;
        this.S = ki1Var4;
        this.L = t43Var;
        this.M = t43Var2;
        this.N = t43Var3;
    }
}

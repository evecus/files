package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zf5 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf5(boolean z, boolean z2, pq5 pq5Var, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, t43 t43Var6, fj0 fj0Var) {
        super(2, fj0Var);
        this.I = (byte) 4;
        this.J = z;
        this.M = z2;
        this.K = pq5Var;
        this.P = t43Var;
        this.Q = t43Var2;
        this.R = t43Var3;
        this.L = t43Var4;
        this.N = t43Var5;
        this.O = t43Var6;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        Object obj2 = this.O;
        Object obj3 = this.N;
        Object obj4 = this.L;
        Object obj5 = this.K;
        switch (b) {
            case 0:
                return new zf5((hu2) obj5, (String) obj4, this.M, (it4) obj3, (dl0) obj2, this.P, this.Q, this.R, fj0Var, (byte) 0);
            case 1:
                return new zf5((hu2) obj5, (String) obj4, this.M, (it4) obj3, (dl0) obj2, this.P, this.Q, this.R, fj0Var, (byte) 1);
            case 2:
                return new zf5((hu2) obj5, (String) obj4, this.M, (it4) obj3, (dl0) obj2, this.P, this.Q, this.R, fj0Var, (byte) 2);
            case 3:
                return new zf5((hu2) obj5, (String) obj4, this.M, (it4) obj3, (dl0) obj2, this.P, this.Q, this.R, fj0Var, (byte) 3);
            default:
                return new zf5(this.J, this.M, (pq5) obj5, this.P, this.Q, this.R, (t43) obj4, (t43) obj3, (t43) obj2, fj0Var);
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
                return ((zf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 1:
                return ((zf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 2:
                return ((zf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            case 3:
                return ((zf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
            default:
                ((zf5) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
                return wd5Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (((java.lang.Boolean) ((defpackage.t43) r3).getValue()).booleanValue() == false) goto L20;
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf5(hu2 hu2Var, String str, boolean z, it4 it4Var, dl0 dl0Var, t43 t43Var, t43 t43Var2, t43 t43Var3, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = hu2Var;
        this.L = str;
        this.M = z;
        this.N = it4Var;
        this.O = dl0Var;
        this.P = t43Var;
        this.Q = t43Var2;
        this.R = t43Var3;
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qm5 extends k05 implements hn1 {
    public boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;
    public final /* synthetic */ t43 P;
    public final /* synthetic */ t43 Q;
    public final /* synthetic */ t43 R;
    public final /* synthetic */ hk3 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm5(boolean z, boolean z2, boolean z3, boolean z4, t43 t43Var, t43 t43Var2, t43 t43Var3, t43 t43Var4, t43 t43Var5, hk3 hk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.J = z;
        this.K = z2;
        this.L = z3;
        this.M = z4;
        this.N = t43Var;
        this.O = t43Var2;
        this.P = t43Var3;
        this.Q = t43Var4;
        this.R = t43Var5;
        this.S = hk3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new qm5(this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((qm5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x007c -> B:5:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.I
            wd5 r1 = defpackage.wd5.a
            t43 r2 = r8.N
            r3 = 1
            if (r0 == 0) goto L17
            if (r0 != r3) goto L10
            defpackage.mu0.V(r9)
            goto L7f
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r8)
            r8 = 0
            return r8
        L17:
            defpackage.mu0.V(r9)
            boolean r9 = r8.J
            if (r9 == 0) goto L9d
            ta1 r9 = defpackage.on5.a
            java.lang.Object r9 = r2.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L9d
            boolean r9 = r8.K
            if (r9 == 0) goto L9d
            boolean r9 = r8.L
            if (r9 == 0) goto L35
            goto L9d
        L35:
            boolean r9 = r8.M
            if (r9 != 0) goto L98
            t43 r9 = r8.O
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L98
            t43 r9 = r8.P
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L98
            t43 r9 = r8.Q
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L98
            t43 r9 = r8.R
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L72
            goto L98
        L72:
            r8.I = r3
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r9 = defpackage.rt0.n(r4, r8)
            el0 r0 = defpackage.el0.I
            if (r9 != r0) goto L7f
            return r0
        L7f:
            long r4 = java.lang.System.currentTimeMillis()
            ta1 r9 = defpackage.on5.a
            hk3 r9 = r8.S
            long r6 = r9.h()
            long r4 = r4 - r6
            r6 = 5000(0x1388, double:2.4703E-320)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 < 0) goto L72
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2.setValue(r8)
            return r1
        L98:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r2.setValue(r8)
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

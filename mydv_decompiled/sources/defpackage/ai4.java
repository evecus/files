package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ai4 extends f54 implements hn1 {
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ xj0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai4(xj0 xj0Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = xj0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        ai4 ai4Var = new ai4(this.L, fj0Var);
        ai4Var.K = obj;
        return ai4Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ((ai4) create((q05) obj, (fj0) obj2)).invokeSuspend(wd5.a);
        return el0.I;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002a -> B:5:0x002d). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3.J
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r3.K
            q05 r0 = (defpackage.q05) r0
            defpackage.mu0.V(r4)
            goto L2d
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r3)
            r3 = 0
            return r3
        L16:
            defpackage.mu0.V(r4)
            java.lang.Object r4 = r3.K
            q05 r4 = (defpackage.q05) r4
            r0 = r4
        L1e:
            r3.K = r0
            r3.J = r1
            lp3 r4 = defpackage.lp3.I
            java.lang.Object r4 = r0.b(r4, r3)
            el0 r2 = defpackage.el0.I
            if (r4 != r2) goto L2d
            return r2
        L2d:
            kp3 r4 = (defpackage.kp3) r4
            boolean r4 = defpackage.ci4.a(r4)
            r4 = r4 ^ r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            xj0 r2 = r3.L
            r2.invoke(r4)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

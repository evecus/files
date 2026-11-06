package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class nn5 extends k05 implements hn1 {
    public long I;
    public long J;
    public boolean K;
    public final /* synthetic */ hk3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn5(hk3 hk3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = hk3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        return new nn5(this.L, fj0Var);
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        ((nn5) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
        return el0.I;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0036 -> B:5:0x0039). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            boolean r0 = r14.K
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 1
            if (r0 == 0) goto L18
            if (r0 != r3) goto L11
            long r4 = r14.J
            long r6 = r14.I
            defpackage.mu0.V(r15)
            goto L39
        L11:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r14)
            r14 = 0
            return r14
        L18:
            defpackage.mu0.V(r15)
            int r15 = android.os.Process.myUid()
            long r4 = android.net.TrafficStats.getUidRxBytes(r15)
            long r6 = java.lang.System.currentTimeMillis()
            r12 = r6
            r6 = r4
            r4 = r12
        L2a:
            r14.I = r6
            r14.J = r4
            r14.K = r3
            java.lang.Object r15 = defpackage.rt0.n(r1, r14)
            el0 r0 = defpackage.el0.I
            if (r15 != r0) goto L39
            return r0
        L39:
            int r15 = android.os.Process.myUid()
            long r8 = android.net.TrafficStats.getUidRxBytes(r15)
            long r10 = java.lang.System.currentTimeMillis()
            long r6 = r8 - r6
            long r4 = r10 - r4
            long r6 = r6 / r4
            long r6 = r6 * r1
            ta1 r15 = defpackage.on5.a
            hk3 r15 = r14.L
            r15.i(r6)
            r6 = r8
            r4 = r10
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

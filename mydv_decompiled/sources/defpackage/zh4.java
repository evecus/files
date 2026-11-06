package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class zh4 extends f54 implements hn1 {
    public final /* synthetic */ byte J = 0;
    public long K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh4(long j, q24 q24Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.K = j;
        this.N = q24Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.J;
        Object obj2 = this.N;
        switch (b) {
            case 0:
                zh4 zh4Var = new zh4(this.K, (q24) obj2, fj0Var);
                zh4Var.M = obj;
                return zh4Var;
            default:
                zh4 zh4Var2 = new zh4((rp3) obj2, fj0Var);
                zh4Var2.M = obj;
                return zh4Var2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        q05 q05Var = (q05) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((zh4) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0043 -> B:7:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            byte r0 = r9.J
            java.lang.Object r1 = r9.N
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            el0 r4 = defpackage.el0.I
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            boolean r0 = r9.L
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.K
            java.lang.Object r2 = r9.M
            q05 r2 = (defpackage.q05) r2
            defpackage.mu0.V(r10)
            goto L47
        L1d:
            defpackage.zy.i(r3)
            goto L50
        L21:
            defpackage.mu0.V(r10)
            java.lang.Object r10 = r9.M
            q05 r10 = (defpackage.q05) r10
            rp3 r1 = (defpackage.rp3) r1
            long r0 = r1.b
            gr5 r2 = r10.f()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.M = r2
            r9.K = r0
            r9.L = r5
            r10 = 3
            java.lang.Object r10 = defpackage.z15.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            rp3 r10 = (defpackage.rp3) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            q24 r1 = (defpackage.q24) r1
            boolean r0 = r9.L
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.M
            q05 r9 = (defpackage.q05) r9
            defpackage.mu0.V(r10)
            goto L84
        L61:
            defpackage.zy.i(r3)
            goto Lb6
        L65:
            defpackage.mu0.V(r10)
            java.lang.Object r10 = r9.M
            q05 r10 = (defpackage.q05) r10
            long r2 = r9.K
            rd r0 = new rd
            r6 = 14
            r0.<init>(r1, r6)
            r9.M = r10
            r9.L = r5
            java.lang.Object r9 = defpackage.z21.c(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            rp3 r10 = (defpackage.rp3) r10
            if (r10 == 0) goto L9c
            long r0 = r1.I
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            o11 r2 = defpackage.o11.J
            goto Lb6
        L9c:
            r05 r9 = r9.M
            kp3 r9 = r9.N
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.o70.T0(r9)
            rp3 r9 = (defpackage.rp3) r9
            boolean r10 = defpackage.dq2.o(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            o11 r2 = defpackage.o11.I
            goto Lb6
        Lb4:
            o11 r2 = defpackage.o11.L
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh4(rp3 rp3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = rp3Var;
    }
}

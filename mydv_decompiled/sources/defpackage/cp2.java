package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cp2 extends f54 implements hn1 {
    public final /* synthetic */ byte J;
    public boolean K;
    public /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp2(int i, fj0 fj0Var, byte b) {
        super(i, fj0Var);
        this.J = b;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        switch (this.J) {
            case 0:
                cp2 cp2Var = new cp2(2, fj0Var, (byte) 0);
                cp2Var.L = obj;
                return cp2Var;
            case 1:
                cp2 cp2Var2 = new cp2(2, fj0Var, (byte) 1);
                cp2Var2.L = obj;
                return cp2Var2;
            default:
                cp2 cp2Var3 = new cp2(2, fj0Var, (byte) 2);
                cp2Var3.L = obj;
                return cp2Var3;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        el0 el0Var = el0.I;
        wd5 wd5Var = wd5.a;
        q05 q05Var = (q05) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
            case 0:
                ((cp2) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            case 1:
                ((cp2) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
                break;
            default:
                ((cp2) create(q05Var, fj0Var)).invokeSuspend(wd5Var);
                break;
        }
        return el0Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[LOOP:2: B:43:0x00ab->B:45:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:7:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0066 -> B:24:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x009f -> B:38:0x00a3). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.J
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            el0 r3 = defpackage.el0.I
            r4 = 1
            switch(r0) {
                case 0: goto L82;
                case 1: goto L49;
                default: goto Lb;
            }
        Lb:
            java.lang.Object r0 = r6.L
            q05 r0 = (defpackage.q05) r0
            boolean r5 = r6.K
            if (r5 == 0) goto L1d
            if (r5 != r4) goto L19
            defpackage.mu0.V(r7)
            goto L2c
        L19:
            defpackage.zy.i(r2)
            goto L2b
        L1d:
            defpackage.mu0.V(r7)
        L20:
            r6.L = r0
            r6.K = r4
            java.lang.Object r7 = defpackage.pt1.g(r0, r6)
            if (r7 != r3) goto L2c
            r1 = r3
        L2b:
            return r1
        L2c:
            kp3 r7 = (defpackage.kp3) r7
            int r1 = r7.f
            r2 = 3
            if (r1 != r2) goto L20
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r7.next()
            rp3 r1 = (defpackage.rp3) r1
            r1.a()
            goto L39
        L49:
            java.lang.Object r0 = r6.L
            q05 r0 = (defpackage.q05) r0
            boolean r5 = r6.K
            if (r5 == 0) goto L5b
            if (r5 != r4) goto L57
            defpackage.mu0.V(r7)
            goto L6a
        L57:
            defpackage.zy.i(r2)
            goto L69
        L5b:
            defpackage.mu0.V(r7)
        L5e:
            r6.L = r0
            r6.K = r4
            java.lang.Object r7 = defpackage.pt1.g(r0, r6)
            if (r7 != r3) goto L6a
            r1 = r3
        L69:
            return r1
        L6a:
            kp3 r7 = (defpackage.kp3) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
        L72:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            rp3 r1 = (defpackage.rp3) r1
            r1.a()
            goto L72
        L82:
            java.lang.Object r0 = r6.L
            q05 r0 = (defpackage.q05) r0
            boolean r5 = r6.K
            if (r5 == 0) goto L94
            if (r5 != r4) goto L90
            defpackage.mu0.V(r7)
            goto La3
        L90:
            defpackage.zy.i(r2)
            goto La2
        L94:
            defpackage.mu0.V(r7)
        L97:
            r6.L = r0
            r6.K = r4
            java.lang.Object r7 = defpackage.pt1.g(r0, r6)
            if (r7 != r3) goto La3
            r1 = r3
        La2:
            return r1
        La3:
            kp3 r7 = (defpackage.kp3) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
        Lab:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r7.next()
            rp3 r1 = (defpackage.rp3) r1
            r1.a()
            goto Lab
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cp2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

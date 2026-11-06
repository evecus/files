package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d extends f54 implements hn1 {
    public final /* synthetic */ byte J = 0;
    public Object K;
    public boolean L;
    public /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ke1 ke1Var, ok3 ok3Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.M = ke1Var;
        this.N = ok3Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.J;
        Object obj2 = this.N;
        switch (b) {
            case 0:
                d dVar = new d((ke1) this.M, (ok3) obj2, fj0Var);
                dVar.K = obj;
                return dVar;
            default:
                d dVar2 = new d((rm1) obj2, fj0Var);
                dVar2.M = obj;
                return dVar2;
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.J;
        wd5 wd5Var = wd5.a;
        pj4 pj4Var = (pj4) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((d) create(pj4Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:7:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            byte r0 = r13.J
            wd5 r1 = defpackage.wd5.a
            java.lang.Object r2 = r13.N
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            el0 r4 = defpackage.el0.I
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r13.L
            if (r0 == 0) goto L24
            if (r0 != r5) goto L1f
            java.lang.Object r0 = r13.K
            java.lang.Object r3 = r13.M
            pj4 r3 = (defpackage.pj4) r3
            defpackage.mu0.V(r14)
            goto L41
        L1f:
            defpackage.zy.i(r3)
            r1 = r6
            goto L43
        L24:
            defpackage.mu0.V(r14)
            java.lang.Object r14 = r13.M
            pj4 r14 = (defpackage.pj4) r14
            r3 = r14
        L2c:
            r14 = r2
            rm1 r14 = (defpackage.rm1) r14
            java.lang.Object r14 = r14.invoke()
            if (r14 == 0) goto L40
            r13.M = r3
            r13.K = r14
            r13.L = r5
            r3.d(r13, r14)
            r1 = r4
            goto L43
        L40:
            r0 = r6
        L41:
            if (r0 != 0) goto L2c
        L43:
            return r1
        L44:
            boolean r0 = r13.L
            if (r0 == 0) goto L53
            if (r0 != r5) goto L4e
            defpackage.mu0.V(r14)
            goto L74
        L4e:
            defpackage.zy.i(r3)
            r1 = r6
            goto L74
        L53:
            defpackage.mu0.V(r14)
            java.lang.Object r14 = r13.K
            r6 = r14
            pj4 r6 = (defpackage.pj4) r6
            java.lang.Object r14 = r13.M
            r7 = r14
            ke1 r7 = (defpackage.ke1) r7
            pp r8 = new pp
            r8.<init>()
            r9 = r2
            ok3 r9 = (defpackage.ok3) r9
            r13.L = r5
            r10 = 0
            r11 = 1
            r12 = r13
            java.lang.Object r13 = defpackage.qb.x(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r4) goto L74
            r1 = r4
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rm1 rm1Var, fj0 fj0Var) {
        super(2, fj0Var);
        this.N = rm1Var;
    }
}

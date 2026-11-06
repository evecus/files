package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dh extends k05 implements hn1 {
    public fz I;
    public boolean J;
    public /* synthetic */ Object K;
    public final /* synthetic */ k20 L;
    public final /* synthetic */ bh M;
    public final /* synthetic */ t43 N;
    public final /* synthetic */ t43 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(k20 k20Var, bh bhVar, t43 t43Var, t43 t43Var2, fj0 fj0Var) {
        super(2, fj0Var);
        this.L = k20Var;
        this.M = bhVar;
        this.N = t43Var;
        this.O = t43Var2;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        dh dhVar = new dh(this.L, this.M, this.N, this.O, fj0Var);
        dhVar.K = obj;
        return dhVar;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((dh) create((dl0) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            boolean r0 = r13.J
            r1 = 0
            k20 r2 = r13.L
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 != r3) goto L14
            fz r0 = r13.I
            java.lang.Object r4 = r13.K
            dl0 r4 = (defpackage.dl0) r4
            defpackage.mu0.V(r14)
            goto L35
        L14:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r13)
            return r1
        L1a:
            defpackage.mu0.V(r14)
            java.lang.Object r14 = r13.K
            dl0 r14 = (defpackage.dl0) r14
            fz r0 = r2.iterator()
            r4 = r14
        L26:
            r13.K = r4
            r13.I = r0
            r13.J = r3
            java.lang.Object r14 = r0.a(r13)
            el0 r5 = defpackage.el0.I
            if (r14 != r5) goto L35
            return r5
        L35:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L60
            java.lang.Object r14 = r0.c()
            java.lang.Object r5 = r2.f()
            java.lang.Object r5 = defpackage.a50.a(r5)
            if (r5 != 0) goto L4d
            r7 = r14
            goto L4e
        L4d:
            r7 = r5
        L4e:
            ch r6 = new ch
            r11 = 0
            r12 = 0
            bh r8 = r13.M
            t43 r9 = r13.N
            t43 r10 = r13.O
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14 = 3
            defpackage.p70.g0(r4, r1, r1, r6, r14)
            goto L26
        L60:
            wd5 r13 = defpackage.wd5.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

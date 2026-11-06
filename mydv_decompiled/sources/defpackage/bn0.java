package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class bn0 extends k05 implements hn1 {
    public o95 I;
    public byte J;
    public /* synthetic */ Object K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ a74 M;
    public final /* synthetic */ tm1 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(fj0 fj0Var, tm1 tm1Var, a74 a74Var, boolean z) {
        super(2, fj0Var);
        this.L = z;
        this.M = a74Var;
        this.N = tm1Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        bn0 bn0Var = new bn0(fj0Var, this.N, this.M, this.L);
        bn0Var.K = obj;
        return bn0Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((bn0) create((p95) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r12 != r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.J
            tm1 r1 = r11.N
            if (r0 == 0) goto L99
            r2 = 0
            a74 r3 = r11.M
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            el0 r8 = defpackage.el0.I
            if (r0 == r7) goto L36
            if (r0 == r6) goto L2c
            if (r0 == r5) goto L24
            if (r0 != r4) goto L1e
            java.lang.Object r11 = r11.K
            defpackage.mu0.V(r12)
            goto L82
        L1e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            return r2
        L24:
            java.lang.Object r0 = r11.K
            p95 r0 = (defpackage.p95) r0
            defpackage.mu0.V(r12)
            goto L70
        L2c:
            o95 r0 = r11.I
            java.lang.Object r6 = r11.K
            p95 r6 = (defpackage.p95) r6
            defpackage.mu0.V(r12)
            goto L59
        L36:
            o95 r0 = r11.I
            java.lang.Object r9 = r11.K
            p95 r9 = (defpackage.p95) r9
            defpackage.mu0.V(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L5c
            e52 r12 = r3.f()
            r11.K = r9
            r11.I = r0
            r11.J = r6
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r8) goto L58
            goto L7e
        L58:
            r6 = r9
        L59:
            r12 = r0
            r0 = r6
            goto L5e
        L5c:
            r12 = r0
            r0 = r9
        L5e:
            ym0 r6 = new ym0
            r6.<init>(r7, r2, r1)
            r11.K = r0
            r11.I = r2
            r11.J = r5
            java.lang.Object r12 = r0.a(r12, r6, r11)
            if (r12 != r8) goto L70
            goto L7e
        L70:
            boolean r1 = r11.L
            if (r1 != 0) goto L98
            r11.K = r12
            r11.J = r4
            java.lang.Object r11 = r0.d(r11)
            if (r11 != r8) goto L7f
        L7e:
            return r8
        L7f:
            r10 = r12
            r12 = r11
            r11 = r10
        L82:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L97
            e52 r12 = r3.f()
            fb5 r0 = r12.b
            u7 r1 = r12.e
            d52 r12 = r12.f
            r0.c(r1, r12)
        L97:
            return r11
        L98:
            return r12
        L99:
            defpackage.mu0.V(r12)
            java.lang.Object r11 = r11.K
            p95 r11 = (defpackage.p95) r11
            r11.getClass()
            h04 r11 = (defpackage.h04) r11
            o84 r11 = r11.c()
            java.lang.Object r11 = r1.invoke(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

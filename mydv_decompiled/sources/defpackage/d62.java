package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d62 extends f54 implements hn1 {
    public pa3 J;
    public d60 K;
    public int L;
    public int M;
    public byte N;
    public /* synthetic */ Object O;
    public final /* synthetic */ e62 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d62(fj0 fj0Var, e62 e62Var) {
        super(2, fj0Var);
        this.P = e62Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        d62 d62Var = new d62(fj0Var, this.P);
        d62Var.O = obj;
        return d62Var;
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        return ((d62) create((pj4) obj, (fj0) obj2)).invokeSuspend(wd5.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0061 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.O
            pj4 r0 = (defpackage.pj4) r0
            byte r1 = r7.N
            r2 = 2
            r3 = 1
            r4 = 0
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L27
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1d
            int r1 = r7.M
            int r3 = r7.L
            d60 r4 = r7.K
            pa3 r6 = r7.J
            defpackage.mu0.V(r8)
            goto L77
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r4
        L23:
            defpackage.mu0.V(r8)
            goto L7c
        L27:
            defpackage.mu0.V(r8)
            e62 r8 = r7.P
            java.lang.Object r8 = r8.H()
            boolean r1 = r8 instanceof defpackage.d60
            if (r1 == 0) goto L40
            d60 r8 = (defpackage.d60) r8
            e62 r8 = r8.M
            r7.O = r4
            r7.N = r3
            r0.d(r7, r8)
            return r5
        L40:
            boolean r1 = r8 instanceof defpackage.wy1
            if (r1 == 0) goto L7c
            wy1 r8 = (defpackage.wy1) r8
            pa3 r8 = r8.b()
            if (r8 == 0) goto L7c
            java.lang.Object r1 = r8.f()
            r1.getClass()
            ar2 r1 = (defpackage.ar2) r1
            r3 = 0
            r6 = r8
            r4 = r1
            r1 = r3
        L59:
            boolean r8 = r4.equals(r6)
            if (r8 != 0) goto L7c
            boolean r8 = r4 instanceof defpackage.d60
            if (r8 == 0) goto L77
            d60 r4 = (defpackage.d60) r4
            e62 r8 = r4.M
            r7.O = r0
            r7.J = r6
            r7.K = r4
            r7.L = r3
            r7.M = r1
            r7.N = r2
            r0.d(r7, r8)
            return r5
        L77:
            ar2 r4 = r4.g()
            goto L59
        L7c:
            wd5 r7 = defpackage.wd5.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d62.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

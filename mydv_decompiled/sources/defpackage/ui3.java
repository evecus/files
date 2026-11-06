package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ui3 extends k05 implements hn1 {
    public final /* synthetic */ byte I;
    public boolean J;
    public final /* synthetic */ is0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui3(is0 is0Var, fj0 fj0Var, byte b) {
        super(2, fj0Var);
        this.I = b;
        this.K = is0Var;
    }

    @Override // defpackage.fu
    public final fj0 create(Object obj, fj0 fj0Var) {
        byte b = this.I;
        is0 is0Var = this.K;
        switch (b) {
            case 0:
                return new ui3(is0Var, fj0Var, (byte) 0);
            case 1:
                return new ui3(is0Var, fj0Var, (byte) 1);
            case 2:
                return new ui3(is0Var, fj0Var, (byte) 2);
            default:
                return new ui3(is0Var, fj0Var, (byte) 3);
        }
    }

    @Override // defpackage.hn1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        dl0 dl0Var = (dl0) obj;
        fj0 fj0Var = (fj0) obj2;
        switch (b) {
        }
        return ((ui3) create(dl0Var, fj0Var)).invokeSuspend(wd5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        r7 = r2.f(r8.b.h() + 1, defpackage.qb.g0(0.0f, 0.0f, null, 7), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        r7 = r2.f(r8.b.h() - 1, defpackage.qb.g0(0.0f, 0.0f, null, 7), r7);
     */
    @Override // defpackage.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            byte r0 = r7.I
            wd5 r1 = defpackage.wd5.a
            is0 r2 = r7.K
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            el0 r4 = defpackage.el0.I
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L94;
                case 1: goto L5c;
                case 2: goto L34;
                default: goto Lf;
            }
        Lf:
            boolean r0 = r7.J
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L19
            defpackage.mu0.V(r8)
            goto L33
        L19:
            defpackage.zy.i(r3)
            r1 = r6
            goto L33
        L1e:
            defpackage.mu0.V(r8)
            bj3 r8 = r2.d
            gk3 r8 = r8.b
            int r8 = r8.h()
            int r8 = r8 + r5
            r7.J = r5
            java.lang.Object r7 = defpackage.jj3.g(r2, r8, r7)
            if (r7 != r4) goto L33
            r1 = r4
        L33:
            return r1
        L34:
            boolean r0 = r7.J
            if (r0 == 0) goto L43
            if (r0 != r5) goto L3e
            defpackage.mu0.V(r8)
            goto L5b
        L3e:
            defpackage.zy.i(r3)
            r1 = r6
            goto L5b
        L43:
            defpackage.mu0.V(r8)
            r7.J = r5
            yf r8 = new yf
            r0 = 2
            r8.<init>(r0, r6, r0)
            d53 r0 = defpackage.d53.I
            java.lang.Object r7 = defpackage.jj3.s(r2, r0, r8, r7)
            if (r7 != r4) goto L57
            goto L58
        L57:
            r7 = r1
        L58:
            if (r7 != r4) goto L5b
            r1 = r4
        L5b:
            return r1
        L5c:
            boolean r0 = r7.J
            if (r0 == 0) goto L6b
            if (r0 != r5) goto L66
            defpackage.mu0.V(r8)
            goto L93
        L66:
            defpackage.zy.i(r3)
            r1 = r6
            goto L93
        L6b:
            defpackage.mu0.V(r8)
            bj3 r8 = r2.d
            r7.J = r5
            mj3 r0 = defpackage.nj3.a
            gk3 r0 = r8.b
            int r0 = r0.h()
            int r0 = r0 + r5
            int r3 = r2.l()
            if (r0 >= r3) goto L8f
            gk3 r8 = r8.b
            int r8 = r8.h()
            int r8 = r8 + r5
            java.lang.Object r7 = defpackage.jj3.g(r2, r8, r7)
            if (r7 != r4) goto L8f
            goto L90
        L8f:
            r7 = r1
        L90:
            if (r7 != r4) goto L93
            r1 = r4
        L93:
            return r1
        L94:
            boolean r0 = r7.J
            if (r0 == 0) goto La3
            if (r0 != r5) goto L9e
            defpackage.mu0.V(r8)
            goto Lc7
        L9e:
            defpackage.zy.i(r3)
            r1 = r6
            goto Lc7
        La3:
            defpackage.mu0.V(r8)
            bj3 r8 = r2.d
            r7.J = r5
            mj3 r0 = defpackage.nj3.a
            gk3 r0 = r8.b
            int r0 = r0.h()
            int r0 = r0 - r5
            if (r0 < 0) goto Lc3
            gk3 r8 = r8.b
            int r8 = r8.h()
            int r8 = r8 - r5
            java.lang.Object r7 = defpackage.jj3.g(r2, r8, r7)
            if (r7 != r4) goto Lc3
            goto Lc4
        Lc3:
            r7 = r1
        Lc4:
            if (r7 != r4) goto Lc7
            r1 = r4
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

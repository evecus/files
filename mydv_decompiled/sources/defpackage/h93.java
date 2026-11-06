package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h93 extends k13 implements la5, a93 {
    public a93 I;
    public d93 J;
    public h93 K;
    public final String L;

    public h93(a93 a93Var, d93 d93Var) {
        this.I = a93Var;
        this.J = d93Var == null ? new d93() : d93Var;
        this.L = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // defpackage.a93
    public final long C(int i, long j) {
        h93 k0 = isAttached() ? k0() : null;
        long C = k0 != null ? k0.C(i, j) : 0L;
        return pd3.f(C, this.I.C(i, pd3.e(j, C)));
    }

    @Override // defpackage.a93
    public final long V(int i, long j, long j2) {
        long V = this.I.V(i, j, j2);
        h93 k0 = isAttached() ? k0() : null;
        return pd3.f(V, k0 != null ? k0.V(i, pd3.f(j, V), pd3.e(j2, V)) : 0L);
    }

    @Override // defpackage.la5
    public final Object g() {
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.a93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(long r13, long r15, defpackage.fj0 r17) {
        /*
            r12 = this;
            r1 = r17
            boolean r2 = r1 instanceof defpackage.f93
            if (r2 == 0) goto L16
            r2 = r1
            f93 r2 = (defpackage.f93) r2
            int r3 = r2.M
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.M = r3
        L14:
            r8 = r2
            goto L1e
        L16:
            f93 r2 = new f93
            gj0 r1 = (defpackage.gj0) r1
            r2.<init>(r12, r1)
            goto L14
        L1e:
            java.lang.Object r1 = r8.K
            int r2 = r8.M
            r9 = 0
            r10 = 2
            r3 = 1
            el0 r11 = defpackage.el0.I
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r10) goto L33
            long r2 = r8.I
            defpackage.mu0.V(r1)
            goto L8c
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r9
        L39:
            long r2 = r8.J
            long r4 = r8.I
            defpackage.mu0.V(r1)
            goto L58
        L41:
            defpackage.mu0.V(r1)
            a93 r1 = r12.I
            r8.I = r13
            r6 = r15
            r8.J = r6
            r8.M = r3
            r4 = r13
            r3 = r1
            java.lang.Object r1 = r3.g0(r4, r6, r8)
            if (r1 != r11) goto L56
            goto L8a
        L56:
            r4 = r13
            r2 = r15
        L58:
            ji5 r1 = (defpackage.ji5) r1
            long r6 = r1.j()
            boolean r1 = r12.isAttached()
            if (r1 == 0) goto L6f
            boolean r1 = r12.isAttached()
            if (r1 == 0) goto L71
            h93 r9 = r12.k0()
            goto L71
        L6f:
            h93 r9 = r12.K
        L71:
            if (r9 == 0) goto L94
            long r0 = defpackage.ji5.g(r4, r6)
            long r2 = defpackage.ji5.f(r2, r6)
            r8.I = r6
            r8.M = r10
            r13 = r0
            r15 = r2
            r17 = r8
            r12 = r9
            java.lang.Object r1 = r12.g0(r13, r15, r17)
            if (r1 != r11) goto L8b
        L8a:
            return r11
        L8b:
            r2 = r6
        L8c:
            ji5 r1 = (defpackage.ji5) r1
            long r0 = r1.j()
            r6 = r2
            goto L96
        L94:
            r0 = 0
        L96:
            long r0 = defpackage.ji5.g(r6, r0)
            ji5 r0 = defpackage.ji5.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h93.g0(long, long, fj0):java.lang.Object");
    }

    public final dl0 j0() {
        h93 k0 = k0();
        dl0 j0 = k0 != null ? k0.j0() : null;
        if (j0 != null && i42.u0(j0)) {
            return j0;
        }
        dl0 dl0Var = this.J.d;
        if (dl0Var != null) {
            return dl0Var;
        }
        zy.i("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final h93 k0() {
        ja3 ja3Var;
        la5 la5Var = null;
        if (!isAttached()) {
            return null;
        }
        if (!getNode().isAttached()) {
            q02.b("visitAncestors called on an unattached node");
        }
        k13 parent$ui = getNode().getParent$ui();
        wa2 U = ut0.U(this);
        loop0: while (true) {
            if (U == null) {
                break;
            }
            if ((U.n0.f.getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        k13 k13Var = parent$ui;
                        b53 b53Var = null;
                        while (k13Var != null) {
                            if (k13Var instanceof la5) {
                                la5 la5Var2 = (la5) k13Var;
                                if (j42.c(this.L, la5Var2.g()) && h93.class == la5Var2.getClass()) {
                                    la5Var = la5Var2;
                                    break loop0;
                                }
                            }
                            if ((k13Var.getKindSet$ui() & 262144) != 0 && (k13Var instanceof wt0)) {
                                int i = 0;
                                for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                                    if ((k13Var2.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            k13Var = k13Var2;
                                        } else {
                                            if (b53Var == null) {
                                                b53Var = new b53(new k13[16]);
                                            }
                                            if (k13Var != null) {
                                                b53Var.c(k13Var);
                                                k13Var = null;
                                            }
                                            b53Var.c(k13Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            k13Var = ut0.M(b53Var);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            U = U.v();
            parent$ui = (U == null || (ja3Var = U.n0) == null) ? null : ja3Var.e;
        }
        return (h93) la5Var;
    }

    @Override // defpackage.k13
    public final void onAttach() {
        d93 d93Var = this.J;
        d93Var.a = this;
        d93Var.b = null;
        this.K = null;
        d93Var.c = new eq(this, (byte) 22);
        d93Var.d = getCoroutineScope();
    }

    @Override // defpackage.k13
    public final void onDetach() {
        r24 r24Var = new r24();
        ad4.D(this, new ga(r24Var, (byte) 3));
        h93 h93Var = (h93) ((la5) r24Var.I);
        this.K = h93Var;
        d93 d93Var = this.J;
        d93Var.b = h93Var;
        if (d93Var.a == this) {
            d93Var.a = null;
            d93Var.d = null;
            d93Var.c = mw2.h;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.a93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(long r7, defpackage.fj0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.g93
            if (r0 == 0) goto L13
            r0 = r9
            g93 r0 = (defpackage.g93) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L1a
        L13:
            g93 r0 = new g93
            gj0 r9 = (defpackage.gj0) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            long r6 = r0.I
            defpackage.mu0.V(r9)
            goto L70
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L35:
            long r7 = r0.I
            defpackage.mu0.V(r9)
            goto L55
        L3b:
            defpackage.mu0.V(r9)
            boolean r9 = r6.isAttached()
            if (r9 == 0) goto L48
            h93 r2 = r6.k0()
        L48:
            if (r2 == 0) goto L5c
            r0.I = r7
            r0.L = r4
            java.lang.Object r9 = r2.w(r7, r0)
            if (r9 != r5) goto L55
            goto L6e
        L55:
            ji5 r9 = (defpackage.ji5) r9
            long r1 = r9.j()
            goto L5e
        L5c:
            r1 = 0
        L5e:
            a93 r6 = r6.I
            long r7 = defpackage.ji5.f(r7, r1)
            r0.I = r1
            r0.L = r3
            java.lang.Object r9 = r6.w(r7, r0)
            if (r9 != r5) goto L6f
        L6e:
            return r5
        L6f:
            r6 = r1
        L70:
            ji5 r9 = (defpackage.ji5) r9
            long r8 = r9.j()
            long r6 = defpackage.ji5.g(r6, r8)
            ji5 r6 = defpackage.ji5.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h93.w(long, fj0):java.lang.Object");
    }
}

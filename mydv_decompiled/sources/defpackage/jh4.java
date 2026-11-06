package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jh4 extends ss4 {
    public static final dj s = new dj(0.0f);
    public static final dj t = new dj(1.0f);
    public final jk3 b;
    public final jk3 c;
    public Object d;
    public ea5 e;
    public long f;
    public final q94 g;
    public kt4 h;
    public final fk3 i;
    public k10 j;
    public final o53 k;
    public final l53 l;
    public long m;
    public final e43 n;
    public ch4 o;
    public final bh4 p;
    public float q;
    public final bh4 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v6, types: [bh4] */
    /* JADX WARN: Type inference failed for: r4v7, types: [bh4] */
    public jh4(p63 p63Var) {
        super((byte) 1);
        final byte b = 1;
        this.b = ad4.w(p63Var);
        this.c = ad4.w(p63Var);
        this.d = p63Var;
        this.g = new q94(this, (byte) 3);
        this.i = new fk3(0.0f);
        this.k = new o53();
        this.l = new l53();
        this.m = Long.MIN_VALUE;
        this.n = new e43();
        final byte b2 = 0;
        this.p = new tm1(this) { // from class: bh4
            public final /* synthetic */ jh4 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                wd5 wd5Var = wd5.a;
                jh4 jh4Var = this.J;
                long longValue = ((Long) obj).longValue();
                switch (b3) {
                    case 0:
                        jh4Var.m = longValue;
                        break;
                    default:
                        long j = longValue - jh4Var.m;
                        jh4Var.m = longValue;
                        long Q = mw2.Q(j / jh4Var.q);
                        e43 e43Var = jh4Var.n;
                        if (e43Var.j()) {
                            Object[] objArr = e43Var.a;
                            int i = e43Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                ch4 ch4Var = (ch4) objArr[i3];
                                jh4.m(ch4Var, Q);
                                ch4Var.j(true);
                            }
                            ea5 ea5Var = jh4Var.e;
                            if (ea5Var != null) {
                                ea5Var.r();
                            }
                            int i4 = e43Var.b;
                            Object[] objArr2 = e43Var.a;
                            u22 c0 = ut0.c0(0, i4);
                            int i5 = c0.I;
                            int i6 = c0.J;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((ch4) objArr2[i5]).h()) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            dq.X0(i4 - i2, i4, null, objArr2);
                            e43Var.b -= i2;
                        }
                        ch4 ch4Var2 = jh4Var.o;
                        if (ch4Var2 != null) {
                            ch4Var2.k(jh4Var.f);
                            jh4.m(ch4Var2, Q);
                            jh4Var.q(ch4Var2.g());
                            if (ch4Var2.g() == 1.0f) {
                                jh4Var.o = null;
                            }
                            jh4Var.p();
                            break;
                        }
                        break;
                }
                return wd5Var;
            }
        };
        this.r = new tm1(this) { // from class: bh4
            public final /* synthetic */ jh4 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                byte b3 = b;
                wd5 wd5Var = wd5.a;
                jh4 jh4Var = this.J;
                long longValue = ((Long) obj).longValue();
                switch (b3) {
                    case 0:
                        jh4Var.m = longValue;
                        break;
                    default:
                        long j = longValue - jh4Var.m;
                        jh4Var.m = longValue;
                        long Q = mw2.Q(j / jh4Var.q);
                        e43 e43Var = jh4Var.n;
                        if (e43Var.j()) {
                            Object[] objArr = e43Var.a;
                            int i = e43Var.b;
                            int i2 = 0;
                            for (int i3 = 0; i3 < i; i3++) {
                                ch4 ch4Var = (ch4) objArr[i3];
                                jh4.m(ch4Var, Q);
                                ch4Var.j(true);
                            }
                            ea5 ea5Var = jh4Var.e;
                            if (ea5Var != null) {
                                ea5Var.r();
                            }
                            int i4 = e43Var.b;
                            Object[] objArr2 = e43Var.a;
                            u22 c0 = ut0.c0(0, i4);
                            int i5 = c0.I;
                            int i6 = c0.J;
                            if (i5 <= i6) {
                                while (true) {
                                    objArr2[i5 - i2] = objArr2[i5];
                                    if (((ch4) objArr2[i5]).h()) {
                                        i2++;
                                    }
                                    if (i5 != i6) {
                                        i5++;
                                    }
                                }
                            }
                            dq.X0(i4 - i2, i4, null, objArr2);
                            e43Var.b -= i2;
                        }
                        ch4 ch4Var2 = jh4Var.o;
                        if (ch4Var2 != null) {
                            ch4Var2.k(jh4Var.f);
                            jh4.m(ch4Var2, Q);
                            jh4Var.q(ch4Var2.g());
                            if (ch4Var2.g() == 1.0f) {
                                jh4Var.o = null;
                            }
                            jh4Var.p();
                            break;
                        }
                        break;
                }
                return wd5Var;
            }
        };
    }

    public static void m(ch4 ch4Var, long j) {
        long e = ch4Var.e() + j;
        ch4Var.l(e);
        long b = ch4Var.b();
        if (e >= b) {
            ch4Var.m(1.0f);
            return;
        }
        xh5 a = ch4Var.a();
        if (a == null) {
            float f = e / b;
            ch4Var.m((f * 1.0f) + ((1.0f - f) * ch4Var.f().a(0)));
            return;
        }
        dj f2 = ch4Var.f();
        dj d = ch4Var.d();
        if (d == null) {
            d = s;
        }
        ch4Var.m(ut0.q(((dj) a.i(e, f2, t, d)).a(0), 0.0f, 1.0f));
    }

    @Override // defpackage.ss4
    public final Object d() {
        return this.c.getValue();
    }

    @Override // defpackage.ss4
    public final void g(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.ss4
    public final void h(ea5 ea5Var) {
        ea5 ea5Var2 = this.e;
        if (ea5Var2 != null && !ea5Var.equals(ea5Var2)) {
            lr3.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + ea5Var);
        }
        this.e = ea5Var;
    }

    @Override // defpackage.ss4
    public final void i() {
        this.e = null;
        kt4 kt4Var = this.h;
        if (kt4Var != null) {
            kt4Var.b(this);
        }
    }

    public final Object j(gj0 gj0Var) {
        float r = ad4.r(gj0Var.getContext());
        wd5 wd5Var = wd5.a;
        if (r <= 0.0f) {
            k();
            return wd5Var;
        }
        this.q = r;
        Object E = ut0.E(gj0Var.getContext()).E(this.r, gj0Var);
        return E == el0.I ? E : wd5Var;
    }

    public final void k() {
        ea5 ea5Var = this.e;
        if (ea5Var != null) {
            ea5Var.c();
        }
        this.n.d();
        if (this.o != null) {
            this.o = null;
            q(1.0f);
            p();
        }
    }

    public final void l() {
        ea5 ea5Var = this.e;
        if (ea5Var == null) {
            return;
        }
        ch4 ch4Var = this.o;
        if (ch4Var == null) {
            if (this.f > 0) {
                fk3 fk3Var = this.i;
                if (fk3Var.h() != 1.0f && !j42.c(this.c.getValue(), this.b.getValue())) {
                    ch4 ch4Var2 = new ch4();
                    ch4Var2.m(fk3Var.h());
                    long j = this.f;
                    ch4Var2.k(j);
                    ch4Var2.i(mw2.Q((1.0d - fk3Var.h()) * j));
                    ch4Var2.f().e(fk3Var.h(), 0);
                    ch4Var = ch4Var2;
                }
            }
            ch4Var = null;
        }
        if (ch4Var != null) {
            ch4Var.k(this.f);
            this.n.a(ch4Var);
            ea5Var.o(ch4Var);
        }
        this.o = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (defpackage.ut0.E(r0.getContext()).E(r11.p, r0) == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.gj0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.eh4
            if (r0 == 0) goto L13
            r0 = r12
            eh4 r0 = (defpackage.eh4) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            eh4 r0 = new eh4
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.I
            int r1 = r0.K
            e43 r2 = r11.n
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            wd5 r7 = defpackage.wd5.a
            el0 r8 = defpackage.el0.I
            if (r1 == 0) goto L38
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2d
            goto L34
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r11)
            r11 = 0
            return r11
        L34:
            defpackage.mu0.V(r12)
            goto L72
        L38:
            defpackage.mu0.V(r12)
            boolean r12 = r2.i()
            if (r12 == 0) goto L46
            ch4 r12 = r11.o
            if (r12 != 0) goto L46
            return r7
        L46:
            tk0 r12 = r0.getContext()
            float r12 = defpackage.ad4.r(r12)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L59
            r11.k()
            r11.m = r5
            return r7
        L59:
            long r9 = r11.m
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 != 0) goto L72
            r0.K = r4
            tk0 r12 = r0.getContext()
            s13 r12 = defpackage.ut0.E(r12)
            bh4 r1 = r11.p
            java.lang.Object r12 = r12.E(r1, r0)
            if (r12 != r8) goto L72
            goto L88
        L72:
            boolean r12 = r2.j()
            if (r12 != 0) goto L80
            ch4 r12 = r11.o
            if (r12 == 0) goto L7d
            goto L80
        L7d:
            r11.m = r5
            return r7
        L80:
            r0.K = r3
            java.lang.Object r12 = r11.j(r0)
            if (r12 != r8) goto L72
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh4.n(gj0):java.lang.Object");
    }

    public final Object o(float f, Object obj, k05 k05Var) {
        if (0.0f > f || f > 1.0f) {
            lr3.a("Expecting fraction between 0 and 1. Got " + f);
        }
        ea5 ea5Var = this.e;
        if (ea5Var != null) {
            Object a = l53.a(this.l, new gh4(obj, this.b.getValue(), this, ea5Var, f, null), k05Var);
            if (a == el0.I) {
                return a;
            }
        }
        return wd5.a;
    }

    public final void p() {
        ea5 ea5Var = this.e;
        if (ea5Var == null) {
            return;
        }
        ea5Var.n(mw2.Q(this.i.h() * ((Number) ea5Var.m.getValue()).longValue()));
    }

    public final void q(float f) {
        this.i.i(f);
    }

    public final void r(kt4 kt4Var) {
        sr srVar;
        if (j42.c(this.h, kt4Var)) {
            return;
        }
        kt4 kt4Var2 = this.h;
        if (kt4Var2 != null) {
            kt4Var2.b(this);
        }
        kt4 kt4Var3 = this.h;
        if (kt4Var3 != null && (srVar = kt4Var3.h) != null) {
            srVar.a();
        }
        this.h = kt4Var;
        if (kt4Var != null) {
            kt4Var.e();
        }
        kt4 kt4Var4 = this.h;
        if (kt4Var4 != null) {
            kt4Var4.d(this, mw2.m, this.g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r1 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.gj0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.hh4
            if (r0 == 0) goto L13
            r0 = r8
            hh4 r0 = (defpackage.hh4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            hh4 r0 = new hh4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.L
            o53 r2 = r7.k
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2e
            java.lang.Object r0 = r0.I
            defpackage.mu0.V(r8)
            goto L6f
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r1 = r0.I
            defpackage.mu0.V(r8)
            r8 = r1
            goto L50
        L3c:
            defpackage.mu0.V(r8)
            jk3 r8 = r7.b
            java.lang.Object r8 = r8.getValue()
            r0.I = r8
            r0.L = r4
            java.lang.Object r1 = defpackage.lq2.T(r2, r0)
            if (r1 != r5) goto L50
            goto L6b
        L50:
            r0.I = r8
            r0.L = r3
            k10 r1 = new k10
            fj0 r0 = defpackage.mu0.G(r0)
            r1.<init>(r4, r0)
            r1.t()
            r7.j = r1
            defpackage.lq2.q0(r2)
            java.lang.Object r0 = r1.r()
            if (r0 != r5) goto L6c
        L6b:
            return r5
        L6c:
            r6 = r0
            r0 = r8
            r8 = r6
        L6f:
            boolean r8 = defpackage.j42.c(r8, r0)
            if (r8 == 0) goto L78
            wd5 r7 = defpackage.wd5.a
            return r7
        L78:
            r0 = -9223372036854775808
            r7.m = r0
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.String r8 = "targetState while waiting for composition"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh4.s(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r1 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.gj0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ih4
            if (r0 == 0) goto L13
            r0 = r8
            ih4 r0 = (defpackage.ih4) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            ih4 r0 = new ih4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.J
            int r1 = r0.L
            r2 = 2
            o53 r3 = r7.k
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r0 = r0.I
            defpackage.mu0.V(r8)
            goto L7b
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r1 = r0.I
            defpackage.mu0.V(r8)
            r8 = r1
            goto L50
        L3c:
            defpackage.mu0.V(r8)
            jk3 r8 = r7.b
            java.lang.Object r8 = r8.getValue()
            r0.I = r8
            r0.L = r4
            java.lang.Object r1 = defpackage.lq2.T(r3, r0)
            if (r1 != r5) goto L50
            goto L77
        L50:
            java.lang.Object r1 = r7.d
            boolean r1 = defpackage.j42.c(r8, r1)
            if (r1 == 0) goto L5c
            defpackage.lq2.q0(r3)
            goto L81
        L5c:
            r0.I = r8
            r0.L = r2
            k10 r1 = new k10
            fj0 r0 = defpackage.mu0.G(r0)
            r1.<init>(r4, r0)
            r1.t()
            r7.j = r1
            defpackage.lq2.q0(r3)
            java.lang.Object r0 = r1.r()
            if (r0 != r5) goto L78
        L77:
            return r5
        L78:
            r6 = r0
            r0 = r8
            r8 = r6
        L7b:
            boolean r1 = defpackage.j42.c(r8, r0)
            if (r1 == 0) goto L84
        L81:
            wd5 r7 = defpackage.wd5.a
            return r7
        L84:
            r1 = -9223372036854775808
            r7.m = r1
            java.util.concurrent.CancellationException r7 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = " instead of "
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh4.t(gj0):java.lang.Object");
    }
}

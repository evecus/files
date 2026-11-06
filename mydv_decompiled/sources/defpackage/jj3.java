package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class jj3 implements gc4 {
    public final ye2 A;
    public final t43 B;
    public final t43 C;
    public final jk3 D;
    public final jk3 E;
    public final jk3 F;
    public final jk3 G;
    public boolean a;
    public zi3 b;
    public final jk3 c;
    public final bj3 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final qs0 k;
    public final boolean l;
    public final jk3 m;
    public iu0 n;
    public int o;
    public final t33 p;
    public final gk3 q;
    public final gk3 r;
    public final wu0 s;
    public final wu0 t;
    public final bf2 u;
    public final pi3 v;
    public final cy w;
    public final ks x;
    public final jk3 y;
    public final hj3 z;

    public jj3(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            t02.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = ad4.w(new pd3(0L));
        this.d = new bj3(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final byte b = 0;
        this.k = new qs0(new tm1(this) { // from class: dj3
            public final /* synthetic */ jj3 J;

            {
                this.J = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Long] */
            @Override // defpackage.tm1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r14) {
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dj3.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b2 = 1;
        this.l = true;
        this.m = new jk3(nj3.b, q8.v0);
        this.n = nj3.a;
        this.p = new t33();
        this.q = new gk3(-1);
        this.r = new gk3(i);
        q8 q8Var = q8.B0;
        ej3 ej3Var = new ej3(this, b);
        lt4 lt4Var = dt4.a;
        this.s = new wu0(ej3Var, q8Var);
        this.t = new wu0(new ej3(this, b2), q8Var);
        bf2 bf2Var = new bf2(new tm1(this) { // from class: dj3
            public final /* synthetic */ jj3 J;

            {
                this.J = this;
            }

            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dj3.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.u = bf2Var;
        this.v = new pi3(new ep((Object) this, (byte) 12), bf2Var, new ej3(this, (byte) 2));
        this.w = new cy((byte) 1);
        this.x = new ks();
        this.y = ad4.w(null);
        this.z = new hj3(this);
        eh0.b(0, 0, 0, 0, 15);
        this.A = new ye2();
        this.B = vt0.m();
        this.C = vt0.m();
        Boolean bool = Boolean.FALSE;
        this.D = ad4.w(bool);
        this.E = ad4.w(bool);
        this.F = ad4.w(bool);
        this.G = ad4.w(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r9.d(r7, r8, r0) != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.i(r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(defpackage.jj3 r6, defpackage.d53 r7, defpackage.hn1 r8, defpackage.gj0 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ij3
            if (r0 == 0) goto L13
            r0 = r9
            ij3 r0 = (defpackage.ij3) r0
            int r1 = r0.N
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.N = r1
            goto L18
        L13:
            ij3 r0 = new ij3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.L
            int r1 = r0.N
            r2 = 0
            r3 = 2
            r4 = 1
            el0 r5 = defpackage.el0.I
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            jj3 r6 = r0.I
            defpackage.mu0.V(r9)
            goto L7b
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            return r2
        L33:
            k05 r6 = r0.K
            r8 = r6
            hn1 r8 = (defpackage.hn1) r8
            d53 r7 = r0.J
            jj3 r6 = r0.I
            defpackage.mu0.V(r9)
            goto L55
        L40:
            defpackage.mu0.V(r9)
            r0.I = r6
            r0.J = r7
            r9 = r8
            k05 r9 = (defpackage.k05) r9
            r0.K = r9
            r0.N = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L7a
        L55:
            qs0 r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L6a
            bj3 r9 = r6.d
            gk3 r9 = r9.b
            int r9 = r9.h()
            gk3 r1 = r6.r
            r1.i(r9)
        L6a:
            qs0 r9 = r6.k
            r0.I = r6
            r0.J = r2
            r0.K = r2
            r0.N = r3
            java.lang.Object r7 = r9.d(r7, r8, r0)
            if (r7 != r5) goto L7b
        L7a:
            return r5
        L7b:
            r7 = -1
            gk3 r6 = r6.q
            r6.i(r7)
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj3.s(jj3, d53, hn1, gj0):java.lang.Object");
    }

    public static Object t(jj3 jj3Var, int i, k05 k05Var) {
        Object d;
        jj3Var.getClass();
        d = jj3Var.d(d53.I, new t30(jj3Var, i, null, (byte) 1), k05Var);
        return d == el0.I ? d : wd5.a;
    }

    @Override // defpackage.gc4
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.gc4
    public final boolean b() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final boolean c() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    @Override // defpackage.gc4
    public final Object d(d53 d53Var, hn1 hn1Var, gj0 gj0Var) {
        return s(this, d53Var, hn1Var, gj0Var);
    }

    @Override // defpackage.gc4
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.ku4 r13, defpackage.fj0 r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof defpackage.fj3
            if (r3 == 0) goto L14
            r3 = r14
            fj3 r3 = (defpackage.fj3) r3
            int r4 = r3.M
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.M = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            fj3 r3 = new fj3
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.K
            int r3 = r6.M
            r7 = 0
            r4 = 0
            wd5 r8 = defpackage.wd5.a
            r9 = 2
            r5 = 1
            el0 r10 = defpackage.el0.I
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r9) goto L30
            defpackage.mu0.V(r2)
            return r8
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r0)
            return r7
        L36:
            int r0 = r6.I
            ku4 r3 = r6.J
            defpackage.mu0.V(r2)
            r2 = r4
            r4 = r3
            goto L6f
        L40:
            defpackage.mu0.V(r2)
            bj3 r2 = r11.d
            gk3 r3 = r2.b
            int r3 = r3.h()
            if (r12 != r3) goto L58
            fk3 r2 = r2.c
            float r2 = r2.h()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L58
            goto L8c
        L58:
            int r2 = r11.l()
            if (r2 != 0) goto L5f
            goto L8c
        L5f:
            r6.J = r13
            r6.I = r12
            r6.M = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r10) goto L6c
            goto L8b
        L6c:
            r0 = r12
            r2 = r4
            r4 = r13
        L6f:
            int r0 = r11.j(r0)
            int r3 = r11.n()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            gj3 r0 = new gj3
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.J = r7
            r6.M = r9
            java.lang.Object r0 = defpackage.nt3.w(r11, r0, r6)
            if (r0 != r10) goto L8c
        L8b:
            return r10
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj3.f(int, ku4, fj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0330, code lost:
    
        if (r() == false) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a2  */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.zi3 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj3.h(zi3, boolean, boolean):void");
    }

    public final Object i(gj0 gj0Var) {
        Object d;
        return (this.m.getValue() == nj3.b && (d = this.x.d(gj0Var)) == el0.I) ? d : wd5.a;
    }

    public final int j(int i) {
        if (l() > 0) {
            return ut0.r(i, 0, l() - 1);
        }
        return 0;
    }

    public final zi3 k() {
        return (zi3) this.m.getValue();
    }

    public abstract int l();

    public final int m() {
        return ((zi3) this.m.getValue()).b;
    }

    public final int n() {
        return ((zi3) this.m.getValue()).c + m();
    }

    public final int o() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final int p() {
        return ((Number) this.t.getValue()).intValue();
    }

    public final long q() {
        return ((pd3) this.c.getValue()).a;
    }

    public final boolean r() {
        return ((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0;
    }

    public final void u(int i, float f, boolean z) {
        bj3 bj3Var = this.d;
        gk3 gk3Var = bj3Var.b;
        fk3 fk3Var = bj3Var.c;
        if (gk3Var.h() != i || fk3Var.h() != f) {
            this.v.g();
        }
        bj3Var.b.i(i);
        bj3Var.f.c(i);
        fk3Var.i(f);
        bj3Var.e = null;
        if (!z) {
            vt0.C(this.C);
            return;
        }
        wa2 wa2Var = (wa2) this.y.getValue();
        if (wa2Var != null) {
            wa2Var.k();
        }
    }
}

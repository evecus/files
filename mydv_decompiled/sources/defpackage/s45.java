package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s45 implements s35 {
    public d65 b;
    public final /* synthetic */ u45 d;
    public boolean a = true;
    public hn3 c = n84.S;

    public s45(u45 u45Var) {
        this.d = u45Var;
    }

    @Override // defpackage.s35
    public final void a(long j, hn3 hn3Var) {
        long j2;
        v55 d;
        v55 d2;
        u45 u45Var = this.d;
        if (u45Var.i() && ((is1) u45Var.q.getValue()) == null) {
            u45Var.q(is1.K);
            u45Var.s = -1;
            this.a = true;
            this.c = hn3Var;
            u45Var.m();
            oh2 oh2Var = u45Var.d;
            if (oh2Var == null || (d2 = oh2Var.d()) == null || !d2.c(j)) {
                j2 = j;
                oh2 oh2Var2 = u45Var.d;
                if (oh2Var2 != null && (d = oh2Var2.d()) != null) {
                    int c = u45Var.b.c(d.b(j2, true));
                    d55 b = u45.b(u45Var.l().a, ui4.c(c, c));
                    u45Var.e(false);
                    ts1 ts1Var = u45Var.j;
                    if (ts1Var != null) {
                        ((kn3) ts1Var).a(0);
                    }
                    u45Var.c.invoke(b);
                    u45Var.v = new d65(b.b);
                }
                this.a = false;
            } else {
                if (u45Var.l().a.J.length() == 0) {
                    return;
                }
                u45Var.e(false);
                long v = u45Var.v(d55.a(u45Var.l(), null, d65.b, 5), j, true, false, this.c, true, new us1(0));
                j2 = j;
                u45Var.o = new d65(v);
                this.b = new d65(v);
            }
            u45Var.r(ks1.I);
            u45Var.n = j2;
            u45Var.p(new pd3(j2));
            u45Var.p = 0L;
        }
    }

    @Override // defpackage.s35
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // defpackage.s35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            r9 = this;
            u45 r0 = r9.d
            boolean r1 = r0.i()
            if (r1 == 0) goto Le9
            d55 r1 = r0.l()
            oj r1 = r1.a
            java.lang.String r1 = r1.J
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Le9
        L18:
            long r1 = r0.p
            long r10 = defpackage.pd3.f(r1, r10)
            r0.p = r10
            oh2 r10 = r0.d
            r11 = 0
            if (r10 == 0) goto Le6
            v55 r10 = r10.d()
            if (r10 == 0) goto Le6
            long r1 = r0.n
            long r3 = r0.p
            long r1 = defpackage.pd3.f(r1, r3)
            pd3 r3 = new pd3
            r3.<init>(r1)
            r0.p(r3)
            d65 r1 = r0.o
            r2 = 9
            if (r1 != 0) goto L94
            pd3 r1 = r0.g()
            r1.getClass()
            long r3 = r1.a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L94
            td3 r1 = r0.b
            long r3 = r0.n
            r5 = 1
            int r3 = r10.b(r3, r5)
            int r1 = r1.c(r3)
            td3 r3 = r0.b
            pd3 r4 = r0.g()
            r4.getClass()
            long r6 = r4.a
            int r10 = r10.b(r6, r5)
            int r10 = r3.c(r10)
            if (r1 != r10) goto L76
            hn3 r10 = defpackage.n84.S
        L74:
            r6 = r10
            goto L79
        L76:
            hn3 r10 = defpackage.n84.T
            goto L74
        L79:
            d55 r1 = r0.l()
            pd3 r10 = r0.g()
            r10.getClass()
            long r3 = r10.a
            us1 r8 = new us1
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = r0.v(r1, r2, r4, r5, r6, r7, r8)
            goto Ld5
        L94:
            d65 r1 = r0.o
            if (r1 == 0) goto L9f
            long r3 = r1.a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La5
        L9f:
            long r3 = r0.n
            int r1 = r10.b(r3, r11)
        La5:
            pd3 r3 = r0.g()
            r3.getClass()
            long r3 = r3.a
            int r10 = r10.b(r3, r11)
            d65 r3 = r0.o
            if (r3 != 0) goto Lb9
            if (r1 != r10) goto Lb9
            goto Le9
        Lb9:
            d55 r1 = r0.l()
            pd3 r10 = r0.g()
            r10.getClass()
            long r3 = r10.a
            hn3 r6 = r9.c
            us1 r8 = new us1
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = r0.v(r1, r2, r4, r5, r6, r7, r8)
        Ld5:
            d65 r10 = new d65
            r10.<init>(r1)
            r9.b = r10
            d65 r10 = r0.o
            boolean r10 = defpackage.d65.a(r1, r10)
            if (r10 != 0) goto Le6
            r9.a = r11
        Le6:
            r0.u(r11)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s45.e(long):void");
    }

    public final void f() {
        u45 u45Var = this.d;
        u45Var.q(null);
        u45Var.p(null);
        this.c = n84.S;
        u45Var.u(true);
        d65 d65Var = this.b;
        boolean c = d65.c(d65Var != null ? d65Var.a : u45Var.l().b);
        u45Var.r(c ? ks1.K : ks1.J);
        oh2 oh2Var = u45Var.d;
        if (oh2Var != null) {
            oh2Var.m.setValue(Boolean.valueOf(!c && eg5.v(u45Var, true)));
        }
        oh2 oh2Var2 = u45Var.d;
        if (oh2Var2 != null) {
            oh2Var2.n.setValue(Boolean.valueOf(!c && eg5.v(u45Var, false)));
        }
        oh2 oh2Var3 = u45Var.d;
        if (oh2Var3 != null) {
            oh2Var3.o.setValue(Boolean.valueOf(c && eg5.v(u45Var, true)));
        }
        if (this.a) {
            u45Var.n(u45Var.o);
        }
        u45Var.o = null;
    }

    @Override // defpackage.s35
    public final void onCancel() {
        f();
    }

    @Override // defpackage.s35
    public final void c() {
    }

    @Override // defpackage.s35
    public final void d() {
    }
}

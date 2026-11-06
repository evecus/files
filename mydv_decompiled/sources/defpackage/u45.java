package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u45 {
    public boolean A;
    public final rd5 a;
    public oh2 d;
    public rm1 f;
    public v60 g;
    public dl0 h;
    public wn3 i;
    public ts1 j;
    public ki1 k;
    public final jk3 l;
    public final jk3 m;
    public long n;
    public d65 o;
    public long p;
    public final jk3 q;
    public final jk3 r;
    public int s;
    public d55 t;
    public zp4 u;
    public d65 v;
    public final jk3 w;
    public final v05 x;
    public final s45 y;
    public final zp4 z;
    public td3 b = wx5.p0;
    public tm1 c = new m45(0);
    public final jk3 e = ad4.w(new d55(7, (String) null, 0));

    public u45(rd5 rd5Var) {
        this.a = rd5Var;
        Boolean bool = Boolean.TRUE;
        this.l = ad4.w(bool);
        this.m = ad4.w(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = ad4.w(null);
        this.r = ad4.w(null);
        this.s = -1;
        this.t = new d55(7, (String) null, 0L);
        this.w = ad4.w(Boolean.FALSE);
        v05 v05Var = new v05();
        v05Var.b = v85.I;
        this.x = v05Var;
        this.y = new s45(this);
        this.z = new zp4(this);
    }

    public static d55 b(oj ojVar, long j) {
        return new d55(ojVar, j, (d65) null);
    }

    public final rv4 a(boolean z) {
        dl0 dl0Var = this.h;
        if (dl0Var == null) {
            return null;
        }
        return p70.g0(dl0Var, null, gl0.L, new hj1(this, z, null), 1);
    }

    public final void c() {
        dl0 dl0Var = this.h;
        if (dl0Var != null) {
            p70.g0(dl0Var, null, gl0.L, new h40((Object) this, (fj0) null, (byte) 23), 1);
        }
    }

    public final void d(pd3 pd3Var) {
        if (!d65.c(l().b)) {
            oh2 oh2Var = this.d;
            v55 d = oh2Var != null ? oh2Var.d() : null;
            int e = (pd3Var == null || d == null) ? d65.e(l().b) : this.b.c(d.b(pd3Var.a, true));
            d55 a = d55.a(l(), null, ui4.c(e, e), 5);
            this.c.invoke(a);
            this.v = new d65(a.b);
        }
        r((pd3Var == null || l().a.J.length() <= 0) ? ks1.I : ks1.K);
        u(false);
    }

    public final void e(boolean z) {
        ki1 ki1Var;
        oh2 oh2Var = this.d;
        if (oh2Var != null && !oh2Var.b() && (ki1Var = this.k) != null) {
            ki1.a(ki1Var);
        }
        this.t = l();
        u(z);
        r(ks1.J);
    }

    public final uj3 f() {
        String str;
        d65 d65Var;
        oj k = k();
        if (k == null || (str = k.J) == null || (d65Var = this.v) == null) {
            return null;
        }
        long j = d65Var.a;
        return new uj3(str, new d65(ui4.c(this.b.k((int) (j >> 32)), this.b.k((int) (j & 4294967295L)))));
    }

    public final pd3 g() {
        return (pd3) this.r.getValue();
    }

    public final boolean h() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long j(boolean z) {
        v55 d;
        long j;
        oh2 oh2Var = this.d;
        if (oh2Var == null || (d = oh2Var.d()) == null) {
            return 9205357640488583168L;
        }
        u55 u55Var = d.a;
        w23 w23Var = u55Var.b;
        oj k = k();
        if (k == null) {
            return 9205357640488583168L;
        }
        if (!j42.c(k.J, u55Var.a.a.J)) {
            return 9205357640488583168L;
        }
        d55 l = l();
        if (z) {
            long j2 = l.b;
            int i = d65.c;
            j = j2 >> 32;
        } else {
            long j3 = l.b;
            int i2 = d65.c;
            j = j3 & 4294967295L;
        }
        int k2 = this.b.k((int) j);
        boolean g = d65.g(l().b);
        long j4 = u55Var.c;
        if (w23Var.d(k2) >= w23Var.f) {
            return 9205357640488583168L;
        }
        boolean z2 = u55Var.a(((!z || g) && (z || !g)) ? Math.max(k2 + (-1), 0) : k2) == u55Var.i(k2);
        w23Var.l(k2);
        int length = ((oj) w23Var.a.a).J.length();
        ArrayList arrayList = w23Var.h;
        yj3 yj3Var = (yj3) arrayList.get(k2 == length ? p70.X(arrayList) : dq2.F(k2, arrayList));
        td tdVar = yj3Var.a;
        int d2 = yj3Var.d(k2);
        s55 s55Var = tdVar.d;
        return (Float.floatToRawIntBits(ut0.q(w23Var.b(r8), 0.0f, (int) (j4 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(ut0.q(z2 ? s55Var.j(d2, false) : s55Var.k(d2, false), 0.0f, (int) (j4 >> 32))) << 32);
    }

    public final oj k() {
        oh2 oh2Var = this.d;
        if (oh2Var != null) {
            return oh2Var.a.a;
        }
        return null;
    }

    public final d55 l() {
        return (d55) this.e.getValue();
    }

    public final void m() {
        rv4 rv4Var;
        l35 l35Var = (l35) this.x.a;
        if (l35Var == null || (rv4Var = l35Var.O) == null) {
            return;
        }
        rv4Var.e(null);
        l35Var.O = null;
    }

    public final void n(d65 d65Var) {
        oj k;
        String str;
        dl0 dl0Var;
        if (d65Var == null) {
            return;
        }
        long j = d65Var.a;
        wn3 wn3Var = this.i;
        if (wn3Var == null || (k = k()) == null || (str = k.J) == null) {
            return;
        }
        td3 td3Var = this.b;
        long c = ui4.c(td3Var.k((int) (j >> 32)), td3Var.k((int) (j & 4294967295L)));
        if (str.length() <= 0 || d65.c(c) || (dl0Var = this.h) == null) {
            return;
        }
        p70.g0(dl0Var, null, null, new ci0(wn3Var, str, c, d65Var, this, td3Var, null, (byte) 2), 3);
    }

    public final void o() {
        dl0 dl0Var = this.h;
        if (dl0Var != null) {
            p70.g0(dl0Var, null, gl0.L, new n45(this, null, (byte) 1), 1);
        }
    }

    public final void p(pd3 pd3Var) {
        this.r.setValue(pd3Var);
    }

    public final void q(is1 is1Var) {
        this.q.setValue(is1Var);
    }

    public final void r(ks1 ks1Var) {
        oh2 oh2Var = this.d;
        if (oh2Var != null) {
            if (oh2Var.a() == ks1Var) {
                oh2Var = null;
            }
            if (oh2Var != null) {
                oh2Var.k.setValue(ks1Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r6 = this;
            ns4 r0 = defpackage.o63.i()
            r1 = 0
            if (r0 == 0) goto Lc
            tm1 r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            ns4 r3 = defpackage.o63.j(r0)
            boolean r4 = r6.i()     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L75
            oh2 r4 = r6.d     // Catch: java.lang.Throwable -> L73
            if (r4 == 0) goto L2a
            jk3 r4 = r4.q     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L73
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L73
            if (r4 != 0) goto L2a
            goto L75
        L2a:
            defpackage.o63.o(r0, r3, r2)
            v05 r6 = r6.x
            java.lang.Object r0 = r6.b
            v85 r0 = (defpackage.v85) r0
            v85 r2 = defpackage.v85.I
            if (r0 == r2) goto L38
            goto L3d
        L38:
            java.lang.String r0 = "ToolbarRequester is not initialized."
            defpackage.t02.c(r0)
        L3d:
            java.lang.Object r6 = r6.a
            l35 r6 = (defpackage.l35) r6
            if (r6 == 0) goto L72
            boolean r0 = r6.isAttached()
            if (r0 == 0) goto L72
            rv4 r0 = r6.O
            r2 = 1
            if (r0 == 0) goto L55
            boolean r0 = r0.isActive()
            if (r0 != r2) goto L55
            goto L72
        L55:
            i51 r0 = defpackage.g35.b
            java.lang.Object r0 = defpackage.j42.r(r6, r0)
            f35 r0 = (defpackage.f35) r0
            if (r0 != 0) goto L60
            goto L72
        L60:
            dl0 r3 = r6.getCoroutineScope()
            eg1 r4 = new eg1
            r5 = 7
            r4.<init>(r6, r0, r1, r5)
            gl0 r0 = defpackage.gl0.L
            rv4 r0 = defpackage.p70.g0(r3, r1, r0, r4, r2)
            r6.O = r0
        L72:
            return
        L73:
            r6 = move-exception
            goto L79
        L75:
            defpackage.o63.o(r0, r3, r2)
            return
        L79:
            defpackage.o63.o(r0, r3, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u45.s():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.gj0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t45
            if (r0 == 0) goto L13
            r0 = r5
            t45 r0 = (defpackage.t45) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            t45 r0 = new t45
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            u45 r4 = r0.I
            defpackage.mu0.V(r5)
            goto L5c
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r4)
            return r2
        L2e:
            defpackage.mu0.V(r5)
            v60 r5 = r4.g
            if (r5 == 0) goto L7d
            r0.I = r4
            r0.L = r3
            boolean r0 = r5 instanceof defpackage.ca
            if (r0 == 0) goto L67
            ca r5 = (defpackage.ca) r5
            da r5 = r5.a
            android.content.ClipboardManager r5 = r5.l()
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            if (r5 != 0) goto L4d
            r5 = 0
            goto L53
        L4d:
            java.lang.String r0 = "text/*"
            boolean r5 = r5.hasMimeType(r0)
        L53:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            el0 r0 = defpackage.el0.I
            if (r5 != r0) goto L5c
            return r0
        L5c:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            jk3 r4 = r4.w
            r4.setValue(r5)
            goto L7d
        L67:
            java.lang.Class r4 = r5.getClass()
            k60 r4 = defpackage.s24.a(r4)
            java.lang.String r4 = r4.b()
            java.lang.String r5 = "Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received "
            java.lang.String r4 = defpackage.hf1.w(r5, r4)
            defpackage.s83.h(r4)
            return r2
        L7d:
            wd5 r4 = defpackage.wd5.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u45.t(gj0):java.lang.Object");
    }

    public final void u(boolean z) {
        oh2 oh2Var = this.d;
        if (oh2Var != null) {
            oh2Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            s();
        } else {
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x012d, code lost:
    
        if (r1.b == r7.b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0156, code lost:
    
        r5 = (defpackage.th4) r15.c;
        r6 = ((defpackage.u55) r4.e).a.a.J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0164, code lost:
    
        if (r5 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x016a, code lost:
    
        if (r6.length() != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x016e, code lost:
    
        r6 = r15.b;
        r8 = ((defpackage.u55) r4.e).a.a.J;
        r9 = r4.b;
        r10 = r8.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0181, code lost:
    
        if (r9 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0183, code lost:
    
        r5 = defpackage.hc4.y(0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0188, code lost:
    
        if (r6 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x018a, code lost:
    
        r1 = defpackage.th4.a(r2, defpackage.hc4.i(r1, r4, r5), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0195, code lost:
    
        r1 = defpackage.th4.a(r2, null, defpackage.hc4.i(r7, r4, r5), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a2, code lost:
    
        if (r9 != r10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a4, code lost:
    
        r5 = defpackage.hc4.z(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01a8, code lost:
    
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01aa, code lost:
    
        r1 = defpackage.th4.a(r2, defpackage.hc4.i(r1, r4, r5), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b3, code lost:
    
        r1 = defpackage.th4.a(r2, null, defpackage.hc4.i(r7, r4, r5), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01be, code lost:
    
        if (r5.c != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c0, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c5, code lost:
    
        if ((r6 ^ r12) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c7, code lost:
    
        r5 = defpackage.hc4.z(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01d0, code lost:
    
        if (r6 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01d2, code lost:
    
        r1 = defpackage.th4.a(r2, defpackage.hc4.i(r1, r4, r5), null, r12, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01dc, code lost:
    
        r1 = defpackage.th4.a(r2, null, defpackage.hc4.i(r7, r4, r5), r12, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01cc, code lost:
    
        r5 = defpackage.hc4.y(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c2, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0152, code lost:
    
        if (((defpackage.u55) r4.e).a.a.J.length() != (r5 ? r7 : r1).b) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long v(defpackage.d55 r22, long r23, boolean r25, boolean r26, defpackage.hn3 r27, boolean r28, defpackage.us1 r29) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u45.v(d55, long, boolean, boolean, hn3, boolean, us1):long");
    }
}

package defpackage;

import androidx.media3.common.util.Log;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class g31 extends wt0 implements vp3, zz1, ye0, l31 {
    public pg3 K;
    public tm1 L;
    public boolean M;
    public t33 N;
    public iz O;
    public i31 P;
    public boolean Q;
    public boolean R;
    public g21 S;
    public long T = 0;
    public kp1 U;
    public kp1 V;
    public j21 W;
    public i21 X;
    public h21 Y;
    public k21 Z;
    public g73 a0;
    public d95 b0;
    public yz1 c0;

    public g31(tm1 tm1Var, boolean z, t33 t33Var, pg3 pg3Var) {
        this.K = pg3Var;
        this.L = tm1Var;
        this.M = z;
        this.N = t33Var;
    }

    public static void q0(g31 g31Var, rp3 rp3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        i21 i21Var = g31Var.X;
        if (i21Var == null) {
            i21Var = new i21();
            g31Var.X = i21Var;
        }
        i21Var.B0(rp3Var);
        i21Var.C0(j);
        d95 d95Var = g31Var.b0;
        pg3 pg3Var = g31Var.K;
        if (d95Var == null) {
            g31Var.b0 = new d95(pg3Var);
        } else {
            d95Var.e(pg3Var);
            d95 d95Var2 = g31Var.b0;
            if (d95Var2 != null) {
                d95Var2.c(j2);
            }
        }
        i21Var.D0(false);
        g31Var.Z = i21Var;
    }

    public final void A0(rp3 rp3Var, rp3 rp3Var2, long j) {
        if (this.a0 == null) {
            this.a0 = new g73((byte) 16);
        }
        fb4.f(y0(), rp3Var);
        long e = pd3.e(rp3Var2.e(), j);
        if (((Boolean) this.L.invoke(cq3.a(rp3Var.j()))).booleanValue()) {
            if (!this.Q) {
                if (this.O == null) {
                    this.O = qb.g(Log.LOG_LEVEL_OFF, 6, null);
                }
                C0();
            }
            x0().d(new n21(e, 0));
        }
    }

    public boolean B0() {
        oc4 oc4Var = ((fc4) this).l0;
        if (oc4Var.a.a()) {
            return true;
        }
        sc scVar = oc4Var.b;
        return scVar != null ? scVar.e() : false;
    }

    public final void C0() {
        this.Q = true;
        fj0 fj0Var = null;
        if (this.O == null) {
            this.O = qb.g(Log.LOG_LEVEL_OFF, 6, null);
        }
        p70.g0(getCoroutineScope(), null, null, new f31((Object) this, fj0Var, (byte) 0), 3);
    }

    public final void D0(tm1 tm1Var, boolean z, t33 t33Var, pg3 pg3Var, boolean z2) {
        this.L = tm1Var;
        boolean z3 = true;
        if (this.M != z) {
            this.M = z;
            if (!z) {
                kp1 kp1Var = this.V;
                if (kp1Var != null) {
                    k0(kp1Var);
                }
                kp1 kp1Var2 = this.U;
                if (kp1Var2 != null) {
                    k0(kp1Var2);
                }
                this.V = null;
                this.U = null;
                m0();
                this.c0 = null;
            }
            z2 = true;
        }
        if (!j42.c(this.N, t33Var)) {
            m0();
            this.N = t33Var;
        }
        if (this.K != pg3Var) {
            this.K = pg3Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            if (this.R) {
                o0();
                if (this.Q) {
                    x0().d(l21.a);
                }
                this.a0 = null;
            }
            yz1 yz1Var = this.c0;
            if (yz1Var != null) {
                yz1Var.f();
            }
        }
    }

    @Override // defpackage.jp1
    public final String E() {
        if (!this.M) {
            return "idle";
        }
        k21 k21Var = this.Z;
        return k21Var instanceof g21 ? ((g21) k21Var).A0() ? "waiting" : "idle" : ((k21Var instanceof i21) || (k21Var instanceof h21)) ? "waiting" : k21Var instanceof j21 ? "recognized" : "idle";
    }

    @Override // defpackage.l31
    public final pg3 J() {
        return this.K;
    }

    @Override // defpackage.zz1
    public final void R() {
        yz1 yz1Var = this.c0;
        if (yz1Var != null) {
            yz1Var.f();
        }
    }

    @Override // defpackage.vp3
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // defpackage.vp3
    public final /* synthetic */ void e0() {
        i82.C(this);
    }

    @Override // defpackage.vp3
    public final /* synthetic */ long h() {
        return i82.c();
    }

    public final void m0() {
        i31 i31Var = this.P;
        if (i31Var != null) {
            t33 t33Var = this.N;
            if (t33Var != null) {
                t33Var.b(new h31(i31Var));
            }
            this.P = null;
        }
    }

    public abstract Object n0(n6 n6Var, f31 f31Var);

    public final void o0() {
        this.T = 0L;
        g21 g21Var = this.S;
        if (g21Var == null) {
            g21Var = new g21();
            this.S = g21Var;
        }
        g21Var.B0(f21.K);
        g21Var.C0(false);
        g21Var.D0(false);
        this.Z = g21Var;
    }

    @Override // defpackage.k13
    public /* synthetic */ void onDensityChange() {
        i82.t(this);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        this.Q = false;
        m0();
        kp1 kp1Var = this.V;
        if (kp1Var != null) {
            k0(kp1Var);
        }
        kp1 kp1Var2 = this.U;
        if (kp1Var2 != null) {
            k0(kp1Var2);
        }
        this.V = null;
        this.U = null;
    }

    public void p(kp3 kp3Var, lp3 lp3Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z = true;
        this.R = true;
        if (this.M) {
            if (this.U == null) {
                kp1 t = c21.t(this);
                j0(t);
                this.U = t;
            }
            k21 k21Var = this.Z;
            k21 k21Var2 = k21Var;
            if (k21Var == null) {
                g21 g21Var = this.S;
                g21 g21Var2 = g21Var;
                if (g21Var == null) {
                    g21 g21Var3 = new g21();
                    this.S = g21Var3;
                    g21Var2 = g21Var3;
                }
                this.Z = g21Var2;
                k21Var2 = g21Var2;
            }
            boolean z2 = k21Var2 instanceof g21;
            int i = 0;
            boolean z3 = false;
            lp3 lp3Var2 = lp3.I;
            lp3 lp3Var3 = lp3.J;
            if (z2) {
                g21 g21Var4 = (g21) k21Var2;
                if (!kp3Var.a.isEmpty() && z15.e(kp3Var, false)) {
                    rp3 rp3Var = (rp3) o70.T0(kp3Var.a);
                    int i2 = b31.a[g21Var4.y0().ordinal()];
                    f21 f21Var = f21.J;
                    f21 f21Var2 = f21.I;
                    f21 y0 = i2 == 1 ? !B0() ? f21Var2 : f21Var : g21Var4.y0();
                    g21Var4.B0(y0);
                    if (lp3Var == lp3Var2) {
                        if (y0 == f21Var) {
                            rp3Var.a();
                            g21Var4.C0(true);
                        }
                        g21Var4.D0(true);
                    }
                    if (lp3Var == lp3Var3) {
                        if (y0 == f21Var2) {
                            q0(this, rp3Var, rp3Var.d(), 0L, 12);
                            return;
                        }
                        if (g21Var4.z0()) {
                            A0(rp3Var, rp3Var, 0L);
                            z0(0L, rp3Var);
                            long d = rp3Var.d();
                            j21 j21Var = this.W;
                            if (j21Var == null) {
                                j21Var = new j21();
                                this.W = j21Var;
                            }
                            j21Var.z0(d);
                            this.Z = j21Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z4 = k21Var2 instanceof i21;
            lp3 lp3Var4 = lp3.K;
            Object obj4 = null;
            if (!z4) {
                if (k21Var2 instanceof h21) {
                    h21 h21Var = (h21) k21Var2;
                    if (lp3Var != lp3Var4) {
                        return;
                    }
                    List list = kp3Var.a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        if (((rp3) list.get(i3)).l()) {
                            z = false;
                            break;
                        }
                        i3++;
                    }
                    int size2 = list.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        if (!((rp3) list.get(i)).f()) {
                            i++;
                        } else if (!list.isEmpty()) {
                            if (z) {
                                long e = ((rp3) o70.T0(list)).e();
                                rp3 y02 = h21Var.y0();
                                y02.getClass();
                                long e2 = pd3.e(e, y02.e());
                                rp3 y03 = h21Var.y0();
                                if (y03 != null) {
                                    q0(this, y03, h21Var.z0(), e2, 8);
                                    return;
                                } else {
                                    s83.t("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    o0();
                    return;
                }
                if (!(k21Var2 instanceof j21)) {
                    s83.v();
                    return;
                }
                j21 j21Var2 = (j21) k21Var2;
                if (lp3Var != lp3Var3) {
                    return;
                }
                long y04 = j21Var2.y0();
                List list2 = kp3Var.a;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list2.get(i4);
                    if (rt0.p(((rp3) obj).d(), y04)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                rp3 rp3Var2 = (rp3) obj;
                if (rp3Var2 == null) {
                    return;
                }
                boolean o = dq2.o(rp3Var2);
                Object obj5 = l21.a;
                if (!o) {
                    if (rp3Var2.l()) {
                        x0().d(obj5);
                        return;
                    } else {
                        if (pd3.d(dq2.s0(rp3Var2)) == 0.0f) {
                            return;
                        }
                        z0(dq2.r0(rp3Var2), rp3Var2);
                        rp3Var2.a();
                        return;
                    }
                }
                List list3 = kp3Var.a;
                int size4 = list3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        break;
                    }
                    Object obj6 = list3.get(i5);
                    if (((rp3) obj6).f()) {
                        obj4 = obj6;
                        break;
                    }
                    i5++;
                }
                rp3 rp3Var3 = (rp3) obj4;
                if (rp3Var3 != null) {
                    j21Var2.z0(rp3Var3.d());
                    return;
                }
                if (rp3Var2.l() || !dq2.o(rp3Var2)) {
                    x0().d(obj5);
                } else {
                    float e3 = ((gr5) j42.r(this, hf0.t)).e();
                    fb4.f(y0(), rp3Var2);
                    long e4 = y0().e(eg5.e(e3, e3));
                    y0().w();
                    x0().d(new o21(n31.b(e4)));
                    this.R = false;
                }
                o0();
                return;
            }
            i21 i21Var = (i21) k21Var2;
            if (lp3Var == lp3Var2) {
                return;
            }
            List list4 = kp3Var.a;
            int size5 = list4.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    obj2 = null;
                    break;
                }
                obj2 = list4.get(i6);
                if (rt0.p(((rp3) obj2).d(), i21Var.z0())) {
                    break;
                } else {
                    i6++;
                }
            }
            rp3 rp3Var4 = (rp3) obj2;
            if (rp3Var4 == null) {
                int size6 = list4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list4.get(i7);
                    if (((rp3) obj3).f()) {
                        break;
                    } else {
                        i7++;
                    }
                }
                rp3Var4 = (rp3) obj3;
                if (rp3Var4 == null) {
                    o0();
                    return;
                }
                i21Var.C0(rp3Var4.d());
            }
            if (lp3Var == lp3Var3) {
                if (rp3Var4.l()) {
                    rp3 y05 = i21Var.y0();
                    if (y05 == null) {
                        s83.t("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long z0 = i21Var.z0();
                    d95 d95Var = this.b0;
                    if (d95Var == null) {
                        s83.t("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    p0(y05, z0, d95Var);
                } else if (dq2.o(rp3Var4)) {
                    int size7 = list4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size7) {
                            break;
                        }
                        Object obj7 = list4.get(i8);
                        if (((rp3) obj7).f()) {
                            obj4 = obj7;
                            break;
                        }
                        i8++;
                    }
                    rp3 rp3Var5 = (rp3) obj4;
                    if (rp3Var5 == null) {
                        o0();
                    } else {
                        i21Var.C0(rp3Var5.d());
                    }
                } else {
                    float g = z21.g((gr5) j42.r(this, hf0.t), rp3Var4.j());
                    d95 d95Var2 = this.b0;
                    if (d95Var2 == null) {
                        s83.t("Touch slop detector not initialized.");
                        return;
                    }
                    long a = d95.a(d95Var2, dq2.s0(rp3Var4), g);
                    if ((9223372034707292159L & a) != 9205357640488583168L) {
                        this.T = pd3.f(this.T, dq2.r0(rp3Var4));
                        float atan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.T & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (r3 >> 32))))) * 57.29578f;
                        pg3 pg3Var = this.K;
                        boolean a2 = pg3Var == null ? true : n31.a(pg3Var, atan2);
                        n24 n24Var = new n24();
                        n31.c(this, new a31(atan2, n24Var, z3 ? 1 : 0));
                        if (a2 || !n24Var.I) {
                            i21Var = i21Var;
                            rp3Var4.a();
                            rp3 y06 = i21Var.y0();
                            y06.getClass();
                            A0(y06, rp3Var4, a);
                            z0(a, rp3Var4);
                            long d2 = rp3Var4.d();
                            j21 j21Var3 = this.W;
                            if (j21Var3 == null) {
                                j21Var3 = new j21();
                                this.W = j21Var3;
                            }
                            j21Var3.z0(d2);
                            this.Z = j21Var3;
                        } else {
                            i21Var = i21Var;
                            i21Var.D0(true);
                        }
                    } else {
                        i21Var.D0(true);
                        this.T = pd3.f(this.T, dq2.s0(rp3Var4));
                    }
                }
            }
            if (lp3Var == lp3Var4 && i21Var.A0()) {
                if (!rp3Var4.l()) {
                    i21Var.D0(false);
                    return;
                }
                rp3 y07 = i21Var.y0();
                if (y07 == null) {
                    s83.t("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long z02 = i21Var.z0();
                d95 d95Var3 = this.b0;
                if (d95Var3 != null) {
                    p0(y07, z02, d95Var3);
                } else {
                    s83.t("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    public final void p0(rp3 rp3Var, long j, d95 d95Var) {
        h21 h21Var = this.Y;
        if (h21Var == null) {
            h21Var = new h21();
            this.Y = h21Var;
        }
        h21Var.A0(rp3Var);
        h21Var.B0(j);
        d95.d(d95Var);
        this.Z = h21Var;
    }

    public final void r0(p21 p21Var) {
        if ((p21Var instanceof n21) && !this.Q) {
            this.Q = true;
            C0();
        }
        x0().d(p21Var);
    }

    public abstract void t0(o21 o21Var);

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(defpackage.gj0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.c31
            if (r0 == 0) goto L13
            r0 = r6
            c31 r0 = (defpackage.c31) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            c31 r0 = new c31
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.I
            int r1 = r0.K
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.mu0.V(r6)
            goto L47
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L2c:
            defpackage.mu0.V(r6)
            i31 r6 = r5.P
            if (r6 == 0) goto L49
            t33 r1 = r5.N
            if (r1 == 0) goto L47
            h31 r4 = new h31
            r4.<init>(r6)
            r0.K = r3
            java.lang.Object r6 = r1.a(r4, r0)
            el0 r0 = defpackage.el0.I
            if (r6 != r0) goto L47
            return r0
        L47:
            r5.P = r2
        L49:
            o21 r6 = new o21
            r0 = 0
            r6.<init>(r0)
            r5.t0(r6)
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g31.u0(gj0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r1.a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(defpackage.n21 r7, defpackage.gj0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.d31
            if (r0 == 0) goto L13
            r0 = r8
            d31 r0 = (defpackage.d31) r0
            int r1 = r0.M
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M = r1
            goto L18
        L13:
            d31 r0 = new d31
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.K
            int r1 = r0.M
            r2 = 2
            r3 = 1
            el0 r4 = defpackage.el0.I
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            i31 r7 = r0.J
            n21 r0 = r0.I
            defpackage.mu0.V(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r6)
            r6 = 0
            return r6
        L35:
            n21 r7 = r0.I
            defpackage.mu0.V(r8)
            goto L56
        L3b:
            defpackage.mu0.V(r8)
            i31 r8 = r6.P
            if (r8 == 0) goto L56
            t33 r1 = r6.N
            if (r1 == 0) goto L56
            h31 r5 = new h31
            r5.<init>(r8)
            r0.I = r7
            r0.M = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            i31 r8 = new i31
            r8.<init>()
            t33 r1 = r6.N
            if (r1 == 0) goto L70
            r0.I = r7
            r0.J = r8
            r0.M = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.P = r8
            long r7 = r7.a()
            r6.s0(r7)
            wd5 r6 = defpackage.wd5.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g31.v0(n21, gj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(defpackage.o21 r6, defpackage.gj0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.e31
            if (r0 == 0) goto L13
            r0 = r7
            e31 r0 = (defpackage.e31) r0
            int r1 = r0.L
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.L = r1
            goto L18
        L13:
            e31 r0 = new e31
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.J
            int r1 = r0.L
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            o21 r6 = r0.I
            defpackage.mu0.V(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r2
        L2e:
            defpackage.mu0.V(r7)
            i31 r7 = r5.P
            if (r7 == 0) goto L4d
            t33 r1 = r5.N
            if (r1 == 0) goto L4b
            j31 r4 = new j31
            r4.<init>(r7)
            r0.I = r6
            r0.L = r3
            java.lang.Object r7 = r1.a(r4, r0)
            el0 r0 = defpackage.el0.I
            if (r7 != r0) goto L4b
            return r0
        L4b:
            r5.P = r2
        L4d:
            r5.t0(r6)
            wd5 r5 = defpackage.wd5.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g31.w0(o21, gj0):java.lang.Object");
    }

    public final k20 x0() {
        iz izVar = this.O;
        if (izVar != null) {
            return izVar;
        }
        s83.t("Events channel not initialized.");
        return null;
    }

    @Override // defpackage.vp3
    public final void y() {
        if (this.R) {
            o0();
            if (this.Q) {
                x0().d(l21.a);
            }
            this.a0 = null;
        }
        this.R = false;
    }

    public final g73 y0() {
        g73 g73Var = this.a0;
        if (g73Var != null) {
            return g73Var;
        }
        s83.t("Velocity Tracker not initialized.");
        return null;
    }

    @Override // defpackage.zz1
    public final void z(pz1 pz1Var, lp3 lp3Var) {
        if (this.M) {
            yz1 yz1Var = this.c0;
            if (yz1Var == null) {
                yz1Var = new yz1(this);
                this.c0 = yz1Var;
            }
            if (this.V == null) {
                kp1 t = c21.t(yz1Var);
                j0(t);
                this.V = t;
            }
            yz1 yz1Var2 = this.c0;
            if (yz1Var2 != null) {
                yz1Var2.d(pz1Var, lp3Var);
            }
        }
    }

    public final void z0(long j, rp3 rp3Var) {
        this.T = pd3.f(this.T, j);
        fb4.f(y0(), rp3Var);
        x0().d(new m21(j));
    }

    @Override // defpackage.vp3
    public final /* synthetic */ void D() {
    }

    public void s0(long j) {
    }
}

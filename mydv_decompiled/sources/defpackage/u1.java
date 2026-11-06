package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class u1 extends wt0 implements vp3, t82, pi4, ye0, kd3, zz1, jp1 {
    public t33 K;
    public boolean L;
    public String M;
    public t64 N;
    public boolean O;
    public rm1 P;
    public final zi1 Q;
    public oz1 R;
    public kp1 S;
    public String T = "idle";
    public tt0 U;
    public vs3 V;
    public mv1 W;
    public final w33 X;
    public long Y;
    public vs3 Z;
    public t33 a0;
    public boolean b0;
    public rv4 c0;

    public u1(t33 t33Var, boolean z, boolean z2, String str, t64 t64Var, rm1 rm1Var) {
        this.K = t33Var;
        this.L = z;
        this.M = str;
        this.N = t64Var;
        this.O = z2;
        this.P = rm1Var;
        this.Q = new zi1(t33Var, 0, new n1(1, this, u1.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        int i = or2.a;
        this.X = new w33(6);
        this.Y = 0L;
        t33 t33Var2 = this.K;
        this.a0 = t33Var2;
        this.b0 = t33Var2 == null;
    }

    @Override // defpackage.jp1
    public final String E() {
        return this.T;
    }

    @Override // defpackage.kd3
    public final void U() {
        if (this.L) {
            mu0.P(this, new l1(this, (byte) 0));
        }
    }

    @Override // defpackage.vp3
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        t64 t64Var = this.N;
        if (t64Var != null) {
            aj4.c(cj4Var, t64Var.a);
        }
        String str = this.M;
        l1 l1Var = new l1(this, (byte) 1);
        d82[] d82VarArr = aj4.a;
        cj4Var.c(ii4.b, new v4(str, l1Var));
        if (this.O) {
            this.Q.applySemantics(cj4Var);
        } else {
            cj4Var.c(zi4.j, wd5.a);
        }
        m0(cj4Var);
    }

    @Override // defpackage.t82
    public final boolean b(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.vp3
    public final /* synthetic */ void e0() {
        i82.C(this);
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // defpackage.vp3
    public final /* synthetic */ long h() {
        return i82.c();
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }

    public final void n0() {
        t33 t33Var = this.K;
        w33 w33Var = this.X;
        if (t33Var != null) {
            vs3 vs3Var = this.V;
            if (vs3Var != null) {
                t33Var.b(new us3(vs3Var));
            }
            vs3 vs3Var2 = this.Z;
            if (vs3Var2 != null) {
                t33Var.b(new us3(vs3Var2));
            }
            mv1 mv1Var = this.W;
            if (mv1Var != null) {
                t33Var.b(new nv1(mv1Var));
            }
            Object[] objArr = w33Var.c;
            long[] jArr = w33Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                t33Var.b(new us3((vs3) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.V = null;
        this.Z = null;
        this.W = null;
        w33Var.a();
    }

    public final long o0(long j) {
        long c0 = ut0.U(this).g0.c0(((gr5) j42.r(this, hf0.t)).d());
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (c0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (c0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // defpackage.k13
    public final void onAttach() {
        U();
        if (!this.b0) {
            t0();
        }
        if (this.O) {
            j0(this.Q);
        }
    }

    @Override // defpackage.k13
    public final /* synthetic */ void onDensityChange() {
        i82.t(this);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        n0();
        if (this.a0 == null) {
            this.K = null;
        }
        tt0 tt0Var = this.U;
        if (tt0Var != null) {
            k0(tt0Var);
        }
        this.U = null;
        kp1 kp1Var = this.S;
        if (kp1Var != null) {
            k0(kp1Var);
        }
        this.S = null;
    }

    public void p(kp3 kp3Var, lp3 lp3Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.Y = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        t0();
        if (this.O) {
            if (this.S == null) {
                kp1 t = c21.t(this);
                j0(t);
                this.S = t;
            }
            if (lp3Var == lp3.J) {
                int i = kp3Var.f;
                fj0 fj0Var = null;
                if (i == 4) {
                    p70.g0(getCoroutineScope(), null, null, new t1(this, fj0Var, (byte) 0), 3);
                } else if (i == 5) {
                    p70.g0(getCoroutineScope(), null, null, new t1(this, fj0Var, (byte) 1), 3);
                }
            }
        }
    }

    public final void p0(boolean z) {
        t33 t33Var = this.K;
        if (t33Var != null) {
            rv4 rv4Var = this.c0;
            if (rv4Var == null || !rv4Var.isActive()) {
                vs3 vs3Var = z ? this.Z : this.V;
                if (vs3Var != null) {
                    us3 us3Var = new us3(vs3Var);
                    v52 v52Var = (v52) getCoroutineScope().getCoroutineContext().get(q8.r0);
                    p70.g0(getCoroutineScope(), null, null, new o1(t33Var, us3Var, v52Var != null ? v52Var.Q(new m1(t33Var, us3Var, (byte) 0)) : null, null, (byte) 0), 3);
                }
            } else {
                rv4 rv4Var2 = this.c0;
                if (rv4Var2 != null) {
                    rv4Var2.e(null);
                }
            }
            if (z) {
                this.Z = null;
            } else {
                this.V = null;
            }
        }
    }

    public final void q0(long j, boolean z) {
        t33 t33Var = this.K;
        if (t33Var != null) {
            rv4 rv4Var = this.c0;
            if (rv4Var == null || !rv4Var.isActive()) {
                vs3 vs3Var = z ? this.Z : this.V;
                if (vs3Var != null) {
                    p70.g0(getCoroutineScope(), null, null, new q1(vs3Var, t33Var, null), 3);
                }
            } else {
                rv4Var.e(null);
                p70.g0(getCoroutineScope(), null, null, new p1((Object) rv4Var, j, t33Var, (fj0) null, (byte) 0), 3);
            }
            if (z) {
                this.Z = null;
            } else {
                this.V = null;
            }
        }
    }

    public final void r0(rz1 rz1Var) {
        t33 t33Var = this.K;
        if (t33Var != null) {
            vs3 vs3Var = new vs3(rz1Var.c);
            r24 r24Var = new r24();
            c21.K(this, new ga(r24Var, (byte) 1));
            fj0 fj0Var = null;
            if (r24Var.I != null || t60.a(this)) {
                this.c0 = p70.g0(getCoroutineScope(), null, null, new r1(t33Var, vs3Var, this, fj0Var, (byte) 0), 3);
            } else {
                this.Z = vs3Var;
                p70.g0(getCoroutineScope(), null, null, new q1(t33Var, vs3Var, null, (byte) 1), 3);
            }
        }
    }

    public final void s0(rp3 rp3Var) {
        t33 t33Var = this.K;
        if (t33Var != null) {
            vs3 vs3Var = new vs3(rp3Var.e());
            r24 r24Var = new r24();
            c21.K(this, new ga(r24Var, (byte) 1));
            fj0 fj0Var = null;
            if (r24Var.I != null || t60.a(this)) {
                this.c0 = p70.g0(getCoroutineScope(), null, null, new r1(t33Var, vs3Var, this, fj0Var, (byte) 1), 3);
            } else {
                this.V = vs3Var;
                p70.g0(getCoroutineScope(), null, null, new q1(t33Var, vs3Var, null, (byte) 2), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f A[RETURN] */
    @Override // defpackage.t82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(android.view.KeyEvent r12) {
        /*
            r11 = this;
            r11.t0()
            long r0 = defpackage.e21.w(r12)
            boolean r2 = r11.O
            r3 = 3
            r4 = 0
            w33 r5 = r11.X
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            int r2 = defpackage.e21.C(r12)
            r8 = 2
            boolean r2 = defpackage.c21.r(r2, r8)
            if (r2 == 0) goto L4e
            boolean r2 = defpackage.i42.v0(r12)
            if (r2 == 0) goto L4e
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L44
            vs3 r2 = new vs3
            long r9 = r11.Y
            r2.<init>(r9)
            r5.g(r0, r2)
            t33 r0 = r11.K
            if (r0 == 0) goto L42
            dl0 r0 = r11.getCoroutineScope()
            s1 r1 = new s1
            r1.<init>(r11, r2, r4, r8)
            defpackage.p70.g0(r0, r4, r4, r1, r3)
        L42:
            r0 = r6
            goto L45
        L44:
            r0 = r7
        L45:
            boolean r11 = r11.v0(r12)
            if (r11 != 0) goto L7f
            if (r0 == 0) goto L80
            goto L7f
        L4e:
            boolean r2 = r11.O
            if (r2 == 0) goto L80
            int r2 = defpackage.e21.C(r12)
            boolean r2 = defpackage.c21.r(r2, r6)
            if (r2 == 0) goto L80
            boolean r2 = defpackage.i42.v0(r12)
            if (r2 == 0) goto L80
            java.lang.Object r0 = r5.f(r0)
            vs3 r0 = (defpackage.vs3) r0
            if (r0 == 0) goto L7d
            t33 r1 = r11.K
            if (r1 == 0) goto L7a
            dl0 r1 = r11.getCoroutineScope()
            s1 r2 = new s1
            r2.<init>(r11, r0, r4, r3)
            defpackage.p70.g0(r1, r4, r4, r2, r3)
        L7a:
            r11.w0(r12)
        L7d:
            if (r0 == 0) goto L80
        L7f:
            return r6
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1.t(android.view.KeyEvent):boolean");
    }

    public final void t0() {
        if (this.U != null) {
            return;
        }
        oz1 oz1Var = this.L ? this.R : null;
        if (oz1Var != null) {
            t33 t33Var = this.K;
            if (t33Var == null) {
                t33Var = new t33();
                this.K = t33Var;
            }
            this.Q.n0(t33Var);
            t33 t33Var2 = this.K;
            t33Var2.getClass();
            tt0 a = oz1Var.a(t33Var2);
            j0(a);
            this.U = a;
        }
    }

    public boolean v0(KeyEvent keyEvent) {
        return false;
    }

    public void w0(KeyEvent keyEvent) {
        x0();
    }

    public final void x0() {
        tt4 tt4Var = (tt4) j42.r(this, hf0.v);
        if (tt4Var != null) {
            tt4Var.a();
        }
        this.P.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(defpackage.t33 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.t64 r9, defpackage.rm1 r10) {
        /*
            r4 = this;
            t33 r0 = r4.a0
            boolean r0 = defpackage.j42.c(r0, r5)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r4.n0()
            r4.a0 = r5
            r4.K = r5
            r5 = r1
            goto L14
        L13:
            r5 = r2
        L14:
            boolean r0 = r4.L
            if (r0 == r6) goto L20
            r4.L = r6
            if (r6 == 0) goto L1f
            r4.U()
        L1f:
            r5 = r1
        L20:
            boolean r6 = r4.O
            r0 = 0
            zi1 r3 = r4.Q
            if (r6 == r7) goto L4b
            if (r7 == 0) goto L2d
            r4.j0(r3)
            goto L33
        L2d:
            r4.k0(r3)
            r4.n0()
        L33:
            wa2 r6 = defpackage.ut0.U(r4)
            r6.I()
            if (r7 != 0) goto L49
            kp1 r6 = r4.S
            if (r6 == 0) goto L43
            r4.k0(r6)
        L43:
            r4.S = r0
            java.lang.String r6 = "idle"
            r4.T = r6
        L49:
            r4.O = r7
        L4b:
            java.lang.String r6 = r4.M
            boolean r6 = defpackage.j42.c(r6, r8)
            if (r6 != 0) goto L5c
            r4.M = r8
            wa2 r6 = defpackage.ut0.U(r4)
            r6.I()
        L5c:
            t64 r6 = r4.N
            boolean r6 = defpackage.j42.c(r6, r9)
            if (r6 != 0) goto L6d
            r4.N = r9
            wa2 r6 = defpackage.ut0.U(r4)
            r6.I()
        L6d:
            r4.P = r10
            boolean r6 = r4.b0
            t33 r7 = r4.a0
            if (r7 != 0) goto L77
            r8 = r1
            goto L78
        L77:
            r8 = r2
        L78:
            if (r6 == r8) goto L87
            if (r7 != 0) goto L7d
            r2 = r1
        L7d:
            r4.b0 = r2
            if (r2 != 0) goto L86
            tt0 r6 = r4.U
            if (r6 != 0) goto L86
            goto L89
        L86:
            r6 = r2
        L87:
            r1 = r5
            r2 = r6
        L89:
            if (r1 == 0) goto L9b
            tt0 r5 = r4.U
            if (r5 != 0) goto L91
            if (r2 != 0) goto L9b
        L91:
            if (r5 == 0) goto L96
            r4.k0(r5)
        L96:
            r4.U = r0
            r4.t0()
        L9b:
            t33 r4 = r4.K
            r3.n0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1.y0(t33, boolean, boolean, java.lang.String, t64, rm1):void");
    }

    @Override // defpackage.vp3
    public final /* synthetic */ void D() {
    }

    public void u0() {
    }

    public void m0(cj4 cj4Var) {
    }
}

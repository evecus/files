package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dy4 extends wt0 implements na2, w31, la5, ye0, kd3, xe0 {
    public ay4 K;
    public ux4 L;
    public final q44 M;
    public ey4 N;
    public ey4 O;
    public jr1 P;
    public iy3 Q;
    public final zw R;
    public y43 S;
    public t33 T;
    public tf2 U;
    public long V;
    public da2 W;
    public dn4 X;
    public yg3 Y;
    public zm4[] Z;
    public z02[] a0;
    public zm4[] b0;
    public p41[] c0;
    public rv4 d0;

    public dy4(y43 y43Var, ux4 ux4Var) {
        this.L = ux4Var;
        q44 q44Var = new q44();
        q44Var.I = 1.0f;
        ze5 ze5Var = ze5.a;
        q44Var.T = ze5Var;
        q44Var.U = ze5Var;
        this.M = q44Var;
        this.N = new ey4();
        this.R = new zw();
        this.S = y43Var == null ? new y43(null) : y43Var;
        this.V = 9205357640488583168L;
    }

    public static ey4 o0(dy4 dy4Var, int i) {
        ey4 ey4Var = dy4Var.N;
        q44 q44Var = dy4Var.M;
        if ((q44Var.d() & i) == 0) {
            return ey4Var;
        }
        ey4 ey4Var2 = new ey4();
        q44Var.h(i, ey4Var2);
        return ey4Var2;
    }

    @Override // defpackage.xe0
    public final Object Q(xx3 xx3Var) {
        return j42.r(this, xx3Var);
    }

    @Override // defpackage.kd3
    public final void U() {
        p0(false);
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        wy wyVar;
        wy wyVar2;
        wy wyVar3;
        Object obj;
        wy wyVar4;
        ey4 ey4Var;
        float f;
        long j;
        p41[] p41VarArr;
        yg3 a;
        float f2;
        Object obj2;
        z02[] z02VarArr;
        zw zwVar;
        dn1 m6Var;
        dn1 wwVar;
        aj5 aj5Var = mw2.j;
        ey4 o0 = o0(this, 2);
        long j2 = x70.g;
        long j3 = o0.v((byte) 34) ? o0.z : j2;
        if (o0.w(51)) {
            wyVar = o0.A;
            wyVar.getClass();
        } else {
            wyVar = null;
        }
        if (o0.v((byte) 36)) {
            j2 = o0.B;
        }
        if (o0.w(52)) {
            wyVar2 = o0.C;
            wyVar2.getClass();
        } else {
            wyVar2 = null;
        }
        long j4 = x70.b;
        if (o0.v((byte) 35)) {
            j4 = o0.x;
        }
        if (o0.w(50)) {
            wyVar3 = o0.y;
            wyVar3.getClass();
        } else {
            wyVar3 = null;
        }
        float f3 = o0.v((byte) 8) ? o0.k : 0.0f;
        float f4 = f3 / 2.0f;
        dn4 dn4Var = o0.E;
        boolean z = f4 > 0.0f;
        boolean z2 = (j3 == 16 && wyVar == null) ? false : true;
        boolean z3 = (j2 == 16 && wyVar2 == null) ? false : true;
        if (o0.w(55) && (obj = o0.F) != null) {
            dn4 dn4Var2 = o0.w(53) ? o0.E : aj5Var;
            wyVar4 = wyVar3;
            zm4[] zm4VarArr = this.b0;
            ey4Var = o0;
            p41[] p41VarArr2 = this.c0;
            f = f3;
            boolean z4 = obj instanceof Object[];
            int length = z4 ? ((Object[]) obj).length : 1;
            j = j4;
            if (zm4VarArr == null || !j42.c(this.X, dn4Var2)) {
                zm4[] zm4VarArr2 = new zm4[length];
                for (int i = 0; i < length; i++) {
                    zm4VarArr2[i] = null;
                }
                this.b0 = zm4VarArr2;
                p41[] p41VarArr3 = new p41[length];
                for (int i2 = 0; i2 < length; i2++) {
                    p41VarArr3[i2] = null;
                }
                this.c0 = p41VarArr3;
            } else if (zm4VarArr.length != length) {
                this.b0 = (zm4[]) Arrays.copyOf(zm4VarArr, length);
                if (p41VarArr2 != null) {
                    p41VarArr = (p41[]) Arrays.copyOf(p41VarArr2, length);
                } else {
                    p41VarArr = new p41[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        p41VarArr[i3] = null;
                    }
                }
                this.c0 = p41VarArr;
            }
            if (z4) {
                Object[] objArr = (Object[]) obj;
                int length2 = objArr.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    Object obj3 = objArr[i4];
                    if (obj3 instanceof zm4) {
                        m0((ya2) zh0Var, i4, dn4Var2, (zm4) obj3);
                    }
                }
            } else if (obj instanceof zm4) {
                m0((ya2) zh0Var, 0, dn4Var2, (zm4) obj);
            }
        } else {
            ey4Var = o0;
            j = j4;
            wyVar4 = wyVar3;
            f = f3;
        }
        ya2 ya2Var = (ya2) zh0Var;
        r10 r10Var = ya2Var.I;
        long H = r10Var.J.H();
        if (fq4.a(this.V, H) && this.W == ya2Var.getLayoutDirection() && j42.c(this.X, dn4Var)) {
            a = this.Y;
            a.getClass();
        } else {
            a = dn4Var.a(H, ya2Var.getLayoutDirection(), ya2Var);
        }
        this.Y = a;
        this.V = H;
        this.W = ya2Var.getLayoutDirection();
        if (!z2) {
            f2 = 0.0f;
        } else if (wyVar != null) {
            f2 = 0.0f;
            lq2.y(ya2Var, a, wyVar, 0.0f, 60);
        } else {
            f2 = 0.0f;
            lq2.z(zh0Var, a, j3);
        }
        ya2Var.a();
        if (z3) {
            if (wyVar2 != null) {
                lq2.y(ya2Var, a, wyVar2, f2, 60);
            } else {
                lq2.z(zh0Var, a, j2);
            }
        }
        if (z) {
            wy rt4Var = wyVar4 == null ? new rt4(j) : wyVar4;
            by4 by4Var = new by4(f);
            iy3 iy3Var = this.Q;
            if (iy3Var == null) {
                iy3Var = new iy3(this, (byte) 9);
                this.Q = iy3Var;
            }
            final iy3 iy3Var2 = iy3Var;
            final zw zwVar2 = this.R;
            zwVar2.b = by4Var;
            if (rt4Var.equals((wy) zwVar2.c) && a.equals((yg3) zwVar2.d) && ((tm1) zwVar2.e) != null) {
                zwVar = zwVar2;
            } else {
                zwVar2.c = rt4Var;
                zwVar2.d = a;
                if (a instanceof vg3) {
                    final vg3 vg3Var = (vg3) a;
                    yd ydVar = vg3Var.a;
                    final m14 a2 = ydVar.a();
                    float f5 = a2.b;
                    float f6 = a2.d;
                    float f7 = a2.a;
                    final float min = Math.min(Math.abs(a2.c - f7), Math.abs(f6 - f5));
                    yd ydVar2 = (yd) zwVar2.a;
                    if (ydVar2 == null) {
                        ydVar2 = ae.a();
                        zwVar2.a = ydVar2;
                    }
                    ydVar2.d();
                    hf1.i(ydVar2, a2);
                    ydVar2.c(ydVar2, ydVar, 0);
                    final long ceil = (((int) Math.ceil(r12 - f7)) << 32) | (((int) Math.ceil(f6 - f5)) & 4294967295L);
                    final yd ydVar3 = ydVar2;
                    final wy wyVar5 = rt4Var;
                    m6Var = new tm1() { // from class: xw
                        @Override // defpackage.tm1
                        public final Object invoke(Object obj4) {
                            long j5 = ceil;
                            final yd ydVar4 = ydVar3;
                            y31 y31Var = (y31) obj4;
                            by4 by4Var2 = (by4) zw.this.b;
                            by4Var2.getClass();
                            float floatValue = Float.valueOf(by4Var2.I).floatValue();
                            final float f8 = floatValue < 0.0f ? 0.0f : floatValue;
                            float f9 = 2.0f * f8;
                            float f10 = min;
                            final vg3 vg3Var2 = vg3Var;
                            final wy wyVar6 = wyVar5;
                            if (f9 > f10) {
                                r7.j(y31Var, vg3Var2.a, wyVar6, 0.0f, null, null, 60);
                            } else {
                                jr1 jr1Var = (jr1) iy3Var2.invoke();
                                lr1 lr1Var = jr1Var.a;
                                if (lr1Var.j() != 1) {
                                    lr1Var.D(1);
                                }
                                final m14 m14Var = a2;
                                float f11 = m14Var.a;
                                float f12 = m14Var.b;
                                ((ep) y31Var.S().b).K(f11, f12);
                                try {
                                    y31Var.T(jr1Var, j5, new tm1() { // from class: yw
                                        @Override // defpackage.tm1
                                        public final Object invoke(Object obj5) {
                                            y31 y31Var2;
                                            yd ydVar5;
                                            rx4 rx4Var;
                                            vg3 vg3Var3 = vg3Var2;
                                            wy wyVar7 = wyVar6;
                                            float f13 = f8;
                                            yd ydVar6 = ydVar4;
                                            y31 y31Var3 = (y31) obj5;
                                            m14 m14Var2 = m14.this;
                                            float f14 = -m14Var2.a;
                                            float f15 = -m14Var2.b;
                                            ((ep) y31Var3.S().b).K(f14, f15);
                                            try {
                                                ydVar5 = vg3Var3.a;
                                                rx4Var = new rx4(f13 * 2.0f, 0.0f, 0, 0, 30);
                                                y31Var2 = y31Var3;
                                            } catch (Throwable th) {
                                                th = th;
                                                y31Var2 = y31Var3;
                                            }
                                            try {
                                                r7.j(y31Var2, ydVar5, wyVar7, 0.0f, rx4Var, null, 52);
                                                float intBitsToFloat = (Float.intBitsToFloat((int) (y31Var2.c() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (y31Var2.c() >> 32));
                                                float intBitsToFloat2 = (Float.intBitsToFloat((int) (y31Var2.c() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (y31Var2.c() & 4294967295L));
                                                long Y = y31Var2.Y();
                                                pn S = y31Var2.S();
                                                long H2 = S.H();
                                                S.q().f();
                                                try {
                                                    ((ep) S.b).H(intBitsToFloat, intBitsToFloat2, Y);
                                                    r7.j(y31Var2, ydVar6, wyVar7, 0.0f, null, null, 28);
                                                    ((ep) y31Var2.S().b).K(-f14, -f15);
                                                    return wd5.a;
                                                } finally {
                                                    S.q().n();
                                                    S.X(H2);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                ((ep) y31Var2.S().b).K(-f14, -f15);
                                                throw th;
                                            }
                                        }
                                    });
                                    vt0.o(y31Var, jr1Var);
                                } finally {
                                    ((ep) y31Var.S().b).K(-f11, -f12);
                                }
                            }
                            return wd5.a;
                        }
                    };
                    zwVar = zwVar2;
                } else {
                    zwVar = zwVar2;
                    if (a instanceof xg3) {
                        h74 h74Var = ((xg3) a).a;
                        if (sv2.H(h74Var)) {
                            wwVar = new m6((Object) zwVar, (Object) h74Var, (Object) rt4Var, (byte) 2);
                        } else {
                            yd ydVar4 = (yd) zwVar.a;
                            if (ydVar4 == null) {
                                ydVar4 = ae.a();
                                zwVar.a = ydVar4;
                            }
                            yd ydVar5 = ydVar4;
                            o24 o24Var = new o24();
                            o24Var.I = Float.NaN;
                            wwVar = new ww(zwVar, h74Var, o24Var, new r24(), ydVar5, rt4Var, (byte) 0);
                        }
                        m6Var = wwVar;
                    } else {
                        if (!(a instanceof wg3)) {
                            s83.v();
                            return;
                        }
                        m6Var = new m6((Object) zwVar, (Object) ((wg3) a).a, (Object) rt4Var, (byte) 3);
                    }
                }
                zwVar.e = m6Var;
            }
            if (pd3.c(0L, 0L)) {
                tm1 tm1Var = (tm1) zwVar.e;
                tm1Var.getClass();
                tm1Var.invoke(zh0Var);
            } else {
                float intBitsToFloat = Float.intBitsToFloat(0);
                float intBitsToFloat2 = Float.intBitsToFloat(0);
                ((ep) r10Var.J.b).K(intBitsToFloat, intBitsToFloat2);
                try {
                    tm1 tm1Var2 = (tm1) zwVar.e;
                    tm1Var2.getClass();
                    tm1Var2.invoke(zh0Var);
                } finally {
                    ((ep) r10Var.J.b).K(-intBitsToFloat, -intBitsToFloat2);
                }
            }
        }
        ey4 ey4Var2 = ey4Var;
        if (ey4Var2.w(56) && (obj2 = ey4Var2.G) != null) {
            dn4 dn4Var3 = ey4Var2.w(53) ? ey4Var2.E : aj5Var;
            zm4[] zm4VarArr3 = this.Z;
            z02[] z02VarArr2 = this.a0;
            boolean z5 = obj2 instanceof Object[];
            int length3 = z5 ? ((Object[]) obj2).length : 1;
            if (zm4VarArr3 == null || !j42.c(this.X, dn4Var3)) {
                zm4[] zm4VarArr4 = new zm4[length3];
                for (int i5 = 0; i5 < length3; i5++) {
                    zm4VarArr4[i5] = null;
                }
                this.Z = zm4VarArr4;
                z02[] z02VarArr3 = new z02[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    z02VarArr3[i6] = null;
                }
                this.a0 = z02VarArr3;
            } else if (zm4VarArr3.length != length3) {
                this.Z = (zm4[]) Arrays.copyOf(zm4VarArr3, length3);
                if (z02VarArr2 != null) {
                    z02VarArr = (z02[]) Arrays.copyOf(z02VarArr2, length3);
                } else {
                    z02VarArr = new z02[length3];
                    for (int i7 = 0; i7 < length3; i7++) {
                        z02VarArr[i7] = null;
                    }
                }
                this.a0 = z02VarArr;
            }
            if (z5) {
                Object[] objArr2 = (Object[]) obj2;
                int length4 = objArr2.length;
                for (int i8 = 0; i8 < length4; i8++) {
                    Object obj4 = objArr2[i8];
                    if (obj4 instanceof zm4) {
                        n0(ya2Var, i8, dn4Var3, (zm4) obj4);
                    }
                }
            } else if (obj2 instanceof zm4) {
                n0(ya2Var, 0, dn4Var3, (zm4) obj2);
            }
        }
        this.X = dn4Var;
    }

    @Override // defpackage.la5
    public final Object g() {
        return "StyleOuterNode";
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void m0(ya2 ya2Var, int i, dn4 dn4Var, zm4 zm4Var) {
        zm4[] zm4VarArr = this.b0;
        zm4 zm4Var2 = zm4VarArr != null ? (zm4) dq.e1(i, zm4VarArr) : null;
        p41[] p41VarArr = this.c0;
        p41 p41Var = p41VarArr != null ? (p41) dq.e1(i, p41VarArr) : null;
        if (!j42.c(zm4Var2, zm4Var) || p41Var == null) {
            g12 b = ut0.V(this).getGraphicsContext().b();
            b.getClass();
            p41Var = new p41(dn4Var, zm4Var, b);
        }
        p41 p41Var2 = p41Var;
        zm4[] zm4VarArr2 = this.b0;
        if (zm4VarArr2 != null) {
            zm4VarArr2[i] = zm4Var;
        }
        p41[] p41VarArr2 = this.c0;
        if (p41VarArr2 != null) {
            p41VarArr2[i] = p41Var2;
        }
        rj3.m366drawx_KDEd0$default(p41Var2, ya2Var, ya2Var.I.J.H(), 0.0f, null, 6, null);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.i(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.l(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, final long j) {
        int i;
        int i2;
        int i3;
        int i4;
        ey4 o0 = o0(this, 12);
        float f = o0.v((byte) 4) ? o0.g : 0.0f;
        float f2 = o0.v((byte) 13) ? o0.p : 0.0f;
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f3 = f;
        float f4 = o0.v((byte) 5) ? o0.h : 0.0f;
        float f5 = o0.v((byte) 15) ? o0.r : 0.0f;
        if (!Float.isNaN(f5)) {
            f4 += f5;
        }
        float f6 = o0.v((byte) 6) ? o0.i : 0.0f;
        float f7 = o0.v((byte) 14) ? o0.q : 0.0f;
        if (!Float.isNaN(f7)) {
            f6 += f7;
        }
        float f8 = o0.v((byte) 7) ? o0.j : 0.0f;
        float f9 = o0.v((byte) 16) ? o0.s : 0.0f;
        if (!Float.isNaN(f9)) {
            f8 += f9;
        }
        int round = Math.round(f3 + f4);
        int round2 = Math.round(f6 + f8);
        int j2 = dh0.j(j) - round;
        if (j2 < 0) {
            j2 = 0;
        }
        int h = dh0.h(j);
        if (h != Integer.MAX_VALUE && (h = h + round) < 0) {
            h = 0;
        }
        int i5 = dh0.i(j) - round2;
        int i6 = i5 < 0 ? 0 : i5;
        int g = dh0.g(j);
        if (g != Integer.MAX_VALUE && (g = g + round2) < 0) {
            g = 0;
        }
        if (o0.v((byte) 19)) {
            i = Math.round(o0.w);
            if (i < 0) {
                i = 0;
            }
        } else {
            i = Integer.MAX_VALUE;
        }
        if (o0.v((byte) 17)) {
            i2 = Math.round(o0.v);
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 > i) {
                i2 = i;
            }
        } else {
            i2 = 0;
        }
        if (o0.v((byte) 9)) {
            int round3 = Math.round(o0.l);
            if (round3 >= i2) {
                i2 = round3;
            }
            if (i2 <= i) {
                i = i2;
            }
            i2 = i;
        }
        if (i2 != 0) {
            if (i2 >= j2) {
                j2 = i2;
            }
            if (j2 > h) {
                j2 = h;
            }
        }
        if (i != Integer.MAX_VALUE) {
            if (i < j2) {
                i = j2;
            }
            if (i <= h) {
                h = i;
            }
        }
        if (!o0.v((byte) 9)) {
            if (o0.v((byte) 11) && dh0.d(j)) {
                int round4 = Math.round(h * o0.n);
                if (round4 >= j2) {
                    j2 = round4;
                }
                if (j2 > h) {
                    j2 = h;
                }
                h = j2;
            } else if (o0.v((byte) 13) && o0.v((byte) 15)) {
                j2 = h;
            }
        }
        if (o0.v((byte) 20)) {
            i3 = Math.round(o0.u);
            if (i3 < 0) {
                i3 = 0;
            }
        } else {
            i3 = Integer.MAX_VALUE;
        }
        if (o0.v((byte) 18)) {
            i4 = Math.round(o0.t);
            if (i4 < 0) {
                i4 = 0;
            }
            if (i4 > i3) {
                i4 = i3;
            }
        } else {
            i4 = 0;
        }
        if (o0.v((byte) 10)) {
            int round5 = Math.round(o0.m);
            if (round5 >= i4) {
                i4 = round5;
            }
            if (i4 <= i3) {
                i3 = i4;
            }
            i4 = i3;
        }
        if (i4 != 0) {
            if (i4 >= i6) {
                i6 = i4;
            }
            if (i6 > g) {
                i6 = g;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            if (i3 < i6) {
                i3 = i6;
            }
            if (i3 <= g) {
                g = i3;
            }
        }
        if (!o0.v((byte) 10)) {
            if (o0.v((byte) 12) && dh0.c(j)) {
                int round6 = Math.round(g * o0.o);
                if (round6 >= i6) {
                    i6 = round6;
                }
                if (i6 > g) {
                    i6 = g;
                }
                g = i6;
            } else if (o0.v((byte) 14) && o0.v((byte) 16)) {
                i6 = g;
            }
        }
        final bn3 u = pw2Var.u(eh0.a(j2, h, i6, g));
        final float f10 = f4;
        final float f11 = f6;
        final float f12 = f8;
        return ww2Var.A(u.I + round, u.J + round2, p91.I, new tm1() { // from class: cy4
            @Override // defpackage.tm1
            public final Object invoke(Object obj) {
                an3 an3Var = (an3) obj;
                dy4 dy4Var = dy4.this;
                ey4 o02 = dy4.o0(dy4Var, 12);
                boolean v = o02.v((byte) 13);
                long j3 = j;
                bn3 bn3Var = u;
                int round7 = (v || !o02.v((byte) 15)) ? Math.round(f3) : (dh0.h(j3) - bn3Var.I) - Math.round(f10);
                int round8 = (!o02.v((byte) 16) || o02.v((byte) 14)) ? Math.round(f11) : (dh0.g(j3) - bn3Var.J) - Math.round(f12);
                if ((o02.r() & 4) != 0) {
                    tf2 tf2Var = dy4Var.U;
                    if (tf2Var == null) {
                        tf2Var = new tf2(dy4Var, (byte) 27);
                        dy4Var.U = tf2Var;
                    }
                    an3.o(an3Var, bn3Var, round7, round8, tf2Var, 4);
                } else {
                    an3.g(an3Var, bn3Var, round7, round8);
                }
                return wd5.a;
            }
        });
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        return i82.o(this, b42Var, a42Var, i);
    }

    @Override // defpackage.na2
    public final /* synthetic */ int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        return i82.r(this, b42Var, a42Var, i);
    }

    public final void n0(ya2 ya2Var, int i, dn4 dn4Var, zm4 zm4Var) {
        zm4[] zm4VarArr = this.Z;
        zm4 zm4Var2 = zm4VarArr != null ? (zm4) dq.e1(i, zm4VarArr) : null;
        z02[] z02VarArr = this.a0;
        z02 z02Var = z02VarArr != null ? (z02) dq.e1(i, z02VarArr) : null;
        if (!j42.c(zm4Var2, zm4Var) || z02Var == null) {
            g12 b = ut0.V(this).getGraphicsContext().b();
            b.getClass();
            z02Var = new z02(dn4Var, zm4Var, b);
        }
        z02 z02Var2 = z02Var;
        zm4[] zm4VarArr2 = this.Z;
        if (zm4VarArr2 != null) {
            zm4VarArr2[i] = zm4Var;
        }
        z02[] z02VarArr2 = this.a0;
        if (z02VarArr2 != null) {
            z02VarArr2[i] = z02Var2;
        }
        rj3.m366drawx_KDEd0$default(z02Var2, ya2Var, ya2Var.I.J.H(), 0.0f, null, 6, null);
    }

    @Override // defpackage.k13
    public final void onDetach() {
        super.onDetach();
        jr1 jr1Var = this.P;
        if (jr1Var != null) {
            ut0.V(this).getGraphicsContext().a(jr1Var);
            this.P = null;
        }
        this.Q = null;
    }

    public final void p0(boolean z) {
        ey4 ey4Var;
        int r;
        ey4 ey4Var2;
        if (isAttached()) {
            fj0 fj0Var = null;
            ey4 ey4Var3 = z ? null : this.N;
            if (z) {
                ey4Var = this.N;
            } else {
                ey4Var = this.O;
                if (ey4Var == null) {
                    ey4Var = new ey4();
                    this.O = ey4Var;
                }
            }
            ey4 ey4Var4 = ey4Var;
            iu0 iu0Var = ut0.U(this).g0;
            p24 p24Var = new p24();
            q44 q44Var = this.M;
            g12 g12Var = q44Var.V;
            ey4 ey4Var5 = q44Var.K;
            if (g12Var == null || ey4Var5 == null) {
                q44Var.M = null;
            } else {
                long z2 = g12Var.z();
                if (z2 != 0) {
                    long j = z2 & 2251799813685247L;
                    int i = (int) (z2 >> 50);
                    ey4 ey4Var6 = new ey4();
                    g12 g12Var2 = q44Var.V;
                    if (g12Var2 != null && ((ey4Var2 = q44Var.N) != null || (ey4Var2 = q44Var.L) != null)) {
                        ey4 ey4Var7 = ey4Var2;
                        ey4 ey4Var8 = q44Var.K;
                        if (ey4Var8 != null) {
                            fy4.a(ey4Var7, ey4Var8, g12Var2, j, i, ey4Var6);
                        }
                    }
                    q44Var.M = ey4Var6;
                } else {
                    q44Var.M = null;
                }
            }
            mu0.P(this, new ke(this, iu0Var, ey4Var4, ey4Var3, p24Var, (byte) 4));
            int i2 = p24Var.I;
            if (ey4Var3 != null) {
                long j2 = fy4.b | fy4.c | fy4.d;
                long j3 = fy4.e;
                long j4 = j2 | j3 | fy4.f | fy4.g;
                int i3 = fy4.h | fy4.i | fy4.j;
                int i4 = fy4.k;
                int i5 = i3 | i4 | fy4.l | fy4.m;
                long i6 = ey4Var3.i(ey4Var4, j4);
                int h = ey4Var3.h(i5, ey4Var4);
                r = fy4.g(i6) | fy4.e(h);
                if ((h & 8) != 0 && ((ey4Var3.a & j3) != 0 || (ey4Var3.b & i4) != 0 || (j3 & ey4Var4.a) != 0 || (ey4Var4.b & i4) != 0)) {
                    r |= 4;
                }
            } else {
                r = ey4Var4.r();
            }
            int i7 = i2 | r;
            if (!j42.c(this.S.a, this.T)) {
                rv4 rv4Var = this.d0;
                if (rv4Var != null) {
                    rv4Var.e(null);
                }
                t33 t33Var = this.S.a;
                this.T = t33Var;
                if (t33Var != null) {
                    this.d0 = p70.g0(getCoroutineScope(), null, null, new gu2((Object) this, (Object) t33Var, fj0Var, (byte) 21), 3);
                }
            }
            if (z) {
                return;
            }
            if ((i7 & 1) != 0) {
                ay4 ay4Var = this.K;
                if (ay4Var == null) {
                    zy.i("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                ut0.U(ay4Var).H();
            }
            if ((i7 & 8) != 0) {
                ut0.U(this).H();
            }
            if ((i7 & 2) != 0) {
                mu0.I(this);
                ay4 ay4Var2 = this.K;
                if (ay4Var2 == null) {
                    zy.i("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                ut0.S(ay4Var2, 2).S0();
            }
            if ((i7 & 4) != 0) {
                tf2 tf2Var = this.U;
                if (tf2Var == null) {
                    tf2Var = new tf2(this, (byte) 27);
                    this.U = tf2Var;
                }
                sp0.r0(this, tf2Var);
            }
            if ((i7 & 16) != 0 && getNode().isAttached()) {
                ut0.U(this).G();
            }
            if ((i7 & 32) == 0 || !getNode().isAttached()) {
                return;
            }
            ut0.U(this).D(true);
        }
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}

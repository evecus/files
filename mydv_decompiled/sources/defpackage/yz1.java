package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yz1 implements l31 {
    public final g31 I;
    public tz1 J;
    public wz1 K;
    public vz1 L;
    public uz1 M;
    public k21 N;
    public g73 O;
    public d95 P;
    public final yw0 Q;
    public final yw0 R;

    public yz1(g31 g31Var) {
        this.I = g31Var;
        yw0 yw0Var = new yw0((byte) 1, false);
        yw0Var.c = new e43();
        this.Q = yw0Var;
        yw0 yw0Var2 = new yw0((byte) 4, false);
        yw0Var2.c = new v33();
        this.R = yw0Var2;
    }

    public static void c(yz1 yz1Var, rz1 rz1Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        g31 g31Var = yz1Var.I;
        vz1 vz1Var = yz1Var.L;
        if (vz1Var == null) {
            vz1Var = new vz1();
            vz1Var.j = null;
            vz1Var.k = Long.MAX_VALUE;
            vz1Var.l = false;
            yz1Var.L = vz1Var;
        }
        vz1Var.j = rz1Var;
        vz1Var.k = j;
        d95 d95Var = yz1Var.P;
        pg3 pg3Var = g31Var.K;
        if (d95Var == null) {
            yz1Var.P = new d95(pg3Var);
        } else {
            d95Var.b = pg3Var;
            d95Var.a = j2;
        }
        vz1Var.l = false;
        yz1Var.N = vz1Var;
    }

    @Override // defpackage.jp1
    public final String E() {
        k21 k21Var = this.N;
        return k21Var instanceof tz1 ? ((tz1) k21Var).l ? "waiting" : "idle" : ((k21Var instanceof vz1) || (k21Var instanceof uz1)) ? "waiting" : k21Var instanceof wz1 ? "recognized" : "idle";
    }

    @Override // defpackage.l31
    public final pg3 J() {
        return this.I.K;
    }

    public final void a() {
        tz1 tz1Var = this.J;
        sz1 sz1Var = sz1.K;
        if (tz1Var == null) {
            tz1Var = new tz1();
            tz1Var.j = sz1Var;
            tz1Var.k = false;
            tz1Var.l = false;
            this.J = tz1Var;
        }
        tz1Var.j = sz1Var;
        tz1Var.k = false;
        tz1Var.l = false;
        this.N = tz1Var;
    }

    public final void b(rz1 rz1Var, long j, d95 d95Var) {
        uz1 uz1Var = this.M;
        if (uz1Var == null) {
            uz1Var = new uz1();
            uz1Var.j = null;
            uz1Var.k = Long.MAX_VALUE;
            this.M = uz1Var;
        }
        uz1Var.j = rz1Var;
        uz1Var.k = j;
        d95Var.a = 0L;
        this.N = uz1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    public final void d(pz1 pz1Var, lp3 lp3Var) {
        Object obj;
        char c;
        float f;
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        boolean z;
        lp3 lp3Var2;
        Object obj2;
        rz1 rz1Var;
        k21 k21Var = this.N;
        k21 k21Var2 = k21Var;
        if (k21Var == null) {
            tz1 tz1Var = this.J;
            tz1 tz1Var2 = tz1Var;
            if (tz1Var == null) {
                tz1 tz1Var3 = new tz1();
                tz1Var3.j = sz1.K;
                tz1Var3.k = false;
                tz1Var3.l = false;
                this.J = tz1Var3;
                tz1Var2 = tz1Var3;
            }
            this.N = tz1Var2;
            k21Var2 = tz1Var2;
        }
        boolean z2 = k21Var2 instanceof tz1;
        lp3 lp3Var3 = lp3.I;
        lp3 lp3Var4 = lp3.J;
        g31 g31Var = this.I;
        if (z2) {
            tz1 tz1Var4 = (tz1) k21Var2;
            if (((fd) pz1Var).a.isEmpty()) {
                return;
            }
            fd fdVar = (fd) pz1Var;
            int i = fdVar.b;
            ArrayList arrayList = fdVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!e41.v((rz1) arrayList.get(i2))) {
                    return;
                }
            }
            rz1 rz1Var2 = (rz1) o70.T0(arrayList);
            int i3 = xz1.a[tz1Var4.j.ordinal()];
            sz1 sz1Var = sz1.J;
            sz1 sz1Var2 = sz1.I;
            sz1 sz1Var3 = i3 == 1 ? !g31Var.B0() ? sz1Var2 : sz1Var : tz1Var4.j;
            tz1Var4.j = sz1Var3;
            if (lp3Var == lp3Var3) {
                if (sz1Var3 == sz1Var) {
                    rz1Var2.i = true;
                    tz1Var4.k = true;
                }
                tz1Var4.l = true;
            }
            if (lp3Var == lp3Var4) {
                if (sz1Var3 == sz1Var2) {
                    c(this, rz1Var2, rz1Var2.a, 0L, 12);
                    return;
                }
                if (tz1Var4.k) {
                    h(rz1Var2, rz1Var2, new qz1(i), 0L);
                    g(rz1Var2, new qz1(i), 0L);
                    long j2 = rz1Var2.a;
                    wz1 wz1Var = this.K;
                    if (wz1Var == null) {
                        wz1Var = new wz1();
                        wz1Var.j = Long.MAX_VALUE;
                        this.K = wz1Var;
                    }
                    wz1Var.j = j2;
                    this.N = wz1Var;
                    return;
                }
                return;
            }
            return;
        }
        boolean z3 = k21Var2 instanceof vz1;
        lp3 lp3Var5 = lp3.K;
        rz1 rz1Var3 = null;
        if (z3) {
            vz1 vz1Var = (vz1) k21Var2;
            if (lp3Var == lp3Var3) {
                return;
            }
            ArrayList arrayList2 = ((fd) pz1Var).a;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    lp3Var2 = lp3Var5;
                    obj2 = null;
                    break;
                }
                obj2 = arrayList2.get(i4);
                lp3Var2 = lp3Var5;
                if (rt0.p(((rz1) obj2).a, vz1Var.k)) {
                    break;
                }
                i4++;
                lp3Var5 = lp3Var2;
            }
            rz1 rz1Var4 = (rz1) obj2;
            if (rz1Var4 == null) {
                ArrayList arrayList3 = ((fd) pz1Var).a;
                int size3 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        rz1Var = 0;
                        break;
                    }
                    rz1Var = arrayList3.get(i5);
                    if (((rz1) rz1Var).d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                rz1Var4 = rz1Var;
                if (rz1Var4 == null) {
                    a();
                    return;
                }
                vz1Var.k = rz1Var4.a;
            }
            rz1 rz1Var5 = rz1Var4;
            if (lp3Var == lp3Var4) {
                if (rz1Var5.i) {
                    rz1 rz1Var6 = vz1Var.j;
                    if (rz1Var6 == null) {
                        s83.t("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = vz1Var.k;
                    d95 d95Var = this.P;
                    if (d95Var == null) {
                        s83.t("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    b(rz1Var6, j3, d95Var);
                } else if (e41.w(rz1Var5)) {
                    ArrayList arrayList4 = ((fd) pz1Var).a;
                    int size4 = arrayList4.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            break;
                        }
                        ?? r5 = arrayList4.get(i6);
                        if (((rz1) r5).d) {
                            rz1Var3 = r5;
                            break;
                        }
                        i6++;
                    }
                    rz1 rz1Var7 = rz1Var3;
                    if (rz1Var7 == null) {
                        a();
                    } else {
                        vz1Var.k = rz1Var7.a;
                    }
                } else {
                    gr5 gr5Var = (gr5) j42.r(g31Var, hf0.t);
                    float f2 = z21.a;
                    float f3 = gr5Var.f();
                    d95 d95Var2 = this.P;
                    if (d95Var2 == null) {
                        s83.t("Touch slop detector not initialized.");
                        return;
                    }
                    pg3 pg3Var = g31Var.K;
                    int i7 = ((fd) pz1Var).b;
                    long a = d95.a(d95Var2, e41.c0(rz1Var5, pg3Var, new qz1(i7), true), f3);
                    if ((9223372034707292159L & a) != 9205357640488583168L) {
                        rz1Var5.i = true;
                        rz1 rz1Var8 = vz1Var.j;
                        rz1Var8.getClass();
                        h(rz1Var8, rz1Var5, new qz1(i7), a);
                        g(rz1Var5, new qz1(i7), a);
                        long j4 = rz1Var5.a;
                        wz1 wz1Var2 = this.K;
                        if (wz1Var2 == null) {
                            wz1Var2 = new wz1();
                            wz1Var2.j = Long.MAX_VALUE;
                            this.K = wz1Var2;
                        }
                        wz1Var2.j = j4;
                        this.N = wz1Var2;
                    } else {
                        vz1Var.l = true;
                    }
                }
            }
            if (lp3Var == lp3Var2 && vz1Var.l) {
                if (!rz1Var5.i) {
                    vz1Var.l = false;
                    return;
                }
                rz1 rz1Var9 = vz1Var.j;
                if (rz1Var9 == null) {
                    s83.t("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j5 = vz1Var.k;
                d95 d95Var3 = this.P;
                if (d95Var3 != null) {
                    b(rz1Var9, j5, d95Var3);
                    return;
                } else {
                    s83.t("AwaitTouchSlop.touchSlopDetector was not initialized");
                    return;
                }
            }
            return;
        }
        if (k21Var2 instanceof uz1) {
            uz1 uz1Var = (uz1) k21Var2;
            if (lp3Var != lp3Var5) {
                return;
            }
            ArrayList arrayList5 = ((fd) pz1Var).a;
            int size5 = arrayList5.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size5) {
                    z = true;
                    break;
                } else {
                    if (((rz1) arrayList5.get(i8)).i) {
                        z = false;
                        break;
                    }
                    i8++;
                }
            }
            fd fdVar2 = (fd) pz1Var;
            int i9 = fdVar2.b;
            ArrayList arrayList6 = fdVar2.a;
            int size6 = arrayList6.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size6) {
                    break;
                }
                if (!((rz1) arrayList6.get(i10)).d) {
                    i10++;
                } else if (!arrayList6.isEmpty()) {
                    if (z) {
                        long d0 = e41.d0((rz1) o70.T0(arrayList6), g31Var.K, new qz1(i9));
                        rz1 rz1Var10 = uz1Var.j;
                        rz1Var10.getClass();
                        long e = pd3.e(d0, e41.d0(rz1Var10, g31Var.K, new qz1(i9)));
                        rz1 rz1Var11 = uz1Var.j;
                        if (rz1Var11 != null) {
                            c(this, rz1Var11, uz1Var.k, e, 8);
                            return;
                        } else {
                            s83.t("AwaitGesturePickup.initialDown was not initialized.");
                            return;
                        }
                    }
                    return;
                }
            }
            a();
            return;
        }
        if (!(k21Var2 instanceof wz1)) {
            s83.v();
            return;
        }
        wz1 wz1Var3 = (wz1) k21Var2;
        if (lp3Var != lp3Var4) {
            return;
        }
        long j6 = wz1Var3.j;
        ArrayList arrayList7 = ((fd) pz1Var).a;
        int size7 = arrayList7.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size7) {
                obj = null;
                break;
            }
            obj = arrayList7.get(i11);
            if (rt0.p(((rz1) obj).a, j6)) {
                break;
            } else {
                i11++;
            }
        }
        rz1 rz1Var12 = (rz1) obj;
        if (rz1Var12 == null) {
            return;
        }
        long j7 = rz1Var12.c;
        boolean w = e41.w(rz1Var12);
        l21 l21Var = l21.a;
        if (!w) {
            if (rz1Var12.i) {
                g31Var.r0(l21Var);
                return;
            }
            pg3 pg3Var2 = g31Var.K;
            int i12 = ((fd) pz1Var).b;
            if (pd3.d(e41.c0(rz1Var12, pg3Var2, new qz1(i12), true)) == 0.0f) {
                return;
            }
            g(rz1Var12, new qz1(i12), e41.c0(rz1Var12, g31Var.K, new qz1(i12), false));
            rz1Var12.i = true;
            return;
        }
        fd fdVar3 = (fd) pz1Var;
        ArrayList arrayList8 = fdVar3.a;
        int size8 = arrayList8.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size8) {
                break;
            }
            ?? r14 = arrayList8.get(i13);
            if (((rz1) r14).d) {
                rz1Var3 = r14;
                break;
            }
            i13++;
        }
        rz1 rz1Var13 = rz1Var3;
        if (rz1Var13 != null) {
            wz1Var3.j = rz1Var13.a;
            return;
        }
        if (rz1Var12.i || !e41.w(rz1Var12)) {
            g31Var.r0(l21Var);
        } else {
            int i14 = fdVar3.b;
            g73 e2 = e();
            pg3 pg3Var3 = g31Var.K;
            yw0 yw0Var = this.Q;
            e43 e43Var = (e43) yw0Var.c;
            char c2 = ' ';
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j7 & 4294967295L));
            if (e41.v(rz1Var12)) {
                yw0Var.b = 0;
                e43Var.d();
            }
            if (e41.w(rz1Var12) || e41.v(rz1Var12)) {
                c = ' ';
                f = 0.0f;
            } else {
                if (e43Var.b == 3) {
                    int i15 = yw0Var.b;
                    yw0Var.b = i15 + 1;
                    e43Var.o(i15, rz1Var12);
                } else {
                    e43Var.a(rz1Var12);
                }
                if (yw0Var.b == 3) {
                    yw0Var.b = 0;
                }
                Object[] objArr = e43Var.a;
                int i16 = e43Var.b;
                float f4 = 0.0f;
                for (int i17 = 0; i17 < i16; i17++) {
                    f4 += Float.intBitsToFloat((int) (((rz1) objArr[i17]).c >> 32));
                }
                f = 0.0f;
                int i18 = e43Var.b;
                intBitsToFloat2 = f4 / i18;
                Object[] objArr2 = e43Var.a;
                float f5 = 0.0f;
                int i19 = 0;
                while (i19 < i18) {
                    f5 += Float.intBitsToFloat((int) (((rz1) objArr2[i19]).c & 4294967295L));
                    i19++;
                    c2 = c2;
                    intBitsToFloat2 = intBitsToFloat2;
                }
                c = c2;
                intBitsToFloat3 = f5 / e43Var.b;
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << c);
            if (pg3Var3 != null) {
                if (i14 == 1) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits2 >> c));
                } else if (i14 == 2) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L));
                }
                if (pg3Var3 == pg3.J) {
                    long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat);
                    floatToRawIntBits = Float.floatToRawIntBits(f);
                    j = floatToRawIntBits3 << c;
                } else {
                    long floatToRawIntBits4 = Float.floatToRawIntBits(f);
                    floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                    j = floatToRawIntBits4 << c;
                }
                floatToRawIntBits2 = j | (floatToRawIntBits & 4294967295L);
            }
            ((ts2) e2.J).a(rz1Var12.b, floatToRawIntBits2);
            float e3 = ((gr5) j42.r(g31Var, hf0.t)).e();
            long e4 = e().e(eg5.e(e3, e3));
            e().w();
            g31Var.r0(new o21(n31.b(e4), true));
        }
        a();
    }

    public final g73 e() {
        g73 g73Var = this.O;
        if (g73Var != null) {
            return g73Var;
        }
        s83.t("Velocity Tracker not initialized.");
        return null;
    }

    public final void f() {
        a();
        g31 g31Var = this.I;
        if (g31Var.Q) {
            g31Var.r0(l21.a);
        }
        this.O = null;
        yw0 yw0Var = this.R;
        yw0Var.b = 0;
        ((v33) yw0Var.c).b = 0;
    }

    public final void g(rz1 rz1Var, qz1 qz1Var, long j) {
        long j2;
        float intBitsToFloat;
        long j3 = rz1Var.c;
        g31 g31Var = this.I;
        pg3 pg3Var = g31Var.K;
        pg3Var.getClass();
        m31 m31Var = n31.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (pg3Var == pg3.I ? j & 4294967295L : j >> 32))) > 2.0f) {
            g73 e = e();
            pg3 pg3Var2 = g31Var.K;
            yw0 yw0Var = this.Q;
            e43 e43Var = (e43) yw0Var.c;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (e41.v(rz1Var)) {
                yw0Var.b = 0;
                e43Var.d();
            }
            float f = 0.0f;
            if (e41.w(rz1Var) || e41.v(rz1Var)) {
                j2 = 4294967295L;
            } else {
                if (e43Var.b == 3) {
                    int i = yw0Var.b;
                    yw0Var.b = i + 1;
                    e43Var.o(i, rz1Var);
                } else {
                    e43Var.a(rz1Var);
                }
                if (yw0Var.b == 3) {
                    yw0Var.b = 0;
                }
                Object[] objArr = e43Var.a;
                int i2 = e43Var.b;
                int i3 = 0;
                float f2 = 0.0f;
                while (i3 < i2) {
                    f2 += Float.intBitsToFloat((int) (((rz1) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = e43Var.b;
                intBitsToFloat2 = f2 / i4;
                Object[] objArr2 = e43Var.a;
                float f3 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    f3 += Float.intBitsToFloat((int) (((rz1) objArr2[i5]).c & j2));
                }
                intBitsToFloat3 = f3 / e43Var.b;
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & j2) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
            if (pg3Var2 != null) {
                int i6 = qz1Var.a;
                if (i6 == 1) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
                }
                floatToRawIntBits = pg3Var2 == pg3.J ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(intBitsToFloat) & j2) | (Float.floatToRawIntBits(0.0f) << 32);
            }
            ((ts2) e.J).a(rz1Var.b, floatToRawIntBits);
            yw0 yw0Var2 = this.R;
            v33 v33Var = (v33) yw0Var2.c;
            int i7 = v33Var.b;
            if (i7 == 3) {
                int i8 = yw0Var2.b;
                yw0Var2.b = i8 + 1;
                if (i8 < 0 || i8 >= i7) {
                    zy.o("Index must be between 0 and size");
                    return;
                } else {
                    long[] jArr = v33Var.a;
                    long j5 = jArr[i8];
                    jArr[i8] = j;
                }
            } else {
                v33Var.a(j);
            }
            if (yw0Var2.b == 3) {
                yw0Var2.b = 0;
            }
            long[] jArr2 = v33Var.a;
            int i9 = v33Var.b;
            float f4 = 0.0f;
            for (int i10 = 0; i10 < i9; i10++) {
                f4 += Float.intBitsToFloat((int) (jArr2[i10] >> 32));
            }
            int i11 = v33Var.b;
            float f5 = f4 / i11;
            long[] jArr3 = v33Var.a;
            for (int i12 = 0; i12 < i11; i12++) {
                f = Float.intBitsToFloat((int) (jArr3[i12] & j2)) + f;
            }
            g31Var.r0(new m21((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f / v33Var.b) & j2), true));
        }
    }

    public final void h(rz1 rz1Var, rz1 rz1Var2, qz1 qz1Var, long j) {
        char c;
        long j2;
        float intBitsToFloat;
        if (this.O == null) {
            this.O = new g73((byte) 16);
        }
        g73 e = e();
        g31 g31Var = this.I;
        pg3 pg3Var = g31Var.K;
        yw0 yw0Var = this.Q;
        e43 e43Var = (e43) yw0Var.c;
        char c2 = ' ';
        float intBitsToFloat2 = Float.intBitsToFloat((int) (rz1Var.c >> 32));
        long j3 = 4294967295L;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (rz1Var.c & 4294967295L));
        if (e41.v(rz1Var)) {
            yw0Var.b = 0;
            e43Var.d();
        }
        if (e41.w(rz1Var) || e41.v(rz1Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (e43Var.b == 3) {
                int i = yw0Var.b;
                yw0Var.b = i + 1;
                e43Var.o(i, rz1Var);
            } else {
                e43Var.a(rz1Var);
            }
            if (yw0Var.b == 3) {
                yw0Var.b = 0;
            }
            Object[] objArr = e43Var.a;
            int i2 = e43Var.b;
            int i3 = 0;
            float f = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                f += Float.intBitsToFloat((int) (((rz1) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = e43Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = e43Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((rz1) objArr2[i5]).c & j2));
            }
            intBitsToFloat3 = f2 / e43Var.b;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j2);
        if (pg3Var != null) {
            int i6 = qz1Var.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
            }
            floatToRawIntBits = pg3Var == pg3.J ? (Float.floatToRawIntBits(intBitsToFloat) << c) | (Float.floatToRawIntBits(0.0f) & j2) : (Float.floatToRawIntBits(intBitsToFloat) & j2) | (Float.floatToRawIntBits(0.0f) << c);
        }
        ((ts2) e.J).a(rz1Var.b, floatToRawIntBits);
        long e2 = pd3.e(e41.d0(rz1Var2, g31Var.K, qz1Var), j);
        if (((Boolean) g31Var.L.invoke(new cq3(1))).booleanValue()) {
            g31Var.r0(new n21(e2));
        }
        yw0 yw0Var2 = this.R;
        yw0Var2.b = 0;
        ((v33) yw0Var2.c).b = 0;
    }
}

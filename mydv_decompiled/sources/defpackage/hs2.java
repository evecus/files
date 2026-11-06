package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class hs2 extends bn3 implements e23, rh3, ww2 {
    public static final yy0 a0 = new yy0(21);
    public static final yy0 b0 = new yy0(22);
    public fs2 N;
    public tm1 O;
    public hn1 P;
    public tm1 Q;
    public dn3 R;
    public n43 S;
    public boolean T;
    public n43 U;
    public boolean V;
    public boolean W;
    public final is2 X = new is2(this, 0);
    public c8 Y;
    public n43 Z;

    public static void v0(na3 na3Var) {
        xa2 xa2Var;
        na3 na3Var2 = na3Var.d0;
        wa2 wa2Var = na3Var.c0;
        if (!j42.c(na3Var2 != null ? na3Var2.c0 : null, wa2Var)) {
            wa2Var.o0.p.f0.g();
            return;
        }
        d9 g = wa2Var.o0.p.g();
        if (g == null || (xa2Var = ((tw2) g).f0) == null) {
            return;
        }
        xa2Var.g();
    }

    @Override // defpackage.ww2
    public final vw2 A(int i, int i2, Map map, tm1 tm1Var) {
        return W(i, i2, map, null, tm1Var);
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(f / getDensity(), this);
    }

    @Override // defpackage.e23
    public final void D(boolean z) {
        hs2 s0 = s0();
        wa2 q0 = s0 != null ? s0.q0() : null;
        if (j42.c(q0, q0())) {
            this.T = z;
            return;
        }
        if ((q0 != null ? q0.o0.d : null) != sa2.K) {
            if ((q0 != null ? q0.o0.d : null) != sa2.L) {
                return;
            }
        }
        this.T = z;
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / getDensity();
    }

    @Override // defpackage.b42
    public boolean N() {
        return false;
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.bn3
    public final int R(v8 v8Var) {
        int k0;
        if (!p0() || (k0 = k0(v8Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = v8Var instanceof xi5;
        long j = this.M;
        return k0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // defpackage.ww2
    public final vw2 W(int i, int i2, Map map, tm1 tm1Var, tm1 tm1Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            q02.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new gs2(i, i2, map, tm1Var, tm1Var2, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(defpackage.wa2 r32, defpackage.gv1 r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs2.j0(wa2, gv1):void");
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    public abstract int k0(v8 v8Var);

    @Override // defpackage.rh3
    public boolean l() {
        return q0().K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(final dn3 dn3Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        wa2 wa2Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        sh3 snapshotObserver;
        n43 n43Var = this.Z;
        c8 c8Var = this.Y;
        if (c8Var == null) {
            c8Var = new c8();
            this.Y = c8Var;
        }
        c8 c8Var2 = c8Var;
        qh3 qh3Var = q0().V;
        if (qh3Var != null && (snapshotObserver = qh3Var.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(dn3Var, a0, new rm1() { // from class: es2
                @Override // defpackage.rm1
                public final Object invoke() {
                    hs2 hs2Var = hs2.this;
                    hs2Var.u0().I = false;
                    hs2Var.u0().J = j;
                    hs2Var.u0().K = j2;
                    tm1 e = dn3Var.I.e();
                    if (e != null) {
                        e.invoke(hs2Var.u0());
                    }
                    return wd5.a;
                }
            });
        }
        boolean N = N();
        o43 o43Var = (o43) c8Var2.f;
        o43 o43Var2 = (o43) c8Var2.g;
        int i2 = c8Var2.b;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) c8Var2.e)[i3];
            if (b == 3) {
                gv1 gv1Var = ((gv1[]) c8Var2.c)[i3];
                gv1Var.getClass();
                o43Var2.k(gv1Var);
            } else if (b != 0 && n43Var != null) {
                gv1 gv1Var2 = ((gv1[]) c8Var2.c)[i3];
                gv1Var2.getClass();
                o43 o43Var3 = (o43) n43Var.k(gv1Var2);
                if (o43Var3 != null) {
                    o43Var.j(o43Var3);
                }
            }
        }
        int i4 = c8Var2.b;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) c8Var2.e;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                gv1[] gv1VarArr = (gv1[]) c8Var2.c;
                gv1VarArr[i6 - i5] = gv1VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = c8Var2.b;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((gv1[]) c8Var2.c)[i8] = null;
        }
        c8Var2.b -= i5;
        hs2 s0 = s0();
        Object[] objArr = o43Var2.b;
        long[] jArr = o43Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            gv1 gv1Var3 = (gv1) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            hs2 hs2Var = s0 == null ? this : s0;
                            i = i9;
                            hs2 hs2Var2 = hs2Var;
                            while (true) {
                                c8 c8Var3 = hs2Var2.Y;
                                if (c8Var3 != null) {
                                    z2 = N;
                                    if (dq.M0((gv1[]) c8Var3.c, gv1Var3)) {
                                        break;
                                    }
                                } else {
                                    z2 = N;
                                }
                                hs2 s02 = hs2Var2.s0();
                                if (s02 == null) {
                                    break;
                                }
                                hs2Var2 = s02;
                                N = z2;
                            }
                            n43 n43Var2 = hs2Var2.Z;
                            o43 o43Var4 = n43Var2 != null ? (o43) n43Var2.k(gv1Var3) : null;
                            if (o43Var4 != null) {
                                hs2Var.w0(o43Var4);
                            }
                        } else {
                            z2 = N;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        N = z2;
                    }
                    z = N;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = N;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                N = z;
                i9 = 8;
            }
        } else {
            z = N;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        o43Var2.e();
        Object[] objArr2 = o43Var.b;
        long[] jArr2 = o43Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (wa2Var = (wa2) ((zs5) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                wa2Var.V(false);
                            } else {
                                wa2Var.X(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        o43Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(defpackage.vw2 r28) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs2.m0(vw2):void");
    }

    public abstract hs2 n0();

    public abstract ca2 o0();

    public abstract boolean p0();

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }

    public abstract wa2 q0();

    public abstract vw2 r0();

    public abstract hs2 s0();

    public abstract long t0();

    public final fs2 u0() {
        fs2 fs2Var = this.N;
        if (fs2Var != null) {
            return fs2Var;
        }
        fs2 fs2Var2 = new fs2(this);
        this.N = fs2Var2;
        return fs2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(o43 o43Var) {
        wa2 wa2Var;
        Object[] objArr = o43Var.b;
        long[] jArr = o43Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (wa2Var = (wa2) ((zs5) objArr[(i << 3) + i3]).get()) != null) {
                        if (N()) {
                            wa2Var.V(false);
                        } else {
                            wa2Var.X(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void x0();

    public final void y0() {
        c8 c8Var = this.Y;
        if (c8Var != null) {
            int i = c8Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((gv1[]) c8Var.c)[i2] = null;
                ((float[]) c8Var.d)[i2] = Float.NaN;
                ((byte[]) c8Var.e)[i2] = 0;
            }
            c8Var.b = 0;
        }
        n43 n43Var = this.Z;
        if (n43Var == null) {
            return;
        }
        Object[] objArr = n43Var.c;
        long[] jArr = n43Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            w0((o43) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        n43Var.a();
    }
}

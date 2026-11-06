package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class na3 extends hs2 implements pw2, ca2 {
    public static final u73 C0;
    public static final u73 D0 = new u73(3);
    public static final n54 E0 = new n54();
    public static final x92 F0 = new x92();
    public static final float[] G0 = nw2.a();
    public static final o63 H0 = new o63((byte) 1);
    public static final o63 I0;
    public boolean A0;
    public mr1 B0;
    public final wa2 c0;
    public na3 d0;
    public na3 e0;
    public boolean f0;
    public boolean g0;
    public tm1 h0;
    public iu0 i0;
    public da2 j0;
    public vw2 l0;
    public a43 m0;
    public float o0;
    public m43 p0;
    public x92 q0;
    public m14 s0;
    public m14 t0;
    public boolean u0;
    public boolean v0;
    public jr1 w0;
    public o10 x0;
    public uh0 y0;
    public final ka3 z0;
    public float k0 = 0.8f;
    public long n0 = 0;
    public dn4 r0 = mw2.j;

    static {
        byte b = 2;
        C0 = new u73(b);
        I0 = new o63(b);
    }

    public na3(wa2 wa2Var) {
        this.c0 = wa2Var;
        this.i0 = wa2Var.g0;
        this.j0 = wa2Var.h0;
        m14 m14Var = m14.e;
        this.s0 = m14Var;
        this.t0 = m14Var;
        this.z0 = new ka3(this, (byte) 1);
    }

    public static na3 g1(ca2 ca2Var) {
        na3 na3Var;
        ks2 ks2Var = ca2Var instanceof ks2 ? (ks2) ca2Var : null;
        if (ks2Var != null && (na3Var = ks2Var.I.c0) != null) {
            return na3Var;
        }
        ca2Var.getClass();
        return (na3) ca2Var;
    }

    public final long A0(na3 na3Var, long j) {
        if (na3Var == this) {
            return j;
        }
        na3 na3Var2 = this.e0;
        return (na3Var2 == null || j42.c(na3Var, na3Var2)) ? H0(j) : H0(na3Var2.A0(na3Var, j));
    }

    public final long B0(long j) {
        float V;
        float U;
        if (L0()) {
            m14 m14Var = this.s0;
            V = m14Var.c - m14Var.a;
        } else {
            V = V();
        }
        if (L0()) {
            m14 m14Var2 = this.s0;
            U = m14Var2.d - m14Var2.b;
        } else {
            U = U();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - V;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - U;
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    @Override // defpackage.ca2
    public final ca2 C() {
        boolean h = h();
        wa2 wa2Var = this.c0;
        if (!h) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (wa2 wa2Var2 = wa2Var; wa2Var2 != null; wa2Var2 = wa2Var2.v()) {
                sb.append("\n|");
                sb.append(wa2Var2);
                sb.append(" isAttached=");
                sb.append(wa2Var2.K());
                sb.append(" modifier=");
                sb.append(wa2Var2.s0);
                sb.append(" tail=");
                sb.append(K0());
            }
            q02.b(sb.toString());
        }
        U0();
        return wa2Var.n0.d.e0;
    }

    public final float C0(long j, long j2) {
        if (V() >= Float.intBitsToFloat((int) (j2 >> 32)) && U() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long B0 = B0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (B0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (B0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - V());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - U())) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void D0(o10 o10Var, jr1 jr1Var) {
        mr1 mr1Var = this.B0;
        if (mr1Var == null) {
            long j = this.n0;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            o10Var.m(f, f2);
            E0(o10Var, jr1Var);
            o10Var.m(-f, -f2);
            return;
        }
        r10 r10Var = mr1Var.U;
        mr1Var.f();
        mr1Var.b0 = mr1Var.I.a.I() > 0.0f;
        pn pnVar = r10Var.J;
        pnVar.U(o10Var);
        pnVar.c = jr1Var;
        vt0.o(r10Var, mr1Var.I);
    }

    public final void E0(o10 o10Var, jr1 jr1Var) {
        na3 na3Var;
        o10 o10Var2;
        jr1 jr1Var2;
        k13 M0 = M0(4);
        if (M0 == null) {
            a1(o10Var, jr1Var);
            return;
        }
        wa2 wa2Var = this.c0;
        wa2Var.getClass();
        ya2 sharedDrawScope = za2.a(wa2Var).getSharedDrawScope();
        long b0 = ut0.b0(this.K);
        sharedDrawScope.getClass();
        b53 b53Var = null;
        while (M0 != null) {
            if (M0 instanceof w31) {
                na3Var = this;
                o10Var2 = o10Var;
                jr1Var2 = jr1Var;
                sharedDrawScope.b(o10Var2, b0, na3Var, (w31) M0, jr1Var2);
            } else {
                na3Var = this;
                o10Var2 = o10Var;
                jr1Var2 = jr1Var;
                if ((M0.getKindSet$ui() & 4) != 0 && (M0 instanceof wt0)) {
                    int i = 0;
                    for (k13 k13Var = ((wt0) M0).J; k13Var != null; k13Var = k13Var.getChild$ui()) {
                        if ((k13Var.getKindSet$ui() & 4) != 0) {
                            i++;
                            if (i == 1) {
                                M0 = k13Var;
                            } else {
                                if (b53Var == null) {
                                    b53Var = new b53(new k13[16]);
                                }
                                if (M0 != null) {
                                    b53Var.c(M0);
                                    M0 = null;
                                }
                                b53Var.c(k13Var);
                            }
                        }
                    }
                    if (i == 1) {
                        o10Var = o10Var2;
                        this = na3Var;
                        jr1Var = jr1Var2;
                    }
                }
            }
            M0 = ut0.M(b53Var);
            o10Var = o10Var2;
            this = na3Var;
            jr1Var = jr1Var2;
        }
    }

    public abstract void F0();

    @Override // defpackage.ca2
    public final long G(ca2 ca2Var, long j) {
        return I(ca2Var, j);
    }

    public final na3 G0(na3 na3Var) {
        wa2 wa2Var = na3Var.c0;
        wa2 wa2Var2 = this.c0;
        if (wa2Var == wa2Var2) {
            k13 K0 = na3Var.K0();
            k13 K02 = K0();
            if (!K02.getNode().isAttached()) {
                q02.b("visitLocalAncestors called on an unattached node");
            }
            for (k13 parent$ui = K02.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & 2) != 0 && parent$ui == K0) {
                    return na3Var;
                }
            }
            return this;
        }
        while (wa2Var.X > wa2Var2.X) {
            wa2Var = wa2Var.v();
            wa2Var.getClass();
        }
        wa2 wa2Var3 = wa2Var2;
        while (wa2Var3.X > wa2Var.X) {
            wa2Var3 = wa2Var3.v();
            wa2Var3.getClass();
        }
        while (wa2Var != wa2Var3) {
            wa2Var = wa2Var.v();
            wa2Var3 = wa2Var3.v();
            if (wa2Var == null || wa2Var3 == null) {
                s83.t("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (wa2Var3 != wa2Var2) {
            if (wa2Var != na3Var.c0) {
                return wa2Var.n0.c;
            }
            return na3Var;
        }
        return this;
    }

    public final long H0(long j) {
        long j2 = this.n0;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        mr1 mr1Var = this.B0;
        if (mr1Var != null) {
            float[] a = mr1Var.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!mr1Var.a0) {
                return nw2.b(floatToRawIntBits, a);
            }
        }
        return floatToRawIntBits;
    }

    @Override // defpackage.ca2
    public final long I(ca2 ca2Var, long j) {
        if (ca2Var instanceof ks2) {
            ks2 ks2Var = (ks2) ca2Var;
            ks2Var.I.c0.U0();
            return ks2Var.I(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        na3 g1 = g1(ca2Var);
        g1.U0();
        na3 G02 = G0(g1);
        while (g1 != G02) {
            mr1 mr1Var = g1.B0;
            if (mr1Var != null) {
                float[] b = mr1Var.b();
                if (!mr1Var.a0) {
                    j = nw2.b(j, b);
                }
            }
            j = sv2.Q(j, g1.n0);
            g1 = g1.e0;
            g1.getClass();
        }
        return A0(G02, j);
    }

    public abstract js2 I0();

    @Override // defpackage.ca2
    public final m14 J(ca2 ca2Var, boolean z) {
        if (!h()) {
            q02.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!ca2Var.h()) {
            q02.b("LayoutCoordinates " + ca2Var + " is not attached!");
        }
        na3 g1 = g1(ca2Var);
        g1.U0();
        na3 G02 = G0(g1);
        m43 m43Var = this.p0;
        if (m43Var == null) {
            m43Var = new m43();
            this.p0 = m43Var;
        }
        m43Var.a = 0.0f;
        m43Var.b = 0.0f;
        m43Var.c = (int) (ca2Var.o() >> 32);
        m43Var.d = (int) (ca2Var.o() & 4294967295L);
        while (g1 != G02) {
            g1.c1(m43Var, z, false);
            if (m43Var.b()) {
                return m14.e;
            }
            g1 = g1.e0;
            g1.getClass();
        }
        z0(G02, m43Var, z);
        return new m14(m43Var.a, m43Var.b, m43Var.c, m43Var.d);
    }

    public final long J0() {
        return this.i0.c0(this.c0.i0.d());
    }

    public abstract k13 K0();

    @Override // defpackage.iu0
    public final float L() {
        return this.c0.g0.L();
    }

    public final boolean L0() {
        return this.u0 && !this.s0.f();
    }

    @Override // defpackage.ca2
    public final long M(long j) {
        if (!h()) {
            q02.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        U0();
        while (this != null) {
            wa2 wa2Var = this.c0;
            if (this == wa2Var.n0.d && !wa2Var.K) {
                long b = za2.a(wa2Var).getRectManager().b(wa2Var);
                if (!r22.a(b, 9223372034707292159L)) {
                    return sv2.Q(j, b);
                }
            }
            mr1 mr1Var = this.B0;
            if (mr1Var != null) {
                float[] b2 = mr1Var.b();
                if (!mr1Var.a0) {
                    j = nw2.b(j, b2);
                }
            }
            j = sv2.Q(j, this.n0);
            this = this.e0;
        }
        return j;
    }

    public final k13 M0(int i) {
        boolean h = oa3.h(i);
        k13 K0 = K0();
        if (!h && (K0 = K0.getParent$ui()) == null) {
            return null;
        }
        for (k13 N0 = N0(h); N0 != null && (N0.getAggregateChildKindSet$ui() & i) != 0; N0 = N0.getChild$ui()) {
            if ((N0.getKindSet$ui() & i) != 0) {
                return N0;
            }
            if (N0 == K0) {
                return null;
            }
        }
        return null;
    }

    public final k13 N0(boolean z) {
        k13 K0;
        ja3 ja3Var = this.c0.n0;
        if (ja3Var.d == this) {
            return ja3Var.f;
        }
        na3 na3Var = this.e0;
        if (!z) {
            if (na3Var != null) {
                return na3Var.K0();
            }
            return null;
        }
        if (na3Var == null || (K0 = na3Var.K0()) == null) {
            return null;
        }
        return K0.getChild$ui();
    }

    public final void O0(k13 k13Var, o63 o63Var, long j, kt1 kt1Var, int i, boolean z) {
        long b;
        if (k13Var == null) {
            R0(o63Var, j, kt1Var, i, z);
            return;
        }
        if (!o63Var.q(k13Var)) {
            O0(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z);
            return;
        }
        int i2 = kt1Var.K;
        e43 e43Var = kt1Var.I;
        kt1Var.d(i2 + 1, e43Var.b);
        kt1Var.K++;
        e43Var.a(k13Var);
        v33 v33Var = kt1Var.J;
        b = e41.b(-1.0f, z, false);
        v33Var.a(b);
        O0(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z);
        kt1Var.K = i2;
    }

    public final void P0(k13 k13Var, o63 o63Var, long j, kt1 kt1Var, int i, boolean z, float f) {
        long b;
        if (k13Var == null) {
            R0(o63Var, j, kt1Var, i, z);
            return;
        }
        if (!o63Var.q(k13Var)) {
            P0(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z, f);
            return;
        }
        int i2 = kt1Var.K;
        e43 e43Var = kt1Var.I;
        kt1Var.d(i2 + 1, e43Var.b);
        kt1Var.K++;
        e43Var.a(k13Var);
        v33 v33Var = kt1Var.J;
        b = e41.b(f, z, false);
        v33Var.a(b);
        Z0(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z, f, true);
        kt1Var.K = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (defpackage.g4.t(r19.c(), r10) > 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(defpackage.o63 r16, long r17, defpackage.kt1 r19, int r20, boolean r21) {
        /*
            r15 = this;
            r3 = r17
            r5 = r19
            r6 = r20
            e43 r8 = r5.I
            int r0 = r16.d()
            k13 r1 = r15.M0(r0)
            boolean r0 = r15.m1(r3)
            r9 = 0
            r10 = 2139095040(0x7f800000, float:Infinity)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 1
            if (r0 != 0) goto L51
            boolean r0 = defpackage.cq3.b(r6, r12)
            if (r0 == 0) goto L50
            long r13 = r15.J0()
            float r0 = r15.C0(r3, r13)
            int r2 = java.lang.Float.floatToRawIntBits(r0)
            r2 = r2 & r11
            if (r2 >= r10) goto L50
            int r2 = r5.K
            int r7 = r8.b
            int r7 = r7 - r12
            if (r2 != r7) goto L3a
            goto L48
        L3a:
            long r7 = defpackage.e41.c(r0, r9)
            long r9 = r5.c()
            int r2 = defpackage.g4.t(r9, r7)
            if (r2 <= 0) goto L50
        L48:
            r7 = 0
            r2 = r16
            r8 = r0
            r0 = r15
            r0.P0(r1, r2, r3, r5, r6, r7, r8)
        L50:
            return
        L51:
            if (r1 != 0) goto L57
            r15.R0(r16, r17, r19, r20, r21)
            return
        L57:
            r0 = 32
            long r2 = r17 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r17 & r2
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 < 0) goto L96
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L96
            int r3 = r15.V()
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L96
            int r0 = r15.U()
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L96
            r0 = r15
            r2 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r0.O0(r1, r2, r3, r5, r6, r7)
            return
        L96:
            r3 = r17
            r5 = r19
            r6 = r20
            boolean r2 = defpackage.cq3.b(r6, r12)
            if (r2 != 0) goto La5
            r2 = 2139095040(0x7f800000, float:Infinity)
            goto Lad
        La5:
            long r13 = r15.J0()
            float r2 = r15.C0(r3, r13)
        Lad:
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            r7 = r7 & r11
            if (r7 >= r10) goto Ld4
            int r7 = r5.K
            int r8 = r8.b
            int r8 = r8 - r12
            if (r7 != r8) goto Lbe
            r7 = r21
            goto Lce
        Lbe:
            r7 = r21
            long r10 = defpackage.e41.c(r2, r7)
            long r13 = r5.c()
            int r8 = defpackage.g4.t(r13, r10)
            if (r8 <= 0) goto Lcf
        Lce:
            r9 = r12
        Lcf:
            r0 = r15
            r8 = r2
            r2 = r16
            goto Ld7
        Ld4:
            r7 = r21
            goto Lcf
        Ld7:
            r0.Z0(r1, r2, r3, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na3.Q0(o63, long, kt1, int, boolean):void");
    }

    public void R0(o63 o63Var, long j, kt1 kt1Var, int i, boolean z) {
        na3 na3Var = this.d0;
        if (na3Var != null) {
            na3Var.Q0(o63Var, na3Var.H0(j), kt1Var, i, z);
        }
    }

    public final void S0() {
        mr1 mr1Var = this.B0;
        if (mr1Var != null) {
            mr1Var.c();
            return;
        }
        na3 na3Var = this.e0;
        if (na3Var != null) {
            na3Var.S0();
        }
    }

    public final boolean T0() {
        if (this.B0 != null && this.k0 <= 0.0f) {
            return true;
        }
        na3 na3Var = this.e0;
        if (na3Var != null) {
            return na3Var.T0();
        }
        return false;
    }

    public final void U0() {
        this.c0.o0.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v7, types: [k13] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void V0() {
        k13 parent$ui;
        boolean h = oa3.h(128);
        k13 N0 = N0(h);
        if (N0 == null || (N0.getNode().getAggregateChildKindSet$ui() & 128) == 0) {
            return;
        }
        ns4 i = o63.i();
        tm1 e = i != null ? i.e() : null;
        ns4 j = o63.j(i);
        try {
            if (h) {
                parent$ui = K0();
            } else {
                parent$ui = K0().getParent$ui();
                if (parent$ui == null) {
                }
            }
            for (k13 N02 = N0(h); N02 != null; N02 = N02.getChild$ui()) {
                if ((N02.getAggregateChildKindSet$ui() & 128) == 0) {
                    break;
                }
                if ((N02.getKindSet$ui() & 128) != 0) {
                    wt0 wt0Var = N02;
                    ?? r8 = 0;
                    while (wt0Var != 0) {
                        if (wt0Var instanceof cx2) {
                            ((cx2) wt0Var).i(this.K);
                        } else if ((wt0Var.getKindSet$ui() & 128) != 0 && (wt0Var instanceof wt0)) {
                            k13 k13Var = wt0Var.J;
                            int i2 = 0;
                            wt0Var = wt0Var;
                            r8 = r8;
                            while (k13Var != null) {
                                if ((k13Var.getKindSet$ui() & 128) != 0) {
                                    i2++;
                                    r8 = r8;
                                    if (i2 == 1) {
                                        wt0Var = k13Var;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new b53(new k13[16]);
                                        }
                                        if (wt0Var != 0) {
                                            r8.c(wt0Var);
                                            wt0Var = 0;
                                        }
                                        r8.c(k13Var);
                                    }
                                }
                                k13Var = k13Var.getChild$ui();
                                wt0Var = wt0Var;
                                r8 = r8;
                            }
                            if (i2 == 1) {
                            }
                        }
                        wt0Var = ut0.M(r8);
                    }
                }
                if (N02 == parent$ui) {
                    break;
                }
            }
        } finally {
            o63.o(i, j, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void W0() {
        boolean h = oa3.h(4194304);
        k13 K0 = K0();
        if (!h && (K0 = K0.getParent$ui()) == null) {
            return;
        }
        for (k13 N0 = N0(h); N0 != null && (N0.getAggregateChildKindSet$ui() & 4194304) != 0; N0 = N0.getChild$ui()) {
            if ((N0.getKindSet$ui() & 4194304) != 0) {
                wt0 wt0Var = N0;
                ?? r5 = 0;
                while (wt0Var != 0) {
                    if (wt0Var instanceof y92) {
                        ((y92) wt0Var).f(this);
                    } else if ((wt0Var.getKindSet$ui() & 4194304) != 0 && (wt0Var instanceof wt0)) {
                        k13 k13Var = wt0Var.J;
                        int i = 0;
                        wt0Var = wt0Var;
                        r5 = r5;
                        while (k13Var != null) {
                            if ((k13Var.getKindSet$ui() & 4194304) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    wt0Var = k13Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new b53(new k13[16]);
                                    }
                                    if (wt0Var != 0) {
                                        r5.c(wt0Var);
                                        wt0Var = 0;
                                    }
                                    r5.c(k13Var);
                                }
                            }
                            k13Var = k13Var.getChild$ui();
                            wt0Var = wt0Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    wt0Var = ut0.M(r5);
                }
            }
            if (N0 == K0) {
                return;
            }
        }
    }

    public final void X0() {
        this.f0 = true;
        this.z0.invoke();
        d1();
        if (r22.a(this.n0, 0L)) {
            return;
        }
        this.c0.Q(this);
    }

    public final void Y0() {
        boolean h = oa3.h(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        k13 N0 = N0(h);
        if (N0 == null || (N0.getNode().getAggregateChildKindSet$ui() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            return;
        }
        k13 K0 = K0();
        if (!h && (K0 = K0.getParent$ui()) == null) {
            return;
        }
        for (k13 N02 = N0(h); N02 != null && (N02.getAggregateChildKindSet$ui() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0; N02 = N02.getChild$ui()) {
            if ((N02.getKindSet$ui() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                k13 k13Var = N02;
                b53 b53Var = null;
                while (k13Var != null) {
                    if (k13Var instanceof ui1) {
                    } else if ((k13Var.getKindSet$ui() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 && (k13Var instanceof wt0)) {
                        int i = 0;
                        for (k13 k13Var2 = ((wt0) k13Var).J; k13Var2 != null; k13Var2 = k13Var2.getChild$ui()) {
                            if ((k13Var2.getKindSet$ui() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
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
            if (N02 == K0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r2v20 */
    public final void Z0(final k13 k13Var, final o63 o63Var, final long j, final kt1 kt1Var, int i, final boolean z, final float f, final boolean z2) {
        long b;
        long b2;
        long b3;
        k13 M;
        e43 e43Var = kt1Var.I;
        if (k13Var == null) {
            R0(o63Var, j, kt1Var, i, z);
            return;
        }
        if (!o63Var.q(k13Var)) {
            Z0(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (cq3.b(i2, 3) || cq3.b(i2, 4)) {
            wt0 wt0Var = k13Var;
            b53 b53Var = null;
            while (true) {
                if (wt0Var == 0) {
                    break;
                }
                if (wt0Var instanceof vp3) {
                    long h = ((vp3) wt0Var).h();
                    int i3 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i3);
                    wa2 wa2Var = this.c0;
                    if (intBitsToFloat >= (-c95.a(h, wa2Var.h0))) {
                        if (Float.intBitsToFloat(i3) < c95.b(h, wa2Var.h0) + V()) {
                            int i4 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i4) >= (-c95.d(h))) {
                                if (Float.intBitsToFloat(i4) < c95.c(h) + U()) {
                                    final int i5 = i2;
                                    rm1 rm1Var = new rm1() { // from class: la3
                                        @Override // defpackage.rm1
                                        public final Object invoke() {
                                            o63 o63Var2 = o63Var;
                                            na3.this.Z0(rt0.E(k13Var, o63Var2.d()), o63Var2, j, kt1Var, i5, z, f, z2);
                                            return wd5.a;
                                        }
                                    };
                                    v33 v33Var = kt1Var.J;
                                    int i6 = kt1Var.K;
                                    int i7 = e43Var.b;
                                    if (i6 == i7 - 1) {
                                        kt1Var.d(i6 + 1, i7);
                                        kt1Var.K++;
                                        e43Var.a(k13Var);
                                        b3 = e41.b(0.0f, z, true);
                                        v33Var.a(b3);
                                        rm1Var.invoke();
                                        kt1Var.K = i6;
                                        return;
                                    }
                                    long c = kt1Var.c();
                                    int i8 = kt1Var.K;
                                    if (!g4.Q(c)) {
                                        if (g4.F(c) > 0.0f) {
                                            int i9 = kt1Var.K;
                                            kt1Var.d(i9 + 1, e43Var.b);
                                            kt1Var.K++;
                                            e43Var.a(k13Var);
                                            b = e41.b(0.0f, z, true);
                                            v33Var.a(b);
                                            rm1Var.invoke();
                                            kt1Var.K = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = e43Var.b;
                                    int i11 = i10 - 1;
                                    kt1Var.K = i11;
                                    kt1Var.d(i10, e43Var.b);
                                    kt1Var.K++;
                                    e43Var.a(k13Var);
                                    b2 = e41.b(0.0f, z, true);
                                    v33Var.a(b2);
                                    rm1Var.invoke();
                                    kt1Var.K = i11;
                                    if (g4.F(kt1Var.c()) < 0.0f) {
                                        kt1Var.d(i8 + 1, kt1Var.K + 1);
                                    }
                                    kt1Var.K = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                        k13 k13Var2 = wt0Var.J;
                        int i12 = 0;
                        M = wt0Var;
                        b53Var = b53Var;
                        while (k13Var2 != null) {
                            if ((k13Var2.getKindSet$ui() & 16) != 0) {
                                i12++;
                                b53Var = b53Var;
                                if (i12 == 1) {
                                    M = k13Var2;
                                } else {
                                    if (b53Var == null) {
                                        b53Var = new b53(new k13[16]);
                                    }
                                    if (M != null) {
                                        b53Var.c(M);
                                        M = null;
                                    }
                                    b53Var.c(k13Var2);
                                }
                            }
                            k13Var2 = k13Var2.getChild$ui();
                            M = M;
                            b53Var = b53Var;
                        }
                        if (i12 == 1) {
                            i2 = i;
                            wt0Var = M;
                            b53Var = b53Var;
                        }
                    }
                    M = ut0.M(b53Var);
                    i2 = i;
                    wt0Var = M;
                    b53Var = b53Var;
                }
            }
        }
        if (z2) {
            P0(k13Var, o63Var, j, kt1Var, i, z, f);
        } else {
            f1(k13Var, o63Var, j, kt1Var, i, z, f);
        }
    }

    public void a1(o10 o10Var, jr1 jr1Var) {
        na3 na3Var;
        na3 na3Var2 = this.d0;
        na3Var2.getClass();
        na3Var2.D0(o10Var, jr1Var);
        if (!za2.a(this.c0).getShowLayoutBounds() || (na3Var = this.d0) == null) {
            return;
        }
        if (z22.b(this.K, na3Var.K) && r22.a(na3Var.n0, 0L)) {
            return;
        }
        pd pdVar = pa2.L0;
        long j = this.K;
        o10Var.r(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, pdVar);
    }

    public final void b1(long j, float f, tm1 tm1Var) {
        k1(tm1Var, false);
        boolean a = r22.a(this.n0, j);
        wa2 wa2Var = this.c0;
        if (!a) {
            za2.a(wa2Var).voteFrameRate(-4.0f);
            this.n0 = j;
            mr1 mr1Var = this.B0;
            if (mr1Var != null) {
                mr1Var.d(j);
            } else {
                na3 na3Var = this.e0;
                if (na3Var != null) {
                    na3Var.S0();
                }
            }
            wa2Var.Q(this);
            hs2.v0(this);
            qh3 qh3Var = wa2Var.V;
            if (qh3Var != null) {
                qh3Var.onLayoutChange(wa2Var);
            }
        }
        this.o0 = f;
        if (this == wa2Var.n0.d && !this.W) {
            za2.a(wa2Var).getRectManager().g(wa2Var);
        }
        if (this.W) {
            return;
        }
        m0(r0());
    }

    public final void c1(m43 m43Var, boolean z, boolean z2) {
        long j;
        mr1 mr1Var = this.B0;
        if (mr1Var != null) {
            if (this.g0) {
                if (z2) {
                    long J0 = J0();
                    float f = m43Var.a;
                    float f2 = m43Var.b;
                    if (m43Var.c >= 0.0f) {
                        long j2 = this.K;
                        if (f <= ((int) (j2 >> 32)) && m43Var.d >= 0.0f && f2 <= ((int) (j2 & 4294967295L))) {
                            float intBitsToFloat = Float.intBitsToFloat((int) (J0 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (J0 & 4294967295L));
                            float f3 = (intBitsToFloat - (m43Var.c - m43Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-intBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (intBitsToFloat2 - (m43Var.d - m43Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-intBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            j = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                            long j3 = this.K;
                            float f7 = (int) (j3 >> 32);
                            int i = (int) (J0 >> 32);
                            float f8 = (int) (j3 & 4294967295L);
                            int i2 = (int) (J0 & 4294967295L);
                            m43Var.a(intBitsToFloat3, intBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + intBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + intBitsToFloat4)));
                        }
                    }
                    j = 0;
                    float intBitsToFloat32 = Float.intBitsToFloat((int) (j >> 32));
                    float intBitsToFloat42 = Float.intBitsToFloat((int) (j & 4294967295L));
                    long j32 = this.K;
                    float f72 = (int) (j32 >> 32);
                    int i3 = (int) (J0 >> 32);
                    float f82 = (int) (j32 & 4294967295L);
                    int i22 = (int) (J0 & 4294967295L);
                    m43Var.a(intBitsToFloat32, intBitsToFloat42, Math.min(Float.intBitsToFloat(i3) + f72, Math.max(f72, Float.intBitsToFloat(i3) + intBitsToFloat32)), Math.min(Float.intBitsToFloat(i22) + f82, Math.max(f82, Float.intBitsToFloat(i22) + intBitsToFloat42)));
                } else if (z) {
                    long j4 = this.K;
                    m43Var.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (m43Var.b()) {
                    return;
                }
            }
            float[] b = mr1Var.b();
            if (!mr1Var.a0) {
                if (b == null) {
                    m43Var.a = 0.0f;
                    m43Var.b = 0.0f;
                    m43Var.c = 0.0f;
                    m43Var.d = 0.0f;
                } else {
                    nw2.c(b, m43Var);
                }
            }
        }
        long j5 = this.n0;
        float f9 = (int) (j5 >> 32);
        m43Var.a += f9;
        m43Var.c += f9;
        float f10 = (int) (j5 & 4294967295L);
        m43Var.b += f10;
        m43Var.d += f10;
    }

    @Override // defpackage.ca2
    public final long d(long j) {
        return za2.a(this.c0).mo17calculatePositionInWindowMKHz9U(M(j));
    }

    public final void d1() {
        if (this.B0 != null) {
            k1(null, false);
            this.c0.X(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [k13] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [b53] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [b53] */
    public final void e1(vw2 vw2Var) {
        na3 na3Var;
        vw2 vw2Var2 = this.l0;
        if (vw2Var != vw2Var2) {
            this.l0 = vw2Var;
            wa2 wa2Var = this.c0;
            int i = 0;
            if (vw2Var2 == null || vw2Var.getWidth() != vw2Var2.getWidth() || vw2Var.getHeight() != vw2Var2.getHeight()) {
                int width = vw2Var.getWidth();
                int height = vw2Var.getHeight();
                mr1 mr1Var = this.B0;
                if (mr1Var != null) {
                    mr1Var.e((width << 32) | (height & 4294967295L));
                } else if (wa2Var.L() && (na3Var = this.e0) != null) {
                    na3Var.S0();
                }
                e0((height & 4294967295L) | (width << 32));
                if (this.h0 != null) {
                    l1(false);
                }
                boolean h = oa3.h(4);
                k13 K0 = K0();
                if (h || (K0 = K0.getParent$ui()) != null) {
                    for (k13 N0 = N0(h); N0 != null && (N0.getAggregateChildKindSet$ui() & 4) != 0; N0 = N0.getChild$ui()) {
                        if ((N0.getKindSet$ui() & 4) != 0) {
                            wt0 wt0Var = N0;
                            ?? r9 = 0;
                            while (wt0Var != 0) {
                                if (wt0Var instanceof w31) {
                                    ((w31) wt0Var).onMeasureResultChanged();
                                } else if ((wt0Var.getKindSet$ui() & 4) != 0 && (wt0Var instanceof wt0)) {
                                    k13 k13Var = wt0Var.J;
                                    int i2 = 0;
                                    wt0Var = wt0Var;
                                    r9 = r9;
                                    while (k13Var != null) {
                                        if ((k13Var.getKindSet$ui() & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                wt0Var = k13Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new b53(new k13[16]);
                                                }
                                                if (wt0Var != 0) {
                                                    r9.c(wt0Var);
                                                    wt0Var = 0;
                                                }
                                                r9.c(k13Var);
                                            }
                                        }
                                        k13Var = k13Var.getChild$ui();
                                        wt0Var = wt0Var;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                wt0Var = ut0.M(r9);
                            }
                        }
                        if (N0 == K0) {
                            break;
                        }
                    }
                }
                qh3 qh3Var = wa2Var.V;
                if (qh3Var != null) {
                    qh3Var.onLayoutChange(wa2Var);
                }
                wa2Var.Q(this);
            }
            a43 a43Var = this.m0;
            if ((a43Var == null || a43Var.e == 0) && vw2Var.a().isEmpty()) {
                return;
            }
            a43 a43Var2 = this.m0;
            Map a = vw2Var.a();
            if (a43Var2 != null && a43Var2.e == a.size()) {
                Object[] objArr = a43Var2.b;
                int[] iArr = a43Var2.c;
                long[] jArr = a43Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) a.get((v8) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            wa2Var.o0.p.f0.g();
            a43 a43Var3 = this.m0;
            if (a43Var3 == null) {
                a43 a43Var4 = dd3.a;
                a43Var3 = new a43();
                this.m0 = a43Var3;
            }
            a43Var3.a();
            for (Map.Entry entry : vw2Var.a().entrySet()) {
                a43Var3.g(entry.getKey(), ((Number) entry.getValue()).intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [k13] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [k13] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void f1(k13 k13Var, o63 o63Var, long j, kt1 kt1Var, int i, boolean z, float f) {
        e43 e43Var = kt1Var.I;
        if (k13Var == null) {
            R0(o63Var, j, kt1Var, i, z);
            return;
        }
        if (!o63Var.q(k13Var)) {
            f1(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z, f);
            return;
        }
        switch (o63Var.I) {
            case 1:
                wt0 wt0Var = k13Var;
                ?? r4 = 0;
                while (wt0Var != 0) {
                    if (wt0Var instanceof vp3) {
                        ((vp3) wt0Var).D();
                    } else if ((wt0Var.getKindSet$ui() & 16) != 0 && (wt0Var instanceof wt0)) {
                        k13 k13Var2 = wt0Var.J;
                        int i2 = 0;
                        wt0Var = wt0Var;
                        r4 = r4;
                        while (k13Var2 != null) {
                            if ((k13Var2.getKindSet$ui() & 16) != 0) {
                                i2++;
                                r4 = r4;
                                if (i2 == 1) {
                                    wt0Var = k13Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new b53(new k13[16]);
                                    }
                                    if (wt0Var != 0) {
                                        r4.c(wt0Var);
                                        wt0Var = 0;
                                    }
                                    r4.c(k13Var2);
                                }
                            }
                            k13Var2 = k13Var2.getChild$ui();
                            wt0Var = wt0Var;
                            r4 = r4;
                        }
                        if (i2 == 1) {
                        }
                    }
                    wt0Var = ut0.M(r4);
                }
                break;
        }
        Z0(rt0.E(k13Var, o63Var.d()), o63Var, j, kt1Var, i, z, f, false);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.c0.g0.getDensity();
    }

    @Override // defpackage.b42
    public final da2 getLayoutDirection() {
        return this.c0.h0;
    }

    @Override // defpackage.ca2
    public final boolean h() {
        return K0().isAttached();
    }

    public final m14 h1() {
        if (h()) {
            ca2 q = mu0.q(this);
            m43 m43Var = this.p0;
            if (m43Var == null) {
                m43Var = new m43();
                this.p0 = m43Var;
            }
            long B0 = B0(J0());
            float f = L0() ? this.s0.a : 0.0f;
            float f2 = L0() ? this.s0.b : 0.0f;
            float V = L0() ? this.s0.c : V();
            float U = L0() ? this.s0.d : U();
            int i = (int) (B0 >> 32);
            m43Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (B0 & 4294967295L);
            m43Var.b = f2 - Float.intBitsToFloat(i2);
            m43Var.c = Float.intBitsToFloat(i) + V;
            m43Var.d = Float.intBitsToFloat(i2) + U;
            while (this != q) {
                this.c1(m43Var, false, true);
                if (!m43Var.b()) {
                    this = this.e0;
                    this.getClass();
                }
            }
            return new m14(m43Var.a, m43Var.b, m43Var.c, m43Var.d);
        }
        return m14.e;
    }

    @Override // defpackage.ca2
    public final void i(float[] fArr) {
        qh3 a = za2.a(this.c0);
        na3 g1 = g1(mu0.q(this));
        j1(g1, fArr);
        if (a instanceof ow2) {
            ((ow2) a).mo20localToScreen58bKbWc(fArr);
            return;
        }
        long mo36localToScreenMKHz9U = g1.mo36localToScreenMKHz9U(0L);
        if ((9223372034707292159L & mo36localToScreenMKHz9U) != 9205357640488583168L) {
            nw2.i(fArr, Float.intBitsToFloat((int) (mo36localToScreenMKHz9U >> 32)), Float.intBitsToFloat((int) (mo36localToScreenMKHz9U & 4294967295L)));
        }
    }

    public final void i1(na3 na3Var, float[] fArr) {
        float[] a;
        if (j42.c(na3Var, this)) {
            return;
        }
        na3 na3Var2 = this.e0;
        na3Var2.getClass();
        na3Var2.i1(na3Var, fArr);
        if (!r22.a(this.n0, 0L)) {
            float[] fArr2 = G0;
            nw2.d(fArr2);
            long j = this.n0;
            nw2.i(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            nw2.h(fArr, fArr2);
        }
        mr1 mr1Var = this.B0;
        if (mr1Var == null || (a = mr1Var.a()) == null) {
            return;
        }
        nw2.h(fArr, a);
    }

    @Override // defpackage.ca2
    public final void j(ca2 ca2Var, float[] fArr) {
        na3 g1 = g1(ca2Var);
        g1.U0();
        na3 G02 = G0(g1);
        nw2.d(fArr);
        g1.j1(G02, fArr);
        i1(G02, fArr);
    }

    public final void j1(na3 na3Var, float[] fArr) {
        while (!this.equals(na3Var)) {
            mr1 mr1Var = this.B0;
            if (mr1Var != null) {
                nw2.h(fArr, mr1Var.b());
            }
            if (!r22.a(this.n0, 0L)) {
                float[] fArr2 = G0;
                nw2.d(fArr2);
                nw2.i(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                nw2.h(fArr, fArr2);
            }
            this = this.e0;
            this.getClass();
        }
    }

    public final void k1(tm1 tm1Var, boolean z) {
        qh3 qh3Var;
        byte b = 0;
        wa2 wa2Var = this.c0;
        boolean z2 = (!z && this.h0 == tm1Var && j42.c(this.i0, wa2Var.g0) && this.j0 == wa2Var.h0) ? false : true;
        this.i0 = wa2Var.g0;
        this.j0 = wa2Var.h0;
        boolean K = wa2Var.K();
        ka3 ka3Var = this.z0;
        if (K && tm1Var != null) {
            this.h0 = tm1Var;
            if (this.B0 != null) {
                if (z2) {
                    l1(true);
                    return;
                }
                return;
            }
            qh3 a = za2.a(wa2Var);
            uh0 uh0Var = this.y0;
            if (uh0Var == null) {
                uh0 uh0Var2 = new uh0(this, new ka3(this, b), (byte) 10);
                this.y0 = uh0Var2;
                uh0Var = uh0Var2;
            }
            mr1 mr1Var = (mr1) a.createLayer(uh0Var, ka3Var, null);
            mr1Var.e(this.K);
            mr1Var.d(this.n0);
            this.B0 = mr1Var;
            l1(true);
            wa2Var.r0 = true;
            ka3Var.invoke();
            return;
        }
        this.h0 = null;
        mr1 mr1Var2 = this.B0;
        if (mr1Var2 != null) {
            AndroidComposeView androidComposeView = mr1Var2.K;
            if (!sp0.X(mr1Var2.b())) {
                wa2Var.Q(this);
            }
            mr1Var2.L = null;
            mr1Var2.M = null;
            mr1Var2.O = true;
            if (mr1Var2.R) {
                mr1Var2.R = false;
                androidComposeView.notifyLayerIsDirty$ui(mr1Var2, false);
            }
            ir1 ir1Var = mr1Var2.J;
            if (ir1Var != null) {
                ir1Var.a(mr1Var2.I);
                androidComposeView.recycle$ui(mr1Var2);
            }
            this.B0 = null;
            wa2Var.r0 = true;
            ka3Var.invoke();
            if (h() && wa2Var.L() && (qh3Var = wa2Var.V) != null) {
                qh3Var.onLayoutChange(wa2Var);
            }
        }
        this.A0 = false;
    }

    @Override // defpackage.hs2, defpackage.rh3
    public final boolean l() {
        return (this.B0 == null || this.f0 || !this.c0.K()) ? false : true;
    }

    public final void l1(boolean z) {
        char c;
        long j;
        wa2 wa2Var;
        n24 n24Var;
        boolean z2;
        qh3 qh3Var;
        rm1 rm1Var;
        rm1 rm1Var2;
        mr1 mr1Var = this.B0;
        tm1 tm1Var = this.h0;
        if (mr1Var == null) {
            if (tm1Var == null) {
                return;
            }
            q02.b("null layer with a non-null layerBlock");
            return;
        }
        AndroidComposeView androidComposeView = mr1Var.K;
        if (tm1Var == null) {
            throw r7.t("updateLayerParameters requires a non-null layerBlock");
        }
        n54 n54Var = E0;
        n54Var.a();
        wa2 wa2Var2 = this.c0;
        n54Var.a0 = wa2Var2.g0;
        n54Var.b0 = wa2Var2.h0;
        n54Var.Y = ut0.b0(this.K);
        n24 n24Var2 = new n24();
        za2.a(wa2Var2).getSnapshotObserver().a.d(this, C0, new ls(tm1Var, this, n24Var2, (byte) 4));
        x92 x92Var = this.q0;
        if (x92Var == null) {
            x92Var = new x92();
            this.q0 = x92Var;
        }
        x92 x92Var2 = F0;
        x92Var2.getClass();
        x92Var2.a = x92Var.a;
        x92Var2.b = x92Var.b;
        x92Var2.c = x92Var.c;
        x92Var2.d = x92Var.d;
        x92Var2.e = x92Var.e;
        x92Var2.f = x92Var.f;
        x92Var2.g = x92Var.g;
        x92Var2.h = x92Var.h;
        x92Var2.i = x92Var.i;
        x92Var.a = n54Var.J;
        x92Var.b = n54Var.K;
        x92Var.c = n54Var.M;
        x92Var.d = n54Var.N;
        x92Var.e = n54Var.R;
        x92Var.f = n54Var.S;
        x92Var.g = n54Var.T;
        x92Var.h = n54Var.U;
        x92Var.i = n54Var.V;
        int i = n54Var.I | mr1Var.V;
        mr1Var.T = n54Var.b0;
        iu0 iu0Var = n54Var.a0;
        mr1Var.S = iu0Var;
        if ((1048576 & i) != 0) {
            jr1 jr1Var = mr1Var.I;
            n54Var.Z.getClass();
            int X = iu0Var.X(0.0f);
            n54Var.Z.getClass();
            int X2 = iu0Var.X(0.0f);
            n54Var.Z.getClass();
            int X3 = iu0Var.X(0.0f);
            n54Var.Z.getClass();
            int X4 = iu0Var.X(0.0f);
            jr1Var.v = X;
            jr1Var.w = X2;
            jr1Var.x = X3;
            jr1Var.y = X4;
            jr1Var.a.t(X, X2, X3, X4);
            mr1Var.c();
        }
        int i2 = i & 4096;
        if (i2 != 0) {
            mr1Var.W = n54Var.V;
        }
        if ((i & 1) != 0) {
            jr1 jr1Var2 = mr1Var.I;
            float f = n54Var.J;
            lr1 lr1Var = jr1Var2.a;
            if (lr1Var.b() != f) {
                lr1Var.x(f);
            }
        }
        if ((i & 2) != 0) {
            jr1 jr1Var3 = mr1Var.I;
            float f2 = n54Var.K;
            lr1 lr1Var2 = jr1Var3.a;
            if (lr1Var2.J() != f2) {
                lr1Var2.k(f2);
            }
        }
        if ((i & 4) != 0) {
            jr1 jr1Var4 = mr1Var.I;
            float f3 = n54Var.L;
            lr1 lr1Var3 = jr1Var4.a;
            if (lr1Var3.getAlpha() != f3) {
                lr1Var3.r(f3);
            }
        }
        if ((i & 8) != 0) {
            jr1 jr1Var5 = mr1Var.I;
            float f4 = n54Var.M;
            lr1 lr1Var4 = jr1Var5.a;
            if (lr1Var4.A() != f4) {
                lr1Var4.E(f4);
            }
        }
        if ((i & 16) != 0) {
            jr1 jr1Var6 = mr1Var.I;
            float f5 = n54Var.N;
            lr1 lr1Var5 = jr1Var6.a;
            if (lr1Var5.u() != f5) {
                lr1Var5.e(f5);
            }
        }
        if ((i & 32) != 0) {
            jr1 jr1Var7 = mr1Var.I;
            float f6 = n54Var.O;
            lr1 lr1Var6 = jr1Var7.a;
            if (lr1Var6.I() != f6) {
                lr1Var6.c(f6);
                jr1Var7.g = true;
                jr1Var7.a();
            }
            if (n54Var.O > 0.0f && !mr1Var.b0 && (rm1Var2 = mr1Var.M) != null) {
                rm1Var2.invoke();
            }
        }
        if ((i & 64) != 0) {
            jr1 jr1Var8 = mr1Var.I;
            long j2 = n54Var.P;
            lr1 lr1Var7 = jr1Var8.a;
            long q = lr1Var7.q();
            int i3 = x70.h;
            if (!zc5.a(j2, q)) {
                lr1Var7.w(j2);
            }
        }
        if ((i & 128) != 0) {
            jr1 jr1Var9 = mr1Var.I;
            long j3 = n54Var.Q;
            lr1 lr1Var8 = jr1Var9.a;
            long v = lr1Var8.v();
            int i4 = x70.h;
            if (!zc5.a(j3, v)) {
                lr1Var8.F(j3);
            }
        }
        if ((i & 1024) != 0) {
            jr1 jr1Var10 = mr1Var.I;
            float f7 = n54Var.T;
            lr1 lr1Var9 = jr1Var10.a;
            if (lr1Var9.o() != f7) {
                lr1Var9.d(f7);
            }
        }
        if ((i & 256) != 0) {
            jr1 jr1Var11 = mr1Var.I;
            float f8 = n54Var.R;
            lr1 lr1Var10 = jr1Var11.a;
            if (lr1Var10.C() != f8) {
                lr1Var10.K(f8);
            }
        }
        if ((i & 512) != 0) {
            jr1 jr1Var12 = mr1Var.I;
            float f9 = n54Var.S;
            lr1 lr1Var11 = jr1Var12.a;
            if (lr1Var11.m() != f9) {
                lr1Var11.a(f9);
            }
        }
        if ((i & 2048) != 0) {
            jr1 jr1Var13 = mr1Var.I;
            float f10 = n54Var.U;
            lr1 lr1Var12 = jr1Var13.a;
            if (lr1Var12.y() != f10) {
                lr1Var12.H(f10);
            }
        }
        if (i2 != 0) {
            j = 4294967295L;
            boolean a = r95.a(mr1Var.W, r95.b);
            jr1 jr1Var14 = mr1Var.I;
            if (a) {
                c = ' ';
                if (!pd3.c(jr1Var14.z, 9205357640488583168L)) {
                    jr1Var14.z = 9205357640488583168L;
                    jr1Var14.a.p(9205357640488583168L);
                }
            } else {
                c = ' ';
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mr1Var.W & 4294967295L)) * ((int) (mr1Var.N & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (mr1Var.W >> 32)) * ((int) (mr1Var.N >> 32))) << 32);
                if (!pd3.c(jr1Var14.z, floatToRawIntBits)) {
                    jr1Var14.z = floatToRawIntBits;
                    jr1Var14.a.p(floatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i & 16384) != 0) {
            jr1 jr1Var15 = mr1Var.I;
            boolean z3 = n54Var.X;
            if (jr1Var15.A != z3) {
                jr1Var15.A = z3;
                jr1Var15.g = true;
                jr1Var15.a();
            }
        }
        if ((131072 & i) != 0) {
            lr1 lr1Var13 = mr1Var.I.a;
        }
        if ((262144 & i) != 0) {
            jr1 jr1Var16 = mr1Var.I;
            c80 c80Var = n54Var.c0;
            lr1 lr1Var14 = jr1Var16.a;
            if (!j42.c(lr1Var14.getColorFilter(), c80Var)) {
                lr1Var14.s(c80Var);
            }
        }
        if ((524288 & i) != 0) {
            jr1 jr1Var17 = mr1Var.I;
            byte b = n54Var.d0;
            lr1 lr1Var15 = jr1Var17.a;
            if (lr1Var15.L() != b) {
                lr1Var15.g(b);
            }
        }
        if ((32768 & i) != 0) {
            lr1 lr1Var16 = mr1Var.I.a;
            if (lr1Var16.j() != 0) {
                lr1Var16.D(0);
            }
        }
        if ((i & 7963) != 0) {
            mr1Var.Y = true;
            mr1Var.Z = true;
        }
        if (j42.c(mr1Var.X, n54Var.e0)) {
            wa2Var = wa2Var2;
            n24Var = n24Var2;
            z2 = false;
        } else {
            yg3 yg3Var = n54Var.e0;
            mr1Var.X = yg3Var;
            if (yg3Var == null) {
                wa2Var = wa2Var2;
                n24Var = n24Var2;
            } else {
                jr1 jr1Var18 = mr1Var.I;
                if (yg3Var instanceof wg3) {
                    m14 m14Var = ((wg3) yg3Var).a;
                    float f11 = m14Var.a;
                    char c2 = c;
                    float f12 = m14Var.b;
                    jr1Var18.f((Float.floatToRawIntBits(f11) << c2) | (Float.floatToRawIntBits(f12) & j), (Float.floatToRawIntBits(m14Var.c - f11) << c2) | (Float.floatToRawIntBits(m14Var.d - f12) & j), 0.0f);
                } else {
                    char c3 = c;
                    if (yg3Var instanceof vg3) {
                        yd ydVar = ((vg3) yg3Var).a;
                        jr1Var18.k = null;
                        jr1Var18.i = 9205357640488583168L;
                        jr1Var18.h = 0L;
                        jr1Var18.j = 0.0f;
                        jr1Var18.g = true;
                        jr1Var18.n = false;
                        jr1Var18.l = ydVar;
                        jr1Var18.a();
                    } else {
                        if (!(yg3Var instanceof xg3)) {
                            s83.v();
                            return;
                        }
                        xg3 xg3Var = (xg3) yg3Var;
                        yd ydVar2 = xg3Var.b;
                        if (ydVar2 != null) {
                            jr1Var18.k = null;
                            wa2Var = wa2Var2;
                            n24Var = n24Var2;
                            jr1Var18.i = 9205357640488583168L;
                            jr1Var18.h = 0L;
                            jr1Var18.j = 0.0f;
                            jr1Var18.g = true;
                            jr1Var18.n = false;
                            jr1Var18.l = ydVar2;
                            jr1Var18.a();
                        } else {
                            wa2Var = wa2Var2;
                            n24Var = n24Var2;
                            jr1Var18.f((Float.floatToRawIntBits(r6.a) << c3) | (Float.floatToRawIntBits(r6.b) & j), (Float.floatToRawIntBits(r6.b()) << c3) | (Float.floatToRawIntBits(r6.a()) & j), Float.intBitsToFloat((int) (xg3Var.a.h >> c3)));
                        }
                        if (Build.VERSION.SDK_INT < 33 && (((yg3Var instanceof vg3) || ((yg3Var instanceof xg3) && !sv2.H(((xg3) yg3Var).a))) && (rm1Var = mr1Var.M) != null)) {
                            rm1Var.invoke();
                        }
                    }
                }
                wa2Var = wa2Var2;
                n24Var = n24Var2;
                if (Build.VERSION.SDK_INT < 33) {
                    rm1Var.invoke();
                }
            }
            z2 = true;
        }
        mr1Var.V = n54Var.I;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ed.f(androidComposeView);
            } else {
                androidComposeView.invalidate();
            }
            if (androidComposeView.isArrEnabled$ui()) {
                androidComposeView.voteFrameRate(0.0f);
            }
        }
        boolean z4 = this.g0;
        this.g0 = n54Var.X;
        this.k0 = n54Var.L;
        boolean z5 = x92Var2.a == x92Var.a && x92Var2.b == x92Var.b && x92Var2.c == x92Var.c && x92Var2.d == x92Var.d && x92Var2.e == x92Var.e && x92Var2.f == x92Var.f && x92Var2.g == x92Var.g && x92Var2.h == x92Var.h && r95.a(x92Var2.i, x92Var.i);
        if (z && ((!z5 || z4 != this.g0 || n24Var.I) && (qh3Var = wa2Var.V) != null)) {
            qh3Var.onLayoutChange(wa2Var);
        }
        if (z5) {
            return;
        }
        wa2Var.Q(this);
        if (wa2Var.x0 > 0) {
            za2.a(wa2Var).requestOnPositionedCallback(wa2Var);
        }
    }

    @Override // defpackage.ca2
    /* renamed from: localToScreen-MK-Hz9U */
    public final long mo36localToScreenMKHz9U(long j) {
        if (!h()) {
            q02.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return za2.a(this.c0).mo21localToScreenMKHz9U(M(j));
    }

    public final boolean m1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        mr1 mr1Var = this.B0;
        if (mr1Var != null && this.g0) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            jr1 jr1Var = mr1Var.I;
            if (!(jr1Var.A ? kb4.O(jr1Var.d(), intBitsToFloat, intBitsToFloat2) : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hs2
    public final hs2 n0() {
        return this.d0;
    }

    @Override // defpackage.ca2
    public final long o() {
        return this.K;
    }

    @Override // defpackage.hs2
    public final boolean p0() {
        return this.l0 != null;
    }

    @Override // defpackage.hs2
    public final wa2 q0() {
        return this.c0;
    }

    @Override // defpackage.hs2
    public final vw2 r0() {
        vw2 vw2Var = this.l0;
        if (vw2Var != null) {
            return vw2Var;
        }
        zy.i("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.hs2
    public final hs2 s0() {
        return this.e0;
    }

    @Override // defpackage.ca2
    /* renamed from: screenToLocal-MK-Hz9U */
    public final long mo37screenToLocalMKHz9U(long j) {
        if (!h()) {
            q02.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return I(mu0.q(this), za2.a(this.c0).mo25screenToLocalMKHz9U(j));
    }

    @Override // defpackage.hs2
    public final long t0() {
        return this.n0;
    }

    @Override // defpackage.ca2
    public final long w(long j) {
        if (!h()) {
            q02.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ca2 q = mu0.q(this);
        return I(q, pd3.e(za2.a(this.c0).mo16calculateLocalPositionMKHz9U(j), q.M(0L)));
    }

    @Override // defpackage.hs2
    public final void x0() {
        d0(this.n0, this.o0, this.h0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [k13] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b53] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.bn3, defpackage.a42
    public final Object z() {
        wa2 wa2Var = this.c0;
        if (!wa2Var.n0.c(64)) {
            return null;
        }
        K0();
        Object obj = null;
        for (k13 k13Var = wa2Var.n0.e; k13Var != null; k13Var = k13Var.getParent$ui()) {
            if ((k13Var.getKindSet$ui() & 64) != 0) {
                wt0 wt0Var = k13Var;
                ?? r5 = 0;
                while (wt0Var != 0) {
                    if (wt0Var instanceof lk3) {
                        obj = ((lk3) wt0Var).o(wa2Var.g0, obj);
                    } else if ((wt0Var.getKindSet$ui() & 64) != 0 && (wt0Var instanceof wt0)) {
                        k13 k13Var2 = wt0Var.J;
                        int i = 0;
                        wt0Var = wt0Var;
                        r5 = r5;
                        while (k13Var2 != null) {
                            if ((k13Var2.getKindSet$ui() & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    wt0Var = k13Var2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new b53(new k13[16]);
                                    }
                                    if (wt0Var != 0) {
                                        r5.c(wt0Var);
                                        wt0Var = 0;
                                    }
                                    r5.c(k13Var2);
                                }
                            }
                            k13Var2 = k13Var2.getChild$ui();
                            wt0Var = wt0Var;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    wt0Var = ut0.M(r5);
                }
            }
        }
        return obj;
    }

    public final void z0(na3 na3Var, m43 m43Var, boolean z) {
        if (na3Var == this) {
            return;
        }
        na3 na3Var2 = this.e0;
        if (na3Var2 != null) {
            na3Var2.z0(na3Var, m43Var, z);
        }
        long j = this.n0;
        float f = (int) (j >> 32);
        m43Var.a -= f;
        m43Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        m43Var.b -= f2;
        m43Var.d -= f2;
        mr1 mr1Var = this.B0;
        if (mr1Var != null) {
            float[] a = mr1Var.a();
            if (!mr1Var.a0) {
                if (a == null) {
                    m43Var.a = 0.0f;
                    m43Var.b = 0.0f;
                    m43Var.c = 0.0f;
                    m43Var.d = 0.0f;
                } else {
                    nw2.c(a, m43Var);
                }
            }
            if (this.g0 && z) {
                long j2 = this.K;
                m43Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    @Override // defpackage.hs2
    public final ca2 o0() {
        return this;
    }
}

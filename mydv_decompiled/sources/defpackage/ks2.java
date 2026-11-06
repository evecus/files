package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ks2 implements ca2 {
    public final js2 I;

    public ks2(js2 js2Var) {
        this.I = js2Var;
    }

    @Override // defpackage.ca2
    public final ca2 C() {
        js2 I0;
        if (!h()) {
            q02.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        na3 na3Var = this.I.c0.c0.n0.d.e0;
        if (na3Var == null || (I0 = na3Var.I0()) == null) {
            return null;
        }
        return I0.f0;
    }

    @Override // defpackage.ca2
    public final long G(ca2 ca2Var, long j) {
        return I(ca2Var, j);
    }

    @Override // defpackage.ca2
    public final long I(ca2 ca2Var, long j) {
        boolean z = ca2Var instanceof ks2;
        js2 js2Var = this.I;
        if (!z) {
            js2 T = dq2.T(js2Var);
            na3 na3Var = T.c0;
            long I = I(T.f0, j);
            float f = (int) (T.d0 & 4294967295L);
            long e = pd3.e(I, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!na3Var.h()) {
                q02.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            na3Var.U0();
            na3 na3Var2 = na3Var.e0;
            if (na3Var2 != null) {
                na3Var = na3Var2;
            }
            return pd3.f(e, na3Var.I(ca2Var, 0L));
        }
        js2 js2Var2 = ((ks2) ca2Var).I;
        na3 na3Var3 = js2Var2.c0;
        na3Var3.U0();
        js2 I0 = js2Var.c0.G0(na3Var3).I0();
        if (I0 != null) {
            long b = r22.b(r22.c(js2Var2.B0(I0, false), sv2.U(j)), js2Var.B0(I0, false));
            return (Float.floatToRawIntBits((int) (b >> 32)) << 32) | (Float.floatToRawIntBits((int) (b & 4294967295L)) & 4294967295L);
        }
        js2 T2 = dq2.T(js2Var2);
        long c = r22.c(r22.c(js2Var2.B0(T2, false), T2.d0), sv2.U(j));
        js2 T3 = dq2.T(js2Var);
        long b2 = r22.b(c, r22.c(js2Var.B0(T3, false), T3.d0));
        long floatToRawIntBits = Float.floatToRawIntBits((int) (b2 >> 32));
        long floatToRawIntBits2 = Float.floatToRawIntBits((int) (b2 & 4294967295L)) & 4294967295L;
        na3 na3Var4 = T3.c0.e0;
        na3Var4.getClass();
        na3 na3Var5 = T2.c0.e0;
        na3Var5.getClass();
        return na3Var4.I(na3Var5, floatToRawIntBits2 | (floatToRawIntBits << 32));
    }

    @Override // defpackage.ca2
    public final m14 J(ca2 ca2Var, boolean z) {
        return this.I.c0.J(ca2Var, z);
    }

    @Override // defpackage.ca2
    public final long M(long j) {
        return this.I.c0.M(pd3.f(j, a()));
    }

    public final long a() {
        js2 js2Var = this.I;
        js2 T = dq2.T(js2Var);
        return pd3.e(I(T.f0, 0L), js2Var.c0.I(T.c0, 0L));
    }

    @Override // defpackage.ca2
    public final long d(long j) {
        return this.I.c0.d(pd3.f(j, a()));
    }

    @Override // defpackage.ca2
    public final boolean h() {
        return this.I.c0.h();
    }

    @Override // defpackage.ca2
    public final void i(float[] fArr) {
        this.I.c0.i(fArr);
    }

    @Override // defpackage.ca2
    public final void j(ca2 ca2Var, float[] fArr) {
        this.I.c0.j(ca2Var, fArr);
    }

    @Override // defpackage.ca2
    /* renamed from: localToScreen-MK-Hz9U */
    public final long mo36localToScreenMKHz9U(long j) {
        return this.I.c0.mo36localToScreenMKHz9U(pd3.f(j, a()));
    }

    @Override // defpackage.ca2
    public final long o() {
        js2 js2Var = this.I;
        return (js2Var.I << 32) | (js2Var.J & 4294967295L);
    }

    @Override // defpackage.ca2
    /* renamed from: screenToLocal-MK-Hz9U */
    public final long mo37screenToLocalMKHz9U(long j) {
        return pd3.f(this.I.c0.mo37screenToLocalMKHz9U(j), a());
    }

    @Override // defpackage.ca2
    public final long w(long j) {
        return pd3.f(this.I.c0.w(j), a());
    }
}

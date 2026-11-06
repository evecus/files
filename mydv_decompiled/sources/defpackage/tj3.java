package defpackage;

import androidx.media3.common.util.Log;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tj3 extends k13 implements na2, w31 {
    public rj3 I;
    public boolean J;
    public u8 K;
    public ni0 L;
    public float M;
    public c80 N;

    public static boolean k0(long j) {
        return !fq4.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Log.LOG_LEVEL_OFF) < 2139095040;
    }

    public static boolean l0(long j) {
        return !fq4.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Log.LOG_LEVEL_OFF) < 2139095040;
    }

    @Override // defpackage.w31
    public final void draw(zh0 zh0Var) {
        long j;
        float f;
        float f2;
        long mo43getIntrinsicSizeNHjbRc = this.I.mo43getIntrinsicSizeNHjbRc();
        long floatToRawIntBits = (Float.floatToRawIntBits(l0(mo43getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (((ya2) zh0Var).I.J.H() >> 32))) << 32) | (Float.floatToRawIntBits(k0(mo43getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (((ya2) zh0Var).I.J.H() & 4294967295L))) & 4294967295L);
        ya2 ya2Var = (ya2) zh0Var;
        r10 r10Var = ya2Var.I;
        try {
            if (Float.intBitsToFloat((int) (r10Var.J.H() >> 32)) != 0.0f) {
                pn pnVar = r10Var.J;
                if (Float.intBitsToFloat((int) (pnVar.H() & 4294967295L)) != 0.0f) {
                    j = rt0.J(floatToRawIntBits, this.L.a(floatToRawIntBits, pnVar.H()));
                    long j2 = j;
                    pn pnVar2 = r10Var.J;
                    long a = this.K.a((Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (pnVar2.H() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (pnVar2.H() & 4294967295L))) & 4294967295L), ya2Var.getLayoutDirection());
                    f = (int) (a >> 32);
                    f2 = (int) (a & 4294967295L);
                    ((ep) r10Var.J.b).K(f, f2);
                    this.I.m367drawx_KDEd0(zh0Var, j2, this.M, this.N);
                    ((ep) r10Var.J.b).K(-f, -f2);
                    ya2Var.a();
                    return;
                }
            }
            this.I.m367drawx_KDEd0(zh0Var, j2, this.M, this.N);
            ((ep) r10Var.J.b).K(-f, -f2);
            ya2Var.a();
            return;
        } catch (Throwable th) {
            ((ep) r10Var.J.b).K(-f, -f2);
            throw th;
        }
        j = 0;
        long j22 = j;
        pn pnVar22 = r10Var.J;
        long a2 = this.K.a((Math.round(Float.intBitsToFloat((int) (j22 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j22 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (pnVar22.H() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (pnVar22.H() & 4294967295L))) & 4294967295L), ya2Var.getLayoutDirection());
        f = (int) (a2 >> 32);
        f2 = (int) (a2 & 4294967295L);
        ((ep) r10Var.J.b).K(f, f2);
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean j0() {
        return this.J && this.I.mo43getIntrinsicSizeNHjbRc() != 9205357640488583168L;
    }

    @Override // defpackage.na2
    public final int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        if (!j0()) {
            return a42Var.b(i);
        }
        long m368modifyConstraintsZezNO4M = m368modifyConstraintsZezNO4M(eh0.b(0, i, 0, 0, 13));
        return Math.max(dh0.i(m368modifyConstraintsZezNO4M), a42Var.b(i));
    }

    @Override // defpackage.na2
    public final int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        if (!j0()) {
            return a42Var.t(i);
        }
        long m368modifyConstraintsZezNO4M = m368modifyConstraintsZezNO4M(eh0.b(0, 0, 0, i, 7));
        return Math.max(dh0.j(m368modifyConstraintsZezNO4M), a42Var.t(i));
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public final vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        bn3 u = pw2Var.u(m368modifyConstraintsZezNO4M(j));
        return ww2Var.A(u.I, u.J, p91.I, new sa(u, (byte) 4));
    }

    @Override // defpackage.na2
    public final int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        if (!j0()) {
            return a42Var.Q(i);
        }
        long m368modifyConstraintsZezNO4M = m368modifyConstraintsZezNO4M(eh0.b(0, i, 0, 0, 13));
        return Math.max(dh0.i(m368modifyConstraintsZezNO4M), a42Var.Q(i));
    }

    @Override // defpackage.na2
    public final int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        if (!j0()) {
            return a42Var.p(i);
        }
        long m368modifyConstraintsZezNO4M = m368modifyConstraintsZezNO4M(eh0.b(0, 0, 0, i, 7));
        return Math.max(dh0.j(m368modifyConstraintsZezNO4M), a42Var.p(i));
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m368modifyConstraintsZezNO4M(long j) {
        boolean z = false;
        boolean z2 = dh0.d(j) && dh0.c(j);
        if (dh0.f(j) && dh0.e(j)) {
            z = true;
        }
        if ((!j0() && z2) || z) {
            return dh0.a(j, dh0.h(j), 0, dh0.g(j), 0, 10);
        }
        long mo43getIntrinsicSizeNHjbRc = this.I.mo43getIntrinsicSizeNHjbRc();
        int round = l0(mo43getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc >> 32))) : dh0.j(j);
        int round2 = k0(mo43getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc & 4294967295L))) : dh0.i(j);
        int g = eh0.g(round, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(eh0.f(round2, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (j0()) {
            long floatToRawIntBits2 = (Float.floatToRawIntBits(!l0(this.I.mo43getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.I.mo43getIntrinsicSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(!k0(this.I.mo43getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.I.mo43getIntrinsicSizeNHjbRc() & 4294967295L))) & 4294967295L);
            floatToRawIntBits = (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : rt0.J(floatToRawIntBits2, this.L.a(floatToRawIntBits2, floatToRawIntBits));
        }
        return dh0.a(j, eh0.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, eh0.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.I + ", sizeToIntrinsics=" + this.J + ", alignment=" + this.K + ", alpha=" + this.M + ", colorFilter=" + this.N + ")";
    }

    @Override // defpackage.w31
    public final void onMeasureResultChanged() {
    }
}

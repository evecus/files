package coil3.compose.internal;

import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import defpackage.a42;
import defpackage.aj4;
import defpackage.an3;
import defpackage.b2;
import defpackage.b42;
import defpackage.bn3;
import defpackage.c80;
import defpackage.cj4;
import defpackage.d82;
import defpackage.dh0;
import defpackage.eh0;
import defpackage.ep;
import defpackage.fq4;
import defpackage.k13;
import defpackage.mw2;
import defpackage.na2;
import defpackage.ni0;
import defpackage.p70;
import defpackage.p91;
import defpackage.pi4;
import defpackage.pn;
import defpackage.pw2;
import defpackage.r10;
import defpackage.r7;
import defpackage.rj3;
import defpackage.rt0;
import defpackage.u8;
import defpackage.vw2;
import defpackage.w31;
import defpackage.wd5;
import defpackage.ww2;
import defpackage.ya2;
import defpackage.zh0;
import defpackage.zi4;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class AbstractContentPainterNode extends k13 implements w31, na2, pi4 {
    public static final int $stable = 8;
    private u8 alignment;
    private float alpha;
    private boolean clipToBounds;
    private c80 colorFilter;
    private ConstraintsSizeResolver constraintSizeResolver;
    private String contentDescription;
    private ni0 contentScale;

    public AbstractContentPainterNode(u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        this.alignment = u8Var;
        this.contentScale = ni0Var;
        this.alpha = f;
        this.colorFilter = c80Var;
        this.clipToBounds = z;
        this.contentDescription = str;
        this.constraintSizeResolver = constraintsSizeResolver;
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m64calculateScaledSizeE7KxVPU(long j) {
        if (fq4.c(j)) {
            return 0L;
        }
        long mo43getIntrinsicSizeNHjbRc = getPainter().mo43getIntrinsicSizeNHjbRc();
        if (mo43getIntrinsicSizeNHjbRc != 9205357640488583168L) {
            float intBitsToFloat = Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc >> 32));
            if (Math.abs(intBitsToFloat) > Float.MAX_VALUE) {
                intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float intBitsToFloat2 = Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc & 4294967295L));
            if (Math.abs(intBitsToFloat2) > Float.MAX_VALUE) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            long a = this.contentScale.a(floatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (a >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & a))) <= Float.MAX_VALUE) {
                return rt0.J(floatToRawIntBits, a);
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wd5 measure_3p2s80s$lambda$0(bn3 bn3Var, an3 an3Var) {
        an3.i(an3Var, bn3Var, 0, 0);
        return wd5.a;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m65modifyConstraintsZezNO4M(long j) {
        float m70constrainWidthK40F9xA;
        int i;
        float m69constrainHeightK40F9xA;
        boolean f = dh0.f(j);
        boolean e = dh0.e(j);
        if (!f || !e) {
            rj3 painter = getPainter();
            boolean z = dh0.d(j) && dh0.c(j);
            long mo43getIntrinsicSizeNHjbRc = painter.mo43getIntrinsicSizeNHjbRc();
            if (mo43getIntrinsicSizeNHjbRc != 9205357640488583168L) {
                if (z && (f || e)) {
                    m70constrainWidthK40F9xA = dh0.h(j);
                    i = dh0.g(j);
                } else {
                    float intBitsToFloat = Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (mo43getIntrinsicSizeNHjbRc & 4294967295L));
                    m70constrainWidthK40F9xA = Math.abs(intBitsToFloat) <= Float.MAX_VALUE ? UtilsKt.m70constrainWidthK40F9xA(j, intBitsToFloat) : dh0.j(j);
                    if (Math.abs(intBitsToFloat2) <= Float.MAX_VALUE) {
                        m69constrainHeightK40F9xA = UtilsKt.m69constrainHeightK40F9xA(j, intBitsToFloat2);
                        long m64calculateScaledSizeE7KxVPU = m64calculateScaledSizeE7KxVPU((Float.floatToRawIntBits(m69constrainHeightK40F9xA) & 4294967295L) | (Float.floatToRawIntBits(m70constrainWidthK40F9xA) << 32));
                        return dh0.a(j, eh0.g(mw2.P(Float.intBitsToFloat((int) (m64calculateScaledSizeE7KxVPU >> 32))), j), 0, eh0.f(mw2.P(Float.intBitsToFloat((int) (m64calculateScaledSizeE7KxVPU & 4294967295L))), j), 0, 10);
                    }
                    i = dh0.i(j);
                }
                m69constrainHeightK40F9xA = i;
                long m64calculateScaledSizeE7KxVPU2 = m64calculateScaledSizeE7KxVPU((Float.floatToRawIntBits(m69constrainHeightK40F9xA) & 4294967295L) | (Float.floatToRawIntBits(m70constrainWidthK40F9xA) << 32));
                return dh0.a(j, eh0.g(mw2.P(Float.intBitsToFloat((int) (m64calculateScaledSizeE7KxVPU2 >> 32))), j), 0, eh0.f(mw2.P(Float.intBitsToFloat((int) (m64calculateScaledSizeE7KxVPU2 & 4294967295L))), j), 0, 10);
            }
            if (z && (!(painter instanceof AsyncImagePainter) || ((AsyncImagePainter.State) ((AsyncImagePainter) painter).getState().getValue()).getPainter() != null)) {
                return dh0.a(j, dh0.h(j), 0, dh0.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.pi4
    public void applySemantics(cj4 cj4Var) {
        String str = this.contentDescription;
        if (str != null) {
            d82[] d82VarArr = aj4.a;
            cj4Var.c(zi4.a, p70.j0(str));
            aj4.c(cj4Var, 5);
        }
    }

    @Override // defpackage.w31
    public void draw(zh0 zh0Var) {
        long m64calculateScaledSizeE7KxVPU = m64calculateScaledSizeE7KxVPU(((ya2) zh0Var).I.J.H());
        u8 u8Var = this.alignment;
        long m72toIntSizeuvyYCjk = UtilsKt.m72toIntSizeuvyYCjk(m64calculateScaledSizeE7KxVPU);
        ya2 ya2Var = (ya2) zh0Var;
        r10 r10Var = ya2Var.I;
        long a = u8Var.a(m72toIntSizeuvyYCjk, UtilsKt.m72toIntSizeuvyYCjk(r10Var.J.H()), ya2Var.getLayoutDirection());
        int i = (int) (a >> 32);
        int i2 = (int) (a & 4294967295L);
        pn pnVar = r10Var.J;
        long H = pnVar.H();
        pnVar.q().f();
        try {
            ep epVar = (ep) pnVar.b;
            pn pnVar2 = (pn) epVar.J;
            if (this.clipToBounds) {
                epVar.o(0.0f, 0.0f, Float.intBitsToFloat((int) (pnVar2.H() >> 32)), Float.intBitsToFloat((int) (4294967295L & pnVar2.H())), 1);
            }
            epVar.K(i, i2);
            getPainter().m367drawx_KDEd0(zh0Var, m64calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
            pnVar.q().n();
            pnVar.X(H);
            ya2Var.a();
        } catch (Throwable th) {
            r7.H(pnVar, H);
            throw th;
        }
    }

    public final u8 getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final c80 getColorFilter() {
        return this.colorFilter;
    }

    public final ConstraintsSizeResolver getConstraintSizeResolver() {
        return this.constraintSizeResolver;
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final ni0 getContentScale() {
        return this.contentScale;
    }

    public abstract rj3 getPainter();

    @Override // defpackage.k13
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public boolean isImportantForBounds() {
        return true;
    }

    @Override // defpackage.na2
    public int maxIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        long b = eh0.b(0, i, 0, 0, 13);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m49setConstraintsBRTryo0(b);
        }
        if (getPainter().mo43getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return a42Var.b(i);
        }
        long m65modifyConstraintsZezNO4M = m65modifyConstraintsZezNO4M(b);
        return Math.max(dh0.i(m65modifyConstraintsZezNO4M), a42Var.b(i));
    }

    @Override // defpackage.na2
    public int maxIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        long b = eh0.b(0, 0, 0, i, 7);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m49setConstraintsBRTryo0(b);
        }
        if (getPainter().mo43getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return a42Var.t(i);
        }
        long m65modifyConstraintsZezNO4M = m65modifyConstraintsZezNO4M(b);
        return Math.max(dh0.j(m65modifyConstraintsZezNO4M), a42Var.t(i));
    }

    @Override // defpackage.na2
    /* renamed from: measure-3p2s80s */
    public vw2 mo34measure3p2s80s(ww2 ww2Var, pw2 pw2Var, long j) {
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m49setConstraintsBRTryo0(j);
        }
        bn3 u = pw2Var.u(m65modifyConstraintsZezNO4M(j));
        return ww2Var.A(u.I, u.J, p91.I, new b2(u, (byte) 0));
    }

    @Override // defpackage.na2
    public int minIntrinsicHeight(b42 b42Var, a42 a42Var, int i) {
        long b = eh0.b(0, i, 0, 0, 13);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m49setConstraintsBRTryo0(b);
        }
        if (getPainter().mo43getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return a42Var.Q(i);
        }
        long m65modifyConstraintsZezNO4M = m65modifyConstraintsZezNO4M(b);
        return Math.max(dh0.i(m65modifyConstraintsZezNO4M), a42Var.Q(i));
    }

    @Override // defpackage.na2
    public int minIntrinsicWidth(b42 b42Var, a42 a42Var, int i) {
        long b = eh0.b(0, 0, 0, i, 7);
        ConstraintsSizeResolver constraintsSizeResolver = this.constraintSizeResolver;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.m49setConstraintsBRTryo0(b);
        }
        if (getPainter().mo43getIntrinsicSizeNHjbRc() == 9205357640488583168L) {
            return a42Var.p(i);
        }
        long m65modifyConstraintsZezNO4M = m65modifyConstraintsZezNO4M(b);
        return Math.max(dh0.j(m65modifyConstraintsZezNO4M), a42Var.p(i));
    }

    public final void setAlignment(u8 u8Var) {
        this.alignment = u8Var;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setColorFilter(c80 c80Var) {
        this.colorFilter = c80Var;
    }

    public final void setConstraintSizeResolver(ConstraintsSizeResolver constraintsSizeResolver) {
        this.constraintSizeResolver = constraintsSizeResolver;
    }

    public final void setContentDescription(String str) {
        this.contentDescription = str;
    }

    public final void setContentScale(ni0 ni0Var) {
        this.contentScale = ni0Var;
    }

    @Override // defpackage.k13
    public void onDensityChange() {
    }

    @Override // defpackage.k13
    public void onLayoutDirectionChange() {
    }

    @Override // defpackage.w31
    public void onMeasureResultChanged() {
    }
}

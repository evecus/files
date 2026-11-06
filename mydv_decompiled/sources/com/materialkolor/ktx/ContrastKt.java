package com.materialkolor.ktx;

import defpackage.mj0;
import defpackage.p70;
import defpackage.qb;
import defpackage.zs1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ContrastKt {
    /* renamed from: contrastRatio--OWjLjI, reason: not valid java name */
    public static final double m165contrastRatioOWjLjI(long j, long j2) {
        double[] E0 = p70.E0(qb.i0(j));
        double[] E02 = p70.E0(qb.i0(j2));
        double d = E0[1];
        double d2 = E02[1];
        double max = Math.max(d, d2);
        if (max != d2) {
            d = d2;
        }
        return (max + 5.0d) / (d + 5.0d);
    }

    /* renamed from: hasEnoughContrast-jxsXWHM, reason: not valid java name */
    public static final boolean m166hasEnoughContrastjxsXWHM(long j, long j2, mj0 mj0Var) {
        mj0Var.getClass();
        return Double.compare(m165contrastRatioOWjLjI(j, j2), mj0Var.I) >= 0;
    }

    /* renamed from: hasEnoughContrast-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ boolean m167hasEnoughContrastjxsXWHM$default(long j, long j2, mj0 mj0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            mj0Var = mj0.WCAG_AA_NORMAL_TEXT;
        }
        return m166hasEnoughContrastjxsXWHM(j, j2, mj0Var);
    }

    /* renamed from: tonalContrastRatio--OWjLjI, reason: not valid java name */
    public static final double m168tonalContrastRatioOWjLjI(long j, long j2) {
        zs1 m184toHct8_81llA = HctKt.m184toHct8_81llA(j);
        zs1 m184toHct8_81llA2 = HctKt.m184toHct8_81llA(j2);
        double d = m184toHct8_81llA.d;
        double d2 = m184toHct8_81llA2.d;
        double F0 = p70.F0(d);
        double F02 = p70.F0(d2);
        double max = Math.max(F0, F02);
        if (max != F02) {
            F0 = F02;
        }
        return (max + 5.0d) / (F0 + 5.0d);
    }
}

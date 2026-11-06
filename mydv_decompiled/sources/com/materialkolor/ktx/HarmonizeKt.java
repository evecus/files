package com.materialkolor.ktx;

import defpackage.fw;
import defpackage.k80;
import defpackage.o7;
import defpackage.ys1;
import defpackage.zs1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HarmonizeKt {
    /* renamed from: harmonize-IbeAmgk, reason: not valid java name */
    public static final long m177harmonizeIbeAmgk(fw fwVar, long j, long j2, boolean z) {
        fwVar.getClass();
        if (z) {
            j = ColorKt.m161matchSaturationOWjLjI(j, j2);
        }
        ys1 ys1Var = zs1.e;
        zs1 m183from4WTKRHQ = HctKt.m183from4WTKRHQ(ys1Var, j);
        zs1 m183from4WTKRHQ2 = HctKt.m183from4WTKRHQ(ys1Var, j2);
        m183from4WTKRHQ.getClass();
        m183from4WTKRHQ2.getClass();
        double d = m183from4WTKRHQ.b;
        double d2 = m183from4WTKRHQ2.b;
        double min = Math.min((180.0d - Math.abs(Math.abs(d - d2) - 180.0d)) * 0.5d, 15.0d);
        double d3 = (d2 - d) % 360.0d;
        if (d3 < 0.0d) {
            d3 += 360.0d;
        }
        double d4 = ((min * (d3 <= 180.0d ? 1.0d : -1.0d)) + d) % 360.0d;
        if (d4 < 0.0d) {
            d4 += 360.0d;
        }
        return HctKt.toColor(new zs1(o7.Q(d4, m183from4WTKRHQ.c, m183from4WTKRHQ.d)));
    }

    /* renamed from: harmonize-IbeAmgk$default, reason: not valid java name */
    public static /* synthetic */ long m178harmonizeIbeAmgk$default(fw fwVar, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m177harmonizeIbeAmgk(fwVar, j, j2, z);
    }

    /* renamed from: harmonize-jxsXWHM, reason: not valid java name */
    public static final long m179harmonizejxsXWHM(long j, long j2, boolean z) {
        return m177harmonizeIbeAmgk(fw.a, j, j2, z);
    }

    /* renamed from: harmonize-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ long m180harmonizejxsXWHM$default(long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m179harmonizejxsXWHM(j, j2, z);
    }

    /* renamed from: harmonizeWithPrimary-bw27NRU, reason: not valid java name */
    public static final long m181harmonizeWithPrimarybw27NRU(k80 k80Var, long j, boolean z) {
        k80Var.getClass();
        return m177harmonizeIbeAmgk(fw.a, j, k80Var.a, z);
    }

    /* renamed from: harmonizeWithPrimary-bw27NRU$default, reason: not valid java name */
    public static /* synthetic */ long m182harmonizeWithPrimarybw27NRU$default(k80 k80Var, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m181harmonizeWithPrimarybw27NRU(k80Var, j, z);
    }
}

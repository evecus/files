package com.materialkolor.ktx;

import defpackage.fw;
import defpackage.j42;
import defpackage.o7;
import defpackage.p70;
import defpackage.qb;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class BlendKt {
    /* renamed from: blend-IbeAmgk, reason: not valid java name */
    public static final long m147blendIbeAmgk(fw fwVar, long j, long j2, float f) {
        fwVar.getClass();
        return qb.i(fw.a(qb.i0(j), qb.i0(j2), f));
    }

    /* renamed from: blend-jxsXWHM, reason: not valid java name */
    public static final long m148blendjxsXWHM(long j, long j2, float f) {
        return m147blendIbeAmgk(fw.a, j, j2, f);
    }

    /* renamed from: blend-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ long m149blendjxsXWHM$default(long j, long j2, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return m148blendjxsXWHM(j, j2, f);
    }

    /* renamed from: blendHue-IbeAmgk, reason: not valid java name */
    public static final long m150blendHueIbeAmgk(fw fwVar, long j, long j2, float f) {
        fwVar.getClass();
        int i0 = qb.i0(j);
        int Q = o7.Q(j42.y(fw.a(i0, qb.i0(j2), f)).a, j42.y(i0).b, p70.l0(i0));
        j42.y(Q);
        p70.l0(Q);
        return qb.i(Q);
    }

    /* renamed from: blendHue-jxsXWHM, reason: not valid java name */
    public static final long m151blendHuejxsXWHM(long j, long j2, float f) {
        return m150blendHueIbeAmgk(fw.a, j, j2, f);
    }

    /* renamed from: blendHue-jxsXWHM$default, reason: not valid java name */
    public static /* synthetic */ long m152blendHuejxsXWHM$default(long j, long j2, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return m151blendHuejxsXWHM(j, j2, f);
    }
}

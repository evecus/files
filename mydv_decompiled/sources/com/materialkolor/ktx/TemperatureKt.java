package com.materialkolor.ktx;

import defpackage.h25;
import defpackage.j25;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class TemperatureKt {
    /* renamed from: TemperatureCache-8_81llA, reason: not valid java name */
    public static final j25 m191TemperatureCache8_81llA(long j) {
        return new j25(HctKt.m184toHct8_81llA(j));
    }

    /* renamed from: isCool-8_81llA, reason: not valid java name */
    public static final boolean m192isCool8_81llA(long j) {
        return m194temperature4WTKRHQ(j25.f, j) < 0.0d;
    }

    /* renamed from: isWarm-8_81llA, reason: not valid java name */
    public static final boolean m193isWarm8_81llA(long j) {
        return m194temperature4WTKRHQ(j25.f, j) > 0.0d;
    }

    /* renamed from: temperature-4WTKRHQ, reason: not valid java name */
    public static final double m194temperature4WTKRHQ(h25 h25Var, long j) {
        h25Var.getClass();
        return h25.a(HctKt.m184toHct8_81llA(j));
    }
}

package com.materialkolor.ktx;

import defpackage.bj;
import defpackage.bq4;
import defpackage.c5;
import defpackage.cw4;
import defpackage.fe0;
import defpackage.fs1;
import defpackage.g92;
import defpackage.j42;
import defpackage.j81;
import defpackage.jx4;
import defpackage.k85;
import defpackage.ku4;
import defpackage.mw2;
import defpackage.o7;
import defpackage.p70;
import defpackage.qb;
import defpackage.r84;
import defpackage.rt0;
import defpackage.tm1;
import defpackage.tz3;
import defpackage.v80;
import defpackage.x70;
import defpackage.yz3;
import defpackage.z06;
import defpackage.z80;
import defpackage.zc5;
import defpackage.zs1;
import java.util.Locale;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ColorKt {
    public static final ku4 a = qb.g0(0.0f, 0.0f, null, 7);

    /* renamed from: animate-euL9pac, reason: not valid java name */
    public static final cw4 m153animateeuL9pac(long j, bj bjVar, String str, tm1 tm1Var, fe0 fe0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            bjVar = a;
        }
        return bq4.a(j, bjVar, null, fe0Var, i & WebSocketProtocol.PAYLOAD_SHORT, 12);
    }

    /* renamed from: darken-DxMtmZc, reason: not valid java name */
    public static final long m154darkenDxMtmZc(long j, float f) {
        zs1 m184toHct8_81llA = HctKt.m184toHct8_81llA(j);
        double s = j42.s(m184toHct8_81llA.d, f);
        Double valueOf = Double.valueOf(s);
        if (s <= -1.0d) {
            valueOf = null;
        }
        if (valueOf == null) {
            return j;
        }
        return HctKt.toColor(new zs1(o7.Q(m184toHct8_81llA.b, m184toHct8_81llA.c, valueOf.doubleValue())));
    }

    /* renamed from: darken-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ long m155darkenDxMtmZc$default(long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.1f;
        }
        return m154darkenDxMtmZc(j, f);
    }

    /* renamed from: fixIfDisliked-8_81llA, reason: not valid java name */
    public static final long m156fixIfDisliked8_81llA(long j) {
        return HctKt.toColor(rt0.s(HctKt.m184toHct8_81llA(j)));
    }

    public static final String format(int i) {
        o7.k(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return jx4.P(2, num);
    }

    public static final ku4 getDefaultColorSpring() {
        return a;
    }

    /* renamed from: isDisliked-8_81llA, reason: not valid java name */
    public static final boolean m157isDisliked8_81llA(long j) {
        zs1 m184toHct8_81llA = HctKt.m184toHct8_81llA(j);
        m184toHct8_81llA.getClass();
        double rint = Math.rint(m184toHct8_81llA.b);
        return ((90.0d > rint ? 1 : (90.0d == rint ? 0 : -1)) <= 0 && (rint > 111.0d ? 1 : (rint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(m184toHct8_81llA.c) > 16.0d ? 1 : (Math.rint(m184toHct8_81llA.c) == 16.0d ? 0 : -1)) > 0) && ((Math.rint(m184toHct8_81llA.d) > 65.0d ? 1 : (Math.rint(m184toHct8_81llA.d) == 65.0d ? 0 : -1)) < 0);
    }

    /* renamed from: isLight-8_81llA, reason: not valid java name */
    public static final boolean m158isLight8_81llA(long j) {
        return !zc5.a(j, x70.f) && p70.E0(qb.i0(j))[1] / 100.0d > 0.5d;
    }

    /* renamed from: lighten-DxMtmZc, reason: not valid java name */
    public static final long m159lightenDxMtmZc(long j, float f) {
        zs1 m184toHct8_81llA = HctKt.m184toHct8_81llA(j);
        double K = j42.K(m184toHct8_81llA.d, f);
        Double valueOf = Double.valueOf(K);
        if (K <= -1.0d) {
            valueOf = null;
        }
        if (valueOf == null) {
            return j;
        }
        return HctKt.toColor(new zs1(o7.Q(m184toHct8_81llA.b, m184toHct8_81llA.c, valueOf.doubleValue())));
    }

    /* renamed from: lighten-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ long m160lightenDxMtmZc$default(long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m159lightenDxMtmZc(j, f);
    }

    /* renamed from: matchSaturation--OWjLjI, reason: not valid java name */
    public static final long m161matchSaturationOWjLjI(long j, long j2) {
        fs1 a2 = c5.l0(j).a();
        fs1 a3 = c5.l0(j2).a();
        float f = a2.a;
        float f2 = a3.b;
        float f3 = a3.c;
        fs1 fs1Var = new fs1(f, f2, f3, 1.0f);
        j81 j81Var = fs1.e;
        v80 v80Var = j81Var == r84.J ? z80.e : j81Var == yz3.c ? z80.q : j81Var == yz3.d ? z80.r : j81Var == yz3.e ? z80.o : j81Var == yz3.f ? z80.j : j81Var == yz3.g ? z80.i : j81Var == g92.a ? z80.t : j81Var == z06.b ? z80.s : j81Var == yz3.h ? z80.k : j81Var == yz3.i ? z80.l : j81Var == yz3.b ? z80.f : j81Var == yz3.j ? z80.p : null;
        if (v80Var == null) {
            tz3 c = fs1Var.c();
            return qb.h(c.a, c.b, c.c, c.d, z80.e);
        }
        float[] fArr = {f, f2, f3, 1.0f};
        return qb.h(fArr[0], fArr[1], fArr[2], fArr[3], v80Var);
    }

    /* renamed from: toHex-Iv8Zu3U, reason: not valid java name */
    public static final String m162toHexIv8Zu3U(long j, boolean z, String str, boolean z2) {
        str.getClass();
        int P = mw2.P(x70.d(j) * 255.0f);
        int P2 = mw2.P(x70.h(j) * 255.0f);
        int P3 = mw2.P(x70.g(j) * 255.0f);
        int P4 = mw2.P(x70.e(j) * 255.0f);
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(str);
        }
        if (z2 || P < 255) {
            sb.append(format(P));
        }
        sb.append(format(P2));
        sb.append(format(P3));
        sb.append(format(P4));
        String upperCase = sb.toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    /* renamed from: toHex-Iv8Zu3U$default, reason: not valid java name */
    public static /* synthetic */ String m163toHexIv8Zu3U$default(long j, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = "#";
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return m162toHexIv8Zu3U(j, z, str, z2);
    }

    /* renamed from: toTonalPalette-8_81llA, reason: not valid java name */
    public static final k85 m164toTonalPalette8_81llA(long j) {
        return TonalPaletteKt.m195from4WTKRHQ(k85.e, j);
    }
}

package com.materialkolor.ktx;

import defpackage.a90;
import defpackage.fh5;
import defpackage.h90;
import defpackage.j51;
import defpackage.k51;
import defpackage.k85;
import defpackage.kj0;
import defpackage.mw2;
import defpackage.p90;
import defpackage.qb;
import defpackage.s83;
import defpackage.vj3;
import defpackage.wa4;
import defpackage.x70;
import defpackage.xa4;
import defpackage.zs1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DynamicSchemeKt {
    /* renamed from: DynamicScheme-dtSySfE, reason: not valid java name */
    public static final k51 m172DynamicSchemedtSySfE(long j, boolean z, x70 x70Var, x70 x70Var2, x70 x70Var3, x70 x70Var4, x70 x70Var5, x70 x70Var6, vj3 vj3Var, double d, a90 a90Var, j51 j51Var) {
        fh5 fh5Var;
        k85 k85Var;
        k85 k85Var2;
        k85 k85Var3;
        k85 k85Var4;
        k85 k85Var5;
        k85 k85Var6;
        vj3Var.getClass();
        a90Var.getClass();
        j51Var.getClass();
        k51 m175toDynamicSchemeKTwxG1Y = m175toDynamicSchemeKTwxG1Y(j, z, vj3Var, d, a90Var, j51Var);
        zs1 m184toHct8_81llA = HctKt.m184toHct8_81llA(j);
        switch (vj3Var.ordinal()) {
            case 0:
                fh5Var = fh5.K;
                break;
            case 1:
                fh5Var = fh5.J;
                break;
            case 2:
                fh5Var = fh5.L;
                break;
            case 3:
                fh5Var = fh5.M;
                break;
            case 4:
                fh5Var = fh5.P;
                break;
            case 5:
                fh5Var = fh5.Q;
                break;
            case 6:
                fh5Var = fh5.I;
                break;
            case 7:
                fh5Var = fh5.N;
                break;
            case 8:
                fh5Var = fh5.O;
                break;
            default:
                s83.v();
                return null;
        }
        if (x70Var == null || (k85Var = ColorKt.m164toTonalPalette8_81llA(x70Var.a)) == null) {
            k85Var = m175toDynamicSchemeKTwxG1Y.e;
        }
        if (x70Var2 == null || (k85Var2 = ColorKt.m164toTonalPalette8_81llA(x70Var2.a)) == null) {
            k85Var2 = m175toDynamicSchemeKTwxG1Y.f;
        }
        if (x70Var3 == null || (k85Var3 = ColorKt.m164toTonalPalette8_81llA(x70Var3.a)) == null) {
            k85Var3 = m175toDynamicSchemeKTwxG1Y.g;
        }
        k85 k85Var7 = k85Var3;
        if (x70Var4 == null || (k85Var4 = ColorKt.m164toTonalPalette8_81llA(x70Var4.a)) == null) {
            k85Var4 = m175toDynamicSchemeKTwxG1Y.h;
        }
        k85 k85Var8 = k85Var4;
        if (x70Var5 == null || (k85Var5 = ColorKt.m164toTonalPalette8_81llA(x70Var5.a)) == null) {
            k85Var5 = m175toDynamicSchemeKTwxG1Y.i;
        }
        k85 k85Var9 = k85Var5;
        if (x70Var6 == null || (k85Var6 = ColorKt.m164toTonalPalette8_81llA(x70Var6.a)) == null) {
            k85Var6 = m175toDynamicSchemeKTwxG1Y.k;
        }
        return new k51(m184toHct8_81llA, fh5Var, z, d, k85Var, k85Var2, k85Var7, k85Var8, k85Var9, j51Var, a90Var, k85Var6);
    }

    /* renamed from: DynamicScheme-dtSySfE$default, reason: not valid java name */
    public static k51 m173DynamicSchemedtSySfE$default(long j, boolean z, x70 x70Var, x70 x70Var2, x70 x70Var3, x70 x70Var4, x70 x70Var5, x70 x70Var6, vj3 vj3Var, double d, a90 a90Var, j51 j51Var, int i, Object obj) {
        a90 a90Var2;
        j51 j51Var2;
        x70 x70Var7 = (i & 4) != 0 ? null : x70Var;
        x70 x70Var8 = (i & 8) != 0 ? null : x70Var2;
        x70 x70Var9 = (i & 16) != 0 ? null : x70Var3;
        x70 x70Var10 = (i & 32) != 0 ? null : x70Var4;
        x70 x70Var11 = (i & 64) != 0 ? null : x70Var5;
        x70 x70Var12 = (i & 128) != 0 ? null : x70Var6;
        vj3 vj3Var2 = (i & 256) != 0 ? vj3.I : vj3Var;
        double a = (i & 512) != 0 ? kj0.Default.a() : d;
        if ((i & 1024) != 0) {
            a90.I.getClass();
            a90Var2 = a90.J;
        } else {
            a90Var2 = a90Var;
        }
        if ((i & 2048) != 0) {
            j51.I.getClass();
            j51Var2 = j51.J;
        } else {
            j51Var2 = j51Var;
        }
        return m172DynamicSchemedtSySfE(j, z, x70Var7, x70Var8, x70Var9, x70Var10, x70Var11, x70Var12, vj3Var2, a, a90Var2, j51Var2);
    }

    public static final long getSourceColor(k51 k51Var) {
        k51Var.getClass();
        return qb.i(k51Var.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (((defpackage.go1) r30).f(r14) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        if (((defpackage.go1) r30).h(r18) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016a, code lost:
    
        if (((defpackage.go1) r30).e(r8.ordinal()) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        if (((defpackage.go1) r30).e(r11.ordinal()) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c5, code lost:
    
        if (((defpackage.go1) r30).e(r23.ordinal()) == false) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* renamed from: rememberDynamicScheme-k1ZVges, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k51 m174rememberDynamicSchemek1ZVges(long r16, boolean r18, defpackage.x70 r19, defpackage.x70 r20, defpackage.x70 r21, defpackage.x70 r22, defpackage.x70 r23, defpackage.x70 r24, defpackage.vj3 r25, double r26, defpackage.a90 r28, defpackage.j51 r29, defpackage.fe0 r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.ktx.DynamicSchemeKt.m174rememberDynamicSchemek1ZVges(long, boolean, x70, x70, x70, x70, x70, x70, vj3, double, a90, j51, fe0, int, int, int):k51");
    }

    /* renamed from: toDynamicScheme-KTwxG1Y, reason: not valid java name */
    public static final k51 m175toDynamicSchemeKTwxG1Y(long j, boolean z, vj3 vj3Var, double d, a90 a90Var, j51 j51Var) {
        vj3Var.getClass();
        a90Var.getClass();
        j51Var.getClass();
        zs1 m184toHct8_81llA = HctKt.m184toHct8_81llA(j);
        switch (vj3Var.ordinal()) {
            case 0:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 6);
            case 1:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 4);
            case 2:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 7);
            case 3:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 1);
            case 4:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 5);
            case 5:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 2);
            case 6:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 3);
            case 7:
                h90 h90Var = mw2.b;
                p90 p90Var = mw2.c;
                m184toHct8_81llA.getClass();
                a90 a90Var2 = a90.L;
                h90 h90Var2 = a90Var == a90Var2 ? p90Var : h90Var;
                fh5 fh5Var = fh5.N;
                return new xa4(m184toHct8_81llA, fh5Var, z, d, j51Var, a90Var, h90Var2.h(fh5Var, m184toHct8_81llA, z, j51Var, d), (a90Var == a90Var2 ? p90Var : h90Var).i(fh5Var, m184toHct8_81llA, z, j51Var, d), (a90Var == a90Var2 ? p90Var : h90Var).j(fh5Var, m184toHct8_81llA, z, j51Var, d), (a90Var == a90Var2 ? p90Var : h90Var).f(fh5Var, m184toHct8_81llA, z, j51Var, d), (a90Var == a90Var2 ? p90Var : h90Var).g(fh5Var, m184toHct8_81llA, z, j51Var, d), (a90Var == a90Var2 ? p90Var : h90Var).d(fh5Var, m184toHct8_81llA, z, j51Var, d));
            case 8:
                return new wa4(m184toHct8_81llA, z, d, a90Var, j51Var, (byte) 0);
            default:
                s83.v();
                return null;
        }
    }

    /* renamed from: toDynamicScheme-KTwxG1Y$default, reason: not valid java name */
    public static k51 m176toDynamicSchemeKTwxG1Y$default(long j, boolean z, vj3 vj3Var, double d, a90 a90Var, j51 j51Var, int i, Object obj) {
        a90 a90Var2;
        j51 j51Var2;
        if ((i & 4) != 0) {
            d = kj0.Default.a();
        }
        double d2 = d;
        if ((i & 8) != 0) {
            a90.I.getClass();
            a90Var2 = a90.J;
        } else {
            a90Var2 = a90Var;
        }
        if ((i & 16) != 0) {
            j51.I.getClass();
            j51Var2 = j51.J;
        } else {
            j51Var2 = j51Var;
        }
        return m175toDynamicSchemeKTwxG1Y(j, z, vj3Var, d2, a90Var2, j51Var2);
    }
}

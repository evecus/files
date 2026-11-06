package com.materialkolor;

import com.materialkolor.ktx.DynamicColorKt;
import com.materialkolor.ktx.DynamicSchemeKt;
import defpackage.a51;
import defpackage.a90;
import defpackage.aw2;
import defpackage.b51;
import defpackage.c90;
import defpackage.d90;
import defpackage.e90;
import defpackage.f90;
import defpackage.g90;
import defpackage.h90;
import defpackage.i90;
import defpackage.j51;
import defpackage.k51;
import defpackage.k80;
import defpackage.k90;
import defpackage.kj0;
import defpackage.n1;
import defpackage.n90;
import defpackage.o90;
import defpackage.p90;
import defpackage.q4;
import defpackage.r7;
import defpackage.tm1;
import defpackage.vj3;
import defpackage.x70;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DynamicColorSchemeKt {
    /* renamed from: dynamicColorScheme-N98v4SY, reason: not valid java name */
    public static final k80 m135dynamicColorSchemeN98v4SY(long j, boolean z, boolean z2, x70 x70Var, x70 x70Var2, x70 x70Var3, x70 x70Var4, x70 x70Var5, x70 x70Var6, vj3 vj3Var, double d, a90 a90Var, j51 j51Var, tm1 tm1Var) {
        vj3Var.getClass();
        a90Var.getClass();
        j51Var.getClass();
        return toColorScheme(DynamicSchemeKt.m172DynamicSchemedtSySfE(j, z, x70Var, x70Var2, x70Var3, x70Var4, x70Var5, x70Var6, vj3Var, d, a90Var, j51Var), z2, tm1Var);
    }

    /* renamed from: dynamicColorScheme-N98v4SY$default, reason: not valid java name */
    public static k80 m136dynamicColorSchemeN98v4SY$default(long j, boolean z, boolean z2, x70 x70Var, x70 x70Var2, x70 x70Var3, x70 x70Var4, x70 x70Var5, x70 x70Var6, vj3 vj3Var, double d, a90 a90Var, j51 j51Var, tm1 tm1Var, int i, Object obj) {
        a90 a90Var2;
        j51 j51Var2;
        tm1 tm1Var2;
        long j2;
        boolean z3;
        boolean z4 = (i & 4) != 0 ? false : z2;
        x70 x70Var7 = (i & 8) != 0 ? null : x70Var;
        x70 x70Var8 = (i & 16) != 0 ? null : x70Var2;
        x70 x70Var9 = (i & 32) != 0 ? null : x70Var3;
        x70 x70Var10 = (i & 64) != 0 ? null : x70Var4;
        x70 x70Var11 = (i & 128) != 0 ? null : x70Var5;
        x70 x70Var12 = (i & 256) != 0 ? null : x70Var6;
        vj3 vj3Var2 = (i & 512) != 0 ? vj3.I : vj3Var;
        double a = (i & 1024) != 0 ? kj0.Default.a() : d;
        if ((i & 2048) != 0) {
            a90.I.getClass();
            a90Var2 = a90.J;
        } else {
            a90Var2 = a90Var;
        }
        if ((i & 4096) != 0) {
            j51.I.getClass();
            j51Var2 = j51.J;
        } else {
            j51Var2 = j51Var;
        }
        if ((i & 8192) != 0) {
            tm1Var2 = null;
            z3 = z;
            j2 = j;
        } else {
            tm1Var2 = tm1Var;
            j2 = j;
            z3 = z;
        }
        return m135dynamicColorSchemeN98v4SY(j2, z3, z4, x70Var7, x70Var8, x70Var9, x70Var10, x70Var11, x70Var12, vj3Var2, a, a90Var2, j51Var2, tm1Var2);
    }

    /* renamed from: dynamicColorScheme-onzyBm0, reason: not valid java name */
    public static final k80 m137dynamicColorSchemeonzyBm0(long j, boolean z, boolean z2, x70 x70Var, x70 x70Var2, x70 x70Var3, x70 x70Var4, x70 x70Var5, vj3 vj3Var, double d, a90 a90Var, j51 j51Var, tm1 tm1Var) {
        vj3Var.getClass();
        a90Var.getClass();
        j51Var.getClass();
        return m135dynamicColorSchemeN98v4SY(j, z, z2, new x70(j), x70Var, x70Var2, x70Var3, x70Var4, x70Var5, vj3Var, d, a90Var, j51Var, tm1Var);
    }

    /* renamed from: dynamicColorScheme-onzyBm0$default, reason: not valid java name */
    public static k80 m138dynamicColorSchemeonzyBm0$default(long j, boolean z, boolean z2, x70 x70Var, x70 x70Var2, x70 x70Var3, x70 x70Var4, x70 x70Var5, vj3 vj3Var, double d, a90 a90Var, j51 j51Var, tm1 tm1Var, int i, Object obj) {
        a90 a90Var2;
        j51 j51Var2;
        tm1 tm1Var2;
        long j2;
        boolean z3;
        boolean z4 = (i & 4) != 0 ? false : z2;
        x70 x70Var6 = (i & 8) != 0 ? null : x70Var;
        x70 x70Var7 = (i & 16) != 0 ? null : x70Var2;
        x70 x70Var8 = (i & 32) != 0 ? null : x70Var3;
        x70 x70Var9 = (i & 64) != 0 ? null : x70Var4;
        x70 x70Var10 = (i & 128) != 0 ? null : x70Var5;
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
        if ((i & 4096) != 0) {
            tm1Var2 = null;
            z3 = z;
            j2 = j;
        } else {
            tm1Var2 = tm1Var;
            j2 = j;
            z3 = z;
        }
        return m137dynamicColorSchemeonzyBm0(j2, z3, z4, x70Var6, x70Var7, x70Var8, x70Var9, x70Var10, vj3Var2, a, a90Var2, j51Var2, tm1Var2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (((defpackage.go1) r33).f(r18) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0196, code lost:
    
        if (((defpackage.go1) r33).e(r11.ordinal()) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f0, code lost:
    
        if (((defpackage.go1) r33).e(r14.ordinal()) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
    
        if (((defpackage.go1) r33).e(r15.ordinal()) == false) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /* renamed from: rememberDynamicColorScheme-CdFb-wI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k80 m139rememberDynamicColorSchemeCdFbwI(long r18, boolean r20, boolean r21, defpackage.x70 r22, defpackage.x70 r23, defpackage.x70 r24, defpackage.x70 r25, defpackage.x70 r26, defpackage.vj3 r27, double r28, defpackage.a90 r30, defpackage.j51 r31, defpackage.tm1 r32, defpackage.fe0 r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.DynamicColorSchemeKt.m139rememberDynamicColorSchemeCdFbwI(long, boolean, boolean, x70, x70, x70, x70, x70, vj3, double, a90, j51, tm1, fe0, int, int, int):k80");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0219, code lost:
    
        if (((defpackage.go1) r34).e(r21.ordinal()) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (((defpackage.go1) r34).f(r18) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bf, code lost:
    
        if (((defpackage.go1) r34).e(r12.ordinal()) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fa, code lost:
    
        if (((defpackage.go1) r34).e(r15.ordinal()) == false) goto L150;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ee  */
    /* renamed from: rememberDynamicColorScheme-UQznLDA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k80 m140rememberDynamicColorSchemeUQznLDA(long r18, boolean r20, boolean r21, defpackage.x70 r22, defpackage.x70 r23, defpackage.x70 r24, defpackage.x70 r25, defpackage.x70 r26, defpackage.x70 r27, defpackage.vj3 r28, double r29, defpackage.a90 r31, defpackage.j51 r32, defpackage.tm1 r33, defpackage.fe0 r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.DynamicColorSchemeKt.m140rememberDynamicColorSchemeUQznLDA(long, boolean, boolean, x70, x70, x70, x70, x70, x70, vj3, double, a90, j51, tm1, fe0, int, int, int):k80");
    }

    public static final k80 toColorScheme(k51 k51Var, boolean z, tm1 tm1Var) {
        long q;
        k80 k80Var;
        k51Var.getClass();
        boolean z2 = k51Var.c;
        p90 p90Var = aw2.a;
        long color = (z && z2) ? x70.b : DynamicColorKt.getColor(p90Var.a(), k51Var);
        long color2 = DynamicColorKt.getColor(p90Var.b(), k51Var);
        long color3 = DynamicColorKt.getColor(p90Var.c(), k51Var);
        a51 a51Var = new a51();
        a51Var.a = "inverse_on_surface";
        byte b = 29;
        a51Var.b = new k90(b);
        byte b2 = 0;
        a51Var.f = new n90(b2);
        a51Var.h = new n90((byte) 1);
        b51 a = a51Var.a();
        a51 a51Var2 = new a51();
        a51Var2.a = "inverse_on_surface";
        byte b3 = 5;
        a51Var2.b = new f90(b3);
        a51Var2.c = new f90((byte) 6);
        byte b4 = 7;
        a51Var2.f = new f90(b4);
        a51Var2.h = new f90((byte) 8);
        long q2 = r7.q(a51Var2, a, k51Var);
        a51 a51Var3 = new a51();
        a51Var3.a = "inverse_primary";
        a51Var3.b = new k90((byte) 18);
        a51Var3.c = new k90((byte) 19);
        byte b5 = 20;
        a51Var3.f = new k90(b5);
        byte b6 = 21;
        a51Var3.h = new k90(b6);
        b51 a2 = a51Var3.a();
        a51 a51Var4 = new a51();
        a51Var4.a = "inverse_primary";
        a51Var4.b = new g90((byte) 4);
        a51Var4.c = new g90(b3);
        a51Var4.f = new g90((byte) 6);
        a51Var4.h = new g90(b4);
        long q3 = r7.q(a51Var4, a2, k51Var);
        long color4 = DynamicColorKt.getColor(p90Var.m(), k51Var);
        byte b7 = 24;
        byte b8 = 26;
        byte b9 = 25;
        byte b10 = 11;
        byte b11 = 27;
        if (z && z2) {
            q = x70.c;
        } else {
            a51 b12 = p90Var.D().b();
            b12.a = "on_background";
            b12.c = new i90(b10);
            b51 a3 = b12.a();
            a51 a51Var5 = new a51();
            a51Var5.a = "on_background";
            a51Var5.b = new e90(b7);
            a51Var5.c = new e90(b9);
            a51Var5.f = new e90(b8);
            a51Var5.h = new e90(b11);
            q = r7.q(a51Var5, a3, k51Var);
        }
        a51 a51Var6 = new a51();
        a51Var6.a = "on_error";
        a51Var6.b = new i90(b5);
        a51Var6.f = new i90(b6);
        a51Var6.h = new i90((byte) 22);
        b51 a4 = a51Var6.a();
        a51 a51Var7 = new a51();
        a51Var7.a = "on_error";
        a51Var7.b = new e90((byte) 13);
        a51Var7.c = new e90((byte) 14);
        a51Var7.f = new e90((byte) 15);
        byte b13 = 16;
        a51Var7.h = new e90(b13);
        long q4 = r7.q(a51Var7, a4, k51Var);
        a51 a51Var8 = new a51();
        a51Var8.a = "on_error_container";
        byte b14 = 9;
        a51Var8.b = new o90(b14);
        byte b15 = 10;
        a51Var8.f = new o90(b15);
        a51Var8.h = new o90(b10);
        b51 a5 = a51Var8.a();
        a51 a51Var9 = new a51();
        a51Var9.a = "on_error_container";
        a51Var9.b = new c90(b11);
        a51Var9.c = new c90((byte) 28);
        a51Var9.f = new c90(b);
        a51Var9.h = new d90(b2);
        long q5 = r7.q(a51Var9, a5, k51Var);
        a51 a51Var10 = new a51();
        a51Var10.a = "on_primary";
        a51Var10.b = new i90((byte) 7);
        a51Var10.f = new i90((byte) 8);
        a51Var10.h = new i90(b14);
        b51 a6 = a51Var10.a();
        a51 a51Var11 = new a51();
        a51Var11.a = "on_primary";
        a51Var11.b = new f90((byte) 13);
        a51Var11.c = new f90((byte) 14);
        a51Var11.f = new f90((byte) 15);
        a51Var11.h = new f90(b13);
        long q6 = r7.q(a51Var11, a6, k51Var);
        a51 a51Var12 = new a51();
        a51Var12.a = "on_primary_container";
        a51Var12.b = new g90(b9);
        a51Var12.f = new g90(b8);
        a51Var12.h = new g90(b11);
        b51 a7 = a51Var12.a();
        a51 a51Var13 = new a51();
        a51Var13.a = "on_primary_container";
        a51Var13.b = new e90(b);
        a51Var13.c = new f90(b2);
        a51Var13.f = new f90((byte) 1);
        byte b16 = 2;
        a51Var13.h = new f90(b16);
        long q7 = r7.q(a51Var13, a7, k51Var);
        a51 a51Var14 = new a51();
        a51Var14.a = "on_secondary";
        a51Var14.b = new i90((byte) 24);
        a51Var14.f = new k90((byte) 5);
        byte b17 = 8;
        a51Var14.h = new k90(b17);
        b51 a8 = a51Var14.a();
        a51 a51Var15 = new a51();
        a51Var15.a = "on_secondary";
        a51Var15.b = new g90(b17);
        a51Var15.c = new g90(b15);
        a51Var15.f = new g90((byte) 11);
        a51Var15.h = new g90((byte) 12);
        long q8 = r7.q(a51Var15, a8, k51Var);
        a51 a51Var16 = new a51();
        a51Var16.a = "on_secondary_container";
        a51Var16.b = new n90(b16);
        a51Var16.f = new n90((byte) 3);
        a51Var16.h = new n90((byte) 4);
        b51 a9 = a51Var16.a();
        a51 a51Var17 = new a51();
        a51Var17.a = "on_secondary_container";
        a51Var17.b = new g90(b2);
        a51Var17.c = new g90((byte) 1);
        a51Var17.f = new g90(b16);
        a51Var17.h = new g90((byte) 3);
        long q9 = r7.q(a51Var17, a9, k51Var);
        long color5 = (z && z2) ? x70.c : DynamicColorKt.getColor(p90Var.D(), k51Var);
        a51 a51Var18 = new a51();
        a51Var18.a = "on_surface_variant";
        a51Var18.b = new i90(b16);
        a51Var18.e = new i90((byte) 3);
        a51Var18.f = new i90((byte) 4);
        a51Var18.h = new i90((byte) 5);
        b51 a10 = a51Var18.a();
        a51 a51Var19 = new a51();
        a51Var19.a = "on_surface_variant";
        a51Var19.b = new d90((byte) 13);
        a51Var19.c = new d90((byte) 14);
        Class<h90> cls = h90.class;
        byte b18 = 22;
        byte b19 = 24;
        a51Var19.f = new n1(1, p90Var, cls, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", 0, (byte) 5);
        a51Var19.h = new d90((byte) 15);
        long q10 = r7.q(a51Var19, a10, k51Var);
        a51 a51Var20 = new a51();
        a51Var20.a = "on_tertiary";
        a51Var20.b = new g90(b18);
        a51Var20.f = new g90((byte) 23);
        a51Var20.h = new g90(b19);
        b51 a11 = a51Var20.a();
        a51 a51Var21 = new a51();
        a51Var21.a = "on_tertiary";
        a51Var21.b = new d90(b14);
        byte b20 = 10;
        a51Var21.c = new d90(b20);
        a51Var21.f = new d90((byte) 11);
        a51Var21.h = new d90((byte) 12);
        long q11 = r7.q(a51Var21, a11, k51Var);
        a51 a51Var22 = new a51();
        a51Var22.a = "on_tertiary_container";
        a51Var22.b = new n90((byte) 8);
        a51Var22.f = new n90(b14);
        a51Var22.h = new n90(b20);
        b51 a12 = a51Var22.a();
        a51 a51Var23 = new a51();
        a51Var23.a = "on_tertiary_container";
        a51Var23.b = new c90((byte) 23);
        a51Var23.c = new c90(b19);
        byte b21 = 25;
        a51Var23.f = new c90(b21);
        byte b22 = 26;
        a51Var23.h = new c90(b22);
        long q12 = r7.q(a51Var23, a12, k51Var);
        a51 a51Var24 = new a51();
        a51Var24.a = "outline";
        a51Var24.b = new o90((byte) 16);
        a51Var24.e = new o90((byte) 17);
        a51Var24.f = new o90((byte) 18);
        a51Var24.h = new o90((byte) 19);
        b51 a13 = a51Var24.a();
        a51 a51Var25 = new a51();
        a51Var25.a = "outline";
        a51Var25.b = new f90((byte) 20);
        a51Var25.c = new f90((byte) 21);
        int i = 0;
        a51Var25.f = new n1(1, p90Var, cls, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", i, (byte) 6);
        a51Var25.h = new f90(b18);
        long q13 = r7.q(a51Var25, a13, k51Var);
        a51 a51Var26 = new a51();
        a51Var26.a = "outline_variant";
        a51Var26.b = new i90((byte) 23);
        a51Var26.e = new i90(b21);
        a51Var26.f = new i90(b22);
        byte b23 = 27;
        a51Var26.h = new i90(b23);
        b51 a14 = a51Var26.a();
        a51 a51Var27 = new a51();
        a51Var27.a = "outline_variant";
        a51Var27.b = new d90(b22);
        a51Var27.c = new d90(b23);
        a51Var27.f = new n1(1, p90Var, cls, "highestSurface", "highestSurface(Lcom/materialkolor/scheme/DynamicScheme;)Lcom/materialkolor/dynamiccolor/DynamicColor;", i, (byte) 7);
        a51Var27.h = new d90((byte) 29);
        long q14 = r7.q(a51Var27, a14, k51Var);
        long color6 = DynamicColorKt.getColor(p90Var.o(), k51Var);
        long color7 = DynamicColorKt.getColor(p90Var.p(), k51Var);
        a51 a51Var28 = new a51();
        a51Var28.a = "scrim";
        a51Var28.b = new q4((byte) 16);
        a51Var28.c = new d90((byte) 28);
        long color8 = DynamicColorKt.getColor(a51Var28.a(), k51Var);
        long color9 = DynamicColorKt.getColor(p90Var.s(), k51Var);
        long color10 = DynamicColorKt.getColor(p90Var.t(), k51Var);
        long color11 = (z && z2) ? x70.b : DynamicColorKt.getColor(p90Var.G(), k51Var);
        a51 b24 = p90Var.o().b();
        b24.a = "surface_tint";
        b51 a15 = b24.a();
        a51 a51Var29 = new a51();
        a51Var29.a = "surface_tint";
        a51Var29.b = new f90((byte) 19);
        a51Var29.c = new f90((byte) 29);
        a51Var29.d = true;
        long q15 = r7.q(a51Var29, a15, k51Var);
        long color12 = DynamicColorKt.getColor(p90Var.w(), k51Var);
        long color13 = DynamicColorKt.getColor(p90Var.x(), k51Var);
        a51 a51Var30 = new a51();
        a51Var30.a = "surface_container";
        byte b25 = 18;
        a51Var30.b = new n90(b25);
        a51Var30.c = new n90((byte) 19);
        a51Var30.d = true;
        a51Var30.e = new n90((byte) 20);
        b51 a16 = a51Var30.a();
        a51 a51Var31 = new a51();
        a51Var31.a = "surface_container";
        a51Var31.b = new f90((byte) 17);
        a51Var31.c = new f90(b25);
        a51Var31.d = true;
        long q16 = r7.q(a51Var31, a16, k51Var);
        long color14 = DynamicColorKt.getColor(p90Var.H(), k51Var);
        long color15 = DynamicColorKt.getColor(p90Var.I(), k51Var);
        a51 a51Var32 = new a51();
        a51Var32.a = "surface_container_low";
        a51Var32.b = new n90((byte) 28);
        a51Var32.c = new n90((byte) 29);
        a51Var32.d = true;
        a51Var32.e = new o90((byte) 0);
        b51 a17 = a51Var32.a();
        a51 a51Var33 = new a51();
        a51Var33.a = "surface_container_low";
        a51Var33.b = new c90((byte) 10);
        a51Var33.c = new c90((byte) 11);
        a51Var33.d = true;
        long q17 = r7.q(a51Var33, a17, k51Var);
        a51 a51Var34 = new a51();
        a51Var34.a = "surface_container_lowest";
        a51Var34.b = new k90((byte) 27);
        a51Var34.c = new k90((byte) 28);
        a51Var34.d = true;
        b51 a18 = a51Var34.a();
        a51 a51Var35 = new a51();
        a51Var35.a = "surface_container_lowest";
        a51Var35.b = new e90((byte) 0);
        a51Var35.c = new e90((byte) 1);
        a51Var35.d = true;
        long q18 = r7.q(a51Var35, a18, k51Var);
        a51 b26 = p90Var.I().b();
        b26.a = "surface_variant";
        b51 a19 = b26.a();
        a51 a51Var36 = new a51();
        a51Var36.a = "surface_variant";
        a51Var36.b = new e90((byte) 28);
        a51Var36.c = new f90((byte) 9);
        a51Var36.d = true;
        long q19 = r7.q(a51Var36, a19, k51Var);
        long color16 = DynamicColorKt.getColor(p90Var.y(), k51Var);
        long color17 = DynamicColorKt.getColor(p90Var.z(), k51Var);
        long color18 = DynamicColorKt.getColor(p90Var.q(), k51Var);
        long color19 = DynamicColorKt.getColor(p90Var.r(), k51Var);
        a51 a51Var37 = new a51();
        a51Var37.a = "on_primary_fixed";
        a51Var37.b = new n90((byte) 25);
        a51Var37.f = new n90((byte) 26);
        a51Var37.h = new n90((byte) 27);
        b51 a20 = a51Var37.a();
        a51 a51Var38 = new a51();
        a51Var38.a = "on_primary_fixed";
        a51Var38.b = new d90((byte) 16);
        a51Var38.c = new d90((byte) 18);
        a51Var38.f = new d90((byte) 19);
        a51Var38.g = new d90((byte) 20);
        a51Var38.h = new d90((byte) 21);
        long q20 = r7.q(a51Var38, a20, k51Var);
        a51 a51Var39 = new a51();
        a51Var39.a = "on_primary_fixed_variant";
        a51Var39.b = new g90((byte) 28);
        a51Var39.f = new g90((byte) 29);
        a51Var39.h = new i90((byte) 0);
        b51 a21 = a51Var39.a();
        a51 a51Var40 = new a51();
        a51Var40.a = "on_primary_fixed_variant";
        a51Var40.b = new q4((byte) 28);
        a51Var40.c = new q4((byte) 29);
        a51Var40.f = new c90((byte) 0);
        a51Var40.g = new c90((byte) 1);
        a51Var40.h = new c90((byte) 2);
        long q21 = r7.q(a51Var40, a21, k51Var);
        long color20 = DynamicColorKt.getColor(p90Var.u(), k51Var);
        long color21 = DynamicColorKt.getColor(p90Var.v(), k51Var);
        a51 a51Var41 = new a51();
        a51Var41.a = "on_secondary_fixed";
        a51Var41.b = new k90((byte) 4);
        a51Var41.f = new k90((byte) 6);
        byte b27 = 7;
        a51Var41.h = new k90(b27);
        b51 a22 = a51Var41.a();
        a51 a51Var42 = new a51();
        a51Var42.a = "on_secondary_fixed";
        a51Var42.b = new e90(b27);
        a51Var42.c = new e90((byte) 9);
        a51Var42.f = new e90((byte) 10);
        a51Var42.g = new e90((byte) 11);
        a51Var42.h = new e90((byte) 12);
        long q22 = r7.q(a51Var42, a22, k51Var);
        a51 a51Var43 = new a51();
        a51Var43.a = "on_secondary_fixed_variant";
        a51Var43.b = new o90((byte) 6);
        a51Var43.f = new o90((byte) 7);
        a51Var43.h = new o90((byte) 8);
        b51 a23 = a51Var43.a();
        a51 a51Var44 = new a51();
        a51Var44.a = "on_secondary_fixed_variant";
        a51Var44.b = new q4((byte) 22);
        a51Var44.c = new q4((byte) 23);
        a51Var44.f = new q4((byte) 24);
        a51Var44.g = new q4((byte) 25);
        a51Var44.h = new q4((byte) 27);
        long q23 = r7.q(a51Var44, a23, k51Var);
        long color22 = DynamicColorKt.getColor(p90Var.A(), k51Var);
        long color23 = DynamicColorKt.getColor(p90Var.B(), k51Var);
        a51 a51Var45 = new a51();
        a51Var45.a = "on_tertiary_fixed";
        a51Var45.b = new i90((byte) 1);
        a51Var45.f = new i90((byte) 10);
        a51Var45.h = new i90((byte) 17);
        b51 a24 = a51Var45.a();
        a51 a51Var46 = new a51();
        a51Var46.a = "on_tertiary_fixed";
        a51Var46.b = new d90((byte) 3);
        a51Var46.c = new d90((byte) 4);
        a51Var46.f = new d90((byte) 5);
        a51Var46.g = new d90((byte) 7);
        a51Var46.h = new d90((byte) 8);
        long q24 = r7.q(a51Var46, a24, k51Var);
        a51 a51Var47 = new a51();
        a51Var47.a = "on_tertiary_fixed_variant";
        a51Var47.b = new k90((byte) 1);
        a51Var47.f = new k90((byte) 2);
        a51Var47.h = new k90((byte) 3);
        b51 a25 = a51Var47.a();
        a51 a51Var48 = new a51();
        a51Var48.a = "on_tertiary_fixed_variant";
        a51Var48.b = new c90((byte) 18);
        a51Var48.c = new c90((byte) 19);
        a51Var48.f = new c90((byte) 20);
        a51Var48.g = new c90((byte) 21);
        a51Var48.h = new c90((byte) 22);
        k80 k80Var2 = new k80(color6, q6, color7, q7, q3, color9, q8, color10, q9, color16, q11, color17, q12, color, q, color11, color5, q19, q10, q15, color4, q2, color2, q4, color3, q5, q13, q14, color8, color12, color13, q16, color14, color15, q17, q18, color18, color19, q20, q21, color20, color21, q22, q23, color22, color23, q24, r7.q(a51Var48, a25, k51Var));
        return (tm1Var == null || (k80Var = (k80) tm1Var.invoke(k80Var2)) == null) ? k80Var2 : k80Var;
    }

    public static /* synthetic */ k80 toColorScheme$default(k51 k51Var, boolean z, tm1 tm1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            tm1Var = null;
        }
        return toColorScheme(k51Var, z, tm1Var);
    }
}

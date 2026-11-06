package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import com.github.mytv.dv.model.Author;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class sp0 {
    public static volatile Boolean a;
    public static volatile Boolean b;
    public static hx1 c;
    public static hx1 d;
    public static hx1 e;
    public static hx1 f;

    public static void A(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static int B(long j) {
        int i = (int) j;
        q(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static final nj1 C(Context context) {
        return new nj1(new yc(context, (byte) 0), new zc(Build.VERSION.SDK_INT >= 31 ? rk1.a.a(context) : 0));
    }

    public static final long D(long j, float f2) {
        return rf1.a(V(j) / f2, W(j) / f2);
    }

    public static final float E(long j, long j2) {
        return (W(j2) * W(j)) + (V(j2) * V(j));
    }

    public static final void F(yd ydVar, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z, boolean z2) {
        double d9;
        double d10;
        double d11 = d6;
        double d12 = (d8 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double d13 = ((d3 * sin) + (d2 * cos)) / d11;
        double d14 = ((d3 * cos) + ((-d2) * sin)) / d7;
        double d15 = ((d5 * sin) + (d4 * cos)) / d11;
        double d16 = ((d5 * cos) + ((-d4) * sin)) / d7;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d14 + d16) / 2.0d;
        double d21 = (d18 * d18) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d21) / 1.99999d);
            F(ydVar, d2, d3, d4, d5, d11 * sqrt, d7 * sqrt, d8, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d22);
        double d23 = d17 * sqrt2;
        double d24 = sqrt2 * d18;
        if (z == z2) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double atan2 = Math.atan2(d14 - d10, d13 - d9);
        double atan22 = Math.atan2(d16 - d10, d15 - d9) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d25 = d9 * d11;
        double d26 = d10 * d7;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d12);
        double sin2 = Math.sin(d12);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d29 = -d11;
        double d30 = d29 * cos2;
        double d31 = d7 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        double d34 = d7 * cos2;
        double d35 = (cos3 * d34) + (sin3 * d33);
        double d36 = atan22 / ceil;
        double d37 = atan2;
        double d38 = d32;
        int i = 0;
        double d39 = d35;
        double d40 = d3;
        while (i < ceil) {
            double d41 = d37 + d36;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            int i2 = ceil;
            double d42 = (((d11 * cos2) * cos4) + d27) - (d31 * sin4);
            double d43 = (d34 * sin4) + (d11 * sin2 * cos4) + d28;
            double d44 = (d30 * sin4) - (d31 * cos4);
            double d45 = (cos4 * d34) + (sin4 * d33);
            double d46 = d41 - d37;
            double tan = Math.tan(d46 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            ydVar.a.cubicTo((float) ((d38 * sqrt3) + d2), (float) ((d39 * sqrt3) + d40), (float) (d42 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d42, (float) d43);
            d36 = d36;
            sin2 = sin2;
            d27 = d27;
            d2 = d42;
            i++;
            d33 = d33;
            d37 = d41;
            d39 = d45;
            d38 = d44;
            ceil = i2;
            d40 = d43;
            d11 = d6;
        }
    }

    public static final long G(long j) {
        long j2 = (j << 1) + 1;
        t41.J.getClass();
        int i = v41.a;
        return j2;
    }

    public static final long H(long j) {
        jp jpVar = t41.J;
        long j2 = j << 1;
        int i = v41.a;
        return j2;
    }

    public static final za1 I(Enum[] enumArr) {
        enumArr.getClass();
        return new za1(enumArr);
    }

    public static i73 J(k73 k73Var) {
        Iterator it = qj4.x(k73Var, new do2((byte) 16)).iterator();
        if (!it.hasNext()) {
            s83.l("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (i73) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.zf1 r7, defpackage.fj0 r8) {
        /*
            ep r0 = defpackage.p70.x
            boolean r1 = r8 instanceof defpackage.ug1
            if (r1 == 0) goto L15
            r1 = r8
            ug1 r1 = (defpackage.ug1) r1
            int r2 = r1.L
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.L = r2
            goto L1a
        L15:
            ug1 r1 = new ug1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.K
            int r2 = r1.L
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            id r7 = r1.J
            r24 r2 = r1.I
            defpackage.mu0.V(r8)     // Catch: defpackage.f1 -> L2c
            goto L61
        L2c:
            r8 = move-exception
            goto L57
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r7)
            return r3
        L34:
            defpackage.mu0.V(r8)
            r24 r2 = new r24
            r2.<init>()
            r2.I = r0
            id r8 = new id
            r5 = 2
            r8.<init>(r2, r5)
            r1.I = r2     // Catch: defpackage.f1 -> L53
            r1.J = r8     // Catch: defpackage.f1 -> L53
            r1.L = r4     // Catch: defpackage.f1 -> L53
            java.lang.Object r7 = r7.collect(r8, r1)     // Catch: defpackage.f1 -> L53
            el0 r8 = defpackage.el0.I
            if (r7 != r8) goto L61
            return r8
        L53:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L57:
            defpackage.e41.y(r8, r7)
            tk0 r7 = r1.getContext()
            defpackage.vt0.p(r7)
        L61:
            java.lang.Object r7 = r2.I
            if (r7 == r0) goto L66
            return r7
        L66:
            java.lang.String r7 = "Expected at least one element"
            defpackage.s83.l(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp0.K(zf1, fj0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(defpackage.zf1 r5, defpackage.hn1 r6, defpackage.fj0 r7) {
        /*
            ep r0 = defpackage.p70.x
            boolean r1 = r7 instanceof defpackage.vg1
            if (r1 == 0) goto L15
            r1 = r7
            vg1 r1 = (defpackage.vg1) r1
            int r2 = r1.L
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.L = r2
            goto L1a
        L15:
            vg1 r1 = new vg1
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.K
            int r2 = r1.L
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            jy0 r5 = r1.J
            r24 r6 = r1.I
            defpackage.mu0.V(r7)     // Catch: defpackage.f1 -> L2c
            goto L62
        L2c:
            r7 = move-exception
            goto L58
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.zy.i(r5)
            return r3
        L34:
            defpackage.mu0.V(r7)
            r24 r7 = new r24
            r7.<init>()
            r7.I = r0
            jy0 r2 = new jy0
            r2.<init>(r6, r7)
            r1.I = r7     // Catch: defpackage.f1 -> L54
            r1.J = r2     // Catch: defpackage.f1 -> L54
            r1.L = r4     // Catch: defpackage.f1 -> L54
            java.lang.Object r5 = r5.collect(r2, r1)     // Catch: defpackage.f1 -> L54
            el0 r6 = defpackage.el0.I
            if (r5 != r6) goto L52
            return r6
        L52:
            r6 = r7
            goto L62
        L54:
            r5 = move-exception
            r6 = r7
            r7 = r5
            r5 = r2
        L58:
            defpackage.e41.y(r7, r5)
            tk0 r5 = r1.getContext()
            defpackage.vt0.p(r5)
        L62:
            java.lang.Object r5 = r6.I
            if (r5 == r0) goto L67
            return r5
        L67:
            java.lang.String r5 = "Expected at least one element matching the predicate"
            defpackage.s83.l(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp0.L(zf1, hn1, fj0):java.lang.Object");
    }

    public static int M(byte b2, byte b3, byte b4, byte b5) {
        return (b2 << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static final float N(long j) {
        return (float) Math.sqrt((W(j) * W(j)) + (V(j) * V(j)));
    }

    public static final hx1 O() {
        hx1 hx1Var = c;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(12.0f, 21.35f);
        epVar.y(-1.45f, -1.32f);
        epVar.q(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        epVar.q(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        epVar.r(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        epVar.q(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        epVar.q(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        epVar.r(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        epVar.x(12.0f, 21.35f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        c = b2;
        return b2;
    }

    public static final hx1 P() {
        hx1 hx1Var = d;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Group", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep r = r7.r(16.0f, 11.0f);
        r.r(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        r.C(17.66f, 5.0f, 16.0f, 5.0f);
        r.r(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        r.D(1.34f, 3.0f, 3.0f, 3.0f);
        r.p();
        r.z(8.0f, 11.0f);
        r.r(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        r.C(9.66f, 5.0f, 8.0f, 5.0f);
        r.q(6.34f, 5.0f, 5.0f, 6.34f, 5.0f, 8.0f);
        r.D(1.34f, 3.0f, 3.0f, 3.0f);
        r.p();
        r.z(8.0f, 13.0f);
        r.r(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        r.x(1.0f, 19.0f);
        r.v(14.0f);
        r.M(-2.5f);
        r.r(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        r.p();
        r.z(16.0f, 13.0f);
        r.r(-0.29f, 0.0f, -0.62f, 0.02f, -0.97f, 0.05f);
        r.r(1.16f, 0.84f, 1.97f, 1.97f, 1.97f, 3.45f);
        r.x(17.0f, 19.0f);
        r.v(6.0f);
        r.M(-2.5f);
        r.r(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        r.p();
        gx1.a(gx1Var, (ArrayList) r.J, rt4Var);
        hx1 b2 = gx1Var.b();
        d = b2;
        return b2;
    }

    public static final hx1 Q() {
        hx1 hx1Var = e;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Outlined.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(12.0f, 5.69f);
        epVar.y(5.0f, 4.5f);
        epVar.L(18.0f);
        epVar.v(-2.0f);
        epVar.M(-6.0f);
        epVar.u(9.0f);
        epVar.M(6.0f);
        epVar.u(7.0f);
        epVar.M(-7.81f);
        epVar.y(5.0f, -4.5f);
        epVar.z(12.0f, 3.0f);
        epVar.x(2.0f, 12.0f);
        epVar.v(3.0f);
        epVar.M(8.0f);
        epVar.v(6.0f);
        epVar.M(-6.0f);
        epVar.v(2.0f);
        epVar.M(6.0f);
        epVar.v(6.0f);
        epVar.M(-8.0f);
        epVar.v(3.0f);
        epVar.x(12.0f, 3.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        e = b2;
        return b2;
    }

    public static final int R(Bundle bundle, String str) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Log.LOG_LEVEL_OFF) != Integer.MAX_VALUE) {
            return i;
        }
        jl2.W(str);
        throw null;
    }

    public static final int S(zi3 zi3Var) {
        return (int) (zi3Var.e == pg3.I ? zi3Var.g() & 4294967295L : zi3Var.g() >> 32);
    }

    public static final hx1 T() {
        hx1 hx1Var = f;
        if (hx1Var != null) {
            return hx1Var;
        }
        gx1 gx1Var = new gx1("Filled.Movie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = th5.a;
        rt4 rt4Var = new rt4(x70.b);
        ep epVar = new ep((byte) 13);
        epVar.z(18.0f, 4.0f);
        epVar.y(2.0f, 4.0f);
        epVar.v(-3.0f);
        epVar.y(-2.0f, -4.0f);
        epVar.v(-2.0f);
        epVar.y(2.0f, 4.0f);
        epVar.v(-3.0f);
        epVar.y(-2.0f, -4.0f);
        epVar.u(8.0f);
        epVar.y(2.0f, 4.0f);
        epVar.u(7.0f);
        epVar.x(5.0f, 4.0f);
        epVar.u(4.0f);
        epVar.r(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        epVar.x(2.0f, 18.0f);
        epVar.r(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        epVar.v(16.0f);
        epVar.r(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        epVar.L(4.0f);
        epVar.v(-4.0f);
        epVar.p();
        gx1.a(gx1Var, (ArrayList) epVar.J, rt4Var);
        hx1 b2 = gx1Var.b();
        f = b2;
        return b2;
    }

    public static final int U(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                s83.t("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final float V(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float W(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean X(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final boolean Y(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final da Z(hn1 hn1Var, tm1 tm1Var) {
        y1 y1Var = new y1(hn1Var, (byte) 7);
        p70.A(1, tm1Var);
        return new da((Object) y1Var, (Object) tm1Var, (byte) 10);
    }

    public static final long a0(long j, long j2) {
        return rf1.a(V(j) - V(j2), W(j) - W(j2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dc, code lost:
    
        if (r5 == r27.length()) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e4, code lost:
    
        if (r27.charAt(r5) != 'S') goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e6, code lost:
    
        r2 = (r14 * androidx.media3.common.C.NANOS_PER_SECOND) + r15;
        r14 = r9;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f4, code lost:
    
        switch(r8.ordinal()) {
            case 0: goto L137;
            case 1: goto L136;
            case 2: goto L135;
            case 3: goto L134;
            case 4: goto L133;
            case 5: goto L132;
            case 6: goto L131;
            default: goto L130;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f7, code lost:
    
        defpackage.zy.h(r8, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x022e, code lost:
    
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ff, code lost:
    
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0228, code lost:
    
        r2 = defpackage.mw2.Q(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0205, code lost:
    
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020b, code lost:
    
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0211, code lost:
    
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0217, code lost:
    
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x021d, code lost:
    
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0223, code lost:
    
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017a A[LOOP:5: B:78:0x0178->B:79:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b7 A[LOOP:7: B:90:0x01b5->B:91:0x01b7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long b0(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp0.b0(java.lang.String):long");
    }

    public static final void c(hu2 hu2Var, final boolean z, nd5 nd5Var, final tc0 tc0Var, fe0 fe0Var, int i) {
        nd5 nd5Var2;
        String str;
        t43 t43Var;
        boolean z2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-416300285);
        int i2 = i | (go1Var.i(hu2Var) ? 4 : 2) | (go1Var.h(z) ? 32 : 16) | (go1Var.e(nd5Var.ordinal()) ? 256 : 128);
        if (go1Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            wm4 wm4Var = hu2Var.h;
            gx3 gx3Var = hu2Var.p;
            final t43 g = wi4.g(wm4Var.z, go1Var);
            final t43 g2 = wi4.g(wm4Var.B, go1Var);
            final t43 g3 = wi4.g(wm4Var.D, go1Var);
            t43 g4 = wi4.g(wm4Var.F, go1Var);
            t43 g5 = wi4.g(wm4Var.H, go1Var);
            p04 p04Var = gx3Var.f;
            t43 f2 = wi4.f(p04Var, p04Var.getValue(), go1Var, 0, 0);
            t43 g6 = wi4.g(hu2Var.d.d, go1Var);
            p04 p04Var2 = gx3Var.w;
            t43 f3 = wi4.f(p04Var2, p04Var2.getValue(), go1Var, 0, 0);
            final Context context = (Context) go1Var.k(rb.b);
            Author author = (Author) f2.getValue();
            if (author != null) {
                str = (String) o70.U0(author.getAvatarThumb().getUrlList());
                if (str == null && (str = (String) o70.U0(author.getAvatarMedium().getUrlList())) == null) {
                    str = (String) o70.U0(author.getAvatarLarger().getUrlList());
                }
            } else {
                str = null;
            }
            Object Q = go1Var.Q();
            jp jpVar = de0.a;
            if (Q == jpVar) {
                Q = Integer.valueOf(wm4Var.b.a.getInt("global_seed_argb", 0));
                go1Var.o0(Q);
            }
            int intValue = ((Number) Q).intValue();
            if (((t80) g.getValue()) == t80.K) {
                t43Var = f3;
                z2 = true;
            } else {
                t43Var = f3;
                z2 = false;
            }
            boolean z3 = (jx4.L((String) g6.getValue()) || ((Boolean) t43Var.getValue()).booleanValue()) ? false : true;
            boolean i3 = go1Var.i(wm4Var);
            Object Q2 = go1Var.Q();
            if (i3 || Q2 == jpVar) {
                Q2 = new n1(1, wm4Var, wm4.class, "saveGlobalSeedArgb", "saveGlobalSeedArgb(I)V", 0, (byte) 20);
                go1Var.o0(Q2);
            }
            final x70 b2 = xh0.b(str, z2, z3, intValue, (tm1) ((v72) Q2), go1Var, 3072, 0);
            boolean g7 = go1Var.g(context);
            Object Q3 = go1Var.Q();
            if (g7 || Q3 == jpVar) {
                context.getClass();
                Q3 = Build.VERSION.SDK_INT >= 31 ? new x70(qb.i(context.getColor(R.color.system_accent1_500))) : null;
                go1Var.o0(Q3);
            }
            x70 x70Var = (x70) Q3;
            int ordinal = ((t80) g.getValue()).ordinal();
            if (ordinal == 0) {
                x70Var = b2;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    s83.v();
                    return;
                }
                x70Var = null;
            }
            final long j = x70Var != null ? x70Var.a : xh0.a;
            final r80 r80Var = new r80((t80) g.getValue(), (s90) g2.getValue(), (z70) g3.getValue(), ((Boolean) g4.getValue()).booleanValue(), (v90) g5.getValue());
            boolean g8 = go1Var.g(context);
            Object Q4 = go1Var.Q();
            if (g8 || Q4 == jpVar) {
                Q4 = e21.p(context);
                go1Var.o0(Q4);
            }
            final Activity activity = (Activity) Q4;
            nd5Var2 = nd5Var;
            cw0.a(nd5Var2, p70.u0(-2024491165, new hn1() { // from class: qt2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4;
                    Activity activity2 = activity;
                    final Context context2 = context;
                    final x70 x70Var2 = b2;
                    final boolean z5 = z;
                    final long j2 = j;
                    final r80 r80Var2 = r80Var;
                    final t43 t43Var2 = g;
                    final t43 t43Var3 = g2;
                    final t43 t43Var4 = g3;
                    final tc0 tc0Var2 = tc0Var;
                    fe0 fe0Var2 = (fe0) obj;
                    int intValue2 = ((Integer) obj2).intValue();
                    boolean z6 = false;
                    go1 go1Var2 = (go1) fe0Var2;
                    if (go1Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                        if (activity2 != null) {
                            context2.getClass();
                            Boolean bool = sp0.a;
                            if (bool != null) {
                                z4 = bool.booleanValue();
                            } else {
                                z4 = (context2.getResources().getConfiguration().uiMode & 15) == 4 || context2.getPackageManager().hasSystemFeature("android.software.leanback");
                                sp0.a = Boolean.valueOf(z4);
                            }
                            if (!z4) {
                                z6 = true;
                            }
                        }
                        dj1.a(activity2, z6, p70.u0(821476686, new hn1() { // from class: st2
                            @Override // defpackage.hn1
                            public final Object invoke(Object obj3, Object obj4) {
                                jp jpVar2;
                                k80 k80Var;
                                fe0 fe0Var3 = (fe0) obj3;
                                int intValue3 = ((Integer) obj4).intValue();
                                go1 go1Var3 = (go1) fe0Var3;
                                if (go1Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    t43 t43Var5 = t43Var2;
                                    t80 t80Var = (t80) t43Var5.getValue();
                                    t43 t43Var6 = t43Var3;
                                    s90 s90Var = (s90) t43Var6.getValue();
                                    t43 t43Var7 = t43Var4;
                                    z70 z70Var = (z70) t43Var7.getValue();
                                    Context context3 = context2;
                                    boolean e2 = go1Var3.e(t80Var.ordinal()) | go1Var3.g(context3) | go1Var3.e(s90Var.ordinal()) | go1Var3.e(z70Var.ordinal());
                                    x70 x70Var3 = x70Var2;
                                    boolean g9 = e2 | go1Var3.g(x70Var3);
                                    boolean z7 = z5;
                                    boolean h = g9 | go1Var3.h(z7);
                                    Object Q5 = go1Var3.Q();
                                    jp jpVar3 = de0.a;
                                    if (h || Q5 == jpVar3) {
                                        jpVar2 = jpVar3;
                                        Q5 = c74.a(context3, (t80) t43Var5.getValue(), (s90) t43Var6.getValue(), (z70) t43Var7.getValue(), x70Var3, z7);
                                        go1Var3.o0(Q5);
                                    } else {
                                        jpVar2 = jpVar3;
                                    }
                                    k80 k80Var2 = (k80) Q5;
                                    if (z7) {
                                        go1Var3.d0(-111306063);
                                        go1Var3.q(false);
                                        k80Var = k80Var2;
                                    } else {
                                        go1Var3.d0(-111259749);
                                        boolean g10 = go1Var3.g(context3) | go1Var3.e(((t80) t43Var5.getValue()).ordinal()) | go1Var3.e(((s90) t43Var6.getValue()).ordinal()) | go1Var3.e(((z70) t43Var7.getValue()).ordinal()) | go1Var3.g(x70Var3);
                                        Object Q6 = go1Var3.Q();
                                        if (g10 || Q6 == jpVar2) {
                                            Q6 = c74.a(context3, (t80) t43Var5.getValue(), (s90) t43Var6.getValue(), (z70) t43Var7.getValue(), x70Var3, true);
                                            go1Var3.o0(Q6);
                                        }
                                        k80Var = (k80) Q6;
                                        go1Var3.q(false);
                                    }
                                    mw2.c(new ay3[]{xh0.b.a(new x70(j2)), xh0.c.a(r80Var2), xh0.d.a(Boolean.valueOf(z7)), xh0.e.a(k80Var)}, p70.u0(-1253420914, new bj1(k80Var2, tc0Var2, (byte) 13), go1Var3), go1Var3, 48);
                                } else {
                                    go1Var3.W();
                                }
                                return wd5.a;
                            }
                        }, go1Var2), go1Var2, RendererCapabilities.DECODER_SUPPORT_MASK);
                    } else {
                        go1Var2.W();
                    }
                    return wd5.a;
                }
            }, go1Var), go1Var, ((i2 >> 6) & 14) | 48);
        } else {
            nd5Var2 = nd5Var;
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new g30(hu2Var, z, nd5Var2, tc0Var, i, (byte) 2);
        }
    }

    public static final long c0(long j, long j2) {
        return rf1.a(V(j2) + V(j), W(j2) + W(j));
    }

    public static z62 d(tm1 tm1Var) {
        h62 h62Var = i62.d;
        h62Var.getClass();
        l62 l62Var = new l62();
        n62 n62Var = h62Var.a;
        l62Var.a = n62Var.a;
        boolean z = n62Var.d;
        l62Var.b = n62Var.b;
        l62Var.c = n62Var.c;
        String str = n62Var.e;
        l62Var.d = n62Var.f;
        String str2 = n62Var.g;
        j60 j60Var = n62Var.i;
        boolean z2 = n62Var.h;
        o63 o63Var = h62Var.b;
        boolean z3 = n62Var.j;
        tm1Var.invoke(l62Var);
        if (!str.equals("    ")) {
            s83.t("Indent should not be specified when default printing mode is used");
            return null;
        }
        n62 n62Var2 = new n62(l62Var.a, l62Var.b, l62Var.c, z, str, l62Var.d, str2, z2, j60Var, z3);
        o63Var.getClass();
        return new z62(n62Var2, o63Var);
    }

    public static int d0(long j) {
        if (j > 2147483647L) {
            return Log.LOG_LEVEL_OFF;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final void e(me2 me2Var, Object obj, int i, Object obj2, fe0 fe0Var, int i2) {
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(1439843069);
        int i3 = (go1Var.g(me2Var) ? 4 : 2) | i2 | (go1Var.g(obj) ? 32 : 16) | (go1Var.e(i) ? 256 : 128) | (go1Var.g(obj2) ? 2048 : 1024);
        if (go1Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            ((g94) obj).b(obj2, p70.u0(980966366, new qc0(i, me2Var, obj2), go1Var), go1Var, 48);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new pc0(me2Var, obj, i, obj2, i2);
        }
    }

    public static final m12 e0(InputStream inputStream) {
        inputStream.getClass();
        return new m12(inputStream, new u75());
    }

    public static final void f(final String str, fe0 fe0Var, final int i) {
        int i2;
        go1 go1Var = (go1) fe0Var;
        go1Var.f0(-1650474218);
        if ((i & 6) == 0) {
            i2 = i | (go1Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (go1Var.T(i2 & 1, (i2 & 3) != 2)) {
            i51 i51Var = lw2.b;
            k80 k80Var = ((fw2) go1Var.k(i51Var)).a;
            u74 a2 = t74.a(new kp(12.0f, true, new y9()), q8.T, go1Var, 54);
            int Q = i82.Q(go1Var.T);
            am3 m = go1Var.m();
            i13 i13Var = i13.a;
            l13 x0 = i42.x0(go1Var, i13Var);
            xd0.c.getClass();
            go1Var.h0();
            boolean z = go1Var.S;
            df0 df0Var = wa2.A0;
            if (z) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var, sgVar3, valueOf);
            qi4.j(go1Var);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var, sgVar4, x0);
            l13 k = nq4.k(i13Var, 44.0f);
            jp jpVar = dw2.a;
            l13 p = mw2.p(o7.m(k, rt0.L(jp.m(), go1Var)), k80Var.l, mw2.j);
            uw2 c2 = px.c(q8.N, false);
            int Q2 = i82.Q(go1Var.T);
            am3 m2 = go1Var.m();
            l13 x02 = i42.x0(go1Var, p);
            go1Var.h0();
            if (go1Var.S) {
                go1Var.l(df0Var);
            } else {
                go1Var.r0();
            }
            qi4.k(go1Var, sgVar, c2);
            qi4.k(go1Var, sgVar2, m2);
            r7.G(Q2, go1Var, sgVar3, go1Var);
            qi4.k(go1Var, sgVar4, x02);
            ow1.a(eg5.p(), null, nq4.k(i13Var, 24.0f), k80Var.m, go1Var, 432);
            go1Var.q(true);
            r55.b(str, null, k80Var.q, 0L, qk1.P, 0L, null, 0L, 0, false, 0, 0, ((fw2) go1Var.k(i51Var)).b.g, go1Var, (i2 & 14) | 1572864, 0, 131002);
            go1Var = go1Var;
            go1Var.q(true);
        } else {
            go1Var.W();
        }
        x04 u = go1Var.u();
        if (u != null) {
            u.d = new hn1() { // from class: rt2
                @Override // defpackage.hn1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int X = mu0.X(i | 1);
                    sp0.f(str, (fe0) obj, X);
                    return wd5.a;
                }
            };
        }
    }

    public static final long f0(long j, float f2) {
        return rf1.a(V(j) * f2, W(j) * f2);
    }

    public static final void g(l13 l13Var, fe0 fe0Var, int i) {
        go1 go1Var;
        go1 go1Var2;
        k80 k80Var;
        go1 go1Var3 = (go1) fe0Var;
        go1Var3.f0(-1545037018);
        byte b2 = 2;
        int i2 = (go1Var3.g(l13Var) ? 4 : 2) | i;
        byte b3 = 0;
        byte b4 = 1;
        if (go1Var3.T(i2 & 1, (i2 & 3) != 2)) {
            t43 g = wi4.g(lf5.c, go1Var3);
            boolean g2 = go1Var3.g(g);
            Object Q = go1Var3.Q();
            Object obj = de0.a;
            if (g2 || Q == obj) {
                Q = dt4.b(new tt2(g, b3));
                go1Var3.o0(Q);
            }
            if (!((Boolean) ((cw4) Q).getValue()).booleanValue()) {
                x04 u = go1Var3.u();
                if (u != null) {
                    u.d = new wo2(l13Var, i, b2);
                    return;
                }
                return;
            }
            k80 k80Var2 = ((fw2) go1Var3.k(lw2.b)).a;
            boolean g3 = go1Var3.g(g);
            Object Q2 = go1Var3.Q();
            if (g3 || Q2 == obj) {
                Q2 = dt4.b(new tt2(g, b4));
                go1Var3.o0(Q2);
            }
            cw4 cw4Var = (cw4) Q2;
            Object obj2 = qb.L((Configuration) go1Var3.k(rb.a)).a.get(0);
            if (obj2 == null) {
                obj2 = Locale.getDefault();
            }
            boolean g4 = go1Var3.g(g) | go1Var3.g(obj2);
            Object Q3 = go1Var3.Q();
            if (g4 || Q3 == obj) {
                Q3 = dt4.b(new jt2(g, obj2, b2));
                go1Var3.o0(Q3);
            }
            cw4 cw4Var2 = (cw4) Q3;
            l13 C0 = i42.C0(mw2.p(fb4.U(nq4.o(i42.C0(l13Var, 32.0f), 320.0f, 480.0f), 12.0f, c5.Q()), c5.K(go1Var3), c5.Q()), 24.0f);
            kp kpVar = new kp(16.0f, true, new y9());
            tv tvVar = q8.V;
            ba0 a2 = z90.a(kpVar, tvVar, go1Var3, 6);
            int Q4 = i82.Q(go1Var3.T);
            am3 m = go1Var3.m();
            l13 x0 = i42.x0(go1Var3, C0);
            xd0.c.getClass();
            go1Var3.h0();
            boolean z = go1Var3.S;
            rm1 rm1Var = wa2.A0;
            if (z) {
                go1Var3.l(rm1Var);
            } else {
                go1Var3.r0();
            }
            sg sgVar = q8.c0;
            qi4.k(go1Var3, sgVar, a2);
            sg sgVar2 = q8.b0;
            qi4.k(go1Var3, sgVar2, m);
            Integer valueOf = Integer.valueOf(Q4);
            sg sgVar3 = q8.d0;
            qi4.k(go1Var3, sgVar3, valueOf);
            qi4.j(go1Var3);
            sg sgVar4 = q8.a0;
            qi4.k(go1Var3, sgVar4, x0);
            f("正在下载更新", go1Var3, 6);
            ba0 a3 = z90.a(new kp(8.0f, true, new y9()), tvVar, go1Var3, 6);
            int Q5 = i82.Q(go1Var3.T);
            am3 m2 = go1Var3.m();
            i13 i13Var = i13.a;
            l13 x02 = i42.x0(go1Var3, i13Var);
            go1Var3.h0();
            if (go1Var3.S) {
                go1Var3.l(rm1Var);
            } else {
                go1Var3.r0();
            }
            qi4.k(go1Var3, sgVar, a3);
            qi4.k(go1Var3, sgVar2, m2);
            r7.G(Q5, go1Var3, sgVar3, go1Var3);
            qi4.k(go1Var3, sgVar4, x02);
            if (((Boolean) cw4Var.getValue()).booleanValue()) {
                go1Var3.d0(854204822);
                boolean g5 = go1Var3.g(g);
                Object Q6 = go1Var3.Q();
                if (g5 || Q6 == obj) {
                    Q6 = new tt2(g, (byte) 2);
                    go1Var3.o0(Q6);
                }
                go1Var2 = go1Var3;
                k80Var = k80Var2;
                xs5.a((rm1) Q6, nq4.e(i13Var, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, go1Var2, 48, 0, 2044);
                go1Var2.q(false);
            } else {
                go1Var2 = go1Var3;
                k80Var = k80Var2;
                go1Var2.d0(854415529);
                xs5.b(nq4.e(i13Var, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, 0.0f, 0.0f, go1Var3, 6);
                go1Var2.q(false);
            }
            go1 go1Var4 = go1Var2;
            r55.b((String) cw4Var2.getValue(), null, k80Var.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, xc3.b(), go1Var4, 0, 0, 131066);
            go1Var = go1Var4;
            go1Var.q(true);
            go1Var.q(true);
        } else {
            go1Var = go1Var3;
            go1Var.W();
        }
        x04 u2 = go1Var.u();
        if (u2 != null) {
            u2.d = new wo2(l13Var, i, (byte) 3);
        }
    }

    public static final Rect g0(v22 v22Var) {
        return new Rect(v22Var.a, v22Var.b, v22Var.c, v22Var.d);
    }

    public static final long h(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : ut0.s(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if (-4611686018427387903L < j2 && j2 < 4611686018427387903L) {
            return j;
        }
        if ((j2 ^ j) >= 0) {
            return j;
        }
        return 9223372036854759646L;
    }

    public static final Rect h0(m14 m14Var) {
        return new Rect((int) m14Var.a, (int) m14Var.b, (int) m14Var.c, (int) m14Var.d);
    }

    public static float i(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = (((((f4 * f7) + ((f3 * f6) + (f2 * f5))) - (f5 * f6)) - (f3 * f4)) - (f2 * f7)) * 0.5f;
        return f8 < 0.0f ? -f8 : f8;
    }

    public static final RectF i0(m14 m14Var) {
        return new RectF(m14Var.a, m14Var.b, m14Var.c, m14Var.d);
    }

    public static List j(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new q42(0, iArr.length, iArr);
    }

    public static int[] j0(Collection collection) {
        if (collection instanceof q42) {
            q42 q42Var = (q42) collection;
            return Arrays.copyOfRange(q42Var.I, q42Var.J, q42Var.K);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void k(qr5 qr5Var, da daVar, li2 li2Var) {
        daVar.getClass();
        li2Var.getClass();
        o94 o94Var = (o94) qr5Var.n("androidx.lifecycle.savedstate.vm.tag");
        if (o94Var == null || o94Var.K) {
            return;
        }
        o94Var.g(daVar, li2Var);
        ki2 ki2Var = ((xi2) li2Var).i;
        if (ki2Var == ki2.J || ki2Var.compareTo(ki2.L) >= 0) {
            daVar.v();
        } else {
            li2Var.a(new nh2(daVar, li2Var));
        }
    }

    public static byte[] k0(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static String l(int i, int i2, String str) {
        if (i < 0) {
            return li4.h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return li4.h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        s83.t(hf1.u(i2, "negative size: "));
        return null;
    }

    public static final m14 l0(Rect rect) {
        return new m14(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static void m(int i, String str, boolean z) {
        if (z) {
            return;
        }
        s83.t(li4.h(str, Integer.valueOf(i)));
    }

    public static final m14 m0(RectF rectF) {
        return new m14(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static void n(String str, int i, int i2, boolean z) {
        if (z) {
            return;
        }
        s83.t(li4.h(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static final long n0(int i, x41 x41Var) {
        if (x41Var.compareTo(x41.SECONDS) > 0) {
            return o0(i, x41Var);
        }
        return H(TimeUnit.NANOSECONDS.convert(i, x41Var.I));
    }

    public static void o(boolean z) {
        if (z) {
            return;
        }
        s83.d();
    }

    public static final long o0(long j, x41 x41Var) {
        TimeUnit timeUnit = x41Var.I;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return H(timeUnit2.convert(j, timeUnit));
        }
        if (x41Var.compareTo(x41.MILLISECONDS) < 0) {
            return G(ut0.s(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j);
        if (j < C.TIME_UNSET) {
            j = -9223372036854775807L;
        }
        return G(sv2.s(Math.abs(j), x41Var) * signum);
    }

    public static void p(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static final void p0(List list, yd ydVar) {
        Path path;
        int i;
        float f2;
        int i2;
        jl3 jl3Var;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        List list2 = list;
        yd ydVar2 = ydVar;
        Path path2 = ydVar2.a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        ydVar2.e();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        jl3 jl3Var2 = list2.isEmpty() ? rk3.c : (jl3) list2.get(0);
        int size = list2.size();
        float f13 = 0.0f;
        int i3 = 0;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i3 < size) {
            jl3 jl3Var3 = (jl3) list2.get(i3);
            if (jl3Var3 instanceof rk3) {
                path2.close();
                path = path2;
                i = size;
                f2 = f13;
                i2 = i3;
                jl3Var = jl3Var3;
                f14 = f18;
                f16 = f14;
                f15 = f19;
                f17 = f15;
            } else {
                if (jl3Var3 instanceof dl3) {
                    dl3 dl3Var = (dl3) jl3Var3;
                    float f20 = dl3Var.c;
                    f16 += f20;
                    float f21 = dl3Var.d;
                    f17 += f21;
                    path2.rMoveTo(f20, f21);
                    path = path2;
                    i = size;
                    f2 = f13;
                    i2 = i3;
                    f18 = f16;
                    f19 = f17;
                } else {
                    if (jl3Var3 instanceof vk3) {
                        vk3 vk3Var = (vk3) jl3Var3;
                        float f22 = vk3Var.c;
                        float f23 = vk3Var.d;
                        path2.moveTo(f22, f23);
                        path = path2;
                        f17 = f23;
                        f19 = f17;
                        f16 = f22;
                        f18 = f16;
                    } else {
                        if (jl3Var3 instanceof cl3) {
                            cl3 cl3Var = (cl3) jl3Var3;
                            float f24 = cl3Var.d;
                            float f25 = cl3Var.c;
                            path2.rLineTo(f25, f24);
                            f16 += f25;
                            f17 += f24;
                        } else if (jl3Var3 instanceof uk3) {
                            uk3 uk3Var = (uk3) jl3Var3;
                            float f26 = uk3Var.d;
                            float f27 = uk3Var.c;
                            ydVar2.b(f27, f26);
                            path = path2;
                            f16 = f27;
                            f17 = f26;
                        } else if (jl3Var3 instanceof bl3) {
                            float f28 = ((bl3) jl3Var3).c;
                            path2.rLineTo(f28, f13);
                            f16 += f28;
                        } else if (jl3Var3 instanceof tk3) {
                            float f29 = ((tk3) jl3Var3).c;
                            ydVar2.b(f29, f17);
                            path = path2;
                            f16 = f29;
                        } else if (jl3Var3 instanceof hl3) {
                            float f30 = ((hl3) jl3Var3).c;
                            path2.rLineTo(f13, f30);
                            f17 += f30;
                        } else if (jl3Var3 instanceof il3) {
                            float f31 = ((il3) jl3Var3).c;
                            ydVar2.b(f16, f31);
                            path = path2;
                            f17 = f31;
                        } else {
                            if (jl3Var3 instanceof al3) {
                                al3 al3Var = (al3) jl3Var3;
                                path2.rCubicTo(al3Var.c, al3Var.d, al3Var.e, al3Var.f, al3Var.g, al3Var.h);
                                f5 = al3Var.e + f16;
                                f6 = al3Var.f + f17;
                                f16 += al3Var.g;
                                f12 = al3Var.h;
                            } else {
                                if (jl3Var3 instanceof sk3) {
                                    sk3 sk3Var = (sk3) jl3Var3;
                                    path2.cubicTo(sk3Var.c, sk3Var.d, sk3Var.e, sk3Var.f, sk3Var.g, sk3Var.h);
                                    f5 = sk3Var.e;
                                    f7 = sk3Var.f;
                                    f8 = sk3Var.g;
                                    f9 = sk3Var.h;
                                } else if (jl3Var3 instanceof fl3) {
                                    if (jl3Var2.a) {
                                        f10 = f16 - f14;
                                        f11 = f17 - f15;
                                    } else {
                                        f10 = f13;
                                        f11 = f10;
                                    }
                                    fl3 fl3Var = (fl3) jl3Var3;
                                    path2.rCubicTo(f10, f11, fl3Var.c, fl3Var.d, fl3Var.e, fl3Var.f);
                                    f5 = fl3Var.c + f16;
                                    f6 = fl3Var.d + f17;
                                    f16 += fl3Var.e;
                                    f12 = fl3Var.f;
                                } else if (jl3Var3 instanceof xk3) {
                                    if (jl3Var2.a) {
                                        f16 = (f16 * 2.0f) - f14;
                                        f17 = (2.0f * f17) - f15;
                                    }
                                    xk3 xk3Var = (xk3) jl3Var3;
                                    path2.cubicTo(f16, f17, xk3Var.c, xk3Var.d, xk3Var.e, xk3Var.f);
                                    f5 = xk3Var.c;
                                    f7 = xk3Var.d;
                                    f8 = xk3Var.e;
                                    f9 = xk3Var.f;
                                } else if (jl3Var3 instanceof el3) {
                                    el3 el3Var = (el3) jl3Var3;
                                    float f32 = el3Var.f;
                                    float f33 = el3Var.e;
                                    float f34 = el3Var.d;
                                    float f35 = el3Var.c;
                                    path2.rQuadTo(f35, f34, f33, f32);
                                    float f36 = f35 + f16;
                                    float f37 = f34 + f17;
                                    f16 += f33;
                                    f17 += f32;
                                    path = path2;
                                    f14 = f36;
                                    f15 = f37;
                                } else if (jl3Var3 instanceof wk3) {
                                    wk3 wk3Var = (wk3) jl3Var3;
                                    float f38 = wk3Var.f;
                                    float f39 = wk3Var.e;
                                    float f40 = wk3Var.d;
                                    f5 = wk3Var.c;
                                    path2.quadTo(f5, f40, f39, f38);
                                    path = path2;
                                    f17 = f38;
                                    f16 = f39;
                                    f15 = f40;
                                    i = size;
                                    f2 = f13;
                                    i2 = i3;
                                    jl3Var = jl3Var3;
                                    f14 = f5;
                                } else if (jl3Var3 instanceof gl3) {
                                    if (jl3Var2.b) {
                                        f3 = f16 - f14;
                                        f4 = f17 - f15;
                                    } else {
                                        f3 = f13;
                                        f4 = f3;
                                    }
                                    gl3 gl3Var = (gl3) jl3Var3;
                                    float f41 = gl3Var.d;
                                    float f42 = gl3Var.c;
                                    path2.rQuadTo(f3, f4, f42, f41);
                                    f5 = f3 + f16;
                                    f6 = f4 + f17;
                                    f16 += f42;
                                    f17 += f41;
                                    path = path2;
                                    f15 = f6;
                                    i = size;
                                    f2 = f13;
                                    i2 = i3;
                                    jl3Var = jl3Var3;
                                    f14 = f5;
                                } else if (jl3Var3 instanceof yk3) {
                                    if (jl3Var2.b) {
                                        f16 = (f16 * 2.0f) - f14;
                                        f17 = (2.0f * f17) - f15;
                                    }
                                    yk3 yk3Var = (yk3) jl3Var3;
                                    float f43 = yk3Var.d;
                                    float f44 = yk3Var.c;
                                    path2.quadTo(f16, f17, f44, f43);
                                    path = path2;
                                    i = size;
                                    f2 = f13;
                                    i2 = i3;
                                    f15 = f17;
                                    jl3Var = jl3Var3;
                                    f17 = f43;
                                    f14 = f16;
                                    f16 = f44;
                                } else if (jl3Var3 instanceof zk3) {
                                    zk3 zk3Var = (zk3) jl3Var3;
                                    float f45 = zk3Var.h + f16;
                                    float f46 = zk3Var.i + f17;
                                    i = size;
                                    f2 = 0.0f;
                                    path = path2;
                                    i2 = i3;
                                    F(ydVar, f16, f17, f45, f46, zk3Var.c, zk3Var.d, zk3Var.e, zk3Var.f, zk3Var.g);
                                    f14 = f45;
                                    f16 = f14;
                                    f15 = f46;
                                    f17 = f15;
                                    jl3Var = jl3Var3;
                                } else {
                                    path = path2;
                                    i = size;
                                    f2 = f13;
                                    i2 = i3;
                                    if (!(jl3Var3 instanceof qk3)) {
                                        s83.v();
                                        return;
                                    }
                                    qk3 qk3Var = (qk3) jl3Var3;
                                    float f47 = qk3Var.i;
                                    float f48 = qk3Var.h;
                                    jl3Var = jl3Var3;
                                    F(ydVar, f16, f17, f48, f47, qk3Var.c, qk3Var.d, qk3Var.e, qk3Var.f, qk3Var.g);
                                    f15 = f47;
                                    f17 = f15;
                                    f14 = f48;
                                    f16 = f14;
                                }
                                path = path2;
                                f16 = f8;
                                f17 = f9;
                                i = size;
                                f2 = f13;
                                i2 = i3;
                                jl3Var = jl3Var3;
                                f15 = f7;
                                f14 = f5;
                            }
                            f17 += f12;
                            path = path2;
                            f15 = f6;
                            i = size;
                            f2 = f13;
                            i2 = i3;
                            jl3Var = jl3Var3;
                            f14 = f5;
                        }
                        path = path2;
                    }
                    i = size;
                    f2 = f13;
                    i2 = i3;
                }
                jl3Var = jl3Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            ydVar2 = ydVar;
            size = i;
            path2 = path;
            jl3Var2 = jl3Var;
            f13 = f2;
        }
    }

    public static void q(boolean z, String str, long j) {
        if (z) {
            return;
        }
        s83.t(li4.h(str, Long.valueOf(j)));
    }

    public static Integer q0(String str) {
        Long r0 = jl2.r0(str);
        if (r0 == null || r0.longValue() != r0.intValue()) {
            return null;
        }
        return Integer.valueOf(r0.intValue());
    }

    public static void r(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        s83.t(li4.h(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static final void r0(na2 na2Var, tm1 tm1Var) {
        na3 na3Var;
        if (na2Var.getNode().isAttached() && (na3Var = ut0.S(na2Var, 2).d0) != null) {
            na3Var.k1(tm1Var, true);
        }
    }

    public static void s(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        s83.t(li4.h(str, obj));
    }

    public static void t(boolean z, String str, Object obj, Comparable comparable) {
        if (z) {
            return;
        }
        s83.t(li4.h(str, obj, comparable));
    }

    public static void u(int i, int i2) {
        String h;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                h = li4.h("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    s83.t(hf1.u(i2, "negative size: "));
                    return;
                }
                h = li4.h("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(h);
        }
    }

    public static void v(Object obj) {
        obj.getClass();
    }

    public static void w(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void x(int i, int i2) {
        if (i < 0 || i > i2) {
            zy.o(l(i, i2, "index"));
        }
    }

    public static void y(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? l(i, i3, "start index") : (i2 < 0 || i2 > i3) ? l(i2, i3, "end index") : li4.h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void z(boolean z) {
        if (z) {
            return;
        }
        s83.r();
    }
}

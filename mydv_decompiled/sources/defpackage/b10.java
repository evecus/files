package defpackage;

import android.graphics.Color;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b10 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public /* synthetic */ b10(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public static b10 a(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        b(i, hs5.k, fArr, fArr2);
        return new b10(fArr2[0], fArr2[1], fArr[0], fArr[4], fArr[5], fArr[6]);
    }

    public static void b(int i, hs5 hs5Var, float[] fArr, float[] fArr2) {
        float p = wx5.p(Color.red(i));
        float p2 = wx5.p(Color.green(i));
        float p3 = wx5.p(Color.blue(i));
        float[][] fArr3 = wx5.e;
        float[] fArr4 = fArr3[0];
        float f = (fArr4[2] * p3) + (fArr4[1] * p2) + (fArr4[0] * p);
        fArr2[0] = f;
        float[] fArr5 = fArr3[1];
        float f2 = (fArr5[2] * p3) + (fArr5[1] * p2) + (fArr5[0] * p);
        fArr2[1] = f2;
        float[] fArr6 = fArr3[2];
        float f3 = (p3 * fArr6[2]) + (p2 * fArr6[1]) + (p * fArr6[0]);
        fArr2[2] = f3;
        float[][] fArr7 = wx5.b;
        float[] fArr8 = fArr7[0];
        float f4 = (fArr8[2] * f3) + (fArr8[1] * f2) + (fArr8[0] * f);
        float[] fArr9 = fArr7[1];
        float f5 = (fArr9[2] * f3) + (fArr9[1] * f2) + (fArr9[0] * f);
        float[] fArr10 = fArr7[2];
        float f6 = (f3 * fArr10[2]) + (f2 * fArr10[1]) + (f * fArr10[0]);
        float[] fArr11 = hs5Var.g;
        float f7 = hs5Var.i;
        float f8 = hs5Var.d;
        float f9 = hs5Var.a;
        float f10 = fArr11[0] * f4;
        float f11 = fArr11[1] * f5;
        float f12 = fArr11[2] * f6;
        float f13 = hs5Var.h;
        float pow = (float) Math.pow((Math.abs(f10) * f13) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * hs5Var.b) / f9, hs5Var.j * f8)) * 100.0f;
        float sqrt = (4.0f / f8) * ((float) Math.sqrt(pow4 / 100.0f)) * (f9 + 4.0f) * f7;
        float sqrt2 = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, hs5Var.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? atan2 + 360.0f : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * hs5Var.e) * hs5Var.c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float f20 = sqrt2 * f7;
        float sqrt3 = ((float) Math.sqrt((r0 * f8) / r10)) * 50.0f;
        float f21 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * f20) + 1.0f)) * 43.85965f;
        double d2 = f19;
        float cos = ((float) Math.cos(d2)) * log;
        float sin = log * ((float) Math.sin(d2));
        fArr2[0] = atan2;
        fArr2[1] = sqrt2;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = sqrt;
            fArr[2] = f20;
            fArr[3] = sqrt3;
            fArr[4] = f21;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    public static b10 c(float f, float f2, float f3) {
        hs5 hs5Var = hs5.k;
        float f4 = hs5Var.d;
        Math.sqrt(f / 100.0d);
        float f5 = hs5Var.a + 4.0f;
        float f6 = hs5Var.i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * hs5Var.d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new b10(f3, f2, f, f7, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public static int d(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        hs5 hs5Var = hs5.k;
        float f10 = f2;
        if (f10 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
            return wx5.n(f3);
        }
        float f11 = 0.0f;
        float min = f < 0.0f ? 0.0f : Math.min(360.0f, f);
        float f12 = 0.0f;
        boolean z = true;
        b10 b10Var = null;
        float f13 = f10;
        while (Math.abs(f12 - f10) >= 0.4f) {
            float f14 = 100.0f;
            float f15 = 1000.0f;
            float f16 = f11;
            float f17 = 1000.0f;
            b10 b10Var2 = null;
            while (true) {
                if (Math.abs(f16 - f14) <= 0.01f) {
                    f4 = min;
                    f5 = f10;
                    f6 = f11;
                    f7 = f13;
                    f8 = 2.0f;
                    break;
                }
                float f18 = ((f14 - f16) / 2.0f) + f16;
                f6 = f11;
                int f19 = c(f18, f13, min).f(hs5.k);
                float o = wx5.o(f19);
                float abs = Math.abs(f3 - o);
                if (abs < 0.2f) {
                    b10 a = a(f19);
                    f8 = 2.0f;
                    f5 = f10;
                    b10 c = c(a.c, a.b, min);
                    f4 = min;
                    float f20 = a.d - c.d;
                    float f21 = a.e - c.e;
                    float f22 = a.f - c.f;
                    double sqrt = Math.sqrt((f22 * f22) + (f21 * f21) + (f20 * f20));
                    f9 = o;
                    f7 = f13;
                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                    if (pow <= 1.0f) {
                        f17 = pow;
                        b10Var2 = a;
                        f15 = abs;
                    }
                } else {
                    f4 = min;
                    f5 = f10;
                    f9 = o;
                    f7 = f13;
                    f8 = 2.0f;
                }
                if (f15 == f6 && f17 == f6) {
                    break;
                }
                if (f9 < f3) {
                    f16 = f18;
                } else {
                    f14 = f18;
                }
                f13 = f7;
                f11 = f6;
                f10 = f5;
                min = f4;
            }
            if (!z) {
                if (b10Var2 == null) {
                    f10 = f7;
                } else {
                    f12 = f7;
                    b10Var = b10Var2;
                    f10 = f5;
                }
                f13 = ((f10 - f12) / f8) + f12;
                f11 = f6;
            } else {
                if (b10Var2 != null) {
                    return b10Var2.f(hs5Var);
                }
                f13 = ((f5 - f12) / f8) + f12;
                z = false;
                f11 = f6;
                f10 = f5;
            }
            min = f4;
        }
        return b10Var == null ? wx5.n(f3) : b10Var.f(hs5Var);
    }

    public int e(bm1 bm1Var) {
        float f = this.b;
        float sqrt = (f == 0.0f || this.c == 0.0f) ? 0.0f : f / ((float) Math.sqrt(r3 / 100.0f));
        float f2 = bm1Var.a;
        float f3 = bm1Var.h;
        float pow = sqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, f2), 0.7300000190734863d)), 1.1111111640930176d));
        float f4 = (this.a * 3.1415927f) / 180.0f;
        float cos = (((float) Math.cos(2.0f + f4)) + 3.8f) * 0.25f;
        float pow2 = bm1Var.b * ((float) Math.pow(r3 / 100.0f, (1.0f / bm1Var.e) / bm1Var.j));
        float f5 = cos * 3846.1538f * bm1Var.f * bm1Var.d;
        float f6 = pow2 / bm1Var.c;
        double d = f4;
        float sin = (float) Math.sin(d);
        float cos2 = (float) Math.cos(d);
        float f7 = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f5 * 23.0f)));
        float f8 = cos2 * f7;
        float f9 = f7 * sin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = 100.0f / f3;
        float signum = Math.signum(f11) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f11) * 27.13f) / (400.0f - Math.abs(f11))), 2.3809523582458496d));
        float signum2 = Math.signum(f12) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f12) * 27.13f) / (400.0f - Math.abs(f12))), 2.3809523582458496d));
        float signum3 = Math.signum(((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f) * f13 * ((float) Math.pow(Math.max(0.0f, (Math.abs(r6) * 27.13f) / (400.0f - Math.abs(r6))), 2.3809523582458496d));
        float[] fArr = bm1Var.g;
        float f14 = signum / fArr[0];
        float f15 = signum2 / fArr[1];
        float f16 = signum3 / fArr[2];
        float[][] fArr2 = j16.p;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return w90.a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }

    public int f(hs5 hs5Var) {
        float f;
        float f2 = this.b;
        double d = f2;
        float f3 = this.c;
        if (d != 0.0d) {
            double d2 = f3;
            if (d2 != 0.0d) {
                f = f2 / ((float) Math.sqrt(d2 / 100.0d));
                float f4 = hs5Var.f;
                float f5 = hs5Var.h;
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f4), 0.73d), 1.1111111111111112d);
                double d3 = (this.a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
                float pow2 = hs5Var.a * ((float) Math.pow(f3 / 100.0d, (1.0d / hs5Var.d) / hs5Var.j));
                float f6 = cos * 3846.1538f * hs5Var.e * hs5Var.c;
                float f7 = pow2 / hs5Var.b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f6 * 23.0f)));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
                float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
                float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
                float f15 = 100.0f / f5;
                float signum = Math.signum(f12) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
                float signum2 = Math.signum(f13) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
                float signum3 = Math.signum(f14) * f15 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
                float[] fArr = hs5Var.g;
                float f16 = signum / fArr[0];
                float f17 = signum2 / fArr[1];
                float f18 = signum3 / fArr[2];
                float[][] fArr2 = wx5.c;
                float[] fArr3 = fArr2[0];
                float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
                float[] fArr4 = fArr2[1];
                float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
                float[] fArr5 = fArr2[2];
                return w90.a(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
            }
        }
        f = 0.0f;
        float f42 = hs5Var.f;
        float f52 = hs5Var.h;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, f42), 0.73d), 1.1111111111111112d);
        double d32 = (this.a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f;
        float pow22 = hs5Var.a * ((float) Math.pow(f3 / 100.0d, (1.0d / hs5Var.d) / hs5Var.j));
        float f62 = cos3 * 3846.1538f * hs5Var.e * hs5Var.c;
        float f72 = pow22 / hs5Var.b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f82 = (((0.305f + f72) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f62 * 23.0f)));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = ((288.0f * f102) + ((451.0f * f92) + f112)) / 1403.0f;
        float f132 = ((f112 - (891.0f * f92)) - (261.0f * f102)) / 1403.0f;
        float f142 = ((f112 - (f92 * 220.0f)) - (f102 * 6300.0f)) / 1403.0f;
        float f152 = 100.0f / f52;
        float signum4 = Math.signum(f122) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f122) * 27.13d) / (400.0d - Math.abs(f122))), 2.380952380952381d));
        float signum22 = Math.signum(f132) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f132) * 27.13d) / (400.0d - Math.abs(f132))), 2.380952380952381d));
        float signum32 = Math.signum(f142) * f152 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142))), 2.380952380952381d));
        float[] fArr6 = hs5Var.g;
        float f162 = signum4 / fArr6[0];
        float f172 = signum22 / fArr6[1];
        float f182 = signum32 / fArr6[2];
        float[][] fArr22 = wx5.c;
        float[] fArr32 = fArr22[0];
        float f192 = (fArr32[2] * f182) + (fArr32[1] * f172) + (fArr32[0] * f162);
        float[] fArr42 = fArr22[1];
        float f202 = (fArr42[2] * f182) + (fArr42[1] * f172) + (fArr42[0] * f162);
        float[] fArr52 = fArr22[2];
        return w90.a(f192, f202, (f182 * fArr52[2]) + (f172 * fArr52[1]) + (f162 * fArr52[0]));
    }
}

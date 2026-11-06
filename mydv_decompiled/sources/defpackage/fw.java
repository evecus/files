package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fw {
    public static final fw a = new fw();

    public static int a(int i, int i2, double d) {
        int i3;
        int i4;
        a10 y = j42.y(i);
        a10 y2 = j42.y(i2);
        double d2 = 1.0d - d;
        double d3 = (y2.c * d) + (y.c * d2);
        double d4 = (y2.d * d) + (y.d * d2);
        double d5 = (y2.e * d) + (d2 * y.e);
        gs5 gs5Var = gs5.k;
        gs5Var.getClass();
        double d6 = gs5Var.b;
        double d7 = gs5Var.e;
        double expm1 = Math.expm1(Math.hypot(d4, d5) * 0.0228d) / 0.0228d;
        double d8 = gs5Var.i;
        double d9 = expm1 / d8;
        double atan2 = Math.atan2(d5, d4) * 57.29577951308232d;
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        double d10 = d3 / (1.0d - ((d3 - 100.0d) * 0.007d));
        double d11 = d10 / 100.0d;
        Math.sqrt(d11);
        Math.sqrt(((d9 / Math.sqrt(d11)) * d7) / (d6 + 4.0d));
        double d12 = atan2 * 0.017453292519943295d;
        Math.log1p(d8 * d9 * 0.0228d);
        Math.cos(d12);
        Math.sin(d12);
        double d13 = gs5Var.h;
        double pow = Math.pow(((d9 == 0.0d || d10 == 0.0d) ? 0.0d : d9 / Math.sqrt(d11)) / Math.pow(1.64d - Math.pow(0.29d, gs5Var.a), 0.73d), 1.1111111111111112d);
        double cos = (Math.cos(d12 + 2.0d) + 3.8d) * 0.25d;
        double pow2 = Math.pow(d11, (1.0d / d7) / gs5Var.j) * d6;
        double d14 = cos * 3846.153846153846d * gs5Var.f * gs5Var.d;
        double d15 = pow2 / gs5Var.c;
        double sin = Math.sin(d12);
        double cos2 = Math.cos(d12);
        double d16 = (((0.305d + d15) * 23.0d) * pow) / (((pow * 108.0d) * sin) + (((11.0d * pow) * cos2) + (d14 * 23.0d)));
        double d17 = cos2 * d16;
        double d18 = d16 * sin;
        double d19 = d15 * 460.0d;
        double d20 = ((288.0d * d18) + ((451.0d * d17) + d19)) / 1403.0d;
        double p = r7.p(d18, 261.0d, d19 - (891.0d * d17), 1403.0d);
        double p2 = r7.p(d18, 6300.0d, d19 - (d17 * 220.0d), 1403.0d);
        double max = Math.max(0.0d, (Math.abs(d20) * 27.13d) / (400.0d - Math.abs(d20)));
        if (d20 < 0.0d) {
            i3 = 1;
            i4 = -1;
        } else if (d20 == 0.0d) {
            i4 = 0;
            i3 = 1;
        } else {
            i3 = 1;
            i4 = 1;
        }
        double d21 = 100.0d / d13;
        double pow3 = Math.pow(max, 2.380952380952381d) * i4 * d21;
        double pow4 = Math.pow(Math.max(0.0d, (Math.abs(p) * 27.13d) / (400.0d - Math.abs(p))), 2.380952380952381d) * (p < 0.0d ? -1 : p == 0.0d ? 0 : i3) * d21;
        double pow5 = Math.pow(Math.max(0.0d, (Math.abs(p2) * 27.13d) / (400.0d - Math.abs(p2))), 2.380952380952381d) * d21 * (p2 < 0.0d ? -1 : p2 == 0.0d ? 0 : i3);
        double[] dArr = gs5Var.g;
        double d22 = pow3 / dArr[0];
        double d23 = pow4 / dArr[i3];
        double d24 = pow5 / dArr[2];
        double[][] dArr2 = a10.g;
        double[] dArr3 = dArr2[0];
        double d25 = (dArr3[2] * d24) + (dArr3[i3] * d23) + (dArr3[0] * d22);
        double[] dArr4 = dArr2[i3];
        double d26 = (dArr4[2] * d24) + (dArr4[i3] * d23) + (dArr4[0] * d22);
        double[] dArr5 = dArr2[2];
        return p70.t(d25, d26, (d24 * dArr5[2]) + (d23 * dArr5[i3]) + (d22 * dArr5[0]));
    }
}

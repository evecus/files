package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ps2 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;
    public double r;

    public ps2(int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        double[] dArr;
        double[] dArr2;
        double d = i;
        if (d == 48000.0d) {
            c = 4;
            dArr = new double[]{1.53512485958697d, -2.69169618940638d, 1.19839281085285d, -1.69065929318241d, 0.73248077421585d};
            c2 = 3;
            c3 = 2;
            c4 = 1;
            c5 = 0;
        } else {
            c = 4;
            double d2 = 9424.77796076938d / d;
            c2 = 3;
            c3 = 2;
            c4 = 1;
            c5 = 0;
            double pow = Math.pow(10.0d, 0.1d);
            double sin = Math.sin(d2);
            double cos = Math.cos(d2);
            double sqrt = Math.sqrt(pow) * 2.0d * (sin / 1.4142135623730951d);
            double d3 = pow + 1.0d;
            double d4 = pow - 1.0d;
            double d5 = d4 * cos;
            double d6 = d3 + d5;
            double d7 = (d6 + sqrt) * pow;
            double d8 = cos * d3;
            double d9 = (d4 + d8) * pow * (-2.0d);
            double d10 = (d6 - sqrt) * pow;
            double d11 = d3 - d5;
            double d12 = d11 + sqrt;
            dArr = new double[]{d7 / d12, d9 / d12, d10 / d12, ((d4 - d8) * 2.0d) / d12, (d11 - sqrt) / d12};
        }
        this.a = dArr[c5];
        this.b = dArr[c4];
        this.c = dArr[c3];
        this.d = dArr[c2];
        this.e = dArr[c];
        if (d == 48000.0d) {
            dArr2 = new double[]{1.0d, -2.0d, 1.0d, -1.99004745483398d, 0.99007225036621d};
        } else {
            double d13 = 238.76104167282426d / d;
            double sin2 = Math.sin(d13);
            double cos2 = Math.cos(d13);
            double d14 = sin2 / 1.0d;
            double d15 = cos2 + 1.0d;
            double d16 = d14 + 1.0d;
            double d17 = (d15 / 2.0d) / d16;
            double d18 = (1.0d - d14) / d16;
            dArr2 = new double[5];
            dArr2[c5] = d17;
            dArr2[c4] = (-d15) / d16;
            dArr2[c3] = d17;
            dArr2[c2] = (cos2 * (-2.0d)) / d16;
            dArr2[c] = d18;
        }
        this.f = dArr2[c5];
        this.g = dArr2[c4];
        this.h = dArr2[c3];
        this.i = dArr2[c2];
        this.j = dArr2[c];
    }
}

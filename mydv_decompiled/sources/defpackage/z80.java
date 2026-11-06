package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class z80 {
    public static final float[] a;
    public static final float[] b;
    public static final q95 c;
    public static final q95 d;
    public static final v54 e;
    public static final v54 f;
    public static final v54 g;
    public static final v54 h;
    public static final v54 i;
    public static final v54 j;
    public static final v54 k;
    public static final v54 l;
    public static final v54 m;
    public static final v54 n;
    public static final v54 o;
    public static final v54 p;
    public static final v54 q;
    public static final v54 r;
    public static final q92 s;
    public static final q92 t;
    public static final v54 u;
    public static final v54 v;
    public static final v54 w;
    public static final xd3 x;
    public static final v80[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        q95 q95Var = new q95(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        q95 q95Var2 = new q95(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        q95 q95Var3 = new q95(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = q95Var3;
        q95 q95Var4 = new q95(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = q95Var4;
        it5 it5Var = j42.l;
        v54 v54Var = new v54("sRGB IEC61966-2.1", fArr, it5Var, q95Var, 0);
        e = v54Var;
        v54 v54Var2 = new v54("sRGB IEC61966-2.1 (Linear)", fArr, it5Var, 1.0d, 0.0f, 1.0f, 1);
        f = v54Var2;
        v54 v54Var3 = new v54("scRGB-nl IEC 61966-2-2:2003", fArr, it5Var, null, new zy((byte) 6), new zy((byte) 7), -0.799f, 2.399f, q95Var, 2);
        g = v54Var3;
        v54 v54Var4 = new v54("scRGB IEC 61966-2-2:2003", fArr, it5Var, 1.0d, -0.5f, 7.499f, 3);
        h = v54Var4;
        v54 v54Var5 = new v54("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, it5Var, new q95(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = v54Var5;
        v54 v54Var6 = new v54("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, it5Var, new q95(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = v54Var6;
        v54 v54Var7 = new v54("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new it5(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = v54Var7;
        v54 v54Var8 = new v54("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, it5Var, q95Var, 7);
        l = v54Var8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        v54 v54Var9 = new v54("NTSC (1953)", fArr2, j42.i, new q95(d4, d5, d6, d2, d3), 8);
        m = v54Var9;
        v54 v54Var10 = new v54("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, it5Var, new q95(d4, d5, d6, d2, d3), 9);
        n = v54Var10;
        v54 v54Var11 = new v54("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, it5Var, 2.2d, 0.0f, 1.0f, 10);
        o = v54Var11;
        v54 v54Var12 = new v54("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j42.j, new q95(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = v54Var12;
        it5 it5Var2 = j42.k;
        v54 v54Var13 = new v54("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, it5Var2, 1.0d, -65504.0f, 65504.0f, 12);
        q = v54Var13;
        v54 v54Var14 = new v54("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, it5Var2, 1.0d, -65504.0f, 65504.0f, 13);
        r = v54Var14;
        q92 q92Var = new q92("Generic XYZ", 12884901889L, 14, (byte) 1);
        s = q92Var;
        q92 q92Var2 = new q92("Generic L*a*b*", 12884901890L, 15, (byte) 0);
        t = q92Var2;
        v54 v54Var15 = new v54("None", fArr, it5Var, q95Var2, 16);
        u = v54Var15;
        v54 v54Var16 = new v54("Hybrid Log Gamma encoding", fArr3, it5Var, null, new zy((byte) 8), new zy((byte) 9), 0.0f, 1.0f, q95Var3, 17);
        v = v54Var16;
        v54 v54Var17 = new v54("Perceptual Quantizer encoding", fArr3, it5Var, null, new zy((byte) 10), new zy((byte) 11), 0.0f, 1.0f, q95Var4, 18);
        w = v54Var17;
        xd3 xd3Var = new xd3(19, "Oklab", 12884901890L);
        x = xd3Var;
        y = new v80[]{v54Var, v54Var2, v54Var3, v54Var4, v54Var5, v54Var6, v54Var7, v54Var8, v54Var9, v54Var10, v54Var11, v54Var12, v54Var13, v54Var14, q92Var, q92Var2, v54Var15, v54Var16, v54Var17, xd3Var};
    }

    public static double a(q95 q95Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = q95Var.b;
        double d6 = q95Var.c;
        double d7 = q95Var.d;
        double d8 = q95Var.e;
        double d9 = q95Var.f;
        double d10 = d5 * d4;
        return (q95Var.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(q95 q95Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / q95Var.b;
        double d5 = 1.0d / q95Var.c;
        double d6 = 1.0d / q95Var.d;
        double d7 = q95Var.e;
        double d8 = q95Var.f;
        double d9 = (d2 * d3) / (q95Var.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(q95 q95Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = q95Var.b;
        double d6 = q95Var.d;
        double pow = (Math.pow(d4, d6) * q95Var.c) + d5;
        return Math.pow((pow >= 0.0d ? pow : 0.0d) / ((Math.pow(d4, d6) * q95Var.f) + q95Var.e), q95Var.g) * d3;
    }

    public static double d(q95 q95Var, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -q95Var.b;
        double d6 = q95Var.e;
        double d7 = 1.0d / q95Var.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-q95Var.f)) + q95Var.c), 1.0d / q95Var.d) * d3;
    }
}

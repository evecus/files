package defpackage;

import androidx.media3.extractor.ts.TsExtractor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class jk1 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile cu4 b = new cu4(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new kk1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, new kk1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new kk1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new kk1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new kk1(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        s02.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static ik1 a(float f) {
        float c2;
        ik1 ik1Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        cu4 cu4Var = b;
        int i = (int) (f * 100.0f);
        cu4Var.getClass();
        ik1 ik1Var2 = (ik1) qb.y(cu4Var, i);
        if (ik1Var2 != null) {
            return ik1Var2;
        }
        cu4 cu4Var2 = b;
        if (cu4Var2.I) {
            qb.H(cu4Var2);
        }
        int g = o7.g(cu4Var2.L, i, cu4Var2.J);
        if (g >= 0) {
            return (ik1) b.f(g);
        }
        int i2 = -(g + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            kk1 kk1Var = new kk1(new float[]{1.0f}, new float[]{f});
            b(f, kk1Var);
            return kk1Var;
        }
        if (i3 < 0) {
            ik1Var = new kk1(fArr, fArr);
            c2 = 1.0f;
        } else {
            c2 = b.c(i3) / 100.0f;
            ik1Var = (ik1) b.f(i3);
        }
        float u = lq2.u(0.0f, 1.0f, c2, b.c(i2) / 100.0f, f);
        ik1 ik1Var3 = (ik1) b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            fArr2[i4] = lq2.S(ik1Var.b(f2), ik1Var3.b(f2), u);
        }
        kk1 kk1Var2 = new kk1(fArr, fArr2);
        b(f, kk1Var2);
        return kk1Var2;
    }

    public static void b(float f, kk1 kk1Var) {
        synchronized (c) {
            cu4 clone = b.clone();
            clone.d((int) (f * 100.0f), kk1Var);
            b = clone;
        }
    }
}

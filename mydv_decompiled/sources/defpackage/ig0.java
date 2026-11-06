package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ig0 extends jg0 {
    public final v54 e;
    public final v54 f;
    public final float[] g;

    public ig0(v54 v54Var, v54 v54Var2) {
        super(v54Var2, v54Var, v54Var2, null);
        float[] y0;
        this.e = v54Var;
        this.f = v54Var2;
        float[] fArr = z7.c.b;
        it5 it5Var = v54Var.d;
        float[] fArr2 = v54Var.i;
        it5 it5Var2 = v54Var2.d;
        float[] fArr3 = v54Var2.j;
        if (i42.j0(it5Var, it5Var2)) {
            y0 = i42.y0(fArr3, fArr2);
        } else {
            float[] a = it5Var.a();
            float[] a2 = it5Var2.a();
            it5 it5Var3 = j42.j;
            y0 = i42.y0(i42.j0(it5Var2, it5Var3) ? fArr3 : i42.t0(i42.y0(i42.f0(fArr, a2, new float[]{0.964212f, 1.0f, 0.825188f}), v54Var2.i)), i42.j0(it5Var, it5Var3) ? fArr2 : i42.y0(i42.f0(fArr, a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = y0;
    }

    @Override // defpackage.jg0
    public final long a(long j) {
        float h = x70.h(j);
        float g = x70.g(j);
        float e = x70.e(j);
        float d = x70.d(j);
        r54 r54Var = this.e.p;
        float b = (float) r54Var.b(h);
        float b2 = (float) r54Var.b(g);
        float b3 = (float) r54Var.b(e);
        float[] fArr = this.g;
        float f = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f2 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        float f3 = (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
        v54 v54Var = this.f;
        r54 r54Var2 = v54Var.m;
        return qb.h((float) r54Var2.b(f), (float) r54Var2.b(f2), (float) r54Var2.b(f3), d, v54Var);
    }
}

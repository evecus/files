package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fs2 implements iu0 {
    public boolean I;
    public long J = 9223372034707292159L;
    public long K = 0;
    public final /* synthetic */ hs2 L;

    public fs2(hs2 hs2Var) {
        this.L = hs2Var;
    }

    @Override // defpackage.iu0
    public final long B(float f) {
        return hf1.g(H(f), this);
    }

    @Override // defpackage.iu0
    public final float F(int i) {
        return i / this.L.getDensity();
    }

    @Override // defpackage.iu0
    public final float H(float f) {
        return f / this.L.getDensity();
    }

    @Override // defpackage.iu0
    public final float L() {
        return this.L.L();
    }

    @Override // defpackage.iu0
    public final float P(float f) {
        return this.L.getDensity() * f;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ int X(float f) {
        return r7.b(f, this);
    }

    public final void a(gv1 gv1Var, float f) {
        hs2 hs2Var = this.L;
        c8 c8Var = hs2Var.Y;
        if (c8Var == null) {
            c8Var = new c8();
            hs2Var.Y = c8Var;
        }
        int f1 = dq.f1((gv1[]) c8Var.c, gv1Var);
        if (f1 >= 0) {
            float[] fArr = (float[]) c8Var.d;
            if (fArr[f1] != f) {
                fArr[f1] = f;
                ((byte[]) c8Var.e)[f1] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c8Var.e;
                if (bArr[f1] == 2) {
                    bArr[f1] = 0;
                    return;
                }
                return;
            }
        }
        int i = c8Var.b;
        gv1[] gv1VarArr = (gv1[]) c8Var.c;
        if (i == gv1VarArr.length) {
            int i2 = i * 2;
            c8Var.c = (gv1[]) Arrays.copyOf(gv1VarArr, i2);
            c8Var.d = Arrays.copyOf((float[]) c8Var.d, i2);
            c8Var.e = Arrays.copyOf((byte[]) c8Var.e, i2);
        }
        ((gv1[]) c8Var.c)[i] = gv1Var;
        ((byte[]) c8Var.e)[i] = 3;
        ((float[]) c8Var.d)[i] = f;
        c8Var.b++;
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long c0(long j) {
        return r7.e(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float f0(long j) {
        return r7.d(j, this);
    }

    @Override // defpackage.iu0
    public final float getDensity() {
        return this.L.getDensity();
    }

    @Override // defpackage.iu0
    public final /* synthetic */ long k(long j) {
        return r7.c(j, this);
    }

    @Override // defpackage.iu0
    public final /* synthetic */ float q(long j) {
        return hf1.f(j, this);
    }
}

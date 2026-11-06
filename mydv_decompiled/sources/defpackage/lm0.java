package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lm0 implements l61 {
    public final float I;
    public final float J;
    public final float K;
    public final float L;
    public final float M;
    public final float N;

    public lm0(float f, float f2, float f3, float f4) {
        int i;
        this.I = f;
        this.J = f2;
        this.K = f3;
        this.L = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder B = hf1.B("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            B.append(f3);
            B.append(", ");
            B.append(f4);
            B.append(".");
            lr3.a(B.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            i = d2 == d3 ? 0 : o7.V((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int V = o7.V((float) ((-(d6 + d7)) / d5), fArr, 0);
            int V2 = o7.V((float) ((d6 - d7) / d5), fArr, V) + V;
            if (V2 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    i = V2 - 1;
                }
            }
            i = V2;
        }
        float f10 = (f6 - f5) * 2.0f;
        int V3 = o7.V((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i2 = 0; i2 < V3; i2++) {
            float f11 = fArr[i2];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            min = Math.min(min, f12);
            max = Math.max(max, f12);
        }
        long a = rf1.a(min, max);
        this.M = Float.intBitsToFloat((int) (a >> 32));
        this.N = Float.intBitsToFloat((int) (a & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // defpackage.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r31) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm0.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lm0)) {
            return false;
        }
        lm0 lm0Var = (lm0) obj;
        return this.I == lm0Var.I && this.J == lm0Var.J && this.K == lm0Var.K && this.L == lm0Var.L;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.L) + jp0.o(this.K, jp0.o(this.J, Float.floatToIntBits(this.I) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder B = hf1.B("CubicBezierEasing(a=", this.I, ", b=", this.J, ", c=");
        B.append(this.K);
        B.append(", d=");
        B.append(this.L);
        B.append(")");
        return B.toString();
    }
}

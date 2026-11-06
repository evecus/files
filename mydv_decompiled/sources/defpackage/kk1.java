package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class kk1 implements ik1 {
    public final float[] a;
    public final float[] b;

    public kk1(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            s83.t("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.ik1
    public final float a(float f) {
        return rt0.D(f, this.b, this.a);
    }

    @Override // defpackage.ik1
    public final float b(float f) {
        return rt0.D(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return Arrays.equals(this.a, kk1Var.a) && Arrays.equals(this.b, kk1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        return "FontScaleConverter{fromSpValues=" + arrays + ", toDpValues=" + arrays2 + "}";
    }
}

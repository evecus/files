package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class n33 {
    public float[] a;
    public int b;

    public n33(int i) {
        this.a = i == 0 ? uf1.a : new float[i];
    }

    public static String c(n33 n33Var, int i) {
        String str = (i & 2) != 0 ? "" : "[";
        String str2 = (i & 4) == 0 ? "]" : "";
        n33Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        float[] fArr = n33Var.a;
        int i2 = n33Var.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) str2);
                break;
            }
            float f = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i3++;
        }
        return sb.toString();
    }

    public final void a(float f) {
        int i = this.b + 1;
        float[] fArr = this.a;
        if (fArr.length < i) {
            fArr = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            this.a = fArr;
        }
        int i2 = this.b;
        fArr[i2] = f;
        this.b = i2 + 1;
    }

    public final float b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        dq2.J0("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n33) {
            n33 n33Var = (n33) obj;
            int i = n33Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = n33Var.a;
                u22 c0 = ut0.c0(0, i2);
                int i3 = c0.I;
                int i4 = c0.J;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.floatToIntBits(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        return c(this, 25);
    }
}

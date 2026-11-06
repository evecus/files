package defpackage;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f80 extends c80 {
    public float[] b;

    public final float[] a() {
        float[] fArr = this.b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.a;
        if (!(colorFilter instanceof ColorMatrixColorFilter) || 26 > Build.VERSION.SDK_INT) {
            s83.t("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        float[] m = x9.m((ColorMatrixColorFilter) colorFilter);
        this.b = m;
        return m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f80) && Arrays.equals(a(), ((f80) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        float[] fArr = this.b;
        return r7.C("ColorMatrixColorFilter(colorMatrix=", fArr == null ? "null" : r7.C("ColorMatrix(values=", Arrays.toString(fArr), ")"), ")");
    }
}

package coil3.transform;

import android.graphics.Bitmap;
import coil3.size.Size;
import defpackage.fj0;
import defpackage.j42;
import defpackage.s24;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class Transformation {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Transformation) && j42.c(getCacheKey(), ((Transformation) obj).getCacheKey());
    }

    public abstract String getCacheKey();

    public int hashCode() {
        return getCacheKey().hashCode();
    }

    public String toString() {
        return s24.a(getClass()).c() + "(cacheKey=" + getCacheKey() + ")";
    }

    public abstract Object transform(Bitmap bitmap, Size size, fj0 fj0Var);
}

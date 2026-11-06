package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tx0 {
    public final DisplayCutout a;

    public tx0(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final o12 a() {
        return Build.VERSION.SDK_INT >= 30 ? o12.c(p10.b(this.a)) : o12.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((tx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}

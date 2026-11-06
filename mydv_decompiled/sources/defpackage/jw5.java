package defpackage;

import android.graphics.Rect;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jw5 {
    public final fx a;
    public final float b;

    public jw5(Rect rect, float f) {
        this.a = new fx(rect);
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jw5.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        jw5 jw5Var = (jw5) obj;
        return j42.c(this.a, jw5Var.a) && this.b == jw5Var.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public jw5(fx fxVar, float f) {
        this.a = fxVar;
        this.b = f;
    }
}

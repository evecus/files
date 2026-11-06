package defpackage;

import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ci3 {
    public final float a;
    public final List b;

    public ci3(float f, int i) {
        this((i & 1) != 0 ? 0.0f : f, o91.I);
    }

    public final ci3 a(ci3 ci3Var) {
        return new ci3(this.a + ci3Var.a, o70.f1(this.b, ci3Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci3)) {
            return false;
        }
        ci3 ci3Var = (ci3) obj;
        return r11.c(this.a, ci3Var.a) && j42.c(this.b, ci3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) r11.d(this.a)) + ", resourceIds=" + this.b + ')';
    }

    public ci3(float f, List list) {
        this.a = f;
        this.b = list;
    }
}

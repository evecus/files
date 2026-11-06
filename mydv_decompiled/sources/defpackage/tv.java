package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tv {
    public final float a;

    public tv(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, da2 da2Var) {
        float f = (i2 - i) / 2.0f;
        da2 da2Var2 = da2.I;
        float f2 = this.a;
        if (da2Var != da2Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv) && Float.compare(this.a, ((tv) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}

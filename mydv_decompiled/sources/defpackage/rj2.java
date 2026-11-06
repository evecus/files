package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rj2 implements ik1 {
    public final float a;

    public rj2(float f) {
        this.a = f;
    }

    @Override // defpackage.ik1
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.ik1
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj2) && Float.compare(this.a, ((rj2) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ")";
    }
}

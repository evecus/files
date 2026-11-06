package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class r11 implements Comparable {
    public final float I;

    public /* synthetic */ r11(float f) {
        this.I = f;
    }

    public static final /* synthetic */ r11 a(float f) {
        return new r11(f);
    }

    public static int b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String d(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.I, ((r11) obj).I);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r11) {
            return Float.compare(this.I, ((r11) obj).I) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.I);
    }

    public final String toString() {
        return d(this.I);
    }
}

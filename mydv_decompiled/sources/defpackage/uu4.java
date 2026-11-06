package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class uu4 {
    public static final tu4 Companion = new tu4();
    public static final uu4 d = new uu4(0.0f, 0.0f, 0.0f, 7);
    public final float a;
    public final float b;
    public final float c;

    public uu4(float f, float f2, float f3, int i) {
        f = (i & 1) != 0 ? 0.0f : f;
        f2 = (i & 2) != 0 ? 0.0f : f2;
        f3 = (i & 4) != 0 ? 0.0f : f3;
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu4)) {
            return false;
        }
        uu4 uu4Var = (uu4) obj;
        return r11.c(this.a, uu4Var.a) && r11.c(this.b, uu4Var.b) && r11.c(this.c, uu4Var.c);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31);
    }

    public final String toString() {
        String d2 = r11.d(this.a);
        String d3 = r11.d(this.b);
        return hf1.z(r7.F("StagePanels(start=", d2, ", end=", d3, ", bottom="), r11.d(this.c), ")");
    }
}

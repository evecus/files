package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class w92 {
    public static final w92 a;

    static {
        w92 w92Var = new w92();
        if (r11.b(0.0f, 0.0f) < 0 || r11.b(0.0f, 0.0f) < 0 || r11.b(0.0f, 0.0f) < 0 || r11.b(0.0f, 0.0f) < 0) {
            p02.a("Layer outsets must be non-negative");
        }
        a = w92Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w92) && r11.c(0.0f, 0.0f) && r11.c(0.0f, 0.0f) && r11.c(0.0f, 0.0f) && r11.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + jp0.o(0.0f, jp0.o(0.0f, Float.floatToIntBits(0.0f) * 31, 31), 31);
    }

    public final String toString() {
        String d = r11.d(0.0f);
        String d2 = r11.d(0.0f);
        String d3 = r11.d(0.0f);
        String d4 = r11.d(0.0f);
        StringBuilder F = r7.F("LayerOutsets(left=", d, ", top=", d2, ", right=");
        F.append(d3);
        F.append(", bottom=");
        F.append(d4);
        F.append(")");
        return F.toString();
    }
}

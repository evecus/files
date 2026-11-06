package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w11 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w11) && r11.c(10.0f, 10.0f) && r11.c(40.0f, 40.0f) && r11.c(10.0f, 10.0f) && r11.c(40.0f, 40.0f);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(40.0f) + jp0.o(10.0f, jp0.o(40.0f, Float.floatToIntBits(10.0f) * 31, 31), 31)) * 31) + 1231;
    }

    public final String toString() {
        String d = r11.d(10.0f);
        String d2 = r11.d(40.0f);
        String d3 = r11.d(10.0f);
        String d4 = r11.d(40.0f);
        StringBuilder F = r7.F("DpTouchBoundsExpansion(start=", d, ", top=", d2, ", end=");
        F.append(d3);
        F.append(", bottom=");
        F.append(d4);
        F.append(", isLayoutDirectionAware=true)");
        return F.toString();
    }
}

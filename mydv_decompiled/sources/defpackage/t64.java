package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class t64 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof t64) {
            return this.a == ((t64) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        byte b = this.a;
        return b == 0 ? "Button" : b == 1 ? "Checkbox" : b == 2 ? "Switch" : b == 3 ? "RadioButton" : b == 4 ? "Tab" : b == 5 ? "Image" : b == 6 ? "DropdownList" : b == 7 ? "Picker" : b == 8 ? "Carousel" : "Unknown";
    }
}

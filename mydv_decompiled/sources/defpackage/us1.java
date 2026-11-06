package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class us1 {
    public final byte a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof us1) {
            return this.a == ((us1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        byte b = this.a;
        return b == 16 ? "Confirm" : b == 6 ? "ContextClick" : b == 13 ? "GestureEnd" : b == 23 ? "GestureThresholdActivate" : b == 3 ? "KeyboardTap" : b == 0 ? "LongPress" : b == 17 ? "Reject" : b == 27 ? "SegmentFrequentTick" : b == 26 ? "SegmentTick" : b == 9 ? "TextHandleMove" : b == 22 ? "ToggleOff" : b == 21 ? "ToggleOn" : b == 1 ? "VirtualKey" : "Invalid";
    }
}

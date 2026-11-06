package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cq3 {
    public final int a;

    public /* synthetic */ cq3(int i) {
        this.a = i;
    }

    public static final /* synthetic */ cq3 a(int i) {
        return new cq3(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public final /* synthetic */ int d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cq3) {
            return this.a == ((cq3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return c(this.a);
    }
}

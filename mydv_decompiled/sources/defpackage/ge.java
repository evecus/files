package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ge implements pp3 {
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public ge(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ge.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((ge) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return r7.z("AndroidPointerIcon(type=", this.b, ")");
    }
}

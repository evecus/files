package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class kv4 {
    public final int a;

    public kv4(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        t02.a("grid with no rows/columns");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kv4) {
            return this.a == ((kv4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}

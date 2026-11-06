package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class f65 {
    public final long a;
    public final long b;

    public f65(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f65)) {
            return false;
        }
        f65 f65Var = (f65) obj;
        long j = f65Var.a;
        int i = x70.h;
        return zc5.a(this.a, j) && zc5.a(this.b, f65Var.b);
    }

    public final int hashCode() {
        int i = x70.h;
        return i82.Q(this.b) + (i82.Q(this.a) * 31);
    }

    public final String toString() {
        return hf1.x("SelectionColors(selectionHandleColor=", x70.i(this.a), ", selectionBackgroundColor=", x70.i(this.b), ")");
    }
}

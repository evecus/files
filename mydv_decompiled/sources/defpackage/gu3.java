package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gu3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public gu3(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static gu3 a(gu3 gu3Var, int i) {
        boolean z = (i & 1) != 0 ? gu3Var.a : true;
        boolean z2 = gu3Var.c;
        gu3Var.getClass();
        return new gu3(z, false, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu3)) {
            return false;
        }
        gu3 gu3Var = (gu3) obj;
        return this.a == gu3Var.a && this.b == gu3Var.b && this.c == gu3Var.c;
    }

    public final int hashCode() {
        return pt1.o(this.c) + ((pt1.o(this.b) + (pt1.o(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileListPaging(loadingMore=" + this.a + ", failed=" + this.b + ", hasMore=" + this.c + ")";
    }

    public /* synthetic */ gu3() {
        this(false, false, true);
    }
}

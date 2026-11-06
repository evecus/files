package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class oj5 {
    public final Boolean a;
    public final Boolean b;

    public oj5(Boolean bool, Boolean bool2) {
        this.a = bool;
        this.b = bool2;
    }

    public static oj5 a(oj5 oj5Var, Boolean bool, Boolean bool2, int i) {
        if ((i & 1) != 0) {
            bool = oj5Var.a;
        }
        if ((i & 2) != 0) {
            bool2 = oj5Var.b;
        }
        return new oj5(bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj5)) {
            return false;
        }
        oj5 oj5Var = (oj5) obj;
        return j42.c(this.a, oj5Var.a) && j42.c(this.b, oj5Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "VideoInteractionUiState(isLiked=" + this.a + ", isFavorite=" + this.b + ")";
    }
}

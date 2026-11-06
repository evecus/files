package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h83 implements i83 {
    public final bn a;
    public final boolean b;

    public h83(bn bnVar) {
        this.a = bnVar;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h83)) {
            return false;
        }
        h83 h83Var = (h83) obj;
        return j42.c(this.a, h83Var.a) && this.b == h83Var.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "NavigateTo(destination=" + this.a + ", topLevel=" + this.b + ")";
    }

    public h83(bn bnVar, boolean z) {
        this.a = bnVar;
        this.b = z;
    }
}

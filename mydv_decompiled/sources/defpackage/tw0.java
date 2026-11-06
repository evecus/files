package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tw0 {
    public final boolean a;
    public final boolean b;
    public final boolean d;
    public final yg4 c = yg4.I;
    public final boolean e = true;
    public final String f = "";
    public final byte g = 2;

    public tw0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return this.a == tw0Var.a && this.b == tw0Var.b && this.c == tw0Var.c && this.d == tw0Var.d && this.e == tw0Var.e && this.g == tw0Var.g;
    }

    public final int hashCode() {
        return (((((((this.c.hashCode() + ((((this.a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + this.g) * 31;
    }
}

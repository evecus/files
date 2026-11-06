package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o74 {
    public final rc2 a;
    public final boolean b;
    public final boolean c;

    public o74(rc2 rc2Var, boolean z, boolean z2) {
        this.a = rc2Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o74)) {
            return false;
        }
        o74 o74Var = (o74) obj;
        return this.a == o74Var.a && this.b == o74Var.b && this.c == o74Var.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "RowColumnChildSelector(type=" + this.a + ", expandWidth=" + this.b + ", expandHeight=" + this.c + ')';
    }
}

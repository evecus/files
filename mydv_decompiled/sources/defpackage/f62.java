package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f62 {
    public final Object a;
    public final Object b;

    public f62(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f62)) {
            return false;
        }
        f62 f62Var = (f62) obj;
        return this.a.equals(f62Var.a) && j42.c(this.b, f62Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return (obj2 instanceof Enum ? ((Enum) obj2).ordinal() : obj2 != null ? obj2.hashCode() : 0) + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ")";
    }
}

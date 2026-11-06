package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class b7 {
    public final a7 a;
    public final Object b;

    public b7(a7 a7Var, String str) {
        this.a = a7Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return this.a.equals(b7Var.a) && j42.c(this.b, b7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a.a + ", " + this.b + ')';
    }
}

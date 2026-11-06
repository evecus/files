package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class cu5 {
    public final ej1 a;
    public final bu5 b;

    public cu5(ej1 ej1Var, bu5 bu5Var) {
        this.a = ej1Var;
        this.b = bu5Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cu5)) {
            return false;
        }
        cu5 cu5Var = (cu5) obj;
        return this.a == cu5Var.a && this.b == cu5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Operation: " + this.a + ": Status: " + this.b;
    }
}

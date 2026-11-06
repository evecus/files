package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ht5 {
    public final String a;
    public final m16 b;

    public ht5(String str, m16 m16Var) {
        this.a = str;
        this.b = m16Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht5)) {
            return false;
        }
        ht5 ht5Var = (ht5) obj;
        return this.a.equals(ht5Var.a) && this.b.equals(ht5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a;
    }
}

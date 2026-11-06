package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class di2 implements fi2 {
    public final String a;
    public final String b;

    public di2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di2)) {
            return false;
        }
        di2 di2Var = (di2) obj;
        return j42.c(this.a, di2Var.a) && j42.c(this.b, di2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hf1.x("Clause(number=", this.a, ", text=", this.b, ")");
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q34 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public q34(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q34)) {
            return false;
        }
        q34 q34Var = (q34) obj;
        return this.a.equals(q34Var.a) && this.b.equals(q34Var.b) && j42.c(this.c, q34Var.c) && this.d == q34Var.d;
    }

    public final int hashCode() {
        int n = hf1.n(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return ((n + (str == null ? 0 : str.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder F = r7.F("LicenseConfig(title=", this.a, ", content=", this.b, ", url=");
        F.append(this.c);
        F.append(", version=");
        F.append(this.d);
        F.append(")");
        return F.toString();
    }
}

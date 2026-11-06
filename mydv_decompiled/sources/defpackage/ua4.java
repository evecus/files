package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ua4 {
    public final int a;
    public final vj3 b;
    public final boolean c;
    public final double d;
    public final a90 e;

    public ua4(int i, vj3 vj3Var, boolean z, double d, a90 a90Var) {
        vj3Var.getClass();
        this.a = i;
        this.b = vj3Var;
        this.c = z;
        this.d = d;
        this.e = a90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua4)) {
            return false;
        }
        ua4 ua4Var = (ua4) obj;
        return this.a == ua4Var.a && this.b == ua4Var.b && this.c == ua4Var.c && Double.compare(this.d, ua4Var.d) == 0 && this.e == ua4Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a * 31)) * 31;
        int i = this.c ? 1231 : 1237;
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        return this.e.hashCode() + ((((hashCode + i) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31);
    }

    public final String toString() {
        return "Key(seedArgb=" + this.a + ", style=" + this.b + ", isDark=" + this.c + ", contrastLevel=" + this.d + ", specVersion=" + this.e + ")";
    }
}

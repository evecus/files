package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lj0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public lj0(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final double a(double d) {
        double d2;
        double d3;
        double d4 = this.a;
        if (d <= -1.0d) {
            return d4;
        }
        double d5 = this.b;
        if (d < 0.0d) {
            double d6 = (d - (-1.0d)) / 1.0d;
            d2 = (1.0d - d6) * d4;
            d3 = d6 * d5;
        } else {
            double d7 = this.c;
            if (d < 0.5d) {
                double d8 = (d - 0.0d) / 0.5d;
                d2 = (1.0d - d8) * d5;
                d3 = d8 * d7;
            } else {
                double d9 = this.d;
                if (d >= 1.0d) {
                    return d9;
                }
                double d10 = (d - 0.5d) / 0.5d;
                d2 = (1.0d - d10) * d7;
                d3 = d10 * d9;
            }
        }
        return d3 + d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj0)) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return Double.compare(this.a, lj0Var.a) == 0 && Double.compare(this.b, lj0Var.b) == 0 && Double.compare(this.c, lj0Var.c) == 0 && Double.compare(this.d, lj0Var.d) == 0;
    }

    public final int hashCode() {
        return nt3.i(this.d) + ((nt3.i(this.c) + ((nt3.i(this.b) + (nt3.i(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.a + ", normal=" + this.b + ", medium=" + this.c + ", high=" + this.d + ")";
    }
}

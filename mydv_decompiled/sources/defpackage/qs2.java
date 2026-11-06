package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class qs2 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final float i;
    public final float j;
    public final float k;

    public qs2(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, float f, float f2, float f3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = f;
        this.j = f2;
        this.k = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs2)) {
            return false;
        }
        qs2 qs2Var = (qs2) obj;
        return Double.compare(this.a, qs2Var.a) == 0 && Double.compare(this.b, qs2Var.b) == 0 && Double.compare(this.c, qs2Var.c) == 0 && Double.compare(this.d, qs2Var.d) == 0 && Double.compare(this.e, qs2Var.e) == 0 && Double.compare(this.f, qs2Var.f) == 0 && Double.compare(this.g, qs2Var.g) == 0 && Double.compare(this.h, qs2Var.h) == 0 && Float.compare(this.i, qs2Var.i) == 0 && Float.compare(this.j, qs2Var.j) == 0 && Float.compare(this.k, qs2Var.k) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.k) + jp0.o(this.j, jp0.o(this.i, (nt3.i(this.h) + ((nt3.i(this.g) + ((nt3.i(this.f) + ((nt3.i(this.e) + ((nt3.i(this.d) + ((nt3.i(this.c) + ((nt3.i(this.b) + (nt3.i(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "Params(startupGainDb=" + this.a + ", maxGainDb=" + this.b + ", minGainDb=" + this.c + ", silenceGateDb=" + this.d + ", calibrationSignalSec=" + this.e + ", programIntegrationSec=" + this.f + ", gainAttackSec=" + this.g + ", gainReleaseSec=" + this.h + ", startupGainLinear=" + this.i + ", maxGainLinear=" + this.j + ", minGainLinear=" + this.k + ")";
    }
}

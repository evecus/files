package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class li3 implements ji3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public li3(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            o02.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.ji3
    public final float a() {
        return this.d;
    }

    @Override // defpackage.ji3
    public final float b(da2 da2Var) {
        return da2Var == da2.I ? this.a : this.c;
    }

    @Override // defpackage.ji3
    public final float c(da2 da2Var) {
        return da2Var == da2.I ? this.c : this.a;
    }

    @Override // defpackage.ji3
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof li3)) {
            return false;
        }
        li3 li3Var = (li3) obj;
        return r11.c(this.a, li3Var.a) && r11.c(this.b, li3Var.b) && r11.c(this.c, li3Var.c) && r11.c(this.d, li3Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String d = r11.d(this.a);
        String d2 = r11.d(this.b);
        String d3 = r11.d(this.c);
        String d4 = r11.d(this.d);
        StringBuilder F = r7.F("PaddingValues(start=", d, ", top=", d2, ", end=");
        F.append(d3);
        F.append(", bottom=");
        F.append(d4);
        F.append(")");
        return F.toString();
    }
}

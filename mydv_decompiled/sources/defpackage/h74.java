package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h74 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        sv2.h(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public h74(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h74)) {
            return false;
        }
        h74 h74Var = (h74) obj;
        return Float.compare(this.a, h74Var.a) == 0 && Float.compare(this.b, h74Var.b) == 0 && Float.compare(this.c, h74Var.c) == 0 && Float.compare(this.d, h74Var.d) == 0 && mw2.z(this.e, h74Var.e) && mw2.z(this.f, h74Var.f) && mw2.z(this.g, h74Var.g) && mw2.z(this.h, h74Var.h);
    }

    public final int hashCode() {
        return i82.Q(this.h) + ((i82.Q(this.g) + ((i82.Q(this.f) + ((i82.Q(this.e) + jp0.o(this.d, jp0.o(this.c, jp0.o(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String x0 = e41.x0(this.a);
        String x02 = e41.x0(this.b);
        String x03 = e41.x0(this.c);
        String x04 = e41.x0(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(x0);
        sb.append(", ");
        sb.append(x02);
        sb.append(", ");
        sb.append(x03);
        String z = hf1.z(sb, ", ", x04);
        long j = this.e;
        long j2 = this.f;
        boolean z2 = mw2.z(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (z2 && mw2.z(j2, j3) && mw2.z(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return hf1.x("RoundRect(rect=", z, ", radius=", e41.x0(Float.intBitsToFloat(i)), ")");
            }
            String x05 = e41.x0(Float.intBitsToFloat(i));
            return hf1.z(r7.F("RoundRect(rect=", z, ", x=", x05, ", y="), e41.x0(Float.intBitsToFloat(i2)), ")");
        }
        String U = mw2.U(j);
        String U2 = mw2.U(j2);
        String U3 = mw2.U(j3);
        String U4 = mw2.U(j4);
        StringBuilder F = r7.F("RoundRect(rect=", z, ", topLeft=", U, ", topRight=");
        r7.N(F, U2, ", bottomRight=", U3, ", bottomLeft=");
        return hf1.z(F, U4, ")");
    }
}

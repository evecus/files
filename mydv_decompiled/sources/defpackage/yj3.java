package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yj3 {
    public final td a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public yj3(td tdVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = tdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final m14 a(m14 m14Var) {
        return m14Var.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = d65.b;
            if (d65.b(j, j2)) {
                return j2;
            }
        }
        int i = d65.c;
        int i2 = this.b;
        return ui4.c(((int) (j >> 32)) + i2, ((int) (j & 4294967295L)) + i2);
    }

    public final m14 c(m14 m14Var) {
        float f = -this.f;
        return m14Var.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return ut0.r(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yj3) {
            yj3 yj3Var = (yj3) obj;
            if (this.a == yj3Var.a && this.b == yj3Var.b && this.c == yj3Var.c && this.d == yj3Var.d && this.e == yj3Var.e && Float.compare(this.f, yj3Var.f) == 0 && Float.compare(this.g, yj3Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + jp0.o(this.f, ((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31, 31);
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ")";
    }
}

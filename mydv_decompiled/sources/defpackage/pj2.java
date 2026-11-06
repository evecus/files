package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pj2 {
    public static final pj2 d = new pj2(mj2.c, 17, 0);
    public final float a;
    public final int b;
    public final int c;

    public pj2(float f, int i, int i2) {
        this.a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj2)) {
            return false;
        }
        pj2 pj2Var = (pj2) obj;
        float f = pj2Var.a;
        float f2 = mj2.b;
        return Float.compare(this.a, f) == 0 && this.b == pj2Var.b && this.c == pj2Var.c;
    }

    public final int hashCode() {
        float f = mj2.b;
        return (((Float.floatToIntBits(this.a) * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        String b = mj2.b(this.a);
        String str = "Invalid";
        int i = this.b;
        String str2 = i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        int i2 = this.c;
        if (i2 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        return hf1.z(r7.F("LineHeightStyle(alignment=", b, ", trim=", str2, ",mode="), str, ")");
    }
}

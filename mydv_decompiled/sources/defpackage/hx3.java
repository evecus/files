package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class hx3 {
    public static final hx3 d = new hx3(0.0f, 0, new z60(0.0f, 0.0f));
    public final float a;
    public final z60 b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public hx3(float f, int i, z60 z60Var) {
        this.a = f;
        this.b = z60Var;
        this.c = i;
        if (Float.isNaN(f)) {
            s83.t("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx3)) {
            return false;
        }
        hx3 hx3Var = (hx3) obj;
        return this.a == hx3Var.a && j42.c(this.b, hx3Var.b) && this.c == hx3Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.floatToIntBits(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return nt3.n(sb, this.c, ")");
    }
}

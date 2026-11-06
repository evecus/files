package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gc5 {
    public final mj1 a;
    public final qk1 b;
    public final int c;
    public final int d;
    public final Object e;

    public gc5(mj1 mj1Var, qk1 qk1Var, int i, int i2, Object obj) {
        this.a = mj1Var;
        this.b = qk1Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc5)) {
            return false;
        }
        gc5 gc5Var = (gc5) obj;
        return j42.c(this.a, gc5Var.a) && j42.c(this.b, gc5Var.b) && this.c == gc5Var.c && this.d == gc5Var.d && j42.c(this.e, gc5Var.e);
    }

    public final int hashCode() {
        mj1 mj1Var = this.a;
        int hashCode = (((((((mj1Var == null ? 0 : mj1Var.hashCode()) * 31) + this.b.I) * 31) + this.c) * 31) + this.d) * 31;
        Object obj = this.e;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.c;
        String str2 = i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        r7.N(sb, str2, ", fontSynthesis=", str, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}

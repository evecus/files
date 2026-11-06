package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fe3 extends mu0 {
    public final ee3 d;
    public final vi2 e;

    public fe3(vi2 vi2Var, ee3 ee3Var) {
        ee3Var.getClass();
        this.d = ee3Var;
        this.e = vi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe3)) {
            return false;
        }
        fe3 fe3Var = (fe3) obj;
        return j42.c(this.d, fe3Var.d) && j42.c(this.e, fe3Var.e);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        vi2 vi2Var = this.e;
        return hashCode + (vi2Var == null ? 0 : vi2Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.d + ", owner=" + this.e + ')';
    }
}

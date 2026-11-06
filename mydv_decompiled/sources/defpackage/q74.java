package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class q74 {
    public float a = 0.0f;
    public boolean b = true;
    public wl0 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q74)) {
            return false;
        }
        q74 q74Var = (q74) obj;
        return Float.compare(this.a, q74Var.a) == 0 && this.b == q74Var.b && j42.c(this.c, q74Var.c);
    }

    public final int hashCode() {
        int o = (pt1.o(this.b) + (Float.floatToIntBits(this.a) * 31)) * 31;
        wl0 wl0Var = this.c;
        return (o + (wl0Var == null ? 0 : wl0Var.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}

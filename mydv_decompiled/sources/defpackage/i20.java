package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class i20 {
    public final u8 a;
    public final tm1 b;
    public final ve1 c;
    public final boolean d;

    public i20(u8 u8Var, tm1 tm1Var, ve1 ve1Var, boolean z) {
        this.a = u8Var;
        this.b = tm1Var;
        this.c = ve1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i20)) {
            return false;
        }
        i20 i20Var = (i20) obj;
        return j42.c(this.a, i20Var.a) && j42.c(this.b, i20Var.b) && j42.c(this.c, i20Var.c) && this.d == i20Var.d;
    }

    public final int hashCode() {
        return pt1.o(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}

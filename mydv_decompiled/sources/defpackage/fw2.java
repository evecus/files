package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class fw2 {
    public final k80 a;
    public final lc5 b;
    public final hn4 c;
    public final h23 d;

    public fw2(k80 k80Var, lc5 lc5Var, hn4 hn4Var, h23 h23Var) {
        this.a = k80Var;
        this.b = lc5Var;
        this.c = hn4Var;
        this.d = h23Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fw2.class != obj.getClass()) {
            return false;
        }
        fw2 fw2Var = (fw2) obj;
        return j42.c(this.a, fw2Var.a) && j42.c(this.b, fw2Var.b) && j42.c(this.c, fw2Var.c) && j42.c(this.d, fw2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.a + ", typography=" + this.b + ", shapes=" + this.c + ", motionScheme=" + this.d + ")";
    }
}

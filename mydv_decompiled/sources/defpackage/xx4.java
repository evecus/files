package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xx4 extends q13 {
    public final y43 a;
    public final ux4 b;

    public xx4(y43 y43Var, ux4 ux4Var) {
        this.a = y43Var;
        this.b = ux4Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new dy4(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx4)) {
            return false;
        }
        xx4 xx4Var = (xx4) obj;
        return j42.c(xx4Var.b, this.b) && j42.c(xx4Var.a, this.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "style";
        fq fqVar = z12Var.c;
        fqVar.b(this.b, "style");
        fqVar.b(this.a, "styleState");
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.a + ", style=" + this.b + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        dy4 dy4Var = (dy4) k13Var;
        dy4Var.L = this.b;
        dy4Var.p0(false);
        y43 y43Var = this.a;
        if (y43Var == null) {
            y43Var = new y43(null);
        }
        if (j42.c(dy4Var.S, y43Var)) {
            return;
        }
        dy4Var.S = y43Var;
        dy4Var.p0(false);
        ay4 ay4Var = dy4Var.K;
        if (ay4Var != null) {
            ut0.S(ay4Var, 2).S0();
        } else {
            zy.i("StyleOuterNode with no corresponding StyleInnerNode");
        }
    }
}

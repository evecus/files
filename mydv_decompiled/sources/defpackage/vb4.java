package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class vb4 extends q13 {
    public final gc4 a;
    public final pg3 b;
    public final boolean c;
    public final boolean d;
    public final t33 e;

    public vb4(gc4 gc4Var, pg3 pg3Var, boolean z, boolean z2, t33 t33Var) {
        this.a = gc4Var;
        this.b = pg3Var;
        this.c = z;
        this.d = z2;
        this.e = t33Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new fc4(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb4)) {
            return false;
        }
        vb4 vb4Var = (vb4) obj;
        return j42.c(this.a, vb4Var.a) && this.b == vb4Var.b && this.c == vb4Var.c && this.d == vb4Var.d && j42.c(this.e, vb4Var.e);
    }

    public final int hashCode() {
        int hashCode = (((((this.b.hashCode() + (this.a.hashCode() * 31)) * 961) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 961;
        t33 t33Var = this.e;
        return (hashCode + (t33Var != null ? t33Var.hashCode() : 0)) * 31;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "scrollable";
        fq fqVar = z12Var.c;
        fqVar.b(this.b, "orientation");
        fqVar.b(this.a, "state");
        fqVar.b(null, "overscrollEffect");
        fqVar.b(Boolean.valueOf(this.c), "enabled");
        fqVar.b(Boolean.valueOf(this.d), "reverseDirection");
        fqVar.b(null, "flingBehavior");
        fqVar.b(this.e, "interactionSource");
        fqVar.b(null, "bringIntoViewSpec");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((fc4) k13Var).E0(null, null, null, this.e, this.b, this.a, this.c, this.d);
    }
}

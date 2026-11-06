package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ja0 extends q13 {
    public final t33 a;
    public final boolean b;
    public final t64 c;
    public final rm1 d;
    public final rm1 e;

    public ja0(rm1 rm1Var, rm1 rm1Var2, t33 t33Var, t64 t64Var, boolean z) {
        this.a = t33Var;
        this.b = z;
        this.c = t64Var;
        this.d = rm1Var;
        this.e = rm1Var2;
    }

    @Override // defpackage.q13
    public final k13 create() {
        boolean z = this.b;
        return new ma0(this.d, this.e, this.a, this.c, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ja0.class != obj.getClass()) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        return j42.c(this.a, ja0Var.a) && this.b == ja0Var.b && j42.c(this.c, ja0Var.c) && this.d == ja0Var.d && this.e == ja0Var.e;
    }

    public final int hashCode() {
        t33 t33Var = this.a;
        int o = (((pt1.o(this.b) + ((t33Var != null ? t33Var.hashCode() : 0) * 961)) * 31) + 1231) * 961;
        t64 t64Var = this.c;
        int hashCode = (this.d.hashCode() + ((o + (t64Var != null ? t64Var.a : (byte) 0)) * 31)) * 961;
        rm1 rm1Var = this.e;
        return ((hashCode + (rm1Var != null ? rm1Var.hashCode() : 0)) * 961) + 1231;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("combinedClickable");
        z12Var.b().b(null, "indicationNodeFactory");
        z12Var.b().b(this.a, "interactionSource");
        fq b = z12Var.b();
        Boolean bool = Boolean.TRUE;
        b.b(bool, "enabled");
        z12Var.b().b(null, "onClickLabel");
        z12Var.b().b(this.c, "role");
        z12Var.b().b(this.d, "onClick");
        z12Var.b().b(null, "onDoubleClick");
        z12Var.b().b(this.e, "onLongClick");
        z12Var.b().b(null, "onLongClickLabel");
        z12Var.b().b(bool, "hapticFeedbackEnabled");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        boolean z;
        ma0 ma0Var = (ma0) k13Var;
        ma0Var.e0 = true;
        boolean z2 = ma0Var.d0 == null;
        rm1 rm1Var = this.e;
        if (z2 != (rm1Var == null)) {
            ma0Var.n0();
            ut0.U(ma0Var).I();
            z = true;
        } else {
            z = false;
        }
        ma0Var.d0 = rm1Var;
        boolean z3 = !ma0Var.O ? true : z;
        ma0Var.y0(this.a, this.b, true, null, this.c, this.d);
        if (z3) {
            ma0Var.z0(false);
            ma0Var.z0(true);
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class tb4 extends q13 {
    public final gc4 a;
    public final pg3 b;
    public final boolean c;
    public final gf1 d;
    public final t33 e;
    public final oy f;
    public final boolean g;
    public final sc h;

    public tb4(sc scVar, oy oyVar, gf1 gf1Var, t33 t33Var, pg3 pg3Var, gc4 gc4Var, boolean z, boolean z2) {
        this.a = gc4Var;
        this.b = pg3Var;
        this.c = z;
        this.d = gf1Var;
        this.e = t33Var;
        this.f = oyVar;
        this.g = z2;
        this.h = scVar;
    }

    @Override // defpackage.q13
    public final k13 create() {
        ub4 ub4Var = new ub4();
        ub4Var.K = this.a;
        ub4Var.L = this.b;
        ub4Var.M = this.c;
        ub4Var.N = this.d;
        ub4Var.O = this.e;
        ub4Var.P = this.f;
        ub4Var.Q = this.g;
        ub4Var.R = this.h;
        return ub4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tb4.class != obj.getClass()) {
            return false;
        }
        tb4 tb4Var = (tb4) obj;
        return this.a.equals(tb4Var.a) && this.b == tb4Var.b && this.c == tb4Var.c && j42.c(this.d, tb4Var.d) && j42.c(this.e, tb4Var.e) && j42.c(this.f, tb4Var.f) && this.g == tb4Var.g && j42.c(this.h, tb4Var.h);
    }

    public final int hashCode() {
        int o = (((pt1.o(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + 1237) * 31;
        gf1 gf1Var = this.d;
        int hashCode = (o + (gf1Var != null ? gf1Var.hashCode() : 0)) * 31;
        t33 t33Var = this.e;
        int hashCode2 = (hashCode + (t33Var != null ? t33Var.hashCode() : 0)) * 31;
        oy oyVar = this.f;
        int o2 = (pt1.o(this.g) + ((hashCode2 + (oyVar != null ? oyVar.hashCode() : 0)) * 31)) * 31;
        sc scVar = this.h;
        return o2 + (scVar != null ? scVar.hashCode() : 0);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("scrollableArea");
        z12Var.b().b(this.a, "state");
        z12Var.b().b(this.b, "orientation");
        if (!this.g) {
            z12Var.b().b(this.h, "overscrollEffect");
        }
        z12Var.b().b(Boolean.valueOf(this.c), "enabled");
        z12Var.b().b(Boolean.FALSE, "reverseScrolling");
        z12Var.b().b(this.d, "flingBehavior");
        z12Var.b().b(this.e, "interactionSource");
        z12Var.b().b(this.f, "bringIntoViewSpec");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        t33 t33Var = this.e;
        ((ub4) k13Var).o0(this.h, this.f, this.d, t33Var, this.b, this.a, this.g, this.c);
    }
}

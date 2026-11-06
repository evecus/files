package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class q60 extends q13 {
    public final t33 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final t64 e;
    public final rm1 f;

    public q60(t33 t33Var, boolean z, boolean z2, String str, t64 t64Var, rm1 rm1Var) {
        this.a = t33Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = t64Var;
        this.f = rm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new s60(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q60.class != obj.getClass()) {
            return false;
        }
        q60 q60Var = (q60) obj;
        return j42.c(this.a, q60Var.a) && this.b == q60Var.b && this.c == q60Var.c && j42.c(this.d, q60Var.d) && j42.c(this.e, q60Var.e) && this.f == q60Var.f;
    }

    public final int hashCode() {
        t33 t33Var = this.a;
        int o = (pt1.o(this.c) + ((pt1.o(this.b) + ((t33Var != null ? t33Var.hashCode() : 0) * 961)) * 31)) * 31;
        String str = this.d;
        int hashCode = (o + (str != null ? str.hashCode() : 0)) * 31;
        t64 t64Var = this.e;
        return this.f.hashCode() + ((hashCode + (t64Var != null ? t64Var.a : (byte) 0)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("clickable");
        z12Var.b().b(Boolean.valueOf(this.c), "enabled");
        z12Var.b().b(this.f, "onClick");
        z12Var.b().b(this.d, "onClickLabel");
        z12Var.b().b(this.e, "role");
        z12Var.b().b(this.a, "interactionSource");
        z12Var.b().b(null, "indicationNodeFactory");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((s60) k13Var).y0(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}

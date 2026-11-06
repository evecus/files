package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ba1 extends q13 {
    public final ea5 a;
    public final y95 b;
    public final y95 c;
    public final y95 d;
    public final ta1 e;
    public final bc1 f;
    public final on4 g;
    public final rm1 h;
    public final ca1 i;

    public ba1(ea5 ea5Var, y95 y95Var, y95 y95Var2, y95 y95Var3, ta1 ta1Var, bc1 bc1Var, on4 on4Var, rm1 rm1Var, ca1 ca1Var) {
        this.a = ea5Var;
        this.b = y95Var;
        this.c = y95Var2;
        this.d = y95Var3;
        this.e = ta1Var;
        this.f = bc1Var;
        this.g = on4Var;
        this.h = rm1Var;
        this.i = ca1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new sa1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ba1)) {
            return false;
        }
        ba1 ba1Var = (ba1) obj;
        return j42.c(ba1Var.a, this.a) && j42.c(ba1Var.b, this.b) && j42.c(ba1Var.c, this.c) && j42.c(ba1Var.d, this.d) && ba1Var.e.equals(this.e) && j42.c(ba1Var.f, this.f) && ba1Var.g == this.g && ba1Var.h == this.h && j42.c(ba1Var.i, this.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y95 y95Var = this.b;
        int hashCode2 = (hashCode + (y95Var != null ? y95Var.hashCode() : 0)) * 31;
        y95 y95Var2 = this.c;
        int hashCode3 = (hashCode2 + (y95Var2 != null ? y95Var2.hashCode() : 0)) * 31;
        y95 y95Var3 = this.d;
        return this.g.hashCode() + (this.i.hashCode() * 31) + ((this.h.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (y95Var3 != null ? y95Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("enterExitTransition");
        z12Var.b().b(this.a, "transition");
        z12Var.b().b(this.b, "sizeAnimation");
        z12Var.b().b(this.c, "offsetAnimation");
        z12Var.b().b(this.d, "slideAnimation");
        z12Var.b().b(this.e, "enter");
        z12Var.b().b(this.f, "exit");
        z12Var.b().b(this.g, "mutableTransformState");
        z12Var.b().b(this.i, "graphicsLayerBlock");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        sa1 sa1Var = (sa1) k13Var;
        sa1Var.I = this.a;
        sa1Var.J = this.b;
        sa1Var.K = this.c;
        sa1Var.L = this.d;
        sa1Var.M = this.e;
        sa1Var.N = this.f;
        sa1Var.O = this.g;
        sa1Var.P = this.h;
        sa1Var.Q = this.i;
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class k31 extends q13 {
    public static final m90 i = new m90((byte) 22);
    public final qr4 a;
    public final pg3 b;
    public final boolean c;
    public final t33 d;
    public final boolean e;
    public final in1 f;
    public final in1 g;
    public final boolean h;

    public k31(qr4 qr4Var, pg3 pg3Var, boolean z, t33 t33Var, boolean z2, in1 in1Var, in1 in1Var2, boolean z3) {
        this.a = qr4Var;
        this.b = pg3Var;
        this.c = z;
        this.d = t33Var;
        this.e = z2;
        this.f = in1Var;
        this.g = in1Var2;
        this.h = z3;
    }

    @Override // defpackage.q13
    public final k13 create() {
        p31 p31Var = new p31(i, this.c, this.d, this.b);
        p31Var.d0 = this.a;
        p31Var.e0 = this.e;
        p31Var.f0 = this.f;
        p31Var.g0 = this.g;
        p31Var.h0 = this.h;
        return p31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k31.class != obj.getClass()) {
            return false;
        }
        k31 k31Var = (k31) obj;
        return j42.c(this.a, k31Var.a) && this.b == k31Var.b && this.c == k31Var.c && j42.c(this.d, k31Var.d) && this.e == k31Var.e && j42.c(this.f, k31Var.f) && j42.c(this.g, k31Var.g) && this.h == k31Var.h;
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31;
        t33 t33Var = this.d;
        return ((this.g.hashCode() + ((this.f.hashCode() + ((((hashCode + (t33Var != null ? t33Var.hashCode() : 0)) * 31) + (this.e ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.h ? 1231 : 1237);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "draggable";
        fq fqVar = z12Var.c;
        fqVar.b(this.b, "orientation");
        fqVar.b(Boolean.valueOf(this.c), "enabled");
        fqVar.b(Boolean.valueOf(this.h), "reverseDirection");
        fqVar.b(this.d, "interactionSource");
        fqVar.b(Boolean.valueOf(this.e), "startDragImmediately");
        fqVar.b(this.f, "onDragStarted");
        fqVar.b(this.g, "onDragStopped");
        fqVar.b(this.a, "state");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        boolean z;
        boolean z2;
        p31 p31Var = (p31) k13Var;
        qr4 qr4Var = p31Var.d0;
        qr4 qr4Var2 = this.a;
        if (j42.c(qr4Var, qr4Var2)) {
            z = false;
        } else {
            p31Var.d0 = qr4Var2;
            z = true;
        }
        boolean z3 = p31Var.h0;
        boolean z4 = this.h;
        if (z3 != z4) {
            p31Var.h0 = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        p31Var.f0 = this.f;
        p31Var.g0 = this.g;
        p31Var.e0 = this.e;
        p31Var.D0(i, this.c, this.d, this.b, z2);
    }
}

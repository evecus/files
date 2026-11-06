package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class hy4 extends q13 {
    public final rm1 a;

    public hy4(rm1 rm1Var) {
        this.a = rm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new iy4(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hy4) {
            return this.a == ((hy4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "stylusHandwriting";
        z12Var.c.b(this.a, "onHandwritingSlopExceeded");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((iy4) k13Var).K = this.a;
    }
}

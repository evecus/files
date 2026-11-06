package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class iy extends q13 {
    public final hy a;

    public iy(hy hyVar) {
        this.a = hyVar;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new ly(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iy) {
            return j42.c(this.a, ((iy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "bringIntoViewResponder";
        z12Var.c.b(this.a, "responder");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((ly) k13Var).I = this.a;
    }
}

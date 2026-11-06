package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class ki3 extends q13 {
    public final ji3 a;
    public final tf2 b;

    public ki3(ji3 ji3Var, tf2 tf2Var) {
        this.a = ji3Var;
        this.b = tf2Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        mi3 mi3Var = new mi3();
        mi3Var.I = this.a;
        return mi3Var;
    }

    public final boolean equals(Object obj) {
        ki3 ki3Var = obj instanceof ki3 ? (ki3) obj : null;
        if (ki3Var == null) {
            return false;
        }
        return j42.c(this.a, ki3Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        this.b.invoke(z12Var);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((mi3) k13Var).I = this.a;
    }
}

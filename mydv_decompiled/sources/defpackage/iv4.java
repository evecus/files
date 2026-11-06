package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class iv4 extends q13 {
    public final hv4 a;

    public iv4(hv4 hv4Var) {
        this.a = hv4Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        jv4 jv4Var = new jv4();
        jv4Var.I = this.a;
        return jv4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv4) && this.a == ((iv4) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StageVideoElement(state=" + this.a + ")";
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((jv4) k13Var).I = this.a;
    }
}

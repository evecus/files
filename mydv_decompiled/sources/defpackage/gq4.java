package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class gq4 extends q13 {
    public final qb5 a;

    public gq4(qb5 qb5Var) {
        this.a = qb5Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new jq4(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gq4) || !((gq4) obj).a.equals(this.a)) {
            return false;
        }
        vv vvVar = q8.J;
        return vvVar.equals(vvVar);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.a.hashCode() * 31)) * 31;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "animateContentSize";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "animationSpec");
        fqVar.b(q8.J, "alignment");
        fqVar.b(null, "finishedListener");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((jq4) k13Var).I = this.a;
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class e8 extends q13 {
    public final bj1 a;

    public e8(bj1 bj1Var) {
        this.a = bj1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        f8 f8Var = new f8();
        f8Var.K = this.a;
        v1 v1Var = new v1(f8Var, (byte) 2);
        d8 d8Var = new d8();
        d8Var.I = v1Var;
        f8Var.j0(d8Var);
        return f8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e8) {
            return this.a == ((e8) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "addTextContextMenuDataComponentsWithResources";
        z12Var.c.b(this.a, "builder");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((f8) k13Var).K = this.a;
    }
}

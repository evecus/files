package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class d15 extends q13 {
    public final tm1 a;

    public d15(tm1 tm1Var) {
        this.a = tm1Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        e15 e15Var = new e15(j42.w);
        e15Var.L = this.a;
        return e15Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d15) {
            return this.a == ((d15) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        e15 e15Var = (e15) k13Var;
        tm1 tm1Var = e15Var.L;
        tm1 tm1Var2 = this.a;
        if (tm1Var != tm1Var2) {
            e15Var.L = tm1Var2;
            dw5 dw5Var = e15Var.M;
            if (dw5Var != null) {
                vu5 vu5Var = (vu5) tm1Var2.invoke(dw5Var);
                if (j42.c(vu5Var, e15Var.K)) {
                    return;
                }
                e15Var.K = vu5Var;
                e15Var.j0();
            }
        }
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}

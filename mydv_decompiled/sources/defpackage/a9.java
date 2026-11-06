package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class a9 extends q13 {
    public final v8 a;
    public final long b;
    public final long c;

    public a9(v8 v8Var, long j, long j2) {
        this.a = v8Var;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.q13
    public final k13 create() {
        b9 b9Var = new b9();
        b9Var.I = this.a;
        b9Var.J = this.b;
        b9Var.K = this.c;
        return b9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        a9 a9Var = obj instanceof a9 ? (a9) obj : null;
        return a9Var != null && j42.c(this.a, a9Var.a) && p65.a(this.b, a9Var.b) && p65.a(this.c, a9Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q65[] q65VarArr = p65.b;
        return i82.Q(this.c) + ((i82.Q(this.b) + hashCode) * 31);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        b9 b9Var = (b9) k13Var;
        b9Var.I = this.a;
        b9Var.J = this.b;
        b9Var.K = this.c;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}

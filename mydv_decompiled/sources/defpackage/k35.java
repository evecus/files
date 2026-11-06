package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class k35 extends q13 {
    public final v05 a;
    public final o45 b;
    public final p45 c;
    public final ck0 d;

    public k35(v05 v05Var, o45 o45Var, p45 p45Var, ck0 ck0Var) {
        this.a = v05Var;
        this.b = o45Var;
        this.c = p45Var;
        this.d = ck0Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new l35(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k35)) {
            return false;
        }
        k35 k35Var = (k35) obj;
        return this.a == k35Var.a && this.b == k35Var.b && this.c == k35Var.c && this.d == k35Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        l35 l35Var = (l35) k13Var;
        l35Var.K.a = null;
        v05 v05Var = this.a;
        l35Var.K = v05Var;
        v05Var.a = l35Var;
        v05Var.b = l35Var.isAttached() ? v85.K : v85.J;
        l35Var.L = this.b;
        l35Var.M = this.c;
        l35Var.N = this.d;
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
    }
}

package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ic4 extends q13 {
    public final sb4 a;
    public final boolean b;

    public ic4(sb4 sb4Var, boolean z) {
        this.a = sb4Var;
        this.b = z;
    }

    @Override // defpackage.q13
    public final k13 create() {
        pb4 pb4Var = new pb4();
        pb4Var.I = this.a;
        pb4Var.J = this.b;
        return pb4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic4)) {
            return false;
        }
        ic4 ic4Var = (ic4) obj;
        return j42.c(this.a, ic4Var.a) && this.b == ic4Var.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1237) * 31) + (this.b ? 1231 : 1237);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "scroll";
        fq fqVar = z12Var.c;
        fqVar.b(this.a, "state");
        fqVar.b(Boolean.FALSE, "reverseScrolling");
        fqVar.b(Boolean.valueOf(this.b), "isVertical");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        pb4 pb4Var = (pb4) k13Var;
        pb4Var.I = this.a;
        pb4Var.J = this.b;
    }
}

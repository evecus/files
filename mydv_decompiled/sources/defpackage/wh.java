package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class wh<S> extends q13 {
    public final y95 a;
    public final t43 b;
    public final ai c;

    public wh(y95 y95Var, t43 t43Var, ai aiVar) {
        this.a = y95Var;
        this.b = t43Var;
        this.c = aiVar;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new zh(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wh)) {
            return false;
        }
        wh whVar = (wh) obj;
        return j42.c(whVar.a, this.a) && whVar.b.equals(this.b);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        y95 y95Var = this.a;
        return this.b.hashCode() + ((hashCode + (y95Var != null ? y95Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("sizeTransform");
        z12Var.b().b(this.a, "sizeAnimation");
        z12Var.b().b(this.b, "sizeTransform");
        z12Var.b().b(this.c, "scope");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        zh zhVar = (zh) k13Var;
        zhVar.I = this.a;
        zhVar.J = this.b;
        zhVar.K = this.c;
    }
}

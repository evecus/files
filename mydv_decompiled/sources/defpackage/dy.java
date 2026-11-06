package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class dy extends q13 {
    public final fy a;

    public dy(fy fyVar) {
        this.a = fyVar;
    }

    @Override // defpackage.q13
    public final k13 create() {
        gy gyVar = new gy();
        gyVar.I = this.a;
        return gyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dy) {
            return j42.c(this.a, ((dy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "bringIntoViewRequester";
        z12Var.c.b(this.a, "bringIntoViewRequester");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        gy gyVar = (gy) k13Var;
        fy fyVar = gyVar.I;
        if (fyVar != null) {
            fyVar.a.k(gyVar);
        }
        fy fyVar2 = this.a;
        if (fyVar2 != null) {
            fyVar2.a.c(gyVar);
        }
        gyVar.I = fyVar2;
    }
}

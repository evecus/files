package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class yx extends q13 {
    public final kg a;

    public yx(kg kgVar) {
        this.a = kgVar;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new ay(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yx) {
            return this.a == ((yx) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.d("requestRectangleBringIntoViewBridge");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ay ayVar = (ay) k13Var;
        kg kgVar = this.a;
        ayVar.I = kgVar;
        if (ayVar.isAttached()) {
            kgVar.invoke(ayVar.J);
        }
    }
}

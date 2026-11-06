package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class y25 extends q13 {
    public final n45 a;

    public y25(n45 n45Var) {
        this.a = n45Var;
    }

    @Override // defpackage.q13
    public final k13 create() {
        return new a35(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y25) {
            return this.a == ((y25) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.q13
    public final void inspectableProperties(z12 z12Var) {
        z12Var.a = "TextContextMenuGestures";
        z12Var.c.b(this.a, "onPreShowContextMenu");
    }

    @Override // defpackage.q13
    public final void update(k13 k13Var) {
        ((a35) k13Var).K = this.a;
    }
}

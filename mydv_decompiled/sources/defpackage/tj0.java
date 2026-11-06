package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class tj0 extends k13 implements pi4 {
    public boolean I;
    public tm1 J;

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        this.J.invoke(cj4Var);
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return this.I;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return true;
    }
}

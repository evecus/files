package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class cx extends wt0 implements pi4 {
    public uw K;
    public float L;
    public rt4 M;
    public dn4 N;
    public final k00 O;

    public cx(float f, rt4 rt4Var, dn4 dn4Var) {
        this.L = f;
        this.M = rt4Var;
        this.N = dn4Var;
        k00 k00Var = new k00(new m00(), new i9(this, (byte) 3));
        j0(k00Var);
        this.O = k00Var;
    }

    @Override // defpackage.pi4
    public final void applySemantics(cj4 cj4Var) {
        aj4.d(cj4Var, this.N);
    }

    @Override // defpackage.k13
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // defpackage.pi4
    public final boolean isImportantForBounds() {
        return false;
    }
}

package coil3.compose.internal;

import defpackage.c80;
import defpackage.ni0;
import defpackage.rj3;
import defpackage.u8;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SubcomposeContentPainterNode extends AbstractContentPainterNode {
    public static final int $stable = 8;
    private rj3 painter;

    public SubcomposeContentPainterNode(rj3 rj3Var, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, String str) {
        super(u8Var, ni0Var, f, c80Var, z, str, null);
        this.painter = rj3Var;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public rj3 getPainter() {
        return this.painter;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode, defpackage.pi4
    public boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode, defpackage.pi4
    public boolean getShouldMergeDescendantSemantics() {
        return false;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode, defpackage.pi4
    public boolean isImportantForBounds() {
        return true;
    }

    public void setPainter(rj3 rj3Var) {
        this.painter = rj3Var;
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode, defpackage.k13
    public void onDensityChange() {
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode, defpackage.k13
    public void onLayoutDirectionChange() {
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode, defpackage.w31
    public void onMeasureResultChanged() {
    }
}

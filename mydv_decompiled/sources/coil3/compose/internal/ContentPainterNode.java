package coil3.compose.internal;

import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import defpackage.c80;
import defpackage.ni0;
import defpackage.u8;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ContentPainterNode extends AbstractContentPainterNode {
    public static final int $stable = 8;
    private final AsyncImagePainter painter;

    public ContentPainterNode(AsyncImagePainter asyncImagePainter, u8 u8Var, ni0 ni0Var, float f, c80 c80Var, boolean z, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        super(u8Var, ni0Var, f, c80Var, z, str, constraintsSizeResolver);
        this.painter = asyncImagePainter;
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

    @Override // defpackage.k13
    public void onAttach() {
        getPainter().setScope$io_coil_kt_coil3_coil_compose_core(getCoroutineScope());
        getPainter().onRemembered();
    }

    @Override // defpackage.k13
    public void onDetach() {
        getPainter().onForgotten();
    }

    @Override // defpackage.k13
    public void onReset() {
        getPainter().set_input$io_coil_kt_coil3_coil_compose_core(null);
    }

    @Override // coil3.compose.internal.AbstractContentPainterNode
    public AsyncImagePainter getPainter() {
        return this.painter;
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

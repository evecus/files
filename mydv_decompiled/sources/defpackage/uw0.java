package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uw0 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        or5 or5Var;
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                break;
            default:
                if ((view instanceof or5) && (outline2 = (or5Var = (or5) view).M) != null) {
                    outline.set(outline2);
                    float f = or5Var.S;
                    if (f != 0.0f || or5Var.T != 0.0f) {
                        outline.offset((int) f, (int) or5Var.T);
                        break;
                    }
                }
                break;
        }
    }
}

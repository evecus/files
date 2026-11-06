package defpackage;

import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class wi1 extends k13 implements ii1 {
    @Override // defpackage.ii1
    public final void s(ei1 ei1Var) {
        View x = rt0.x(this);
        ei1Var.e(getNode().isAttached() && rt0.x(this).hasFocusable());
        View findFocus = x.findFocus();
        if (findFocus != null) {
            ei1Var.g(yh1.a(findFocus, x));
        }
    }
}

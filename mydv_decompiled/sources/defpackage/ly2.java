package defpackage;

import android.view.ActionProvider;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ly2 implements ActionProvider.VisibilityListener {
    public uu2 a;
    public final ActionProvider b;

    public ly2(oy2 oy2Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        uu2 uu2Var = this.a;
        if (uu2Var != null) {
            sx2 sx2Var = ((ky2) uu2Var.I).n;
            sx2Var.h = true;
            sx2Var.q(true);
        }
    }
}

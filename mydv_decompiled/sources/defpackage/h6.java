package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class h6 implements Runnable {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ActionBarOverlayLayout J;

    public /* synthetic */ h6(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.I = b;
        this.J = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.I;
        ActionBarOverlayLayout actionBarOverlayLayout = this.J;
        switch (b) {
            case 0:
                actionBarOverlayLayout.i();
                actionBarOverlayLayout.k0 = actionBarOverlayLayout.L.animate().translationY(0.0f).setListener(actionBarOverlayLayout.l0);
                break;
            default:
                actionBarOverlayLayout.i();
                actionBarOverlayLayout.k0 = actionBarOverlayLayout.L.animate().translationY(-actionBarOverlayLayout.L.getHeight()).setListener(actionBarOverlayLayout.l0);
                break;
        }
    }
}

package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qy2 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ry2 I;

    public qy2(ry2 ry2Var) {
        this.I = ry2Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.I.c();
    }
}

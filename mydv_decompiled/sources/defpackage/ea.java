package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class ea implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ int J;

    public /* synthetic */ ea(byte b, int i) {
        this.I = b;
        this.J = i;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean requestFocusBypassUnfocusableComposeView$lambda$0;
        byte b = this.I;
        int i = this.J;
        ui1 ui1Var = (ui1) obj;
        switch (b) {
            case 0:
                requestFocusBypassUnfocusableComposeView$lambda$0 = AndroidComposeView.requestFocusBypassUnfocusableComposeView$lambda$0(i, ui1Var);
                break;
            case 1:
                requestFocusBypassUnfocusableComposeView$lambda$0 = AndroidComposeView.requestFocusBypassUnfocusableComposeView$lambda$1(i, ui1Var);
                break;
            default:
                requestFocusBypassUnfocusableComposeView$lambda$0 = ui1Var.j0(i);
                break;
        }
        return Boolean.valueOf(requestFocusBypassUnfocusableComposeView$lambda$0);
    }
}

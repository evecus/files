package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class jg implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ir5 J;
    public final /* synthetic */ wa2 K;

    public /* synthetic */ jg(ir5 ir5Var, wa2 wa2Var, byte b) {
        this.I = b;
        this.J = ir5Var;
        this.K = wa2Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        WindowInsets b;
        byte b2 = this.I;
        wd5 wd5Var = wd5.a;
        wa2 wa2Var = this.K;
        ir5 ir5Var = this.J;
        switch (b2) {
            case 0:
                j42.J(ir5Var, wa2Var);
                ir5Var.K.onInteropViewLayoutChange(ir5Var);
                int[] iArr = ir5Var.V;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = ir5Var.J;
                view.getLocationOnScreen(iArr);
                long j = ir5Var.W;
                long o = ((ca2) obj).o();
                ir5Var.W = o;
                yv5 yv5Var = ir5Var.a0;
                if (yv5Var != null && ((i != iArr[0] || i2 != iArr[1] || !z22.b(j, o)) && (b = ir5Var.m(yv5Var).b()) != null)) {
                    view.dispatchApplyWindowInsets(b);
                    break;
                }
                break;
            case 1:
                View view2 = ir5Var.J;
                qh3 qh3Var = (qh3) obj;
                AndroidComposeView androidComposeView = qh3Var instanceof AndroidComposeView ? (AndroidComposeView) qh3Var : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(ir5Var, wa2Var);
                }
                if (view2.getParent() != ir5Var) {
                    ir5Var.addView(view2);
                    break;
                }
                break;
            default:
                j42.J(ir5Var, wa2Var);
                break;
        }
        return wd5Var;
    }
}

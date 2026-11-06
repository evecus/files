package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class kg implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ ir5 J;

    public /* synthetic */ kg(ir5 ir5Var, byte b) {
        this.I = b;
        this.J = ir5Var;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        ir5 ir5Var = this.J;
        switch (b) {
            case 0:
                ir5Var.b0 = (tm1) obj;
                return wd5Var;
            case 1:
                qh3 qh3Var = (qh3) obj;
                AndroidComposeView androidComposeView = qh3Var instanceof AndroidComposeView ? (AndroidComposeView) qh3Var : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(ir5Var);
                }
                ir5Var.removeAllViewsInLayout();
                return wd5Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = ir5Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = ir5Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}

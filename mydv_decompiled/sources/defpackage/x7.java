package defpackage;

import android.view.ActionMode;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.media3.ui.AspectRatioFrameLayout;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x7 implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                t7 t7Var = ((p7) obj).a;
                if (t7Var == null) {
                    zy.i("Launcher has not been initialized");
                    break;
                } else {
                    t7Var.L0();
                    break;
                }
            case 1:
                vw0 vw0Var = (vw0) obj;
                vw0Var.dismiss();
                vw0Var.P.e();
                break;
            case 2:
                vq3 vq3Var = (vq3) obj;
                vq3Var.e();
                ViewTreeLifecycleOwner.set(vq3Var, null);
                vq3Var.a0.removeViewImmediate(vq3Var);
                break;
            case 3:
                qf qfVar = (qf) obj;
                kt4 kt4Var = qfVar.e;
                sr srVar = kt4Var.h;
                if (srVar != null) {
                    srVar.a();
                }
                kt4Var.a();
                ActionMode actionMode = qfVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                qfVar.h = null;
                break;
            case 4:
                av avVar = (av) ((bv) obj).c.getValue();
                if (avVar != null) {
                    avVar.close();
                    break;
                }
                break;
            case 5:
                ((u45) obj).m();
                break;
            case 6:
                r41 r41Var = (r41) obj;
                if (r41Var != null) {
                    r41Var.d();
                }
                if (r41Var != null) {
                    r41Var.h = 0.0f;
                    AspectRatioFrameLayout aspectRatioFrameLayout = r41Var.g;
                    if (aspectRatioFrameLayout != null) {
                        aspectRatioFrameLayout.setAspectRatio(0.0f);
                        break;
                    }
                }
                break;
            default:
                tm1 tm1Var = (tm1) obj;
                if (tm1Var != null) {
                    tm1Var.invoke(null);
                    break;
                }
                break;
        }
    }
}

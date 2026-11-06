package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hf implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ qf J;

    public /* synthetic */ hf(qf qfVar, byte b) {
        this.I = b;
        this.J = qfVar;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        byte b = this.I;
        wd5 wd5Var = wd5.a;
        qf qfVar = this.J;
        switch (b) {
            case 0:
                rm1 rm1Var = (rm1) obj;
                View view = qfVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    rm1Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new kf(rm1Var, (byte) 0));
                    }
                }
                return wd5Var;
            case 1:
                ActionMode actionMode = qfVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return wd5Var;
            case 2:
                ActionMode actionMode2 = qfVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return wd5Var;
            default:
                qfVar.e.e();
                return new x7(qfVar, (byte) 3);
        }
    }
}

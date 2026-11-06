package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dg2 implements zx0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dg2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zx0
    public final void dispose() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((eg2) obj2).K.k(obj);
                break;
            case 1:
                Iterator it = ((List) ((cw4) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((jd0) obj).b().c((p63) it.next());
                }
                break;
            case 2:
                kt ktVar = (kt) obj2;
                qd0 qd0Var = (qd0) obj;
                if (ktVar.a == null) {
                    if (ktVar.b == null) {
                        zy.i("Unreachable");
                        break;
                    } else {
                        qd0Var.a.e();
                        break;
                    }
                } else {
                    qd0Var.b.e();
                    break;
                }
            case 3:
                ((ea5) obj2).k.remove((ea5) obj);
                break;
            case 4:
                ea5 ea5Var = (ea5) obj2;
                ea5Var.getClass();
                x95 x95Var = (x95) ((y95) obj).b.getValue();
                if (x95Var != null) {
                    ea5Var.j.remove(x95Var.I);
                    break;
                }
                break;
            default:
                dw5 dw5Var = (dw5) obj2;
                View view = (View) obj;
                int i = dw5Var.u - 1;
                dw5Var.u = i;
                if (i == 0) {
                    WeakHashMap weakHashMap = dr5.a;
                    vq5.c(view, null);
                    ev5.a(view, null);
                    view.removeOnAttachStateChangeListener(dw5Var.v);
                    break;
                }
                break;
        }
    }
}

package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class oe implements tm1 {
    public final /* synthetic */ byte I;
    public final /* synthetic */ Object J;

    public /* synthetic */ oe(Object obj, byte b) {
        this.I = b;
        this.J = obj;
    }

    @Override // defpackage.tm1
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.I) {
            case 0:
                an3.i((an3) obj, (bn3) this.J, 0, 0);
                return wd5.a;
            case 1:
                an3 an3Var = (an3) obj;
                ArrayList arrayList = (ArrayList) this.J;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        an3.i(an3Var, (bn3) arrayList.get(i), 0, 0);
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return wd5.a;
            case 2:
                ((bu3) this.J).d(null);
                return wd5.a;
            case 3:
                k32 k32Var = (k32) this.J;
                synchronized (k32Var.L) {
                    k32Var.M = (byte) 5;
                    k32Var.O = null;
                }
                return wd5.a;
            case 4:
                KeyEvent keyEvent = ((l82) obj).a;
                keyEvent.getClass();
                if (j82.a(e21.b(keyEvent.getKeyCode()), j82.a) && e21.C(keyEvent) == 1) {
                    ((rm1) this.J).invoke();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                k10 k10Var = (k10) this.J;
                wd5 wd5Var = wd5.a;
                k10Var.resumeWith(wd5Var);
                return wd5Var;
            case 6:
                Throwable th = (Throwable) obj;
                q05 q05Var = (q05) this.J;
                k10 k10Var2 = q05Var.K;
                if (k10Var2 != null) {
                    k10Var2.j(th);
                }
                q05Var.K = null;
                return wd5.a;
            default:
                float[] fArr = ((nw2) obj).a;
                ca2 ca2Var = (ca2) this.J;
                if (ca2Var.h()) {
                    mu0.q(ca2Var).j(ca2Var, fArr);
                }
                return wd5.a;
        }
    }
}

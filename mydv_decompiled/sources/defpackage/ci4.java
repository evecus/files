package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class ci4 {
    public static final hn3 a = n84.T;

    public static final boolean a(kp3 kp3Var) {
        MotionEvent a2;
        List list = kp3Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((rp3) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = kp3Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = kp3Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}

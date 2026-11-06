package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class e15 extends u12 {
    public tm1 L;
    public dw5 M;

    @Override // defpackage.u12, defpackage.k13
    public final void onAttach() {
        View T = vt0.T(this);
        WeakHashMap weakHashMap = dw5.w;
        dw5 m = wi4.m(T);
        m.a(T);
        vu5 vu5Var = (vu5) this.L.invoke(m);
        if (!j42.c(vu5Var, this.K)) {
            this.K = vu5Var;
            j0();
        }
        this.M = m;
        super.onAttach();
    }

    @Override // defpackage.u12, defpackage.k13
    public final void onDetach() {
        View T = vt0.T(this);
        dw5 dw5Var = this.M;
        if (dw5Var != null) {
            int i = dw5Var.u - 1;
            dw5Var.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = dr5.a;
                vq5.c(T, null);
                ev5.a(T, null);
                T.removeOnAttachStateChangeListener(dw5Var.v);
            }
        }
        super.onDetach();
    }
}

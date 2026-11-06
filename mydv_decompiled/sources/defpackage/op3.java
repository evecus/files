package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class op3 extends lv1 {
    @Override // defpackage.la5
    public final Object g() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.lv1
    public final void k0(pp3 pp3Var) {
        qp3 qp3Var = (qp3) j42.r(this, hf0.w);
        if (qp3Var != null) {
            ya yaVar = (ya) qp3Var;
            if (pp3Var == null) {
                pp3.a.getClass();
                pp3Var = i42.k;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                ob.a.a(yaVar.b, pp3Var);
            }
        }
    }
}

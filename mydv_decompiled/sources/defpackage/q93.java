package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class q93 extends eu {
    public static final String b = fr2.h("NetworkNotRoamingCtrlr");

    @Override // defpackage.og0
    public final boolean c(ky5 ky5Var) {
        ky5Var.getClass();
        return ky5Var.j.a == x93.L;
    }

    @Override // defpackage.eu
    public final int d() {
        return 7;
    }

    @Override // defpackage.eu
    public final boolean e(Object obj) {
        t93 t93Var = (t93) obj;
        t93Var.getClass();
        boolean z = t93Var.a;
        if (Build.VERSION.SDK_INT >= 24) {
            return (z && t93Var.d) ? false : true;
        }
        fr2.e().a(b, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
        return !z;
    }
}

package defpackage;

import android.net.ConnectivityManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s93 implements og0 {
    public final ConnectivityManager a;

    public s93(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.og0
    public final boolean a(ky5 ky5Var) {
        if (!c(ky5Var)) {
            return false;
        }
        zy.i("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.og0
    public final u00 b(ch0 ch0Var) {
        ch0Var.getClass();
        return new u00(new o1((Object) ch0Var, (Object) this, (fj0) null, (byte) 10));
    }

    @Override // defpackage.og0
    public final boolean c(ky5 ky5Var) {
        ky5Var.getClass();
        return ky5Var.j.a() != null;
    }
}

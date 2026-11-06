package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class w93 extends uy {
    public final ConnectivityManager g;

    public w93(Context context, mc3 mc3Var) {
        super(context, mc3Var);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.g = (ConnectivityManager) systemService;
    }

    @Override // defpackage.pg0
    public final Object a() {
        return v93.a(this.g);
    }

    @Override // defpackage.uy
    public final void f(Intent intent) {
        if (j42.c(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            fr2.e().a(v93.a, "Network broadcast received");
            b(v93.a(this.g));
        }
    }
}

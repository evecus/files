package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class u93 extends pg0 {
    public final ConnectivityManager f;
    public final c02 g;

    public u93(Context context, mc3 mc3Var) {
        super(context, mc3Var);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new c02(this, (byte) 1);
    }

    @Override // defpackage.pg0
    public final Object a() {
        return v93.a(this.f);
    }

    @Override // defpackage.pg0
    public final void c() {
        try {
            fr2.e().a(v93.a, "Registering network callback");
            g7.q(this.f, this.g);
        } catch (IllegalArgumentException e) {
            fr2.e().d(v93.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            fr2.e().d(v93.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.pg0
    public final void d() {
        try {
            fr2.e().a(v93.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.g);
        } catch (IllegalArgumentException e) {
            fr2.e().d(v93.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            fr2.e().d(v93.a, "Received exception while unregistering network callback", e2);
        }
    }
}

package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c02 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ byte a;
    public final Object b;

    public c02(be beVar) {
        this.a = (byte) 0;
        this.b = beVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 2:
                network.getClass();
                ((bu3) this.b).d(wd5.a);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                network.getClass();
                networkCapabilities.getClass();
                fr2.e().a(fx5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((be) obj).invoke(fh0.a);
                break;
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                fr2.e().a(v93.a, "Network capabilities changed: " + networkCapabilities);
                u93 u93Var = (u93) obj;
                u93Var.b(Build.VERSION.SDK_INT >= 28 ? new t93(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : v93.a(u93Var.f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 2:
                network.getClass();
                linkProperties.getClass();
                ((bu3) this.b).d(wd5.a);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        byte b = this.a;
        Object obj = this.b;
        network.getClass();
        switch (b) {
            case 0:
                fr2.e().a(fx5.a, "NetworkRequestConstraintController onLost callback");
                ((be) obj).invoke(new gh0(7));
                break;
            case 1:
                fr2.e().a(v93.a, "Network connection lost");
                u93 u93Var = (u93) obj;
                u93Var.b(v93.a(u93Var.f));
                break;
            default:
                ((bu3) obj).d(wd5.a);
                break;
        }
    }

    public /* synthetic */ c02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}

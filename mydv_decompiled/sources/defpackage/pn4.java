package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pn4 extends ConnectivityManager.NetworkCallback {
    public static final pn4 a = new pn4();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;

    public static jt2 a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, be beVar) {
        NetworkCapabilities networkCapabilities;
        synchronized (b) {
            try {
                LinkedHashMap linkedHashMap = c;
                boolean isEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(beVar, networkRequest);
                if (isEmpty) {
                    fr2.e().a(fx5.a, "NetworkRequestConstraintController register shared callback");
                    connectivityManager.registerDefaultNetworkCallback(a);
                }
                fr2.e().a(fx5.a, "NetworkRequestConstraintController send initial capabilities");
                a.getClass();
                if (e) {
                    networkCapabilities = d;
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    d = networkCapabilities;
                    e = true;
                }
                beVar.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? fh0.a : new gh0(7));
            } catch (Throwable th) {
                throw th;
            }
        }
        return new jt2((Object) beVar, (Object) connectivityManager, (byte) 25);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        fr2.e().a(fx5.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            try {
                d = networkCapabilities;
                for (Map.Entry entry : c.entrySet()) {
                    ((tm1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? fh0.a : new gh0(7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        fr2.e().a(fx5.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((tm1) it.next()).invoke(new gh0(7));
            }
        }
    }
}

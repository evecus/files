package defpackage;

import android.os.Build;
import android.util.Log;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pj0 {
    public static String a() {
        String str = Build.MODEL;
        if (str == null) {
            str = "Unknown Device";
        }
        String str2 = Build.BRAND;
        if (str2 == null) {
            str2 = "";
        }
        if (qx4.y(str, str2, true)) {
            return str;
        }
        return jx4.g0(str2 + " " + str).toString();
    }

    public static String b() {
        String hostAddress;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                q70 q70Var = new q70(networkInterfaces);
                String str = null;
                while (q70Var.hasNext()) {
                    NetworkInterface networkInterface = (NetworkInterface) q70Var.next();
                    if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                        String name = networkInterface.getName();
                        name.getClass();
                        boolean z = qx4.y(name, "wlan", false) || qx4.y(name, "eth", false);
                        Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                        inetAddresses.getClass();
                        q70 q70Var2 = new q70(inetAddresses);
                        while (q70Var2.hasNext()) {
                            InetAddress inetAddress = (InetAddress) q70Var2.next();
                            if ((inetAddress instanceof Inet4Address) && !((Inet4Address) inetAddress).isLoopbackAddress() && !((Inet4Address) inetAddress).isLinkLocalAddress() && (hostAddress = ((Inet4Address) inetAddress).getHostAddress()) != null) {
                                if (z) {
                                    return hostAddress;
                                }
                                if (str == null) {
                                    str = hostAddress;
                                }
                            }
                        }
                    }
                }
                if (str != null) {
                    return str;
                }
            }
            return "0.0.0.0";
        } catch (Exception e) {
            Log.e("CookieServer", "获取 IP 失败", e);
            return "0.0.0.0";
        }
    }
}

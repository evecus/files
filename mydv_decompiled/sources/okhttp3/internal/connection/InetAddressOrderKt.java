package okhttp3.internal.connection;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Route;
import okhttp3.internal._UtilCommonKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class InetAddressOrderKt {
    public static final List<Route> reorderForHappyEyeballs(List<Route> list) {
        list.getClass();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((Route) obj).socketAddress().getAddress() instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        return (arrayList3.isEmpty() || arrayList4.isEmpty()) ? list : _UtilCommonKt.interleave(arrayList3, arrayList4);
    }
}

package coil3.network;

import coil3.network.NetworkHeaders;
import coil3.network.internal.UtilsKt;
import defpackage.lz;
import defpackage.mz;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CacheNetworkResponse {
    public static final CacheNetworkResponse INSTANCE = new CacheNetworkResponse();

    private CacheNetworkResponse() {
    }

    public final NetworkResponse readFrom(mz mzVar) {
        int parseInt = Integer.parseInt(mzVar.L());
        long parseLong = Long.parseLong(mzVar.L());
        long parseLong2 = Long.parseLong(mzVar.L());
        NetworkHeaders.Builder builder = new NetworkHeaders.Builder();
        int parseInt2 = Integer.parseInt(mzVar.L());
        for (int i = 0; i < parseInt2; i++) {
            UtilsKt.append(builder, mzVar.L());
        }
        return new NetworkResponse(parseInt, parseLong, parseLong2, builder.build(), null, null, 48, null);
    }

    public final void writeTo(NetworkResponse networkResponse, lz lzVar) {
        lzVar.V(networkResponse.getCode()).writeByte(10);
        lzVar.V(networkResponse.getRequestMillis()).writeByte(10);
        lzVar.V(networkResponse.getResponseMillis()).writeByte(10);
        Set<Map.Entry<String, List<String>>> entrySet = networkResponse.getHeaders().asMap().entrySet();
        Iterator<T> it = entrySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        lzVar.V(i).writeByte(10);
        for (Map.Entry<String, List<String>> entry : entrySet) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (it2.hasNext()) {
                lzVar.B(entry.getKey()).B(":").B(it2.next()).writeByte(10);
            }
        }
    }
}

package okhttp3.internal.dns;

import defpackage.o70;
import defpackage.sv2;
import java.io.IOException;
import java.util.List;
import okhttp3.Dns;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class _StateMachineDnsCallKt {
    public static final void onFailure(Dns.Callback callback, Dns.Call call, List<? extends IOException> list) {
        callback.getClass();
        call.getClass();
        list.getClass();
        IOException iOException = (IOException) o70.T0(list);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            sv2.i(iOException, list.get(i));
        }
        callback.onFailure(call, iOException);
    }
}

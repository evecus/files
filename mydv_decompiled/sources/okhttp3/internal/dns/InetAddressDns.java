package okhttp3.internal.dns;

import defpackage.dq;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import okhttp3.Dns;
import okhttp3.internal.concurrent.TaskRunner;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class InetAddressDns implements Dns {
    public static final InetAddressDns INSTANCE = new InetAddressDns();

    private InetAddressDns() {
    }

    @Override // okhttp3.Dns
    public List<InetAddress> lookup(String str) {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return dq.o1(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // okhttp3.Dns
    public final Dns.Call newCall(Dns.Request request) {
        request.getClass();
        return new LookupDnsCall(TaskRunner.INSTANCE, this, request);
    }
}

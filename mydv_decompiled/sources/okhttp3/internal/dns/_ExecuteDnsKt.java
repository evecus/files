package okhttp3.internal.dns;

import defpackage.g54;
import defpackage.h54;
import defpackage.mu0;
import defpackage.u70;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import okhttp3.Dns;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class _ExecuteDnsKt {
    public static final List<Dns.Record> execute(final Dns.Call call) {
        call.getClass();
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        call.enqueue(new Dns.Callback() { // from class: okhttp3.internal.dns._ExecuteDnsKt$execute$1
            private final List<Dns.Record> allRecords = new ArrayList();

            private final void complete(IOException iOException) {
                Object obj;
                List<Dns.Record> list = this.allRecords;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Dns.Record) it.next()) instanceof Dns.Record.IpAddress) {
                            obj = this.allRecords;
                            break;
                        }
                    }
                }
                if (iOException == null) {
                    iOException = new UnknownHostException("DNS returned no addresses for " + Dns.Call.this.getRequest().hostname());
                }
                obj = new g54(iOException);
                linkedBlockingQueue.put(new h54(obj));
            }

            public static /* synthetic */ void complete$default(_ExecuteDnsKt$execute$1 _executednskt_execute_1, IOException iOException, int i, Object obj) {
                if ((i & 1) != 0) {
                    iOException = null;
                }
                _executednskt_execute_1.complete(iOException);
            }

            public final List<Dns.Record> getAllRecords() {
                return this.allRecords;
            }

            @Override // okhttp3.Dns.Callback
            public void onFailure(Dns.Call call2, IOException iOException) {
                call2.getClass();
                iOException.getClass();
                complete(iOException);
            }

            @Override // okhttp3.Dns.Callback
            public void onRecords(Dns.Call call2, boolean z, List<? extends Dns.Record> list) {
                call2.getClass();
                list.getClass();
                u70.I0(this.allRecords, list);
                if (z) {
                    complete$default(this, null, 1, null);
                }
            }
        });
        Object take = linkedBlockingQueue.take();
        take.getClass();
        Object obj = ((h54) take).I;
        mu0.V(obj);
        return (List) obj;
    }
}

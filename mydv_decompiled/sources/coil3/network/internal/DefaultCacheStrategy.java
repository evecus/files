package coil3.network.internal;

import coil3.network.CacheStrategy;
import coil3.network.NetworkRequest;
import coil3.network.NetworkResponse;
import coil3.request.Options;
import defpackage.dq;
import defpackage.er0;
import defpackage.fj0;
import java.util.Set;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DefaultCacheStrategy implements CacheStrategy {
    private static final Companion Companion = new Companion(null);
    private static final Set<Integer> CACHEABLE_STATUS_CODES = dq.p1(new Integer[]{300, 301, 404, 405, 410, 414, 501});

    @Override // coil3.network.CacheStrategy
    public Object read(NetworkResponse networkResponse, NetworkRequest networkRequest, Options options, fj0 fj0Var) {
        return new CacheStrategy.ReadResult(networkResponse);
    }

    @Override // coil3.network.CacheStrategy
    public Object write(NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, Options options, fj0 fj0Var) {
        if (networkResponse2.getCode() == 304 && networkResponse != null) {
            return new CacheStrategy.WriteResult(NetworkResponse.copy$default(networkResponse2, 0, 0L, 0L, UtilsKt.plus(networkResponse.getHeaders(), networkResponse2.getHeaders()), null, null, 39, null));
        }
        int code = networkResponse2.getCode();
        return ((200 > code || code >= 300) && !CACHEABLE_STATUS_CODES.contains(new Integer(networkResponse2.getCode()))) ? CacheStrategy.WriteResult.DISABLED : new CacheStrategy.WriteResult(networkResponse2);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}

package coil3.network;

import coil3.network.internal.DefaultCacheStrategy;
import coil3.request.Options;
import defpackage.er0;
import defpackage.fj0;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface CacheStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CacheStrategy DEFAULT = new DefaultCacheStrategy();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    Object read(NetworkResponse networkResponse, NetworkRequest networkRequest, Options options, fj0 fj0Var);

    Object write(NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, Options options, fj0 fj0Var);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class WriteResult {
        public static final Companion Companion = new Companion(null);
        public static final WriteResult DISABLED = new WriteResult();
        private final NetworkResponse response;

        private WriteResult() {
            this.response = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WriteResult) && j42.c(this.response, ((WriteResult) obj).response);
        }

        public final NetworkResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            NetworkResponse networkResponse = this.response;
            if (networkResponse != null) {
                return networkResponse.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "WriteResult(response=" + this.response + ")";
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            private Companion() {
            }
        }

        public WriteResult(NetworkResponse networkResponse) {
            this.response = networkResponse;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class ReadResult {
        private final NetworkRequest request;
        private final NetworkResponse response;

        public ReadResult(NetworkRequest networkRequest) {
            this.request = networkRequest;
            this.response = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReadResult)) {
                return false;
            }
            ReadResult readResult = (ReadResult) obj;
            return j42.c(this.request, readResult.request) && j42.c(this.response, readResult.response);
        }

        public final NetworkRequest getRequest() {
            return this.request;
        }

        public final NetworkResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            NetworkRequest networkRequest = this.request;
            int hashCode = (networkRequest != null ? networkRequest.hashCode() : 0) * 31;
            NetworkResponse networkResponse = this.response;
            return hashCode + (networkResponse != null ? networkResponse.hashCode() : 0);
        }

        public String toString() {
            return "ReadResult(request=" + this.request + ", response=" + this.response + ")";
        }

        public ReadResult(NetworkResponse networkResponse) {
            this.request = null;
            this.response = networkResponse;
        }
    }
}

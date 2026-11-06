package coil3.network;

import coil3.Extras;
import coil3.network.internal.UtilsKt;
import defpackage.er0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.r7;
import defpackage.su0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NetworkRequest {
    private final NetworkRequestBody body;
    private final Extras extras;
    private final NetworkHeaders headers;
    private final String method;
    private final String url;

    public /* synthetic */ NetworkRequest(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody, Extras extras, int i, er0 er0Var) {
        this(str, (i & 2) != 0 ? UtilsKt.HTTP_METHOD_GET : str2, (i & 4) != 0 ? NetworkHeaders.EMPTY : networkHeaders, (i & 8) != 0 ? null : networkRequestBody, (i & 16) != 0 ? Extras.EMPTY : extras);
    }

    public static /* synthetic */ NetworkRequest copy$default(NetworkRequest networkRequest, String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody, Extras extras, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = networkRequest.method;
        }
        if ((i & 4) != 0) {
            networkHeaders = networkRequest.headers;
        }
        if ((i & 8) != 0) {
            networkRequestBody = networkRequest.body;
        }
        if ((i & 16) != 0) {
            extras = networkRequest.extras;
        }
        Extras extras2 = extras;
        NetworkHeaders networkHeaders2 = networkHeaders;
        return networkRequest.copy(str, str2, networkHeaders2, networkRequestBody, extras2);
    }

    @su0
    public final /* synthetic */ NetworkRequest copy(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody) {
        return new NetworkRequest(str, str2, networkHeaders, networkRequestBody, this.extras);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkRequest)) {
            return false;
        }
        NetworkRequest networkRequest = (NetworkRequest) obj;
        return j42.c(this.url, networkRequest.url) && j42.c(this.method, networkRequest.method) && j42.c(this.headers, networkRequest.headers) && j42.c(this.body, networkRequest.body) && j42.c(this.extras, networkRequest.extras);
    }

    public final NetworkRequestBody getBody() {
        return this.body;
    }

    public final Extras getExtras() {
        return this.extras;
    }

    public final NetworkHeaders getHeaders() {
        return this.headers;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = (this.headers.hashCode() + hf1.n(this.url.hashCode() * 31, 31, this.method)) * 31;
        NetworkRequestBody networkRequestBody = this.body;
        return this.extras.hashCode() + ((hashCode + (networkRequestBody == null ? 0 : networkRequestBody.hashCode())) * 31);
    }

    public String toString() {
        String str = this.url;
        String str2 = this.method;
        NetworkHeaders networkHeaders = this.headers;
        NetworkRequestBody networkRequestBody = this.body;
        Extras extras = this.extras;
        StringBuilder F = r7.F("NetworkRequest(url=", str, ", method=", str2, ", headers=");
        F.append(networkHeaders);
        F.append(", body=");
        F.append(networkRequestBody);
        F.append(", extras=");
        F.append(extras);
        F.append(")");
        return F.toString();
    }

    public final NetworkRequest copy(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody, Extras extras) {
        return new NetworkRequest(str, str2, networkHeaders, networkRequestBody, extras);
    }

    public NetworkRequest(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody, Extras extras) {
        this.url = str;
        this.method = str2;
        this.headers = networkHeaders;
        this.body = networkRequestBody;
        this.extras = extras;
    }

    public /* synthetic */ NetworkRequest(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody, int i, er0 er0Var) {
        this(str, (i & 2) != 0 ? UtilsKt.HTTP_METHOD_GET : str2, (i & 4) != 0 ? NetworkHeaders.EMPTY : networkHeaders, (i & 8) != 0 ? null : networkRequestBody);
    }

    public static /* synthetic */ NetworkRequest copy$default(NetworkRequest networkRequest, String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkRequest.url;
        }
        if ((i & 2) != 0) {
            str2 = networkRequest.method;
        }
        if ((i & 4) != 0) {
            networkHeaders = networkRequest.headers;
        }
        if ((i & 8) != 0) {
            networkRequestBody = networkRequest.body;
        }
        return networkRequest.copy(str, str2, networkHeaders, networkRequestBody);
    }

    @su0
    public /* synthetic */ NetworkRequest(String str, String str2, NetworkHeaders networkHeaders, NetworkRequestBody networkRequestBody) {
        this(str, str2, networkHeaders, networkRequestBody, null, 16, null);
    }
}

package coil3.network;

import defpackage.i82;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class NetworkResponse {
    private final NetworkResponseBody body;
    private final int code;
    private final Object delegate;
    private final NetworkHeaders headers;
    private final long requestMillis;
    private final long responseMillis;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NetworkResponse(int r3, long r4, long r6, coil3.network.NetworkHeaders r8, coil3.network.NetworkResponseBody r9, java.lang.Object r10, int r11, defpackage.er0 r12) {
        /*
            r2 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            r3 = 200(0xc8, float:2.8E-43)
        L6:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Ld
            r4 = r0
        Ld:
            r12 = r11 & 4
            if (r12 == 0) goto L12
            r6 = r0
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L18
            coil3.network.NetworkHeaders r8 = coil3.network.NetworkHeaders.EMPTY
        L18:
            r12 = r11 & 16
            r0 = 0
            if (r12 == 0) goto L1e
            r9 = r0
        L1e:
            r11 = r11 & 32
            if (r11 == 0) goto L2a
            r12 = r0
            r10 = r8
            r11 = r9
        L25:
            r8 = r6
            r6 = r4
            r4 = r2
            r5 = r3
            goto L2e
        L2a:
            r12 = r10
            r11 = r9
            r10 = r8
            goto L25
        L2e:
            r4.<init>(r5, r6, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkResponse.<init>(int, long, long, coil3.network.NetworkHeaders, coil3.network.NetworkResponseBody, java.lang.Object, int, er0):void");
    }

    public static /* synthetic */ NetworkResponse copy$default(NetworkResponse networkResponse, int i, long j, long j2, NetworkHeaders networkHeaders, NetworkResponseBody networkResponseBody, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = networkResponse.code;
        }
        if ((i2 & 2) != 0) {
            j = networkResponse.requestMillis;
        }
        if ((i2 & 4) != 0) {
            j2 = networkResponse.responseMillis;
        }
        if ((i2 & 8) != 0) {
            networkHeaders = networkResponse.headers;
        }
        if ((i2 & 16) != 0) {
            networkResponseBody = networkResponse.body;
        }
        if ((i2 & 32) != 0) {
            obj = networkResponse.delegate;
        }
        Object obj3 = obj;
        NetworkHeaders networkHeaders2 = networkHeaders;
        long j3 = j2;
        return networkResponse.copy(i, j, j3, networkHeaders2, networkResponseBody, obj3);
    }

    public final NetworkResponse copy(int i, long j, long j2, NetworkHeaders networkHeaders, NetworkResponseBody networkResponseBody, Object obj) {
        return new NetworkResponse(i, j, j2, networkHeaders, networkResponseBody, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && j42.c(this.headers, networkResponse.headers) && j42.c(this.body, networkResponse.body) && j42.c(this.delegate, networkResponse.delegate);
    }

    public final NetworkResponseBody getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final Object getDelegate() {
        return this.delegate;
    }

    public final NetworkHeaders getHeaders() {
        return this.headers;
    }

    public final long getRequestMillis() {
        return this.requestMillis;
    }

    public final long getResponseMillis() {
        return this.responseMillis;
    }

    public int hashCode() {
        int hashCode = (this.headers.hashCode() + ((i82.Q(this.responseMillis) + ((i82.Q(this.requestMillis) + (this.code * 31)) * 31)) * 31)) * 31;
        NetworkResponseBody networkResponseBody = this.body;
        int hashCode2 = (hashCode + (networkResponseBody == null ? 0 : networkResponseBody.hashCode())) * 31;
        Object obj = this.delegate;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.code + ", requestMillis=" + this.requestMillis + ", responseMillis=" + this.responseMillis + ", headers=" + this.headers + ", body=" + this.body + ", delegate=" + this.delegate + ")";
    }

    public NetworkResponse(int i, long j, long j2, NetworkHeaders networkHeaders, NetworkResponseBody networkResponseBody, Object obj) {
        this.code = i;
        this.requestMillis = j;
        this.responseMillis = j2;
        this.headers = networkHeaders;
        this.body = networkResponseBody;
        this.delegate = obj;
    }

    public NetworkResponse() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }
}

package coil3.network;

import defpackage.hf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HttpException extends RuntimeException {
    private final NetworkResponse response;

    public HttpException(NetworkResponse networkResponse) {
        super(hf1.u(networkResponse.getCode(), "HTTP "));
        this.response = networkResponse;
    }

    public final NetworkResponse getResponse() {
        return this.response;
    }
}

package okhttp3.internal;

import okhttp3.Response;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UnreadableResponseBodyKt {
    public static final Response stripBody(Response response) {
        response.getClass();
        return response.newBuilder().body(new UnreadableResponseBody(response.body().contentType(), response.body().contentLength())).build();
    }
}

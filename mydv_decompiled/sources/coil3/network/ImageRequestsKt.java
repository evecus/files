package coil3.network;

import coil3.Extras;
import coil3.ExtrasKt;
import coil3.network.internal.UtilsKt;
import coil3.request.ImageRequest;
import coil3.request.Options;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageRequestsKt {
    private static final Extras.Key<String> httpMethodKey = new Extras.Key<>(UtilsKt.HTTP_METHOD_GET);
    private static final Extras.Key<NetworkHeaders> httpHeadersKey = new Extras.Key<>(NetworkHeaders.EMPTY);
    private static final Extras.Key<NetworkRequestBody> httpBodyKey = new Extras.Key<>(null);

    public static final NetworkRequestBody getHttpBody(ImageRequest imageRequest) {
        return (NetworkRequestBody) ExtrasKt.getExtra(imageRequest, httpBodyKey);
    }

    public static final NetworkHeaders getHttpHeaders(ImageRequest imageRequest) {
        return (NetworkHeaders) ExtrasKt.getExtra(imageRequest, httpHeadersKey);
    }

    public static final String getHttpMethod(ImageRequest imageRequest) {
        return (String) ExtrasKt.getExtra(imageRequest, httpMethodKey);
    }

    public static final ImageRequest.Builder httpBody(ImageRequest.Builder builder, NetworkRequestBody networkRequestBody) {
        builder.getExtras().set(httpBodyKey, networkRequestBody);
        return builder;
    }

    public static final ImageRequest.Builder httpHeaders(ImageRequest.Builder builder, NetworkHeaders networkHeaders) {
        builder.getExtras().set(httpHeadersKey, networkHeaders);
        return builder;
    }

    public static final ImageRequest.Builder httpMethod(ImageRequest.Builder builder, String str) {
        Extras.Builder extras = builder.getExtras();
        Extras.Key<String> key = httpMethodKey;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        extras.set(key, upperCase);
        return builder;
    }

    public static final NetworkRequestBody getHttpBody(Options options) {
        return (NetworkRequestBody) ExtrasKt.getExtra(options, httpBodyKey);
    }

    public static final NetworkHeaders getHttpHeaders(Options options) {
        return (NetworkHeaders) ExtrasKt.getExtra(options, httpHeadersKey);
    }

    public static final String getHttpMethod(Options options) {
        return (String) ExtrasKt.getExtra(options, httpMethodKey);
    }

    public static final Extras.Key<NetworkRequestBody> getHttpBody(Extras.Key.Companion companion) {
        return httpBodyKey;
    }

    public static final Extras.Key<NetworkHeaders> getHttpHeaders(Extras.Key.Companion companion) {
        return httpHeadersKey;
    }

    public static final Extras.Key<String> getHttpMethod(Extras.Key.Companion companion) {
        return httpMethodKey;
    }
}

package okhttp3.internal.http;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import coil3.network.internal.UtilsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean invalidatesCache(String str) {
        str.getClass();
        return str.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static final boolean permitsRequestBody(String str) {
        str.getClass();
        return (str.equals(UtilsKt.HTTP_METHOD_GET) || str.equals("HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        str.getClass();
        return str.equals(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT");
    }

    public final boolean isCacheable(String str) {
        str.getClass();
        return str.equals(UtilsKt.HTTP_METHOD_GET) || str.equals("QUERY");
    }

    public final boolean redirectsToGet(String str, int i) {
        str.getClass();
        return i == 303 ? !str.equals("PROPFIND") : (i == 307 || i == 308 || str.equals("PROPFIND") || str.equals("QUERY")) ? false : true;
    }
}

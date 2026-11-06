package okhttp3.internal.cache;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import defpackage.j42;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.internal.http.HttpMethod;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CacheInterceptorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Request requestForCache(Request request) {
        HttpUrl cacheUrlOverride = request.cacheUrlOverride();
        return cacheUrlOverride != null ? (HttpMethod.INSTANCE.isCacheable(request.method()) || j42.c(request.method(), HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST)) ? request.newBuilder().get().url(cacheUrlOverride).cacheUrlOverride(null).build() : request : request;
    }
}

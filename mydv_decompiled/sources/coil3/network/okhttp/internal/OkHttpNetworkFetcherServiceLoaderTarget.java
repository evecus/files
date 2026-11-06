package coil3.network.okhttp.internal;

import coil3.Uri;
import coil3.fetch.Fetcher;
import coil3.network.okhttp.OkHttpNetworkFetcher;
import coil3.util.FetcherServiceLoaderTarget;
import defpackage.s24;
import defpackage.t72;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class OkHttpNetworkFetcherServiceLoaderTarget implements FetcherServiceLoaderTarget<Uri> {
    @Override // coil3.util.FetcherServiceLoaderTarget
    public int priority() {
        return 2;
    }

    @Override // coil3.util.FetcherServiceLoaderTarget
    public t72 type() {
        return s24.a(Uri.class);
    }

    @Override // coil3.util.FetcherServiceLoaderTarget
    public Fetcher.Factory<Uri> factory() {
        return OkHttpNetworkFetcher.factory();
    }
}

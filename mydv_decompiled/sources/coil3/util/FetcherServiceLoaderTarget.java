package coil3.util;

import coil3.fetch.Fetcher;
import defpackage.t72;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface FetcherServiceLoaderTarget<T> {
    Fetcher.Factory<T> factory();

    int priority();

    t72 type();
}

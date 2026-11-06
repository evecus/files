package coil3.decode;

import coil3.ImageLoader;
import coil3.fetch.SourceFetchResult;
import coil3.request.Options;
import defpackage.fj0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Decoder {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Factory {
        Decoder create(SourceFetchResult sourceFetchResult, Options options, ImageLoader imageLoader);
    }

    Object decode(fj0 fj0Var);
}

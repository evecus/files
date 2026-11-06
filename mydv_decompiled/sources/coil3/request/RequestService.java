package coil3.request;

import coil3.memory.MemoryCache;
import coil3.size.Size;
import defpackage.v52;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface RequestService {
    boolean isCacheValueValidForHardware(ImageRequest imageRequest, MemoryCache.Value value);

    Options options(ImageRequest imageRequest, Size size);

    RequestDelegate requestDelegate(ImageRequest imageRequest, v52 v52Var, boolean z);

    Options updateOptions(Options options);

    ImageRequest updateRequest(ImageRequest imageRequest);
}

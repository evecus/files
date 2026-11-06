package coil3.map;

import coil3.Uri;
import coil3.UriKt;
import coil3.request.Options;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class StringMapper implements Mapper<String, Uri> {
    @Override // coil3.map.Mapper
    public Uri map(String str, Options options) {
        return UriKt.toUri$default(str, null, 1, null);
    }
}

package coil3.key;

import coil3.Uri;
import coil3.request.Options;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UriKeyer implements Keyer<Uri> {
    @Override // coil3.key.Keyer
    public String key(Uri uri, Options options) {
        return uri.toString();
    }
}

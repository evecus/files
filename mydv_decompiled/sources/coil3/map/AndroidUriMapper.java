package coil3.map;

import android.net.Uri;
import coil3.Uri_androidKt;
import coil3.request.Options;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AndroidUriMapper implements Mapper<Uri, coil3.Uri> {
    @Override // coil3.map.Mapper
    public coil3.Uri map(Uri uri, Options options) {
        return Uri_androidKt.toCoilUri(uri);
    }
}

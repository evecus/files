package coil3.key;

import coil3.Uri;
import coil3.UriKt;
import coil3.request.ImageRequestsKt;
import coil3.request.Options;
import coil3.util.UtilsKt;
import defpackage.ke1;
import defpackage.o63;
import defpackage.ok3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FileUriKeyer implements Keyer<Uri> {
    @Override // coil3.key.Keyer
    public String key(Uri uri, Options options) {
        String filePath;
        if (!UtilsKt.isFileUri(uri) || !ImageRequestsKt.getAddLastModifiedToFileCacheKey(options) || (filePath = UriKt.getFilePath(uri)) == null) {
            return null;
        }
        ke1 fileSystem = options.getFileSystem();
        String str = ok3.J;
        return uri + "-" + fileSystem.metadata(o63.f(filePath)).f;
    }
}

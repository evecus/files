package coil3.map;

import coil3.Uri;
import coil3.UriKt;
import coil3.request.Options;
import coil3.util.UtilsKt;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class FileMapper implements Mapper<File, Uri> {
    @Override // coil3.map.Mapper
    public Uri map(File file, Options options) {
        return UriKt.Uri$default(UtilsKt.SCHEME_FILE, null, file.getPath(), null, null, null, 58, null);
    }
}

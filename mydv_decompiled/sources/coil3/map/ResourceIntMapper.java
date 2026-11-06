package coil3.map;

import android.content.Context;
import android.content.res.Resources;
import coil3.Uri;
import coil3.UriKt;
import coil3.request.Options;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ResourceIntMapper implements Mapper<Integer, Uri> {
    private final boolean isApplicable(int i, Context context) {
        try {
            return context.getResources().getResourceEntryName(i) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public Uri map(int i, Options options) {
        if (!isApplicable(i, options.getContext())) {
            return null;
        }
        return UriKt.toUri$default("android.resource://" + options.getContext().getPackageName() + "/" + i, null, 1, null);
    }

    @Override // coil3.map.Mapper
    public /* bridge */ /* synthetic */ Uri map(Integer num, Options options) {
        return map(num.intValue(), options);
    }
}

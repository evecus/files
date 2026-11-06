package coil3.util;

import defpackage.jx4;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class MimeTypeMap {
    public static final MimeTypeMap INSTANCE = new MimeTypeMap();

    private MimeTypeMap() {
    }

    public final String getMimeTypeFromExtension(String str) {
        Map map;
        if (jx4.L(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        map = MimeTypesKt.mimeTypeData;
        String str2 = (String) map.get(lowerCase);
        return str2 == null ? MimeTypes_androidKt.extensionFromMimeTypeMap(lowerCase) : str2;
    }

    public final String getMimeTypeFromUrl(String str) {
        if (jx4.L(str)) {
            return null;
        }
        String d0 = jx4.d0(jx4.d0(str, '#'), '?');
        return getMimeTypeFromExtension(jx4.b0('.', jx4.b0('/', d0, d0), ""));
    }
}

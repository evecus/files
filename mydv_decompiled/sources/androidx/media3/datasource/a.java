package androidx.media3.datasource;

import androidx.media3.datasource.DefaultHttpDataSource;
import defpackage.mr3;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements mr3 {
    public final /* synthetic */ byte I;

    public /* synthetic */ a(byte b) {
        this.I = b;
    }

    @Override // defpackage.mr3
    public final boolean apply(Object obj) {
        boolean lambda$entrySet$1;
        boolean lambda$keySet$0;
        switch (this.I) {
            case 0:
                lambda$entrySet$1 = DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
                return lambda$entrySet$1;
            default:
                lambda$keySet$0 = DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
                return lambda$keySet$0;
        }
    }
}

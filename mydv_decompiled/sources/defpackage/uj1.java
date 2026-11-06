package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uj1 {
    public final /* synthetic */ byte a;
    public final ContentProviderClient b;

    public uj1(Context context, Uri uri, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        byte b = this.a;
        ContentProviderClient contentProviderClient = this.b;
        switch (b) {
            case 0:
                if (contentProviderClient != 0) {
                    contentProviderClient.release();
                    break;
                }
                break;
            default:
                if (contentProviderClient != 0) {
                    if (!(contentProviderClient instanceof AutoCloseable)) {
                        if (!(contentProviderClient instanceof ExecutorService)) {
                            contentProviderClient.release();
                            break;
                        } else {
                            b3.g((ExecutorService) contentProviderClient);
                            break;
                        }
                    } else {
                        contentProviderClient.close();
                        break;
                    }
                }
                break;
        }
    }
}

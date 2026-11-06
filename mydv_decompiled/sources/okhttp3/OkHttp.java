package okhttp3;

import android.content.Context;
import okhttp3.internal._InternalVersionKt;
import okhttp3.internal.platform.PlatformRegistry;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class OkHttp {
    public static final OkHttp INSTANCE = new OkHttp();
    public static final String VERSION = _InternalVersionKt.CONST_VERSION;

    private OkHttp() {
    }

    public final void initialize(Context context) {
        context.getClass();
        PlatformRegistry platformRegistry = PlatformRegistry.INSTANCE;
        if (platformRegistry.getApplicationContext() == null) {
            platformRegistry.setApplicationContext(context.getApplicationContext());
        }
    }
}

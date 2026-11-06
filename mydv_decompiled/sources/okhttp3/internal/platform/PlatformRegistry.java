package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import defpackage.zl1;
import okhttp3.internal.platform.android.AndroidLog;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PlatformRegistry {
    public static final PlatformRegistry INSTANCE = new PlatformRegistry();

    private PlatformRegistry() {
    }

    public final Platform findPlatform() {
        AndroidLog.INSTANCE.enable();
        Platform buildIfSupported = Android10Platform.Companion.buildIfSupported();
        if (buildIfSupported == null) {
            buildIfSupported = AndroidPlatform.Companion.buildIfSupported();
        }
        if (buildIfSupported != null) {
            return buildIfSupported;
        }
        zl1.d(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was ");
        return null;
    }

    public final Context getApplicationContext() {
        Object obj = Platform.Companion.get();
        ContextAwarePlatform contextAwarePlatform = obj instanceof ContextAwarePlatform ? (ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            return contextAwarePlatform.getApplicationContext();
        }
        return null;
    }

    public final boolean isAndroid() {
        return true;
    }

    public final void setApplicationContext(Context context) {
        Object obj = Platform.Companion.get();
        ContextAwarePlatform contextAwarePlatform = obj instanceof ContextAwarePlatform ? (ContextAwarePlatform) obj : null;
        if (contextAwarePlatform != null) {
            contextAwarePlatform.setApplicationContext(context);
        }
    }
}

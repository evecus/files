package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface DefaultActivityLifecycleCallbacks extends Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityCreated(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityDestroyed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityPaused(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityResumed(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStarted(Activity activity);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    void onActivityStopped(Activity activity);
}

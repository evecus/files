package coil3.util;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import coil3.ImageLoaders_androidKt;
import coil3.RealImageLoader;
import coil3.memory.MemoryCache;
import coil3.util.Logger;
import defpackage.er0;
import defpackage.tm1;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AndroidSystemCallbacks implements SystemCallbacks {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "AndroidSystemCallbacks";
    private final ActivityCallbacks activityCallbacks;
    private Context application;
    private final ComponentCallbacks componentCallbacks = new ComponentCallbacks();
    private final WeakReference<RealImageLoader> imageLoader;
    private boolean shutdown;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ComponentCallbacks implements ComponentCallbacks2 {
        public ComponentCallbacks() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            AndroidSystemCallbacks androidSystemCallbacks = AndroidSystemCallbacks.this;
            synchronized (androidSystemCallbacks) {
                if (androidSystemCallbacks.getImageLoader().get() == null) {
                    androidSystemCallbacks.shutdown();
                }
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            MemoryCache memoryCache;
            AndroidSystemCallbacks androidSystemCallbacks = AndroidSystemCallbacks.this;
            synchronized (androidSystemCallbacks) {
                try {
                    RealImageLoader realImageLoader = androidSystemCallbacks.getImageLoader().get();
                    if (realImageLoader != null) {
                        Logger logger = realImageLoader.getOptions().getLogger();
                        if (logger != null) {
                            Logger.Level level = Logger.Level.Verbose;
                            if (logger.getMinLevel().compareTo(level) <= 0) {
                                logger.log(AndroidSystemCallbacks.TAG, level, "trimMemory, level=" + i, null);
                            }
                        }
                        if (i >= 40) {
                            MemoryCache memoryCache2 = realImageLoader.getMemoryCache();
                            if (memoryCache2 != null) {
                                memoryCache2.clear();
                            }
                        } else if (i >= 20) {
                            androidSystemCallbacks.getActivityCallbacks().register(realImageLoader.getOptions().getApplication());
                        } else if (i >= 10 && (memoryCache = realImageLoader.getMemoryCache()) != null) {
                            memoryCache.trimToSize(memoryCache.getSize() / 2);
                        }
                    } else {
                        androidSystemCallbacks.shutdown();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public AndroidSystemCallbacks(RealImageLoader realImageLoader) {
        this.imageLoader = new WeakReference<>(realImageLoader);
        this.activityCallbacks = new ActivityCallbacks(realImageLoader);
    }

    private final void withImageLoader(tm1 tm1Var) {
        RealImageLoader realImageLoader = getImageLoader().get();
        if (realImageLoader != null) {
            tm1Var.invoke(realImageLoader);
        } else {
            shutdown();
        }
    }

    public final ActivityCallbacks getActivityCallbacks() {
        return this.activityCallbacks;
    }

    public final ComponentCallbacks getComponentCallbacks() {
        return this.componentCallbacks;
    }

    public final WeakReference<RealImageLoader> getImageLoader() {
        return this.imageLoader;
    }

    public final boolean getShutdown() {
        return this.shutdown;
    }

    @Override // coil3.util.SystemCallbacks
    public synchronized void registerMemoryPressureCallbacks() {
        try {
            RealImageLoader realImageLoader = getImageLoader().get();
            if (realImageLoader == null) {
                shutdown();
            } else if (this.application == null) {
                Context application = realImageLoader.getOptions().getApplication();
                this.application = application;
                application.registerComponentCallbacks(this.componentCallbacks);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil3.util.SystemCallbacks
    public synchronized void shutdown() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                this.activityCallbacks.unregister(context);
                context.unregisterComponentCallbacks(this.componentCallbacks);
            }
            this.imageLoader.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getActivityCallbacks$annotations() {
    }

    public static /* synthetic */ void getComponentCallbacks$annotations() {
    }

    public static /* synthetic */ void getImageLoader$annotations() {
    }

    public static /* synthetic */ void getShutdown$annotations() {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ActivityCallbacks implements DefaultActivityLifecycleCallbacks {
        private final double backgroundMaxSizePercent;

        public ActivityCallbacks(RealImageLoader realImageLoader) {
            this.backgroundMaxSizePercent = ImageLoaders_androidKt.getMemoryCacheMaxSizePercentWhileInBackground(realImageLoader.getOptions());
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            unregister(activity);
        }

        public final void register(Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            AndroidSystemCallbacks androidSystemCallbacks = AndroidSystemCallbacks.this;
            RealImageLoader realImageLoader = androidSystemCallbacks.getImageLoader().get();
            if (realImageLoader == null) {
                androidSystemCallbacks.shutdown();
                return;
            }
            MemoryCache memoryCache = realImageLoader.getMemoryCache();
            if (memoryCache != null) {
                memoryCache.setMaxSize((long) (this.backgroundMaxSizePercent * memoryCache.getInitialMaxSize()));
                Logger logger = realImageLoader.getOptions().getLogger();
                if (logger != null) {
                    Logger.Level level = Logger.Level.Verbose;
                    if (logger.getMinLevel().compareTo(level) <= 0) {
                        logger.log(AndroidSystemCallbacks.TAG, level, "Restricting " + memoryCache + "'s max size to " + memoryCache.getMaxSize() + " bytes.", null);
                    }
                }
            }
        }

        public final void unregister(Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            AndroidSystemCallbacks androidSystemCallbacks = AndroidSystemCallbacks.this;
            RealImageLoader realImageLoader = androidSystemCallbacks.getImageLoader().get();
            if (realImageLoader == null) {
                androidSystemCallbacks.shutdown();
                return;
            }
            MemoryCache memoryCache = realImageLoader.getMemoryCache();
            if (memoryCache != null) {
                memoryCache.setMaxSize(memoryCache.getInitialMaxSize());
                Logger logger = realImageLoader.getOptions().getLogger();
                if (logger != null) {
                    Logger.Level level = Logger.Level.Verbose;
                    if (logger.getMinLevel().compareTo(level) <= 0) {
                        logger.log(AndroidSystemCallbacks.TAG, level, "Restoring " + memoryCache + "'s max size to " + memoryCache.getMaxSize() + " bytes.", null);
                    }
                }
            }
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final /* synthetic */ void onActivityDestroyed(Activity activity) {
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final /* synthetic */ void onActivityPaused(Activity activity) {
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final /* synthetic */ void onActivityResumed(Activity activity) {
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final /* synthetic */ void onActivityStopped(Activity activity) {
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final /* synthetic */ void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // coil3.util.DefaultActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public final /* synthetic */ void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}

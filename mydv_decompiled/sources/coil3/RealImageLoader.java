package coil3;

import android.content.Context;
import coil3.EventListener;
import coil3.ImageLoader;
import coil3.disk.DiskCache;
import coil3.intercept.EngineInterceptor;
import coil3.memory.MemoryCache;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.request.RequestService;
import coil3.request.RequestService_androidKt;
import coil3.util.Logger;
import coil3.util.SystemCallbacks;
import coil3.util.SystemCallbacksKt;
import defpackage.dl0;
import defpackage.fj0;
import defpackage.i42;
import defpackage.j42;
import defpackage.p70;
import defpackage.tk0;
import defpackage.uc2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class RealImageLoader implements ImageLoader {
    private static final /* synthetic */ AtomicIntegerFieldUpdater shutdown$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(RealImageLoader.class, "shutdown$volatile");
    private final ComponentRegistry components;
    private final Options options;
    private final RequestService requestService;
    private final dl0 scope;
    private volatile /* synthetic */ int shutdown$volatile;
    private final SystemCallbacks systemCallbacks;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Options {
        private final Context application;
        private final ComponentRegistry componentRegistry;
        private final ImageRequest.Defaults defaults;
        private final uc2 diskCacheLazy;
        private final EventListener.Factory eventListenerFactory;
        private final Logger logger;
        private final uc2 mainCoroutineContextLazy;
        private final uc2 memoryCacheLazy;

        public Options(Context context, ImageRequest.Defaults defaults, uc2 uc2Var, uc2 uc2Var2, uc2 uc2Var3, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger) {
            this.application = context;
            this.defaults = defaults;
            this.mainCoroutineContextLazy = uc2Var;
            this.memoryCacheLazy = uc2Var2;
            this.diskCacheLazy = uc2Var3;
            this.eventListenerFactory = factory;
            this.componentRegistry = componentRegistry;
            this.logger = logger;
        }

        public static /* synthetic */ Options copy$default(Options options, Context context, ImageRequest.Defaults defaults, uc2 uc2Var, uc2 uc2Var2, uc2 uc2Var3, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger, int i, Object obj) {
            if ((i & 1) != 0) {
                context = options.application;
            }
            if ((i & 2) != 0) {
                defaults = options.defaults;
            }
            if ((i & 4) != 0) {
                uc2Var = options.mainCoroutineContextLazy;
            }
            if ((i & 8) != 0) {
                uc2Var2 = options.memoryCacheLazy;
            }
            if ((i & 16) != 0) {
                uc2Var3 = options.diskCacheLazy;
            }
            if ((i & 32) != 0) {
                factory = options.eventListenerFactory;
            }
            if ((i & 64) != 0) {
                componentRegistry = options.componentRegistry;
            }
            if ((i & 128) != 0) {
                logger = options.logger;
            }
            ComponentRegistry componentRegistry2 = componentRegistry;
            Logger logger2 = logger;
            uc2 uc2Var4 = uc2Var3;
            EventListener.Factory factory2 = factory;
            return options.copy(context, defaults, uc2Var, uc2Var2, uc2Var4, factory2, componentRegistry2, logger2);
        }

        public final Context component1() {
            return this.application;
        }

        public final ImageRequest.Defaults component2() {
            return this.defaults;
        }

        public final uc2 component3() {
            return this.mainCoroutineContextLazy;
        }

        public final uc2 component4() {
            return this.memoryCacheLazy;
        }

        public final uc2 component5() {
            return this.diskCacheLazy;
        }

        public final EventListener.Factory component6() {
            return this.eventListenerFactory;
        }

        public final ComponentRegistry component7() {
            return this.componentRegistry;
        }

        public final Logger component8() {
            return this.logger;
        }

        public final Options copy(Context context, ImageRequest.Defaults defaults, uc2 uc2Var, uc2 uc2Var2, uc2 uc2Var3, EventListener.Factory factory, ComponentRegistry componentRegistry, Logger logger) {
            return new Options(context, defaults, uc2Var, uc2Var2, uc2Var3, factory, componentRegistry, logger);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            return j42.c(this.application, options.application) && j42.c(this.defaults, options.defaults) && j42.c(this.mainCoroutineContextLazy, options.mainCoroutineContextLazy) && j42.c(this.memoryCacheLazy, options.memoryCacheLazy) && j42.c(this.diskCacheLazy, options.diskCacheLazy) && j42.c(this.eventListenerFactory, options.eventListenerFactory) && j42.c(this.componentRegistry, options.componentRegistry) && j42.c(this.logger, options.logger);
        }

        public final Context getApplication() {
            return this.application;
        }

        public final ComponentRegistry getComponentRegistry() {
            return this.componentRegistry;
        }

        public final ImageRequest.Defaults getDefaults() {
            return this.defaults;
        }

        public final uc2 getDiskCacheLazy() {
            return this.diskCacheLazy;
        }

        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        public final Logger getLogger() {
            return this.logger;
        }

        public final uc2 getMainCoroutineContextLazy() {
            return this.mainCoroutineContextLazy;
        }

        public final uc2 getMemoryCacheLazy() {
            return this.memoryCacheLazy;
        }

        public int hashCode() {
            int hashCode = (this.componentRegistry.hashCode() + ((this.eventListenerFactory.hashCode() + ((this.diskCacheLazy.hashCode() + ((this.memoryCacheLazy.hashCode() + ((this.mainCoroutineContextLazy.hashCode() + ((this.defaults.hashCode() + (this.application.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
            Logger logger = this.logger;
            return hashCode + (logger == null ? 0 : logger.hashCode());
        }

        public String toString() {
            return "Options(application=" + this.application + ", defaults=" + this.defaults + ", mainCoroutineContextLazy=" + this.mainCoroutineContextLazy + ", memoryCacheLazy=" + this.memoryCacheLazy + ", diskCacheLazy=" + this.diskCacheLazy + ", eventListenerFactory=" + this.eventListenerFactory + ", componentRegistry=" + this.componentRegistry + ", logger=" + this.logger + ")";
        }
    }

    public RealImageLoader(Options options) {
        dl0 CoroutineScope;
        this.options = options;
        CoroutineScope = RealImageLoaderKt.CoroutineScope(options.getLogger());
        this.scope = CoroutineScope;
        SystemCallbacks SystemCallbacks = SystemCallbacksKt.SystemCallbacks(this);
        this.systemCallbacks = SystemCallbacks;
        RequestService RequestService = RequestService_androidKt.RequestService(this, SystemCallbacks, options.getLogger());
        this.requestService = RequestService;
        options.getMemoryCacheLazy();
        options.getDiskCacheLazy();
        this.components = RealImageLoaderKt.addCommonComponents(RealImageLoader_nonAppleKt.addAppleComponents(RealImageLoader_jvmCommonKt.addJvmComponents(RealImageLoader_androidKt.addAndroidComponents(RealImageLoaderKt.addServiceLoaderComponents(options.getComponentRegistry().newBuilder(), options), options), options), options)).add(new EngineInterceptor(this, SystemCallbacks, RequestService, options.getLogger())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:3|(16:5|6|7|(5:(1:(1:(7:12|13|14|15|(1:17)(2:21|(1:23)(2:24|25))|18|19)(2:38|39))(9:40|41|42|43|44|45|46|(5:49|15|(0)(0)|18|19)|48))(3:57|58|59)|56|27|28|(3:30|31|32)(2:33|34))(6:87|(1:89)(1:104)|90|91|92|(2:94|(3:96|(1:98)|48)(11:99|61|62|(1:82)(1:68)|69|(2:(1:72)(1:74)|73)|75|(1:77)|78|(5:80|44|45|46|(0))|48))(2:100|101))|60|61|62|(1:64)|82|69|(0)|75|(0)|78|(0)|48))|105|6|7|(0)(0)|60|61|62|(0)|82|69|(0)|75|(0)|78|(0)|48|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0111, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018a A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:14:0x004f, B:15:0x0184, B:17:0x018a, B:21:0x0195, B:23:0x0199, B:24:0x01a7, B:25:0x01ac), top: B:13:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0195 A[Catch: all -> 0x0054, TryCatch #3 {all -> 0x0054, blocks: (B:14:0x004f, B:15:0x0184, B:17:0x018a, B:21:0x0195, B:23:0x0199, B:24:0x01a7, B:25:0x01ac), top: B:13:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:62:0x00f9, B:64:0x00ff, B:66:0x0105, B:68:0x010b, B:69:0x0115, B:72:0x011d, B:73:0x0123, B:75:0x0126, B:77:0x012f, B:78:0x0132), top: B:61:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f A[Catch: all -> 0x0110, TryCatch #0 {all -> 0x0110, blocks: (B:62:0x00f9, B:64:0x00ff, B:66:0x0105, B:68:0x010b, B:69:0x0115, B:72:0x011d, B:73:0x0123, B:75:0x0126, B:77:0x012f, B:78:0x0132), top: B:61:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(coil3.request.ImageRequest r15, int r16, defpackage.fj0 r17) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.execute(coil3.request.ImageRequest, int, fj0):java.lang.Object");
    }

    private final /* synthetic */ int getShutdown$volatile() {
        return this.shutdown$volatile;
    }

    private final void onCancel(ImageRequest imageRequest, EventListener eventListener) {
        Logger logger = this.options.getLogger();
        if (logger != null) {
            Logger.Level level = Logger.Level.Info;
            if (logger.getMinLevel().compareTo(level) <= 0) {
                logger.log("RealImageLoader", level, "🏗 Cancelled - " + imageRequest.getData(), null);
            }
        }
        eventListener.onCancel(imageRequest);
        ImageRequest.Listener listener = imageRequest.getListener();
        if (listener != null) {
            listener.onCancel(imageRequest);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onError(coil3.request.ErrorResult r7, coil3.target.Target r8, coil3.EventListener r9) {
        /*
            r6 = this;
            coil3.request.ImageRequest r0 = r7.getRequest()
            coil3.RealImageLoader$Options r6 = r6.options
            coil3.util.Logger r6 = r6.getLogger()
            if (r6 == 0) goto L33
            java.lang.Throwable r1 = r7.getThrowable()
            coil3.util.Logger$Level r2 = r6.getMinLevel()
            coil3.util.Logger$Level r3 = coil3.util.Logger.Level.Error
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L33
            java.lang.Object r2 = r0.getData()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "🚨 Failed - "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "RealImageLoader"
            r6.log(r4, r3, r2, r1)
        L33:
            boolean r6 = r8 instanceof coil3.transition.TransitionTarget
            if (r6 != 0) goto L3a
            if (r8 == 0) goto L66
            goto L4d
        L3a:
            coil3.request.ImageRequest r6 = r7.getRequest()
            coil3.transition.Transition$Factory r6 = coil3.request.ImageRequests_androidKt.getTransitionFactory(r6)
            r1 = r8
            coil3.transition.TransitionTarget r1 = (coil3.transition.TransitionTarget) r1
            coil3.transition.Transition r6 = r6.create(r1, r7)
            boolean r1 = r6 instanceof coil3.transition.NoneTransition
            if (r1 == 0) goto L55
        L4d:
            coil3.Image r6 = r7.getImage()
            r8.onError(r6)
            goto L66
        L55:
            coil3.request.ImageRequest r8 = r7.getRequest()
            r9.transitionStart(r8, r6)
            r6.transition()
            coil3.request.ImageRequest r8 = r7.getRequest()
            r9.transitionEnd(r8, r6)
        L66:
            r9.onError(r0, r7)
            coil3.request.ImageRequest$Listener r6 = r0.getListener()
            if (r6 == 0) goto L72
            r6.onError(r0, r7)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.onError(coil3.request.ErrorResult, coil3.target.Target, coil3.EventListener):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onSuccess(coil3.request.SuccessResult r7, coil3.target.Target r8, coil3.EventListener r9) {
        /*
            r6 = this;
            coil3.request.ImageRequest r0 = r7.getRequest()
            coil3.decode.DataSource r1 = r7.getDataSource()
            coil3.RealImageLoader$Options r6 = r6.options
            coil3.util.Logger r6 = r6.getLogger()
            if (r6 == 0) goto L4a
            coil3.util.Logger$Level r2 = coil3.util.Logger.Level.Info
            coil3.util.Logger$Level r3 = r6.getMinLevel()
            int r3 = r3.compareTo(r2)
            if (r3 > 0) goto L4a
            java.lang.String r3 = coil3.util.UtilsKt.getEmoji(r1)
            java.lang.String r1 = r1.name()
            java.lang.Object r4 = r0.getData()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " Successful ("
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = ") - "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r3 = 0
            java.lang.String r4 = "RealImageLoader"
            r6.log(r4, r2, r1, r3)
        L4a:
            boolean r6 = r8 instanceof coil3.transition.TransitionTarget
            if (r6 != 0) goto L51
            if (r8 == 0) goto L7d
            goto L64
        L51:
            coil3.request.ImageRequest r6 = r7.getRequest()
            coil3.transition.Transition$Factory r6 = coil3.request.ImageRequests_androidKt.getTransitionFactory(r6)
            r1 = r8
            coil3.transition.TransitionTarget r1 = (coil3.transition.TransitionTarget) r1
            coil3.transition.Transition r6 = r6.create(r1, r7)
            boolean r1 = r6 instanceof coil3.transition.NoneTransition
            if (r1 == 0) goto L6c
        L64:
            coil3.Image r6 = r7.getImage()
            r8.onSuccess(r6)
            goto L7d
        L6c:
            coil3.request.ImageRequest r8 = r7.getRequest()
            r9.transitionStart(r8, r6)
            r6.transition()
            coil3.request.ImageRequest r8 = r7.getRequest()
            r9.transitionEnd(r8, r6)
        L7d:
            r9.onSuccess(r0, r7)
            coil3.request.ImageRequest$Listener r6 = r0.getListener()
            if (r6 == 0) goto L89
            r6.onSuccess(r0, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.RealImageLoader.onSuccess(coil3.request.SuccessResult, coil3.target.Target, coil3.EventListener):void");
    }

    private final /* synthetic */ void setShutdown$volatile(int i) {
        this.shutdown$volatile = i;
    }

    @Override // coil3.ImageLoader
    public Disposable enqueue(ImageRequest imageRequest) {
        return RealImageLoader_androidKt.getDisposable(imageRequest, p70.y(this.scope, (tk0) this.options.getMainCoroutineContextLazy().getValue(), new RealImageLoader$enqueue$job$1(this, imageRequest, null), 2));
    }

    @Override // coil3.ImageLoader
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil3.ImageLoader
    public ImageRequest.Defaults getDefaults() {
        return this.options.getDefaults();
    }

    @Override // coil3.ImageLoader
    public DiskCache getDiskCache() {
        return (DiskCache) this.options.getDiskCacheLazy().getValue();
    }

    @Override // coil3.ImageLoader
    public MemoryCache getMemoryCache() {
        return (MemoryCache) this.options.getMemoryCacheLazy().getValue();
    }

    public final Options getOptions() {
        return this.options;
    }

    @Override // coil3.ImageLoader
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this.options);
    }

    @Override // coil3.ImageLoader
    public void shutdown() {
        if (shutdown$volatile$FU.getAndSet(this, 1) == 1) {
            return;
        }
        i42.e0(this.scope, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    @Override // coil3.ImageLoader
    public Object execute(ImageRequest imageRequest, fj0 fj0Var) {
        if (!RealImageLoader_androidKt.needsExecuteOnMainDispatcher(imageRequest)) {
            return execute(imageRequest, 1, fj0Var);
        }
        return i42.o0(new RealImageLoader$execute$2(this, imageRequest, null), fj0Var);
    }
}

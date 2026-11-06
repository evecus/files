package coil3;

import android.content.Context;
import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.disk.DiskCache;
import coil3.memory.MemoryCache;
import coil3.request.CachePolicy;
import coil3.request.Disposable;
import coil3.request.ImageRequest;
import coil3.size.Precision;
import coil3.util.ContextsKt;
import coil3.util.Logger;
import defpackage.ce;
import defpackage.df0;
import defpackage.dx1;
import defpackage.eq;
import defpackage.fj0;
import defpackage.i02;
import defpackage.iu2;
import defpackage.ju2;
import defpackage.ke1;
import defpackage.os0;
import defpackage.rm1;
import defpackage.sx0;
import defpackage.tk0;
import defpackage.tm1;
import defpackage.u05;
import defpackage.uc2;
import defpackage.ut0;
import defpackage.w7;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface ImageLoader {
    Disposable enqueue(ImageRequest imageRequest);

    Object execute(ImageRequest imageRequest, fj0 fj0Var);

    ComponentRegistry getComponents();

    ImageRequest.Defaults getDefaults();

    DiskCache getDiskCache();

    MemoryCache getMemoryCache();

    Builder newBuilder();

    void shutdown();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final Context application;
        private ComponentRegistry componentRegistry;
        private ImageRequest.Defaults defaults;
        private uc2 diskCacheLazy;
        private EventListener.Factory eventListenerFactory;
        private final Extras.Builder extras;
        private Logger logger;
        private uc2 mainCoroutineContextLazy;
        private uc2 memoryCacheLazy;

        public Builder(RealImageLoader.Options options) {
            this.application = options.getApplication();
            this.defaults = options.getDefaults();
            this.mainCoroutineContextLazy = options.getMainCoroutineContextLazy();
            this.memoryCacheLazy = options.getMemoryCacheLazy();
            this.diskCacheLazy = options.getDiskCacheLazy();
            this.eventListenerFactory = options.getEventListenerFactory();
            this.componentRegistry = options.getComponentRegistry();
            this.logger = options.getLogger();
            this.extras = options.getDefaults().getExtras().newBuilder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final iu2 build$lambda$0() {
            os0 os0Var = sx0.a;
            return ju2.a.L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemoryCache build$lambda$1(Builder builder) {
            return MemoryCache.Builder.maxSizePercent$default(new MemoryCache.Builder(), builder.application, 0.0d, 2, null).build();
        }

        public final ImageLoader build() {
            ImageRequest.Defaults copy;
            Context context = this.application;
            copy = r3.copy((r29 & 1) != 0 ? r3.fileSystem : null, (r29 & 2) != 0 ? r3.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r3.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r3.decoderCoroutineContext : null, (r29 & 16) != 0 ? r3.memoryCachePolicy : null, (r29 & 32) != 0 ? r3.diskCachePolicy : null, (r29 & 64) != 0 ? r3.networkCachePolicy : null, (r29 & 128) != 0 ? r3.placeholderFactory : null, (r29 & 256) != 0 ? r3.errorFactory : null, (r29 & 512) != 0 ? r3.fallbackFactory : null, (r29 & 1024) != 0 ? r3.sizeResolver : null, (r29 & 2048) != 0 ? r3.scale : null, (r29 & 4096) != 0 ? r3.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : this.extras.build());
            uc2 uc2Var = this.mainCoroutineContextLazy;
            if (uc2Var == null) {
                uc2Var = new u05(new df0((byte) 19));
            }
            uc2 uc2Var2 = this.memoryCacheLazy;
            if (uc2Var2 == null) {
                uc2Var2 = new u05(new eq(this, (byte) 11));
            }
            uc2 uc2Var3 = this.diskCacheLazy;
            if (uc2Var3 == null) {
                uc2Var3 = new u05(new df0((byte) 20));
            }
            EventListener.Factory factory = this.eventListenerFactory;
            if (factory == null) {
                factory = EventListener.Factory.NONE;
            }
            ComponentRegistry componentRegistry = this.componentRegistry;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(new RealImageLoader.Options(context, copy, uc2Var, uc2Var2, uc2Var3, factory, componentRegistry, this.logger));
        }

        public final /* synthetic */ Builder components(tm1 tm1Var) {
            ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
            tm1Var.invoke(builder);
            return components(builder.build());
        }

        public final Builder coroutineContext(tk0 tk0Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : tk0Var, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : tk0Var, (r29 & 8) != 0 ? r1.decoderCoroutineContext : tk0Var, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder decoderCoroutineContext(tk0 tk0Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : tk0Var, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder diskCache(DiskCache diskCache) {
            this.diskCacheLazy = new i02(diskCache);
            return this;
        }

        public final Builder diskCachePolicy(CachePolicy cachePolicy) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : cachePolicy, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder error(tm1 tm1Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : tm1Var, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            return eventListenerFactory(new w7(eventListener, (byte) 11));
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            this.eventListenerFactory = factory;
            return this;
        }

        public final Builder fallback(tm1 tm1Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : tm1Var, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder fetcherCoroutineContext(tk0 tk0Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : tk0Var, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder fileSystem(ke1 ke1Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : ke1Var, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Extras.Builder getExtras() {
            return this.extras;
        }

        public final Builder interceptorCoroutineContext(tk0 tk0Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : tk0Var, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder logger(Logger logger) {
            this.logger = logger;
            return this;
        }

        public final Builder mainCoroutineContext(tk0 tk0Var) {
            return mainCoroutineContext(new ce(tk0Var, (byte) 18));
        }

        public final Builder memoryCache(MemoryCache memoryCache) {
            this.memoryCacheLazy = new i02(memoryCache);
            return this;
        }

        public final Builder memoryCachePolicy(CachePolicy cachePolicy) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : cachePolicy, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder networkCachePolicy(CachePolicy cachePolicy) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : cachePolicy, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder placeholder(tm1 tm1Var) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : tm1Var, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : null, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder precision(Precision precision) {
            ImageRequest.Defaults copy;
            copy = r1.copy((r29 & 1) != 0 ? r1.fileSystem : null, (r29 & 2) != 0 ? r1.interceptorCoroutineContext : null, (r29 & 4) != 0 ? r1.fetcherCoroutineContext : null, (r29 & 8) != 0 ? r1.decoderCoroutineContext : null, (r29 & 16) != 0 ? r1.memoryCachePolicy : null, (r29 & 32) != 0 ? r1.diskCachePolicy : null, (r29 & 64) != 0 ? r1.networkCachePolicy : null, (r29 & 128) != 0 ? r1.placeholderFactory : null, (r29 & 256) != 0 ? r1.errorFactory : null, (r29 & 512) != 0 ? r1.fallbackFactory : null, (r29 & 1024) != 0 ? r1.sizeResolver : null, (r29 & 2048) != 0 ? r1.scale : null, (r29 & 4096) != 0 ? r1.precision : precision, (r29 & 8192) != 0 ? this.defaults.extras : null);
            this.defaults = copy;
            return this;
        }

        public final Builder diskCache(rm1 rm1Var) {
            this.diskCacheLazy = ut0.L(rm1Var);
            return this;
        }

        public final Builder memoryCache(rm1 rm1Var) {
            this.memoryCacheLazy = ut0.L(rm1Var);
            return this;
        }

        public final Builder mainCoroutineContext(rm1 rm1Var) {
            this.mainCoroutineContextLazy = ut0.L(rm1Var);
            return this;
        }

        public final Builder components(ComponentRegistry componentRegistry) {
            this.componentRegistry = componentRegistry;
            return this;
        }

        public final Builder error(Image image) {
            return error(new dx1(image, (byte) 0));
        }

        public final Builder fallback(Image image) {
            return fallback(new dx1(image, (byte) 1));
        }

        public final Builder placeholder(Image image) {
            return placeholder(new dx1(image, (byte) 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final tk0 mainCoroutineContext$lambda$0(tk0 tk0Var) {
            return tk0Var;
        }

        public Builder(Context context) {
            this.application = ContextsKt.getApplication(context);
            this.defaults = ImageRequest.Defaults.DEFAULT;
            this.mainCoroutineContextLazy = null;
            this.memoryCacheLazy = null;
            this.diskCacheLazy = null;
            this.eventListenerFactory = null;
            this.componentRegistry = null;
            this.logger = null;
            this.extras = new Extras.Builder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Image error$lambda$0(Image image, ImageRequest imageRequest) {
            return image;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EventListener eventListener$lambda$0(EventListener eventListener, ImageRequest imageRequest) {
            return eventListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Image fallback$lambda$0(Image image, ImageRequest imageRequest) {
            return image;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Image placeholder$lambda$0(Image image, ImageRequest imageRequest) {
            return image;
        }
    }
}

package coil3.request;

import android.content.Context;
import coil3.Extras;
import coil3.Image;
import coil3.decode.Decoder;
import coil3.fetch.Fetcher;
import coil3.memory.MemoryCache;
import coil3.size.Dimension;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.size.SizeResolver;
import coil3.size.SizeResolverKt;
import coil3.target.Target;
import coil3.util.Collections_jvmCommonKt;
import coil3.util.Coroutines_nonJsCommonKt;
import coil3.util.FileSystems_nonJsCommonKt;
import coil3.util.UtilsKt;
import defpackage.dx1;
import defpackage.er0;
import defpackage.hn1;
import defpackage.j42;
import defpackage.ke1;
import defpackage.l91;
import defpackage.p70;
import defpackage.p91;
import defpackage.su0;
import defpackage.sv2;
import defpackage.t72;
import defpackage.tk0;
import defpackage.tm1;
import defpackage.uj3;
import defpackage.wd5;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImageRequest {
    private final Context context;
    private final Object data;
    private final tk0 decoderCoroutineContext;
    private final Decoder.Factory decoderFactory;
    private final Defaults defaults;
    private final Defined defined;
    private final String diskCacheKey;
    private final CachePolicy diskCachePolicy;
    private final tm1 errorFactory;
    private final Extras extras;
    private final tm1 fallbackFactory;
    private final tk0 fetcherCoroutineContext;
    private final uj3 fetcherFactory;
    private final ke1 fileSystem;
    private final tk0 interceptorCoroutineContext;
    private final Listener listener;
    private final String memoryCacheKey;
    private final Map<String, String> memoryCacheKeyExtras;
    private final CachePolicy memoryCachePolicy;
    private final CachePolicy networkCachePolicy;
    private final tm1 placeholderFactory;
    private final MemoryCache.Key placeholderMemoryCacheKey;
    private final Precision precision;
    private final Scale scale;
    private final SizeResolver sizeResolver;
    private final Target target;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Defined {
        private final tk0 decoderCoroutineContext;
        private final CachePolicy diskCachePolicy;
        private final tm1 errorFactory;
        private final tm1 fallbackFactory;
        private final tk0 fetcherCoroutineContext;
        private final ke1 fileSystem;
        private final tk0 interceptorCoroutineContext;
        private final CachePolicy memoryCachePolicy;
        private final CachePolicy networkCachePolicy;
        private final tm1 placeholderFactory;
        private final Precision precision;
        private final Scale scale;
        private final SizeResolver sizeResolver;

        public Defined(ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision) {
            this.fileSystem = ke1Var;
            this.interceptorCoroutineContext = tk0Var;
            this.fetcherCoroutineContext = tk0Var2;
            this.decoderCoroutineContext = tk0Var3;
            this.memoryCachePolicy = cachePolicy;
            this.diskCachePolicy = cachePolicy2;
            this.networkCachePolicy = cachePolicy3;
            this.placeholderFactory = tm1Var;
            this.errorFactory = tm1Var2;
            this.fallbackFactory = tm1Var3;
            this.sizeResolver = sizeResolver;
            this.scale = scale;
            this.precision = precision;
        }

        public static /* synthetic */ Defined copy$default(Defined defined, ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision, int i, Object obj) {
            if ((i & 1) != 0) {
                ke1Var = defined.fileSystem;
            }
            return defined.copy(ke1Var, (i & 2) != 0 ? defined.interceptorCoroutineContext : tk0Var, (i & 4) != 0 ? defined.fetcherCoroutineContext : tk0Var2, (i & 8) != 0 ? defined.decoderCoroutineContext : tk0Var3, (i & 16) != 0 ? defined.memoryCachePolicy : cachePolicy, (i & 32) != 0 ? defined.diskCachePolicy : cachePolicy2, (i & 64) != 0 ? defined.networkCachePolicy : cachePolicy3, (i & 128) != 0 ? defined.placeholderFactory : tm1Var, (i & 256) != 0 ? defined.errorFactory : tm1Var2, (i & 512) != 0 ? defined.fallbackFactory : tm1Var3, (i & 1024) != 0 ? defined.sizeResolver : sizeResolver, (i & 2048) != 0 ? defined.scale : scale, (i & 4096) != 0 ? defined.precision : precision);
        }

        public final Defined copy(ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision) {
            return new Defined(ke1Var, tk0Var, tk0Var2, tk0Var3, cachePolicy, cachePolicy2, cachePolicy3, tm1Var, tm1Var2, tm1Var3, sizeResolver, scale, precision);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defined)) {
                return false;
            }
            Defined defined = (Defined) obj;
            return j42.c(this.fileSystem, defined.fileSystem) && j42.c(this.interceptorCoroutineContext, defined.interceptorCoroutineContext) && j42.c(this.fetcherCoroutineContext, defined.fetcherCoroutineContext) && j42.c(this.decoderCoroutineContext, defined.decoderCoroutineContext) && this.memoryCachePolicy == defined.memoryCachePolicy && this.diskCachePolicy == defined.diskCachePolicy && this.networkCachePolicy == defined.networkCachePolicy && j42.c(this.placeholderFactory, defined.placeholderFactory) && j42.c(this.errorFactory, defined.errorFactory) && j42.c(this.fallbackFactory, defined.fallbackFactory) && j42.c(this.sizeResolver, defined.sizeResolver) && this.scale == defined.scale && this.precision == defined.precision;
        }

        public final tk0 getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        public final CachePolicy getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        public final tm1 getErrorFactory() {
            return this.errorFactory;
        }

        public final tm1 getFallbackFactory() {
            return this.fallbackFactory;
        }

        public final tk0 getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public final ke1 getFileSystem() {
            return this.fileSystem;
        }

        public final tk0 getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        public final CachePolicy getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        public final CachePolicy getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        public final tm1 getPlaceholderFactory() {
            return this.placeholderFactory;
        }

        public final Precision getPrecision() {
            return this.precision;
        }

        public final Scale getScale() {
            return this.scale;
        }

        public final SizeResolver getSizeResolver() {
            return this.sizeResolver;
        }

        public int hashCode() {
            ke1 ke1Var = this.fileSystem;
            int hashCode = (ke1Var == null ? 0 : ke1Var.hashCode()) * 31;
            tk0 tk0Var = this.interceptorCoroutineContext;
            int hashCode2 = (hashCode + (tk0Var == null ? 0 : tk0Var.hashCode())) * 31;
            tk0 tk0Var2 = this.fetcherCoroutineContext;
            int hashCode3 = (hashCode2 + (tk0Var2 == null ? 0 : tk0Var2.hashCode())) * 31;
            tk0 tk0Var3 = this.decoderCoroutineContext;
            int hashCode4 = (hashCode3 + (tk0Var3 == null ? 0 : tk0Var3.hashCode())) * 31;
            CachePolicy cachePolicy = this.memoryCachePolicy;
            int hashCode5 = (hashCode4 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.diskCachePolicy;
            int hashCode6 = (hashCode5 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
            CachePolicy cachePolicy3 = this.networkCachePolicy;
            int hashCode7 = (hashCode6 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
            tm1 tm1Var = this.placeholderFactory;
            int hashCode8 = (hashCode7 + (tm1Var == null ? 0 : tm1Var.hashCode())) * 31;
            tm1 tm1Var2 = this.errorFactory;
            int hashCode9 = (hashCode8 + (tm1Var2 == null ? 0 : tm1Var2.hashCode())) * 31;
            tm1 tm1Var3 = this.fallbackFactory;
            int hashCode10 = (hashCode9 + (tm1Var3 == null ? 0 : tm1Var3.hashCode())) * 31;
            SizeResolver sizeResolver = this.sizeResolver;
            int hashCode11 = (hashCode10 + (sizeResolver == null ? 0 : sizeResolver.hashCode())) * 31;
            Scale scale = this.scale;
            int hashCode12 = (hashCode11 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.precision;
            return hashCode12 + (precision != null ? precision.hashCode() : 0);
        }

        public String toString() {
            return "Defined(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ")";
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Listener {
        void onCancel(ImageRequest imageRequest);

        void onError(ImageRequest imageRequest, ErrorResult errorResult);

        void onStart(ImageRequest imageRequest);

        void onSuccess(ImageRequest imageRequest, SuccessResult successResult);
    }

    private ImageRequest(Context context, Object obj, Target target, Listener listener, String str, Map<String, String> map, String str2, ke1 ke1Var, uj3 uj3Var, Decoder.Factory factory, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, MemoryCache.Key key, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, Defined defined, Defaults defaults) {
        this.context = context;
        this.data = obj;
        this.target = target;
        this.listener = listener;
        this.memoryCacheKey = str;
        this.memoryCacheKeyExtras = map;
        this.diskCacheKey = str2;
        this.fileSystem = ke1Var;
        this.fetcherFactory = uj3Var;
        this.decoderFactory = factory;
        this.interceptorCoroutineContext = tk0Var;
        this.fetcherCoroutineContext = tk0Var2;
        this.decoderCoroutineContext = tk0Var3;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.placeholderMemoryCacheKey = key;
        this.placeholderFactory = tm1Var;
        this.errorFactory = tm1Var2;
        this.fallbackFactory = tm1Var3;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.precision = precision;
        this.extras = extras;
        this.defined = defined;
        this.defaults = defaults;
    }

    public static /* synthetic */ Builder newBuilder$default(ImageRequest imageRequest, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.newBuilder(context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        return j42.c(this.context, imageRequest.context) && j42.c(this.data, imageRequest.data) && j42.c(this.target, imageRequest.target) && j42.c(this.listener, imageRequest.listener) && j42.c(this.memoryCacheKey, imageRequest.memoryCacheKey) && j42.c(this.memoryCacheKeyExtras, imageRequest.memoryCacheKeyExtras) && j42.c(this.diskCacheKey, imageRequest.diskCacheKey) && j42.c(this.fileSystem, imageRequest.fileSystem) && j42.c(this.fetcherFactory, imageRequest.fetcherFactory) && j42.c(this.decoderFactory, imageRequest.decoderFactory) && j42.c(this.interceptorCoroutineContext, imageRequest.interceptorCoroutineContext) && j42.c(this.fetcherCoroutineContext, imageRequest.fetcherCoroutineContext) && j42.c(this.decoderCoroutineContext, imageRequest.decoderCoroutineContext) && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && j42.c(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && j42.c(this.placeholderFactory, imageRequest.placeholderFactory) && j42.c(this.errorFactory, imageRequest.errorFactory) && j42.c(this.fallbackFactory, imageRequest.fallbackFactory) && j42.c(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && this.precision == imageRequest.precision && j42.c(this.extras, imageRequest.extras) && j42.c(this.defined, imageRequest.defined) && j42.c(this.defaults, imageRequest.defaults);
    }

    public final Image error() {
        Image image = (Image) this.errorFactory.invoke(this);
        return image == null ? (Image) this.defaults.getErrorFactory().invoke(this) : image;
    }

    public final Image fallback() {
        Image image = (Image) this.fallbackFactory.invoke(this);
        return image == null ? (Image) this.defaults.getFallbackFactory().invoke(this) : image;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Object getData() {
        return this.data;
    }

    public final tk0 getDecoderCoroutineContext() {
        return this.decoderCoroutineContext;
    }

    public final Decoder.Factory getDecoderFactory() {
        return this.decoderFactory;
    }

    public final Defaults getDefaults() {
        return this.defaults;
    }

    public final Defined getDefined() {
        return this.defined;
    }

    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    public final tm1 getErrorFactory() {
        return this.errorFactory;
    }

    public final Extras getExtras() {
        return this.extras;
    }

    public final tm1 getFallbackFactory() {
        return this.fallbackFactory;
    }

    public final tk0 getFetcherCoroutineContext() {
        return this.fetcherCoroutineContext;
    }

    public final uj3 getFetcherFactory() {
        return this.fetcherFactory;
    }

    public final ke1 getFileSystem() {
        return this.fileSystem;
    }

    public final tk0 getInterceptorCoroutineContext() {
        return this.interceptorCoroutineContext;
    }

    public final Listener getListener() {
        return this.listener;
    }

    public final String getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    public final Map<String, String> getMemoryCacheKeyExtras() {
        return this.memoryCacheKeyExtras;
    }

    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    public final tm1 getPlaceholderFactory() {
        return this.placeholderFactory;
    }

    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    public final Precision getPrecision() {
        return this.precision;
    }

    public final Scale getScale() {
        return this.scale;
    }

    public final SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    public final Target getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode = (this.data.hashCode() + (this.context.hashCode() * 31)) * 31;
        Target target = this.target;
        int hashCode2 = (hashCode + (target == null ? 0 : target.hashCode())) * 31;
        Listener listener = this.listener;
        int hashCode3 = (hashCode2 + (listener == null ? 0 : listener.hashCode())) * 31;
        String str = this.memoryCacheKey;
        int hashCode4 = (this.memoryCacheKeyExtras.hashCode() + ((hashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.diskCacheKey;
        int hashCode5 = (this.fileSystem.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        uj3 uj3Var = this.fetcherFactory;
        int hashCode6 = (hashCode5 + (uj3Var == null ? 0 : uj3Var.hashCode())) * 31;
        Decoder.Factory factory = this.decoderFactory;
        int hashCode7 = (this.networkCachePolicy.hashCode() + ((this.diskCachePolicy.hashCode() + ((this.memoryCachePolicy.hashCode() + ((this.decoderCoroutineContext.hashCode() + ((this.fetcherCoroutineContext.hashCode() + ((this.interceptorCoroutineContext.hashCode() + ((hashCode6 + (factory == null ? 0 : factory.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        MemoryCache.Key key = this.placeholderMemoryCacheKey;
        return this.defaults.hashCode() + ((this.defined.hashCode() + ((this.extras.hashCode() + ((this.precision.hashCode() + ((this.scale.hashCode() + ((this.sizeResolver.hashCode() + ((this.fallbackFactory.hashCode() + ((this.errorFactory.hashCode() + ((this.placeholderFactory.hashCode() + ((hashCode7 + (key != null ? key.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final Builder newBuilder() {
        return newBuilder$default(this, null, 1, null);
    }

    public final Image placeholder() {
        Image image = (Image) this.placeholderFactory.invoke(this);
        return image == null ? (Image) this.defaults.getPlaceholderFactory().invoke(this) : image;
    }

    public String toString() {
        return "ImageRequest(context=" + this.context + ", data=" + this.data + ", target=" + this.target + ", listener=" + this.listener + ", memoryCacheKey=" + this.memoryCacheKey + ", memoryCacheKeyExtras=" + this.memoryCacheKeyExtras + ", diskCacheKey=" + this.diskCacheKey + ", fileSystem=" + this.fileSystem + ", fetcherFactory=" + this.fetcherFactory + ", decoderFactory=" + this.decoderFactory + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderMemoryCacheKey=" + this.placeholderMemoryCacheKey + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ", defined=" + this.defined + ", defaults=" + this.defaults + ")";
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Defaults {
        public static final Companion Companion = new Companion(null);
        public static final Defaults DEFAULT = new Defaults(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        private final tk0 decoderCoroutineContext;
        private final CachePolicy diskCachePolicy;
        private final tm1 errorFactory;
        private final Extras extras;
        private final tm1 fallbackFactory;
        private final tk0 fetcherCoroutineContext;
        private final ke1 fileSystem;
        private final tk0 interceptorCoroutineContext;
        private final CachePolicy memoryCachePolicy;
        private final CachePolicy networkCachePolicy;
        private final tm1 placeholderFactory;
        private final Precision precision;
        private final Scale scale;
        private final SizeResolver sizeResolver;

        public /* synthetic */ Defaults(ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, int i, er0 er0Var) {
            this((i & 1) != 0 ? FileSystems_nonJsCommonKt.defaultFileSystem() : ke1Var, (i & 2) != 0 ? l91.I : tk0Var, (i & 4) != 0 ? Coroutines_nonJsCommonKt.ioCoroutineDispatcher() : tk0Var2, (i & 8) != 0 ? Coroutines_nonJsCommonKt.ioCoroutineDispatcher() : tk0Var3, (i & 16) != 0 ? CachePolicy.ENABLED : cachePolicy, (i & 32) != 0 ? CachePolicy.ENABLED : cachePolicy2, (i & 64) != 0 ? CachePolicy.ENABLED : cachePolicy3, (i & 128) != 0 ? UtilsKt.getEMPTY_IMAGE_FACTORY() : tm1Var, (i & 256) != 0 ? UtilsKt.getEMPTY_IMAGE_FACTORY() : tm1Var2, (i & 512) != 0 ? UtilsKt.getEMPTY_IMAGE_FACTORY() : tm1Var3, (i & 1024) != 0 ? SizeResolver.ORIGINAL : sizeResolver, (i & 2048) != 0 ? Scale.FIT : scale, (i & 4096) != 0 ? Precision.EXACT : precision, (i & 8192) != 0 ? Extras.EMPTY : extras);
        }

        @su0
        public final /* synthetic */ Defaults copy(ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, Precision precision, Extras extras) {
            return new Defaults(ke1Var, tk0Var, tk0Var2, tk0Var3, cachePolicy, cachePolicy2, cachePolicy3, tm1Var, tm1Var2, tm1Var3, null, null, precision, extras, 3072, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Defaults)) {
                return false;
            }
            Defaults defaults = (Defaults) obj;
            return j42.c(this.fileSystem, defaults.fileSystem) && j42.c(this.interceptorCoroutineContext, defaults.interceptorCoroutineContext) && j42.c(this.fetcherCoroutineContext, defaults.fetcherCoroutineContext) && j42.c(this.decoderCoroutineContext, defaults.decoderCoroutineContext) && this.memoryCachePolicy == defaults.memoryCachePolicy && this.diskCachePolicy == defaults.diskCachePolicy && this.networkCachePolicy == defaults.networkCachePolicy && j42.c(this.placeholderFactory, defaults.placeholderFactory) && j42.c(this.errorFactory, defaults.errorFactory) && j42.c(this.fallbackFactory, defaults.fallbackFactory) && j42.c(this.sizeResolver, defaults.sizeResolver) && this.scale == defaults.scale && this.precision == defaults.precision && j42.c(this.extras, defaults.extras);
        }

        public final tk0 getDecoderCoroutineContext() {
            return this.decoderCoroutineContext;
        }

        public final CachePolicy getDiskCachePolicy() {
            return this.diskCachePolicy;
        }

        public final tm1 getErrorFactory() {
            return this.errorFactory;
        }

        public final Extras getExtras() {
            return this.extras;
        }

        public final tm1 getFallbackFactory() {
            return this.fallbackFactory;
        }

        public final tk0 getFetcherCoroutineContext() {
            return this.fetcherCoroutineContext;
        }

        public final ke1 getFileSystem() {
            return this.fileSystem;
        }

        public final tk0 getInterceptorCoroutineContext() {
            return this.interceptorCoroutineContext;
        }

        public final CachePolicy getMemoryCachePolicy() {
            return this.memoryCachePolicy;
        }

        public final CachePolicy getNetworkCachePolicy() {
            return this.networkCachePolicy;
        }

        public final tm1 getPlaceholderFactory() {
            return this.placeholderFactory;
        }

        public final Precision getPrecision() {
            return this.precision;
        }

        public final Scale getScale() {
            return this.scale;
        }

        public final SizeResolver getSizeResolver() {
            return this.sizeResolver;
        }

        public int hashCode() {
            return this.extras.hashCode() + ((this.precision.hashCode() + ((this.scale.hashCode() + ((this.sizeResolver.hashCode() + ((this.fallbackFactory.hashCode() + ((this.errorFactory.hashCode() + ((this.placeholderFactory.hashCode() + ((this.networkCachePolicy.hashCode() + ((this.diskCachePolicy.hashCode() + ((this.memoryCachePolicy.hashCode() + ((this.decoderCoroutineContext.hashCode() + ((this.fetcherCoroutineContext.hashCode() + ((this.interceptorCoroutineContext.hashCode() + (this.fileSystem.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.fileSystem + ", interceptorCoroutineContext=" + this.interceptorCoroutineContext + ", fetcherCoroutineContext=" + this.fetcherCoroutineContext + ", decoderCoroutineContext=" + this.decoderCoroutineContext + ", memoryCachePolicy=" + this.memoryCachePolicy + ", diskCachePolicy=" + this.diskCachePolicy + ", networkCachePolicy=" + this.networkCachePolicy + ", placeholderFactory=" + this.placeholderFactory + ", errorFactory=" + this.errorFactory + ", fallbackFactory=" + this.fallbackFactory + ", sizeResolver=" + this.sizeResolver + ", scale=" + this.scale + ", precision=" + this.precision + ", extras=" + this.extras + ")";
        }

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class Companion {
            public /* synthetic */ Companion(er0 er0Var) {
                this();
            }

            private Companion() {
            }
        }

        public static /* synthetic */ Defaults copy$default(Defaults defaults, ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, Precision precision, Extras extras, int i, Object obj) {
            if ((i & 1) != 0) {
                ke1Var = defaults.fileSystem;
            }
            if ((i & 2) != 0) {
                tk0Var = defaults.interceptorCoroutineContext;
            }
            if ((i & 4) != 0) {
                tk0Var2 = defaults.fetcherCoroutineContext;
            }
            if ((i & 8) != 0) {
                tk0Var3 = defaults.decoderCoroutineContext;
            }
            if ((i & 16) != 0) {
                cachePolicy = defaults.memoryCachePolicy;
            }
            if ((i & 32) != 0) {
                cachePolicy2 = defaults.diskCachePolicy;
            }
            if ((i & 64) != 0) {
                cachePolicy3 = defaults.networkCachePolicy;
            }
            if ((i & 128) != 0) {
                tm1Var = defaults.placeholderFactory;
            }
            if ((i & 256) != 0) {
                tm1Var2 = defaults.errorFactory;
            }
            if ((i & 512) != 0) {
                tm1Var3 = defaults.fallbackFactory;
            }
            if ((i & 1024) != 0) {
                precision = defaults.precision;
            }
            if ((i & 2048) != 0) {
                extras = defaults.extras;
            }
            Precision precision2 = precision;
            Extras extras2 = extras;
            tm1 tm1Var4 = tm1Var2;
            tm1 tm1Var5 = tm1Var3;
            CachePolicy cachePolicy4 = cachePolicy3;
            tm1 tm1Var6 = tm1Var;
            CachePolicy cachePolicy5 = cachePolicy;
            CachePolicy cachePolicy6 = cachePolicy2;
            return defaults.copy(ke1Var, tk0Var, tk0Var2, tk0Var3, cachePolicy5, cachePolicy6, cachePolicy4, tm1Var6, tm1Var4, tm1Var5, precision2, extras2);
        }

        public final Defaults copy(ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras) {
            return new Defaults(ke1Var, tk0Var, tk0Var2, tk0Var3, cachePolicy, cachePolicy2, cachePolicy3, tm1Var, tm1Var2, tm1Var3, sizeResolver, scale, precision, extras);
        }

        public Defaults(ke1 ke1Var, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras) {
            this.fileSystem = ke1Var;
            this.interceptorCoroutineContext = tk0Var;
            this.fetcherCoroutineContext = tk0Var2;
            this.decoderCoroutineContext = tk0Var3;
            this.memoryCachePolicy = cachePolicy;
            this.diskCachePolicy = cachePolicy2;
            this.networkCachePolicy = cachePolicy3;
            this.placeholderFactory = tm1Var;
            this.errorFactory = tm1Var2;
            this.fallbackFactory = tm1Var3;
            this.sizeResolver = sizeResolver;
            this.scale = scale;
            this.precision = precision;
            this.extras = extras;
        }

        public Defaults() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final Context context;
        private Object data;
        private tk0 decoderCoroutineContext;
        private Decoder.Factory decoderFactory;
        private Defaults defaults;
        private String diskCacheKey;
        private CachePolicy diskCachePolicy;
        private tm1 errorFactory;
        private tm1 fallbackFactory;
        private tk0 fetcherCoroutineContext;
        private uj3 fetcherFactory;
        private ke1 fileSystem;
        private tk0 interceptorCoroutineContext;
        private Object lazyExtras;
        private Object lazyMemoryCacheKeyExtras;
        private Listener listener;
        private String memoryCacheKey;
        private boolean memoryCacheKeyExtrasAreMutable;
        private CachePolicy memoryCachePolicy;
        private CachePolicy networkCachePolicy;
        private tm1 placeholderFactory;
        private MemoryCache.Key placeholderMemoryCacheKey;
        private Precision precision;
        private Scale scale;
        private SizeResolver sizeResolver;
        private Target target;

        public Builder(ImageRequest imageRequest, Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.lazyMemoryCacheKeyExtras = imageRequest.getMemoryCacheKeyExtras();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.fileSystem = imageRequest.getDefined().getFileSystem();
            this.fetcherFactory = imageRequest.getFetcherFactory();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.interceptorCoroutineContext = imageRequest.getDefined().getInterceptorCoroutineContext();
            this.fetcherCoroutineContext = imageRequest.getDefined().getFetcherCoroutineContext();
            this.decoderCoroutineContext = imageRequest.getDefined().getDecoderCoroutineContext();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderFactory = imageRequest.getDefined().getPlaceholderFactory();
            this.errorFactory = imageRequest.getDefined().getErrorFactory();
            this.fallbackFactory = imageRequest.getDefined().getFallbackFactory();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            this.precision = imageRequest.getDefined().getPrecision();
            this.lazyExtras = imageRequest.getExtras();
        }

        private final Map<String, String> getMemoryCacheKeyExtras() {
            Object obj = this.lazyMemoryCacheKeyExtras;
            if (!j42.c(obj, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                if (!(obj instanceof Map)) {
                    throw new AssertionError();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) obj);
                this.lazyMemoryCacheKeyExtras = linkedHashMap;
                this.memoryCacheKeyExtrasAreMutable = true;
                obj = linkedHashMap;
            }
            obj.getClass();
            return p70.x(obj);
        }

        public static /* synthetic */ Builder listener$default(Builder builder, tm1 tm1Var, tm1 tm1Var2, hn1 hn1Var, hn1 hn1Var2, int i, Object obj) {
            if ((i & 1) != 0) {
                tm1Var = new tm1() { // from class: coil3.request.ImageRequest$Builder$listener$1
                    @Override // defpackage.tm1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageRequest) obj2);
                        return wd5.a;
                    }

                    public final void invoke(ImageRequest imageRequest) {
                    }
                };
            }
            if ((i & 2) != 0) {
                tm1Var2 = new tm1() { // from class: coil3.request.ImageRequest$Builder$listener$2
                    @Override // defpackage.tm1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageRequest) obj2);
                        return wd5.a;
                    }

                    public final void invoke(ImageRequest imageRequest) {
                    }
                };
            }
            if ((i & 4) != 0) {
                hn1Var = new hn1() { // from class: coil3.request.ImageRequest$Builder$listener$3
                    @Override // defpackage.hn1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((ImageRequest) obj2, (ErrorResult) obj3);
                        return wd5.a;
                    }

                    public final void invoke(ImageRequest imageRequest, ErrorResult errorResult) {
                    }
                };
            }
            if ((i & 8) != 0) {
                hn1Var2 = new hn1() { // from class: coil3.request.ImageRequest$Builder$listener$4
                    @Override // defpackage.hn1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((ImageRequest) obj2, (SuccessResult) obj3);
                        return wd5.a;
                    }

                    public final void invoke(ImageRequest imageRequest, SuccessResult successResult) {
                    }
                };
            }
            return builder.listener(new ImageRequest$Builder$listener$5(tm1Var, tm1Var2, hn1Var, hn1Var2));
        }

        public static /* synthetic */ Builder target$default(Builder builder, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, int i, Object obj) {
            if ((i & 1) != 0) {
                tm1Var = new tm1() { // from class: coil3.request.ImageRequest$Builder$target$1
                    @Override // defpackage.tm1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Image) obj2);
                        return wd5.a;
                    }

                    public final void invoke(Image image) {
                    }
                };
            }
            if ((i & 2) != 0) {
                tm1Var2 = new tm1() { // from class: coil3.request.ImageRequest$Builder$target$2
                    @Override // defpackage.tm1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Image) obj2);
                        return wd5.a;
                    }

                    public final void invoke(Image image) {
                    }
                };
            }
            if ((i & 4) != 0) {
                tm1Var3 = new tm1() { // from class: coil3.request.ImageRequest$Builder$target$3
                    @Override // defpackage.tm1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Image) obj2);
                        return wd5.a;
                    }

                    public final void invoke(Image image) {
                    }
                };
            }
            return builder.target(new ImageRequest$Builder$target$4(tm1Var, tm1Var2, tm1Var3));
        }

        public final ImageRequest build() {
            Map map;
            Extras extras;
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = NullRequestData.INSTANCE;
            }
            Target target = this.target;
            Listener listener = this.listener;
            String str = this.memoryCacheKey;
            Object obj2 = this.lazyMemoryCacheKeyExtras;
            if (j42.c(obj2, Boolean.valueOf(this.memoryCacheKeyExtrasAreMutable))) {
                obj2.getClass();
                map = Collections_jvmCommonKt.toImmutableMap(p70.x(obj2));
            } else {
                if (!(obj2 instanceof Map)) {
                    throw new AssertionError();
                }
                map = (Map) obj2;
            }
            map.getClass();
            String str2 = this.diskCacheKey;
            ke1 ke1Var = this.fileSystem;
            if (ke1Var == null) {
                ke1Var = this.defaults.getFileSystem();
            }
            uj3 uj3Var = this.fetcherFactory;
            Decoder.Factory factory = this.decoderFactory;
            CachePolicy cachePolicy = this.memoryCachePolicy;
            if (cachePolicy == null) {
                cachePolicy = this.defaults.getMemoryCachePolicy();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.diskCachePolicy;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.defaults.getDiskCachePolicy();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.networkCachePolicy;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.defaults.getNetworkCachePolicy();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            tk0 tk0Var = this.interceptorCoroutineContext;
            if (tk0Var == null) {
                tk0Var = this.defaults.getInterceptorCoroutineContext();
            }
            tk0 tk0Var2 = this.fetcherCoroutineContext;
            if (tk0Var2 == null) {
                tk0Var2 = this.defaults.getFetcherCoroutineContext();
            }
            tk0 tk0Var3 = this.decoderCoroutineContext;
            if (tk0Var3 == null) {
                tk0Var3 = this.defaults.getDecoderCoroutineContext();
            }
            MemoryCache.Key key = this.placeholderMemoryCacheKey;
            tm1 tm1Var = this.placeholderFactory;
            if (tm1Var == null) {
                tm1Var = this.defaults.getPlaceholderFactory();
            }
            tm1 tm1Var2 = tm1Var;
            tm1 tm1Var3 = this.errorFactory;
            if (tm1Var3 == null) {
                tm1Var3 = this.defaults.getErrorFactory();
            }
            tm1 tm1Var4 = tm1Var3;
            tm1 tm1Var5 = this.fallbackFactory;
            if (tm1Var5 == null) {
                tm1Var5 = this.defaults.getFallbackFactory();
            }
            tm1 tm1Var6 = tm1Var5;
            SizeResolver sizeResolver = this.sizeResolver;
            if (sizeResolver == null) {
                sizeResolver = this.defaults.getSizeResolver();
            }
            SizeResolver sizeResolver2 = sizeResolver;
            Scale scale = this.scale;
            if (scale == null) {
                scale = this.defaults.getScale();
            }
            Scale scale2 = scale;
            Precision precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            Precision precision2 = precision;
            Object obj3 = this.lazyExtras;
            Object obj4 = obj;
            if (obj3 instanceof Extras.Builder) {
                extras = ((Extras.Builder) obj3).build();
            } else {
                if (!(obj3 instanceof Extras)) {
                    throw new AssertionError();
                }
                extras = (Extras) obj3;
            }
            return new ImageRequest(context, obj4, target, listener, str, map, str2, ke1Var, uj3Var, factory, tk0Var, tk0Var2, tk0Var3, cachePolicy2, cachePolicy4, cachePolicy6, key, tm1Var2, tm1Var4, tm1Var6, sizeResolver2, scale2, precision2, extras, new Defined(this.fileSystem, this.interceptorCoroutineContext, this.fetcherCoroutineContext, this.decoderCoroutineContext, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy, this.placeholderFactory, this.errorFactory, this.fallbackFactory, this.sizeResolver, this.scale, this.precision), this.defaults, null);
        }

        public final Builder coroutineContext(tk0 tk0Var) {
            this.interceptorCoroutineContext = tk0Var;
            this.fetcherCoroutineContext = tk0Var;
            this.decoderCoroutineContext = tk0Var;
            return this;
        }

        public final Builder data(Object obj) {
            this.data = obj;
            return this;
        }

        public final Builder decoderCoroutineContext(tk0 tk0Var) {
            this.decoderCoroutineContext = tk0Var;
            return this;
        }

        public final Builder decoderFactory(Decoder.Factory factory) {
            this.decoderFactory = factory;
            return this;
        }

        public final Builder defaults(Defaults defaults) {
            this.defaults = defaults;
            return this;
        }

        public final Builder diskCacheKey(String str) {
            this.diskCacheKey = str;
            return this;
        }

        public final Builder diskCachePolicy(CachePolicy cachePolicy) {
            this.diskCachePolicy = cachePolicy;
            return this;
        }

        public final Builder error(Image image) {
            return error(new dx1(image, (byte) 4));
        }

        public final Builder fallback(Image image) {
            return fallback(new dx1(image, (byte) 3));
        }

        public final Builder fetcherCoroutineContext(tk0 tk0Var) {
            this.fetcherCoroutineContext = tk0Var;
            return this;
        }

        public final <T> Builder fetcherFactory(Fetcher.Factory<T> factory, t72 t72Var) {
            this.fetcherFactory = new uj3(factory, t72Var);
            return this;
        }

        public final Builder fileSystem(ke1 ke1Var) {
            this.fileSystem = ke1Var;
            return this;
        }

        public final Extras.Builder getExtras() {
            Object obj = this.lazyExtras;
            if (obj instanceof Extras.Builder) {
                return (Extras.Builder) obj;
            }
            if (!(obj instanceof Extras)) {
                throw new AssertionError();
            }
            Extras.Builder newBuilder = ((Extras) obj).newBuilder();
            this.lazyExtras = newBuilder;
            return newBuilder;
        }

        public final Builder interceptorCoroutineContext(tk0 tk0Var) {
            this.interceptorCoroutineContext = tk0Var;
            return this;
        }

        public final Builder listener(tm1 tm1Var, tm1 tm1Var2, hn1 hn1Var, hn1 hn1Var2) {
            return listener(new ImageRequest$Builder$listener$5(tm1Var, tm1Var2, hn1Var, hn1Var2));
        }

        public final Builder memoryCacheKey(MemoryCache.Key key) {
            memoryCacheKey(key != null ? key.getKey() : null);
            Map<String, String> extras = key != null ? key.getExtras() : null;
            if (extras == null) {
                extras = p91.I;
            }
            memoryCacheKeyExtras(extras);
            return this;
        }

        public final Builder memoryCacheKeyExtra(String str, String str2) {
            if (str2 != null) {
                getMemoryCacheKeyExtras().put(str, str2);
                return this;
            }
            getMemoryCacheKeyExtras().remove(str);
            return this;
        }

        public final Builder memoryCacheKeyExtras(Map<String, String> map) {
            this.lazyMemoryCacheKeyExtras = sv2.Y(map);
            this.memoryCacheKeyExtrasAreMutable = true;
            return this;
        }

        public final Builder memoryCachePolicy(CachePolicy cachePolicy) {
            this.memoryCachePolicy = cachePolicy;
            return this;
        }

        public final Builder networkCachePolicy(CachePolicy cachePolicy) {
            this.networkCachePolicy = cachePolicy;
            return this;
        }

        public final Builder placeholder(Image image) {
            return placeholder(new dx1(image, (byte) 5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder placeholderMemoryCacheKey(String str) {
            MemoryCache.Key key = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (str != null) {
                key = new MemoryCache.Key(str, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            }
            return placeholderMemoryCacheKey(key);
        }

        public final Builder precision(Precision precision) {
            this.precision = precision;
            return this;
        }

        public final Builder scale(Scale scale) {
            this.scale = scale;
            return this;
        }

        public final Builder size(Dimension dimension, Dimension dimension2) {
            return size(new Size(dimension, dimension2));
        }

        public final Builder target(tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3) {
            return target(new ImageRequest$Builder$target$4(tm1Var, tm1Var2, tm1Var3));
        }

        public final <T> Builder fetcherFactory(Fetcher.Factory<T> factory) {
            j42.f0();
            throw null;
        }

        public final Builder listener(Listener listener) {
            this.listener = listener;
            return this;
        }

        public final Builder size(int i, int i2) {
            return size(SizeKt.Size(i, i2));
        }

        public final Builder target(Target target) {
            this.target = target;
            return this;
        }

        public final Builder error(tm1 tm1Var) {
            this.errorFactory = tm1Var;
            return this;
        }

        public final Builder fallback(tm1 tm1Var) {
            this.fallbackFactory = tm1Var;
            return this;
        }

        public final Builder placeholder(tm1 tm1Var) {
            this.placeholderFactory = tm1Var;
            return this;
        }

        public final Builder size(int i) {
            return size(SizeKt.Size(i, i));
        }

        public final Builder size(Size size) {
            return size(SizeResolverKt.SizeResolver(size));
        }

        public final Builder size(SizeResolver sizeResolver) {
            this.sizeResolver = sizeResolver;
            return this;
        }

        public final Builder placeholderMemoryCacheKey(MemoryCache.Key key) {
            this.placeholderMemoryCacheKey = key;
            return this;
        }

        public final Builder memoryCacheKey(String str) {
            this.memoryCacheKey = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Image error$lambda$0(Image image, ImageRequest imageRequest) {
            return image;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Image fallback$lambda$0(Image image, ImageRequest imageRequest) {
            return image;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Image placeholder$lambda$0(Image image, ImageRequest imageRequest) {
            return image;
        }

        public Builder(Context context) {
            this.context = context;
            this.defaults = Defaults.DEFAULT;
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.lazyMemoryCacheKeyExtras = p91.I;
            this.diskCacheKey = null;
            this.fileSystem = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.interceptorCoroutineContext = null;
            this.fetcherCoroutineContext = null;
            this.decoderCoroutineContext = null;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderFactory = UtilsKt.getEMPTY_IMAGE_FACTORY();
            this.errorFactory = UtilsKt.getEMPTY_IMAGE_FACTORY();
            this.fallbackFactory = UtilsKt.getEMPTY_IMAGE_FACTORY();
            this.sizeResolver = null;
            this.scale = null;
            this.precision = null;
            this.lazyExtras = Extras.EMPTY;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(ImageRequest imageRequest) {
            this(imageRequest, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Builder(ImageRequest imageRequest, Context context, int i, er0 er0Var) {
            this(imageRequest, (i & 2) != 0 ? imageRequest.getContext() : context);
        }
    }

    public final Builder newBuilder(Context context) {
        return new Builder(this, context);
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, Target target, Listener listener, String str, Map map, String str2, ke1 ke1Var, uj3 uj3Var, Decoder.Factory factory, tk0 tk0Var, tk0 tk0Var2, tk0 tk0Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, MemoryCache.Key key, tm1 tm1Var, tm1 tm1Var2, tm1 tm1Var3, SizeResolver sizeResolver, Scale scale, Precision precision, Extras extras, Defined defined, Defaults defaults, er0 er0Var) {
        this(context, obj, target, listener, str, map, str2, ke1Var, uj3Var, factory, tk0Var, tk0Var2, tk0Var3, cachePolicy, cachePolicy2, cachePolicy3, key, tm1Var, tm1Var2, tm1Var3, sizeResolver, scale, precision, extras, defined, defaults);
    }
}

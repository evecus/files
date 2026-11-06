package coil3.memory;

import coil3.BitmapImage;
import coil3.EventListener;
import coil3.ImageLoader;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.Interceptor;
import coil3.memory.MemoryCache;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.Options;
import coil3.request.RequestService;
import coil3.request.SuccessResult;
import coil3.size.Dimension;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.util.Logger;
import coil3.util.UtilsKt;
import defpackage.er0;
import defpackage.s83;
import defpackage.sv2;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MemoryCacheService {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_DISK_CACHE_KEY = "coil#disk_cache_key";
    public static final String EXTRA_IS_SAMPLED = "coil#is_sampled";
    public static final String EXTRA_SIZE = "coil#size";
    private static final String TAG = "MemoryCacheService";
    private final ImageLoader imageLoader;
    private final Logger logger;
    private final RequestService requestService;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Precision.values().length];
            try {
                iArr2[Precision.EXACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Precision.INEXACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public MemoryCacheService(ImageLoader imageLoader, RequestService requestService, Logger logger) {
        this.imageLoader = imageLoader;
        this.requestService = requestService;
        this.logger = logger;
    }

    private final String getDiskCacheKey(MemoryCache.Value value) {
        Object obj = value.getExtras().get(EXTRA_DISK_CACHE_KEY);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean isCacheValueValidForSize(ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value, Size size, Scale scale) {
        int abs;
        String str = key.getExtras().get(EXTRA_SIZE);
        if (str != null) {
            if (str.equals(size.toString())) {
                return true;
            }
            Logger logger = this.logger;
            if (logger != null) {
                Logger.Level level = Logger.Level.Debug;
                if (logger.getMinLevel().compareTo(level) <= 0) {
                    logger.log(TAG, level, imageRequest.getData() + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + size + ").", null);
                }
            }
            return false;
        }
        if (!isSampled(value) && (SizeKt.isOriginal(size) || imageRequest.getPrecision() == Precision.INEXACT)) {
            return true;
        }
        int width = value.getImage().getWidth();
        int height = value.getImage().getHeight();
        Size maxBitmapSize = value.getImage() instanceof BitmapImage ? ImageRequestsKt.getMaxBitmapSize(imageRequest) : Size.ORIGINAL;
        Dimension width2 = size.getWidth();
        int m116unboximpl = width2 instanceof Dimension.Pixels ? ((Dimension.Pixels) width2).m116unboximpl() : Integer.MAX_VALUE;
        Dimension width3 = maxBitmapSize.getWidth();
        int min = Math.min(m116unboximpl, width3 instanceof Dimension.Pixels ? ((Dimension.Pixels) width3).m116unboximpl() : Integer.MAX_VALUE);
        Dimension height2 = size.getHeight();
        int m116unboximpl2 = height2 instanceof Dimension.Pixels ? ((Dimension.Pixels) height2).m116unboximpl() : Integer.MAX_VALUE;
        Dimension height3 = maxBitmapSize.getHeight();
        int min2 = Math.min(m116unboximpl2, height3 instanceof Dimension.Pixels ? ((Dimension.Pixels) height3).m116unboximpl() : Integer.MAX_VALUE);
        double d = min / width;
        double d2 = min2 / height;
        int i = WhenMappings.$EnumSwitchMapping$0[((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? Scale.FIT : scale).ordinal()];
        if (i != 1) {
            if (i != 2) {
                s83.v();
                return false;
            }
            if (d < d2) {
                abs = Math.abs(min - width);
            } else {
                abs = Math.abs(min2 - height);
                d = d2;
            }
        } else if (d > d2) {
            abs = Math.abs(min - width);
        } else {
            abs = Math.abs(min2 - height);
            d = d2;
        }
        if (abs <= 1) {
            return true;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[imageRequest.getPrecision().ordinal()];
        if (i2 == 1) {
            if (d == 1.0d) {
                return true;
            }
            Logger logger2 = this.logger;
            if (logger2 != null) {
                Logger.Level level2 = Logger.Level.Debug;
                if (logger2.getMinLevel().compareTo(level2) <= 0) {
                    logger2.log(TAG, level2, imageRequest.getData() + ": Memory cached image's size (" + width + ", " + height + ") does not exactly match the target size (" + min + ", " + min2 + ").", null);
                }
            }
            return false;
        }
        if (i2 != 2) {
            s83.v();
            return false;
        }
        if (d <= 1.0d) {
            return true;
        }
        Logger logger3 = this.logger;
        if (logger3 != null) {
            Logger.Level level3 = Logger.Level.Debug;
            if (logger3.getMinLevel().compareTo(level3) <= 0) {
                logger3.log(TAG, level3, imageRequest.getData() + ": Memory cached image's size (" + width + ", " + height + ") is smaller than the target size (" + min + ", " + min2 + ").", null);
            }
        }
        return false;
    }

    private final boolean isSampled(MemoryCache.Value value) {
        Object obj = value.getExtras().get(EXTRA_IS_SAMPLED);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final MemoryCache.Value getCacheValue(ImageRequest imageRequest, MemoryCache.Key key, Size size, Scale scale) {
        if (!imageRequest.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        MemoryCache memoryCache = this.imageLoader.getMemoryCache();
        MemoryCache.Value value = memoryCache != null ? memoryCache.get(key) : null;
        if (value == null || !isCacheValueValid$io_coil_kt_coil3_coil_core(imageRequest, key, value, size, scale)) {
            return null;
        }
        return value;
    }

    public final boolean isCacheValueValid$io_coil_kt_coil3_coil_core(ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value, Size size, Scale scale) {
        if (this.requestService.isCacheValueValidForHardware(imageRequest, value)) {
            return isCacheValueValidForSize(imageRequest, key, value, size, scale);
        }
        Logger logger = this.logger;
        if (logger == null) {
            return false;
        }
        Logger.Level level = Logger.Level.Debug;
        if (logger.getMinLevel().compareTo(level) > 0) {
            return false;
        }
        logger.log(TAG, level, imageRequest.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final MemoryCache.Key newCacheKey(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener) {
        if (imageRequest.getMemoryCachePolicy() == CachePolicy.DISABLED) {
            return null;
        }
        if (imageRequest.getMemoryCacheKey() != null) {
            return new MemoryCache.Key(imageRequest.getMemoryCacheKey(), imageRequest.getMemoryCacheKeyExtras());
        }
        eventListener.keyStart(imageRequest, obj);
        String key = UtilsKt.key(this.imageLoader.getComponents(), obj, options, this.logger, TAG);
        eventListener.keyEnd(imageRequest, key);
        if (key == null) {
            return null;
        }
        if (ImageRequestsKt.getTransformations(imageRequest).isEmpty()) {
            return new MemoryCache.Key(key, imageRequest.getMemoryCacheKeyExtras());
        }
        LinkedHashMap Y = sv2.Y(imageRequest.getMemoryCacheKeyExtras());
        Y.put(EXTRA_SIZE, options.getSize().toString());
        return new MemoryCache.Key(key, Y);
    }

    public final SuccessResult newResult(Interceptor.Chain chain, ImageRequest imageRequest, MemoryCache.Key key, MemoryCache.Value value) {
        return new SuccessResult(value.getImage(), imageRequest, DataSource.MEMORY_CACHE, key, getDiskCacheKey(value), isSampled(value), UtilsKt.isPlaceholderCached(chain));
    }

    public final boolean setCacheValue(MemoryCache.Key key, ImageRequest imageRequest, EngineInterceptor.ExecuteResult executeResult) {
        MemoryCache memoryCache;
        if (key == null || !imageRequest.getMemoryCachePolicy().getWriteEnabled() || !executeResult.getImage().getShareable() || (memoryCache = this.imageLoader.getMemoryCache()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(EXTRA_IS_SAMPLED, Boolean.valueOf(executeResult.isSampled()));
        String diskCacheKey = executeResult.getDiskCacheKey();
        if (diskCacheKey != null) {
            linkedHashMap.put(EXTRA_DISK_CACHE_KEY, diskCacheKey);
        }
        memoryCache.set(key, new MemoryCache.Value(executeResult.getImage(), linkedHashMap));
        return true;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}

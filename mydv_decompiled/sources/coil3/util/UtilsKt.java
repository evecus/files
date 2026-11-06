package coil3.util;

import coil3.ComponentRegistry;
import coil3.EventListener;
import coil3.Image;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.Decoder;
import coil3.intercept.Interceptor;
import coil3.intercept.RealInterceptorChain;
import coil3.key.Keyer;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.NullRequestDataException;
import coil3.request.Options;
import coil3.util.Logger;
import defpackage.hf1;
import defpackage.iy3;
import defpackage.j42;
import defpackage.k60;
import defpackage.q8;
import defpackage.rk0;
import defpackage.s24;
import defpackage.s83;
import defpackage.t72;
import defpackage.tk0;
import defpackage.tm1;
import defpackage.uj3;
import defpackage.vk0;
import java.io.Closeable;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class UtilsKt {
    private static final tm1 EMPTY_IMAGE_FACTORY = new tm1() { // from class: coil3.util.UtilsKt$EMPTY_IMAGE_FACTORY$1
        @Override // defpackage.tm1
        public final Void invoke(ImageRequest imageRequest) {
            return null;
        }
    };
    public static final String MIME_TYPE_HEIC = "image/heic";
    public static final String MIME_TYPE_HEIF = "image/heif";
    public static final String MIME_TYPE_JPEG = "image/jpeg";
    public static final String MIME_TYPE_WEBP = "image/webp";
    public static final String MIME_TYPE_XML = "text/xml";
    public static final String SCHEME_FILE = "file";

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataSource.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ErrorResult ErrorResult(ImageRequest imageRequest, Throwable th) {
        Image error;
        if (th instanceof NullRequestDataException) {
            error = imageRequest.fallback();
            if (error == null) {
                error = imageRequest.error();
            }
        } else {
            error = imageRequest.error();
        }
        return new ErrorResult(error, imageRequest, th);
    }

    public static final ComponentRegistry.Builder addFirst(ComponentRegistry.Builder builder, uj3 uj3Var) {
        if (uj3Var != null) {
            builder.getLazyFetcherFactories$io_coil_kt_coil3_coil_core().add(0, new iy3(uj3Var, (byte) 16));
        }
        return builder;
    }

    public static final void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final vk0 getDispatcher(tk0 tk0Var) {
        rk0 rk0Var = tk0Var.get(q8.i0);
        if (rk0Var instanceof vk0) {
            return (vk0) rk0Var;
        }
        return null;
    }

    public static final tm1 getEMPTY_IMAGE_FACTORY() {
        return EMPTY_IMAGE_FACTORY;
    }

    public static final String getEmoji(DataSource dataSource) {
        int i = WhenMappings.$EnumSwitchMapping$0[dataSource.ordinal()];
        if (i == 1 || i == 2) {
            return "🧠";
        }
        if (i == 3) {
            return "💾";
        }
        if (i == 4) {
            return "☁️";
        }
        s83.v();
        return null;
    }

    public static final EventListener getEventListener(Interceptor.Chain chain) {
        return chain instanceof RealInterceptorChain ? ((RealInterceptorChain) chain).getEventListener() : EventListener.NONE;
    }

    public static final boolean isFileUri(Uri uri) {
        return ((uri.getScheme() != null && !j42.c(uri.getScheme(), SCHEME_FILE)) || uri.getPath() == null || Utils_androidKt.isAssetUri(uri)) ? false : true;
    }

    public static final boolean isMinOrMax(int i) {
        return i == Integer.MIN_VALUE || i == Integer.MAX_VALUE;
    }

    public static final boolean isPlaceholderCached(Interceptor.Chain chain) {
        return (chain instanceof RealInterceptorChain) && ((RealInterceptorChain) chain).isPlaceholderCached();
    }

    public static final String key(ComponentRegistry componentRegistry, Object obj, Options options, Logger logger, String str) {
        List<uj3> keyers = componentRegistry.getKeyers();
        int size = keyers.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            uj3 uj3Var = keyers.get(i);
            Keyer keyer = (Keyer) uj3Var.I;
            if (((k60) ((t72) uj3Var.J)).d(obj)) {
                keyer.getClass();
                String key = keyer.key(obj, options);
                if (key != null) {
                    return key;
                }
                z = true;
            }
        }
        if (!z && logger != null) {
            Logger.Level level = Logger.Level.Warn;
            if (logger.getMinLevel().compareTo(level) <= 0) {
                logger.log(str, level, hf1.x("No keyer is registered for data with type '", s24.a(obj.getClass()).c(), "'. Register Keyer<", s24.a(obj.getClass()).c(), "> in the component registry to cache the output image in the memory cache."), null);
            }
        }
        return null;
    }

    public static final void closeQuietly(AutoCloseable autoCloseable) {
        try {
            hf1.E(autoCloseable);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final ComponentRegistry.Builder addFirst(ComponentRegistry.Builder builder, Decoder.Factory factory) {
        if (factory != null) {
            builder.getLazyDecoderFactories$io_coil_kt_coil3_coil_core().add(0, new iy3(factory, (byte) 17));
        }
        return builder;
    }
}

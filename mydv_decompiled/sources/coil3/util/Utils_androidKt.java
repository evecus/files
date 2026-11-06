package coil3.util;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import coil3.BitmapImage;
import coil3.Image;
import coil3.Uri;
import coil3.UriKt;
import coil3.request.ImageRequest;
import coil3.size.Scale;
import coil3.util.Logger;
import defpackage.j42;
import defpackage.o70;
import defpackage.rh5;
import defpackage.s83;
import defpackage.zy;
import java.io.File;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Utils_androidKt {
    public static final String ASSET_FILE_PATH_ROOT = "android_asset";
    private static final Bitmap.Config DEFAULT_BITMAP_CONFIG;
    private static final ColorSpace NULL_COLOR_SPACE = null;
    private static final Bitmap.Config[] VALID_TRANSFORMATION_CONFIGS;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Logger.Level.values().length];
            try {
                iArr[Logger.Level.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Logger.Level.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Logger.Level.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Logger.Level.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Logger.Level.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            config = Bitmap.Config.ARGB_8888;
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{config, config2};
        } else {
            config = Bitmap.Config.ARGB_8888;
            configArr = new Bitmap.Config[]{config};
        }
        VALID_TRANSFORMATION_CONFIGS = configArr;
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        }
        DEFAULT_BITMAP_CONFIG = config;
    }

    public static final Bitmap.Config getDEFAULT_BITMAP_CONFIG() {
        return DEFAULT_BITMAP_CONFIG;
    }

    public static final Drawable getDrawableCompat(ImageRequest imageRequest, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() != 0) {
            return ContextsKt.getDrawableCompat(imageRequest.getContext(), num.intValue());
        }
        return null;
    }

    public static final int getHeight(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final ColorSpace getNULL_COLOR_SPACE() {
        return NULL_COLOR_SPACE;
    }

    public static final int getNightMode(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final File getSafeCacheDir(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        zy.i("cacheDir == null");
        return null;
    }

    public static final Scale getScale(ImageView imageView) {
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[scaleType.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
    }

    public static final Bitmap.Config[] getVALID_TRANSFORMATION_CONFIGS() {
        return VALID_TRANSFORMATION_CONFIGS;
    }

    public static final int getWidth(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean isAssetUri(Uri uri) {
        return j42.c(uri.getScheme(), UtilsKt.SCHEME_FILE) && j42.c(o70.U0(UriKt.getPathSegments(uri)), ASSET_FILE_PATH_ROOT);
    }

    public static final boolean isMainThread() {
        return j42.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean isVector(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof rh5);
    }

    public static final void prepareToDraw(Image image) {
        if (image instanceof BitmapImage) {
            ((BitmapImage) image).getBitmap().prepareToDraw();
        }
    }

    public static final void println(Logger.Level level, String str, String str2) {
        Log.println(toInt(level), str, str2);
    }

    private static final int toInt(Logger.Level level) {
        int i = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        s83.v();
        return 0;
    }
}

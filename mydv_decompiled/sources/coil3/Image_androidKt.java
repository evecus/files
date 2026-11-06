package coil3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Image_androidKt {
    public static final Drawable asDrawable(Image image, Resources resources) {
        return image instanceof DrawableImage ? ((DrawableImage) image).getDrawable() : image instanceof BitmapImage ? new BitmapDrawable(resources, ((BitmapImage) image).getBitmap()) : new ImageDrawable(image);
    }

    public static final Image asImage(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? asImage$default(((BitmapDrawable) drawable).getBitmap(), false, 1, null) : new DrawableImage(drawable, false);
    }

    public static /* synthetic */ BitmapImage asImage$default(Bitmap bitmap, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return asImage(bitmap, z);
    }

    public static final Bitmap toBitmap(Image image, int i, int i2, Bitmap.Config config) {
        if (image instanceof BitmapImage) {
            BitmapImage bitmapImage = (BitmapImage) image;
            if (bitmapImage.getBitmap().getWidth() == i && bitmapImage.getBitmap().getHeight() == i2 && bitmapImage.getBitmap().getConfig() == config) {
                return bitmapImage.getBitmap();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        image.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static /* synthetic */ Bitmap toBitmap$default(Image image, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = image.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = image.getHeight();
        }
        return toBitmap(image, i, i2);
    }

    public static final BitmapImage asImage(Bitmap bitmap, boolean z) {
        return new BitmapImage(bitmap, z);
    }

    public static final BitmapImage asImage(Bitmap bitmap) {
        return asImage$default(bitmap, false, 1, null);
    }

    public static final Image asImage(Drawable drawable, boolean z) {
        if (drawable instanceof BitmapDrawable) {
            return asImage(((BitmapDrawable) drawable).getBitmap(), z);
        }
        return new DrawableImage(drawable, z);
    }

    public static /* synthetic */ void Bitmap$annotations() {
    }

    public static final Bitmap toBitmap(Image image, int i) {
        return toBitmap$default(image, i, 0, 2, null);
    }

    public static final Bitmap toBitmap(Image image, int i, int i2) {
        Bitmap.Config config = image instanceof BitmapImage ? ((BitmapImage) image).getBitmap().getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return toBitmap(image, i, i2, config);
    }

    public static final Bitmap toBitmap(Image image) {
        return toBitmap$default(image, 0, 0, 3, null);
    }
}

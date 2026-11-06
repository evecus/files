package coil3.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.BitmapImage;
import coil3.DrawableImage;
import coil3.Image;
import coil3.Image_androidKt;
import defpackage.ba;
import defpackage.dd;
import defpackage.f41;
import defpackage.i42;
import defpackage.o10;
import defpackage.rj3;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ImagePainter_androidKt {
    /* renamed from: asPainter-55t9-rM, reason: not valid java name */
    public static final rj3 m53asPainter55t9rM(Image image, Context context, int i) {
        if (image instanceof BitmapImage) {
            return i42.G(new dd(((BitmapImage) image).getBitmap()), i);
        }
        if (!(image instanceof DrawableImage)) {
            return new ImagePainter(image);
        }
        Drawable mutate = Image_androidKt.asDrawable(image, context.getResources()).mutate();
        mutate.setFilterBitmap(true ^ (i == 0));
        return new f41(mutate);
    }

    /* renamed from: asPainter-55t9-rM$default, reason: not valid java name */
    public static rj3 m54asPainter55t9rM$default(Image image, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return m53asPainter55t9rM(image, context, i);
    }

    public static final Canvas getNativeCanvas(o10 o10Var) {
        return ba.b(o10Var);
    }
}

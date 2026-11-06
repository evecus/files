package coil3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import defpackage.su0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ImageDrawable extends Drawable {
    private final Image image;

    public ImageDrawable(Image image) {
        this.image = image;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.image.draw(canvas);
    }

    public final Image getImage() {
        return this.image;
    }

    @Override // android.graphics.drawable.Drawable
    @su0
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

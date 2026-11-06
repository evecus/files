package coil3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import coil3.util.Utils_androidKt;
import defpackage.j42;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DrawableImage implements Image {
    private final Drawable drawable;
    private final boolean shareable;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface SizeProvider {
        long getSize();
    }

    public DrawableImage(Drawable drawable, boolean z) {
        this.drawable = drawable;
        this.shareable = z;
    }

    @Override // coil3.Image
    public void draw(Canvas canvas) {
        this.drawable.draw(canvas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableImage)) {
            return false;
        }
        DrawableImage drawableImage = (DrawableImage) obj;
        return j42.c(this.drawable, drawableImage.drawable) && this.shareable == drawableImage.shareable;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil3.Image
    public int getHeight() {
        return Utils_androidKt.getHeight(this.drawable);
    }

    @Override // coil3.Image
    public boolean getShareable() {
        return this.shareable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // coil3.Image
    public long getSize() {
        Drawable drawable = this.drawable;
        long size = drawable instanceof SizeProvider ? ((SizeProvider) drawable).getSize() : Utils_androidKt.getWidth(drawable) * 4 * Utils_androidKt.getHeight(this.drawable);
        if (size < 0) {
            return 0L;
        }
        return size;
    }

    @Override // coil3.Image
    public int getWidth() {
        return Utils_androidKt.getWidth(this.drawable);
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + (this.shareable ? 1231 : 1237);
    }

    public String toString() {
        return "DrawableImage(drawable=" + this.drawable + ", shareable=" + this.shareable + ")";
    }
}

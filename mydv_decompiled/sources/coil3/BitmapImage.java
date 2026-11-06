package coil3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import coil3.util.BitmapsKt;
import defpackage.j42;
import defpackage.pt1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class BitmapImage implements Image {
    private final Bitmap bitmap;
    private final boolean shareable;

    public BitmapImage(Bitmap bitmap, boolean z) {
        this.bitmap = bitmap;
        this.shareable = z;
    }

    @Override // coil3.Image
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapImage)) {
            return false;
        }
        BitmapImage bitmapImage = (BitmapImage) obj;
        return j42.c(this.bitmap, bitmapImage.bitmap) && this.shareable == bitmapImage.shareable;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // coil3.Image
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // coil3.Image
    public boolean getShareable() {
        return this.shareable;
    }

    @Override // coil3.Image
    public long getSize() {
        return BitmapsKt.getAllocationByteCountCompat(this.bitmap);
    }

    @Override // coil3.Image
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public int hashCode() {
        return pt1.o(this.shareable) + (this.bitmap.hashCode() * 31);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.bitmap + ", shareable=" + this.shareable + ")";
    }
}

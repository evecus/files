package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import coil3.size.Size;
import coil3.util.BitmapsKt;
import defpackage.fj0;
import defpackage.s24;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class CircleCropTransformation extends Transformation {
    private final String cacheKey = String.valueOf(s24.a(CircleCropTransformation.class).b());

    @Override // coil3.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil3.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, fj0 fj0Var) {
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(min, min, BitmapsKt.getSafeConfig(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        Paint newScaledShaderPaint = TransformationsKt.newScaledShaderPaint(bitmap, min, min);
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, newScaledShaderPaint);
        return createBitmap;
    }
}

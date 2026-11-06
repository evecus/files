package coil3.transform;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import coil3.decode.DecodeUtils;
import coil3.size.Dimension;
import coil3.size.Scale;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.util.BitmapsKt;
import coil3.util.IntPair;
import defpackage.er0;
import defpackage.fj0;
import defpackage.mw2;
import defpackage.s24;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class RoundedCornersTransformation extends Transformation {
    private final float bottomLeft;
    private final float bottomRight;
    private final String cacheKey;
    private final float topLeft;
    private final float topRight;

    public RoundedCornersTransformation(float f, float f2, float f3, float f4) {
        this.topLeft = f;
        this.topRight = f2;
        this.bottomLeft = f3;
        this.bottomRight = f4;
        if (f < 0.0f || f2 < 0.0f || f3 < 0.0f || f4 < 0.0f) {
            s83.t("All radii must be >= 0.");
            throw null;
        }
        this.cacheKey = s24.a(RoundedCornersTransformation.class).b() + "-" + f + "," + f2 + "," + f3 + "," + f4;
    }

    /* renamed from: calculateOutputSize-nmZnaPc, reason: not valid java name */
    private final long m117calculateOutputSizenmZnaPc(Bitmap bitmap, Size size) {
        if (SizeKt.isOriginal(size)) {
            return IntPair.m121constructorimpl(bitmap.getWidth(), bitmap.getHeight());
        }
        Dimension component1 = size.component1();
        Dimension component2 = size.component2();
        if ((component1 instanceof Dimension.Pixels) && (component2 instanceof Dimension.Pixels)) {
            return IntPair.m121constructorimpl(((Dimension.Pixels) component1).m116unboximpl(), ((Dimension.Pixels) component2).m116unboximpl());
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Dimension width2 = size.getWidth();
        int m116unboximpl = width2 instanceof Dimension.Pixels ? ((Dimension.Pixels) width2).m116unboximpl() : Integer.MIN_VALUE;
        Dimension height2 = size.getHeight();
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, m116unboximpl, height2 instanceof Dimension.Pixels ? ((Dimension.Pixels) height2).m116unboximpl() : Integer.MIN_VALUE, Scale.FILL, Size.ORIGINAL);
        return IntPair.m121constructorimpl(mw2.O(bitmap.getWidth() * computeSizeMultiplier), mw2.O(computeSizeMultiplier * bitmap.getHeight()));
    }

    @Override // coil3.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil3.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, fj0 fj0Var) {
        long m117calculateOutputSizenmZnaPc = m117calculateOutputSizenmZnaPc(bitmap, size);
        int m125getFirstimpl = IntPair.m125getFirstimpl(m117calculateOutputSizenmZnaPc);
        int m126getSecondimpl = IntPair.m126getSecondimpl(m117calculateOutputSizenmZnaPc);
        Bitmap createBitmap = Bitmap.createBitmap(m125getFirstimpl, m126getSecondimpl, BitmapsKt.getSafeConfig(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        Paint newScaledShaderPaint = TransformationsKt.newScaledShaderPaint(bitmap, m125getFirstimpl, m126getSecondimpl);
        float f = this.topLeft;
        float f2 = this.topRight;
        if (f == f2) {
            float f3 = this.bottomLeft;
            if (f2 == f3 && f3 == this.bottomRight) {
                canvas.drawRoundRect(0.0f, 0.0f, m125getFirstimpl, m126getSecondimpl, f, f, newScaledShaderPaint);
                return createBitmap;
            }
        }
        float f4 = this.bottomRight;
        float f5 = this.bottomLeft;
        float[] fArr = {f, f, f2, f2, f4, f4, f5, f5};
        RectF rectF = new RectF(0.0f, 0.0f, m125getFirstimpl, m126getSecondimpl);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, newScaledShaderPaint);
        return createBitmap;
    }

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public /* synthetic */ RoundedCornersTransformation(float f, float f2, float f3, float f4, int i, er0 er0Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public RoundedCornersTransformation(float f) {
        this(f, f, f, f);
    }
}

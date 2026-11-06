package coil3.util;

import android.graphics.Bitmap;
import coil3.decode.DecodeUtils;
import coil3.size.Scale;
import coil3.size.Size;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DrawableUtils {
    private static final int DEFAULT_SIZE = 512;
    public static final DrawableUtils INSTANCE = new DrawableUtils();

    private DrawableUtils() {
    }

    private final boolean isConfigValid(Bitmap bitmap, Bitmap.Config config) {
        return bitmap.getConfig() == BitmapsKt.toSoftware(config);
    }

    private final boolean isSizeValid(boolean z, Bitmap bitmap, Size size, Scale scale, Size size2) {
        if (z) {
            return true;
        }
        long m75computeDstSizesEdh43o = DecodeUtils.m75computeDstSizesEdh43o(bitmap.getWidth(), bitmap.getHeight(), size, scale, size2);
        return DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), IntPair.m125getFirstimpl(m75computeDstSizesEdh43o), IntPair.m126getSecondimpl(m75computeDstSizesEdh43o), scale, size2) == 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap convertToBitmap(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, coil3.size.Size r10, coil3.size.Scale r11, coil3.size.Size r12, boolean r13) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L1d
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r3 = r0.getBitmap()
            boolean r0 = r7.isConfigValid(r3, r9)
            if (r0 == 0) goto L1d
            r1 = r7
            r4 = r10
            r5 = r11
            r6 = r12
            r2 = r13
            boolean r7 = r1.isSizeValid(r2, r3, r4, r5, r6)
            if (r7 == 0) goto L20
            return r3
        L1d:
            r4 = r10
            r5 = r11
            r6 = r12
        L20:
            android.graphics.drawable.Drawable r7 = r8.mutate()
            int r8 = coil3.util.Utils_androidKt.getWidth(r7)
            r10 = 512(0x200, float:7.17E-43)
            if (r8 <= 0) goto L2e
            r0 = r8
            goto L2f
        L2e:
            r0 = r10
        L2f:
            int r8 = coil3.util.Utils_androidKt.getHeight(r7)
            if (r8 <= 0) goto L37
            r1 = r8
            goto L38
        L37:
            r1 = r10
        L38:
            long r10 = coil3.decode.DecodeUtils.m75computeDstSizesEdh43o(r0, r1, r4, r5, r6)
            int r2 = coil3.util.IntPair.m125getFirstimpl(r10)
            int r3 = coil3.util.IntPair.m126getSecondimpl(r10)
            r4 = r5
            r5 = r6
            double r10 = coil3.decode.DecodeUtils.computeSizeMultiplier(r0, r1, r2, r3, r4, r5)
            double r12 = (double) r0
            double r12 = r12 * r10
            int r8 = defpackage.mw2.O(r12)
            double r12 = (double) r1
            double r10 = r10 * r12
            int r10 = defpackage.mw2.O(r10)
            android.graphics.Bitmap$Config r9 = coil3.util.BitmapsKt.toSoftware(r9)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r8, r10, r9)
            android.graphics.Rect r11 = r7.getBounds()
            int r12 = r11.left
            int r13 = r11.top
            int r0 = r11.right
            int r11 = r11.bottom
            r1 = 0
            r7.setBounds(r1, r1, r8, r10)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r9)
            r7.draw(r8)
            r7.setBounds(r12, r13, r0, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.util.DrawableUtils.convertToBitmap(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, coil3.size.Size, coil3.size.Scale, coil3.size.Size, boolean):android.graphics.Bitmap");
    }
}

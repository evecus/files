package coil3.decode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import coil3.util.BitmapsKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ExifUtils {
    public static final ExifUtils INSTANCE = new ExifUtils();
    private static final Paint paint = new Paint(3);

    private ExifUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final coil3.decode.ExifData getExifData(java.lang.String r4, defpackage.mz r5, coil3.decode.ExifOrientationStrategy r6) {
        /*
            r3 = this;
            boolean r3 = r6.supports(r4, r5)
            if (r3 == 0) goto L5a
            xb1 r3 = new xb1
            coil3.decode.ExifInterfaceInputStream r4 = new coil3.decode.ExifInterfaceInputStream
            s04 r5 = r5.peek()
            r04 r6 = new r04
            r6.<init>(r5)
            r4.<init>(r6)
            r3.<init>(r4)
            coil3.decode.ExifData r4 = new coil3.decode.ExifData
            java.lang.String r5 = "Orientation"
            tb1 r6 = r3.c(r5)
            r0 = 1
            if (r6 != 0) goto L25
            goto L2c
        L25:
            java.nio.ByteOrder r1 = r3.f     // Catch: java.lang.NumberFormatException -> L2c
            int r6 = r6.e(r1)     // Catch: java.lang.NumberFormatException -> L2c
            goto L2d
        L2c:
            r6 = r0
        L2d:
            r1 = 2
            r2 = 0
            if (r6 == r1) goto L3c
            r1 = 7
            if (r6 == r1) goto L3c
            r1 = 4
            if (r6 == r1) goto L3c
            r1 = 5
            if (r6 == r1) goto L3c
            r6 = r2
            goto L3d
        L3c:
            r6 = r0
        L3d:
            tb1 r5 = r3.c(r5)
            if (r5 != 0) goto L44
            goto L4a
        L44:
            java.nio.ByteOrder r3 = r3.f     // Catch: java.lang.NumberFormatException -> L4a
            int r0 = r5.e(r3)     // Catch: java.lang.NumberFormatException -> L4a
        L4a:
            switch(r0) {
                case 3: goto L54;
                case 4: goto L54;
                case 5: goto L51;
                case 6: goto L4e;
                case 7: goto L4e;
                case 8: goto L51;
                default: goto L4d;
            }
        L4d:
            goto L56
        L4e:
            r2 = 90
            goto L56
        L51:
            r2 = 270(0x10e, float:3.78E-43)
            goto L56
        L54:
            r2 = 180(0xb4, float:2.52E-43)
        L56:
            r4.<init>(r6, r2)
            return r4
        L5a:
            coil3.decode.ExifData r3 = coil3.decode.ExifData.NONE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.decode.ExifUtils.getExifData(java.lang.String, mz, coil3.decode.ExifOrientationStrategy):coil3.decode.ExifData");
    }

    public final Bitmap reverseTransformations(Bitmap bitmap, ExifData exifData) {
        if (!exifData.isFlipped() && !ExifUtilsKt.isRotated(exifData)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = bitmap.getWidth() / 2.0f;
        float height = bitmap.getHeight() / 2.0f;
        if (exifData.isFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (ExifUtilsKt.isRotated(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        float f = rectF.left;
        if (f != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f, -rectF.top);
        }
        Bitmap createBitmap = ExifUtilsKt.isSwapped(exifData) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), BitmapsKt.getSafeConfig(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), BitmapsKt.getSafeConfig(bitmap));
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, paint);
        bitmap.recycle();
        return createBitmap;
    }
}

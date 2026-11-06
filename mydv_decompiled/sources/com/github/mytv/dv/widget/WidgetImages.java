package com.github.mytv.dv.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LruCache;
import defpackage.fj0;
import defpackage.s83;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WidgetImages {
    public static final int $stable = 0;
    public static final WidgetImages INSTANCE = new WidgetImages();
    private static final LruCache<String, Bitmap> cache = new LruCache<>(48);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WidgetShape.values().length];
            try {
                iArr[WidgetShape.COOKIE4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetShape.COOKIE9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetShape.CLOVER4.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetShape.ROUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private WidgetImages() {
    }

    private final Path insetPath(Path path, int i, int i2, float f) {
        float f2 = i;
        float f3 = f * 2.0f;
        float f4 = i2;
        Path path2 = new Path(path);
        Matrix matrix = new Matrix();
        matrix.setScale((f2 - f3) / f2, (f4 - f3) / f4, f2 / 2.0f, f4 / 2.0f);
        path2.transform(matrix);
        return path2;
    }

    public static /* synthetic */ Object load$default(WidgetImages widgetImages, Context context, String str, int i, int i2, int i3, WidgetShape widgetShape, Integer num, Integer num2, fj0 fj0Var, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i2 = i;
        }
        if ((i4 & 16) != 0) {
            i3 = 12;
        }
        if ((i4 & 32) != 0) {
            widgetShape = WidgetShape.ROUNDED;
        }
        if ((i4 & 64) != 0) {
            num = null;
        }
        if ((i4 & 128) != 0) {
            num2 = null;
        }
        return widgetImages.load(context, str, i, i2, i3, widgetShape, num, num2, fj0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap render(Context context, Bitmap bitmap, int i, int i2, float f, WidgetShape widgetShape, Integer num, Integer num2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        float f2 = i;
        float f3 = i2;
        float max = Math.max(f2 / bitmap.getWidth(), f3 / bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        matrix.postTranslate((f2 - (bitmap.getWidth() * max)) / 2.0f, (f3 - (bitmap.getHeight() * max)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f4 = context.getResources().getDisplayMetrics().density;
        Path shapePath = shapePath(widgetShape, f2, f3, f);
        if (num == null) {
            canvas.drawPath(shapePath, paint);
            return createBitmap;
        }
        Paint paint2 = new Paint(1);
        paint2.setColor(num.intValue());
        canvas.drawPath(shapePath, paint2);
        float f5 = f4 * 2.0f;
        if (num2 != null) {
            Path insetPath = insetPath(shapePath, i, i2, f5);
            Paint paint3 = new Paint(1);
            paint3.setColor(num2.intValue());
            canvas.drawPath(insetPath, paint3);
        }
        canvas.drawPath(insetPath(shapePath, i, i2, f5 + f5), paint);
        return createBitmap;
    }

    private final Path shapePath(WidgetShape widgetShape, float f, float f2, float f3) {
        float cos;
        float f4;
        if (widgetShape == WidgetShape.ROUNDED) {
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, f, f2), f3, f3, Path.Direction.CW);
            return path;
        }
        int i = 120;
        float[] fArr = new float[120];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Float f5 = null;
            float f6 = 120.0f;
            float f7 = 2.0f;
            int i4 = 1;
            if (i3 >= 120) {
                int i5 = 0;
                while (i5 < 2) {
                    float[] fArr2 = new float[i];
                    int i6 = 0;
                    while (i6 < i) {
                        int i7 = i;
                        float f8 = 0.0f;
                        for (int i8 = -3; i8 < 4; i8++) {
                            f8 += fArr[((i6 + i8) + 120) % 120];
                        }
                        fArr2[i6] = f8 / 7.0f;
                        i6++;
                        i = i7;
                    }
                    i5++;
                    fArr = fArr2;
                }
                if (fArr.length != 0) {
                    float f9 = fArr[0];
                    int length = fArr.length - 1;
                    if (1 <= length) {
                        while (true) {
                            f9 = Math.max(f9, fArr[i4]);
                            if (i4 == length) {
                                break;
                            }
                            i4++;
                        }
                    }
                    f5 = Float.valueOf(f9);
                }
                r9 = f5 != null ? f5.floatValue() : 1.0f;
                Path path2 = new Path();
                int length2 = fArr.length;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = i9 + 1;
                    double d = ((i9 / f6) * 6.283185307179586d) - 1.5707963267948966d;
                    float f10 = fArr[i2] / r9;
                    float f11 = f / f7;
                    float f12 = f7;
                    float cos2 = (f11 * f10 * ((float) Math.cos(d))) + f11;
                    float f13 = f2 / f12;
                    float sin = (f10 * f13 * ((float) Math.sin(d))) + f13;
                    if (i9 == 0) {
                        path2.moveTo(cos2, sin);
                    } else {
                        path2.lineTo(cos2, sin);
                    }
                    i2++;
                    f7 = f12;
                    i9 = i10;
                    f6 = 120.0f;
                }
                path2.close();
                return path2;
            }
            float f14 = (i3 / 120.0f) * 6.2831855f;
            int i11 = WhenMappings.$EnumSwitchMapping$0[widgetShape.ordinal()];
            if (i11 == 1) {
                cos = ((float) Math.cos(f14 * 4.0f)) * 0.1f;
                f4 = 0.9f;
            } else if (i11 == 2) {
                cos = ((float) Math.cos(f14 * 9.0f)) * 0.06f;
                f4 = 0.94f;
            } else if (i11 == 3) {
                cos = ((float) Math.pow(Math.abs((float) Math.cos(f14 * 2.0f)), 0.55d)) * 0.38f;
                f4 = 0.62f;
            } else {
                if (i11 != 4) {
                    s83.v();
                    return null;
                }
                fArr[i3] = r9;
                i3++;
            }
            r9 = f4 + cos;
            fArr[i3] = r9;
            i3++;
        }
    }

    public static /* synthetic */ Bitmap solidShape$default(WidgetImages widgetImages, Context context, WidgetShape widgetShape, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i2 = 48;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = 12;
        }
        return widgetImages.solidShape(context, widgetShape, i, i5, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ad, code lost:
    
        if (r8 != r15) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(android.content.Context r27, java.lang.String r28, int r29, int r30, int r31, com.github.mytv.dv.widget.WidgetShape r32, java.lang.Integer r33, java.lang.Integer r34, defpackage.fj0 r35) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mytv.dv.widget.WidgetImages.load(android.content.Context, java.lang.String, int, int, int, com.github.mytv.dv.widget.WidgetShape, java.lang.Integer, java.lang.Integer, fj0):java.lang.Object");
    }

    public final Bitmap solidShape(Context context, WidgetShape widgetShape, int i, int i2, int i3) {
        context.getClass();
        widgetShape.getClass();
        int i4 = (int) (i2 * context.getResources().getDisplayMetrics().density);
        if (i4 < 24) {
            i4 = 24;
        }
        String str = "solid|" + i4 + "|" + widgetShape + "|" + i + "|" + i3;
        LruCache<String, Bitmap> lruCache = cache;
        Bitmap bitmap = lruCache.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        float f = i4;
        Path shapePath = shapePath(widgetShape, f, f, i3 * context.getResources().getDisplayMetrics().density);
        Paint paint = new Paint(1);
        paint.setColor(i);
        canvas.drawPath(shapePath, paint);
        lruCache.put(str, createBitmap);
        return createBitmap;
    }
}

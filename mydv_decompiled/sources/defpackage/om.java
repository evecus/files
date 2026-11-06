package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.text.TextUtils;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class om {
    public static final ss2 a = new ss2(30);
    public static Paint b;

    public static Typeface a(Typeface typeface, String str, int i) {
        FontVariationAxis[] fontVariationAxisArr;
        nm nmVar = new nm(typeface, str, i);
        ss2 ss2Var = a;
        Typeface typeface2 = (Typeface) ss2Var.a(nmVar);
        if (typeface2 != null) {
            return typeface2;
        }
        Paint paint = b;
        if (paint == null) {
            paint = new Paint();
            b = paint;
        }
        if (i != 0) {
            if (TextUtils.isEmpty(str)) {
                fontVariationAxisArr = new FontVariationAxis[0];
            } else {
                FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                if (fromFontVariationSettings != null) {
                    fontVariationAxisArr = fromFontVariationSettings;
                }
            }
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 >= fontVariationAxisArr.length) {
                    break;
                }
                FontVariationAxis fontVariationAxis = fontVariationAxisArr[i2];
                if ("wght".equals(fontVariationAxis.getTag())) {
                    float styleValue = fontVariationAxis.getStyleValue() + i;
                    fontVariationAxisArr[i2] = new FontVariationAxis("wght", styleValue >= 1.0f ? Math.min(styleValue, 1000.0f) : 1.0f);
                    z = true;
                }
                i2++;
            }
            if (!z) {
                FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[fontVariationAxisArr.length + 1];
                System.arraycopy(fontVariationAxisArr, 0, fontVariationAxisArr2, 0, fontVariationAxisArr.length);
                float f = i + 400;
                fontVariationAxisArr2[fontVariationAxisArr.length] = new FontVariationAxis("wght", f >= 1.0f ? Math.min(f, 1000.0f) : 1.0f);
                fontVariationAxisArr = fontVariationAxisArr2;
            }
            str = FontVariationAxis.toFontVariationSettings(fontVariationAxisArr);
        }
        if (Objects.equals(paint.getFontVariationSettings(), str)) {
            paint.setFontVariationSettings(null);
        }
        paint.setTypeface(typeface);
        if (!paint.setFontVariationSettings(str)) {
            return null;
        }
        Typeface typeface3 = paint.getTypeface();
        ss2Var.b(nmVar, typeface3);
        return typeface3;
    }

    public static int b(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static String c(TextView textView) {
        return textView.getFontVariationSettings();
    }

    public static void d(TextView textView, int i, int i2, int i3) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, 0);
    }

    public static void e(TextView textView, int[] iArr) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
    }

    public static void f(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}

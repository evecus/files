package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class wb5 {
    public static final ad4 a;
    public static final ss2 b;
    public static Paint c;

    static {
        Trace.beginSection(ui4.s("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new dc5();
        } else if (i >= 29) {
            a = new cc5();
        } else if (i >= 28) {
            a = new bc5();
        } else if (i >= 26) {
            a = new ac5();
        } else if (i < 24 || !yb5.K()) {
            a = new xb5();
        } else {
            a = new yb5();
        }
        b = new ss2(16);
        c = null;
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        r2 = r8.build();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r15, defpackage.ek1 r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, defpackage.lm r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.a(android.content.Context, ek1, android.content.res.Resources, int, java.lang.String, int, int, lm, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        Paint paint = c;
        if (paint == null) {
            paint = new Paint();
            c = paint;
        }
        paint.setTextSize(10.0f);
        c.setTypeface(typeface);
        PositionedGlyphs shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, c);
        if (shapeTextRun.glyphCount() == 0) {
            return null;
        }
        return shapeTextRun.getFont(0);
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class zb5 {
    public static final ThreadLocal a = new ThreadLocal();

    public static Typeface a(Typeface typeface, ok1 ok1Var, Context context) {
        if (typeface == null) {
            return null;
        }
        if (ok1Var.a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(ub.w(ok1Var, context));
        return paint.getTypeface();
    }
}

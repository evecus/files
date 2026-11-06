package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class g41 {
    public static final uc2 a = ut0.K(dh2.J, new u7((byte) 20));

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }
}

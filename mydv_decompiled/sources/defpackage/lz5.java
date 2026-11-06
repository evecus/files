package defpackage;

import android.graphics.Paint;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lz5 {
    public static final lz5 a = new lz5();

    public final long a(Paint paint) {
        int i = x70.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(z9.i(i));
    }

    public final void c(Paint paint, long j) {
        paint.setColor(mw2.V(j));
    }
}

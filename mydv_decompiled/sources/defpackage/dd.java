package defpackage;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dd implements tw1 {
    public final Bitmap a;

    public dd(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final void a(int i, int i2, int i3, int[] iArr) {
        Bitmap a = ed.a(this);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 26 && a.getConfig() == Bitmap.Config.HARDWARE) {
            a = a.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        Bitmap bitmap = a;
        bitmap.getPixels(iArr, 0, i3, 0, 0, i, i2);
        if (z) {
            bitmap.recycle();
        }
    }
}

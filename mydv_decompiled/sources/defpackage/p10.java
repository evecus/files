package defpackage;

import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.Window;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class p10 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static Insets b(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean c(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean d(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean e(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void f(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void g(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}

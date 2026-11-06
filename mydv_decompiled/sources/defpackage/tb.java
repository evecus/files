package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class tb {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder b(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ScrollCaptureTarget c(AndroidComposeView androidComposeView, Rect rect, Point point, td0 td0Var) {
        return new ScrollCaptureTarget(androidComposeView, rect, point, td0Var);
    }
}

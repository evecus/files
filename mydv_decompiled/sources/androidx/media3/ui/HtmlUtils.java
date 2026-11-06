package androidx.media3.ui;

import android.graphics.Color;
import androidx.media3.common.util.Util;
import defpackage.hf1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class HtmlUtils {
    private HtmlUtils() {
    }

    public static String cssAllClassDescendantsSelector(String str) {
        return hf1.x(".", str, ",.", str, " *");
    }

    public static String toCssRgba(int i) {
        return Util.formatInvariant("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}

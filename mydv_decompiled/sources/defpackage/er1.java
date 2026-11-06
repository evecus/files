package defpackage;

import android.graphics.RadialGradient;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.media.MediaCodecInfo;
import android.os.Binder;
import android.view.SurfaceControl;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class er1 {
    public static /* synthetic */ RadialGradient a(float f, float f2, float f3, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new RadialGradient(f, f2, f3, jArr, fArr, tileMode);
    }

    public static /* synthetic */ RenderNode b() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ SweepGradient c(float f, float f2, long[] jArr, float[] fArr) {
        return new SweepGradient(f, f2, jArr, fArr);
    }

    public static /* synthetic */ Typeface.CustomFallbackBuilder d(FontFamily fontFamily) {
        return new Typeface.CustomFallbackBuilder(fontFamily);
    }

    public static /* synthetic */ FontFamily.Builder e(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ Binder g() {
        return new Binder("WINDOW_AREA_REAR_DISPLAY");
    }

    public static /* synthetic */ SurfaceControl.Transaction h() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ WindowInsets.Builder i(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ FontFamily.Builder k(Font font) {
        return new FontFamily.Builder(font);
    }

    public static /* synthetic */ void l() {
    }
}

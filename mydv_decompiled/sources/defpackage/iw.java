package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class iw {
    public static /* synthetic */ BlendModeColorFilter a(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ LinearGradient b(float f, float f2, float f3, float f4, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new LinearGradient(f, f2, f3, f4, jArr, fArr, tileMode);
    }

    public static /* synthetic */ WindowInsets.Builder c() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}

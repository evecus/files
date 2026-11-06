package defpackage;

import android.app.PictureInPictureUiState;
import android.os.Build;
import android.text.StaticLayout;
import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class e71 {
    public static final void a(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static j81 b(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        byte b = 19;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            return new j81(b);
        }
        if (i < 31) {
            return new j81(b);
        }
        pictureInPictureUiState.isStashed();
        return new j81(b);
    }

    public static void c(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void d(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}

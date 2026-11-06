package androidx.media3.common;

import android.util.Pair;
import androidx.media3.common.util.Size;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface VideoCompositorSettings {
    public static final VideoCompositorSettings DEFAULT = new VideoCompositorSettings() { // from class: androidx.media3.common.VideoCompositorSettings.1
        @Override // androidx.media3.common.VideoCompositorSettings
        public Size getOutputSize(List<Size> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.VideoCompositorSettings
        public OverlaySettings getOverlaySettings(int i, long j) {
            return new OverlaySettings() { // from class: androidx.media3.common.VideoCompositorSettings.1.1
                @Override // androidx.media3.common.OverlaySettings
                public final float getAlphaScale() {
                    return 1.0f;
                }

                @Override // androidx.media3.common.OverlaySettings
                public final Pair getBackgroundFrameAnchor() {
                    return OverlaySettings.DEFAULT_BACKGROUND_FRAME_ANCHOR;
                }

                @Override // androidx.media3.common.OverlaySettings
                public final float getHdrLuminanceMultiplier() {
                    return 1.0f;
                }

                @Override // androidx.media3.common.OverlaySettings
                public final Pair getOverlayFrameAnchor() {
                    return OverlaySettings.DEFAULT_OVERLAY_FRAME_ANCHOR;
                }

                @Override // androidx.media3.common.OverlaySettings
                public final float getRotationDegrees() {
                    return 0.0f;
                }

                @Override // androidx.media3.common.OverlaySettings
                public final Pair getScale() {
                    return OverlaySettings.DEFAULT_SCALE;
                }
            };
        }
    };

    Size getOutputSize(List<Size> list);

    OverlaySettings getOverlaySettings(int i, long j);
}

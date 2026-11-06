package androidx.media3.common;

import android.util.Pair;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface OverlaySettings {
    public static final float DEFAULT_ALPHA_SCALE = 1.0f;
    public static final Pair<Float, Float> DEFAULT_BACKGROUND_FRAME_ANCHOR;
    public static final float DEFAULT_HDR_LUMINANCE_MULTIPLIER = 1.0f;
    public static final Pair<Float, Float> DEFAULT_OVERLAY_FRAME_ANCHOR;
    public static final float DEFAULT_ROTATION_DEGREES = 0.0f;
    public static final Pair<Float, Float> DEFAULT_SCALE;

    static {
        Float valueOf = Float.valueOf(0.0f);
        DEFAULT_BACKGROUND_FRAME_ANCHOR = Pair.create(valueOf, valueOf);
        DEFAULT_OVERLAY_FRAME_ANCHOR = Pair.create(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.0f);
        DEFAULT_SCALE = Pair.create(valueOf2, valueOf2);
    }

    float getAlphaScale();

    Pair<Float, Float> getBackgroundFrameAnchor();

    float getHdrLuminanceMultiplier();

    Pair<Float, Float> getOverlayFrameAnchor();

    float getRotationDegrees();

    Pair<Float, Float> getScale();
}

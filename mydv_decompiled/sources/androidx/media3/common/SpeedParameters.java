package androidx.media3.common;

import androidx.media3.common.audio.SpeedProvider;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SpeedParameters {
    public static final SpeedParameters DEFAULT = new SpeedParameters(SpeedProvider.DEFAULT, false);
    public final boolean shouldMaintainPitch;
    public final SpeedProvider speedProvider;

    public SpeedParameters(SpeedProvider speedProvider, boolean z) {
        this.speedProvider = speedProvider;
        this.shouldMaintainPitch = z;
    }
}

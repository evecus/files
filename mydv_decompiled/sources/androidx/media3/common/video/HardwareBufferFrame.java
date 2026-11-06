package androidx.media3.common.video;

import android.hardware.HardwareBuffer;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface HardwareBufferFrame extends Frame {

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Builder {
        HardwareBufferFrame build();

        Builder setContentTimeUs(long j);

        Builder setMetadata(Map<String, Object> map);
    }

    Builder buildUpon();

    HardwareBuffer getHardwareBuffer();
}

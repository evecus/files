package defpackage;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ej2 extends r42 {
    public final int J;

    public ej2(int i) {
        super(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED);
        this.J = i;
    }

    public ej2(String str, int i) {
        super(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, str);
        this.J = i;
    }

    public ej2(String str) {
        this(str, Log.LOG_LEVEL_OFF);
    }
}

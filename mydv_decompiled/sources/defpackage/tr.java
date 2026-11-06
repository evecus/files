package defpackage;

import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutputProvider;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class tr implements gz4 {
    public final /* synthetic */ byte I;

    public /* synthetic */ tr(byte b) {
        this.I = b;
    }

    @Override // defpackage.gz4
    public final Object get() {
        boolean isCompressedOffloadExplicitAacEnabled;
        String generateDefaultSessionId;
        Integer lambda$static$0;
        switch (this.I) {
            case 0:
                isCompressedOffloadExplicitAacEnabled = AudioTrackAudioOutputProvider.isCompressedOffloadExplicitAacEnabled();
                return Boolean.valueOf(isCompressedOffloadExplicitAacEnabled);
            case 1:
                generateDefaultSessionId = DefaultPlaybackSessionManager.generateDefaultSessionId();
                return generateDefaultSessionId;
            case 2:
                return new DefaultLoadControl();
            case 3:
                lambda$static$0 = MediaCodecInfo.lambda$static$0();
                return lambda$static$0;
            default:
                throw new IllegalStateException();
        }
    }
}

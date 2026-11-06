package androidx.media3.exoplayer;

import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.StreamVolumeManager;
import defpackage.pn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements pn1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ j(byte b, int i) {
        this.a = b;
        this.b = i;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        Integer lambda$setAudioSessionId$13;
        Integer lambda$onAudioSessionIdChanged$2;
        Integer lambda$onAudioSessionIdChanged$3;
        StreamVolumeManager.StreamVolumeState lambda$setVolume$3;
        StreamVolumeManager.StreamVolumeState lambda$setStreamType$1;
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                lambda$setAudioSessionId$13 = ExoPlayerImpl.lambda$setAudioSessionId$13(i, (Integer) obj);
                return lambda$setAudioSessionId$13;
            case 1:
                lambda$onAudioSessionIdChanged$2 = ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$2(i, (Integer) obj);
                return lambda$onAudioSessionIdChanged$2;
            case 2:
                lambda$onAudioSessionIdChanged$3 = ExoPlayerImpl.ComponentListener.lambda$onAudioSessionIdChanged$3(i, (Integer) obj);
                return lambda$onAudioSessionIdChanged$3;
            case 3:
                lambda$setVolume$3 = StreamVolumeManager.lambda$setVolume$3(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setVolume$3;
            default:
                lambda$setStreamType$1 = StreamVolumeManager.lambda$setStreamType$1(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setStreamType$1;
        }
    }
}

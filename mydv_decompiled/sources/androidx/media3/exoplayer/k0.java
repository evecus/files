package androidx.media3.exoplayer;

import androidx.media3.exoplayer.StreamVolumeManager;
import defpackage.pn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements pn1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ k0(Object obj, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        StreamVolumeManager.StreamVolumeState lambda$increaseVolume$6;
        StreamVolumeManager.StreamVolumeState lambda$decreaseVolume$8;
        StreamVolumeManager.StreamVolumeState lambda$setStreamType$2;
        Integer lambda$setAudioSessionId$14;
        byte b = this.a;
        int i = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                lambda$increaseVolume$6 = ((StreamVolumeManager) obj2).lambda$increaseVolume$6(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$increaseVolume$6;
            case 1:
                lambda$decreaseVolume$8 = ((StreamVolumeManager) obj2).lambda$decreaseVolume$8(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$decreaseVolume$8;
            case 2:
                lambda$setStreamType$2 = ((StreamVolumeManager) obj2).lambda$setStreamType$2(i, (StreamVolumeManager.StreamVolumeState) obj);
                return lambda$setStreamType$2;
            default:
                lambda$setAudioSessionId$14 = ((ExoPlayerImpl) obj2).lambda$setAudioSessionId$14(i, (Integer) obj);
                return lambda$setAudioSessionId$14;
        }
    }
}

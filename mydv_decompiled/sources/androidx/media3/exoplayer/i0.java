package androidx.media3.exoplayer;

import androidx.media3.exoplayer.StreamVolumeManager;
import defpackage.pn1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements pn1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ i0(byte b) {
        this.a = b;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        StreamVolumeManager.StreamVolumeState lambda$release$11;
        StreamVolumeManager.StreamVolumeState lambda$increaseVolume$5;
        StreamVolumeManager.StreamVolumeState lambda$decreaseVolume$7;
        StreamVolumeManager.StreamVolumeState streamVolumeState = (StreamVolumeManager.StreamVolumeState) obj;
        switch (this.a) {
            case 0:
                lambda$release$11 = StreamVolumeManager.lambda$release$11(streamVolumeState);
                return lambda$release$11;
            case 1:
                lambda$increaseVolume$5 = StreamVolumeManager.lambda$increaseVolume$5(streamVolumeState);
                return lambda$increaseVolume$5;
            default:
                lambda$decreaseVolume$7 = StreamVolumeManager.lambda$decreaseVolume$7(streamVolumeState);
                return lambda$decreaseVolume$7;
        }
    }
}

package defpackage;

import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.Comparator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tj1 implements Comparator {
    public final /* synthetic */ byte I;

    public /* synthetic */ tj1(byte b) {
        this.I = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$new$0;
        int lambda$static$0;
        switch (this.I) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 1:
                lambda$new$0 = HlsMediaPlaylist.Interstitial.lambda$new$0((HlsMediaPlaylist.ClientDefinedAttribute) obj, (HlsMediaPlaylist.ClientDefinedAttribute) obj2);
                return lambda$new$0;
            case 2:
                return j42.m(((qe2) obj).getIndex(), ((qe2) obj2).getIndex());
            case 3:
                return ((Number) dj4.b.invoke(obj, obj2)).intValue();
            default:
                lambda$static$0 = SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
                return lambda$static$0;
        }
    }
}

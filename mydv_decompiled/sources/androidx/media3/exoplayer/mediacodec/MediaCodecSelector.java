package androidx.media3.exoplayer.mediacodec;

import defpackage.zl1;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new zl1((byte) 19);
    public static final MediaCodecSelector PREFER_SOFTWARE = new zl1((byte) 20);

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2);
}

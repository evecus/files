package androidx.media3.exoplayer.hls.playlist;

import androidx.media3.exoplayer.offline.FilterableManifest;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class HlsPlaylist implements FilterableManifest<HlsPlaylist> {
    public final String baseUri;
    public final boolean hasIndependentSegments;
    public final List<String> tags;

    public HlsPlaylist(String str, List<String> list, boolean z) {
        this.baseUri = str;
        this.tags = DesugarCollections.unmodifiableList(list);
        this.hasIndependentSegments = z;
    }
}

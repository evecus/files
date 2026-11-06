package androidx.media3.exoplayer.upstream;

import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import defpackage.ey1;
import defpackage.m91;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements CmcdConfiguration.Factory {
    @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
    public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
        String uuid = UUID.randomUUID().toString();
        String str = mediaItem.mediaId;
        if (str == null) {
            str = "";
        }
        return new CmcdConfiguration(uuid, str, new CmcdConfiguration.RequestConfig() { // from class: androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory.1
            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public final ey1 getCustomData() {
                return m91.O;
            }

            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public final int getRequestedMaximumThroughputKbps(int i) {
                return C.RATE_UNSET_INT;
            }

            @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.RequestConfig
            public final boolean isKeyAllowed(String str2) {
                return true;
            }
        });
    }
}

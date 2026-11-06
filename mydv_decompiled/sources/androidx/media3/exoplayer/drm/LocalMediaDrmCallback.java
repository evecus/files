package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.MediaDrmCallback;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LocalMediaDrmCallback implements MediaDrmCallback {
    private final MediaDrmCallback.Response keyResponse;

    public LocalMediaDrmCallback(byte[] bArr) {
        bArr.getClass();
        this.keyResponse = new MediaDrmCallback.Response(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public MediaDrmCallback.Response executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) {
        return this.keyResponse;
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public MediaDrmCallback.Response executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) {
        throw new UnsupportedOperationException();
    }
}

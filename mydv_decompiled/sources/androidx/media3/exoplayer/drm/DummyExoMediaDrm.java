package androidx.media3.exoplayer.drm;

import android.media.MediaDrmException;
import android.os.PersistableBundle;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DummyExoMediaDrm implements ExoMediaDrm {
    public static DummyExoMediaDrm getInstance() {
        return new DummyExoMediaDrm();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public CryptoConfig createCryptoConfig(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public int getCryptoType() {
        return 1;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public PersistableBundle getMetrics() {
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final List getOfflineLicenseKeySetIds() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(String str) {
        return Util.EMPTY_BYTE_ARRAY;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public String getPropertyString(String str) {
        return "";
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] openSession() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void removeOfflineLicense(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public boolean requiresSecureDecoder(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void restoreKeys(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void acquire() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void release() {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void closeSession(byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnEventListener(ExoMediaDrm.OnEventListener onEventListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnExpirationUpdateListener(ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setOnKeyStatusChangeListener(ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final void setPlayerIdForSession(byte[] bArr, PlayerId playerId) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyByteArray(String str, byte[] bArr) {
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public void setPropertyString(String str, String str2) {
    }
}

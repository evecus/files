package androidx.media3.exoplayer.drm;

import android.os.Build;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class FrameworkCryptoConfig implements CryptoConfig {
    public static final boolean WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC;

    @Deprecated
    public final boolean forceAllowInsecureDecoderComponents;
    public final byte[] sessionId;
    public final UUID uuid;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z;
            }
        }
        z = false;
        WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC = z;
    }

    @Deprecated
    public FrameworkCryptoConfig(UUID uuid, byte[] bArr, boolean z) {
        this.uuid = uuid;
        this.sessionId = bArr;
        this.forceAllowInsecureDecoderComponents = z;
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }
}

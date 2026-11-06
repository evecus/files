package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.MediaDrmCallback;
import coil3.network.internal.UtilsKt;
import defpackage.c34;
import defpackage.j42;
import defpackage.nx2;
import defpackage.sp0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private final DataSource.Factory dataSourceFactory;
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(String str, boolean z, DataSource.Factory factory) {
        sp0.o((z && TextUtils.isEmpty(str)) ? false : true);
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = new HashMap();
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        str.getClass();
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public MediaDrmCallback.Response executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) {
        String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        if (TextUtils.isEmpty(licenseServerUrl)) {
            DataSpec.Builder builder = new DataSpec.Builder();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(builder.setUri(uri).build(), uri, c34.O, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C.PLAYREADY_UUID;
        hashMap.put(UtilsKt.CONTENT_TYPE, uuid2.equals(uuid) ? coil3.util.UtilsKt.MIME_TYPE_XML : C.CLEARKEY_UUID.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            hashMap.putAll(this.keyRequestProperties);
        }
        return DrmUtil.executePost(this.dataSourceFactory.createDataSource(), licenseServerUrl, keyRequest.getData(), hashMap);
    }

    @Override // androidx.media3.exoplayer.drm.MediaDrmCallback
    public MediaDrmCallback.Response executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), provisionRequest.getData(), "\"}".getBytes(charset)};
        long j = 0;
        for (int i = 0; i < 3; i++) {
            j += bArr[i].length;
        }
        int i2 = (int) j;
        sp0.q(j == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", j);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            byte[] bArr3 = bArr[i4];
            System.arraycopy(bArr3, 0, bArr2, i3, bArr3.length);
            i3 += bArr3.length;
        }
        DataSource createDataSource = this.dataSourceFactory.createDataSource();
        String defaultUrl = provisionRequest.getDefaultUrl();
        String nx2Var = nx2.i.toString();
        String valueOf = String.valueOf(i2);
        j42.k("Content-Length", valueOf);
        return DrmUtil.executePost(createDataSource, defaultUrl, bArr2, c34.e(2, new Object[]{UtilsKt.CONTENT_TYPE, nx2Var, "Content-Length", valueOf}, null));
    }

    public void setKeyRequestProperty(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public HttpMediaDrmCallback(String str, DataSource.Factory factory) {
        this(str, false, factory);
    }
}

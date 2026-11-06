package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.MediaDrmCallback;
import androidx.media3.exoplayer.source.LoadEventInfo;
import defpackage.b00;
import defpackage.s83;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;
    private static final int MAX_MANUAL_REDIRECTS = 5;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static MediaDrmCallback.Response executePost(DataSource dataSource, String str, byte[] bArr, Map<String, String> map) {
        DataSpec dataSpec;
        StatsDataSource statsDataSource = new StatsDataSource(dataSource);
        DataSpec build = new DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i = 0;
        DataSpec dataSpec2 = build;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(statsDataSource, dataSpec2);
                try {
                    dataSpec = build;
                    try {
                        MediaDrmCallback.Response build2 = new MediaDrmCallback.Response.Builder(b00.b(dataSourceInputStream)).setLoadEventInfo(new LoadEventInfo.Builder(-1L, dataSpec, SystemClock.elapsedRealtime()).setUri(statsDataSource.getLastOpenedUri()).setResponseHeaders(statsDataSource.getLastResponseHeaders()).setBytesLoaded(r12.length).build()).build();
                        Util.closeQuietly(dataSourceInputStream);
                        return build2;
                    } catch (HttpDataSource.InvalidResponseCodeException e) {
                        e = e;
                        HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = e;
                        try {
                            String redirectUrl = getRedirectUrl(invalidResponseCodeException, i);
                            if (redirectUrl == null) {
                                throw invalidResponseCodeException;
                            }
                            i++;
                            dataSpec2 = dataSpec2.buildUpon().setUri(redirectUrl).build();
                            try {
                                Util.closeQuietly(dataSourceInputStream);
                                build = dataSpec;
                            } catch (Exception e2) {
                                e = e2;
                                throw new MediaDrmCallbackException(dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            Util.closeQuietly(dataSourceInputStream);
                            throw th2;
                        }
                    }
                } catch (HttpDataSource.InvalidResponseCodeException e3) {
                    e = e3;
                    dataSpec = build;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th22 = th;
                    Util.closeQuietly(dataSourceInputStream);
                    throw th22;
                }
                build = dataSpec;
            } catch (Exception e4) {
                e = e4;
                dataSpec = build;
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(Throwable th, int i) {
        if (th instanceof MediaDrm.MediaDrmStateException) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (th instanceof MediaDrmResetException) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        if (th instanceof DeniedByServerException) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof UnsupportedDrmException) {
            return PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (th instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (th instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 3) {
            return PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        s83.d();
        return 0;
    }

    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = invalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}

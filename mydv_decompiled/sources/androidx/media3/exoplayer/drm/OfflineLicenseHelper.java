package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.OfflineLicenseHelper;
import androidx.media3.exoplayer.source.MediaSource;
import defpackage.al4;
import defpackage.h8;
import defpackage.nd3;
import defpackage.sp0;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class OfflineLicenseHelper {
    private static final Format FORMAT_WITH_EMPTY_DRM_INIT_DATA = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable drmListenerConditionVariable;
    private final DefaultDrmSessionManager drmSessionManager;
    private final DrmSessionEventListener.EventDispatcher eventDispatcher;
    private final Handler handler;
    private final HandlerThread handlerThread;

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = defaultDrmSessionManager;
        this.eventDispatcher = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper());
        this.drmListenerConditionVariable = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new DrmSessionEventListener() { // from class: androidx.media3.exoplayer.drm.OfflineLicenseHelper.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId, KeyRequestInfo keyRequestInfo) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRemoved(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmKeysRestored(int i, MediaSource.MediaPeriodId mediaPeriodId) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public void onDrmSessionManagerError(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
                OfflineLicenseHelper.this.drmListenerConditionVariable.open();
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public final void onDrmKeysLoaded(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public final void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
            public final void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
            }
        });
    }

    private DrmSession acquireFirstSessionOnHandlerThread(final int i, final byte[] bArr, final Format format) {
        format.drmInitData.getClass();
        final al4 al4Var = new al4();
        this.drmListenerConditionVariable.close();
        this.handler.post(new Runnable() { // from class: od3
            @Override // java.lang.Runnable
            public final void run() {
                OfflineLicenseHelper.this.lambda$acquireFirstSessionOnHandlerThread$2(i, bArr, al4Var, format);
            }
        });
        try {
            DrmSession drmSession = (DrmSession) al4Var.get();
            this.drmListenerConditionVariable.block();
            al4 al4Var2 = new al4();
            this.handler.post(new nd3(al4Var2, drmSession, this));
            try {
                if (al4Var2.get() == null) {
                    return drmSession;
                }
                throw ((DrmSession.DrmSessionException) al4Var2.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private byte[] acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(int i, byte[] bArr, Format format) {
        DrmSession acquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(i, bArr, format);
        al4 al4Var = new al4();
        this.handler.post(new nd3(this, al4Var, acquireFirstSessionOnHandlerThread, (byte) 2));
        try {
            try {
                byte[] bArr2 = (byte[]) al4Var.get();
                bArr2.getClass();
                return bArr2;
            } finally {
                releaseManagerOnHandlerThread();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$acquireFirstSessionOnHandlerThread$2(int i, byte[] bArr, al4 al4Var, Format format) {
        try {
            DefaultDrmSessionManager defaultDrmSessionManager = this.drmSessionManager;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            defaultDrmSessionManager.setPlayer(myLooper, PlayerId.UNSET);
            this.drmSessionManager.prepare();
            try {
                this.drmSessionManager.setMode(i, bArr);
                DrmSession acquireSession = this.drmSessionManager.acquireSession(this.eventDispatcher, format);
                acquireSession.getClass();
                al4Var.l(acquireSession);
            } finally {
            }
        } catch (Throwable th) {
            al4Var.k(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireFirstSessionOnHandlerThread$3(DrmSession drmSession, al4 al4Var) {
        try {
            DrmSession.DrmSessionException error = drmSession.getError();
            if (drmSession.getState() == 1) {
                drmSession.release(this.eventDispatcher);
                this.drmSessionManager.release();
            }
            al4Var.l(error);
        } catch (Throwable th) {
            al4Var.k(th);
            drmSession.release(this.eventDispatcher);
            this.drmSessionManager.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread$1(al4 al4Var, DrmSession drmSession) {
        try {
            al4Var.l(drmSession.getOfflineLicenseKeySetId());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getLicenseDurationRemainingSec$0(al4 al4Var, DrmSession drmSession) {
        try {
            Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(drmSession);
            licenseDurationRemainingSec.getClass();
            al4Var.l(licenseDurationRemainingSec);
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseManagerOnHandlerThread$4(al4 al4Var) {
        try {
            this.drmSessionManager.release();
            al4Var.l(null);
        } catch (Throwable th) {
            al4Var.k(th);
        }
    }

    private static OfflineLicenseHelper newWidevineInstance(String str, boolean z, Map<String, String> map, DataSource.Factory factory, Map<String, String> map2, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        HttpMediaDrmCallback httpMediaDrmCallback = new HttpMediaDrmCallback(str, z, factory);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpMediaDrmCallback.setKeyRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(map2).build(httpMediaDrmCallback), eventDispatcher);
    }

    private void releaseManagerOnHandlerThread() {
        al4 al4Var = new al4();
        this.handler.post(new h8(this, al4Var, (byte) 20));
        try {
            al4Var.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public synchronized byte[] downloadLicense(Format format) {
        sp0.o(format.drmInitData != null);
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, null, format);
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] bArr) {
        al4 al4Var;
        bArr.getClass();
        try {
            DrmSession acquireFirstSessionOnHandlerThread = acquireFirstSessionOnHandlerThread(1, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
            al4Var = new al4();
            this.handler.post(new nd3(this, al4Var, acquireFirstSessionOnHandlerThread, (byte) 0));
            try {
                try {
                } finally {
                    releaseManagerOnHandlerThread();
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        } catch (DrmSession.DrmSessionException e2) {
            if (e2.getCause() instanceof KeysExpiredException) {
                return Pair.create(0L, 0L);
            }
            throw e2;
        }
        return (Pair) al4Var.get();
    }

    public void release() {
        this.handlerThread.quit();
    }

    public synchronized void releaseLicense(byte[] bArr) {
        bArr.getClass();
        acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(3, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public synchronized byte[] renewLicense(byte[] bArr) {
        bArr.getClass();
        return acquireSessionAndGetOfflineLicenseKeySetIdOnHandlerThread(2, bArr, FORMAT_WITH_EMPTY_DRM_INIT_DATA);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, false, factory, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, factory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String str, boolean z, DataSource.Factory factory, Map<String, String> map, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(str, z, null, factory, map, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(MediaItem.DrmConfiguration drmConfiguration, DataSource.Factory factory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        sp0.o(drmConfiguration.scheme.equals(C.WIDEVINE_UUID));
        Uri uri = drmConfiguration.licenseUri;
        uri.getClass();
        return newWidevineInstance(uri.toString(), drmConfiguration.forceDefaultLicenseUri, drmConfiguration.licenseRequestHeaders, factory, null, eventDispatcher);
    }
}

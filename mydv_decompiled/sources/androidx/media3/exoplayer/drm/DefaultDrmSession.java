package androidx.media3.exoplayer.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.CopyOnWriteMultiset;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.exoplayer.drm.KeyRequestInfo;
import androidx.media3.exoplayer.drm.MediaDrmCallback;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import defpackage.j0;
import defpackage.sp0;
import defpackage.zl1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
class DefaultDrmSession implements DrmSession {
    private static final int MAX_LICENSE_DURATION_TO_RENEW_SECONDS = 60;
    private static final int MSG_KEYS = 2;
    private static final int MSG_PROVISION = 1;
    private static final String TAG = "DefaultDrmSession";
    private final MediaDrmCallback callback;
    private CryptoConfig cryptoConfig;
    private ExoMediaDrm.KeyRequest currentKeyRequest;
    private KeyRequestInfo.Builder currentKeyRequestInfo;
    private ExoMediaDrm.ProvisionRequest currentProvisionRequest;
    private final CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> eventDispatchers;
    private final boolean isPlaceholderSession;
    private final Object keyRequestInfoLock;
    private final HashMap<String, String> keyRequestParameters;
    private DrmSession.DrmSessionException lastException;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private final ExoMediaDrm mediaDrm;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private final boolean playClearSamplesWithoutKeys;
    private final Looper playbackLooper;
    private final PlayerId playerId;
    private final ProvisioningManager provisioningManager;
    private int referenceCount;
    private final ReferenceCountListener referenceCountListener;
    private RequestHandler requestHandler;
    private HandlerThread requestHandlerThread;
    private final ResponseHandler responseHandler;
    public final List<DrmInitData.SchemeData> schemeDatas;
    private byte[] sessionId;
    private int state;
    private final UUID uuid;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z);

        void provisionRequired(DefaultDrmSession defaultDrmSession);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface ReferenceCountListener {
        void onReferenceCountDecremented(DefaultDrmSession defaultDrmSession, int i);

        void onReferenceCountIncremented(DefaultDrmSession defaultDrmSession, int i);
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class RequestHandler extends Handler {
        private boolean isReleased;

        public RequestHandler(Looper looper) {
            super(looper);
        }

        private boolean maybeRetryRequest(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            RequestTask requestTask = (RequestTask) message.obj;
            if (!requestTask.allowRetry) {
                return false;
            }
            int i = requestTask.errorCount + 1;
            requestTask.errorCount = i;
            if (i > DefaultDrmSession.this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            LoadEventInfo build = new LoadEventInfo.Builder(requestTask.taskId, mediaDrmCallbackException.dataSpec, SystemClock.elapsedRealtime()).setUri(mediaDrmCallbackException.uriAfterRedirects).setResponseHeaders(mediaDrmCallbackException.responseHeaders).setLoadDurationMs(SystemClock.elapsedRealtime() - requestTask.startTimeMs).setBytesLoaded(mediaDrmCallbackException.bytesLoaded).build();
            long retryDelayMsFor = DefaultDrmSession.this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(build, new MediaLoadData(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), requestTask.errorCount));
            if (retryDelayMsFor == C.TIME_UNSET) {
                return false;
            }
            synchronized (DefaultDrmSession.this.keyRequestInfoLock) {
                try {
                    if (DefaultDrmSession.this.currentKeyRequestInfo != null) {
                        DefaultDrmSession.this.currentKeyRequestInfo.addLoadInfo(build);
                    }
                } finally {
                }
            }
            synchronized (this) {
                try {
                    if (this.isReleased) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                    return true;
                } finally {
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            RequestTask requestTask = (RequestTask) message.obj;
            try {
                int i = message.what;
                if (i == 1) {
                    obj = DefaultDrmSession.this.callback.executeProvisionRequest(DefaultDrmSession.this.uuid, (ExoMediaDrm.ProvisionRequest) requestTask.request);
                } else {
                    if (i != 2) {
                        throw new RuntimeException();
                    }
                    MediaDrmCallback.Response executeKeyRequest = DefaultDrmSession.this.callback.executeKeyRequest(DefaultDrmSession.this.uuid, (ExoMediaDrm.KeyRequest) requestTask.request);
                    synchronized (DefaultDrmSession.this.keyRequestInfoLock) {
                        try {
                            if (DefaultDrmSession.this.currentKeyRequestInfo != null && executeKeyRequest.loadEventInfo != null) {
                                DefaultDrmSession.this.currentKeyRequestInfo.addLoadInfo(executeKeyRequest.loadEventInfo.buildUpon().setLoadTaskId(requestTask.taskId).setLoadDurationMs(SystemClock.elapsedRealtime() - requestTask.startTimeMs).build());
                            }
                        } finally {
                        }
                    }
                    obj = executeKeyRequest;
                }
            } catch (MediaDrmCallbackException e) {
                boolean maybeRetryRequest = maybeRetryRequest(message, e);
                obj = e;
                if (maybeRetryRequest) {
                    return;
                }
            } catch (Exception e2) {
                Log.w(DefaultDrmSession.TAG, "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                obj = e2;
            }
            DefaultDrmSession.this.loadErrorHandlingPolicy.onLoadTaskConcluded(requestTask.taskId);
            synchronized (this) {
                try {
                    if (!this.isReleased) {
                        DefaultDrmSession.this.responseHandler.obtainMessage(message.what, Pair.create(requestTask.request, obj)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public void post(int i, Object obj, boolean z) {
            obtainMessage(i, new RequestTask(LoadEventInfo.getNewId(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.isReleased = true;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class RequestTask {
        public final boolean allowRetry;
        public int errorCount;
        public final Object request;
        public final long startTimeMs;
        public final long taskId;

        public RequestTask(long j, boolean z, long j2, Object obj) {
            this.taskId = j;
            this.allowRetry = z;
            this.startTimeMs = j2;
            this.request = obj;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public class ResponseHandler extends Handler {
        public ResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 1) {
                DefaultDrmSession.this.onProvisionResponse(obj, obj2);
            } else {
                if (i != 2) {
                    return;
                }
                DefaultDrmSession.this.onKeyResponse(obj, obj2);
            }
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm exoMediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, List<DrmInitData.SchemeData> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, MediaDrmCallback mediaDrmCallback, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy, PlayerId playerId) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.referenceCountListener = referenceCountListener;
        this.mediaDrm = exoMediaDrm;
        this.mode = i;
        this.playClearSamplesWithoutKeys = z;
        this.isPlaceholderSession = z2;
        if (bArr != null) {
            this.offlineLicenseKeySetId = bArr;
            this.schemeDatas = null;
        } else {
            list.getClass();
            this.schemeDatas = DesugarCollections.unmodifiableList(list);
        }
        this.keyRequestParameters = hashMap;
        this.callback = mediaDrmCallback;
        this.eventDispatchers = new CopyOnWriteMultiset<>();
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.playerId = playerId;
        this.state = 2;
        this.playbackLooper = looper;
        this.responseHandler = new ResponseHandler(looper);
        this.keyRequestInfoLock = new Object();
    }

    private void dispatchEvent(Consumer<DrmSessionEventListener.EventDispatcher> consumer) {
        Iterator<DrmSessionEventListener.EventDispatcher> it = this.eventDispatchers.elementSet().iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    private void doLicense(boolean z) {
        if (this.isPlaceholderSession) {
            return;
        }
        byte[] bArr = (byte[]) Util.castNonNull(this.sessionId);
        int i = this.mode;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.offlineLicenseKeySetId == null || restoreKeys()) {
                    postKeyRequest(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            this.offlineLicenseKeySetId.getClass();
            this.sessionId.getClass();
            postKeyRequest(this.offlineLicenseKeySetId, 3, z);
            return;
        }
        if (this.offlineLicenseKeySetId == null) {
            postKeyRequest(bArr, 1, z);
            return;
        }
        if (this.state == 4 || restoreKeys()) {
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.mode == 0 && licenseDurationRemainingSec <= 60) {
                Log.d(TAG, "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
                postKeyRequest(bArr, 2, z);
                return;
            }
            if (licenseDurationRemainingSec <= 0) {
                onError(new KeysExpiredException(), 2);
            } else {
                this.state = 4;
                dispatchEvent(new j0((byte) 29));
            }
        }
    }

    private long getLicenseDurationRemainingSec() {
        if (!C.WIDEVINE_UUID.equals(this.uuid)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(this);
        licenseDurationRemainingSec.getClass();
        return Math.min(((Long) licenseDurationRemainingSec.first).longValue(), ((Long) licenseDurationRemainingSec.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean isOpen() {
        int i = this.state;
        return i == 3 || i == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onError$2(Throwable th, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        eventDispatcher.drmSessionManagerError((Exception) th);
    }

    private void onError(Throwable th, int i) {
        this.lastException = new DrmSession.DrmSessionException(th, DrmUtil.getErrorCodeForMediaDrmException(th, i));
        Log.e(TAG, "DRM session error", th);
        byte b = 1;
        if (th instanceof Exception) {
            dispatchEvent(new b((Exception) th, b));
        } else if (!(th instanceof Error)) {
            zl1.i("Unexpected Throwable subclass", th);
            return;
        } else if (!DrmUtil.isFailureToConstructResourceBusyException(th) && !DrmUtil.isFailureToConstructNotProvisionedException(th)) {
            throw ((Error) th);
        }
        if (this.state != 4) {
            this.state = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(Object obj, Object obj2) {
        KeyRequestInfo build;
        if (obj == this.currentKeyRequest && isOpen()) {
            this.currentKeyRequest = null;
            synchronized (this.keyRequestInfoLock) {
                KeyRequestInfo.Builder builder = this.currentKeyRequestInfo;
                builder.getClass();
                build = builder.build();
                this.currentKeyRequestInfo = null;
            }
            byte b = 0;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                onKeysError((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((MediaDrmCallback.Response) obj2).data;
                int i = this.mode;
                ExoMediaDrm exoMediaDrm = this.mediaDrm;
                if (i == 3) {
                    exoMediaDrm.provideKeyResponse((byte[]) Util.castNonNull(this.offlineLicenseKeySetId), bArr);
                    dispatchEvent(new j0((byte) 28));
                    return;
                }
                byte[] provideKeyResponse = exoMediaDrm.provideKeyResponse(this.sessionId, bArr);
                int i2 = this.mode;
                if ((i2 == 2 || (i2 == 0 && this.offlineLicenseKeySetId != null)) && provideKeyResponse != null && provideKeyResponse.length != 0) {
                    this.offlineLicenseKeySetId = provideKeyResponse;
                }
                this.state = 4;
                dispatchEvent(new b(build, b));
            } catch (Exception e) {
                e = e;
                onKeysError(e, true);
            } catch (NoSuchMethodError e2) {
                e = e2;
                onKeysError(e, true);
            }
        }
    }

    private void onKeysError(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || DrmUtil.isFailureToConstructNotProvisionedException(th)) {
            this.provisioningManager.provisionRequired(this);
        } else {
            onError(th, z ? 1 : 2);
        }
    }

    private void onKeysRequired() {
        if (this.mode == 0 && this.state == 4) {
            Util.castNonNull(this.sessionId);
            doLicense(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(Object obj, Object obj2) {
        if (obj == this.currentProvisionRequest) {
            if (this.state == 2 || isOpen()) {
                this.currentProvisionRequest = null;
                if (obj2 instanceof Exception) {
                    this.provisioningManager.onProvisionError((Exception) obj2, false);
                    return;
                }
                try {
                    this.mediaDrm.provideProvisionResponse(((MediaDrmCallback.Response) obj2).data);
                    this.provisioningManager.onProvisionCompleted();
                } catch (Exception e) {
                    this.provisioningManager.onProvisionError(e, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean openInternal() {
        /*
            r4 = this;
            boolean r0 = r4.isOpen()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            androidx.media3.exoplayer.drm.ExoMediaDrm r0 = r4.mediaDrm     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.openSession()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.sessionId = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.ExoMediaDrm r2 = r4.mediaDrm     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.analytics.PlayerId r3 = r4.playerId     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.setPlayerIdForSession(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.ExoMediaDrm r0 = r4.mediaDrm     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.sessionId     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.decoder.CryptoConfig r0 = r0.createCryptoConfig(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.cryptoConfig = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.state = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.a r0 = new androidx.media3.exoplayer.drm.a     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.dispatchEvent(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.sessionId     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = androidx.media3.exoplayer.drm.DrmUtil.isFailureToConstructNotProvisionedException(r0)
            if (r2 == 0) goto L41
            androidx.media3.exoplayer.drm.DefaultDrmSession$ProvisioningManager r0 = r4.provisioningManager
            r0.provisionRequired(r4)
            goto L4a
        L41:
            r4.onError(r0, r1)
            goto L4a
        L45:
            androidx.media3.exoplayer.drm.DefaultDrmSession$ProvisioningManager r0 = r4.provisioningManager
            r0.provisionRequired(r4)
        L4a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.openInternal():boolean");
    }

    private void postKeyRequest(byte[] bArr, int i, boolean z) {
        try {
            synchronized (this.keyRequestInfoLock) {
                try {
                    KeyRequestInfo.Builder builder = new KeyRequestInfo.Builder();
                    this.currentKeyRequestInfo = builder;
                    List<DrmInitData.SchemeData> list = this.schemeDatas;
                    if (list != null) {
                        builder.setSchemeDatas(list);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.currentKeyRequest = this.mediaDrm.getKeyRequest(bArr, this.schemeDatas, i, this.keyRequestParameters);
            RequestHandler requestHandler = (RequestHandler) Util.castNonNull(this.requestHandler);
            ExoMediaDrm.KeyRequest keyRequest = this.currentKeyRequest;
            keyRequest.getClass();
            requestHandler.post(2, keyRequest, z);
        } catch (Exception | NoSuchMethodError e) {
            onKeysError(e, true);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean restoreKeys() {
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (Exception | NoSuchMethodError e) {
            onError(e, 1);
            return false;
        }
    }

    private void verifyPlaybackThread() {
        if (Thread.currentThread() != this.playbackLooper.getThread()) {
            Log.w(TAG, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.playbackLooper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        verifyPlaybackThread();
        if (this.referenceCount < 0) {
            Log.e(TAG, "Session reference count less than zero: " + this.referenceCount);
            this.referenceCount = 0;
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.add(eventDispatcher);
        }
        int i = this.referenceCount + 1;
        this.referenceCount = i;
        if (i == 1) {
            sp0.z(this.state == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.requestHandlerThread = handlerThread;
            handlerThread.start();
            this.requestHandler = new RequestHandler(this.requestHandlerThread.getLooper());
            if (openInternal()) {
                doLicense(true);
            }
        } else if (eventDispatcher != null && isOpen() && this.eventDispatchers.count(eventDispatcher) == 1) {
            eventDispatcher.drmSessionAcquired(this.state);
        }
        this.referenceCountListener.onReferenceCountIncremented(this, this.referenceCount);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final CryptoConfig getCryptoConfig() {
        verifyPlaybackThread();
        return this.cryptoConfig;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        verifyPlaybackThread();
        if (this.state == 1) {
            return this.lastException;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        verifyPlaybackThread();
        return this.offlineLicenseKeySetId;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID getSchemeUuid() {
        verifyPlaybackThread();
        return this.uuid;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        verifyPlaybackThread();
        return this.state;
    }

    public boolean hasSessionId(byte[] bArr) {
        verifyPlaybackThread();
        return Arrays.equals(this.sessionId, bArr);
    }

    public void onMediaDrmEvent(int i) {
        if (i != 2) {
            return;
        }
        onKeysRequired();
    }

    public void onProvisionCompleted() {
        if (openInternal()) {
            doLicense(true);
        }
    }

    public void onProvisionError(Exception exc, boolean z) {
        onError(exc, z ? 1 : 3);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        verifyPlaybackThread();
        return this.playClearSamplesWithoutKeys;
    }

    public void provision() {
        this.currentProvisionRequest = this.mediaDrm.getProvisionRequest();
        RequestHandler requestHandler = (RequestHandler) Util.castNonNull(this.requestHandler);
        ExoMediaDrm.ProvisionRequest provisionRequest = this.currentProvisionRequest;
        provisionRequest.getClass();
        requestHandler.post(1, provisionRequest, true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> queryKeyStatus() {
        verifyPlaybackThread();
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        verifyPlaybackThread();
        int i = this.referenceCount;
        if (i <= 0) {
            Log.e(TAG, "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.referenceCount = i2;
        if (i2 == 0) {
            this.state = 0;
            ((ResponseHandler) Util.castNonNull(this.responseHandler)).removeCallbacksAndMessages(null);
            ((RequestHandler) Util.castNonNull(this.requestHandler)).release();
            this.requestHandler = null;
            ((HandlerThread) Util.castNonNull(this.requestHandlerThread)).quit();
            this.requestHandlerThread = null;
            this.cryptoConfig = null;
            this.lastException = null;
            this.currentKeyRequest = null;
            synchronized (this.keyRequestInfoLock) {
                this.currentKeyRequestInfo = null;
            }
            this.currentProvisionRequest = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.mediaDrm.closeSession(bArr);
                this.sessionId = null;
            }
        }
        if (eventDispatcher != null) {
            this.eventDispatchers.remove(eventDispatcher);
            if (this.eventDispatchers.count(eventDispatcher) == 0) {
                eventDispatcher.drmSessionReleased();
            }
        }
        this.referenceCountListener.onReferenceCountDecremented(this, this.referenceCount);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean requiresSecureDecoder(String str) {
        verifyPlaybackThread();
        ExoMediaDrm exoMediaDrm = this.mediaDrm;
        byte[] bArr = this.sessionId;
        bArr.getClass();
        return exoMediaDrm.requiresSecureDecoder(bArr, str);
    }
}

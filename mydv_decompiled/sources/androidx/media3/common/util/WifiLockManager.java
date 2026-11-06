package androidx.media3.common.util;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import androidx.media3.common.util.WifiLockManager;
import defpackage.n95;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class WifiLockManager {
    private static final String TAG = "WifiLockManager";
    private static final int UNREACTIVE_WIFILOCK_HANDLER_RELEASE_DELAY_MS = 1000;
    private static final String WIFI_LOCK_TAG = "ExoPlayer:WifiLockManager";
    private boolean enabled;
    private final HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final HandlerWrapper wifiLockHandler;
    private final WifiLockManagerInternal wifiLockManagerInternal;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class WifiLockManagerInternal {
        private final Context applicationContext;
        private WifiManager.WifiLock wifiLock;

        public WifiLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceReleaseWifiLock(final AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new Runnable() { // from class: androidx.media3.common.util.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        WifiLockManager.WifiLockManagerInternal.this.lambda$forceReleaseWifiLock$0(atomicBoolean);
                    }
                }, WifiLockManager.WIFI_LOCK_TAG).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: forceReleaseWifiLockInternal, reason: merged with bridge method [inline-methods] */
        public synchronized void lambda$forceReleaseWifiLock$0(AtomicBoolean atomicBoolean) {
            WifiManager.WifiLock wifiLock;
            if (atomicBoolean.get() && (wifiLock = this.wifiLock) != null) {
                wifiLock.release();
            }
        }

        public void updateWifiLock(boolean z, boolean z2) {
            if (z && this.wifiLock == null) {
                if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    Log.w(WifiLockManager.TAG, "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                WifiManager wifiManager = (WifiManager) this.applicationContext.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    Log.w(WifiLockManager.TAG, "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, WifiLockManager.WIFI_LOCK_TAG);
                    this.wifiLock = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
            }
            if (this.wifiLock == null) {
                return;
            }
            boolean shouldAcquireWifilock = WifiLockManager.shouldAcquireWifilock(z, z2);
            WifiManager.WifiLock wifiLock = this.wifiLock;
            if (shouldAcquireWifilock) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public WifiLockManager(Context context, Looper looper, Clock clock) {
        this.wifiLockManagerInternal = new WifiLockManagerInternal(context.getApplicationContext());
        this.wifiLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$0(boolean z, boolean z2) {
        this.wifiLockManagerInternal.updateWifiLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$1(AtomicBoolean atomicBoolean) {
        this.wifiLockManagerInternal.forceReleaseWifiLock(atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWifiLock$2(AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.wifiLockManagerInternal.updateWifiLock(z, z2);
    }

    private void postUpdateWifiLock(final boolean z, final boolean z2) {
        if (shouldAcquireWifilock(z, z2)) {
            this.wifiLockHandler.post(new Runnable() { // from class: zt5
                @Override // java.lang.Runnable
                public final void run() {
                    WifiLockManager.this.lambda$postUpdateWifiLock$0(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.mainHandler.postDelayed(new n95(this, atomicBoolean, (byte) 7), 1000L);
        this.wifiLockHandler.post(new Runnable() { // from class: au5
            @Override // java.lang.Runnable
            public final void run() {
                WifiLockManager.this.lambda$postUpdateWifiLock$2(atomicBoolean, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWifilock(boolean z, boolean z2) {
        return z && z2;
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        postUpdateWifiLock(z, this.stayAwake);
    }

    public void setStayAwake(boolean z) {
        if (this.stayAwake == z) {
            return;
        }
        this.stayAwake = z;
        if (this.enabled) {
            postUpdateWifiLock(true, z);
        }
    }
}

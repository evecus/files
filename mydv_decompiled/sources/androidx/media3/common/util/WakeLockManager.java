package androidx.media3.common.util;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import androidx.media3.common.util.WakeLockManager;
import defpackage.lr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class WakeLockManager {
    private static final String TAG = "WakeLockManager";
    private static final int UNREACTIVE_WAKELOCK_HANDLER_RELEASE_DELAY_MS = 1000;
    private static final String WAKE_LOCK_TAG = "ExoPlayer:WakeLockManager";
    private boolean enabled;
    private final HandlerWrapper mainHandler;
    private boolean stayAwake;
    private final HandlerWrapper wakeLockHandler;
    private final WakeLockManagerInternal wakeLockManagerInternal;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class WakeLockManagerInternal {
        private final Context applicationContext;
        private PowerManager.WakeLock wakeLock;

        public WakeLockManagerInternal(Context context) {
            this.applicationContext = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void forceReleaseWakeLock(AtomicBoolean atomicBoolean) {
            if (atomicBoolean.get()) {
                new Thread(new b(this, atomicBoolean, (byte) 1), WakeLockManager.WAKE_LOCK_TAG).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: forceReleaseWakeLockInternal, reason: merged with bridge method [inline-methods] */
        public synchronized void lambda$forceReleaseWakeLock$0(AtomicBoolean atomicBoolean) {
            PowerManager.WakeLock wakeLock;
            if (atomicBoolean.get() && (wakeLock = this.wakeLock) != null) {
                wakeLock.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void updateWakeLock(boolean z, boolean z2) {
            if (z) {
                if (this.wakeLock == null) {
                    if (this.applicationContext.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        Log.w(WakeLockManager.TAG, "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) this.applicationContext.getSystemService("power");
                    if (powerManager == null) {
                        Log.w(WakeLockManager.TAG, "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, WakeLockManager.WAKE_LOCK_TAG);
                        this.wakeLock = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            if (this.wakeLock == null) {
                return;
            }
            boolean shouldAcquireWakelock = WakeLockManager.shouldAcquireWakelock(z, z2);
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (shouldAcquireWakelock) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public WakeLockManager(Context context, Looper looper, Clock clock) {
        this.wakeLockManagerInternal = new WakeLockManagerInternal(context.getApplicationContext());
        this.wakeLockHandler = clock.createHandler(looper, null);
        this.mainHandler = clock.createHandler(Looper.getMainLooper(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$0(boolean z, boolean z2) {
        this.wakeLockManagerInternal.updateWakeLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$1(AtomicBoolean atomicBoolean) {
        this.wakeLockManagerInternal.forceReleaseWakeLock(atomicBoolean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postUpdateWakeLock$2(AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        atomicBoolean.set(false);
        this.wakeLockManagerInternal.updateWakeLock(z, z2);
    }

    private void postUpdateWakeLock(final boolean z, final boolean z2) {
        if (shouldAcquireWakelock(z, z2)) {
            this.wakeLockHandler.post(new Runnable() { // from class: qs5
                @Override // java.lang.Runnable
                public final void run() {
                    WakeLockManager.this.lambda$postUpdateWakeLock$0(z, z2);
                }
            });
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.mainHandler.postDelayed(new lr(this, atomicBoolean, (byte) 14), 1000L);
        this.wakeLockHandler.post(new Runnable() { // from class: rs5
            @Override // java.lang.Runnable
            public final void run() {
                WakeLockManager.this.lambda$postUpdateWakeLock$2(atomicBoolean, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldAcquireWakelock(boolean z, boolean z2) {
        return z && z2;
    }

    public void setEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        postUpdateWakeLock(z, this.stayAwake);
    }

    public void setStayAwake(boolean z) {
        if (this.stayAwake == z) {
            return;
        }
        this.stayAwake = z;
        if (this.enabled) {
            postUpdateWakeLock(true, z);
        }
    }
}

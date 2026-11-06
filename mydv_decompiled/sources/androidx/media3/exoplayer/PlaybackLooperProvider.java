package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PlaybackLooperProvider {
    private HandlerThread internalPlaybackThread;
    private final Object lock;
    private Looper playbackLooper;
    private int referenceCount;

    public PlaybackLooperProvider(Looper looper) {
        this.lock = new Object();
        this.playbackLooper = looper;
        this.internalPlaybackThread = null;
        this.referenceCount = 0;
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.lock) {
            try {
                looper = this.playbackLooper;
                if (looper == null) {
                    sp0.z(this.referenceCount == 0 && this.internalPlaybackThread == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.internalPlaybackThread = handlerThread;
                    handlerThread.start();
                    looper = this.internalPlaybackThread.getLooper();
                    this.playbackLooper = looper;
                }
                this.referenceCount++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.lock) {
            try {
                sp0.z(this.referenceCount > 0);
                int i = this.referenceCount - 1;
                this.referenceCount = i;
                if (i == 0 && (handlerThread = this.internalPlaybackThread) != null) {
                    handlerThread.quit();
                    this.internalPlaybackThread = null;
                    this.playbackLooper = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PlaybackLooperProvider() {
        this(null);
    }
}

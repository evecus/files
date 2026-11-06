package androidx.media3.common.util;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized boolean block(long j) {
        if (j <= 0) {
            return this.isOpen;
        }
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            block();
        } else {
            while (!this.isOpen && elapsedRealtime < j2) {
                this.clock.onThreadBlocked();
                wait(j2 - elapsedRealtime);
                elapsedRealtime = this.clock.elapsedRealtime();
            }
        }
        return this.isOpen;
    }

    public synchronized boolean blockUninterruptible(long j) {
        if (j <= 0) {
            return this.isOpen;
        }
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j2 = j + elapsedRealtime;
        if (j2 < elapsedRealtime) {
            blockUninterruptible();
        } else {
            boolean z = false;
            while (!this.isOpen && elapsedRealtime < j2) {
                try {
                    this.clock.onThreadBlocked();
                    wait(j2 - elapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                elapsedRealtime = this.clock.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.isOpen;
    }

    public synchronized boolean close() {
        boolean z;
        z = this.isOpen;
        this.isOpen = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized void block() {
        while (!this.isOpen) {
            this.clock.onThreadBlocked();
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.isOpen) {
            try {
                this.clock.onThreadBlocked();
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}

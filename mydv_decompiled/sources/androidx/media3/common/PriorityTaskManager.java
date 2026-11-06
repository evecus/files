package androidx.media3.common;

import androidx.media3.common.util.Util;
import defpackage.hf1;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super(hf1.v("Priority too low [priority=", i, ", highest=", i2, "]"));
        }
    }

    public void add(int i) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i));
            this.highestPriority = Math.max(this.highestPriority, i);
        }
    }

    public void proceed(int i) {
        synchronized (this.lock) {
            while (this.highestPriority != i) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.lock) {
            z = this.highestPriority == i;
        }
        return z;
    }

    public void proceedOrThrow(int i) {
        synchronized (this.lock) {
            try {
                int i2 = this.highestPriority;
                if (i2 != i) {
                    throw new PriorityTooLowException(i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void remove(int i) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}

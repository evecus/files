package androidx.media3.common.video;

import android.hardware.HardwareBuffer;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import defpackage.sp0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HardwareBufferPool {
    private int allocatedBufferCount;
    private final int capacity;
    private boolean isReleased;
    private final Object lock = new Object();
    private final Queue<HardwareBufferWithFence> pool;
    private Runnable wakeupListener;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class HardwareBufferWithFence {
        public final SyncFenceWrapper acquireFence;
        public final HardwareBuffer hardwareBuffer;

        public HardwareBufferWithFence(HardwareBuffer hardwareBuffer, SyncFenceWrapper syncFenceWrapper) {
            this.hardwareBuffer = hardwareBuffer;
            this.acquireFence = syncFenceWrapper;
        }
    }

    public HardwareBufferPool(int i) {
        this.capacity = i;
        this.pool = new ArrayDeque(i);
    }

    private static long adjustUsageFlags(long j) {
        return j | 256;
    }

    private void closeFence(SyncFenceWrapper syncFenceWrapper) {
        if (syncFenceWrapper != null) {
            syncFenceWrapper.close();
        }
    }

    private static HardwareBufferWithFence createNewBufferWithFence(Format format, long j) {
        HardwareBuffer create = HardwareBuffer.create(format.width, format.height, getPixelFormat(format), 1, adjustUsageFlags(j));
        sp0.z(!create.isClosed());
        return new HardwareBufferWithFence(create, null);
    }

    private static int getPixelFormat(Format format) {
        int i = format.pixelFormat;
        return i != -1 ? i : ColorInfo.isTransferHdr(format.colorInfo) ? 43 : 1;
    }

    private static boolean isCompatible(HardwareBuffer hardwareBuffer, Format format, long j) {
        return hardwareBuffer.getWidth() == format.width && hardwareBuffer.getHeight() == format.height && hardwareBuffer.getFormat() == getPixelFormat(format) && hardwareBuffer.getUsage() == adjustUsageFlags(j);
    }

    private boolean poolContainsBuffer(HardwareBuffer hardwareBuffer) {
        Iterator<HardwareBufferWithFence> it = this.pool.iterator();
        while (it.hasNext()) {
            if (it.next().hardwareBuffer == hardwareBuffer) {
                return true;
            }
        }
        return false;
    }

    public HardwareBufferWithFence get(Format format, long j, Runnable runnable) {
        synchronized (this.lock) {
            try {
                if (this.isReleased) {
                    return null;
                }
                while (true) {
                    HardwareBufferWithFence poll = this.pool.poll();
                    if (poll == null) {
                        int i = this.allocatedBufferCount;
                        if (i >= this.capacity) {
                            this.wakeupListener = runnable;
                            return null;
                        }
                        this.allocatedBufferCount = i + 1;
                        return createNewBufferWithFence(format, j);
                    }
                    HardwareBuffer hardwareBuffer = poll.hardwareBuffer;
                    if (isCompatible(hardwareBuffer, format, j)) {
                        return poll;
                    }
                    hardwareBuffer.close();
                    closeFence(poll.acquireFence);
                    this.allocatedBufferCount--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void recycle(HardwareBuffer hardwareBuffer, SyncFenceWrapper syncFenceWrapper) {
        sp0.o(!hardwareBuffer.isClosed());
        closeFence(syncFenceWrapper);
        synchronized (this.lock) {
            try {
                if (this.isReleased) {
                    hardwareBuffer.close();
                    closeFence(syncFenceWrapper);
                    return;
                }
                Runnable runnable = null;
                if (!poolContainsBuffer(hardwareBuffer)) {
                    this.pool.add(new HardwareBufferWithFence(hardwareBuffer, null));
                    Runnable runnable2 = this.wakeupListener;
                    if (runnable2 != null) {
                        this.wakeupListener = null;
                        runnable = runnable2;
                    }
                }
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        synchronized (this.lock) {
            try {
                if (this.isReleased) {
                    return;
                }
                this.isReleased = true;
                while (true) {
                    HardwareBufferWithFence poll = this.pool.poll();
                    if (poll == null) {
                        return;
                    }
                    poll.hardwareBuffer.close();
                    closeFence(poll.acquireFence);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

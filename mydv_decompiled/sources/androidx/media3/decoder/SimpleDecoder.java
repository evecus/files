package androidx.media3.decoder;

import androidx.media3.common.C;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import defpackage.sp0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private Executor executor;
    private boolean flushed;
    private Runnable onInputBufferAvailableRunnable;
    private Runnable onOutputBufferAvailableRunnable;
    private boolean released;
    private int skippedOutputBufferCount;
    private final Object lock = new Object();
    private long outputStartTimeUs = C.TIME_UNSET;
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i = 0; i < this.availableInputBufferCount; i++) {
            this.availableInputBuffers[i] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i2 = 0; i2 < this.availableOutputBufferCount; i2++) {
            this.availableOutputBuffers[i2] = createOutputBuffer();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: androidx.media3.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private boolean decode() {
        E createUnexpectedDecodeException;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            I removeFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i;
            O o = oArr[i];
            boolean z = this.flushed;
            this.flushed = false;
            if (removeFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                o.timeUs = removeFirst.timeUs;
                if (removeFirst.isFirstSample()) {
                    o.addFlag(C.BUFFER_FLAG_FIRST_SAMPLE);
                }
                if (!isAtLeastOutputStartTimeUs(removeFirst.timeUs)) {
                    o.shouldBeSkipped = true;
                }
                try {
                    createUnexpectedDecodeException = decode(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e);
                } catch (RuntimeException e2) {
                    createUnexpectedDecodeException = createUnexpectedDecodeException(e2);
                }
                if (createUnexpectedDecodeException != null) {
                    synchronized (this.lock) {
                        this.exception = createUnexpectedDecodeException;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        o.release();
                    } else {
                        boolean z2 = o.shouldBeSkipped;
                        int i2 = this.skippedOutputBufferCount;
                        if (z2) {
                            this.skippedOutputBufferCount = i2 + 1;
                            o.release();
                        } else {
                            o.skippedOutputBufferCount = i2;
                            this.skippedOutputBufferCount = 0;
                            this.queuedOutputBuffers.addLast(o);
                            Runnable runnable = this.onOutputBufferAvailableRunnable;
                            Executor executor = this.executor;
                            if (runnable != null && executor != null) {
                                executor.execute(runnable);
                            }
                        }
                    }
                    releaseInputBufferInternal(removeFirst, true);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    private void maybeThrowException() {
        E e = this.exception;
        if (e != null) {
            throw e;
        }
    }

    private void releaseInputBufferInternal(I i, boolean z) {
        i.clear();
        I[] iArr = this.availableInputBuffers;
        int i2 = this.availableInputBufferCount;
        this.availableInputBufferCount = i2 + 1;
        iArr[i2] = i;
        Runnable runnable = this.onInputBufferAvailableRunnable;
        Executor executor = this.executor;
        if (!z || runnable == null || executor == null) {
            return;
        }
        executor.execute(runnable);
    }

    private void releaseOutputBufferInternal(O o) {
        o.clear();
        O[] oArr = this.availableOutputBuffers;
        int i = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (decode());
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable th);

    public abstract E decode(I i, O o, boolean z);

    @Override // androidx.media3.decoder.Decoder
    public final I dequeueInputBuffer() {
        I i;
        synchronized (this.lock) {
            maybeThrowException();
            sp0.z(this.dequeuedInputBuffer == null);
            int i2 = this.availableInputBufferCount;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i3 = i2 - 1;
                this.availableInputBufferCount = i3;
                i = iArr[i3];
            }
            this.dequeuedInputBuffer = i;
        }
        return i;
    }

    @Override // androidx.media3.decoder.Decoder
    public final O dequeueOutputBuffer() {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i = this.dequeuedInputBuffer;
                if (i != null) {
                    releaseInputBufferInternal(i, false);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst(), false);
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isAtLeastOutputStartTimeUs(long j) {
        boolean z;
        synchronized (this.lock) {
            long j2 = this.outputStartTimeUs;
            z = j2 == C.TIME_UNSET || j >= j2;
        }
        return z;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(I i) {
        synchronized (this.lock) {
            maybeThrowException();
            sp0.o(i == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(O o) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o);
            maybeNotifyDecodeLoop();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setCallback(final Decoder.Callback callback, Executor executor) {
        Runnable runnable;
        synchronized (this.lock) {
            try {
                this.executor = executor;
                Runnable runnable2 = null;
                if (callback != null) {
                    final byte b = 0;
                    runnable = new Runnable() { // from class: gp4
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            Decoder.Callback callback2 = callback;
                            switch (b2) {
                                case 0:
                                    callback2.onOutputBufferAvailable();
                                    break;
                                default:
                                    callback2.onInputBufferAvailable();
                                    break;
                            }
                        }
                    };
                } else {
                    runnable = null;
                }
                this.onOutputBufferAvailableRunnable = runnable;
                if (callback != null) {
                    final byte b2 = 1;
                    runnable2 = new Runnable() { // from class: gp4
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b22 = b2;
                            Decoder.Callback callback2 = callback;
                            switch (b22) {
                                case 0:
                                    callback2.onOutputBufferAvailable();
                                    break;
                                default:
                                    callback2.onInputBufferAvailable();
                                    break;
                            }
                        }
                    };
                }
                this.onInputBufferAvailableRunnable = runnable2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setInitialInputBufferSize(int i) {
        sp0.z(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i2 : this.availableInputBuffers) {
            i2.ensureSpaceForWrite(i);
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j) {
        boolean z;
        synchronized (this.lock) {
            try {
                if (this.availableInputBufferCount != this.availableInputBuffers.length && !this.flushed) {
                    z = false;
                    sp0.z(z);
                    this.outputStartTimeUs = j;
                }
                z = true;
                sp0.z(z);
                this.outputStartTimeUs = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

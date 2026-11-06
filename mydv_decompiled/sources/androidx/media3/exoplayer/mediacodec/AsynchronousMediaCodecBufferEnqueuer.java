package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import defpackage.b3;
import defpackage.pt1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    private static final int MSG_OPEN_CV = 3;
    private static final int MSG_QUEUE_INPUT_BUFFER = 1;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 2;
    private static final int MSG_SET_PARAMETERS = 4;
    private final boolean asyncCryptoSynchronizationEnabled;
    private final MediaCodec codec;
    private final ConditionVariable conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;
    private static final ArrayDeque<MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = new ArrayDeque<>();
    private static final Object QUEUE_SECURE_LOCK = new Object();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void setQueueParams(int i, int i2, int i3, long j, int i4) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeUs = j;
            this.flags = i4;
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable, boolean z) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.asyncCryptoSynchronizationEnabled = z;
        this.pendingRuntimeException = new AtomicReference<>();
    }

    private void blockUntilHandlerThreadIsIdle() {
        this.conditionVariable.close();
        Handler handler = this.handler;
        handler.getClass();
        handler.obtainMessage(3).sendToTarget();
        this.conditionVariable.block();
    }

    private static void copy(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = copy(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = copy(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        byte[] copy = copy(cryptoInfo.key, cryptoInfo2.key);
        copy.getClass();
        cryptoInfo2.key = copy;
        byte[] copy2 = copy(cryptoInfo.iv, cryptoInfo2.iv);
        copy2.getClass();
        cryptoInfo2.iv = copy2;
        cryptoInfo2.mode = cryptoInfo.mode;
        if (Build.VERSION.SDK_INT >= 24) {
            b3.d();
            cryptoInfo2.setPattern(b3.a(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doHandleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r3 = 1
            if (r2 == r3) goto L4b
            r3 = 2
            if (r2 == r3) goto L36
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L30
            r3 = 4
            if (r2 == r3) goto L28
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r3 = r8.pendingRuntimeException
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.<init>(r0)
        L1a:
            boolean r0 = r3.compareAndSet(r4, r5)
            if (r0 == 0) goto L21
            goto L5f
        L21:
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L1a
            goto L5f
        L28:
            java.lang.Object r1 = r9.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            r8.doSetParameters(r1)
            goto L5f
        L30:
            androidx.media3.common.util.ConditionVariable r0 = r8.conditionVariable
            r0.open()
            goto L5f
        L36:
            java.lang.Object r1 = r9.obj
            r7 = r1
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r7 = (androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r7
            int r1 = r7.index
            int r2 = r7.offset
            android.media.MediaCodec$CryptoInfo r3 = r7.cryptoInfo
            long r4 = r7.presentationTimeUs
            int r6 = r7.flags
            r0 = r8
            r0.doQueueSecureInputBuffer(r1, r2, r3, r4, r6)
        L49:
            r4 = r7
            goto L5f
        L4b:
            java.lang.Object r0 = r9.obj
            r7 = r0
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r7 = (androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r7
            int r1 = r7.index
            int r2 = r7.offset
            int r3 = r7.size
            long r4 = r7.presentationTimeUs
            int r6 = r7.flags
            r0 = r8
            r0.doQueueInputBuffer(r1, r2, r3, r4, r6)
            goto L49
        L5f:
            if (r4 == 0) goto L64
            recycleMessageParams(r4)
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.doHandleMessage(android.os.Message):void");
    }

    private void doQueueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.codec.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }

    private void doQueueSecureInputBuffer(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            if (Build.VERSION.SDK_INT >= 31 && !this.asyncCryptoSynchronizationEnabled) {
                this.codec.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
                return;
            }
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            pt1.w(this.pendingRuntimeException, e);
        }
    }

    private void doSetParameters(Bundle bundle) {
        try {
            this.codec.setParameters(bundle);
        } catch (RuntimeException e) {
            pt1.w(this.pendingRuntimeException, e);
        }
    }

    private void flushHandlerThread() {
        Handler handler = this.handler;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static MessageParams getMessageParams() {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void recycleMessageParams(MessageParams messageParams) {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void maybeThrowException() {
        RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, i3, j, i4);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, 0, j, i3);
        copy(cryptoInfo, messageParams.cryptoInfo);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(4, bundle).sendToTarget();
    }

    public void setPendingRuntimeException(RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper()) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AsynchronousMediaCodecBufferEnqueuer.this.doHandleMessage(message);
            }
        };
        this.started = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void waitUntilQueueingComplete() {
        blockUntilHandlerThreadIsIdle();
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, new ConditionVariable(), z);
    }

    private static int[] copy(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    private static byte[] copy(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}

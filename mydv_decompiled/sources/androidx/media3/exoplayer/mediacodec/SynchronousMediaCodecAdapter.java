package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.common.util.ThrowingRunnable;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;
    private final LoudnessCodecController loudnessCodecController;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class Factory implements MediaCodecAdapter.Factory {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration r6) {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r5 = r5.createCodec(r6)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r1 = "configureCodec"
                androidx.media3.common.util.TraceUtil.beginSection(r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r1 = r6.surface     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r1 != 0) goto L22
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r2 = r6.codecInfo     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r2 = r2.detachedSurfaceSupported     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 == 0) goto L22
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r3 = 35
                if (r2 < r3) goto L22
                r2 = 8
                goto L23
            L1d:
                r6 = move-exception
            L1e:
                r0 = r5
                goto L43
            L20:
                r6 = move-exception
                goto L1e
            L22:
                r2 = 0
            L23:
                android.media.MediaFormat r3 = r6.mediaFormat     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r4 = r6.crypto     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r5.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.common.util.TraceUtil.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r1 = "startCodec"
                androidx.media3.common.util.TraceUtil.beginSection(r1)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r5.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.common.util.TraceUtil.endSection()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter r1 = new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                androidx.media3.exoplayer.mediacodec.LoudnessCodecController r6 = r6.loudnessCodecController     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.<init>(r5, r6)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r1
            L40:
                r6 = move-exception
                goto L43
            L42:
                r6 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.Factory.createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Configuration):androidx.media3.exoplayer.mediacodec.MediaCodecAdapter");
        }

        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) {
            configuration.codecInfo.getClass();
            String str = configuration.codecInfo.name;
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            return createByCodecName;
        }
    }

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec, LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Build.VERSION.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.codec.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.codec.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                this.codec.stop();
            }
            if (i >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                loudnessCodecController2.removeMediaCodec(this.codec);
            }
            this.codec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: w05
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                SynchronousMediaCodecAdapter.this.lambda$setOnFrameRenderedListener$0(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void subscribeToVendorParameters(List<String> list) {
        this.codec.subscribeToVendorParameters(list);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void unsubscribeFromVendorParameters(List<String> list) {
        this.codec.unsubscribeFromVendorParameters(list);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void useBuffer(ThrowingRunnable throwingRunnable) {
        throwingRunnable.run();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }
}

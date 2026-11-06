package androidx.media3.exoplayer.mediacodec;

import androidx.media3.decoder.DecoderInputBuffer;
import defpackage.sp0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;
    static final int MAX_SIZE_BYTES = 3072000;
    private long lastSampleTimeUs;
    private int maxSampleCount;
    private int sampleCount;

    public BatchBuffer() {
        super(2);
        this.maxSampleCount = 32;
    }

    private boolean canAppendSampleBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.sampleCount >= this.maxSampleCount) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.data;
        if (byteBuffer2 != null && (byteBuffer = this.data) != null) {
            if (byteBuffer2.remaining() + byteBuffer.position() > MAX_SIZE_BYTES) {
                return false;
            }
        }
        return true;
    }

    public boolean append(DecoderInputBuffer decoderInputBuffer) {
        sp0.o(!decoderInputBuffer.isEncrypted());
        sp0.o(!decoderInputBuffer.hasSupplementalData());
        sp0.o(!decoderInputBuffer.isEndOfStream());
        if (!canAppendSampleBuffer(decoderInputBuffer)) {
            return false;
        }
        int i = this.sampleCount;
        this.sampleCount = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.lastSampleTimeUs = decoderInputBuffer.timeUs;
        return true;
    }

    @Override // androidx.media3.decoder.DecoderInputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.sampleCount = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.timeUs;
    }

    public long getLastSampleTimeUs() {
        return this.lastSampleTimeUs;
    }

    public int getSampleCount() {
        return this.sampleCount;
    }

    public boolean hasSamples() {
        return this.sampleCount > 0;
    }

    public void setMaxSampleCount(int i) {
        sp0.o(i > 0);
        this.maxSampleCount = i;
    }
}

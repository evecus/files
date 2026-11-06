package androidx.media3.exoplayer.source;

import android.util.LongSparseArray;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class MergingMetadataSampleStream implements SampleStream {
    private static final int DEFAULT_MAX_NUM_REORDER_SAMPLES = 16;
    private byte[] activeMetadata;
    private final int maxCacheSize;
    private final SampleStream metadataSampleStream;
    private boolean metadataStreamEnded;
    private boolean metadataTrackInvalid;
    private final SampleStream videoSampleStream;
    private final FormatHolder metadataFormatHolder = new FormatHolder();
    private final DecoderInputBuffer metadataBuffer = new DecoderInputBuffer(1);
    private final LongSparseArray<byte[]> metadataCache = new LongSparseArray<>();
    private long lastMetadataPtsUs = C.TIME_UNSET;

    public MergingMetadataSampleStream(SampleStream sampleStream, SampleStream sampleStream2, Format format) {
        this.videoSampleStream = sampleStream;
        this.metadataSampleStream = sampleStream2;
        this.maxCacheSize = getMaxCacheSize(format);
    }

    private static void attachSupplementalData(DecoderInputBuffer decoderInputBuffer, byte[] bArr) {
        decoderInputBuffer.resetSupplementalData(bArr.length);
        decoderInputBuffer.supplementalData.put(bArr);
        decoderInputBuffer.addFlag(268435456);
    }

    private void evictCacheIfNeeded() {
        while (this.metadataCache.size() > this.maxCacheSize) {
            this.metadataCache.removeAt(0);
        }
    }

    private byte[] findActiveMetadata(long j) {
        byte[] bArr;
        int size = this.metadataCache.size() - 1;
        while (true) {
            if (size < 0) {
                bArr = null;
                break;
            }
            if (this.metadataCache.keyAt(size) <= j) {
                bArr = this.metadataCache.valueAt(size);
                break;
            }
            size--;
        }
        if (bArr != null) {
            this.activeMetadata = bArr;
        }
        return this.activeMetadata;
    }

    private static int getMaxCacheSize(Format format) {
        int i = format.maxNumReorderSamples;
        if (i != -1) {
            return i + 2;
        }
        return 18;
    }

    private void populateMetadataCache(long j) {
        int i;
        if (this.metadataStreamEnded) {
            return;
        }
        while (true) {
            this.metadataBuffer.clear();
            int i2 = 0;
            int readData = this.metadataSampleStream.readData(this.metadataFormatHolder, this.metadataBuffer, 0);
            if (readData == -3) {
                return;
            }
            if (readData != -5) {
                if (this.metadataBuffer.isEndOfStream()) {
                    this.metadataStreamEnded = true;
                    return;
                }
                long j2 = this.metadataBuffer.timeUs;
                long j3 = this.lastMetadataPtsUs;
                if (j3 != C.TIME_UNSET && j2 < j3) {
                    this.metadataTrackInvalid = true;
                    this.metadataCache.clear();
                    this.activeMetadata = null;
                }
                this.lastMetadataPtsUs = j2;
                DecoderInputBuffer decoderInputBuffer = this.metadataBuffer;
                ByteBuffer byteBuffer = decoderInputBuffer.data;
                if (!this.metadataTrackInvalid && byteBuffer != null) {
                    decoderInputBuffer.flip();
                    Format format = this.metadataFormatHolder.format;
                    if (format != null) {
                        i = 0;
                        for (int i3 = 0; i3 < format.initializationData.size(); i3++) {
                            i += format.initializationData.get(i3).length;
                        }
                    } else {
                        i = 0;
                    }
                    byte[] bArr = new byte[byteBuffer.remaining() + i];
                    if (format != null) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < format.initializationData.size(); i5++) {
                            byte[] bArr2 = format.initializationData.get(i5);
                            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                            i4 += bArr2.length;
                        }
                        i2 = i4;
                    }
                    byteBuffer.get(bArr, i2, byteBuffer.remaining());
                    this.metadataCache.put(j2, bArr);
                    evictCacheIfNeeded();
                }
                if (j2 > j) {
                    return;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int getFlags() {
        return this.videoSampleStream.getFlags();
    }

    public SampleStream getMetadataStream() {
        return this.metadataSampleStream;
    }

    public SampleStream getPrimaryStream() {
        return this.videoSampleStream;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return this.videoSampleStream.isReady();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() {
        this.videoSampleStream.maybeThrowError();
        if (this.metadataTrackInvalid) {
            return;
        }
        this.metadataSampleStream.maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        int readData = this.videoSampleStream.readData(formatHolder, decoderInputBuffer, i);
        if (readData == -4 && !decoderInputBuffer.isEndOfStream() && (i & 4) == 0 && (i & 1) == 0 && !this.metadataTrackInvalid) {
            populateMetadataCache(decoderInputBuffer.timeUs);
            byte[] findActiveMetadata = findActiveMetadata(decoderInputBuffer.timeUs);
            if (findActiveMetadata != null) {
                attachSupplementalData(decoderInputBuffer, findActiveMetadata);
            }
        }
        return readData;
    }

    public void reset() {
        this.metadataCache.clear();
        this.activeMetadata = null;
        this.lastMetadataPtsUs = C.TIME_UNSET;
        this.metadataTrackInvalid = false;
        this.metadataStreamEnded = false;
        this.metadataBuffer.clear();
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        return this.videoSampleStream.skipData(j);
    }
}

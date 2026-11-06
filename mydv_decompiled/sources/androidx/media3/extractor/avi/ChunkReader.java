package androidx.media3.extractor.avi;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import defpackage.sp0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final boolean allSamplesAreSyncSamples;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private int chunkCount;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private long firstIndexChunkOffset;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final AviStreamHeaderChunk streamHeaderChunk;
    private final TrackOutput trackOutput;

    public ChunkReader(int i, AviStreamHeaderChunk aviStreamHeaderChunk, TrackOutput trackOutput, boolean z) {
        this.streamHeaderChunk = aviStreamHeaderChunk;
        this.allSamplesAreSyncSamples = z;
        int trackType = aviStreamHeaderChunk.getTrackType();
        boolean z2 = true;
        if (trackType != 1 && trackType != 2) {
            z2 = false;
        }
        sp0.o(z2);
        this.chunkId = getChunkIdFourCc(i, trackType == 2 ? CHUNK_TYPE_VIDEO_COMPRESSED : CHUNK_TYPE_AUDIO);
        this.durationUs = aviStreamHeaderChunk.getDurationUs();
        this.trackOutput = trackOutput;
        this.alternativeChunkId = trackType == 2 ? getChunkIdFourCc(i, CHUNK_TYPE_VIDEO_UNCOMPRESSED) : -1;
        this.firstIndexChunkOffset = -1L;
        this.keyFrameOffsets = new long[512];
        this.keyFrameIndices = new int[512];
        this.chunkCount = aviStreamHeaderChunk.length;
    }

    private static int getChunkIdFourCc(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private long getChunkTimestampUs(int i) {
        return (this.durationUs * i) / this.chunkCount;
    }

    private SeekPoint getSeekPoint(int i) {
        return new SeekPoint(this.keyFrameIndices[i] * getFrameDurationUs(), this.keyFrameOffsets[i]);
    }

    public void advanceCurrentChunk() {
        this.currentChunkIndex++;
    }

    public void appendIndexChunk(long j, boolean z) {
        if (this.firstIndexChunkOffset == -1) {
            this.firstIndexChunkOffset = j;
        }
        if (z || this.allSamplesAreSyncSamples) {
            int i = this.indexSize;
            int[] iArr = this.keyFrameIndices;
            if (i == iArr.length) {
                long[] jArr = this.keyFrameOffsets;
                this.keyFrameOffsets = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr2 = this.keyFrameIndices;
                iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                this.keyFrameIndices = iArr;
            }
            long[] jArr2 = this.keyFrameOffsets;
            int i2 = this.indexSize;
            jArr2[i2] = j;
            iArr[i2] = this.indexChunkCount;
            this.indexSize = i2 + 1;
        }
        this.indexChunkCount++;
    }

    public void commitIndex() {
        int i;
        this.keyFrameOffsets = Arrays.copyOf(this.keyFrameOffsets, this.indexSize);
        this.keyFrameIndices = Arrays.copyOf(this.keyFrameIndices, this.indexSize);
        if (!this.allSamplesAreSyncSamples || this.streamHeaderChunk.sampleSize == 0 || (i = this.indexSize) <= 0) {
            return;
        }
        this.chunkCount = i;
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.currentChunkIndex);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public SeekMap.SeekPoints getSeekPoints(long j) {
        if (this.indexSize == 0) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstIndexChunkOffset));
        }
        int frameDurationUs = (int) (j / getFrameDurationUs());
        int binarySearchFloor = Util.binarySearchFloor(this.keyFrameIndices, frameDurationUs, true, true);
        if (this.keyFrameIndices[binarySearchFloor] == frameDurationUs) {
            return new SeekMap.SeekPoints(getSeekPoint(binarySearchFloor));
        }
        SeekPoint seekPoint = getSeekPoint(binarySearchFloor);
        int i = binarySearchFloor + 1;
        return i < this.keyFrameOffsets.length ? new SeekMap.SeekPoints(seekPoint, getSeekPoint(i)) : new SeekMap.SeekPoints(seekPoint);
    }

    public boolean handlesChunkId(int i) {
        return this.chunkId == i || this.alternativeChunkId == i;
    }

    public boolean isAudio() {
        return (this.chunkId & CHUNK_TYPE_AUDIO) == CHUNK_TYPE_AUDIO;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return this.allSamplesAreSyncSamples || Arrays.binarySearch(this.keyFrameIndices, this.currentChunkIndex) >= 0;
    }

    public boolean isVideo() {
        return (this.chunkId & CHUNK_TYPE_VIDEO_COMPRESSED) == CHUNK_TYPE_VIDEO_COMPRESSED;
    }

    public boolean onChunkData(ExtractorInput extractorInput) {
        int i = this.bytesRemainingInCurrentChunk;
        int sampleData = i - this.trackOutput.sampleData((DataReader) extractorInput, i, false);
        this.bytesRemainingInCurrentChunk = sampleData;
        boolean z = sampleData == 0;
        if (z) {
            if (this.currentChunkSize > 0) {
                this.trackOutput.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.currentChunkSize, 0, null);
            }
            advanceCurrentChunk();
        }
        return z;
    }

    public void onChunkStart(int i) {
        this.currentChunkSize = i;
        this.bytesRemainingInCurrentChunk = i;
    }

    public void seekToPosition(long j) {
        if (this.indexSize == 0) {
            this.currentChunkIndex = 0;
        } else {
            this.currentChunkIndex = this.keyFrameIndices[Util.binarySearchFloor(this.keyFrameOffsets, j, true, true)];
        }
    }
}

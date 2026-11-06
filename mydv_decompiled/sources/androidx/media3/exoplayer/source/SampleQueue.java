package androidx.media3.exoplayer.source;

import android.os.Looper;
import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.extractor.TrackOutput;
import defpackage.sp0;
import j$.util.Objects;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class SampleQueue implements TrackOutput {
    private static final int DEFAULT_MAX_NUM_REORDER_SAMPLES = 16;
    static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private static final String TAG = "SampleQueue";
    private int absoluteFirstIndex;
    private DrmSession currentDrmSession;
    private Format downstreamFormat;
    private final DrmSessionEventListener.EventDispatcher drmEventDispatcher;
    private final DrmSessionManager drmSessionManager;
    private boolean isLastSampleQueued;
    private int length;
    private boolean loggedUnexpectedNonSyncSample;
    private boolean pendingSplice;
    private int readPosition;
    private int relativeFirstIndex;
    private final SampleDataQueue sampleDataQueue;
    private long sampleOffsetUs;
    private Format unadjustedUpstreamFormat;
    private Format upstreamFormat;
    private boolean upstreamFormatAdjustmentRequired;
    private UpstreamFormatChangedListener upstreamFormatChangeListener;
    private long upstreamSourceId;
    private final SampleExtrasHolder extrasHolder = new SampleExtrasHolder();
    private int capacity = 1000;
    private long[] sourceIds = new long[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private final SpannedData<SharedSampleMetadata> sharedSampleMetadata = new SpannedData<>(new f());
    private long startTimeUs = Long.MIN_VALUE;
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;
    private boolean discardAllSamplesToStartTime = true;
    private long readEndTimeUs = Long.MIN_VALUE;
    private int readEndTimeAbsoluteIndex = -1;
    private int readEndTimeAbsoluteIndexCandidate = -1;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SharedSampleMetadata {
        public final DrmSessionManager.DrmSessionReference drmSessionReference;
        public final Format format;

        private SharedSampleMetadata(Format format, DrmSessionManager.DrmSessionReference drmSessionReference) {
            this.format = format;
            this.drmSessionReference = drmSessionReference;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface UpstreamFormatChangedListener {
        void onUpstreamFormatChanged(Format format);
    }

    public SampleQueue(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.drmSessionManager = drmSessionManager;
        this.drmEventDispatcher = eventDispatcher;
        this.sampleDataQueue = new SampleDataQueue(allocator);
    }

    private synchronized boolean attemptSplice(long j) {
        if (this.length == 0) {
            return j > this.largestDiscardedTimestampUs;
        }
        if (getLargestReadTimestampUs() >= j) {
            return false;
        }
        discardUpstreamSampleMetadata(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
        return true;
    }

    private static boolean canDiscardAllSamplesToStartTime(String str, String str2) {
        return MimeTypes.getTrackType(str) == 1 && MimeTypes.allSamplesAreSyncSamples(str, str2);
    }

    private synchronized void commitSample(long j, int i, long j2, int i2, TrackOutput.CryptoData cryptoData) {
        try {
            int i3 = this.length;
            if (i3 > 0) {
                int relativeIndex = getRelativeIndex(i3 - 1);
                sp0.o(this.offsets[relativeIndex] + ((long) this.sizes[relativeIndex]) <= j2);
            }
            this.isLastSampleQueued = (536870912 & i) != 0;
            this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j);
            updateReadEndTimeState(getWriteIndex(), j, i);
            int relativeIndex2 = getRelativeIndex(this.length);
            this.timesUs[relativeIndex2] = j;
            this.offsets[relativeIndex2] = j2;
            this.sizes[relativeIndex2] = i2;
            this.flags[relativeIndex2] = i;
            this.cryptoDatas[relativeIndex2] = cryptoData;
            this.sourceIds[relativeIndex2] = this.upstreamSourceId;
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(this.upstreamFormat)) {
                Format format = this.upstreamFormat;
                format.getClass();
                DrmSessionManager drmSessionManager = this.drmSessionManager;
                this.sharedSampleMetadata.appendSpan(getWriteIndex(), new SharedSampleMetadata(format, drmSessionManager != null ? drmSessionManager.preacquireSession(this.drmEventDispatcher, format) : DrmSessionManager.DrmSessionReference.EMPTY));
            }
            int i4 = this.length + 1;
            this.length = i4;
            int i5 = this.capacity;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i6];
                int i7 = this.relativeFirstIndex;
                int i8 = i5 - i7;
                System.arraycopy(this.offsets, i7, jArr2, 0, i8);
                System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i8);
                System.arraycopy(this.flags, this.relativeFirstIndex, iArr, 0, i8);
                System.arraycopy(this.sizes, this.relativeFirstIndex, iArr2, 0, i8);
                System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i8);
                System.arraycopy(this.sourceIds, this.relativeFirstIndex, jArr, 0, i8);
                int i9 = this.relativeFirstIndex;
                System.arraycopy(this.offsets, 0, jArr2, i8, i9);
                System.arraycopy(this.timesUs, 0, jArr3, i8, i9);
                System.arraycopy(this.flags, 0, iArr, i8, i9);
                System.arraycopy(this.sizes, 0, iArr2, i8, i9);
                System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i8, i9);
                System.arraycopy(this.sourceIds, 0, jArr, i8, i9);
                this.offsets = jArr2;
                this.timesUs = jArr3;
                this.flags = iArr;
                this.sizes = iArr2;
                this.cryptoDatas = cryptoDataArr;
                this.sourceIds = jArr;
                this.relativeFirstIndex = 0;
                this.capacity = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private int countUnreadSamplesBefore(long j) {
        int i = this.length;
        int relativeIndex = getRelativeIndex(i - 1);
        while (i > this.readPosition && this.timesUs[relativeIndex] >= j) {
            i--;
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return i;
    }

    @Deprecated
    public static SampleQueue createWithDrm(Allocator allocator, Looper looper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.setPlayer(looper, PlayerId.UNSET);
        eventDispatcher.getClass();
        return new SampleQueue(allocator, drmSessionManager, eventDispatcher);
    }

    public static SampleQueue createWithoutDrm(Allocator allocator) {
        return new SampleQueue(allocator, null, null);
    }

    private synchronized long discardSampleMetadataTo(long j, boolean z, boolean z2) {
        SampleQueue sampleQueue;
        Throwable th;
        try {
            try {
                int i = this.length;
                if (i != 0) {
                    long[] jArr = this.timesUs;
                    int i2 = this.relativeFirstIndex;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.readPosition;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sampleQueue = this;
                                throw th;
                            }
                        }
                        int findSampleBefore = findSampleBefore(i2, i, j, z);
                        if (findSampleBefore == -1) {
                            return -1L;
                        }
                        return discardSamples(findSampleBefore);
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            sampleQueue = this;
            th = th;
            throw th;
        }
    }

    private synchronized long discardSampleMetadataToEnd() {
        int i = this.length;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    private long discardSamples(int i) {
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i));
        this.length -= i;
        int i2 = this.absoluteFirstIndex + i;
        this.absoluteFirstIndex = i2;
        int i3 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i3;
        int i4 = this.capacity;
        if (i3 >= i4) {
            this.relativeFirstIndex = i3 - i4;
        }
        int i5 = this.readPosition - i;
        this.readPosition = i5;
        if (i5 < 0) {
            this.readPosition = 0;
        }
        this.sharedSampleMetadata.discardTo(i2);
        if (this.length != 0) {
            return this.offsets[this.relativeFirstIndex];
        }
        int i6 = this.relativeFirstIndex;
        if (i6 == 0) {
            i6 = this.capacity;
        }
        return this.offsets[i6 - 1] + this.sizes[r5];
    }

    private long discardUpstreamSampleMetadata(int i) {
        int writeIndex = getWriteIndex() - i;
        boolean z = false;
        sp0.o(writeIndex >= 0 && writeIndex <= this.length - this.readPosition);
        int i2 = this.length - writeIndex;
        this.length = i2;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        if (writeIndex == 0 && this.isLastSampleQueued) {
            z = true;
        }
        this.isLastSampleQueued = z;
        int i3 = this.readEndTimeAbsoluteIndex;
        if (i3 != -1 && i < i3) {
            this.readEndTimeAbsoluteIndex = -1;
        }
        int i4 = this.readEndTimeAbsoluteIndexCandidate;
        if (i4 != -1 && i < i4) {
            this.readEndTimeAbsoluteIndexCandidate = -1;
        }
        this.sharedSampleMetadata.discardFrom(i);
        int i5 = this.length;
        if (i5 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i5 - 1)] + this.sizes[r9];
    }

    private int findSampleAfter(int i, int i2, long j, boolean z) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.timesUs[i] >= j) {
                return i3;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        if (z) {
            return i2;
        }
        return -1;
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.timesUs[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.flags[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i3;
    }

    private long getLargestTimestamp(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                return j;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.relativeFirstIndex + i;
        int i3 = this.capacity;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private int getUpstreamMaxNumReorderSamples() {
        int i;
        Format format = this.upstreamFormat;
        if (format == null || (i = format.maxNumReorderSamples) == -1) {
            return 16;
        }
        return i;
    }

    private boolean hasNextSample() {
        return this.readPosition != this.length;
    }

    private boolean isReadEndTimeIndexMaybeReached() {
        return this.readEndTimeAbsoluteIndex == -1 && this.readEndTimeAbsoluteIndexCandidate != -1 && getReadIndex() >= this.readEndTimeAbsoluteIndexCandidate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(SharedSampleMetadata sharedSampleMetadata) {
        sharedSampleMetadata.drmSessionReference.release();
    }

    private boolean mayReadSample(int i) {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.flags[i] & 1073741824) == 0 && this.currentDrmSession.playClearSamplesWithoutKeys();
    }

    private void onFormatResult(Format format, FormatHolder formatHolder) {
        Format format2 = this.downstreamFormat;
        boolean z = format2 == null;
        DrmInitData drmInitData = format2 == null ? null : format2.drmInitData;
        this.downstreamFormat = format;
        DrmInitData drmInitData2 = format.drmInitData;
        DrmSessionManager drmSessionManager = this.drmSessionManager;
        formatHolder.format = drmSessionManager != null ? format.copyWithCryptoType(drmSessionManager.getCryptoType(format)) : format;
        formatHolder.drmSession = this.currentDrmSession;
        if (this.drmSessionManager == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.currentDrmSession;
            DrmSession acquireSession = this.drmSessionManager.acquireSession(this.drmEventDispatcher, format);
            this.currentDrmSession = acquireSession;
            formatHolder.drmSession = acquireSession;
            if (drmSession != null) {
                drmSession.release(this.drmEventDispatcher);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r7.isLastSampleQueued != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        r9 = r7.upstreamFormat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        if (r9 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        if (r10 != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
    
        if (r9 == r7.downstreamFormat) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        r9.getClass();
        onFormatResult(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        return -5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009a, code lost:
    
        return -3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized int peekSampleMetadata(androidx.media3.exoplayer.FormatHolder r8, androidx.media3.decoder.DecoderInputBuffer r9, boolean r10, boolean r11, androidx.media3.exoplayer.source.SampleQueue.SampleExtrasHolder r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r9.waitingForKeys = r0     // Catch: java.lang.Throwable -> L44
            int r1 = r7.getReadIndex()     // Catch: java.lang.Throwable -> L44
            int r2 = r7.readEndTimeAbsoluteIndex     // Catch: java.lang.Throwable -> L44
            r3 = -1
            r4 = 1
            if (r2 == r3) goto L11
            if (r1 < r2) goto L11
            r0 = r4
        L11:
            boolean r2 = r7.hasNextSample()     // Catch: java.lang.Throwable -> L44
            r3 = -5
            r5 = -4
            r6 = -3
            if (r2 == 0) goto L7e
            boolean r2 = r7.isReadEndTimeIndexMaybeReached()     // Catch: java.lang.Throwable -> L44
            if (r2 != 0) goto L7e
            if (r0 == 0) goto L23
            goto L7e
        L23:
            androidx.media3.exoplayer.source.SpannedData<androidx.media3.exoplayer.source.SampleQueue$SharedSampleMetadata> r0 = r7.sharedSampleMetadata     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L44
            androidx.media3.exoplayer.source.SampleQueue$SharedSampleMetadata r0 = (androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) r0     // Catch: java.lang.Throwable -> L44
            androidx.media3.common.Format r0 = r0.format     // Catch: java.lang.Throwable -> L44
            if (r10 != 0) goto L79
            androidx.media3.common.Format r10 = r7.downstreamFormat     // Catch: java.lang.Throwable -> L44
            if (r0 == r10) goto L34
            goto L79
        L34:
            int r8 = r7.readPosition     // Catch: java.lang.Throwable -> L44
            int r8 = r7.getRelativeIndex(r8)     // Catch: java.lang.Throwable -> L44
            boolean r10 = r7.mayReadSample(r8)     // Catch: java.lang.Throwable -> L44
            if (r10 != 0) goto L46
            r9.waitingForKeys = r4     // Catch: java.lang.Throwable -> L44
            monitor-exit(r7)
            return r6
        L44:
            r8 = move-exception
            goto La5
        L46:
            int[] r10 = r7.flags     // Catch: java.lang.Throwable -> L44
            r10 = r10[r8]     // Catch: java.lang.Throwable -> L44
            r9.setFlags(r10)     // Catch: java.lang.Throwable -> L44
            int r10 = r7.readPosition     // Catch: java.lang.Throwable -> L44
            int r0 = r7.length     // Catch: java.lang.Throwable -> L44
            int r0 = r0 - r4
            if (r10 != r0) goto L5f
            if (r11 != 0) goto L5a
            boolean r10 = r7.isLastSampleQueued     // Catch: java.lang.Throwable -> L44
            if (r10 == 0) goto L5f
        L5a:
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            r9.addFlag(r10)     // Catch: java.lang.Throwable -> L44
        L5f:
            long[] r10 = r7.timesUs     // Catch: java.lang.Throwable -> L44
            r0 = r10[r8]     // Catch: java.lang.Throwable -> L44
            r9.timeUs = r0     // Catch: java.lang.Throwable -> L44
            int[] r9 = r7.sizes     // Catch: java.lang.Throwable -> L44
            r9 = r9[r8]     // Catch: java.lang.Throwable -> L44
            r12.size = r9     // Catch: java.lang.Throwable -> L44
            long[] r9 = r7.offsets     // Catch: java.lang.Throwable -> L44
            r10 = r9[r8]     // Catch: java.lang.Throwable -> L44
            r12.offset = r10     // Catch: java.lang.Throwable -> L44
            androidx.media3.extractor.TrackOutput$CryptoData[] r9 = r7.cryptoDatas     // Catch: java.lang.Throwable -> L44
            r8 = r9[r8]     // Catch: java.lang.Throwable -> L44
            r12.cryptoData = r8     // Catch: java.lang.Throwable -> L44
            monitor-exit(r7)
            return r5
        L79:
            r7.onFormatResult(r0, r8)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r7)
            return r3
        L7e:
            if (r11 != 0) goto L9b
            boolean r11 = r7.isLastSampleQueued     // Catch: java.lang.Throwable -> L44
            if (r11 != 0) goto L9b
            if (r0 == 0) goto L87
            goto L9b
        L87:
            androidx.media3.common.Format r9 = r7.upstreamFormat     // Catch: java.lang.Throwable -> L44
            if (r9 == 0) goto L99
            if (r10 != 0) goto L91
            androidx.media3.common.Format r10 = r7.downstreamFormat     // Catch: java.lang.Throwable -> L44
            if (r9 == r10) goto L99
        L91:
            r9.getClass()     // Catch: java.lang.Throwable -> L44
            r7.onFormatResult(r9, r8)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r7)
            return r3
        L99:
            monitor-exit(r7)
            return r6
        L9b:
            r8 = 4
            r9.setFlags(r8)     // Catch: java.lang.Throwable -> L44
            r10 = -9223372036854775808
            r9.timeUs = r10     // Catch: java.lang.Throwable -> L44
            monitor-exit(r7)
            return r5
        La5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L44
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.peekSampleMetadata(androidx.media3.exoplayer.FormatHolder, androidx.media3.decoder.DecoderInputBuffer, boolean, boolean, androidx.media3.exoplayer.source.SampleQueue$SampleExtrasHolder):int");
    }

    private void releaseDrmSessionReferences() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession != null) {
            drmSession.release(this.drmEventDispatcher);
            this.currentDrmSession = null;
            this.downstreamFormat = null;
        }
    }

    private synchronized void rewind() {
        this.readPosition = 0;
        this.sampleDataQueue.rewind();
    }

    private void searchReadEndTimeAbsoluteIndex() {
        this.readEndTimeAbsoluteIndex = -1;
        this.readEndTimeAbsoluteIndexCandidate = -1;
        long j = this.readEndTimeUs;
        if (j == Long.MIN_VALUE || j > this.largestQueuedTimestampUs) {
            return;
        }
        for (int i = 0; i < this.length; i++) {
            int relativeIndex = getRelativeIndex(i);
            updateReadEndTimeState(this.absoluteFirstIndex + i, this.timesUs[relativeIndex], this.flags[relativeIndex]);
            if (this.readEndTimeAbsoluteIndex != -1) {
                return;
            }
        }
    }

    private synchronized boolean setUpstreamFormat(Format format) {
        try {
            this.upstreamFormatRequired = false;
            if (Objects.equals(format, this.upstreamFormat)) {
                return false;
            }
            if (this.sharedSampleMetadata.isEmpty() || !this.sharedSampleMetadata.getEndValue().format.equals(format)) {
                this.upstreamFormat = format;
            } else {
                format = this.sharedSampleMetadata.getEndValue().format;
                this.upstreamFormat = format;
            }
            this.discardAllSamplesToStartTime = canDiscardAllSamplesToStartTime(format.sampleMimeType, format.codecs) & this.discardAllSamplesToStartTime;
            this.loggedUnexpectedNonSyncSample = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void updateReadEndTimeState(int i, long j, int i2) {
        long j2 = this.readEndTimeUs;
        if (j2 != Long.MIN_VALUE && this.readEndTimeAbsoluteIndex == -1) {
            if (j < j2) {
                this.readEndTimeAbsoluteIndexCandidate = -1;
                return;
            }
            int i3 = this.readEndTimeAbsoluteIndexCandidate;
            if (i3 == -1) {
                this.readEndTimeAbsoluteIndexCandidate = i;
                i3 = i;
            }
            int i4 = (i - i3) + 1;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
            if (i4 >= getUpstreamMaxNumReorderSamples() + 1 || z || z2) {
                this.readEndTimeAbsoluteIndex = this.readEndTimeAbsoluteIndexCandidate;
                this.readEndTimeAbsoluteIndexCandidate = -1;
            }
        }
    }

    public synchronized long discardSampleMetadataToRead() {
        int i = this.readPosition;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final void discardTo(long j, boolean z, boolean z2) {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataTo(j, z, z2));
    }

    public final void discardToEnd() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToEnd());
    }

    public final void discardToRead() {
        this.sampleDataQueue.discardDownstreamTo(discardSampleMetadataToRead());
    }

    public final void discardUpstreamFrom(long j) {
        if (this.length == 0) {
            return;
        }
        sp0.o(j > getLargestReadTimestampUs());
        discardUpstreamSamples(this.absoluteFirstIndex + countUnreadSamplesBefore(j));
    }

    public final void discardUpstreamSamples(int i) {
        this.sampleDataQueue.discardUpstreamSampleBytes(discardUpstreamSampleMetadata(i));
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void format(Format format) {
        Format adjustedUpstreamFormat = getAdjustedUpstreamFormat(format);
        this.upstreamFormatAdjustmentRequired = false;
        this.unadjustedUpstreamFormat = format;
        boolean upstreamFormat = setUpstreamFormat(adjustedUpstreamFormat);
        UpstreamFormatChangedListener upstreamFormatChangedListener = this.upstreamFormatChangeListener;
        if (upstreamFormatChangedListener == null || !upstreamFormat) {
            return;
        }
        upstreamFormatChangedListener.onUpstreamFormatChanged(adjustedUpstreamFormat);
    }

    public Format getAdjustedUpstreamFormat(Format format) {
        return (this.sampleOffsetUs == 0 || format.subsampleOffsetUs == Long.MAX_VALUE) ? format : format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.sampleOffsetUs).build();
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        return this.length == 0 ? Long.MIN_VALUE : this.timesUs[this.relativeFirstIndex];
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final synchronized long getLargestReadTimestampUs() {
        return Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition));
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized int getSkipCount(long j, boolean z) {
        Throwable th;
        SampleQueue sampleQueue;
        try {
            try {
                int relativeIndex = getRelativeIndex(this.readPosition);
                if (!hasNextSample() || j < this.timesUs[relativeIndex]) {
                    return 0;
                }
                if (j <= this.largestQueuedTimestampUs || !z) {
                    int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, true);
                    if (findSampleBefore == -1) {
                        return 0;
                    }
                    return findSampleBefore;
                }
                try {
                    return this.length - this.readPosition;
                } catch (Throwable th2) {
                    th = th2;
                    sampleQueue = this;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sampleQueue = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized Format getUpstreamFormat() {
        return this.upstreamFormatRequired ? null : this.upstreamFormat;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final synchronized boolean hasQueuedTimestampsUpToReadEndTimeUs() {
        return this.readEndTimeAbsoluteIndex != -1;
    }

    public final void invalidateUpstreamFormatAdjustment() {
        this.upstreamFormatAdjustmentRequired = true;
    }

    public final synchronized boolean isLastSampleQueued() {
        return this.isLastSampleQueued;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r4.isLastSampleQueued != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        r5 = r4.upstreamFormat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r5 == r4.downstreamFormat) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isReady(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.getReadIndex()     // Catch: java.lang.Throwable -> L38
            int r1 = r4.readEndTimeAbsoluteIndex     // Catch: java.lang.Throwable -> L38
            r2 = -1
            r3 = 1
            if (r1 == r2) goto Lf
            if (r0 < r1) goto Lf
            monitor-exit(r4)
            return r3
        Lf:
            boolean r1 = r4.hasNextSample()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3a
            boolean r1 = r4.isReadEndTimeIndexMaybeReached()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L1c
            goto L3a
        L1c:
            androidx.media3.exoplayer.source.SpannedData<androidx.media3.exoplayer.source.SampleQueue$SharedSampleMetadata> r5 = r4.sharedSampleMetadata     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r5.get(r0)     // Catch: java.lang.Throwable -> L38
            androidx.media3.exoplayer.source.SampleQueue$SharedSampleMetadata r5 = (androidx.media3.exoplayer.source.SampleQueue.SharedSampleMetadata) r5     // Catch: java.lang.Throwable -> L38
            androidx.media3.common.Format r5 = r5.format     // Catch: java.lang.Throwable -> L38
            androidx.media3.common.Format r0 = r4.downstreamFormat     // Catch: java.lang.Throwable -> L38
            if (r5 == r0) goto L2c
            monitor-exit(r4)
            return r3
        L2c:
            int r5 = r4.readPosition     // Catch: java.lang.Throwable -> L38
            int r5 = r4.getRelativeIndex(r5)     // Catch: java.lang.Throwable -> L38
            boolean r5 = r4.mayReadSample(r5)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return r5
        L38:
            r5 = move-exception
            goto L4c
        L3a:
            if (r5 != 0) goto L4a
            boolean r5 = r4.isLastSampleQueued     // Catch: java.lang.Throwable -> L38
            if (r5 != 0) goto L4a
            androidx.media3.common.Format r5 = r4.upstreamFormat     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L49
            androidx.media3.common.Format r0 = r4.downstreamFormat     // Catch: java.lang.Throwable -> L38
            if (r5 == r0) goto L49
            goto L4a
        L49:
            r3 = 0
        L4a:
            monitor-exit(r4)
            return r3
        L4c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.isReady(boolean):boolean");
    }

    public void maybeThrowError() {
        DrmSession drmSession = this.currentDrmSession;
        if (drmSession == null || drmSession.getState() != 1) {
            return;
        }
        DrmSession.DrmSessionException error = this.currentDrmSession.getError();
        error.getClass();
        throw error;
    }

    public final synchronized long peekSourceId() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return hasNextSample() ? this.sourceIds[getRelativeIndex(this.readPosition)] : this.upstreamSourceId;
    }

    public void preRelease() {
        discardToEnd();
        releaseDrmSessionReferences();
    }

    public int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i, boolean z) {
        int peekSampleMetadata = peekSampleMetadata(formatHolder, decoderInputBuffer, (i & 2) != 0, z, this.extrasHolder);
        if (peekSampleMetadata == -4 && !decoderInputBuffer.isEndOfStream()) {
            boolean z2 = (i & 1) != 0;
            if ((i & 4) == 0) {
                SampleDataQueue sampleDataQueue = this.sampleDataQueue;
                if (z2) {
                    sampleDataQueue.peekToBuffer(decoderInputBuffer, this.extrasHolder);
                } else {
                    sampleDataQueue.readToBuffer(decoderInputBuffer, this.extrasHolder);
                }
            }
            if (!z2) {
                this.readPosition++;
            }
        }
        return peekSampleMetadata;
    }

    public void release() {
        reset(true);
        releaseDrmSessionReferences();
    }

    public void reset(boolean z) {
        this.sampleDataQueue.reset();
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.readEndTimeAbsoluteIndex = -1;
        this.readEndTimeAbsoluteIndexCandidate = -1;
        this.upstreamKeyframeRequired = true;
        this.startTimeUs = Long.MIN_VALUE;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        this.isLastSampleQueued = false;
        this.sharedSampleMetadata.clear();
        if (z) {
            this.unadjustedUpstreamFormat = null;
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
            this.discardAllSamplesToStartTime = true;
        }
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z, int i2) {
        return this.sampleDataQueue.sampleData(dataReader, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    @Override // androidx.media3.extractor.TrackOutput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sampleMetadata(long r12, int r14, int r15, int r16, androidx.media3.extractor.TrackOutput.CryptoData r17) {
        /*
            r11 = this;
            boolean r1 = r11.upstreamFormatAdjustmentRequired
            if (r1 == 0) goto Lc
            androidx.media3.common.Format r1 = r11.unadjustedUpstreamFormat
            r1.getClass()
            r11.format(r1)
        Lc:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            r4 = r3
            goto L15
        L14:
            r4 = r2
        L15:
            boolean r5 = r11.upstreamKeyframeRequired
            if (r5 == 0) goto L1e
            if (r4 != 0) goto L1c
            goto L5e
        L1c:
            r11.upstreamKeyframeRequired = r2
        L1e:
            long r5 = r11.sampleOffsetUs
            long r5 = r5 + r12
            boolean r7 = r11.discardAllSamplesToStartTime
            if (r7 == 0) goto L4d
            long r7 = r11.startTimeUs
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2c
            goto L5e
        L2c:
            if (r1 != 0) goto L4d
            boolean r1 = r11.loggedUnexpectedNonSyncSample
            if (r1 != 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.<init>(r7)
            androidx.media3.common.Format r7 = r11.upstreamFormat
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            androidx.media3.common.util.Log.w(r7, r1)
            r11.loggedUnexpectedNonSyncSample = r3
        L49:
            r1 = r14 | 1
            r3 = r1
            goto L4e
        L4d:
            r3 = r14
        L4e:
            boolean r1 = r11.pendingSplice
            if (r1 == 0) goto L5f
            if (r4 == 0) goto L5e
            boolean r1 = r11.attemptSplice(r5)
            if (r1 != 0) goto L5b
            goto L5e
        L5b:
            r11.pendingSplice = r2
            goto L5f
        L5e:
            return
        L5f:
            androidx.media3.exoplayer.source.SampleDataQueue r1 = r11.sampleDataQueue
            long r1 = r1.getTotalBytesWritten()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.commitSample(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.SampleQueue.sampleMetadata(long, int, int, int, androidx.media3.extractor.TrackOutput$CryptoData):void");
    }

    public final synchronized boolean seekTo(long j, boolean z) {
        Throwable th;
        SampleQueue sampleQueue;
        Throwable th2;
        long j2;
        int findSampleAfter;
        SampleQueue sampleQueue2;
        try {
            try {
                rewind();
                int relativeIndex = getRelativeIndex(this.readPosition);
                long j3 = this.readEndTimeUs;
                long j4 = this.largestQueuedTimestampUs;
                if (j3 != Long.MIN_VALUE) {
                    try {
                        j4 = Math.min(j4, j3);
                    } catch (Throwable th3) {
                        th = th3;
                        sampleQueue = this;
                        throw th;
                    }
                }
                if (hasNextSample() && j >= this.timesUs[relativeIndex] && (j <= j4 || z)) {
                    boolean z2 = this.discardAllSamplesToStartTime;
                    int i = this.length;
                    if (z2) {
                        try {
                            int i2 = i - this.readPosition;
                            sampleQueue = this;
                            j2 = j;
                            try {
                                findSampleAfter = sampleQueue.findSampleAfter(relativeIndex, i2, j2, z);
                                sampleQueue2 = sampleQueue;
                            } catch (Throwable th4) {
                                th2 = th4;
                                th = th2;
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th2 = th5;
                            sampleQueue = this;
                        }
                    } else {
                        j2 = j;
                        try {
                            int i3 = i - this.readPosition;
                            sampleQueue2 = this;
                            findSampleAfter = sampleQueue2.findSampleBefore(relativeIndex, i3, j2, true);
                        } catch (Throwable th6) {
                            th = th6;
                            sampleQueue = this;
                            th = th;
                            throw th;
                        }
                    }
                    if (findSampleAfter == -1) {
                        return false;
                    }
                    sampleQueue2.startTimeUs = j2;
                    sampleQueue2.readPosition += findSampleAfter;
                    return true;
                }
            } catch (Throwable th7) {
                th = th7;
                sampleQueue = this;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        return false;
    }

    public final synchronized void setReadEndTimeUs(long j) {
        if (j == this.readEndTimeUs) {
            return;
        }
        this.readEndTimeUs = j;
        searchReadEndTimeAbsoluteIndex();
    }

    public final void setSampleOffsetUs(long j) {
        if (this.sampleOffsetUs != j) {
            this.sampleOffsetUs = j;
            invalidateUpstreamFormatAdjustment();
        }
    }

    public final void setStartTimeUs(long j) {
        this.startTimeUs = j;
    }

    public final void setUpstreamFormatChangeListener(UpstreamFormatChangedListener upstreamFormatChangedListener) {
        this.upstreamFormatChangeListener = upstreamFormatChangedListener;
    }

    public final synchronized void skip(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.readPosition + i <= this.length) {
                    z = true;
                    sp0.o(z);
                    this.readPosition += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        sp0.o(z);
        this.readPosition += i;
    }

    public final void sourceId(long j) {
        this.upstreamSourceId = j;
    }

    public final void splice() {
        this.pendingSplice = true;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int sampleData(DataReader dataReader, int i, boolean z) {
        return sampleData(dataReader, i, z, 0);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        this.sampleDataQueue.sampleData(parsableByteArray, i);
    }

    public static SampleQueue createWithDrm(Allocator allocator, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSessionManager.getClass();
        eventDispatcher.getClass();
        return new SampleQueue(allocator, drmSessionManager, eventDispatcher);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void durationUs(long j) {
    }

    public final void reset() {
        reset(false);
    }

    public final synchronized boolean seekTo(int i) {
        rewind();
        int i2 = this.absoluteFirstIndex;
        if (i >= i2 && i <= this.length + i2) {
            int i3 = this.readEndTimeAbsoluteIndex;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            int i4 = this.readEndTimeAbsoluteIndexCandidate;
            if (i4 != -1 && i >= i4) {
                return false;
            }
            this.startTimeUs = Long.MIN_VALUE;
            this.readPosition = i - i2;
            return true;
        }
        return false;
    }
}

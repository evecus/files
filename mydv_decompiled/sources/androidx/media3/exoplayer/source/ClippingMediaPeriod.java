package androidx.media3.exoplayer.source;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import defpackage.li4;
import defpackage.zy;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    private MediaPeriod.Callback callback;
    private ClippingMediaSource.IllegalClippingException clippingError;
    private final boolean enableClippingInMediaPeriod;
    long endUs;
    private boolean hasProcessedInitialDiscontinuity;
    private boolean isPeriodClippingEndPosition;
    private long lastReportedDiscontinuityUs;
    public final MediaPeriod mediaPeriod;
    private long pendingInitialDiscontinuityPositionUs;
    private ClippingSampleStream[] sampleStreams;
    long startUs;
    private boolean usesStreamPrerollFlags;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        private final boolean hasPreroll;
        private boolean sentEos;

        private ClippingSampleStream(SampleStream sampleStream, boolean z) {
            this.childStream = sampleStream;
            this.hasPreroll = z;
        }

        public void clearSentEos() {
            this.sentEos = false;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int getFlags() {
            int flags = this.childStream.getFlags();
            if (ClippingMediaPeriod.this.endUs != Long.MIN_VALUE) {
                flags |= 1;
            }
            return this.hasPreroll ? (flags & (-3)) | 4 : flags;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public void maybeThrowError() {
            this.childStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (ClippingMediaPeriod.this.isPeriodClippingEndPosition) {
                int readData = this.childStream.readData(formatHolder, decoderInputBuffer, i);
                if (readData != -5) {
                    return readData;
                }
                ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
                ClippingMediaPeriod.updateDecoderDelayPaddingForClipping(formatHolder, clippingMediaPeriod.startUs, clippingMediaPeriod.endUs);
                return -5;
            }
            if (this.sentEos) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            long bufferedPositionUs = ClippingMediaPeriod.this.getBufferedPositionUs();
            int readData2 = this.childStream.readData(formatHolder, decoderInputBuffer, i);
            if (ClippingMediaPeriod.this.lastReportedDiscontinuityUs != C.TIME_UNSET && readData2 != -3) {
                ClippingMediaPeriod.this.lastReportedDiscontinuityUs = C.TIME_UNSET;
            }
            ClippingMediaPeriod clippingMediaPeriod2 = ClippingMediaPeriod.this;
            if (readData2 == -5) {
                ClippingMediaPeriod.updateDecoderDelayPaddingForClipping(formatHolder, clippingMediaPeriod2.startUs, clippingMediaPeriod2.endUs);
                return -5;
            }
            long j = clippingMediaPeriod2.endUs;
            if (j == Long.MIN_VALUE || ((readData2 != -4 || decoderInputBuffer.timeUs < j) && !(readData2 == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                return readData2;
            }
            decoderInputBuffer.clear();
            decoderInputBuffer.setFlags(4);
            this.sentEos = true;
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public int skipData(long j) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j, long j2, boolean z2) {
        this.mediaPeriod = mediaPeriod;
        this.sampleStreams = new ClippingSampleStream[0];
        this.pendingInitialDiscontinuityPositionUs = z ? j : -9223372036854775807L;
        this.lastReportedDiscontinuityUs = C.TIME_UNSET;
        this.enableClippingInMediaPeriod = z2;
        updateClipping(j, j2);
    }

    private SeekParameters clipSeekParameters(long j, SeekParameters seekParameters) {
        long constrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j - this.startUs);
        long j2 = seekParameters.toleranceAfterUs;
        long j3 = this.endUs;
        long constrainValue2 = Util.constrainValue(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (constrainValue == seekParameters.toleranceBeforeUs && constrainValue2 == seekParameters.toleranceAfterUs) ? seekParameters : new SeekParameters(constrainValue, constrainValue2);
    }

    private static long enforceClippingRange(long j, long j2, long j3) {
        long max = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    private static boolean shouldKeepInitialDiscontinuity(long j, long j2, ExoTrackSelection[] exoTrackSelectionArr, int i) {
        ExoTrackSelection exoTrackSelection;
        if (j < j2) {
            return true;
        }
        if (j == 0 || (exoTrackSelection = exoTrackSelectionArr[i]) == null) {
            return false;
        }
        Format selectedFormat = exoTrackSelection.getSelectedFormat();
        return !MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateDecoderDelayPaddingForClipping(FormatHolder formatHolder, long j, long j2) {
        Format format = formatHolder.format;
        format.getClass();
        int i = format.encoderDelay;
        if (i == 0 && format.encoderPadding == 0) {
            return;
        }
        if (j != 0) {
            i = 0;
        }
        formatHolder.format = format.buildUpon().setEncoderDelay(i).setEncoderPadding(j2 == Long.MIN_VALUE ? format.encoderPadding : 0).build();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        this.mediaPeriod.discardBuffer(j, z);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        long j2 = this.startUs;
        if (j == j2) {
            return j2;
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j, clipSeekParameters(j, seekParameters));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (!this.isPeriodClippingEndPosition) {
            if (bufferedPositionUs != Long.MIN_VALUE) {
                long j = this.endUs;
                if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                }
            }
            return Long.MIN_VALUE;
        }
        long j2 = this.endUs;
        if (j2 != Long.MIN_VALUE && bufferedPositionUs != Long.MIN_VALUE) {
            return Math.min(j2, bufferedPositionUs);
        }
        return bufferedPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (!this.isPeriodClippingEndPosition) {
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                long j = this.endUs;
                if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                }
            }
            return Long.MIN_VALUE;
        }
        long j2 = this.endUs;
        if (j2 != Long.MIN_VALUE && nextLoadPositionUs != Long.MIN_VALUE) {
            return Math.min(j2, nextLoadPositionUs);
        }
        return nextLoadPositionUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        return this.mediaPeriod.getStreamKeys(list);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public boolean isPendingInitialDiscontinuity() {
        return (this.pendingInitialDiscontinuityPositionUs == C.TIME_UNSET || this.hasProcessedInitialDiscontinuity) ? false : true;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void maybeThrowPrepareError() {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        if (this.clippingError != null) {
            return;
        }
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            this.hasProcessedInitialDiscontinuity = true;
            long j = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
            this.lastReportedDiscontinuityUs = j;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != C.TIME_UNSET ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long enforceClippingRange = enforceClippingRange(readDiscontinuity2, this.startUs, this.endUs);
        if (enforceClippingRange == this.lastReportedDiscontinuityUs) {
            return C.TIME_UNSET;
        }
        this.lastReportedDiscontinuityUs = enforceClippingRange;
        return enforceClippingRange;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public long seekToUs(long j) {
        this.pendingInitialDiscontinuityPositionUs = C.TIME_UNSET;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.clearSentEos();
            }
        }
        return enforceClippingRange(this.mediaPeriod.seekToUs(j), this.startUs, this.endUs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (shouldKeepInitialDiscontinuity(r11, r22, r18, r16) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[] r18, boolean[] r19, androidx.media3.exoplayer.source.SampleStream[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            int r2 = r1.length
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream[] r2 = new androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream[r2]
            r0.sampleStreams = r2
            int r2 = r1.length
            androidx.media3.exoplayer.source.SampleStream[] r6 = new androidx.media3.exoplayer.source.SampleStream[r2]
            r2 = 0
            r3 = r2
        Le:
            int r4 = r1.length
            r10 = 0
            if (r3 >= r4) goto L23
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream[] r4 = r0.sampleStreams
            r5 = r1[r3]
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream r5 = (androidx.media3.exoplayer.source.ClippingMediaPeriod.ClippingSampleStream) r5
            r4[r3] = r5
            if (r5 == 0) goto L1e
            androidx.media3.exoplayer.source.SampleStream r10 = r5.childStream
        L1e:
            r6[r3] = r10
            int r3 = r3 + 1
            goto Le
        L23:
            androidx.media3.exoplayer.source.MediaPeriod r3 = r0.mediaPeriod
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            long r11 = r3.selectTracks(r4, r5, r6, r7, r8)
            long r3 = r0.endUs
            r13 = r22
            r15 = r3
            long r3 = enforceClippingRange(r11, r13, r15)
            r5 = r2
            r7 = r5
        L3c:
            int r8 = r1.length
            r9 = 1
            if (r5 >= r8) goto L83
            r8 = r6[r5]
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream[] r13 = r0.sampleStreams
            if (r8 != 0) goto L49
            r13[r5] = r10
            goto L52
        L49:
            r13 = r13[r5]
            if (r13 == 0) goto L55
            androidx.media3.exoplayer.source.SampleStream r13 = r13.childStream
            if (r13 == r8) goto L52
            goto L55
        L52:
            r16 = r5
            goto L7a
        L55:
            boolean r8 = r0.isPendingInitialDiscontinuity()
            if (r8 == 0) goto L68
            r15 = r18
            r13 = r22
            r16 = r5
            boolean r5 = shouldKeepInitialDiscontinuity(r11, r13, r15, r16)
            if (r5 == 0) goto L6a
            goto L6b
        L68:
            r16 = r5
        L6a:
            r9 = r2
        L6b:
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream[] r5 = r0.sampleStreams
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream r8 = new androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream
            r13 = r6[r16]
            r13.getClass()
            r8.<init>(r13, r9)
            r5[r16] = r8
            r7 = r7 | r9
        L7a:
            androidx.media3.exoplayer.source.ClippingMediaPeriod$ClippingSampleStream[] r5 = r0.sampleStreams
            r5 = r5[r16]
            r1[r16] = r5
            int r5 = r16 + 1
            goto L3c
        L83:
            if (r7 == 0) goto L87
            r1 = r3
            goto L8c
        L87:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L8c:
            r0.pendingInitialDiscontinuityPositionUs = r1
            boolean r1 = r0.usesStreamPrerollFlags
            if (r1 == 0) goto L94
            r0.hasProcessedInitialDiscontinuity = r9
        L94:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.ClippingMediaPeriod.selectTracks(androidx.media3.exoplayer.trackselection.ExoTrackSelection[], boolean[], androidx.media3.exoplayer.source.SampleStream[], boolean[], long):long");
    }

    public void setClippingError(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.clippingError = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long setEndPositionUs(long j) {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public void setUsesStreamPrerollFlags() {
        this.usesStreamPrerollFlags = true;
        this.mediaPeriod.setUsesStreamPrerollFlags();
    }

    public void updateClipping(long j, long j2) {
        this.startUs = j;
        this.endUs = j2;
        if (this.enableClippingInMediaPeriod) {
            long endPositionUs = this.mediaPeriod.setEndPositionUs(j2);
            if (endPositionUs == Long.MIN_VALUE || endPositionUs == j2) {
                this.isPeriodClippingEndPosition = endPositionUs == j2;
            } else {
                zy.i(li4.h("Period updating end positions not supported, %s!=%s", Long.valueOf(endPositionUs), Long.valueOf(j2)));
            }
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j, long j2) {
        this(mediaPeriod, z, j, j2, false);
    }
}

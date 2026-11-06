package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class H264Reader implements ElementaryStreamReader {
    private final boolean allowNonIdrKeyframes;
    private final String containerMimeType;
    private final boolean detectAccessUnits;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private boolean randomAccessIndicator;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(7, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(8, 128);
    private final NalUnitTargetBuffer sei = new NalUnitTargetBuffer(6, 128);
    private long pesTimeUs = C.TIME_UNSET;
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class SampleReader {
        private static final int DEFAULT_BUFFER_SIZE = 128;
        private final boolean allowNonIdrKeyframes;
        private final ParsableNalUnitBitArray bitArray;
        private byte[] buffer;
        private int bufferLength;
        private final boolean detectAccessUnits;
        private boolean isFilling;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private int nalUnitType;
        private final TrackOutput output;
        private SliceHeaderData previousSliceHeader;
        private boolean randomAccessIndicator;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private SliceHeaderData sliceHeader;
        private final SparseArray<NalUnitUtil.SpsData> sps = new SparseArray<>();
        private final SparseArray<NalUnitUtil.PpsData> pps = new SparseArray<>();

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class SliceHeaderData {
            private static final int SLICE_TYPE_ALL_I = 7;
            private static final int SLICE_TYPE_I = 2;
            private boolean bottomFieldFlag;
            private boolean bottomFieldFlagPresent;
            private int deltaPicOrderCnt0;
            private int deltaPicOrderCnt1;
            private int deltaPicOrderCntBottom;
            private boolean fieldPicFlag;
            private int frameNum;
            private boolean hasSliceType;
            private boolean idrPicFlag;
            private int idrPicId;
            private boolean isComplete;
            private int nalRefIdc;
            private int picOrderCntLsb;
            private int picParameterSetId;
            private int sliceType;
            private NalUnitUtil.SpsData spsData;

            private SliceHeaderData() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean isFirstVclNalUnitOfPicture(SliceHeaderData sliceHeaderData) {
                int i;
                int i2;
                int i3;
                boolean z;
                if (!this.isComplete) {
                    return false;
                }
                if (!sliceHeaderData.isComplete) {
                    return true;
                }
                NalUnitUtil.SpsData spsData = this.spsData;
                spsData.getClass();
                NalUnitUtil.SpsData spsData2 = sliceHeaderData.spsData;
                spsData2.getClass();
                return (this.frameNum == sliceHeaderData.frameNum && this.picParameterSetId == sliceHeaderData.picParameterSetId && this.fieldPicFlag == sliceHeaderData.fieldPicFlag && (!this.bottomFieldFlagPresent || !sliceHeaderData.bottomFieldFlagPresent || this.bottomFieldFlag == sliceHeaderData.bottomFieldFlag) && (((i = this.nalRefIdc) == (i2 = sliceHeaderData.nalRefIdc) || (i != 0 && i2 != 0)) && (((i3 = spsData.picOrderCountType) != 0 || spsData2.picOrderCountType != 0 || (this.picOrderCntLsb == sliceHeaderData.picOrderCntLsb && this.deltaPicOrderCntBottom == sliceHeaderData.deltaPicOrderCntBottom)) && ((i3 != 1 || spsData2.picOrderCountType != 1 || (this.deltaPicOrderCnt0 == sliceHeaderData.deltaPicOrderCnt0 && this.deltaPicOrderCnt1 == sliceHeaderData.deltaPicOrderCnt1)) && (z = this.idrPicFlag) == sliceHeaderData.idrPicFlag && (!z || this.idrPicId == sliceHeaderData.idrPicId))))) ? false : true;
            }

            public void clear() {
                this.hasSliceType = false;
                this.isComplete = false;
            }

            public boolean isISlice() {
                if (!this.hasSliceType) {
                    return false;
                }
                int i = this.sliceType;
                return i == 7 || i == 2;
            }

            public void setAll(NalUnitUtil.SpsData spsData, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.spsData = spsData;
                this.nalRefIdc = i;
                this.sliceType = i2;
                this.frameNum = i3;
                this.picParameterSetId = i4;
                this.fieldPicFlag = z;
                this.bottomFieldFlagPresent = z2;
                this.bottomFieldFlag = z3;
                this.idrPicFlag = z4;
                this.idrPicId = i5;
                this.picOrderCntLsb = i6;
                this.deltaPicOrderCntBottom = i7;
                this.deltaPicOrderCnt0 = i8;
                this.deltaPicOrderCnt1 = i9;
                this.isComplete = true;
                this.hasSliceType = true;
            }

            public void setSliceType(int i) {
                this.sliceType = i;
                this.hasSliceType = true;
            }
        }

        public SampleReader(TrackOutput trackOutput, boolean z, boolean z2) {
            this.output = trackOutput;
            this.allowNonIdrKeyframes = z;
            this.detectAccessUnits = z2;
            this.previousSliceHeader = new SliceHeaderData();
            this.sliceHeader = new SliceHeaderData();
            byte[] bArr = new byte[128];
            this.buffer = bArr;
            this.bitArray = new ParsableNalUnitBitArray(bArr, 0, 0);
            reset();
        }

        private void outputSample(int i) {
            long j = this.sampleTimeUs;
            if (j != C.TIME_UNSET) {
                long j2 = this.nalUnitStartPosition;
                long j3 = this.samplePosition;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.output.sampleMetadata(j, this.sampleIsKeyframe ? 1 : 0, i2, i, null);
            }
        }

        private void setSampleIsKeyframe() {
            boolean isISlice = this.allowNonIdrKeyframes ? this.sliceHeader.isISlice() : this.randomAccessIndicator;
            boolean z = this.sampleIsKeyframe;
            int i = this.nalUnitType;
            boolean z2 = true;
            if (i != 5 && (!isISlice || i != 1)) {
                z2 = false;
            }
            this.sampleIsKeyframe = z | z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void appendToNalUnit(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ts.H264Reader.SampleReader.appendToNalUnit(byte[], int, int):void");
        }

        public boolean endNalUnit(long j, int i, boolean z) {
            if (this.nalUnitType == 9 || (this.detectAccessUnits && this.sliceHeader.isFirstVclNalUnitOfPicture(this.previousSliceHeader))) {
                if (z && this.readingSample) {
                    outputSample(i + ((int) (j - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.sampleIsKeyframe = false;
                this.readingSample = true;
            }
            setSampleIsKeyframe();
            this.nalUnitType = 24;
            return this.sampleIsKeyframe;
        }

        public boolean needsSpsPps() {
            return this.detectAccessUnits;
        }

        public void putPps(NalUnitUtil.PpsData ppsData) {
            this.pps.append(ppsData.picParameterSetId, ppsData);
        }

        public void putSps(NalUnitUtil.SpsData spsData) {
            this.sps.append(spsData.seqParameterSetId, spsData);
        }

        public void reset() {
            this.isFilling = false;
            this.readingSample = false;
            this.sliceHeader.clear();
        }

        public void startNalUnit(long j, int i, long j2, boolean z) {
            this.nalUnitType = i;
            this.nalUnitTimeUs = j2;
            this.nalUnitStartPosition = j;
            this.randomAccessIndicator = z;
            if (!this.allowNonIdrKeyframes || i != 1) {
                if (!this.detectAccessUnits) {
                    return;
                }
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            }
            SliceHeaderData sliceHeaderData = this.previousSliceHeader;
            this.previousSliceHeader = this.sliceHeader;
            this.sliceHeader = sliceHeaderData;
            sliceHeaderData.clear();
            this.bufferLength = 0;
            this.isFilling = true;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2, String str) {
        this.seiReader = seiReader;
        this.allowNonIdrKeyframes = z;
        this.detectAccessUnits = z2;
        this.containerMimeType = str;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void assertTracksCreated() {
        this.output.getClass();
        Util.castNonNull(this.sampleReader);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void endNalUnit(long j, int i, int i2, long j2) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.endNalUnit(i2);
            this.pps.endNalUnit(i2);
            boolean z = this.hasOutputFormat;
            NalUnitTargetBuffer nalUnitTargetBuffer = this.sps;
            if (z) {
                if (nalUnitTargetBuffer.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.sps;
                    NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer2.nalData, 3, nalUnitTargetBuffer2.nalLength);
                    this.seiReader.setReorderingQueueSize(parseSpsNalUnit.maxNumReorderFrames);
                    this.sampleReader.putSps(parseSpsNalUnit);
                    this.sps.reset();
                } else if (this.pps.isCompleted()) {
                    NalUnitTargetBuffer nalUnitTargetBuffer3 = this.pps;
                    this.sampleReader.putPps(NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer3.nalData, 3, nalUnitTargetBuffer3.nalLength));
                    this.pps.reset();
                }
            } else if (nalUnitTargetBuffer.isCompleted() && this.pps.isCompleted()) {
                ArrayList arrayList = new ArrayList();
                NalUnitTargetBuffer nalUnitTargetBuffer4 = this.sps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer4.nalData, nalUnitTargetBuffer4.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer5 = this.pps;
                arrayList.add(Arrays.copyOf(nalUnitTargetBuffer5.nalData, nalUnitTargetBuffer5.nalLength));
                NalUnitTargetBuffer nalUnitTargetBuffer6 = this.sps;
                NalUnitUtil.SpsData parseSpsNalUnit2 = NalUnitUtil.parseSpsNalUnit(nalUnitTargetBuffer6.nalData, 3, nalUnitTargetBuffer6.nalLength);
                NalUnitTargetBuffer nalUnitTargetBuffer7 = this.pps;
                NalUnitUtil.PpsData parsePpsNalUnit = NalUnitUtil.parsePpsNalUnit(nalUnitTargetBuffer7.nalData, 3, nalUnitTargetBuffer7.nalLength);
                this.output.format(new Format.Builder().setId(this.formatId).setContainerMimeType(this.containerMimeType).setSampleMimeType(MimeTypes.VIDEO_H264).setCodecs(CodecSpecificDataUtil.buildAvcCodecString(parseSpsNalUnit2.profileIdc, parseSpsNalUnit2.constraintsFlagsAndReservedZero2Bits, parseSpsNalUnit2.levelIdc)).setWidth(parseSpsNalUnit2.width).setHeight(parseSpsNalUnit2.height).setColorInfo(new ColorInfo.Builder().setColorSpace(parseSpsNalUnit2.colorSpace).setColorRange(parseSpsNalUnit2.colorRange).setColorTransfer(parseSpsNalUnit2.colorTransfer).setLumaBitdepth(parseSpsNalUnit2.bitDepthLumaMinus8 + 8).setChromaBitdepth(parseSpsNalUnit2.bitDepthChromaMinus8 + 8).build()).setPixelWidthHeightRatio(parseSpsNalUnit2.pixelWidthHeightRatio).setInitializationData(arrayList).setMaxNumReorderSamples(parseSpsNalUnit2.maxNumReorderFrames).build());
                this.hasOutputFormat = true;
                this.seiReader.setReorderingQueueSize(parseSpsNalUnit2.maxNumReorderFrames);
                this.sampleReader.putSps(parseSpsNalUnit2);
                this.sampleReader.putPps(parsePpsNalUnit);
                this.sps.reset();
                this.pps.reset();
            }
        }
        if (this.sei.endNalUnit(i2)) {
            NalUnitTargetBuffer nalUnitTargetBuffer8 = this.sei;
            this.seiWrapper.reset(this.sei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer8.nalData, nalUnitTargetBuffer8.nalLength));
            this.seiWrapper.setPosition(4);
            this.seiReader.consume(j2, this.seiWrapper);
        }
        if (this.sampleReader.endNalUnit(j, i, this.hasOutputFormat)) {
            this.randomAccessIndicator = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void nalUnitData(byte[] bArr, int i, int i2) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.appendToNalUnit(bArr, i, i2);
            this.pps.appendToNalUnit(bArr, i, i2);
        }
        this.sei.appendToNalUnit(bArr, i, i2);
        this.sampleReader.appendToNalUnit(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    private void startNalUnit(long j, int i, long j2) {
        if (!this.hasOutputFormat || this.sampleReader.needsSpsPps()) {
            this.sps.startNalUnit(i);
            this.pps.startNalUnit(i);
        }
        this.sei.startNalUnit(i);
        this.sampleReader.startNalUnit(j, i, j2, this.randomAccessIndicator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i;
        assertTracksCreated();
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(data, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                nalUnitData(data, position, limit);
                return;
            }
            int nalUnitType = NalUnitUtil.getNalUnitType(data, findNalUnit);
            if (findNalUnit <= 0 || data[findNalUnit - 1] != 0) {
                i = 3;
            } else {
                findNalUnit--;
                i = 4;
            }
            int i2 = findNalUnit;
            int i3 = i;
            int i4 = i2 - position;
            if (i4 > 0) {
                nalUnitData(data, position, i2);
            }
            int i5 = limit - i2;
            long j = this.totalBytesWritten - i5;
            endNalUnit(j, i5, i4 < 0 ? -i4 : 0, this.pesTimeUs);
            startNalUnit(j, nalUnitType, this.pesTimeUs);
            position = i2 + i3;
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = track;
        this.sampleReader = new SampleReader(track, this.allowNonIdrKeyframes, this.detectAccessUnits);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void endOfInputReached() {
        assertTracksCreated();
        this.seiReader.flush();
        endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
        startNalUnit(this.totalBytesWritten, 9, this.pesTimeUs);
        endNalUnit(this.totalBytesWritten, 0, 0, this.pesTimeUs);
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.pesTimeUs = j;
        this.randomAccessIndicator |= (i & 2) != 0;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        this.totalBytesWritten = 0L;
        this.randomAccessIndicator = false;
        this.pesTimeUs = C.TIME_UNSET;
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.sps.reset();
        this.pps.reset();
        this.sei.reset();
        this.seiReader.clear();
        SampleReader sampleReader = this.sampleReader;
        if (sampleReader != null) {
            sampleReader.reset();
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }
}

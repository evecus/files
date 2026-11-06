package androidx.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.CeaUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexMerger;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackAwareSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.emsg.EventMessageEncoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import androidx.media3.extractor.ts.PsExtractor;
import defpackage.am1;
import defpackage.ay1;
import defpackage.cc1;
import defpackage.dy1;
import defpackage.fy1;
import defpackage.hf1;
import defpackage.r7;
import defpackage.sp0;
import defpackage.sr;
import defpackage.x24;
import defpackage.zl1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http.HttpStatusCodesKt;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class FragmentedMp4Extractor implements Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_DISABLE_ARTWORK_METADATA = 1024;
    public static final int FLAG_DISABLE_HAGC_METADATA = 2048;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 32;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_MERGE_FRAGMENTED_SIDX = 256;
    public static final int FLAG_READ_MFRA_FOR_SEEK_MAP = 512;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 64;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES_H265 = 128;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int MFRO_FIXED_BOX_SIZE = 16;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_MFRA = 6;
    private static final int STATE_READING_MFRO = 5;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final ChunkIndexMerger chunkIndexMerger;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private boolean isSampleDependedOn;
    private dy1 lastSniffFailures;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private final ParsableByteArray nalUnitWithoutHeaderBuffer;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private final ReorderingBufferQueue reorderingBufferQueue;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long seekPositionBeforeMfraProcessing;
    private long seekPositionBeforeSidxProcessing;
    private long segmentIndexEarliestPresentationTimeUs;
    private final Track sideloadedTrack;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;
    private boolean upfrontSidxScanComplete;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new zl1(0);
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class MetadataSampleInfo {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public MetadataSampleInfo(long j, boolean z, int i) {
            this.sampleTimeUs = j;
            this.sampleTimeIsRelative = z;
            this.size = i;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class TrackBundle {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        private Format baseFormat;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public TrackSampleTable moovSampleTable;
        public final TrackOutput output;
        private Format pendingFormat;
        public final TrackFragment fragment = new TrackFragment();
        public final ParsableByteArray scratch = new ParsableByteArray();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues, Format format) {
            this.output = trackOutput;
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            this.baseFormat = format;
            if (DtsUtil.isDtsBaseAudioMimeType(format.sampleMimeType)) {
                this.pendingFormat = format;
            }
            reset(trackSampleTable, defaultSampleValues);
        }

        public int getCurrentSampleFlags() {
            int i = !this.currentlyInFragment ? this.moovSampleTable.flags[this.currentSampleIndex] : this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            return getEncryptionBoxIfEncrypted() != null ? 1073741824 | i : i;
        }

        public long getCurrentSampleOffset() {
            return !this.currentlyInFragment ? this.moovSampleTable.offsets[this.currentSampleIndex] : this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.currentlyInFragment ? this.moovSampleTable.timestampsUs[this.currentSampleIndex] : this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public int getCurrentSampleSize() {
            return !this.currentlyInFragment ? this.moovSampleTable.sizes[this.currentSampleIndex] : this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (!this.currentlyInFragment) {
                return null;
            }
            int i = ((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
            TrackEncryptionBox trackEncryptionBox = this.fragment.trackEncryptionBox;
            if (trackEncryptionBox == null) {
                trackEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i);
            }
            if (trackEncryptionBox == null || !trackEncryptionBox.isEncrypted) {
                return null;
            }
            return trackEncryptionBox;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i;
            int[] iArr = this.fragment.trunLength;
            int i2 = this.currentTrackRunIndex;
            if (i != iArr[i2]) {
                return true;
            }
            this.currentTrackRunIndex = i2 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData(int i, int i2) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int i3 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i3 != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                i3 = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean sampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            boolean z = sampleHasSubsampleEncryptionTable || i2 != 0;
            this.encryptionSignalByte.getData()[0] = (byte) ((z ? 128 : 0) | i3);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, i3, 1);
            if (!z) {
                return i3 + 1;
            }
            if (!sampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data = this.scratch.getData();
                data[0] = 0;
                data[1] = 1;
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                data[4] = (byte) ((i >> 24) & 255);
                data[5] = (byte) ((i >> 16) & 255);
                data[6] = (byte) ((i >> 8) & 255);
                data[7] = (byte) (i & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return i3 + 9;
            }
            ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
            int readUnsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i4 = (readUnsignedShort * 6) + 2;
            if (i2 != 0) {
                this.scratch.reset(i4);
                byte[] data2 = this.scratch.getData();
                parsableByteArray3.readBytes(data2, 0, i4);
                int i5 = (((data2[2] & 255) << 8) | (data2[3] & 255)) + i2;
                data2[2] = (byte) ((i5 >> 8) & 255);
                data2[3] = (byte) (i5 & 255);
                parsableByteArray3 = this.scratch;
            }
            this.output.sampleData(parsableByteArray3, i4, 1);
            return i3 + 1 + i4;
        }

        public void reset(TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.moovSampleTable = trackSampleTable;
            this.defaultSampleValues = defaultSampleValues;
            if (this.pendingFormat == null) {
                this.output.format(this.baseFormat);
            }
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j) {
            int i = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i >= trackFragment.sampleCount || trackFragment.getSamplePresentationTimeUs(i) > j) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i]) {
                    this.firstSampleToOutputIndex = i;
                }
                i++;
            }
        }

        public void skipSampleEncryptionData() {
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            int i = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i != 0) {
                parsableByteArray.skipBytes(i);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((DefaultSampleValues) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            Format build = this.baseFormat.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build();
            if (this.pendingFormat != null) {
                this.pendingFormat = build;
            } else {
                this.output.format(build);
            }
        }
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i, TimestampAdjuster timestampAdjuster, Track track, List<Format> list, TrackOutput trackOutput) {
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = DesugarCollections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.nalUnitWithoutHeaderBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        ay1 ay1Var = dy1.J;
        this.lastSniffFailures = x24.M;
        this.durationUs = C.TIME_UNSET;
        this.pendingSeekTimeUs = C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C.TIME_UNSET;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
        this.reorderingBufferQueue = new ReorderingBufferQueue(new sr(this, (byte) 2));
        this.chunkIndexMerger = new ChunkIndexMerger();
        this.seekPositionBeforeSidxProcessing = -1L;
        this.seekPositionBeforeMfraProcessing = -1L;
    }

    private boolean canReadWithinGopSampleDependencies(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264) ? (this.flags & 64) != 0 : Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) && (this.flags & 128) != 0;
    }

    private static int checkNonNegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i, null);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i) {
        int i2 = (i & 1) != 0 ? 64 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DefaultSampleValues defaultSampleValues = sparseArray.get(i);
        defaultSampleValues.getClass();
        return defaultSampleValues;
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<Mp4Box.LeafBox> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Mp4Box.LeafBox leafBox = list.get(i);
            if (leafBox.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = leafBox.data.getData();
                UUID parseUuid = PsshAtomUtil.parseUuid(data);
                if (parseUuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(parseUuid, MimeTypes.VIDEO_MP4, data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static TrackBundle getNextTrackBundle(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            TrackBundle valueAt = sparseArray.valueAt(i);
            if ((valueAt.currentlyInFragment || valueAt.currentSampleIndex != valueAt.moovSampleTable.sampleCount) && (!valueAt.currentlyInFragment || valueAt.currentTrackRunIndex != valueAt.fragment.trunCount)) {
                long currentSampleOffset = valueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j) {
                    trackBundle = valueAt;
                    j = currentSampleOffset;
                }
            }
        }
        return trackBundle;
    }

    private void initExtraTracks() {
        int i;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i2 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i] = this.extractorOutput.track(100, 5);
            i3 = HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS;
            i++;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i2 < this.ceaTrackOutputs.length) {
            TrackOutput track = this.extractorOutput.track(i3, 3);
            track.format(this.closedCaptionFormats.get(i2));
            this.ceaTrackOutputs[i2] = track;
            i2++;
            i3++;
        }
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(Track track) {
        fy1 fy1Var = track.editListDurations;
        return fy1Var != null && fy1Var.J == 1 && track.editListMediaTimes != null && (fy1Var.a(0) == 0 || Util.scaleLargeTimestamp(track.editListDurations.a(0), 1000000L, track.movieTimescale) + Util.scaleLargeTimestamp(track.editListMediaTimes.a(0), 1000000L, track.timescale) >= track.durationUs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j, parsableByteArray, this.ceaTrackOutputs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new FragmentedMp4Extractor(factory)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32)};
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(SubtitleParser.Factory factory) {
        return new am1(factory, (byte) 0);
    }

    private void onContainerAtomRead(Mp4Box.ContainerBox containerBox) {
        int i = containerBox.type;
        if (i == 1836019574) {
            onMoovContainerAtomRead(containerBox);
        } else if (i == 1836019558) {
            onMoofContainerAtomRead(containerBox);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerBox);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        String readNullTerminatedString;
        String readNullTerminatedString2;
        long scaleLargeTimestamp;
        long scaleLargeTimestamp2;
        long readUnsignedInt;
        long j;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        if (parseFullBoxVersion == 0) {
            readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            readNullTerminatedString.getClass();
            readNullTerminatedString2 = parsableByteArray.readNullTerminatedString();
            readNullTerminatedString2.getClass();
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            scaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, readUnsignedInt2);
            long j2 = this.segmentIndexEarliestPresentationTimeUs;
            long j3 = j2 != C.TIME_UNSET ? j2 + scaleLargeTimestamp : -9223372036854775807L;
            scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt2);
            readUnsignedInt = parsableByteArray.readUnsignedInt();
            j = j3;
        } else {
            if (parseFullBoxVersion != 1) {
                r7.L("Skipping unsupported emsg version: ", parseFullBoxVersion, TAG);
                return;
            }
            long readUnsignedInt3 = parsableByteArray.readUnsignedInt();
            j = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, readUnsignedInt3);
            long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, readUnsignedInt3);
            long readUnsignedInt4 = parsableByteArray.readUnsignedInt();
            readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            readNullTerminatedString.getClass();
            readNullTerminatedString2 = parsableByteArray.readNullTerminatedString();
            readNullTerminatedString2.getClass();
            scaleLargeTimestamp2 = scaleLargeTimestamp3;
            readUnsignedInt = readUnsignedInt4;
            scaleLargeTimestamp = -9223372036854775807L;
        }
        String str = readNullTerminatedString;
        String str2 = readNullTerminatedString2;
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str, str2, scaleLargeTimestamp2, readUnsignedInt, bArr)));
        int bytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, bytesLeft);
        }
        ArrayDeque<MetadataSampleInfo> arrayDeque = this.pendingMetadataSampleInfos;
        if (j == C.TIME_UNSET) {
            arrayDeque.addLast(new MetadataSampleInfo(scaleLargeTimestamp, true, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        if (!arrayDeque.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(j, false, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null && !timestampAdjuster.isInitialized()) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(j, false, bytesLeft));
            this.pendingMetadataSampleBytes += bytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster2 = this.timestampAdjuster;
        if (timestampAdjuster2 != null) {
            j = timestampAdjuster2.adjustSampleTimestamp(j);
        }
        long j4 = j;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j4, 1, bytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(Mp4Box.LeafBox leafBox, ExtractorInput extractorInput) {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafBox);
            return;
        }
        int i = leafBox.type;
        if (i != 1936286840) {
            if (i == 1701671783) {
                onEmsgLeafAtomRead(leafBox.data);
                return;
            }
            return;
        }
        Pair<Long, ChunkIndex> parseSidx = parseSidx(leafBox.data, extractorInput.getPosition());
        this.chunkIndexMerger.add((ChunkIndex) parseSidx.second);
        this.segmentIndexEarliestPresentationTimeUs = ((Long) parseSidx.first).longValue();
        if (!this.upfrontSidxScanComplete) {
            this.extractorOutput.seekMap(this.chunkIndexMerger.size() == 1 ? (SeekMap) parseSidx.second : this.chunkIndexMerger.merge());
            this.haveOutputSeekMap = true;
        }
        if ((this.flags & 256) == 0 || this.upfrontSidxScanComplete || this.chunkIndexMerger.size() <= 1) {
            return;
        }
        this.seekPositionBeforeSidxProcessing = extractorInput.getPosition();
    }

    private void onMfraProcessingFinished(SeekMap seekMap, PositionHolder positionHolder) {
        this.extractorOutput.seekMap(seekMap);
        this.haveOutputSeekMap = true;
        positionHolder.position = this.seekPositionBeforeMfraProcessing;
        enterReadingAtomHeaderState();
    }

    private void onMoofContainerAtomRead(Mp4Box.ContainerBox containerBox) {
        parseMoof(containerBox, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i = 0; i < size; i++) {
                this.trackBundles.valueAt(i).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.trackBundles.valueAt(i2).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C.TIME_UNSET;
        }
    }

    private void onMoovContainerAtomRead(Mp4Box.ContainerBox containerBox) {
        long j;
        boolean z;
        boolean z2;
        GaplessInfoHolder gaplessInfoHolder;
        boolean z3 = true;
        sp0.A(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerBox.leafChildren);
        Mp4Box.ContainerBox containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_mvex);
        containerBoxOfType.getClass();
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerBoxOfType.leafChildren.size();
        long j2 = C.TIME_UNSET;
        for (int i = 0; i < size; i++) {
            Mp4Box.LeafBox leafBox = containerBoxOfType.leafChildren.get(i);
            int i2 = leafBox.type;
            if (i2 == 1953654136) {
                Pair<Integer, DefaultSampleValues> parseTrex = parseTrex(leafBox.data);
                sparseArray.put(((Integer) parseTrex.first).intValue(), (DefaultSampleValues) parseTrex.second);
            } else if (i2 == 1835362404) {
                j2 = parseMehd(leafBox.data);
            }
        }
        Mp4Box.ContainerBox containerBoxOfType2 = containerBox.getContainerBoxOfType(Mp4Box.TYPE_meta);
        Metadata metadata = null;
        Metadata parseMdtaFromMeta = containerBoxOfType2 != null ? BoxParser.parseMdtaFromMeta(containerBoxOfType2) : null;
        GaplessInfoHolder gaplessInfoHolder2 = new GaplessInfoHolder();
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_udta);
        if (leafBoxOfType != null) {
            metadata = BoxParser.parseUdta(leafBoxOfType, (this.flags & 1024) != 0);
            gaplessInfoHolder2.setFromMetadata(metadata);
        }
        Metadata metadata2 = metadata;
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd);
        leafBoxOfType2.getClass();
        Metadata metadata3 = new Metadata(BoxParser.parseMvhd(leafBoxOfType2.data));
        if ((this.flags & 16) != 0) {
            j = j2;
            z = true;
        } else {
            j = j2;
            z = false;
        }
        List<TrackSampleTable> parseTraks = BoxParser.parseTraks(containerBox, gaplessInfoHolder2, j, drmInitDataFromAtoms, z, false, new cc1(this, (byte) 2), false);
        int size2 = parseTraks.size();
        if (this.trackBundles.size() != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                if (parseTraks.get(i4).track.shouldBeExposed) {
                    i3++;
                }
            }
            sp0.z(this.trackBundles.size() == i3);
            for (int i5 = 0; i5 < size2; i5++) {
                TrackSampleTable trackSampleTable = parseTraks.get(i5);
                Track track = trackSampleTable.track;
                if (track.shouldBeExposed) {
                    this.trackBundles.get(track.id).reset(trackSampleTable, getDefaultSampleValues(sparseArray, track.id));
                }
            }
            return;
        }
        String containerMimeType = MimeTypeResolver.getContainerMimeType(parseTraks);
        int i6 = 0;
        while (i6 < size2) {
            TrackSampleTable trackSampleTable2 = parseTraks.get(i6);
            Track track2 = trackSampleTable2.track;
            if (track2.shouldBeExposed) {
                TrackOutput track3 = this.extractorOutput.track(i6, track2.type);
                boolean z4 = z3;
                SparseArray<DefaultSampleValues> sparseArray2 = sparseArray;
                track3.durationUs(track2.durationUs);
                Format.Builder buildUpon = track2.format.buildUpon();
                buildUpon.setContainerMimeType(containerMimeType);
                MetadataUtil.setFormatGaplessInfo(track2.type, gaplessInfoHolder2, buildUpon);
                int i7 = track2.type;
                z2 = z4;
                Metadata metadata4 = track2.format.metadata;
                gaplessInfoHolder = gaplessInfoHolder2;
                Metadata[] metadataArr = new Metadata[2];
                metadataArr[0] = metadata2;
                metadataArr[z2 ? 1 : 0] = metadata3;
                MetadataUtil.setFormatMetadata(i7, parseMdtaFromMeta, buildUpon, metadata4, metadataArr);
                sparseArray = sparseArray2;
                this.trackBundles.put(track2.id, new TrackBundle(track3, trackSampleTable2, getDefaultSampleValues(sparseArray, track2.id), buildUpon.build()));
                this.durationUs = Math.max(this.durationUs, track2.durationUs);
            } else {
                gaplessInfoHolder = gaplessInfoHolder2;
                z2 = z3;
            }
            i6++;
            z3 = z2;
            gaplessInfoHolder2 = gaplessInfoHolder;
        }
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo removeFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= removeFirst.size;
            long j2 = removeFirst.sampleTimeUs;
            if (removeFirst.sampleTimeIsRelative) {
                j2 += j;
            }
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j2 = timestampAdjuster.adjustSampleTimestamp(j2);
            }
            long j3 = j2;
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j3, 1, removeFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z, int i, byte[] bArr) {
        int size = containerBox.containerChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i2);
            if (containerBox2.type == 1953653094) {
                parseTraf(containerBox2, sparseArray, z, i, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        parsableByteArray.setPosition(8);
        int readInt = parsableByteArray.readInt();
        if ((BoxParser.parseFullBoxFlags(readInt) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 1) {
            trackFragment.auxiliaryDataPosition += BoxParser.parseFullBoxVersion(readInt) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + readUnsignedIntToInt, null);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        int i;
        int i2 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((BoxParser.parseFullBoxFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt > trackFragment.sampleCount) {
            StringBuilder C = hf1.C("Saiz sample count ", readUnsignedIntToInt, " is greater than fragment sample count");
            C.append(trackFragment.sampleCount);
            throw ParserException.createForMalformedContainer(C.toString(), null);
        }
        if (readUnsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i = 0;
            for (int i3 = 0; i3 < readUnsignedIntToInt; i3++) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                i += readUnsignedByte2;
                zArr[i3] = readUnsignedByte2 > i2;
            }
        } else {
            i = readUnsignedByte * readUnsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, readUnsignedByte > i2);
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, readUnsignedIntToInt, trackFragment.sampleCount, false);
        if (i > 0) {
            trackFragment.initEncryptionData(i);
        }
    }

    private static void parseSampleGroups(Mp4Box.ContainerBox containerBox, String str, TrackFragment trackFragment) {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i = 0; i < containerBox.leafChildren.size(); i++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i);
            ParsableByteArray parsableByteArray3 = leafBox.data;
            int i2 = leafBox.type;
            if (i2 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i2 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (parseFullBoxVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int parseFullBoxVersion2 = BoxParser.parseFullBoxVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        long readUnsignedInt = parseFullBoxVersion2 >= 1 ? parsableByteArray2.readUnsignedInt() : 0L;
        if (parseFullBoxVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        if (parseFullBoxVersion2 >= 1 && readUnsignedInt == 0) {
            parsableByteArray2.skipBytes(4);
        }
        parsableByteArray2.skipBytes(1);
        int readUnsignedByte = parsableByteArray2.readUnsignedByte();
        int i3 = (readUnsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i4 = readUnsignedByte & 15;
        boolean z = parsableByteArray2.readUnsignedByte() == 1;
        if (z) {
            int readUnsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (readUnsignedByte2 == 0) {
                int readUnsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[readUnsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, readUnsignedByte3);
            }
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(z, str, readUnsignedByte2, bArr2, i3, i4, bArr);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) {
        parsableByteArray.setPosition(i + 8);
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        if ((parseFullBoxFlags & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (parseFullBoxFlags & 2) != 0;
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (readUnsignedIntToInt == 0) {
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, trackFragment.sampleCount, false);
            return;
        }
        if (readUnsignedIntToInt != trackFragment.sampleCount) {
            StringBuilder C = hf1.C("Senc sample count ", readUnsignedIntToInt, " is different from fragment sample count");
            C.append(trackFragment.sampleCount);
            throw ParserException.createForMalformedContainer(C.toString(), null);
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, readUnsignedIntToInt, z);
        trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
        trackFragment.fillEncryptionData(parsableByteArray);
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j) {
        long readUnsignedLongToLong;
        long readUnsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (parseFullBoxVersion == 0) {
            readUnsignedLongToLong = parsableByteArray.readUnsignedInt();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            readUnsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j2 = readUnsignedLongToLong2 + j;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedLongToLong, 1000000L, readUnsignedInt);
        parsableByteArray.skipBytes(2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[readUnsignedShort];
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        long[] jArr3 = new long[readUnsignedShort];
        long j3 = j2;
        long j4 = scaleLargeTimestamp;
        int i = 0;
        while (i < readUnsignedShort) {
            int readInt = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & readInt) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i] = readInt & Log.LOG_LEVEL_OFF;
            jArr[i] = j3;
            jArr3[i] = j4;
            readUnsignedLongToLong += readUnsignedInt2;
            long[] jArr4 = jArr3;
            j4 = Util.scaleLargeTimestamp(readUnsignedLongToLong, 1000000L, readUnsignedInt);
            jArr2[i] = j4 - jArr4[i];
            parsableByteArray.skipBytes(4);
            j3 += iArr[i];
            i++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(scaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return BoxParser.parseFullBoxVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray, boolean z) {
        parsableByteArray.setPosition(8);
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        TrackBundle valueAt = z ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (valueAt == null) {
            return null;
        }
        if ((parseFullBoxFlags & 1) != 0) {
            long readUnsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = valueAt.fragment;
            trackFragment.dataPosition = readUnsignedLongToLong;
            trackFragment.auxiliaryDataPosition = readUnsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = valueAt.defaultSampleValues;
        valueAt.fragment.header = new DefaultSampleValues((parseFullBoxFlags & 2) != 0 ? parsableByteArray.readInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (parseFullBoxFlags & 8) != 0 ? parsableByteArray.readInt() : defaultSampleValues.duration, (parseFullBoxFlags & 16) != 0 ? parsableByteArray.readInt() : defaultSampleValues.size, (parseFullBoxFlags & 32) != 0 ? parsableByteArray.readInt() : defaultSampleValues.flags);
        return valueAt;
    }

    private static void parseTraf(Mp4Box.ContainerBox containerBox, SparseArray<TrackBundle> sparseArray, boolean z, int i, byte[] bArr) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfhd);
        leafBoxOfType.getClass();
        TrackBundle parseTfhd = parseTfhd(leafBoxOfType.data, sparseArray, z);
        if (parseTfhd == null) {
            return;
        }
        TrackFragment trackFragment = parseTfhd.fragment;
        long j = trackFragment.nextFragmentDecodeTime;
        boolean z2 = trackFragment.nextFragmentDecodeTimeIncludesMoov;
        parseTfhd.resetFragmentInfo();
        parseTfhd.currentlyInFragment = true;
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_tfdt);
        if (leafBoxOfType2 == null || (i & 2) != 0) {
            trackFragment.nextFragmentDecodeTime = j;
            trackFragment.nextFragmentDecodeTimeIncludesMoov = z2;
        } else {
            trackFragment.nextFragmentDecodeTime = parseTfdt(leafBoxOfType2.data);
            trackFragment.nextFragmentDecodeTimeIncludesMoov = true;
        }
        parseTruns(containerBox, parseTfhd, i);
        Track track = parseTfhd.moovSampleTable.track;
        DefaultSampleValues defaultSampleValues = trackFragment.header;
        defaultSampleValues.getClass();
        TrackEncryptionBox sampleDescriptionEncryptionBox = track.getSampleDescriptionEncryptionBox(defaultSampleValues.sampleDescriptionIndex);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saiz);
        if (leafBoxOfType3 != null) {
            sampleDescriptionEncryptionBox.getClass();
            parseSaiz(sampleDescriptionEncryptionBox, leafBoxOfType3.data, trackFragment);
        }
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_saio);
        if (leafBoxOfType4 != null) {
            parseSaio(leafBoxOfType4.data, trackFragment);
        }
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_senc);
        if (leafBoxOfType5 != null) {
            parseSenc(leafBoxOfType5.data, trackFragment);
        }
        parseSampleGroups(containerBox, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        int size = containerBox.leafChildren.size();
        for (int i2 = 0; i2 < size; i2++) {
            Mp4Box.LeafBox leafBox = containerBox.leafChildren.get(i2);
            if (leafBox.type == 1970628964) {
                parseUuid(leafBox.data, trackFragment, bArr);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(TrackBundle trackBundle, int i, int i2, ParsableByteArray parsableByteArray, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        parsableByteArray.setPosition(8);
        int parseFullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        Track track = trackBundle.moovSampleTable.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = (DefaultSampleValues) Util.castNonNull(trackFragment.header);
        trackFragment.trunLength[i] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j = trackFragment.dataPosition;
        jArr[i] = j;
        if ((parseFullBoxFlags & 1) != 0) {
            jArr[i] = j + parsableByteArray.readInt();
        }
        boolean z2 = (parseFullBoxFlags & 4) != 0;
        int i11 = defaultSampleValues.flags;
        if (z2) {
            i11 = parsableByteArray.readInt();
        }
        boolean z3 = (parseFullBoxFlags & 256) != 0;
        boolean z4 = (parseFullBoxFlags & 512) != 0;
        boolean z5 = (parseFullBoxFlags & 1024) != 0;
        boolean z6 = (parseFullBoxFlags & 2048) != 0;
        long a = isEdtsListDurationForEntireMediaTimeline(track) ? ((fy1) Util.castNonNull(track.editListMediaTimes)).a(0) : 0L;
        int[] iArr = trackFragment.sampleSizeTable;
        long[] jArr2 = trackFragment.samplePresentationTimesUs;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        boolean z7 = z6;
        boolean z8 = track.type == 2 && (i2 & 1) != 0;
        int i12 = i3 + trackFragment.trunLength[i];
        boolean z9 = z2;
        long j2 = track.timescale;
        long j3 = trackFragment.nextFragmentDecodeTime;
        int i13 = i3;
        while (i13 < i12) {
            if (z3) {
                i4 = parsableByteArray.readInt();
                z = z8;
            } else {
                z = z8;
                i4 = defaultSampleValues.duration;
            }
            int checkNonNegative = checkNonNegative(i4);
            if (z4) {
                i6 = parsableByteArray.readInt();
                i5 = i12;
            } else {
                i5 = i12;
                i6 = defaultSampleValues.size;
            }
            int checkNonNegative2 = checkNonNegative(i6);
            if (z5) {
                i7 = checkNonNegative2;
                i8 = parsableByteArray.readInt();
            } else if (i13 == 0 && z9) {
                i7 = checkNonNegative2;
                i8 = i11;
            } else {
                i7 = checkNonNegative2;
                i8 = defaultSampleValues.flags;
            }
            if (z7) {
                i9 = i8;
                i10 = parsableByteArray.readInt();
            } else {
                i9 = i8;
                i10 = 0;
            }
            int i14 = i13;
            long scaleLargeTimestamp = Util.scaleLargeTimestamp((i10 + j3) - a, 1000000L, j2);
            jArr2[i14] = scaleLargeTimestamp;
            if (!trackFragment.nextFragmentDecodeTimeIncludesMoov) {
                jArr2[i14] = scaleLargeTimestamp + trackBundle.moovSampleTable.durationUs;
            }
            iArr[i14] = i7;
            zArr[i14] = ((i9 >> 16) & 1) == 0 && (!z || i14 == 0);
            j3 += checkNonNegative;
            i13 = i14 + 1;
            i12 = i5;
            z8 = z;
        }
        int i15 = i12;
        trackFragment.nextFragmentDecodeTime = j3;
        return i15;
    }

    private static void parseTruns(Mp4Box.ContainerBox containerBox, TrackBundle trackBundle, int i) {
        List<Mp4Box.LeafBox> list = containerBox.leafChildren;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Mp4Box.LeafBox leafBox = list.get(i4);
            if (leafBox.type == 1953658222) {
                ParsableByteArray parsableByteArray = leafBox.data;
                parsableByteArray.setPosition(12);
                int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (readUnsignedIntToInt > 0) {
                    i3 += readUnsignedIntToInt;
                    i2++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Mp4Box.LeafBox leafBox2 = list.get(i7);
            if (leafBox2.type == 1953658222) {
                i6 = parseTrun(trackBundle, i5, i, leafBox2.data, i6);
                i5++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private void processAtomEnded(long j) {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j = this.atomSize;
        if (j == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        long j2 = this.atomSize;
        int i = this.atomHeaderBytesRead;
        if (j2 < i) {
            if (this.atomType != 1718773093 || i != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
            }
            j2 = i;
            this.atomSize = j2;
        }
        if (this.seekPositionBeforeSidxProcessing != -1) {
            if (this.atomType == 1936286840) {
                this.scratch.reset((int) j2);
                System.arraycopy(this.atomHeader.getData(), 0, this.scratch.getData(), 0, 8);
                extractorInput.readFully(this.scratch.getData(), 8, (int) (this.atomSize - this.atomHeaderBytesRead));
                this.chunkIndexMerger.add((ChunkIndex) parseSidx(new Mp4Box.LeafBox(Mp4Box.TYPE_sidx, this.scratch).data, extractorInput.getPeekPosition()).second);
            } else {
                extractorInput.skipFully((int) (j2 - i), true);
            }
            enterReadingAtomHeaderState();
            return true;
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        int i2 = this.atomType;
        if ((i2 == 1836019558 || i2 == 1835295092) && !this.haveOutputSeekMap) {
            if (extractorInput.getLength() != -1 && this.seekPositionBeforeMfraProcessing == -1 && (this.flags & 512) != 0) {
                this.seekPositionBeforeMfraProcessing = position;
                positionHolder.position = extractorInput.getLength() - 16;
                this.parserState = 5;
                return true;
            }
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i3 = 0; i3 < size; i3++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i3).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i4 = this.atomType;
        if (i4 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i4)) {
            long position2 = extractorInput.getPosition();
            long j3 = this.atomSize;
            long j4 = (position2 + j3) - 8;
            if (j3 != this.atomHeaderBytesRead && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, j4));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j4);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) {
        int i = (int) (this.atomSize - this.atomHeaderBytesRead);
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i);
            onLeafAtomRead(new Mp4Box.LeafBox(this.atomType, parsableByteArray), extractorInput);
        } else {
            extractorInput.skipFully(i);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) {
        int size = this.trackBundles.size();
        long j = Long.MAX_VALUE;
        TrackBundle trackBundle = null;
        for (int i = 0; i < size; i++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j2 = trackFragment.auxiliaryDataPosition;
                if (j2 < j) {
                    trackBundle = this.trackBundles.valueAt(i);
                    j = j2;
                }
            }
        }
        if (trackBundle == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        trackBundle.fragment.fillEncryptionData(extractorInput);
    }

    private void readMfra(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i;
        long j;
        long j2;
        long j3;
        long length = extractorInput.getLength() - extractorInput.getPosition();
        int i2 = 8;
        this.scratch.reset(8);
        int i3 = 1;
        if (!extractorInput.peekFully(this.scratch.getData(), 0, 8, true)) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        this.scratch.setPosition(0);
        int readInt = this.scratch.readInt();
        if (this.scratch.readInt() != 1835430497) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        int i4 = (int) length;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i4);
        extractorInput.readFully(parsableByteArray.getData(), 0, i4);
        parsableByteArray.setPosition(readInt == 1 ? 16 : 8);
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        while (parsableByteArray.bytesLeft() >= i2) {
            int position = parsableByteArray.getPosition();
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt2 = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                if (parsableByteArray.bytesLeft() < i2) {
                    break;
                } else {
                    readUnsignedInt = parsableByteArray.readLong();
                }
            } else if (readUnsignedInt == 0) {
                readUnsignedInt = parsableByteArray.limit() - position;
            }
            if (readUnsignedInt < (readUnsignedInt == 1 ? 16 : i2)) {
                break;
            }
            long j4 = position;
            if (readUnsignedInt > parsableByteArray.limit() - j4) {
                break;
            }
            if (readInt2 == 1952871009) {
                if (readUnsignedInt < r13 + 16) {
                    parsableByteArray.setPosition((int) (j4 + readUnsignedInt));
                } else {
                    int parseFullBoxVersion = BoxParser.parseFullBoxVersion(parsableByteArray.readInt());
                    int readInt3 = parsableByteArray.readInt();
                    TrackBundle trackBundle = this.trackBundles.get(readInt3);
                    if (trackBundle == null) {
                        parsableByteArray.setPosition((int) (j4 + readUnsignedInt));
                    } else {
                        long j5 = trackBundle.moovSampleTable.track.timescale;
                        int readInt4 = parsableByteArray.readInt();
                        int i5 = (readInt4 >> 4) & 3;
                        int i6 = (readInt4 >> 2) & 3;
                        int i7 = readInt4 & 3;
                        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                        long j6 = parseFullBoxVersion == i3 ? 16L : 8L;
                        int i8 = i3;
                        int i9 = i5 + 1;
                        j = readUnsignedInt;
                        int i10 = i6 + 1;
                        j2 = j4;
                        int i11 = i7 + 1;
                        if ((j6 + i9 + i10 + i11) * readUnsignedInt2 > parsableByteArray.bytesLeft()) {
                            parsableByteArray.setPosition((int) (j2 + j));
                            i3 = i8;
                        } else {
                            int i12 = (int) readUnsignedInt2;
                            long[] jArr = new long[i12];
                            long[] jArr2 = new long[i12];
                            int i13 = 0;
                            while (i13 < i12) {
                                int i14 = i8;
                                long readUnsignedLongToLong = parseFullBoxVersion == i14 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
                                long readUnsignedLongToLong2 = parseFullBoxVersion == i14 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
                                parsableByteArray.skipBytes(i9 + i10 + i11);
                                if (j5 != C.TIME_UNSET) {
                                    j3 = j5;
                                    readUnsignedLongToLong = Util.scaleLargeTimestamp(readUnsignedLongToLong, 1000000L, j3);
                                } else {
                                    j3 = j5;
                                }
                                jArr[i13] = readUnsignedLongToLong;
                                jArr2[i13] = readUnsignedLongToLong2;
                                i13++;
                                j5 = j3;
                                i8 = 1;
                            }
                            sparseArray.put(readInt3, jArr);
                            sparseArray2.put(readInt3, jArr2);
                        }
                    }
                }
                i2 = 8;
            } else {
                j = readUnsignedInt;
                j2 = j4;
            }
            parsableByteArray.setPosition((int) (j2 + j));
            i2 = 8;
            i3 = 1;
        }
        if (sparseArray.size() == 0) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            TrackBundle trackBundle2 = this.trackBundles.get(keyAt);
            if (trackBundle2 != null) {
                int i18 = trackBundle2.moovSampleTable.track.type;
                if (i15 == -1 && i18 == 2) {
                    i15 = keyAt;
                } else if (i16 == -1) {
                    if (i18 == 1) {
                        i16 = keyAt;
                    }
                }
            }
        }
        if (i15 == -1) {
            if (i16 != -1) {
                i = i16;
                onMfraProcessingFinished(new MfraSeekMap(sparseArray, sparseArray2, this.durationUs, this.seekPositionBeforeMfraProcessing, i), positionHolder);
            }
            i15 = sparseArray.keyAt(0);
        }
        i = i15;
        onMfraProcessingFinished(new MfraSeekMap(sparseArray, sparseArray2, this.durationUs, this.seekPositionBeforeMfraProcessing, i), positionHolder);
    }

    private void readMfro(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.scratch.reset(16);
        if (!extractorInput.readFully(this.scratch.getData(), 0, 16, true)) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        this.scratch.setPosition(0);
        int readInt = this.scratch.readInt();
        int readInt2 = this.scratch.readInt();
        if (readInt != 16 || readInt2 != 1835430511) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
            return;
        }
        this.scratch.skipBytes(4);
        long readUnsignedInt = this.scratch.readUnsignedInt();
        long length = extractorInput.getLength() - readUnsignedInt;
        if (readUnsignedInt <= 0 || readUnsignedInt > 2147483647L || length < 0 || length < this.seekPositionBeforeMfraProcessing) {
            onMfraProcessingFinished(new SeekMap.Unseekable(this.durationUs, this.seekPositionBeforeMfraProcessing), positionHolder);
        } else {
            positionHolder.position = length;
            this.parserState = 6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x010c, code lost:
    
        if ((r5.nalUnitLengthFieldLength + r14) <= (r16.sampleSize - r16.sampleBytesWritten)) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readSample(androidx.media3.extractor.ExtractorInput r17) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.readSample(androidx.media3.extractor.ExtractorInput):boolean");
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227 || i == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = (this.flags & 32) == 0 ? new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory) : extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            Format.Builder buildUpon = track.format.buildUpon();
            buildUpon.setContainerMimeType(MimeTypeResolver.getContainerMimeType(this.sideloadedTrack.format));
            this.trackBundles.put(0, new TrackBundle(this.extractorOutput.track(0, this.sideloadedTrack.type), new TrackSampleTable(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0), new DefaultSampleValues(0, 0, 0, 0), buildUpon.build()));
            this.extractorOutput.endTracks();
        }
    }

    public Track modifyTrack(Track track) {
        if (track == null) {
            return null;
        }
        if ((this.flags & 2048) == 0 || !CodecSpecificDataUtil.isHagcTrack(track.format)) {
            return track;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0029, code lost:
    
        return 1;
     */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(androidx.media3.extractor.ExtractorInput r6, androidx.media3.extractor.PositionHolder r7) {
        /*
            r5 = this;
        L0:
            int r0 = r5.parserState
            r1 = 5
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L2e
            r3 = 2
            if (r0 == r3) goto L2a
            r3 = 6
            if (r0 == r1) goto L20
            if (r0 == r3) goto L18
            boolean r0 = r5.readSample(r6)
            if (r0 == 0) goto L0
            r5 = 0
            return r5
        L18:
            r5.readMfra(r6, r7)
            int r0 = r5.parserState
            if (r0 != 0) goto L0
            return r2
        L20:
            r5.readMfro(r6, r7)
            int r0 = r5.parserState
            if (r0 == r3) goto L29
            if (r0 != 0) goto L0
        L29:
            return r2
        L2a:
            r5.readEncryptionData(r6)
            goto L0
        L2e:
            r5.readAtomPayload(r6)
            goto L0
        L32:
            boolean r0 = r5.readAtomHeader(r6, r7)
            if (r0 != 0) goto L59
            long r0 = r5.seekPositionBeforeSidxProcessing
            r3 = -1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L52
            r7.position = r0
            r5.seekPositionBeforeSidxProcessing = r3
            androidx.media3.extractor.ExtractorOutput r6 = r5.extractorOutput
            androidx.media3.extractor.ChunkIndexMerger r7 = r5.chunkIndexMerger
            androidx.media3.extractor.ChunkIndex r7 = r7.merge()
            r6.seekMap(r7)
            r5.upfrontSidxScanComplete = r2
            return r2
        L52:
            androidx.media3.container.ReorderingBufferQueue r5 = r5.reorderingBufferQueue
            r5.flush()
            r5 = -1
            return r5
        L59:
            int r0 = r5.parserState
            if (r0 != r1) goto L0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.read(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        int size = this.trackBundles.size();
        for (int i = 0; i < size; i++) {
            this.trackBundles.valueAt(i).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.reorderingBufferQueue.clear();
        this.pendingSeekTimeUs = j2;
        this.containerAtoms.clear();
        this.seekPositionBeforeMfraProcessing = -1L;
        enterReadingAtomHeaderState();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        x24 x24Var;
        SniffFailure sniffFragmented = Sniffer.sniffFragmented(extractorInput);
        if (sniffFragmented != null) {
            x24Var = dy1.t(sniffFragmented);
        } else {
            ay1 ay1Var = dy1.J;
            x24Var = x24.M;
        }
        this.lastSniffFailures = x24Var;
        return sniffFragmented == null;
    }

    @Override // androidx.media3.extractor.Extractor
    public dy1 getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class MfraSeekMap implements TrackAwareSeekMap {
        private final long durationUs;
        private final long firstMediaDataPosition;
        private final int primaryTrackId;
        private final SparseArray<long[]> trackOffsets;
        private final SparseArray<long[]> trackTimesUs;

        private MfraSeekMap(SparseArray<long[]> sparseArray, SparseArray<long[]> sparseArray2, long j, long j2, int i) {
            this.trackTimesUs = sparseArray;
            this.trackOffsets = sparseArray2;
            this.durationUs = j;
            this.firstMediaDataPosition = j2;
            this.primaryTrackId = i;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public SeekMap.SeekPoints getSeekPoints(long j, int i) {
            long[] jArr = this.trackTimesUs.get(i);
            long[] jArr2 = this.trackOffsets.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = this.trackTimesUs.get(this.primaryTrackId);
                jArr2 = this.trackOffsets.get(this.primaryTrackId);
                if (jArr == null || jArr2 == null) {
                    jArr = this.trackTimesUs.valueAt(0);
                    jArr2 = this.trackOffsets.valueAt(0);
                }
            }
            if (jArr.length == 0 || j < jArr[0]) {
                return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstMediaDataPosition));
            }
            int binarySearchFloor = Util.binarySearchFloor(jArr, j, true, true);
            return new SeekMap.SeekPoints(new SeekPoint(jArr[binarySearchFloor], jArr2[binarySearchFloor]));
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public boolean isSeekable(int i) {
            return this.trackTimesUs.indexOfKey(i) >= 0;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            return getSeekPoints(j, this.primaryTrackId);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentedMp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0, null, null, x24.M, null);
        ay1 ay1Var = dy1.J;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FragmentedMp4Extractor(int r8) {
        /*
            r7 = this;
            androidx.media3.extractor.text.SubtitleParser$Factory r1 = androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED
            r2 = r8 | 32
            ay1 r8 = defpackage.dy1.J
            x24 r5 = defpackage.x24.M
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.<init>(int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i) {
        this(factory, i, null, null, x24.M, null);
        ay1 ay1Var = dy1.J;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FragmentedMp4Extractor(int r8, androidx.media3.common.util.TimestampAdjuster r9) {
        /*
            r7 = this;
            androidx.media3.extractor.text.SubtitleParser$Factory r1 = androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED
            r2 = r8 | 32
            ay1 r8 = defpackage.dy1.J
            x24 r5 = defpackage.x24.M
            r6 = 0
            r4 = 0
            r0 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.<init>(int, androidx.media3.common.util.TimestampAdjuster):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FragmentedMp4Extractor(int r8, androidx.media3.common.util.TimestampAdjuster r9, androidx.media3.extractor.mp4.Track r10) {
        /*
            r7 = this;
            androidx.media3.extractor.text.SubtitleParser$Factory r1 = androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED
            r2 = r8 | 32
            ay1 r8 = defpackage.dy1.J
            x24 r5 = defpackage.x24.M
            r6 = 0
            r0 = r7
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.<init>(int, androidx.media3.common.util.TimestampAdjuster, androidx.media3.extractor.mp4.Track):void");
    }

    @Deprecated
    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster, Track track, List<Format> list) {
        this(SubtitleParser.Factory.UNSUPPORTED, i | 32, timestampAdjuster, track, list, null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster, Track track, List<Format> list, TrackOutput trackOutput) {
        this(SubtitleParser.Factory.UNSUPPORTED, i | 32, timestampAdjuster, track, list, trackOutput);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FragmentedMp4Extractor() {
        /*
            r7 = this;
            androidx.media3.extractor.text.SubtitleParser$Factory r1 = androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED
            ay1 r0 = defpackage.dy1.J
            x24 r5 = defpackage.x24.M
            r6 = 0
            r2 = 32
            r3 = 0
            r4 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.FragmentedMp4Extractor.<init>():void");
    }
}

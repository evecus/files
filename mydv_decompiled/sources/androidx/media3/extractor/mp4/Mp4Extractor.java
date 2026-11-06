package androidx.media3.extractor.mp4;

import androidx.media3.common.C;
import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SniffFailure;
import androidx.media3.extractor.TrackAwareSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.Chapter;
import androidx.media3.extractor.metadata.ThumbnailMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import defpackage.am1;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.hf1;
import defpackage.js0;
import defpackage.pn1;
import defpackage.s83;
import defpackage.sp0;
import defpackage.x24;
import defpackage.zl1;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Mp4Extractor implements Extractor {

    @Deprecated
    public static final ExtractorsFactory FACTORY = new zl1(26);
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_DISABLE_ARTWORK_METADATA = 512;
    public static final int FLAG_DISABLE_HAGC_METADATA = 1024;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_OMIT_TRACK_SAMPLE_TABLE = 256;
    public static final int FLAG_READ_AUXILIARY_TRACKS = 64;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES = 32;
    public static final int FLAG_READ_WITHIN_GOP_SAMPLE_DEPENDENCIES_H265 = 128;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL = 10000000;
    private static final int MAX_SYNC_SAMPLES_TO_SCAN_FOR_THUMBNAIL = 20;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_QUICKTIME_CHAPTERS = 4;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private long axteAtomOffset;
    private int chapterSampleIndex;
    private final List<TrackSampleTable> chapterSampleTables;
    private int chapterTrackIndex;
    private final ArrayDeque<Mp4Box.ContainerBox> containerAtoms;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private final int flags;
    private boolean isSampleDependedOn;
    private dy1 lastSniffFailures;
    private boolean moovAtomProcessed;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private final boolean omitTrackSampleTable;
    private int parserState;
    private final List<Chapter> quickTimeChapters;
    private boolean readingAuxiliaryTracks;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private long sampleOffsetForAuxiliaryTracks;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private boolean seekToAxteAtom;
    private boolean seenFtypAtom;
    private final SefReader sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private final SubtitleParser.Factory subtitleParserFactory;
    private Mp4Track[] tracks;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Mp4Track {
        private final boolean isItutT35;
        private final boolean isVideo;
        private Format pendingFormat;
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
            this.isVideo = track.type == 2;
            this.isItutT35 = Objects.equals(track.format.sampleMimeType, MimeTypes.APPLICATION_ITUT_T35);
            this.trueHdSampleRechunker = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType) ? new TrueHdSampleRechunker() : null;
        }
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i) {
        this.subtitleParserFactory = factory;
        this.flags = i;
        this.omitTrackSampleTable = (i & 256) != 0;
        ay1 ay1Var = dy1.J;
        this.lastSniffFailures = x24.M;
        this.parserState = (i & 4) != 0 ? 3 : 0;
        this.sefReader = new SefReader();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(6);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new Mp4Track[0];
        this.chapterSampleTables = new ArrayList();
        this.quickTimeChapters = new ArrayList();
    }

    private static int brandToFileType(int i) {
        return i != 1903435808 ? 0 : 1;
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length][];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i = 0; i < mp4TrackArr.length; i++) {
            jArr[i] = new long[mp4TrackArr[i].sampleTable.sampleCount];
            jArr2[i] = mp4TrackArr[i].sampleTable.timestampsUs[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < mp4TrackArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < mp4TrackArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            TrackSampleTable trackSampleTable = mp4TrackArr[i3].sampleTable;
            j += trackSampleTable.sizes[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = trackSampleTable.timestampsUs[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    private boolean canReadWithinGopSampleDependencies(Format format) {
        return Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264) ? (this.flags & 32) != 0 : Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) ? (this.flags & 128) != 0 : Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_APV);
    }

    public static int codecsToParseWithinGopSampleDependenciesAsFlags(int i) {
        int i2 = (i & 1) != 0 ? 32 : 0;
        return (i & 2) != 0 ? i2 | 128 : i2;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static long findBestThumbnailPresentationTimeUs(TrackSampleTable trackSampleTable, long j) {
        int i;
        if (!MimeTypes.isVideo(trackSampleTable.track.format.sampleMimeType) || !trackSampleTable.hasSampleTableData()) {
            return C.TIME_UNSET;
        }
        int min = Math.min(trackSampleTable.hasOnlySyncSamples ? trackSampleTable.sampleCount : trackSampleTable.syncSampleIndices.length, 20);
        sp0.z(j != C.TIME_UNSET);
        long min2 = Math.min(j, MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL);
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            int i5 = trackSampleTable.hasOnlySyncSamples ? i4 : trackSampleTable.syncSampleIndices[i4];
            long j2 = trackSampleTable.timestampsUs[i5];
            if (j2 > min2) {
                break;
            }
            if (j2 >= 0 && (i = trackSampleTable.sizes[i5]) > i3) {
                i2 = i5;
                i3 = i;
            }
        }
        return i2 == -1 ? C.TIME_UNSET : trackSampleTable.timestampsUs[i2];
    }

    private List<Integer> getAuxiliaryTrackTypesForAuxiliaryTracks(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) metadata.getFirstMatchingEntry(MdtaMetadataEntry.class, new js0((byte) 6));
        mdtaMetadataEntry.getClass();
        List<Integer> auxiliaryTrackTypesFromMap = mdtaMetadataEntry.getAuxiliaryTrackTypesFromMap();
        ArrayList arrayList = new ArrayList(auxiliaryTrackTypesFromMap.size());
        for (int i = 0; i < auxiliaryTrackTypesFromMap.size(); i++) {
            int intValue = auxiliaryTrackTypesFromMap.get(i).intValue();
            int i2 = 1;
            if (intValue != 0) {
                if (intValue != 1) {
                    i2 = 3;
                    if (intValue != 2) {
                        i2 = intValue != 3 ? 0 : 4;
                    }
                } else {
                    i2 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        return indexOfEarlierOrEqualSynchronizationSample == -1 ? trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j) : indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j) {
        boolean z = true;
        int i = 0;
        long j2 = Long.MAX_VALUE;
        int i2 = -1;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        long j5 = Long.MAX_VALUE;
        boolean z2 = true;
        int i3 = -1;
        int i4 = -1;
        long j6 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i];
            int i5 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i5 != trackSampleTable.sampleCount) {
                long j7 = trackSampleTable.timestampsUs[i5];
                if (mp4Track.isVideo) {
                    j2 = Math.min(j2, j7);
                } else if (mp4Track.isItutT35 && j7 < j3) {
                    j3 = j7;
                    i2 = i;
                }
                long j8 = mp4Track.sampleTable.offsets[i5];
                long[][] jArr = this.accumulatedSampleSizes;
                jArr.getClass();
                long j9 = jArr[i][i5];
                long j10 = j8 - j;
                boolean z3 = j10 < 0 || j10 >= 262144;
                if ((!z3 && z) || (z3 == z && j10 < j6)) {
                    z = z3;
                    j6 = j10;
                    i4 = i;
                    j4 = j9;
                }
                if (j9 < j5) {
                    z2 = z3;
                    i3 = i;
                    j5 = j9;
                }
            }
            i++;
        }
        return (j2 == Long.MAX_VALUE || i2 == -1 || j3 > j2) ? (j5 == Long.MAX_VALUE || !z2 || j4 < j5 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i4 : i3 : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAuxiliaryTrackTypesForAuxiliaryTracks$5(MdtaMetadataEntry mdtaMetadataEntry) {
        return mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_MAP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$maybeSetDefaultSampleOffsetForAuxiliaryTracks$4(MdtaMetadataEntry mdtaMetadataEntry) {
        return mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_INTERLEAVED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new Mp4Extractor(factory)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Track lambda$processMoovAtom$2(Track track) {
        if (track == null) {
            return null;
        }
        if ((this.flags & 1024) == 0 || !CodecSpecificDataUtil.isHagcTrack(track.format)) {
            return track;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$readQuickTimeChapters$6(Metadata.Entry entry) {
        return !(entry instanceof Chapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$shouldSeekToAxteAtom$3(MdtaMetadataEntry mdtaMetadataEntry) {
        return mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_AUXILIARY_TRACKS_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j, long j2) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j);
        return synchronizationSampleIndex == -1 ? j2 : Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j2);
    }

    private void maybeSetDefaultSampleOffsetForAuxiliaryTracks(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) metadata.getFirstMatchingEntry(MdtaMetadataEntry.class, new js0((byte) 4));
        if (mdtaMetadataEntry == null || mdtaMetadataEntry.value[0] != 0) {
            return;
        }
        this.sampleOffsetForAuxiliaryTracks = this.axteAtomOffset + 16;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        BoxParser.maybeSkipRemainingMetaBoxHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(SubtitleParser.Factory factory) {
        return new am1(factory, (byte) 2);
    }

    private void processAtomEnded(long j) {
        while (true) {
            if (this.containerAtoms.isEmpty() || this.containerAtoms.peek().endPosition != j) {
                break;
            }
            Mp4Box.ContainerBox pop = this.containerAtoms.pop();
            if (pop.type == 1836019574) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                this.moovAtomProcessed = true;
                if (!this.seekToAxteAtom && !this.omitTrackSampleTable) {
                    this.parserState = this.chapterSampleTables.isEmpty() ? 2 : 4;
                }
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        int i = this.parserState;
        if (i == 4 || i == 2) {
            return;
        }
        enterReadingAtomHeaderState();
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int brandToFileType = brandToFileType(parsableByteArray.readInt());
        if (brandToFileType != 0) {
            return brandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int brandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (brandToFileType2 != 0) {
                return brandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(Mp4Box.ContainerBox containerBox) {
        List<Integer> list;
        Metadata metadata;
        Metadata metadata2;
        char c;
        List<TrackSampleTable> list2;
        char c2;
        boolean z;
        int i;
        Metadata metadata3;
        int i2;
        Mp4Box.ContainerBox containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_meta);
        List<Integer> arrayList = new ArrayList<>();
        if (containerBoxOfType != null) {
            Metadata parseMdtaFromMeta = BoxParser.parseMdtaFromMeta(containerBoxOfType);
            if (this.readingAuxiliaryTracks) {
                parseMdtaFromMeta.getClass();
                maybeSetDefaultSampleOffsetForAuxiliaryTracks(parseMdtaFromMeta);
                arrayList = getAuxiliaryTrackTypesForAuxiliaryTracks(parseMdtaFromMeta);
            } else if (shouldSeekToAxteAtom(parseMdtaFromMeta)) {
                this.seekToAxteAtom = true;
                return;
            }
            metadata = parseMdtaFromMeta;
            list = arrayList;
        } else {
            list = arrayList;
            metadata = null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        boolean z2 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_udta);
        if (leafBoxOfType != null) {
            Metadata parseUdta = BoxParser.parseUdta(leafBoxOfType, (this.flags & 512) != 0);
            gaplessInfoHolder.setFromMetadata(parseUdta);
            metadata2 = parseUdta;
        } else {
            metadata2 = null;
        }
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd);
        leafBoxOfType2.getClass();
        Metadata metadata4 = new Metadata(BoxParser.parseMvhd(leafBoxOfType2.data));
        List<TrackSampleTable> parseTraks = BoxParser.parseTraks(containerBox, gaplessInfoHolder, C.TIME_UNSET, null, (this.flags & 1) != 0, z2, new pn1() { // from class: s23
            @Override // defpackage.pn1
            public final Object apply(Object obj) {
                Track lambda$processMoovAtom$2;
                lambda$processMoovAtom$2 = Mp4Extractor.this.lambda$processMoovAtom$2((Track) obj);
                return lambda$processMoovAtom$2;
            }
        }, this.omitTrackSampleTable);
        if (this.readingAuxiliaryTracks) {
            boolean z3 = list.size() == parseTraks.size();
            Locale locale = Locale.US;
            sp0.A(z3, hf1.v("The number of auxiliary track types from metadata (", list.size(), ") is not same as the number of auxiliary tracks (", parseTraks.size(), ")"));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<TrackSampleTable> it = parseTraks.iterator();
        while (true) {
            c = 65535;
            if (!it.hasNext()) {
                break;
            }
            TrackSampleTable next = it.next();
            int i4 = next.track.chapterTrackId;
            if (i4 != -1 && !arrayList3.contains(Integer.valueOf(i4))) {
                arrayList3.add(Integer.valueOf(next.track.chapterTrackId));
            }
        }
        this.chapterSampleTables.clear();
        for (TrackSampleTable trackSampleTable : parseTraks) {
            if (arrayList3.contains(Integer.valueOf(trackSampleTable.track.id))) {
                this.chapterSampleTables.add(trackSampleTable);
            }
        }
        String containerMimeType = MimeTypeResolver.getContainerMimeType(parseTraks);
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        long j = C.TIME_UNSET;
        while (i7 < parseTraks.size()) {
            TrackSampleTable trackSampleTable2 = parseTraks.get(i7);
            int i8 = i3;
            if (trackSampleTable2.sampleCount != 0) {
                Track track = trackSampleTable2.track;
                if (track.shouldBeExposed) {
                    int i9 = i6 + 1;
                    list2 = parseTraks;
                    Mp4Track mp4Track = new Mp4Track(track, trackSampleTable2, this.extractorOutput.track(i6, track.type));
                    long j2 = track.durationUs;
                    if (j2 == C.TIME_UNSET) {
                        j2 = trackSampleTable2.durationUs;
                    }
                    mp4Track.trackOutput.durationUs(j2);
                    long max = Math.max(j, j2);
                    boolean equals = MimeTypes.AUDIO_TRUEHD.equals(track.format.sampleMimeType);
                    int i10 = trackSampleTable2.maximumSize;
                    int i11 = equals ? i10 * 16 : i10 + 30;
                    Format.Builder buildUpon = track.format.buildUpon();
                    buildUpon.setMaxInputSize(i11);
                    if (track.type == 2) {
                        int i12 = track.format.roleFlags;
                        i = 2;
                        if ((this.flags & 8) != 0) {
                            i12 |= i5 == -1 ? 1 : 2;
                        }
                        if (this.readingAuxiliaryTracks) {
                            i12 |= 32768;
                            buildUpon.setAuxiliaryTrackType(list.get(i7).intValue());
                        }
                        buildUpon.setRoleFlags(i12);
                    } else {
                        i = 2;
                    }
                    long findBestThumbnailPresentationTimeUs = findBestThumbnailPresentationTimeUs(trackSampleTable2, j2);
                    if (findBestThumbnailPresentationTimeUs != C.TIME_UNSET) {
                        Metadata.Entry[] entryArr = new Metadata.Entry[1];
                        entryArr[i8] = new ThumbnailMetadata(findBestThumbnailPresentationTimeUs);
                        metadata3 = new Metadata(entryArr);
                    } else {
                        metadata3 = null;
                    }
                    MetadataUtil.setFormatGaplessInfo(track.type, gaplessInfoHolder, buildUpon);
                    int i13 = track.type;
                    Metadata metadata5 = track.format.metadata;
                    Metadata[] metadataArr = new Metadata[4];
                    metadataArr[i8] = this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries);
                    z = true;
                    metadataArr[1] = metadata2;
                    metadataArr[i] = metadata4;
                    metadataArr[3] = metadata3;
                    MetadataUtil.setFormatMetadata(i13, metadata, buildUpon, metadata5, metadataArr);
                    buildUpon.setContainerMimeType(containerMimeType);
                    Format build = buildUpon.build();
                    int i14 = (Objects.equals(track.format.sampleMimeType, MimeTypes.AUDIO_MPEG) || DtsUtil.isDtsBaseAudioMimeType(track.format.sampleMimeType)) ? 1 : i8;
                    if (!this.omitTrackSampleTable && track.chapterTrackId != -1) {
                        Iterator<TrackSampleTable> it2 = this.chapterSampleTables.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().track.id == track.chapterTrackId) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                    i2 = i8;
                    if (i14 == 0 && i2 == 0) {
                        mp4Track.trackOutput.format(build);
                    } else {
                        mp4Track.pendingFormat = build;
                    }
                    if (track.type == i) {
                        c2 = 65535;
                        if (i5 == -1) {
                            i5 = arrayList2.size();
                        }
                    } else {
                        c2 = 65535;
                    }
                    arrayList2.add(mp4Track);
                    i6 = i9;
                    j = max;
                    i7++;
                    c = c2;
                    i3 = i8;
                    parseTraks = list2;
                }
            }
            list2 = parseTraks;
            c2 = c;
            z = true;
            i7++;
            c = c2;
            i3 = i8;
            parseTraks = list2;
        }
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList2.toArray(new Mp4Track[i3]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = !this.omitTrackSampleTable ? calculateAccumulatedSampleSizes(mp4TrackArr) : null;
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new Mp4SeekMap(j, this.tracks, i5));
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) {
        Mp4Box.ContainerBox peek;
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
            if (length == -1 && (peek = this.containerAtoms.peek()) != null) {
                length = peek.endPosition;
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
            this.atomSize = i;
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j3 = this.atomSize;
            int i2 = this.atomHeaderBytesRead;
            long j4 = (position + j3) - i2;
            if (j3 != i2 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new Mp4Box.ContainerBox(this.atomType, j4));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j4);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            sp0.z(this.atomHeaderBytesRead == 8);
            sp0.z(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean readAtomPayload(androidx.media3.extractor.ExtractorInput r10, androidx.media3.extractor.PositionHolder r11) {
        /*
            r9 = this;
            long r0 = r9.atomSize
            int r2 = r9.atomHeaderBytesRead
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            androidx.media3.common.util.ParsableByteArray r4 = r9.atomData
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.getData()
            int r8 = r9.atomHeaderBytesRead
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.atomType
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.seenFtypAtom = r5
            int r10 = processFtypAtom(r4)
            r9.fileType = r10
            goto L5e
        L2b:
            java.util.ArrayDeque<androidx.media3.container.Mp4Box$ContainerBox> r10 = r9.containerAtoms
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque<androidx.media3.container.Mp4Box$ContainerBox> r10 = r9.containerAtoms
            java.lang.Object r10 = r10.peek()
            androidx.media3.container.Mp4Box$ContainerBox r10 = (androidx.media3.container.Mp4Box.ContainerBox) r10
            androidx.media3.container.Mp4Box$LeafBox r0 = new androidx.media3.container.Mp4Box$LeafBox
            int r1 = r9.atomType
            r0.<init>(r1, r4)
            r10.add(r0)
            goto L5e
        L46:
            boolean r4 = r9.seenFtypAtom
            if (r4 != 0) goto L53
            int r4 = r9.atomType
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.fileType = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.skipFully(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.position = r7
            r10 = r5
        L68:
            r9.processAtomEnded(r2)
            boolean r0 = r9.seekToAxteAtom
            if (r0 == 0) goto L78
            r9.readingAuxiliaryTracks = r5
            long r0 = r9.axteAtomOffset
            r11.position = r0
            r9.seekToAxteAtom = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r9 = r9.parserState
            r10 = 2
            if (r9 == r10) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.readAtomPayload(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):boolean");
    }

    private int readQuickTimeChapters(ExtractorInput extractorInput, PositionHolder positionHolder) {
        TrackSampleTable trackSampleTable = this.chapterSampleTables.get(this.chapterTrackIndex);
        int i = this.chapterSampleIndex;
        if (i < trackSampleTable.sampleCount) {
            long j = trackSampleTable.offsets[i];
            if (extractorInput.getPosition() != j) {
                positionHolder.position = j;
                return 1;
            }
            int i2 = trackSampleTable.sizes[this.chapterSampleIndex];
            this.scratch.reset(i2);
            extractorInput.readFully(this.scratch.getData(), 0, i2);
            String readString = this.scratch.readString(Math.min(this.scratch.readUnsignedShort(), this.scratch.bytesLeft()));
            long usToMs = Util.usToMs(trackSampleTable.timestampsUs[this.chapterSampleIndex]);
            int i3 = this.chapterSampleIndex + 1;
            this.quickTimeChapters.add(new Chapter.Builder().setStartTimeMs(usToMs).setEndTimeMs(i3 < trackSampleTable.sampleCount ? Util.usToMs(trackSampleTable.timestampsUs[i3]) : Util.usToMs(trackSampleTable.durationUs)).setTitle(new Label(null, readString)).build());
            this.chapterSampleIndex++;
            return 0;
        }
        for (Mp4Track mp4Track : this.tracks) {
            if (mp4Track.track.chapterTrackId == trackSampleTable.track.id) {
                Format format = mp4Track.pendingFormat;
                format.getClass();
                Metadata metadata = format.metadata;
                ArrayList arrayList = new ArrayList();
                if (metadata != null) {
                    arrayList.addAll(metadata.getMatchingEntries(Metadata.Entry.class, new js0((byte) 3)));
                }
                arrayList.addAll(this.quickTimeChapters);
                Format build = format.buildUpon().setMetadata(new Metadata(arrayList)).build();
                if (Objects.equals(build.sampleMimeType, MimeTypes.AUDIO_MPEG) || DtsUtil.isDtsBaseAudioMimeType(build.sampleMimeType)) {
                    mp4Track.pendingFormat = build;
                } else {
                    mp4Track.trackOutput.format(build);
                    mp4Track.pendingFormat = null;
                }
            }
        }
        this.chapterTrackIndex++;
        this.chapterSampleIndex = 0;
        this.quickTimeChapters.clear();
        if (this.chapterTrackIndex == this.chapterSampleTables.size()) {
            this.parserState = 2;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) {
        ?? r1;
        int i;
        long position = extractorInput.getPosition();
        int i2 = this.sampleTrackIndex;
        if (i2 == -1) {
            i2 = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = i2;
            if (i2 == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[i2];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i3 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j = trackSampleTable.offsets[i3] + this.sampleOffsetForAuxiliaryTracks;
        int i4 = trackSampleTable.sizes[i3];
        TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
        long j2 = (j - position) + this.sampleBytesRead;
        if (j2 < 0 || j2 >= 262144) {
            positionHolder.position = j;
            return 1;
        }
        if (mp4Track.track.sampleTransformation == 1) {
            j2 += 8;
            i4 -= 8;
        }
        extractorInput.skipFully((int) j2);
        if (!canReadWithinGopSampleDependencies(mp4Track.track.format)) {
            this.isSampleDependedOn = true;
        }
        if (mp4Track.track.nalUnitLengthFieldLength == 0) {
            Format format = mp4Track.pendingFormat;
            if (MimeTypes.AUDIO_AC4.equals(mp4Track.track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i4, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i4 += 7;
            } else if (format != null && Objects.equals(mp4Track.track.format.sampleMimeType, MimeTypes.AUDIO_MPEG)) {
                this.scratch.reset(4);
                extractorInput.peekFully(this.scratch.getData(), 0, 4);
                extractorInput.resetPeekPosition();
                MpegAudioUtil.Header header = new MpegAudioUtil.Header();
                TrackOutput trackOutput2 = mp4Track.trackOutput;
                if (header.setForHeaderData(this.scratch.readInt()) && !Objects.equals(format.sampleMimeType, header.mimeType)) {
                    Format.Builder buildUpon = format.buildUpon();
                    String str = header.mimeType;
                    str.getClass();
                    format = buildUpon.setSampleMimeType(str).build();
                }
                trackOutput2.format(format);
                mp4Track.pendingFormat = null;
            } else if (format != null && DtsUtil.isDtsBaseAudioMimeType(mp4Track.track.format.sampleMimeType)) {
                mp4Track.trackOutput.format(DtsUtil.updateFormatWithDtsHdInfo(extractorInput, i4, format));
                mp4Track.pendingFormat = null;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i5 = this.sampleBytesWritten;
                if (i5 >= i4) {
                    break;
                }
                int sampleData = trackOutput.sampleData((DataReader) extractorInput, i4 - i5, false);
                this.sampleBytesRead += sampleData;
                this.sampleBytesWritten += sampleData;
                this.sampleCurrentNalBytesRemaining -= sampleData;
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i6 = 4 - mp4Track.track.nalUnitLengthFieldLength;
            i4 += i6;
            while (this.sampleBytesWritten < i4) {
                int i7 = this.sampleCurrentNalBytesRemaining;
                if (i7 == 0) {
                    Track track = mp4Track.track;
                    int i8 = track.nalUnitLengthFieldLength;
                    if (this.isSampleDependedOn || NalUnitUtil.numberOfBytesInNalUnitHeader(track.format) + i8 > mp4Track.sampleTable.sizes[i3] - this.sampleBytesRead) {
                        i = 0;
                    } else {
                        i = NalUnitUtil.numberOfBytesInNalUnitHeader(mp4Track.track.format);
                        i8 = mp4Track.track.nalUnitLengthFieldLength + i;
                    }
                    extractorInput.readFully(data, i6, i8);
                    this.sampleBytesRead += i8;
                    this.nalPrefix.setPosition(0);
                    int readInt = this.nalPrefix.readInt();
                    if (readInt < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = readInt - i;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    if (i > 0) {
                        trackOutput.sampleData(this.nalPrefix, i);
                        this.sampleBytesWritten += i;
                        if (NalUnitUtil.isDependedOn(data, 4, i, mp4Track.track.format)) {
                            this.isSampleDependedOn = true;
                        }
                    }
                } else {
                    int sampleData2 = trackOutput.sampleData((DataReader) extractorInput, i7, false);
                    this.sampleBytesRead += sampleData2;
                    this.sampleBytesWritten += sampleData2;
                    this.sampleCurrentNalBytesRemaining -= sampleData2;
                }
            }
        }
        int i9 = i4;
        TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
        long j3 = trackSampleTable2.timestampsUs[i3];
        int i10 = trackSampleTable2.flags[i3];
        if (!this.isSampleDependedOn) {
            i10 |= C.BUFFER_FLAG_NOT_DEPENDED_ON;
        }
        int i11 = i10;
        if (trueHdSampleRechunker != null) {
            boolean z = false;
            trueHdSampleRechunker.sampleMetadata(trackOutput, j3, i11, i9, 0, null);
            r1 = z;
            if (i3 + 1 == mp4Track.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
                r1 = z;
            }
        } else {
            r1 = 0;
            trackOutput.sampleMetadata(j3, i11, i9, 0, null);
        }
        mp4Track.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = r1;
        this.sampleBytesWritten = r1;
        this.sampleCurrentNalBytesRemaining = r1;
        this.isSampleDependedOn = r1;
        return r1;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int read = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (read == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return read;
    }

    private static boolean shouldParseContainerAtom(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473 || i == 1635284069 || i == 1953654118;
    }

    private static boolean shouldParseLeafAtom(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124 || i == 1667785072;
    }

    private boolean shouldSeekToAxteAtom(Metadata metadata) {
        MdtaMetadataEntry mdtaMetadataEntry;
        if (metadata == null || (this.flags & 64) == 0 || (mdtaMetadataEntry = (MdtaMetadataEntry) metadata.getFirstMatchingEntry(MdtaMetadataEntry.class, new js0((byte) 5))) == null) {
            return false;
        }
        long readUnsignedLongToLong = new ParsableByteArray(mdtaMetadataEntry.value).readUnsignedLongToLong();
        if (readUnsignedLongToLong <= 0) {
            return false;
        }
        this.axteAtomOffset = readUnsignedLongToLong;
        return true;
    }

    private void updateSampleIndex(Mp4Track mp4Track, long j) {
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j);
        }
        mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    public long[] getSampleTimestampsUs(int i) {
        Mp4Track[] mp4TrackArr = this.tracks;
        return mp4TrackArr.length <= i ? new long[0] : mp4TrackArr[i].sampleTable.timestampsUs;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (this.omitTrackSampleTable && this.moovAtomProcessed) {
            return -1;
        }
        while (true) {
            int i = this.parserState;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    if (i == 4) {
                        return readQuickTimeChapters(extractorInput, positionHolder);
                    }
                    s83.r();
                    return 0;
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.isSampleDependedOn = false;
        this.moovAtomProcessed = false;
        this.chapterTrackIndex = 0;
        this.chapterSampleIndex = 0;
        this.chapterSampleTables.clear();
        this.quickTimeChapters.clear();
        if (j == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (Mp4Track mp4Track : this.tracks) {
            updateSampleIndex(mp4Track, j2);
            TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        x24 x24Var;
        SniffFailure sniffUnfragmented = Sniffer.sniffUnfragmented(extractorInput);
        if (sniffUnfragmented != null) {
            x24Var = dy1.t(sniffUnfragmented);
        } else {
            ay1 ay1Var = dy1.J;
            x24Var = x24.M;
        }
        this.lastSniffFailures = x24Var;
        return sniffUnfragmented == null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Mp4SeekMap implements TrackAwareSeekMap {
        private final long durationUs;
        private final int firstVideoTrackIndex;
        private final Mp4Track[] tracks;

        public Mp4SeekMap(long j, Mp4Track[] mp4TrackArr, int i) {
            this.durationUs = j;
            this.tracks = mp4TrackArr;
            this.firstVideoTrackIndex = i;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
        @Override // androidx.media3.extractor.TrackAwareSeekMap
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long r17, int r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r3 = r19
                androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
                int r5 = r4.length
                if (r5 != 0) goto L13
                androidx.media3.extractor.SeekMap$SeekPoints r0 = new androidx.media3.extractor.SeekMap$SeekPoints
                androidx.media3.extractor.SeekPoint r1 = androidx.media3.extractor.SeekPoint.START
                r0.<init>(r1)
                return r0
            L13:
                r5 = -1
                if (r3 == r5) goto L18
                r6 = r3
                goto L1a
            L18:
                int r6 = r0.firstVideoTrackIndex
            L1a:
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r9 = -1
                if (r6 == r5) goto L58
                r4 = r4[r6]
                androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
                int r6 = androidx.media3.extractor.mp4.Mp4Extractor.access$300(r4, r1)
                if (r6 != r5) goto L35
                androidx.media3.extractor.SeekMap$SeekPoints r0 = new androidx.media3.extractor.SeekMap$SeekPoints
                androidx.media3.extractor.SeekPoint r1 = androidx.media3.extractor.SeekPoint.START
                r0.<init>(r1)
                return r0
            L35:
                long[] r11 = r4.timestampsUs
                r12 = r11[r6]
                long[] r11 = r4.offsets
                r14 = r11[r6]
                int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r11 >= 0) goto L5e
                int r11 = r4.sampleCount
                int r11 = r11 + (-1)
                if (r6 >= r11) goto L5e
                int r1 = r4.getIndexOfLaterOrEqualSynchronizationSample(r1)
                if (r1 == r5) goto L5e
                if (r1 == r6) goto L5e
                long[] r2 = r4.timestampsUs
                r9 = r2[r1]
                long[] r2 = r4.offsets
                r1 = r2[r1]
                goto L60
            L58:
                r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = r1
            L5e:
                r1 = r9
                r9 = r7
            L60:
                if (r3 != r5) goto L80
                r3 = 0
            L63:
                androidx.media3.extractor.mp4.Mp4Extractor$Mp4Track[] r4 = r0.tracks
                int r5 = r4.length
                if (r3 >= r5) goto L80
                int r5 = r0.firstVideoTrackIndex
                if (r3 == r5) goto L7d
                r4 = r4[r3]
                androidx.media3.extractor.mp4.TrackSampleTable r4 = r4.sampleTable
                long r5 = androidx.media3.extractor.mp4.Mp4Extractor.access$400(r4, r12, r14)
                int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r11 == 0) goto L7c
                long r1 = androidx.media3.extractor.mp4.Mp4Extractor.access$400(r4, r9, r1)
            L7c:
                r14 = r5
            L7d:
                int r3 = r3 + 1
                goto L63
            L80:
                androidx.media3.extractor.SeekPoint r0 = new androidx.media3.extractor.SeekPoint
                r0.<init>(r12, r14)
                int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r3 != 0) goto L8f
                androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
                r1.<init>(r0)
                return r1
            L8f:
                androidx.media3.extractor.SeekPoint r3 = new androidx.media3.extractor.SeekPoint
                r3.<init>(r9, r1)
                androidx.media3.extractor.SeekMap$SeekPoints r1 = new androidx.media3.extractor.SeekMap$SeekPoints
                r1.<init>(r0, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.Mp4Extractor.Mp4SeekMap.getSeekPoints(long, int):androidx.media3.extractor.SeekMap$SeekPoints");
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public boolean isSeekable(int i) {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            return getSeekPoints(j, -1);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public dy1 getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    public Mp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    @Deprecated
    public Mp4Extractor(int i) {
        this(SubtitleParser.Factory.UNSUPPORTED, i);
    }

    @Deprecated
    public Mp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 16);
    }
}

package androidx.media3.extractor.mkv;

import android.util.LongSparseArray;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DataReader;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.WavUtil;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ChunkIndex;
import androidx.media3.extractor.ChunkIndexProvider;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackAwareSeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.TrueHdSampleRechunker;
import androidx.media3.extractor.metadata.Chapter;
import androidx.media3.extractor.metadata.ThumbnailMetadata;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import defpackage.am1;
import defpackage.jp0;
import defpackage.s83;
import defpackage.sp0;
import defpackage.zl1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ALAC = "A_ALAC";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SSA = "S_TEXT/SSA";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_HAGC_METADATA = 4;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 2;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CHAPTERS = 272869232;
    private static final int ID_CHAPTER_ATOM = 182;
    private static final int ID_CHAPTER_DISPLAY = 128;
    private static final int ID_CHAPTER_FLAG_HIDDEN = 152;
    private static final int ID_CHAPTER_TIME_END = 146;
    private static final int ID_CHAPTER_TIME_START = 145;
    private static final int ID_CHAPTER_TRACK = 143;
    private static final int ID_CHAPTER_TRACK_UID = 137;
    private static final int ID_CHAPTER_UID = 29636;
    private static final int ID_CHAP_LANGUAGE = 17276;
    private static final int ID_CHAP_STRING = 133;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_BITS_PER_CHANNEL = 21938;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_RELATIVE_POSITION = 240;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK = 247;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_EDITION_ENTRY = 17849;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_TRACK_UID = 29637;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int MAX_CHUNKS_TO_SCAN_FOR_THUMBNAIL = 20;
    private static final long MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL = 10000000;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private final LongSparseArray<ChapterEntry> chapters;
    private long clusterTimecodeUs;
    private long cuesContentPosition;
    private ChapterEntry currentChapter;
    private long currentCueClusterPosition;
    private long currentCueRelativePosition;
    private long currentCueTimeUs;
    private int currentCueTrackNumber;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private boolean inCuesElement;
    private boolean isWebm;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final boolean parseHagcMetadata;
    private final boolean parseSubtitlesDuringExtraction;
    private boolean pendingEndTracks;
    private final SparseArray<List<MatroskaSeekMap.CuePointData>> perTrackCues;
    private int primarySeekTrackNumber;
    private boolean readTracks;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private boolean seekForTracks;
    private long seekPositionAfterBuildingCues;
    private long seekPositionAfterReadingTracks;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private long tracksContentPosition;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new zl1(17);
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class ChapterEntry {
        public String chapLanguage;
        public String chapString;
        public String currentDisplayLanguage;
        public String currentDisplayString;
        public boolean flagHidden;
        public long trackUid;
        public long uid;
        public long timeStartNs = C.TIME_UNSET;
        public long timeEndNs = C.TIME_UNSET;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Flags {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j) {
            MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j, long j2) {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // androidx.media3.extractor.mkv.EbmlProcessor
        public void stringElement(int i, String str) {
            MatroskaExtractor.this.stringElement(i, str);
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        private boolean chaptersMetadataAdded;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public Format format;
        public boolean hasContentEncryption;
        public boolean isWebm;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        private boolean thumbnailMetadataAdded;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public long uid;
        public int width = -1;
        public int height = -1;
        public int bitsPerChannel = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public int containerColorSpace = -1;
        public int containerColorTransfer = -1;
        public int containerColorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int channelMask = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean waitingForDtsAnalysis = false;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        public void assertOutputInitialized() {
            this.output.getClass();
        }

        private static long findBestThumbnailPresentationTimeUs(List<MatroskaSeekMap.CuePointData> list, long j, long j2, long j3) {
            long j4;
            long j5;
            if (list.isEmpty()) {
                return C.TIME_UNSET;
            }
            int min = Math.min(list.size(), 20);
            double d = 0.0d;
            int i = -1;
            for (int i2 = 0; i2 < min; i2++) {
                MatroskaSeekMap.CuePointData cuePointData = list.get(i2);
                if (cuePointData.timeUs > MatroskaExtractor.MAX_DURATION_US_TO_SCAN_FOR_THUMBNAIL) {
                    break;
                }
                if (i2 < list.size() - 1) {
                    MatroskaSeekMap.CuePointData cuePointData2 = list.get(i2 + 1);
                    j5 = (cuePointData2.clusterPosition + cuePointData2.relativePosition) - (cuePointData.clusterPosition + cuePointData.relativePosition);
                    j4 = cuePointData2.timeUs - cuePointData.timeUs;
                } else {
                    long j6 = (j2 + j3) - (cuePointData.clusterPosition + cuePointData.relativePosition);
                    j4 = j - cuePointData.timeUs;
                    j5 = j6;
                }
                if (j4 > 0) {
                    double d2 = j5 / j4;
                    if (d2 > d) {
                        i = i2;
                        d = d2;
                    }
                }
            }
            return i == -1 ? C.TIME_UNSET : list.get(i).timeUs;
        }

        @EnsuresNonNull({"codecPrivate"})
        private byte[] getCodecPrivate(String str) {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            order.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            order.putShort((short) (this.maxMasteringLuminance + 0.5f));
            order.putShort((short) (this.minMasteringLuminance + 0.5f));
            order.putShort((short) this.maxContentLuminance);
            order.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeAddChaptersMetadata(LongSparseArray<ChapterEntry> longSparseArray) {
            if (this.chaptersMetadataAdded || longSparseArray.size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(longSparseArray.size());
            for (int i = 0; i < longSparseArray.size(); i++) {
                ChapterEntry valueAt = longSparseArray.valueAt(i);
                long j = valueAt.trackUid;
                if (j == 0 || j == this.uid) {
                    Chapter.Builder hidden = new Chapter.Builder().setStartTimeMs(Util.nsToMs(valueAt.timeStartNs)).setEndTimeMs(Util.nsToMs(valueAt.timeEndNs)).setHidden(valueAt.flagHidden);
                    if (valueAt.chapString != null) {
                        hidden.setTitle(new Label(valueAt.chapLanguage, valueAt.chapString));
                    }
                    arrayList.add(hidden.build());
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Format format = this.format;
            format.getClass();
            Format.Builder buildUpon = format.buildUpon();
            Metadata metadata = this.format.metadata;
            this.format = buildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries((Metadata.Entry[]) arrayList.toArray(new Chapter[0])) : new Metadata(arrayList)).build();
            this.chaptersMetadataAdded = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void maybeAddThumbnailMetadata(SparseArray<List<MatroskaSeekMap.CuePointData>> sparseArray, long j, long j2, long j3) {
            if (this.type != 2) {
                return;
            }
            List<MatroskaSeekMap.CuePointData> list = sparseArray.get(this.number);
            if (this.thumbnailMetadataAdded || list == null || list.isEmpty()) {
                return;
            }
            long findBestThumbnailPresentationTimeUs = findBestThumbnailPresentationTimeUs(list, j, j2, j3);
            if (findBestThumbnailPresentationTimeUs != C.TIME_UNSET) {
                Format format = this.format;
                format.getClass();
                Metadata metadata = format.metadata;
                ThumbnailMetadata thumbnailMetadata = new ThumbnailMetadata(findBestThumbnailPresentationTimeUs);
                this.format = this.format.buildUpon().setMetadata(metadata == null ? new Metadata(thumbnailMetadata) : metadata.copyWithAppendedEntries(thumbnailMetadata)).build();
                this.thumbnailMetadataAdded = true;
            }
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) {
            try {
                parsableByteArray.skipBytes(16);
                long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (readLittleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (readLittleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (readLittleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) {
            try {
                int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (readLittleEndianUnsignedShort == 1) {
                    return true;
                }
                if (readLittleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(20);
                    int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
                    if (WavUtil.isChannelMaskValid(readLittleEndianUnsignedIntToInt, this.channelCount)) {
                        this.channelMask = WavUtil.mapToAudioFormatChannelMask(readLittleEndianUnsignedIntToInt);
                    }
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            return MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId) ? z : this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x0262, code lost:
        
            if (r2 == 0) goto L153;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0264, code lost:
        
            r4 = null;
            r2 = -1;
            r1 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x0266, code lost:
        
            r3 = -1;
            r1 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x0268, code lost:
        
            r4 = null;
            r1 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0289, code lost:
        
            if (r2 == 0) goto L153;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x04b8  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x04a8  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0490  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x04b6  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x04c8  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x062e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0649  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x064c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x04df  */
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void initializeFormat(int r23) {
            /*
                Method dump skipped, instructions count: 1878
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.Track.initializeFormat(int):void");
        }

        @RequiresNonNull({"output"})
        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = DesugarCollections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i, SubtitleParser.Factory factory) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C.TIME_UNSET;
        this.durationTimecode = C.TIME_UNSET;
        this.durationUs = C.TIME_UNSET;
        this.currentCueTimeUs = C.TIME_UNSET;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        this.primarySeekTrackNumber = -1;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.tracksContentPosition = -1L;
        this.seekPositionAfterReadingTracks = -1L;
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.subtitleParserFactory = factory;
        this.perTrackCues = new SparseArray<>();
        this.seekForCuesEnabled = (i & 1) == 0;
        this.parseSubtitlesDuringExtraction = (i & 2) == 0;
        this.parseHagcMetadata = (i & 4) == 0;
        this.varintReader = new VarintReader();
        this.chapters = new LongSparseArray<>();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
        this.pendingEndTracks = true;
    }

    private void assertInCues(int i) {
        if (this.inCuesElement) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
    }

    @EnsuresNonNull({"currentChapter"})
    private void assertInEditionEntry(int i) {
        if (this.currentChapter != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in an EditionEntry", null);
    }

    @EnsuresNonNull({"currentTrack"})
    private void assertInTrackEntry(int i) {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void assertInitialized() {
        this.extractorOutput.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor.Track r18, long r19, int r21, int r22, int r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            androidx.media3.extractor.TrueHdSampleRechunker r2 = r1.trueHdSampleRechunker
            r9 = 1
            if (r2 == 0) goto L1c
            r3 = r2
            androidx.media3.extractor.TrackOutput r2 = r1.output
            androidx.media3.extractor.TrackOutput$CryptoData r8 = r1.cryptoData
            r5 = r21
            r6 = r22
            r7 = r23
            r1 = r3
            r3 = r19
            r1.sampleMetadata(r2, r3, r5, r6, r7, r8)
            goto Ld0
        L1c:
            java.lang.String r2 = "S_TEXT/UTF8"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "S_TEXT/ASS"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "S_TEXT/SSA"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L44
            java.lang.String r2 = "S_TEXT/WEBVTT"
            java.lang.String r3 = r1.codecId
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L60
        L44:
            int r2 = r0.blockSampleCount
            java.lang.String r3 = "MatroskaExtractor"
            if (r2 <= r9) goto L50
            java.lang.String r2 = "Skipping subtitle sample in laced block."
            androidx.media3.common.util.Log.w(r3, r2)
            goto L60
        L50:
            long r4 = r0.blockDurationUs
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L63
            java.lang.String r2 = "Skipping subtitle sample with no duration."
            androidx.media3.common.util.Log.w(r3, r2)
        L60:
            r2 = r22
            goto La2
        L63:
            java.lang.String r2 = r1.codecId
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            byte[] r3 = r3.getData()
            setSubtitleEndTime(r2, r4, r3)
            androidx.media3.common.util.ParsableByteArray r2 = r0.subtitleSample
            int r2 = r2.getPosition()
        L74:
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            int r3 = r3.limit()
            if (r2 >= r3) goto L8f
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            byte[] r3 = r3.getData()
            r3 = r3[r2]
            if (r3 != 0) goto L8c
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            r3.setLimit(r2)
            goto L8f
        L8c:
            int r2 = r2 + 1
            goto L74
        L8f:
            androidx.media3.extractor.TrackOutput r2 = r1.output
            androidx.media3.common.util.ParsableByteArray r3 = r0.subtitleSample
            int r4 = r3.limit()
            r2.sampleData(r3, r4)
            androidx.media3.common.util.ParsableByteArray r2 = r0.subtitleSample
            int r2 = r2.limit()
            int r2 = r2 + r22
        La2:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r21 & r3
            if (r3 == 0) goto Lc0
            int r3 = r0.blockSampleCount
            androidx.media3.common.util.ParsableByteArray r4 = r0.supplementalData
            if (r3 <= r9) goto Lb3
            r3 = 0
            r4.reset(r3)
            goto Lc0
        Lb3:
            int r3 = r4.limit()
            androidx.media3.extractor.TrackOutput r4 = r1.output
            androidx.media3.common.util.ParsableByteArray r5 = r0.supplementalData
            r6 = 2
            r4.sampleData(r5, r3, r6)
            int r2 = r2 + r3
        Lc0:
            r14 = r2
            androidx.media3.extractor.TrackOutput r10 = r1.output
            androidx.media3.extractor.TrackOutput$CryptoData r1 = r1.cryptoData
            r11 = r19
            r13 = r21
            r15 = r23
            r16 = r1
            r10.sampleMetadata(r11, r13, r14, r15, r16)
        Ld0:
            r0.haveOutputSample = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.commitSampleToOutput(androidx.media3.extractor.mkv.MatroskaExtractor$Track, long, int, int, int):void");
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        sp0.o(j != C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    private static boolean isCodecSupported(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_ALAC":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new MatroskaExtractor(factory)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new MatroskaExtractor(SubtitleParser.Factory.UNSUPPORTED, 2)};
    }

    private void maybeEndTracks() {
        if (this.pendingEndTracks) {
            if (this.tracksContentPosition == -1 || this.readTracks) {
                for (int i = 0; i < this.tracks.size(); i++) {
                    if (this.tracks.valueAt(i).waitingForDtsAnalysis) {
                        return;
                    }
                }
                ExtractorOutput extractorOutput = this.extractorOutput;
                extractorOutput.getClass();
                extractorOutput.endTracks();
                this.pendingEndTracks = false;
            }
        }
    }

    private void maybePrepareSeekMap() {
        if (this.sentSeekMap) {
            return;
        }
        if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
            this.seekForCues = true;
            return;
        }
        ExtractorOutput extractorOutput = this.extractorOutput;
        extractorOutput.getClass();
        extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
        this.sentSeekMap = true;
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private boolean maybeSeekForTracks(PositionHolder positionHolder, long j) {
        if (this.seekForTracks) {
            this.seekPositionAfterReadingTracks = j;
            positionHolder.position = this.tracksContentPosition;
            this.seekForTracks = false;
            return true;
        }
        if (this.readTracks) {
            long j2 = this.seekPositionAfterReadingTracks;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterReadingTracks = -1L;
                return true;
            }
        }
        return false;
    }

    public static ExtractorsFactory newFactory(SubtitleParser.Factory factory) {
        return new am1(factory, (byte) 1);
    }

    private void readScratch(ExtractorInput extractorInput, int i) {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private long scaleTimecodeToUs(long j) {
        long j2 = this.timecodeScale;
        if (j2 != C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j, j2, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        byte[] formatSubtitleTimecode;
        int i;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                formatSubtitleTimecode = formatSubtitleTimecode(j, SSA_TIMECODE_FORMAT, 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                formatSubtitleTimecode = formatSubtitleTimecode(j, VTT_TIMECODE_FORMAT, 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                formatSubtitleTimecode = formatSubtitleTimecode(j, SUBRIP_TIMECODE_FORMAT, 1000L);
                i = 19;
                break;
            default:
                s83.d();
                return;
        }
        System.arraycopy(formatSubtitleTimecode, 0, bArr, i, formatSubtitleTimecode.length);
    }

    private void updateTrackFormatWithMetadata(Track track) {
        track.maybeAddChaptersMetadata(this.chapters);
        track.maybeAddThumbnailMetadata(this.perTrackCues, this.durationUs, this.segmentContentPosition, this.segmentContentSize);
    }

    @RequiresNonNull({"#2.output"})
    private int writeSampleData(ExtractorInput extractorInput, Track track, int i, boolean z) {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_SSA.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i);
            return finishWriteSampleData();
        }
        if (track.waitingForDtsAnalysis) {
            track.format.getClass();
            Format updateFormatWithDtsHdInfo = DtsUtil.updateFormatWithDtsHdInfo(extractorInput, i, track.format);
            track.format = updateFormatWithDtsHdInfo;
            track.output.format(updateFormatWithDtsHdInfo);
            track.waitingForDtsAnalysis = false;
            maybeEndTracks();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b = this.sampleSignalByte;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z2) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i3 = this.samplePartitionCount * 4;
                        this.scratch.reset(i3);
                        extractorInput.readFully(this.scratch.getData(), 0, i3);
                        this.sampleBytesRead += i3;
                        short s = (short) ((this.samplePartitionCount / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i4);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.samplePartitionCount;
                            if (i5 >= i2) {
                                break;
                            }
                            int readUnsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            int i7 = i5 % 2;
                            ByteBuffer byteBuffer2 = this.encryptionSubsampleDataBuffer;
                            if (i7 == 0) {
                                byteBuffer2.putShort((short) (readUnsignedIntToInt - i6));
                            } else {
                                byteBuffer2.putInt(readUnsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = readUnsignedIntToInt;
                        }
                        int i8 = (i - this.sampleBytesRead) - i6;
                        int i9 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.encryptionSubsampleDataBuffer;
                        if (i9 == 1) {
                            byteBuffer3.putInt(i8);
                        } else {
                            byteBuffer3.putShort((short) i8);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                        trackOutput.sampleData(this.encryptionSubsampleData, i4, 1);
                        this.sampleBytesWritten += i4;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int limit = (this.sampleStrippedBytes.limit() + i) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((limit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((limit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((limit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (limit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int limit2 = this.sampleStrippedBytes.limit() + i;
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                sp0.z(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i10 = this.sampleBytesRead;
                if (i10 >= limit2) {
                    break;
                }
                int writeToOutput = writeToOutput(extractorInput, trackOutput, limit2 - i10);
                this.sampleBytesRead += writeToOutput;
                this.sampleBytesWritten += writeToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i11 = track.nalUnitLengthFieldLength;
            int i12 = 4 - i11;
            while (this.sampleBytesRead < limit2) {
                int i13 = this.sampleCurrentNalBytesRemaining;
                if (i13 == 0) {
                    writeToTarget(extractorInput, data, i12, i11);
                    this.sampleBytesRead += i11;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int writeToOutput2 = writeToOutput(extractorInput, trackOutput, i13);
                    this.sampleBytesRead += writeToOutput2;
                    this.sampleBytesWritten += writeToOutput2;
                    this.sampleCurrentNalBytesRemaining -= writeToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) {
        int length = bArr.length + i;
        int capacity = this.subtitleSample.capacity();
        ParsableByteArray parsableByteArray = this.subtitleSample;
        if (capacity < length) {
            parsableByteArray.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, parsableByteArray.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) {
        int bytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (bytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i, false);
        }
        int min = Math.min(i, bytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, min);
        return min;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, min);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0246, code lost:
    
        throw androidx.media3.common.ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void binaryElement(int r27, int r28, androidx.media3.extractor.ExtractorInput r29) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.binaryElement(int, int, androidx.media3.extractor.ExtractorInput):void");
    }

    public void endMasterElement(int i) {
        String str;
        SparseArray<List<MatroskaSeekMap.CuePointData>> sparseArray;
        int i2;
        assertInitialized();
        if (i == 128) {
            ChapterEntry chapterEntry = this.currentChapter;
            chapterEntry.getClass();
            if (chapterEntry.chapString != null || (str = chapterEntry.currentDisplayString) == null) {
                return;
            }
            chapterEntry.chapString = str;
            String str2 = chapterEntry.currentDisplayLanguage;
            if (str2 != null) {
                chapterEntry.chapLanguage = str2;
                return;
            }
            return;
        }
        int i3 = 0;
        if (i == ID_BLOCK_GROUP) {
            if (this.blockState != 2) {
                return;
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            track.assertOutputInitialized();
            if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track.codecId)) {
                this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.blockSampleCount; i5++) {
                i4 += this.blockSampleSizes[i5];
            }
            int i6 = 0;
            while (i6 < this.blockSampleCount) {
                long j = this.blockTimeUs + ((track.defaultSampleDurationNs * i6) / 1000);
                int i7 = this.blockFlags;
                if (i6 == 0 && !this.blockHasReferenceBlock) {
                    i7 |= 1;
                }
                int i8 = this.blockSampleSizes[i6];
                int i9 = i4 - i8;
                commitSampleToOutput(track, j, i7, i8, i9);
                i6++;
                i4 = i9;
            }
            this.blockState = 0;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            Track track2 = this.currentTrack;
            track2.getClass();
            String str3 = track2.codecId;
            if (str3 == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str3)) {
                track2.initializeFormat(track2.number);
                track2.output = this.extractorOutput.track(track2.number, track2.type);
                this.tracks.put(track2.number, track2);
            }
            this.currentTrack = null;
            return;
        }
        if (i == ID_EDITION_ENTRY) {
            while (i3 < this.tracks.size()) {
                updateTrackFormatWithMetadata(this.tracks.valueAt(i3));
                i3++;
            }
            return;
        }
        if (i == ID_SEEK) {
            int i10 = this.seekEntryId;
            if (i10 != -1) {
                long j2 = this.seekEntryPosition;
                if (j2 != -1) {
                    if (i10 == ID_CUES) {
                        this.cuesContentPosition = j2;
                        return;
                    } else {
                        if (i10 == ID_TRACKS) {
                            this.tracksContentPosition = j2;
                            return;
                        }
                        return;
                    }
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == ID_CONTENT_ENCODING) {
            assertInTrackEntry(i);
            Track track3 = this.currentTrack;
            if (track3.hasContentEncryption) {
                if (track3.cryptoData == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                track3.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i == ID_CONTENT_ENCODINGS) {
            assertInTrackEntry(i);
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption && track4.sampleStrippedBytes != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j3 = this.durationTimecode;
            if (j3 != C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j3);
                return;
            }
            return;
        }
        if (i == ID_TRACKS) {
            if (this.tracks.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            boolean z = !this.seekForCuesEnabled || this.cuesContentPosition == -1 || this.sentSeekMap;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            for (int i15 = 0; i15 < this.tracks.size(); i15++) {
                Track valueAt = this.tracks.valueAt(i15);
                int i16 = valueAt.type;
                if (i16 == 2) {
                    if (valueAt.flagDefault) {
                        i11 = valueAt.number;
                    }
                    if (i12 == -1) {
                        i12 = valueAt.number;
                    }
                } else if (i16 == 1) {
                    if (valueAt.flagDefault) {
                        i13 = valueAt.number;
                    }
                    if (i14 == -1) {
                        i14 = valueAt.number;
                    }
                }
                if (z && !valueAt.waitingForDtsAnalysis) {
                    updateTrackFormatWithMetadata(valueAt);
                    valueAt.assertOutputInitialized();
                    TrackOutput trackOutput = valueAt.output;
                    Format format = valueAt.format;
                    format.getClass();
                    trackOutput.format(format);
                }
            }
            if (i11 != -1) {
                this.primarySeekTrackNumber = i11;
            } else if (i12 != -1) {
                this.primarySeekTrackNumber = i12;
            } else if (i13 != -1) {
                this.primarySeekTrackNumber = i13;
            } else if (i14 != -1) {
                this.primarySeekTrackNumber = i14;
            } else {
                this.primarySeekTrackNumber = this.tracks.size() > 0 ? this.tracks.valueAt(0).number : -1;
            }
            this.readTracks = true;
            if (this.seekPositionAfterReadingTracks != -1) {
                maybePrepareSeekMap();
            }
            if (z) {
                maybeEndTracks();
                return;
            }
            return;
        }
        if (i != ID_CUES) {
            if (i == ID_CHAPTER_ATOM) {
                ChapterEntry chapterEntry2 = this.currentChapter;
                chapterEntry2.getClass();
                long j4 = chapterEntry2.uid;
                if (j4 != 0) {
                    this.chapters.put(j4, chapterEntry2);
                }
                this.currentChapter = null;
                return;
            }
            if (i == ID_CUE_TRACK_POSITIONS && !this.sentSeekMap) {
                assertInCues(i);
                if (this.currentCueTimeUs == C.TIME_UNSET || (i2 = this.currentCueTrackNumber) == -1 || this.currentCueClusterPosition == -1) {
                    return;
                }
                List<MatroskaSeekMap.CuePointData> list = this.perTrackCues.get(i2);
                if (list == null) {
                    list = new ArrayList<>();
                    this.perTrackCues.put(this.currentCueTrackNumber, list);
                }
                list.add(new MatroskaSeekMap.CuePointData(this.currentCueTimeUs, this.segmentContentPosition + this.currentCueClusterPosition, this.currentCueRelativePosition));
                return;
            }
            return;
        }
        if (this.sentSeekMap) {
            return;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.perTrackCues.size()) {
                break;
            }
            if (this.perTrackCues.valueAt(i17).isEmpty()) {
                i17++;
            } else if (this.durationUs != C.TIME_UNSET) {
                int i18 = 0;
                while (true) {
                    int size = this.perTrackCues.size();
                    sparseArray = this.perTrackCues;
                    if (i18 >= size) {
                        break;
                    }
                    Collections.sort(sparseArray.valueAt(i18));
                    i18++;
                }
                this.extractorOutput.seekMap(new MatroskaSeekMap(sparseArray, this.durationUs, this.primarySeekTrackNumber, this.segmentContentPosition, this.segmentContentSize));
            }
        }
        this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
        this.sentSeekMap = true;
        this.inCuesElement = false;
        while (i3 < this.tracks.size()) {
            Track valueAt2 = this.tracks.valueAt(i3);
            if (!valueAt2.waitingForDtsAnalysis) {
                updateTrackFormatWithMetadata(valueAt2);
                valueAt2.assertOutputInitialized();
                TrackOutput trackOutput2 = valueAt2.output;
                Format format2 = valueAt2.format;
                format2.getClass();
                trackOutput2.format(format2);
            }
            i3++;
        }
        maybeEndTracks();
    }

    public void floatElement(int i, double d) {
        if (i == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i).sampleRate = (int) d;
            return;
        }
        if (i == ID_DURATION) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i).primaryRChromaticityX = (float) d;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i).primaryRChromaticityY = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i).primaryGChromaticityX = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i).primaryGChromaticityY = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i).primaryBChromaticityX = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i).primaryBChromaticityY = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i).whitePointChromaticityX = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i).whitePointChromaticityY = (float) d;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i).maxMasteringLuminance = (float) d;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i).minMasteringLuminance = (float) d;
                break;
            default:
                switch (i) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i).projectionPoseYaw = (float) d;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i).projectionPosePitch = (float) d;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i).projectionPoseRoll = (float) d;
                        break;
                }
        }
    }

    public ChapterEntry getCurrentChapter(int i) {
        assertInEditionEntry(i);
        return this.currentChapter;
    }

    public Track getCurrentTrack(int i) {
        assertInTrackEntry(i);
        return this.currentTrack;
    }

    public int getElementType(int i) {
        switch (i) {
            case 128:
            case ID_CHAPTER_TRACK /* 143 */:
            case ID_BLOCK_GROUP /* 160 */:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case ID_CHAPTER_ATOM /* 182 */:
            case ID_CUE_TRACK_POSITIONS /* 183 */:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case ID_AUDIO /* 225 */:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_EDITION_ENTRY /* 17849 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_CHAPTERS /* 272869232 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case ID_TRACK_TYPE /* 131 */:
            case 136:
            case ID_CHAPTER_TRACK_UID /* 137 */:
            case ID_CHAPTER_TIME_START /* 145 */:
            case ID_CHAPTER_TIME_END /* 146 */:
            case ID_CHAPTER_FLAG_HIDDEN /* 152 */:
            case ID_BLOCK_DURATION /* 155 */:
            case ID_CHANNELS /* 159 */:
            case ID_PIXEL_WIDTH /* 176 */:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case ID_TRACK_NUMBER /* 215 */:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case 240:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case ID_CUE_TRACK /* 247 */:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_CHAPTER_UID /* 29636 */:
            case ID_TRACK_UID /* 29637 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case ID_CHAP_STRING /* 133 */:
            case 134:
            case ID_DOC_TYPE /* 17026 */:
            case ID_CHAP_LANGUAGE /* 17276 */:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case ID_BLOCK /* 161 */:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case ID_SAMPLING_FREQUENCY /* 181 */:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ List getSniffFailureDetails() {
        return jp0.f();
    }

    public void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i) {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i);
            return;
        }
        byte[] bArr = new byte[i];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i);
    }

    public void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) {
        if (i != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i2);
            return;
        }
        this.supplementalData.reset(i2);
        extractorInput.readFully(this.supplementalData.getData(), 0, i2);
        if (this.parseHagcMetadata || !CodecSpecificDataUtil.isHagcMetadata(this.supplementalData.getData(), i2)) {
            return;
        }
        this.supplementalData.reset(0);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    public void integerElement(int i, long j) {
        if (i == 136) {
            getCurrentTrack(i).flagDefault = j == 1;
            return;
        }
        if (i == ID_CHAPTER_TRACK_UID) {
            getCurrentChapter(i).trackUid = j;
            return;
        }
        if (i == ID_CHAPTER_TIME_START) {
            getCurrentChapter(i).timeStartNs = j;
            return;
        }
        if (i == ID_CHAPTER_TIME_END) {
            getCurrentChapter(i).timeEndNs = j;
            return;
        }
        if (i == 240) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            if (this.currentCueRelativePosition == -1) {
                this.currentCueRelativePosition = j;
                return;
            }
            return;
        }
        if (i == ID_CUE_CLUSTER_POSITION) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            if (this.currentCueClusterPosition == -1) {
                this.currentCueClusterPosition = j;
                return;
            }
            return;
        }
        if (i == ID_CONTENT_ENCODING_ORDER) {
            if (j == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == ID_CONTENT_ENCODING_SCOPE) {
            if (j == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        if (i == ID_CHAPTER_UID) {
            getCurrentChapter(i).uid = j;
            return;
        }
        if (i == ID_TRACK_UID) {
            getCurrentTrack(i).uid = j;
            return;
        }
        switch (i) {
            case ID_TRACK_TYPE /* 131 */:
                int i2 = (int) j;
                if (i2 == 1) {
                    getCurrentTrack(i).type = 2;
                    return;
                }
                if (i2 == 2) {
                    getCurrentTrack(i).type = 1;
                    return;
                }
                if (i2 == 17) {
                    getCurrentTrack(i).type = 3;
                    return;
                } else if (i2 != 33) {
                    getCurrentTrack(i).type = -1;
                    return;
                } else {
                    getCurrentTrack(i).type = 5;
                    return;
                }
            case ID_CHAPTER_FLAG_HIDDEN /* 152 */:
                getCurrentChapter(i).flagHidden = j == 1;
                return;
            case ID_BLOCK_DURATION /* 155 */:
                this.blockDurationUs = scaleTimecodeToUs(j);
                return;
            case ID_CHANNELS /* 159 */:
                getCurrentTrack(i).channelCount = (int) j;
                return;
            case ID_PIXEL_WIDTH /* 176 */:
                getCurrentTrack(i).width = (int) j;
                return;
            case ID_CUE_TIME /* 179 */:
                if (this.sentSeekMap) {
                    return;
                }
                assertInCues(i);
                this.currentCueTimeUs = scaleTimecodeToUs(j);
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i).height = (int) j;
                return;
            case ID_TRACK_NUMBER /* 215 */:
                getCurrentTrack(i).number = (int) j;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j;
                return;
            case ID_CUE_TRACK /* 247 */:
                if (this.sentSeekMap) {
                    return;
                }
                assertInCues(i);
                this.currentCueTrackNumber = (int) j;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i).blockAddIdType = (int) j;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j < 1 || j > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i3 = (int) j;
                assertInTrackEntry(i);
                if (i3 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i3 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i).displayWidth = (int) j;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i).displayUnit = (int) j;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i).displayHeight = (int) j;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i).flagForced = j == 1;
                return;
            case ID_COLOUR_BITS_PER_CHANNEL /* 21938 */:
                assertInTrackEntry(i);
                this.currentTrack.bitsPerChannel = (int) j;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i).maxBlockAdditionId = (int) j;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i).codecDelayNs = j;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i).seekPreRollNs = j;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i).audioBitDepth = (int) j;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i4 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i4 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i).defaultSampleDurationNs = (int) j;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j;
                return;
            default:
                switch (i) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            this.currentTrack.containerColorRange = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.currentTrack.containerColorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i);
                        int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j);
                        if (isoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.containerColorTransfer = isoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i);
                        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j);
                        if (isoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.containerColorSpace = isoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i).maxContentLuminance = (int) j;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i).maxFrameAverageLuminance = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public boolean isLevel1Element(int i) {
        return i == 357149030 || i == ID_CHAPTERS || i == ID_CLUSTER || i == ID_CUES || i == ID_TRACKS;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && (maybeSeekForTracks(positionHolder, extractorInput.getPosition()) || maybeSeekForCues(positionHolder, extractorInput.getPosition()))) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            Track valueAt = this.tracks.valueAt(i);
            valueAt.assertOutputInitialized();
            valueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        this.inCuesElement = false;
        this.currentCueTimeUs = C.TIME_UNSET;
        this.currentCueTrackNumber = -1;
        this.currentCueClusterPosition = -1L;
        this.currentCueRelativePosition = -1L;
        if (!this.sentSeekMap) {
            this.perTrackCues.clear();
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) {
        return new Sniffer().sniff(extractorInput);
    }

    public void startMasterElement(int i, long j, long j2) {
        assertInitialized();
        if (i == 128) {
            getCurrentChapter(i).currentDisplayString = null;
            getCurrentChapter(i).currentDisplayLanguage = null;
            return;
        }
        if (i == ID_BLOCK_GROUP) {
            this.blockHasReferenceBlock = false;
            this.blockGroupDiscardPaddingNs = 0L;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            Track track = new Track();
            this.currentTrack = track;
            track.isWebm = this.isWebm;
            return;
        }
        if (i == ID_CUE_POINT) {
            if (this.sentSeekMap) {
                return;
            }
            assertInCues(i);
            this.currentCueTimeUs = C.TIME_UNSET;
            return;
        }
        if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == ID_CONTENT_ENCRYPTION) {
            getCurrentTrack(i).hasContentEncryption = true;
            return;
        }
        if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.segmentContentPosition = j;
            this.segmentContentSize = j2;
            return;
        }
        if (i == ID_CUES) {
            if (this.sentSeekMap) {
                return;
            }
            this.inCuesElement = true;
            return;
        }
        if (i == ID_CLUSTER) {
            if (this.tracksContentPosition == -1 || this.readTracks) {
                maybePrepareSeekMap();
                return;
            } else {
                this.seekForTracks = true;
                return;
            }
        }
        if (i == ID_CHAPTER_ATOM) {
            this.currentChapter = new ChapterEntry();
            return;
        }
        if (i == ID_CUE_TRACK_POSITIONS && !this.sentSeekMap) {
            assertInCues(i);
            this.currentCueTrackNumber = -1;
            this.currentCueClusterPosition = -1L;
            this.currentCueRelativePosition = -1L;
        }
    }

    public void stringElement(int i, String str) {
        if (i == ID_CHAP_STRING) {
            getCurrentChapter(i).currentDisplayString = str;
            return;
        }
        if (i == 134) {
            getCurrentTrack(i).codecId = str;
            return;
        }
        if (i == ID_DOC_TYPE) {
            if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
                this.isWebm = Objects.equals(str, DOC_TYPE_WEBM);
                return;
            }
            throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
        }
        if (i == ID_CHAP_LANGUAGE) {
            getCurrentChapter(i).currentDisplayLanguage = str;
        } else if (i == ID_NAME) {
            getCurrentTrack(i).name = str;
        } else {
            if (i != ID_LANGUAGE) {
                return;
            }
            getCurrentTrack(i).language = str;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class MatroskaSeekMap implements TrackAwareSeekMap, ChunkIndexProvider {
        private final ChunkIndex chunkIndex;
        private final long durationUs;
        private final SparseArray<List<CuePointData>> perTrackCues;
        private final int primarySeekTrackNumber;

        /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
        public static final class CuePointData implements Comparable<CuePointData> {
            private final long clusterPosition;
            private final long relativePosition;
            private final long timeUs;

            private CuePointData(long j, long j2, long j3) {
                this.timeUs = j;
                this.clusterPosition = j2;
                this.relativePosition = j3;
            }

            @Override // java.lang.Comparable
            public int compareTo(CuePointData cuePointData) {
                return Long.compare(this.timeUs, cuePointData.timeUs);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CuePointData)) {
                    return false;
                }
                CuePointData cuePointData = (CuePointData) obj;
                return this.timeUs == cuePointData.timeUs && this.clusterPosition == cuePointData.clusterPosition && this.relativePosition == cuePointData.relativePosition;
            }

            public int hashCode() {
                return Objects.hash(Long.valueOf(this.timeUs), Long.valueOf(this.clusterPosition), Long.valueOf(this.relativePosition));
            }
        }

        public MatroskaSeekMap(SparseArray<List<CuePointData>> sparseArray, long j, int i, long j2, long j3) {
            this.perTrackCues = sparseArray;
            this.durationUs = j;
            this.primarySeekTrackNumber = i;
            this.chunkIndex = buildChunkIndex(sparseArray, j, i, j2, j3);
        }

        private static ChunkIndex buildChunkIndex(SparseArray<List<CuePointData>> sparseArray, long j, int i, long j2, long j3) {
            int i2;
            List<CuePointData> list = sparseArray.get(i);
            if (list == null || list.isEmpty()) {
                return null;
            }
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                CuePointData cuePointData = list.get(i4);
                jArr3[i4] = cuePointData.timeUs;
                jArr[i4] = cuePointData.clusterPosition;
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArr[i3] = (int) (jArr[i5] - jArr[i3]);
                jArr2[i3] = jArr3[i5] - jArr3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArr3[i6] >= j) {
                i6--;
            }
            iArr[i6] = (int) ((j2 + j3) - jArr[i6]);
            jArr2[i6] = j - jArr3[i6];
            if (i6 < i2) {
                Log.w(MatroskaExtractor.TAG, "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArr = Arrays.copyOf(iArr, i7);
                jArr = Arrays.copyOf(jArr, i7);
                jArr2 = Arrays.copyOf(jArr2, i7);
                jArr3 = Arrays.copyOf(jArr3, i7);
            }
            return new ChunkIndex(iArr, jArr, jArr2, jArr3);
        }

        @Override // androidx.media3.extractor.ChunkIndexProvider
        public ChunkIndex getChunkIndex() {
            return this.chunkIndex;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public SeekMap.SeekPoints getSeekPoints(long j, int i) {
            int i2;
            int i3;
            List<CuePointData> list = this.perTrackCues.get(i);
            if ((list == null || list.isEmpty()) && i != (i2 = this.primarySeekTrackNumber)) {
                list = this.perTrackCues.get(i2);
            }
            if (list == null || list.isEmpty()) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super CuePointData>>) list, new CuePointData(j, -1L, -1L), true, false);
            if (binarySearchFloor == -1) {
                CuePointData cuePointData = list.get(0);
                return new SeekMap.SeekPoints(new SeekPoint(cuePointData.timeUs, cuePointData.clusterPosition));
            }
            CuePointData cuePointData2 = list.get(binarySearchFloor);
            SeekPoint seekPoint = new SeekPoint(cuePointData2.timeUs, cuePointData2.clusterPosition);
            if (cuePointData2.timeUs >= j || (i3 = binarySearchFloor + 1) >= list.size()) {
                return new SeekMap.SeekPoints(seekPoint);
            }
            CuePointData cuePointData3 = list.get(i3);
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(cuePointData3.timeUs, cuePointData3.clusterPosition));
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.TrackAwareSeekMap
        public boolean isSeekable(int i) {
            List<CuePointData> list = this.perTrackCues.get(i);
            return (list == null || list.isEmpty()) ? false : true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return isSeekable(this.primarySeekTrackNumber);
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            ChunkIndex chunkIndex = this.chunkIndex;
            if (chunkIndex != null) {
                return chunkIndex.getSeekPoints(j);
            }
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final /* synthetic */ Extractor getUnderlyingImplementation() {
        return this;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }

    @Deprecated
    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i | 2, SubtitleParser.Factory.UNSUPPORTED);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory) {
        this(new DefaultEbmlReader(), 0, factory);
    }

    public MatroskaExtractor(SubtitleParser.Factory factory, int i) {
        this(new DefaultEbmlReader(), i, factory);
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new DefaultEbmlReader(), 2, SubtitleParser.Factory.UNSUPPORTED);
    }
}

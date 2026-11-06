package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import defpackage.r7;
import defpackage.zy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String ATTR_QUOTED_STRING_VALUE_PATTERN = "\"((?:.|\f)+?)\"";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String DATERANGE_CLASS_INTERSTITIALS = "com.apple.hls.interstitial";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_CONTENT_STEERING = "#EXT-X-CONTENT-STEERING";
    private static final String TAG_DATERANGE = "#EXT-X-DATERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SAMPLE_RATE = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO_RANGE = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SUPPLEMENTAL_CODECS = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SCORE = Pattern.compile("SCORE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SERVER_URI = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_PATHWAY_ID = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_STABLE_VARIANT_ID = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_STABLE_RENDITION_ID = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_ATTR_DURATION_PREFIXED = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_QUERY_PARAM = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_ID = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CLASS = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_START_DATE = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CUE = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_END_DATE = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_PLANNED_DURATION = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_END_ON_NEXT = compileBooleanAttrPattern("END-ON-NEXT");
    private static final Pattern REGEX_ASSET_URI = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_ASSET_LIST_URI = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESUME_OFFSET = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_PLAYOUT_LIMIT = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SNAP = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_RESTRICT = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_CONTENT_MAY_VARY = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TIMELINE_OCCUPIES = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_TIMELINE_STYLE = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_SKIP_CONTROL_OFFSET = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SKIP_CONTROL_DURATION = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_SKIP_CONTROL_LABEL_ID = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern REGEX_CLIENT_DEFINED_ATTRIBUTE_PREFIX = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class DeltaUpdateException extends IOException {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                String poll = this.extraLines.poll();
                poll.getClass();
                this.next = poll;
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() {
            if (!hasNext()) {
                zy.k();
                return null;
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class MatcherCache extends LinkedHashMap<Pattern, Matcher> {
        private MatcherCache() {
            super(16, 0.75f, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Matcher obtainMatcher(Pattern pattern, CharSequence charSequence) {
            Matcher matcher = get(pattern);
            if (matcher != null) {
                matcher.reset(charSequence);
                return matcher;
            }
            Matcher matcher2 = pattern.matcher(charSequence);
            put(pattern, matcher2);
            return matcher2;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Pattern, Matcher> entry) {
            return size() > 32;
        }
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (skipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i)) {
                return false;
            }
            skipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static DrmInitData getPlaylistProtectionSchemes(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String getSegmentEncryptionIV(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static boolean isDolbyVisionFormat(String str, String str2, String str3, String str4) {
        if (!MimeTypes.isDolbyVisionCodec(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static HlsMediaPlaylist.ClientDefinedAttribute parseClientDefinedAttribute(String str, String str2, Map<String, String> map, MatcherCache matcherCache) {
        String B = r7.B(str2, "=");
        int length = B.length() + str.indexOf(B);
        String substring = str.substring(length, (str.length() == length + 1 ? 1 : 2) + length);
        if (substring.startsWith("\"")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map, matcherCache), 0);
        }
        if (substring.equals("0x") || substring.equals("0X")) {
            return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseStringAttr(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map, matcherCache), 1);
        }
        return new HlsMediaPlaylist.ClientDefinedAttribute(str2, parseDoubleAttr(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b"), matcherCache));
    }

    private static double parseDoubleAttr(String str, Pattern pattern, MatcherCache matcherCache) {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache));
    }

    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map, MatcherCache matcherCache) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map, matcherCache);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map, matcherCache);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(parseOptionalStringAttr)) {
            return null;
        }
        String parseStringAttr2 = parseStringAttr(str, REGEX_URI, map, matcherCache);
        byte[] decode = Base64.decode(parseStringAttr2.substring(parseStringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, decode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C.CENC_TYPE_cenc : C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern, MatcherCache matcherCache) {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache));
    }

    private static long parseLongAttr(String str, Pattern pattern, MatcherCache matcherCache) {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache));
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x0851, code lost:
    
        if (r6.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_OCCUPIES_POINT) != false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x086f, code lost:
    
        if (r6.equals(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.TIMELINE_STYLE_HIGHLIGHT) != false) goto L331;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0888  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist r101, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist r102, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator r103, android.net.Uri r104, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache r105) {
        /*
            Method dump skipped, instructions count: 3220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.parseMediaPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$LineIterator, android.net.Uri, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$MatcherCache):androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0211, code lost:
    
        if (r2 > 0) goto L71;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x043d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist parseMultivariantPlaylist(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator r47, android.net.Uri r48, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.MatcherCache r49) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.parseMultivariantPlaylist(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$LineIterator, android.net.Uri, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$MatcherCache):androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist");
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z, MatcherCache matcherCache) {
        Matcher obtainMatcher = matcherCache.obtainMatcher(pattern, str);
        return obtainMatcher.find() ? BOOLEAN_TRUE.equals(obtainMatcher.group(1)) : z;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d, MatcherCache matcherCache) {
        Matcher obtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!obtainMatcher.find()) {
            return d;
        }
        String group = obtainMatcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i, MatcherCache matcherCache) {
        Matcher obtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!obtainMatcher.find()) {
            return i;
        }
        String group = obtainMatcher.group(1);
        group.getClass();
        return Integer.parseInt(group);
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j, MatcherCache matcherCache) {
        Matcher obtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (!obtainMatcher.find()) {
            return j;
        }
        String group = obtainMatcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map, MatcherCache matcherCache) {
        Matcher obtainMatcher = matcherCache.obtainMatcher(pattern, str);
        if (obtainMatcher.find()) {
            str2 = obtainMatcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map, matcherCache);
    }

    private static int parseRoleFlags(String str, Map<String, String> map, MatcherCache matcherCache) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map, matcherCache);
        if (TextUtils.isEmpty(parseOptionalStringAttr)) {
            return 0;
        }
        String[] split = Util.split(parseOptionalStringAttr, ",");
        int i = Util.contains(split, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(split, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(split, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(split, "public.easy-to-read") ? i | 8192 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str, MatcherCache matcherCache) {
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false, matcherCache);
        ?? r0 = parseOptionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false, matcherCache)) {
            r0 = (parseOptionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false, matcherCache) ? r0 | 4 : r0;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str, MatcherCache matcherCache) {
        double d;
        long j;
        double parseOptionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d, matcherCache);
        long j2 = C.TIME_UNSET;
        long j3 = parseOptionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr * 1000000.0d);
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false, matcherCache);
        double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d, matcherCache);
        if (parseOptionalDoubleAttr2 == -9.223372036854776E18d) {
            d = 1000000.0d;
            j = -9223372036854775807L;
        } else {
            d = 1000000.0d;
            j = (long) (parseOptionalDoubleAttr2 * 1000000.0d);
        }
        double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d, matcherCache);
        if (parseOptionalDoubleAttr3 != -9.223372036854776E18d) {
            j2 = (long) (parseOptionalDoubleAttr3 * d);
        }
        return new HlsMediaPlaylist.ServerControl(j3, parseOptionalBooleanAttribute, j, j2, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false, matcherCache));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map, MatcherCache matcherCache) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map, matcherCache);
        if (parseOptionalStringAttr != null) {
            return parseOptionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern, MatcherCache matcherCache) {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP, matcherCache)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map, MatcherCache matcherCache) {
        Matcher obtainMatcher = matcherCache.obtainMatcher(REGEX_VARIABLE_REFERENCE, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (obtainMatcher.find()) {
            String group = obtainMatcher.group(1);
            if (map.containsKey(group)) {
                obtainMatcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        obtainMatcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    private static void verifyVariableNameNotContainedOrThrow(String str, Map<String, String> map) {
        if (map.containsKey(str)) {
            throw ParserException.createForMalformedManifest("duplicate variable name \"" + str + "\"", null);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        MatcherCache matcherCache = new MatcherCache();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith(TAG_STREAM_INF)) {
                        if (trim.startsWith(TAG_TARGET_DURATION) || trim.startsWith(TAG_MEDIA_SEQUENCE) || trim.startsWith(TAG_MEDIA_DURATION) || trim.startsWith(TAG_KEY) || trim.startsWith(TAG_BYTERANGE) || trim.equals(TAG_DISCONTINUITY) || trim.equals(TAG_DISCONTINUITY_SEQUENCE) || trim.equals(TAG_ENDLIST)) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri, matcherCache);
                    }
                }
            }
            arrayDeque.add(trim);
            return parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri, matcherCache);
        } finally {
            Util.closeQuietly(bufferedReader);
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map, MatcherCache matcherCache) {
        return parseOptionalStringAttr(str, pattern, null, map, matcherCache);
    }
}

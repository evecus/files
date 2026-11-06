package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.b;
import defpackage.dy1;
import defpackage.s83;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SubripParser implements SubtitleParser {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";
    private static final String TAG = "SubripParser";
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        r12.setPositionAnchor(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_RIGHT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        r12.setLineAnchor(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_MID) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_LEFT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_RIGHT) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        r12.setLineAnchor(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_MID) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_LEFT) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_LEFT) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        r12.setPositionAnchor(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_MID_RIGHT) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_MID_LEFT) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_RIGHT) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0066, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_LEFT) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r14.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_RIGHT) != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned r13, java.lang.String r14) {
        /*
            r12 = this;
            androidx.media3.common.text.Cue$Builder r12 = new androidx.media3.common.text.Cue$Builder
            r12.<init>()
            androidx.media3.common.text.Cue$Builder r12 = r12.setText(r13)
            if (r14 != 0) goto L10
            androidx.media3.common.text.Cue r12 = r12.build()
            return r12
        L10:
            int r13 = r14.hashCode()
            r0 = 2
            r1 = 1
            java.lang.String r2 = "{\\an1}"
            java.lang.String r3 = "{\\an2}"
            java.lang.String r4 = "{\\an3}"
            java.lang.String r5 = "{\\an4}"
            java.lang.String r6 = "{\\an5}"
            java.lang.String r7 = "{\\an6}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an8}"
            java.lang.String r10 = "{\\an9}"
            r11 = 0
            switch(r13) {
                case -685620710: goto L62;
                case -685620679: goto L5d;
                case -685620648: goto L53;
                case -685620617: goto L4c;
                case -685620586: goto L47;
                case -685620555: goto L40;
                case -685620524: goto L39;
                case -685620493: goto L34;
                case -685620462: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L6c
        L2d:
            boolean r13 = r14.equals(r10)
            if (r13 == 0) goto L6c
            goto L59
        L34:
            boolean r13 = r14.equals(r9)
            goto L6c
        L39:
            boolean r13 = r14.equals(r8)
            if (r13 == 0) goto L6c
            goto L68
        L40:
            boolean r13 = r14.equals(r7)
            if (r13 == 0) goto L6c
            goto L59
        L47:
            boolean r13 = r14.equals(r6)
            goto L6c
        L4c:
            boolean r13 = r14.equals(r5)
            if (r13 == 0) goto L6c
            goto L68
        L53:
            boolean r13 = r14.equals(r4)
            if (r13 == 0) goto L6c
        L59:
            r12.setPositionAnchor(r0)
            goto L6f
        L5d:
            boolean r13 = r14.equals(r3)
            goto L6c
        L62:
            boolean r13 = r14.equals(r2)
            if (r13 == 0) goto L6c
        L68:
            r12.setPositionAnchor(r11)
            goto L6f
        L6c:
            r12.setPositionAnchor(r1)
        L6f:
            int r13 = r14.hashCode()
            switch(r13) {
                case -685620710: goto Lac;
                case -685620679: goto La5;
                case -685620648: goto L9e;
                case -685620617: goto L99;
                case -685620586: goto L94;
                case -685620555: goto L8f;
                case -685620524: goto L85;
                case -685620493: goto L7e;
                case -685620462: goto L77;
                default: goto L76;
            }
        L76:
            goto Lb6
        L77:
            boolean r13 = r14.equals(r10)
            if (r13 == 0) goto Lb6
            goto L8b
        L7e:
            boolean r13 = r14.equals(r9)
            if (r13 == 0) goto Lb6
            goto L8b
        L85:
            boolean r13 = r14.equals(r8)
            if (r13 == 0) goto Lb6
        L8b:
            r12.setLineAnchor(r11)
            goto Lb9
        L8f:
            boolean r13 = r14.equals(r7)
            goto Lb6
        L94:
            boolean r13 = r14.equals(r6)
            goto Lb6
        L99:
            boolean r13 = r14.equals(r5)
            goto Lb6
        L9e:
            boolean r13 = r14.equals(r4)
            if (r13 == 0) goto Lb6
            goto Lb2
        La5:
            boolean r13 = r14.equals(r3)
            if (r13 == 0) goto Lb6
            goto Lb2
        Lac:
            boolean r13 = r14.equals(r2)
            if (r13 == 0) goto Lb6
        Lb2:
            r12.setLineAnchor(r0)
            goto Lb9
        Lb6:
            r12.setLineAnchor(r1)
        Lb9:
            int r13 = r12.getPositionAnchor()
            float r13 = getFractionalPositionForAnchorType(r13)
            androidx.media3.common.text.Cue$Builder r13 = r12.setPosition(r13)
            int r12 = r12.getLineAnchor()
            float r12 = getFractionalPositionForAnchorType(r12)
            androidx.media3.common.text.Cue$Builder r12 = r13.setLine(r12, r11)
            androidx.media3.common.text.Cue r12 = r12.build()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.subrip.SubripParser.buildCue(android.text.Spanned, java.lang.String):androidx.media3.common.text.Cue");
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return readUtfCharsetFromBom != null ? readUtfCharsetFromBom : StandardCharsets.UTF_8;
    }

    public static float getFractionalPositionForAnchorType(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return END_FRACTION;
        }
        s83.d();
        return 0.0f;
    }

    private static long parseTimecode(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        int i3;
        StringBuilder sb;
        String str;
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        Charset detectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j = outputOptions.startTimeUs;
        long j2 = C.TIME_UNSET;
        ArrayList arrayList = (j == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String readLine = this.parsableByteArray.readLine(detectUtfCharset);
            i3 = 0;
            if (readLine == null) {
                break;
            }
            if (!readLine.isEmpty()) {
                try {
                    Integer.parseInt(readLine);
                    String readLine2 = this.parsableByteArray.readLine(detectUtfCharset);
                    if (readLine2 == null) {
                        Log.w(TAG, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(readLine2);
                    if (matcher.matches()) {
                        long parseTimecode = parseTimecode(matcher, 1);
                        long parseTimecode2 = parseTimecode(matcher, 6);
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        String readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                        while (true) {
                            boolean isEmpty = TextUtils.isEmpty(readLine3);
                            sb = this.textBuilder;
                            if (isEmpty) {
                                break;
                            }
                            if (sb.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(readLine3, this.tags));
                            readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                        }
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        while (true) {
                            if (i3 >= this.tags.size()) {
                                str = null;
                                break;
                            }
                            str = this.tags.get(i3);
                            if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        long j3 = j2;
                        long j4 = outputOptions.startTimeUs;
                        if (j4 == j3 || parseTimecode2 >= j4) {
                            consumer.accept(new CuesWithTiming(dy1.t(buildCue(fromHtml, str)), parseTimecode, parseTimecode2 - parseTimecode));
                        } else if (arrayList != null) {
                            arrayList.add(new CuesWithTiming(dy1.t(buildCue(fromHtml, str)), parseTimecode, parseTimecode2 - parseTimecode));
                        }
                        j2 = j3;
                    } else {
                        Log.w(TAG, "Skipping invalid timing: ".concat(readLine2));
                    }
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Skipping invalid index: ".concat(readLine));
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                consumer.accept((CuesWithTiming) obj);
            }
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ Subtitle parseToLegacySubtitle(byte[] bArr, int i, int i2) {
        return b.b(this, bArr, i, i2);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void reset() {
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        b.a(this, bArr, outputOptions, consumer);
    }
}

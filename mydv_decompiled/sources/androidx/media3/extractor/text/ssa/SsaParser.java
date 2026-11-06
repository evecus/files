package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.b;
import androidx.media3.extractor.text.ssa.SsaStyle;
import defpackage.j42;
import defpackage.r7;
import defpackage.s83;
import defpackage.sp0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SsaParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaParser";
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private final ParsableByteArray parsableByteArray;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaParser(List<byte[]> list) {
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        this.parsableByteArray = new ParsableByteArray();
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        String fromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        sp0.o(fromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        SsaDialogueFormat fromFormatLine = SsaDialogueFormat.fromFormatLine(fromUtf8Bytes);
        fromFormatLine.getClass();
        this.dialogueFormatFromInitializationData = fromFormatLine;
        parseHeader(new ParsableByteArray(list.get(1)), StandardCharsets.UTF_8);
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return DEFAULT_MARGIN;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static Cue createCue(String str, int i, SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        Cue.Builder zIndex = new Cue.Builder().setText(spannableString).setZIndex(i);
        if (ssaStyle != null) {
            if (ssaStyle.primaryColor != null) {
                spannableString.setSpan(new ForegroundColorSpan(ssaStyle.primaryColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && ssaStyle.outlineColor != null) {
                spannableString.setSpan(new BackgroundColorSpan(ssaStyle.outlineColor.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = ssaStyle.fontSize;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                zIndex.setTextSize(f3 / f2, 1);
            }
            boolean z = ssaStyle.bold;
            if (z && ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i2 = overrides.alignment;
        if (i2 == -1) {
            i2 = ssaStyle != null ? ssaStyle.alignment : -1;
        }
        zIndex.setTextAlignment(toTextAlignment(i2)).setPositionAnchor(toPositionAnchor(i2)).setLineAnchor(toLineAnchor(i2));
        PointF pointF = overrides.position;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            zIndex.setPosition(computeDefaultLineOrPosition(zIndex.getPositionAnchor()));
            zIndex.setLine(computeDefaultLineOrPosition(zIndex.getLineAnchor()), 0);
        } else {
            zIndex.setPosition(pointF.x / f);
            zIndex.setLine(overrides.position.y / f2, 0);
        }
        return zIndex.build();
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return readUtfCharsetFromBom != null ? readUtfCharsetFromBom : StandardCharsets.UTF_8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void parseDialogueLine(java.lang.String r17, androidx.media3.extractor.text.ssa.SsaDialogueFormat r18, java.util.List<java.util.List<androidx.media3.common.text.Cue>> r19, java.util.List<java.lang.Long> r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "Dialogue:"
            boolean r5 = r1.startsWith(r5)
            defpackage.sp0.o(r5)
            r5 = 9
            java.lang.String r5 = r1.substring(r5)
            java.lang.String r6 = ","
            int r7 = r2.length
            java.lang.String[] r5 = r5.split(r6, r7)
            int r6 = r5.length
            int r7 = r2.length
            java.lang.String r8 = "SsaParser"
            if (r6 == r7) goto L32
            java.lang.String r0 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r0 = r0.concat(r1)
            androidx.media3.common.util.Log.w(r8, r0)
            return
        L32:
            int r6 = r2.layerIndex
            r7 = -1
            if (r6 == r7) goto L58
            r6 = r5[r6]     // Catch: java.lang.RuntimeException -> L43
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L43
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.RuntimeException -> L43
        L41:
            r10 = r6
            goto L5a
        L43:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Fail to parse layer: "
            r6.<init>(r9)
            int r9 = r2.layerIndex
            r9 = r5[r9]
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            androidx.media3.common.util.Log.w(r8, r6)
        L58:
            r6 = 0
            goto L41
        L5a:
            int r6 = r2.startTimeIndex
            r6 = r5[r6]
            long r11 = parseTimecodeUs(r6)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.lang.String r9 = "Skipping invalid timing: "
            if (r6 != 0) goto L75
            java.lang.String r0 = r9.concat(r1)
            androidx.media3.common.util.Log.w(r8, r0)
            return
        L75:
            int r6 = r2.endTimeIndex
            r6 = r5[r6]
            r15 = r8
            long r7 = parseTimecodeUs(r6)
            int r6 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r6 == 0) goto Le1
            int r6 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r6 > 0) goto L87
            goto Le1
        L87:
            java.util.Map<java.lang.String, androidx.media3.extractor.text.ssa.SsaStyle> r1 = r0.styles
            if (r1 == 0) goto L9d
            int r6 = r2.styleIndex
            r9 = -1
            if (r6 == r9) goto L9d
            r6 = r5[r6]
            java.lang.String r6 = r6.trim()
            java.lang.Object r1 = r1.get(r6)
            androidx.media3.extractor.text.ssa.SsaStyle r1 = (androidx.media3.extractor.text.ssa.SsaStyle) r1
            goto L9e
        L9d:
            r1 = 0
        L9e:
            int r2 = r2.textIndex
            r2 = r5[r2]
            r5 = r11
            androidx.media3.extractor.text.ssa.SsaStyle$Overrides r12 = androidx.media3.extractor.text.ssa.SsaStyle.Overrides.parseFromDialogue(r2)
            java.lang.String r2 = androidx.media3.extractor.text.ssa.SsaStyle.Overrides.stripStyleOverrides(r2)
            java.lang.String r9 = "\\N"
            java.lang.String r11 = "\n"
            java.lang.String r2 = r2.replace(r9, r11)
            java.lang.String r9 = "\\n"
            java.lang.String r2 = r2.replace(r9, r11)
            java.lang.String r9 = "\\h"
            java.lang.String r11 = " "
            java.lang.String r9 = r2.replace(r9, r11)
            float r13 = r0.screenWidth
            float r14 = r0.screenHeight
            r11 = r1
            androidx.media3.common.text.Cue r0 = createCue(r9, r10, r11, r12, r13, r14)
            int r1 = addCuePlacerholderByTime(r5, r4, r3)
            int r2 = addCuePlacerholderByTime(r7, r4, r3)
        Ld2:
            if (r1 >= r2) goto Le0
            java.lang.Object r4 = r3.get(r1)
            java.util.List r4 = (java.util.List) r4
            r4.add(r0)
            int r1 = r1 + 1
            goto Ld2
        Le0:
            return
        Le1:
            java.lang.String r0 = r9.concat(r1)
            androidx.media3.common.util.Log.w(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ssa.SsaParser.parseDialogueLine(java.lang.String, androidx.media3.extractor.text.ssa.SsaDialogueFormat, java.util.List, java.util.List):void");
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2, Charset charset) {
        SsaDialogueFormat ssaDialogueFormat = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            if (readLine.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormat = SsaDialogueFormat.fromFormatLine(readLine);
            } else if (readLine.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormat == null) {
                    Log.w(TAG, "Skipping dialogue line before complete format: ".concat(readLine));
                } else {
                    parseDialogueLine(readLine, ssaDialogueFormat, list, list2);
                }
            }
        }
    }

    private void parseHeader(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(readLine)) {
                parseScriptInfo(parsableByteArray, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(readLine)) {
                this.styles = parseStyles(parsableByteArray, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(readLine)) {
                Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(readLine)) {
                return;
            }
        }
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekCodePoint(charset) == 91) {
                return;
            }
            String[] split = readLine.split(":");
            if (split.length == 2) {
                String j0 = j42.j0(split[0].trim());
                j0.getClass();
                if (j0.equals("playresx")) {
                    this.screenWidth = Float.parseFloat(split[1].trim());
                } else if (j0.equals("playresy")) {
                    try {
                        this.screenHeight = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.Format format = null;
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekCodePoint(charset) == 91)) {
                break;
            }
            if (readLine.startsWith(FORMAT_LINE_PREFIX)) {
                format = SsaStyle.Format.fromFormatLine(readLine);
            } else if (readLine.startsWith(STYLE_LINE_PREFIX)) {
                if (format == null) {
                    Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: ".concat(readLine));
                } else {
                    SsaStyle fromStyleLine = SsaStyle.fromStyleLine(readLine, format);
                    if (fromStyleLine != null) {
                        linkedHashMap.put(fromStyleLine.name, fromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 3600000000L);
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                r7.L("Unknown alignment: ", i, TAG);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                r7.L("Unknown alignment: ", i, TAG);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                r7.L("Unknown alignment: ", i, TAG);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.parsableByteArray.reset(bArr, i + i2);
        this.parsableByteArray.setPosition(i);
        Charset detectUtfCharset = detectUtfCharset(this.parsableByteArray);
        if (!this.haveInitializationData) {
            parseHeader(this.parsableByteArray, detectUtfCharset);
        }
        parseEventBody(this.parsableByteArray, arrayList, arrayList2, detectUtfCharset);
        ArrayList arrayList3 = (outputOptions.startTimeUs == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            List list = (List) arrayList.get(i4);
            if (!list.isEmpty() || i4 == 0) {
                if (i4 == arrayList.size() - 1) {
                    s83.r();
                    return;
                }
                long longValue = ((Long) arrayList2.get(i4)).longValue();
                long longValue2 = ((Long) arrayList2.get(i4 + 1)).longValue();
                CuesWithTiming cuesWithTiming = new CuesWithTiming(list, longValue, longValue2 - longValue);
                long j = outputOptions.startTimeUs;
                if (j == C.TIME_UNSET || longValue2 >= j) {
                    consumer.accept(cuesWithTiming);
                } else if (arrayList3 != null) {
                    arrayList3.add(cuesWithTiming);
                }
            }
        }
        if (arrayList3 != null) {
            int size = arrayList3.size();
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
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

    public SsaParser() {
        this(null);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final /* synthetic */ void parse(byte[] bArr, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        b.a(this, bArr, outputOptions, consumer);
    }
}

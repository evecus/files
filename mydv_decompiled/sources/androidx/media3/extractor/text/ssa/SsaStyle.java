package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.j42;
import defpackage.r7;
import defpackage.sp0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;
    public final Integer outlineColor;
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.nameIndex = i;
            this.alignmentIndex = i2;
            this.primaryColorIndex = i3;
            this.outlineColorIndex = i4;
            this.fontSizeIndex = i5;
            this.boldIndex = i6;
            this.italicIndex = i7;
            this.underlineIndex = i8;
            this.strikeoutIndex = i9;
            this.borderStyleIndex = i10;
            this.length = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static Format fromFormatLine(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < split.length; i11++) {
                String j0 = j42.j0(split[i11].trim());
                j0.getClass();
                switch (j0.hashCode()) {
                    case -1178781136:
                        if (j0.equals(TtmlNode.ITALIC)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026963764:
                        if (j0.equals(TtmlNode.UNDERLINE)) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192095652:
                        if (j0.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (j0.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (j0.equals(TtmlNode.BOLD)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (j0.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (j0.equals("fontsize")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 767321349:
                        if (j0.equals("borderstyle")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (j0.equals("alignment")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1988365454:
                        if (j0.equals("outlinecolour")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i7 = i11;
                        break;
                    case 1:
                        i8 = i11;
                        break;
                    case 2:
                        i9 = i11;
                        break;
                    case 3:
                        i3 = i11;
                        break;
                    case 4:
                        i6 = i11;
                        break;
                    case 5:
                        i = i11;
                        break;
                    case 6:
                        i5 = i11;
                        break;
                    case 7:
                        i10 = i11;
                        break;
                    case '\b':
                        i2 = i11;
                        break;
                    case '\t':
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new Format(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, split.length);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i, PointF pointF) {
            this.alignment = i;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (!matcher.find()) {
                return -1;
            }
            String group = matcher.group(1);
            group.getClass();
            return SsaStyle.parseAlignment(group);
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                try {
                    PointF parsePosition = parsePosition(group);
                    if (parsePosition != null) {
                        pointF = parsePosition;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int parseAlignmentOverride = parseAlignmentOverride(group);
                    if (parseAlignmentOverride != -1) {
                        i = parseAlignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i, pointF);
        }

        private static PointF parsePosition(String str) {
            String group;
            String group2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private SsaStyle(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.name = str;
        this.alignment = i;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f;
        this.bold = z;
        this.italic = z2;
        this.underline = z3;
        this.strikeout = z4;
        this.borderStyle = i2;
    }

    public static SsaStyle fromStyleLine(String str, Format format) {
        sp0.o(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = format.length;
        if (length != i) {
            Log.w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[format.nameIndex].trim();
            int i2 = format.alignmentIndex;
            int parseAlignment = i2 != -1 ? parseAlignment(split[i2].trim()) : -1;
            int i3 = format.primaryColorIndex;
            Integer parseColor = i3 != -1 ? parseColor(split[i3].trim()) : null;
            int i4 = format.outlineColorIndex;
            Integer parseColor2 = i4 != -1 ? parseColor(split[i4].trim()) : null;
            int i5 = format.fontSizeIndex;
            float parseFontSize = i5 != -1 ? parseFontSize(split[i5].trim()) : -3.4028235E38f;
            int i6 = format.boldIndex;
            boolean z = i6 != -1 && parseBooleanValue(split[i6].trim());
            int i7 = format.italicIndex;
            boolean z2 = i7 != -1 && parseBooleanValue(split[i7].trim());
            int i8 = format.underlineIndex;
            boolean z3 = i8 != -1 && parseBooleanValue(split[i8].trim());
            int i9 = format.strikeoutIndex;
            boolean z4 = i9 != -1 && parseBooleanValue(split[i9].trim());
            int i10 = format.borderStyleIndex;
            return new SsaStyle(trim, parseAlignment, parseColor, parseColor2, parseFontSize, z, z2, z3, z4, i10 != -1 ? parseBorderStyle(split[i10].trim()) : -1);
        } catch (RuntimeException e) {
            Log.w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e);
            return null;
        }
    }

    private static boolean isValidAlignment(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i) {
        return i == 1 || i == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidAlignment(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r7.M("Ignoring unknown alignment: ", str, TAG);
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    private static int parseBorderStyle(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidBorderStyle(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        r7.M("Ignoring unknown BorderStyle: ", str, TAG);
        return -1;
    }

    public static Integer parseColor(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            sp0.o(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(sp0.B(((parseLong >> 24) & 255) ^ 255), sp0.B(parseLong & 255), sp0.B((parseLong >> 8) & 255), sp0.B((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            Log.w(TAG, "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}

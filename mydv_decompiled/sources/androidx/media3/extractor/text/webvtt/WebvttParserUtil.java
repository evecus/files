package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import defpackage.s83;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = Pattern.compile("^NOTE([ \t].*)?$");
    private static final String WEBVTT_HEADER = "WEBVTT";

    private WebvttParserUtil() {
    }

    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
        String readLine;
        while (true) {
            String readLine2 = parsableByteArray.readLine();
            if (readLine2 == null) {
                return null;
            }
            if (COMMENT.matcher(readLine2).matches()) {
                do {
                    readLine = parsableByteArray.readLine();
                    if (readLine != null) {
                    }
                } while (!readLine.isEmpty());
            } else {
                Matcher matcher = WebvttCueParser.CUE_HEADER_PATTERN.matcher(readLine2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        String readLine = parsableByteArray.readLine();
        return readLine != null && readLine.startsWith(WEBVTT_HEADER);
    }

    public static float parsePercentage(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) {
        String[] splitAtFirst = Util.splitAtFirst(str, "\\.");
        long j = 0;
        for (String str2 : Util.split(splitAtFirst[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (splitAtFirst.length == 2) {
            String trim = splitAtFirst[1].trim();
            if (trim.length() != 3) {
                s83.t("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }
}

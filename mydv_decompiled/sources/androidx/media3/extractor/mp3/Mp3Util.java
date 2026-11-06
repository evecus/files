package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
class Mp3Util {
    private Mp3Util() {
    }

    public static int computeAverageBitrate(long j, long j2) {
        if (j > 0 && j2 > 0) {
            long scaleLargeValue = Util.scaleLargeValue(j, 8000000L, j2, RoundingMode.HALF_UP);
            if (scaleLargeValue > 0 && scaleLargeValue <= 2147483647L) {
                return (int) scaleLargeValue;
            }
        }
        return C.RATE_UNSET_INT;
    }
}

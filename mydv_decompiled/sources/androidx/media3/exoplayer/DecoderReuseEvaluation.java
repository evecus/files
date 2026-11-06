package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.Format;
import defpackage.hf1;
import defpackage.sp0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class DecoderReuseEvaluation {
    public static final int DISCARD_REASON_APP_OVERRIDE = 4;
    public static final int DISCARD_REASON_AUDIO_BYPASS_POSSIBLE = 32768;
    public static final int DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED = 4096;
    public static final int DISCARD_REASON_AUDIO_ENCODING_CHANGED = 16384;
    public static final int DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED = 8192;
    public static final int DISCARD_REASON_DRM_SESSION_CHANGED = 128;
    public static final int DISCARD_REASON_INITIALIZATION_DATA_CHANGED = 32;
    public static final int DISCARD_REASON_MAX_INPUT_SIZE_EXCEEDED = 64;
    public static final int DISCARD_REASON_MIME_TYPE_CHANGED = 8;
    public static final int DISCARD_REASON_OPERATING_RATE_CHANGED = 16;
    public static final int DISCARD_REASON_REUSE_NOT_IMPLEMENTED = 1;
    public static final int DISCARD_REASON_VIDEO_COLOR_INFO_CHANGED = 2048;
    public static final int DISCARD_REASON_VIDEO_FRAME_RATE_CHANGED = 65536;
    public static final int DISCARD_REASON_VIDEO_MAX_RESOLUTION_EXCEEDED = 256;
    public static final int DISCARD_REASON_VIDEO_RESOLUTION_CHANGED = 512;
    public static final int DISCARD_REASON_VIDEO_ROTATION_CHANGED = 1024;
    public static final int DISCARD_REASON_WORKAROUND = 2;
    public static final int REUSE_RESULT_NO = 0;
    public static final int REUSE_RESULT_YES_WITHOUT_RECONFIGURATION = 3;
    public static final int REUSE_RESULT_YES_WITH_FLUSH = 1;
    public static final int REUSE_RESULT_YES_WITH_RECONFIGURATION = 2;
    public final String decoderName;
    public final int discardReasons;
    public final Format newFormat;
    public final Format oldFormat;
    public final int result;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface DecoderDiscardReasons {
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface DecoderReuseResult {
    }

    public DecoderReuseEvaluation(String str, Format format, Format format2, int i, int i2) {
        sp0.o(i == 0 || i2 == 0);
        sp0.o(true ^ TextUtils.isEmpty(str));
        this.decoderName = str;
        format.getClass();
        this.oldFormat = format;
        format2.getClass();
        this.newFormat = format2;
        this.result = i;
        this.discardReasons = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.result == decoderReuseEvaluation.result && this.discardReasons == decoderReuseEvaluation.discardReasons && this.decoderName.equals(decoderReuseEvaluation.decoderName) && this.oldFormat.equals(decoderReuseEvaluation.oldFormat) && this.newFormat.equals(decoderReuseEvaluation.newFormat)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.newFormat.hashCode() + ((this.oldFormat.hashCode() + hf1.n((((527 + this.result) * 31) + this.discardReasons) * 31, 31, this.decoderName)) * 31);
    }
}

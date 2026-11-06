package androidx.media3.common.video;

import androidx.media3.common.Format;
import defpackage.iy1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public interface Frame {
    public static final String KEY_DISPLAY_TIME_NS = "KEY_DISPLAY_TIME_NS";
    public static final String KEY_PRESENTATION_TIME_US = "KEY_PRESENTATION_TIME_US";
    public static final long USAGE_COMPOSER_OVERLAY = 2048;
    public static final long USAGE_CPU_READ_OFTEN = 3;
    public static final long USAGE_CPU_READ_RARELY = 2;
    public static final long USAGE_CPU_WRITE_OFTEN = 48;
    public static final long USAGE_CPU_WRITE_RARELY = 32;
    public static final long USAGE_GPU_COLOR_OUTPUT = 512;
    public static final long USAGE_GPU_SAMPLED_IMAGE = 256;
    public static final long USAGE_VIDEO_ENCODE = 65536;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Usage {
    }

    long getContentTimeUs();

    Format getFormat();

    iy1 getMetadata();
}

package defpackage;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public abstract class e25 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final q8 f;

    static {
        String str;
        int i = h15.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = oh4.t("kotlinx.coroutines.scheduler.resolution.ns", SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1L, Long.MAX_VALUE);
        int i2 = h15.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = oh4.u(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = oh4.u(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(oh4.t("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = q8.u0;
    }
}

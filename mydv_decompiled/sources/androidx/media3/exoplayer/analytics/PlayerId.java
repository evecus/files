package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import android.os.Build;
import defpackage.sp0;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PlayerId {
    private final LogSessionIdApi31 logSessionIdApi31;
    public final String name;
    public static final PlayerId UNSET = new PlayerId("");
    public static final PlayerId PRELOAD = new PlayerId("preload");

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class LogSessionIdApi31 {
        public LogSessionId logSessionId;

        public LogSessionIdApi31() {
            LogSessionId logSessionId;
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            this.logSessionId = logSessionId;
        }

        public void setLogSessionId(LogSessionId logSessionId) {
            LogSessionId logSessionId2;
            LogSessionId logSessionId3 = this.logSessionId;
            logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
            sp0.z(logSessionId3.equals(logSessionId2));
            this.logSessionId = logSessionId;
        }
    }

    public PlayerId(String str) {
        this.name = str;
        this.logSessionIdApi31 = Build.VERSION.SDK_INT >= 31 ? new LogSessionIdApi31() : null;
    }

    public synchronized LogSessionId getLogSessionId() {
        LogSessionIdApi31 logSessionIdApi31;
        logSessionIdApi31 = this.logSessionIdApi31;
        logSessionIdApi31.getClass();
        return logSessionIdApi31.logSessionId;
    }

    public synchronized void setLogSessionId(LogSessionId logSessionId) {
        LogSessionIdApi31 logSessionIdApi31 = this.logSessionIdApi31;
        logSessionIdApi31.getClass();
        logSessionIdApi31.setLogSessionId(logSessionId);
    }
}

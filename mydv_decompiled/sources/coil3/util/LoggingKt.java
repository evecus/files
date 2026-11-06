package coil3.util;

import coil3.util.Logger;
import defpackage.rm1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class LoggingKt {
    public static final void log(Logger logger, String str, Throwable th, rm1 rm1Var) {
        Logger.Level minLevel = logger.getMinLevel();
        Logger.Level level = Logger.Level.Error;
        if (minLevel.compareTo(level) <= 0) {
            logger.log(str, level, (String) rm1Var.invoke(), th);
        }
    }

    public static final void log(Logger logger, String str, Throwable th) {
        Logger.Level minLevel = logger.getMinLevel();
        Logger.Level level = Logger.Level.Error;
        if (minLevel.compareTo(level) <= 0) {
            logger.log(str, level, null, th);
        }
    }

    public static final void log(Logger logger, String str, Logger.Level level, rm1 rm1Var) {
        if (logger.getMinLevel().compareTo(level) <= 0) {
            logger.log(str, level, (String) rm1Var.invoke(), null);
        }
    }
}

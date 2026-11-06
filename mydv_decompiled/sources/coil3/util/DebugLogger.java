package coil3.util;

import coil3.util.Logger;
import defpackage.er0;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DebugLogger implements Logger {
    private Logger.Level minLevel;

    public /* synthetic */ DebugLogger(Logger.Level level, int i, er0 er0Var) {
        this((i & 1) != 0 ? Logger.Level.Debug : level);
    }

    @Override // coil3.util.Logger
    public Logger.Level getMinLevel() {
        return this.minLevel;
    }

    @Override // coil3.util.Logger
    public void log(String str, Logger.Level level, String str2, Throwable th) {
        if (str2 != null) {
            Utils_androidKt.println(level, str, str2);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            stringWriter2.getClass();
            Utils_androidKt.println(level, str, stringWriter2);
        }
    }

    @Override // coil3.util.Logger
    public void setMinLevel(Logger.Level level) {
        this.minLevel = level;
    }

    public DebugLogger(Logger.Level level) {
        this.minLevel = level;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebugLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}

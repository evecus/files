package okhttp3.internal.platform.android;

import android.util.Log;
import defpackage.jx4;
import defpackage.sv2;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class AndroidLog {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final Map<String, String> knownLoggers;
    public static final AndroidLog INSTANCE = new AndroidLog();
    private static final CopyOnWriteArraySet<Logger> configuredLoggers = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = OkHttpClient.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(OkHttpClient.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(Http2.class.getName(), "okhttp.Http2");
        linkedHashMap.put(TaskRunner.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        knownLoggers = sv2.X(linkedHashMap);
    }

    private AndroidLog() {
    }

    public static /* synthetic */ void androidLog$okhttp$default(AndroidLog androidLog, String str, int i, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            th = null;
        }
        androidLog.androidLog$okhttp(str, i, str2, th);
    }

    private final void enableLogging(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (configuredLoggers.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(AndroidLogHandler.INSTANCE);
        }
    }

    private final String loggerTag(String str) {
        String str2 = knownLoggers.get(str);
        return str2 == null ? jx4.f0(23, str) : str2;
    }

    public final void androidLog$okhttp(String str, int i, String str2, Throwable th) {
        int min;
        str.getClass();
        str2.getClass();
        String loggerTag = loggerTag(str);
        if (Log.isLoggable(loggerTag, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int I = jx4.I(str2, '\n', i2, 4);
                if (I == -1) {
                    I = length;
                }
                while (true) {
                    min = Math.min(I, i2 + MAX_LOG_LENGTH);
                    Log.println(i, loggerTag, str2.substring(i2, min));
                    if (min >= I) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public final void enable() {
        try {
            for (Map.Entry<String, String> entry : knownLoggers.entrySet()) {
                enableLogging(entry.getKey(), entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
    }
}

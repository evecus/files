package androidx.media3.common;

import java.util.HashSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class MediaLibraryInfo {
    public static final int INTERFACE_VERSION = 10;
    public static final String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "1.11.1";
    public static final int VERSION_INT = 1011001300;
    public static final String VERSION_SLASHY = "AndroidXMedia3/1.11.1";
    private static boolean enableWorkarounds = true;
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "media3.common";

    private MediaLibraryInfo() {
    }

    public static boolean enableWorkarounds() {
        return enableWorkarounds;
    }

    public static synchronized void registerModule(String str) {
        synchronized (MediaLibraryInfo.class) {
            if (registeredModules.add(str)) {
                registeredModulesString += ", " + str;
            }
        }
    }

    public static synchronized String registeredModules() {
        String str;
        synchronized (MediaLibraryInfo.class) {
            str = registeredModulesString;
        }
        return str;
    }

    public static void setEnableWorkarounds(boolean z) {
        enableWorkarounds = z;
    }
}

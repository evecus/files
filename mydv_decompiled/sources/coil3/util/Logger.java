package coil3.util;

import defpackage.sp0;
import defpackage.ya1;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public interface Logger {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes2.dex */
    public static final class Level {
        private static final /* synthetic */ ya1 $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level Verbose = new Level("Verbose", 0);
        public static final Level Debug = new Level("Debug", 1);
        public static final Level Info = new Level("Info", 2);
        public static final Level Warn = new Level("Warn", 3);
        public static final Level Error = new Level("Error", 4);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{Verbose, Debug, Info, Warn, Error};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = sp0.I($values);
        }

        private Level(String str, int i) {
        }

        public static ya1 getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    Level getMinLevel();

    void log(String str, Level level, String str2, Throwable th);

    void setMinLevel(Level level);
}

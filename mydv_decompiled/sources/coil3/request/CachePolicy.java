package coil3.request;

import defpackage.sp0;
import defpackage.ya1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class CachePolicy {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ CachePolicy[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final CachePolicy ENABLED = new CachePolicy("ENABLED", 0, true, true);
    public static final CachePolicy READ_ONLY = new CachePolicy("READ_ONLY", 1, true, false);
    public static final CachePolicy WRITE_ONLY = new CachePolicy("WRITE_ONLY", 2, false, true);
    public static final CachePolicy DISABLED = new CachePolicy("DISABLED", 3, false, false);

    private static final /* synthetic */ CachePolicy[] $values() {
        return new CachePolicy[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    static {
        CachePolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sp0.I($values);
    }

    private CachePolicy(String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public static ya1 getEntries() {
        return $ENTRIES;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) $VALUES.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}

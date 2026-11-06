package coil3.size;

import defpackage.sp0;
import defpackage.ya1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Precision {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ Precision[] $VALUES;
    public static final Precision EXACT = new Precision("EXACT", 0);
    public static final Precision INEXACT = new Precision("INEXACT", 1);

    private static final /* synthetic */ Precision[] $values() {
        return new Precision[]{EXACT, INEXACT};
    }

    static {
        Precision[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sp0.I($values);
    }

    private Precision(String str, int i) {
    }

    public static ya1 getEntries() {
        return $ENTRIES;
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) $VALUES.clone();
    }
}

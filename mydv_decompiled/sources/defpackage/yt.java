package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yt {
    public static final /* synthetic */ yt[] I = {new yt("PRESENT", 0), new yt("ABSENT", 1), new yt("PRESENT_OPTIONAL", 2), new yt("ABSENT_OPTIONAL", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    yt EF5;

    public static yt valueOf(String str) {
        return (yt) Enum.valueOf(yt.class, str);
    }

    public static yt[] values() {
        return (yt[]) I.clone();
    }
}

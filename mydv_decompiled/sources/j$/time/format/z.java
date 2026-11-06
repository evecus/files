package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes3.dex */
public final class z {
    public static final z LENIENT;
    public static final z SMART;
    public static final z STRICT;
    public static final /* synthetic */ z[] a;

    static {
        z zVar = new z("STRICT", 0);
        STRICT = zVar;
        z zVar2 = new z("SMART", 1);
        SMART = zVar2;
        z zVar3 = new z("LENIENT", 2);
        LENIENT = zVar3;
        a = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) a.clone();
    }
}

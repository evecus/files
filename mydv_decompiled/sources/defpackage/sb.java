package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sb {
    public static final sb I;
    public static final sb J;
    public static final /* synthetic */ sb[] K;

    static {
        sb sbVar = new sb("SHOW_ORIGINAL", 0);
        I = sbVar;
        sb sbVar2 = new sb("SHOW_TRANSLATED", 1);
        J = sbVar2;
        K = new sb[]{sbVar, sbVar2};
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) K.clone();
    }
}

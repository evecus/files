package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a52 {
    public static final a52 I;
    public static final a52 J;
    public static final a52 K;
    public static final a52 L;
    public static final /* synthetic */ a52[] M;

    static {
        a52 a52Var = new a52("LookaheadMeasurement", 0);
        I = a52Var;
        a52 a52Var2 = new a52("LookaheadPlacement", 1);
        J = a52Var2;
        a52 a52Var3 = new a52("Measurement", 2);
        K = a52Var3;
        a52 a52Var4 = new a52("Placement", 3);
        L = a52Var4;
        M = new a52[]{a52Var, a52Var2, a52Var3, a52Var4};
    }

    public static a52 valueOf(String str) {
        return (a52) Enum.valueOf(a52.class, str);
    }

    public static a52[] values() {
        return (a52[]) M.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class a90 {
    public static final jp I;
    public static final a90 J;
    public static final a90 K;
    public static final a90 L;
    public static final /* synthetic */ a90[] M;

    static {
        a90 a90Var = new a90("SPEC_2021", 0);
        K = a90Var;
        a90 a90Var2 = new a90("SPEC_2025", 1);
        L = a90Var2;
        M = new a90[]{a90Var, a90Var2};
        I = new jp((byte) 8);
        J = a90Var;
    }

    public static a90 valueOf(String str) {
        return (a90) Enum.valueOf(a90.class, str);
    }

    public static a90[] values() {
        return (a90[]) M.clone();
    }
}

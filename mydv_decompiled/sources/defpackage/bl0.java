package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class bl0 {
    public static final bl0 I;
    public static final bl0 J;
    public static final bl0 K;
    public static final bl0 L;
    public static final bl0 M;
    public static final /* synthetic */ bl0[] N;

    static {
        bl0 bl0Var = new bl0("CPU_ACQUIRED", 0);
        I = bl0Var;
        bl0 bl0Var2 = new bl0("BLOCKING", 1);
        J = bl0Var2;
        bl0 bl0Var3 = new bl0("PARKING", 2);
        K = bl0Var3;
        bl0 bl0Var4 = new bl0("DORMANT", 3);
        L = bl0Var4;
        bl0 bl0Var5 = new bl0("TERMINATED", 4);
        M = bl0Var5;
        N = new bl0[]{bl0Var, bl0Var2, bl0Var3, bl0Var4, bl0Var5};
    }

    public static bl0 valueOf(String str) {
        return (bl0) Enum.valueOf(bl0.class, str);
    }

    public static bl0[] values() {
        return (bl0[]) N.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class j51 {
    public static final jp I;
    public static final j51 J;
    public static final j51 K;
    public static final j51 L;
    public static final /* synthetic */ j51[] M;

    static {
        j51 j51Var = new j51("PHONE", 0);
        K = j51Var;
        j51 j51Var2 = new j51("WATCH", 1);
        L = j51Var2;
        M = new j51[]{j51Var, j51Var2};
        I = new jp((byte) 19);
        J = j51Var;
    }

    public static j51 valueOf(String str) {
        return (j51) Enum.valueOf(j51.class, str);
    }

    public static j51[] values() {
        return (j51[]) M.clone();
    }
}

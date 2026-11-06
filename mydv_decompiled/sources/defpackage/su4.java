package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class su4 {
    public static final su4 I;
    public static final su4 J;
    public static final /* synthetic */ su4[] K;

    static {
        su4 su4Var = new su4("Full", 0);
        I = su4Var;
        su4 su4Var2 = new su4("Side", 1);
        J = su4Var2;
        K = new su4[]{su4Var, su4Var2};
    }

    public static su4 valueOf(String str) {
        return (su4) Enum.valueOf(su4.class, str);
    }

    public static su4[] values() {
        return (su4[]) K.clone();
    }
}

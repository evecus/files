package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class e53 {
    public static final e53 I;
    public static final /* synthetic */ e53[] J;

    static {
        e53 e53Var = new e53("Default", 0);
        I = e53Var;
        J = new e53[]{e53Var, new e53("UserInput", 1), new e53("PreventUserInput", 2)};
    }

    public static e53 valueOf(String str) {
        return (e53) Enum.valueOf(e53.class, str);
    }

    public static e53[] values() {
        return (e53[]) J.clone();
    }
}

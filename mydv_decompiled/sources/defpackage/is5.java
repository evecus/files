package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class is5 {
    public static final is5 I;
    public static final /* synthetic */ is5[] J;

    static {
        is5 is5Var = new is5("Visible", 0);
        I = is5Var;
        J = new is5[]{is5Var, new is5("Invisible", 1), new is5("Gone", 2)};
    }

    public static is5 valueOf(String str) {
        return (is5) Enum.valueOf(is5.class, str);
    }

    public static is5[] values() {
        return (is5[]) J.clone();
    }
}

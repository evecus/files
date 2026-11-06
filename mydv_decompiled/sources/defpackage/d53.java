package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d53 {
    public static final d53 I;
    public static final d53 J;
    public static final /* synthetic */ d53[] K;

    static {
        d53 d53Var = new d53("Default", 0);
        I = d53Var;
        d53 d53Var2 = new d53("UserInput", 1);
        J = d53Var2;
        K = new d53[]{d53Var, d53Var2, new d53("PreventUserInput", 2)};
    }

    public static d53 valueOf(String str) {
        return (d53) Enum.valueOf(d53.class, str);
    }

    public static d53[] values() {
        return (d53[]) K.clone();
    }
}

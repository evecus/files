package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class h85 {
    public static final h85 I;
    public static final h85 J;
    public static final /* synthetic */ h85[] K;

    static {
        h85 h85Var = new h85("On", 0);
        I = h85Var;
        h85 h85Var2 = new h85("Off", 1);
        J = h85Var2;
        K = new h85[]{h85Var, h85Var2, new h85("Indeterminate", 2)};
    }

    public static h85 valueOf(String str) {
        return (h85) Enum.valueOf(h85.class, str);
    }

    public static h85[] values() {
        return (h85[]) K.clone();
    }
}

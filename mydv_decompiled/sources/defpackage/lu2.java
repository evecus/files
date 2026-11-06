package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class lu2 {
    public static final lu2 I;
    public static final lu2 J;
    public static final lu2 K;
    public static final /* synthetic */ lu2[] L;

    static {
        lu2 lu2Var = new lu2("BottomBar", 0);
        I = lu2Var;
        lu2 lu2Var2 = new lu2("RailOnBrowse", 1);
        J = lu2Var2;
        lu2 lu2Var3 = new lu2("Drawer", 2);
        K = lu2Var3;
        L = new lu2[]{lu2Var, lu2Var2, lu2Var3};
    }

    public static lu2 valueOf(String str) {
        return (lu2) Enum.valueOf(lu2.class, str);
    }

    public static lu2[] values() {
        return (lu2[]) L.clone();
    }
}

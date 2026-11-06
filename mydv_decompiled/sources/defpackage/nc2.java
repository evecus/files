package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class nc2 {
    public static final nc2 I;
    public static final nc2 J;
    public static final nc2 K;
    public static final nc2 L;
    public static final /* synthetic */ nc2[] M;

    static {
        nc2 nc2Var = new nc2("Wrap", 0);
        I = nc2Var;
        nc2 nc2Var2 = new nc2("Fixed", 1);
        J = nc2Var2;
        nc2 nc2Var3 = new nc2("Expand", 2);
        K = nc2Var3;
        nc2 nc2Var4 = new nc2("MatchParent", 3);
        L = nc2Var4;
        M = new nc2[]{nc2Var, nc2Var2, nc2Var3, nc2Var4};
    }

    public static nc2 valueOf(String str) {
        return (nc2) Enum.valueOf(nc2.class, str);
    }

    public static nc2[] values() {
        return (nc2[]) M.clone();
    }
}

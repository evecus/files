package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ac1 {
    public static final ac1 I;
    public static final ac1 J;
    public static final ac1 K;
    public static final ac1 L;
    public static final /* synthetic */ ac1[] M;

    static {
        ac1 ac1Var = new ac1("REPLACE", 0);
        I = ac1Var;
        ac1 ac1Var2 = new ac1("KEEP", 1);
        J = ac1Var2;
        ac1 ac1Var3 = new ac1("APPEND", 2);
        K = ac1Var3;
        ac1 ac1Var4 = new ac1("APPEND_OR_REPLACE", 3);
        L = ac1Var4;
        M = new ac1[]{ac1Var, ac1Var2, ac1Var3, ac1Var4};
    }

    public static ac1 valueOf(String str) {
        return (ac1) Enum.valueOf(ac1.class, str);
    }

    public static ac1[] values() {
        return (ac1[]) M.clone();
    }
}

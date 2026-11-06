package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class lp3 {
    public static final lp3 I;
    public static final lp3 J;
    public static final lp3 K;
    public static final /* synthetic */ lp3[] L;

    static {
        lp3 lp3Var = new lp3("Initial", 0);
        I = lp3Var;
        lp3 lp3Var2 = new lp3("Main", 1);
        J = lp3Var2;
        lp3 lp3Var3 = new lp3("Final", 2);
        K = lp3Var3;
        L = new lp3[]{lp3Var, lp3Var2, lp3Var3};
    }

    public static lp3 valueOf(String str) {
        return (lp3) Enum.valueOf(lp3.class, str);
    }

    public static lp3[] values() {
        return (lp3[]) L.clone();
    }
}

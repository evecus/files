package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class iz3 {
    public static final iz3 I;
    public static final iz3 J;
    public static final iz3 K;
    public static final /* synthetic */ iz3[] L;

    static {
        iz3 iz3Var = new iz3("RED", 0);
        I = iz3Var;
        iz3 iz3Var2 = new iz3("GREEN", 1);
        J = iz3Var2;
        iz3 iz3Var3 = new iz3("BLUE", 2);
        K = iz3Var3;
        L = new iz3[]{iz3Var, iz3Var2, iz3Var3};
    }

    public static iz3 valueOf(String str) {
        return (iz3) Enum.valueOf(iz3.class, str);
    }

    public static iz3[] values() {
        return (iz3[]) L.clone();
    }
}

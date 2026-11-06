package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class xj3 {
    public static final xj3 I;
    public static final xj3 J;
    public static final xj3 K;
    public static final /* synthetic */ xj3[] L;

    static {
        xj3 xj3Var = new xj3("Start", 0);
        I = xj3Var;
        xj3 xj3Var2 = new xj3("End", 1);
        J = xj3Var2;
        xj3 xj3Var3 = new xj3("Bottom", 2);
        K = xj3Var3;
        L = new xj3[]{xj3Var, xj3Var2, xj3Var3};
    }

    public static xj3 valueOf(String str) {
        return (xj3) Enum.valueOf(xj3.class, str);
    }

    public static xj3[] values() {
        return (xj3[]) L.clone();
    }
}

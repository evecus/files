package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class di4 {
    public static final di4 I;
    public static final di4 J;
    public static final di4 K;
    public static final /* synthetic */ di4[] L;

    static {
        di4 di4Var = new di4("Left", 0);
        I = di4Var;
        di4 di4Var2 = new di4("Middle", 1);
        J = di4Var2;
        di4 di4Var3 = new di4("Right", 2);
        K = di4Var3;
        L = new di4[]{di4Var, di4Var2, di4Var3};
    }

    public static di4 valueOf(String str) {
        return (di4) Enum.valueOf(di4.class, str);
    }

    public static di4[] values() {
        return (di4[]) L.clone();
    }
}

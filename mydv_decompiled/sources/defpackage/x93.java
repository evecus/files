package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class x93 {
    public static final x93 I;
    public static final x93 J;
    public static final x93 K;
    public static final x93 L;
    public static final x93 M;
    public static final x93 N;
    public static final /* synthetic */ x93[] O;

    static {
        x93 x93Var = new x93("NOT_REQUIRED", 0);
        I = x93Var;
        x93 x93Var2 = new x93("CONNECTED", 1);
        J = x93Var2;
        x93 x93Var3 = new x93("UNMETERED", 2);
        K = x93Var3;
        x93 x93Var4 = new x93("NOT_ROAMING", 3);
        L = x93Var4;
        x93 x93Var5 = new x93("METERED", 4);
        M = x93Var5;
        x93 x93Var6 = new x93("TEMPORARILY_UNMETERED", 5);
        N = x93Var6;
        O = new x93[]{x93Var, x93Var2, x93Var3, x93Var4, x93Var5, x93Var6};
    }

    public static x93 valueOf(String str) {
        return (x93) Enum.valueOf(x93.class, str);
    }

    public static x93[] values() {
        return (x93[]) O.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class o11 {
    public static final o11 I;
    public static final o11 J;
    public static final o11 K;
    public static final o11 L;
    public static final /* synthetic */ o11[] M;

    static {
        o11 o11Var = new o11("Up", 0);
        I = o11Var;
        o11 o11Var2 = new o11("Drag", 1);
        J = o11Var2;
        o11 o11Var3 = new o11("Timeout", 2);
        K = o11Var3;
        o11 o11Var4 = new o11("Cancel", 3);
        L = o11Var4;
        M = new o11[]{o11Var, o11Var2, o11Var3, o11Var4};
    }

    public static o11 valueOf(String str) {
        return (o11) Enum.valueOf(o11.class, str);
    }

    public static o11[] values() {
        return (o11[]) M.clone();
    }
}

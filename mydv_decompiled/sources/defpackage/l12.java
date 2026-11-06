package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class l12 {
    public static final l12 I;
    public static final l12 J;
    public static final l12 K;
    public static final /* synthetic */ l12[] L;

    static {
        l12 l12Var = new l12("Focused", 0);
        I = l12Var;
        l12 l12Var2 = new l12("UnfocusedEmpty", 1);
        J = l12Var2;
        l12 l12Var3 = new l12("UnfocusedNotEmpty", 2);
        K = l12Var3;
        L = new l12[]{l12Var, l12Var2, l12Var3};
    }

    public static l12 valueOf(String str) {
        return (l12) Enum.valueOf(l12.class, str);
    }

    public static l12[] values() {
        return (l12[]) L.clone();
    }
}

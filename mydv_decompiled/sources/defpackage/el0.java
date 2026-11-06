package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class el0 {
    public static final el0 I;
    public static final el0 J;
    public static final el0 K;
    public static final /* synthetic */ el0[] L;

    static {
        el0 el0Var = new el0("COROUTINE_SUSPENDED", 0);
        I = el0Var;
        el0 el0Var2 = new el0("UNDECIDED", 1);
        J = el0Var2;
        el0 el0Var3 = new el0("RESUMED", 2);
        K = el0Var3;
        L = new el0[]{el0Var, el0Var2, el0Var3};
    }

    public static el0 valueOf(String str) {
        return (el0) Enum.valueOf(el0.class, str);
    }

    public static el0[] values() {
        return (el0[]) L.clone();
    }
}

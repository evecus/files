package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class um0 {
    public static final um0 I;
    public static final um0 J;
    public static final um0 K;
    public static final /* synthetic */ um0[] L;

    static {
        um0 um0Var = new um0("None", 0);
        I = um0Var;
        um0 um0Var2 = new um0("Cancelled", 1);
        J = um0Var2;
        um0 um0Var3 = new um0("Redirected", 2);
        K = um0Var3;
        L = new um0[]{um0Var, um0Var2, um0Var3, new um0("RedirectCancelled", 3)};
    }

    public static um0 valueOf(String str) {
        return (um0) Enum.valueOf(um0.class, str);
    }

    public static um0[] values() {
        return (um0[]) L.clone();
    }
}

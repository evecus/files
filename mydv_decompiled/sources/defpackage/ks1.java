package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ks1 {
    public static final ks1 I;
    public static final ks1 J;
    public static final ks1 K;
    public static final /* synthetic */ ks1[] L;

    static {
        ks1 ks1Var = new ks1("None", 0);
        I = ks1Var;
        ks1 ks1Var2 = new ks1("Selection", 1);
        J = ks1Var2;
        ks1 ks1Var3 = new ks1("Cursor", 2);
        K = ks1Var3;
        L = new ks1[]{ks1Var, ks1Var2, ks1Var3};
    }

    public static ks1 valueOf(String str) {
        return (ks1) Enum.valueOf(ks1.class, str);
    }

    public static ks1[] values() {
        return (ks1[]) L.clone();
    }
}

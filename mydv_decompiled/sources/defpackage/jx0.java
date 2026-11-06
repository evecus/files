package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class jx0 {
    public static final jx0 I;
    public static final jx0 J;
    public static final jx0 K;
    public static final /* synthetic */ jx0[] L;

    static {
        jx0 jx0Var = new jx0("Vertical", 0);
        I = jx0Var;
        jx0 jx0Var2 = new jx0("Horizontal", 1);
        J = jx0Var2;
        jx0 jx0Var3 = new jx0("Both", 2);
        K = jx0Var3;
        L = new jx0[]{jx0Var, jx0Var2, jx0Var3};
    }

    public static jx0 valueOf(String str) {
        return (jx0) Enum.valueOf(jx0.class, str);
    }

    public static jx0[] values() {
        return (jx0[]) L.clone();
    }
}

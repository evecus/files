package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class gl0 {
    public static final gl0 I;
    public static final gl0 J;
    public static final gl0 K;
    public static final gl0 L;
    public static final /* synthetic */ gl0[] M;

    static {
        gl0 gl0Var = new gl0("DEFAULT", 0);
        I = gl0Var;
        gl0 gl0Var2 = new gl0("LAZY", 1);
        J = gl0Var2;
        gl0 gl0Var3 = new gl0("ATOMIC", 2);
        K = gl0Var3;
        gl0 gl0Var4 = new gl0("UNDISPATCHED", 3);
        L = gl0Var4;
        M = new gl0[]{gl0Var, gl0Var2, gl0Var3, gl0Var4};
    }

    public static gl0 valueOf(String str) {
        return (gl0) Enum.valueOf(gl0.class, str);
    }

    public static gl0[] values() {
        return (gl0[]) M.clone();
    }
}

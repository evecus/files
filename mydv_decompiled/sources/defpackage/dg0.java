package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dg0 {
    public static final dg0 I;
    public static final dg0 J;
    public static final dg0 K;
    public static final dg0 L;
    public static final /* synthetic */ dg0[] M;

    static {
        dg0 dg0Var = new dg0("DISCONNECTED", 0);
        I = dg0Var;
        dg0 dg0Var2 = new dg0("WAITING", 1);
        J = dg0Var2;
        dg0 dg0Var3 = new dg0("CONNECTED", 2);
        K = dg0Var3;
        dg0 dg0Var4 = new dg0("ERROR", 3);
        L = dg0Var4;
        M = new dg0[]{dg0Var, dg0Var2, dg0Var3, dg0Var4};
    }

    public static dg0 valueOf(String str) {
        return (dg0) Enum.valueOf(dg0.class, str);
    }

    public static dg0[] values() {
        return (dg0[]) M.clone();
    }
}

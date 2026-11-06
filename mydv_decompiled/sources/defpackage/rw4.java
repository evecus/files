package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class rw4 {
    public static final rw4 I;
    public static final rw4 J;
    public static final rw4 K;
    public static final /* synthetic */ rw4[] L;

    static {
        rw4 rw4Var = new rw4("Empty", 0);
        I = rw4Var;
        rw4 rw4Var2 = new rw4("Error", 1);
        J = rw4Var2;
        rw4 rw4Var3 = new rw4("Guide", 2);
        K = rw4Var3;
        L = new rw4[]{rw4Var, rw4Var2, rw4Var3};
    }

    public static rw4 valueOf(String str) {
        return (rw4) Enum.valueOf(rw4.class, str);
    }

    public static rw4[] values() {
        return (rw4[]) L.clone();
    }
}

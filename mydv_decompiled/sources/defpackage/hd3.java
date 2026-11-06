package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hd3 {
    public static final hd3 I;
    public static final hd3 J;
    public static final hd3 K;
    public static final /* synthetic */ hd3[] L;

    static {
        hd3 hd3Var = new hd3("NO_OP", 0);
        I = hd3Var;
        hd3 hd3Var2 = new hd3("ADD", 1);
        J = hd3Var2;
        hd3 hd3Var3 = new hd3("REMOVE", 2);
        K = hd3Var3;
        L = new hd3[]{hd3Var, hd3Var2, hd3Var3};
    }

    public static hd3 valueOf(String str) {
        return (hd3) Enum.valueOf(hd3.class, str);
    }

    public static hd3[] values() {
        return (hd3[]) L.clone();
    }
}

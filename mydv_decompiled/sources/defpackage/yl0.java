package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yl0 {
    public static final yl0 I;
    public static final yl0 J;
    public static final yl0 K;
    public static final /* synthetic */ yl0[] L;

    static {
        yl0 yl0Var = new yl0("CROSSED", 0);
        I = yl0Var;
        yl0 yl0Var2 = new yl0("NOT_CROSSED", 1);
        J = yl0Var2;
        yl0 yl0Var3 = new yl0("COLLAPSED", 2);
        K = yl0Var3;
        L = new yl0[]{yl0Var, yl0Var2, yl0Var3};
    }

    public static yl0 valueOf(String str) {
        return (yl0) Enum.valueOf(yl0.class, str);
    }

    public static yl0[] values() {
        return (yl0[]) L.clone();
    }
}

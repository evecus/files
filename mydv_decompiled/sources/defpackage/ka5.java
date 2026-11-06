package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ka5 {
    public static final ka5 I;
    public static final ka5 J;
    public static final ka5 K;
    public static final /* synthetic */ ka5[] L;

    static {
        ka5 ka5Var = new ka5("ContinueTraversal", 0);
        I = ka5Var;
        ka5 ka5Var2 = new ka5("SkipSubtreeAndContinueTraversal", 1);
        J = ka5Var2;
        ka5 ka5Var3 = new ka5("CancelTraversal", 2);
        K = ka5Var3;
        L = new ka5[]{ka5Var, ka5Var2, ka5Var3};
    }

    public static ka5 valueOf(String str) {
        return (ka5) Enum.valueOf(ka5.class, str);
    }

    public static ka5[] values() {
        return (ka5[]) L.clone();
    }
}

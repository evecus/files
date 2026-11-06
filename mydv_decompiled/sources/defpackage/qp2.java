package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qp2 {
    public static final qp2 I;
    public static final qp2 J;
    public static final qp2 K;
    public static final qp2 L;
    public static final /* synthetic */ qp2[] M;

    static {
        qp2 qp2Var = new qp2("CONNECTING", 0);
        I = qp2Var;
        qp2 qp2Var2 = new qp2("CONNECTED", 1);
        J = qp2Var2;
        qp2 qp2Var3 = new qp2("DISCONNECTED", 2);
        K = qp2Var3;
        qp2 qp2Var4 = new qp2("ERROR", 3);
        L = qp2Var4;
        M = new qp2[]{qp2Var, qp2Var2, qp2Var3, qp2Var4};
    }

    public static qp2 valueOf(String str) {
        return (qp2) Enum.valueOf(qp2.class, str);
    }

    public static qp2[] values() {
        return (qp2[]) M.clone();
    }
}

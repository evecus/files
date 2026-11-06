package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uy3 {
    public static final uy3 I;
    public static final uy3 J;
    public static final uy3 K;
    public static final uy3 L;
    public static final uy3 M;
    public static final uy3 N;
    public static final uy3 O;
    public static final /* synthetic */ uy3[] P;

    static {
        uy3 uy3Var = new uy3("IDLE", 0);
        I = uy3Var;
        uy3 uy3Var2 = new uy3("STARTING", 1);
        J = uy3Var2;
        uy3 uy3Var3 = new uy3("WAITING_SCAN", 2);
        K = uy3Var3;
        uy3 uy3Var4 = new uy3("SCANNED", 3);
        L = uy3Var4;
        uy3 uy3Var5 = new uy3("EXPIRED", 4);
        M = uy3Var5;
        uy3 uy3Var6 = new uy3("SUCCESS", 5);
        N = uy3Var6;
        uy3 uy3Var7 = new uy3("FAILED", 6);
        O = uy3Var7;
        P = new uy3[]{uy3Var, uy3Var2, uy3Var3, uy3Var4, uy3Var5, uy3Var6, uy3Var7};
    }

    public static uy3 valueOf(String str) {
        return (uy3) Enum.valueOf(uy3.class, str);
    }

    public static uy3[] values() {
        return (uy3[]) P.clone();
    }
}

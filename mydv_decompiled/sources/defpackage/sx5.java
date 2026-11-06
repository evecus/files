package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sx5 {
    public static final sx5 I;
    public static final sx5 J;
    public static final sx5 K;
    public static final sx5 L;
    public static final sx5 M;
    public static final sx5 N;
    public static final /* synthetic */ sx5[] O;

    static {
        sx5 sx5Var = new sx5("ENQUEUED", 0);
        I = sx5Var;
        sx5 sx5Var2 = new sx5("RUNNING", 1);
        J = sx5Var2;
        sx5 sx5Var3 = new sx5("SUCCEEDED", 2);
        K = sx5Var3;
        sx5 sx5Var4 = new sx5("FAILED", 3);
        L = sx5Var4;
        sx5 sx5Var5 = new sx5("BLOCKED", 4);
        M = sx5Var5;
        sx5 sx5Var6 = new sx5("CANCELLED", 5);
        N = sx5Var6;
        O = new sx5[]{sx5Var, sx5Var2, sx5Var3, sx5Var4, sx5Var5, sx5Var6};
    }

    public static sx5 valueOf(String str) {
        return (sx5) Enum.valueOf(sx5.class, str);
    }

    public static sx5[] values() {
        return (sx5[]) O.clone();
    }

    public final boolean a() {
        return this == K || this == L || this == N;
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class km1 {
    public static final km1 I;
    public static final km1 J;
    public static final km1 K;
    public static final km1 L;
    public static final km1 M;
    public static final /* synthetic */ km1[] N;

    static {
        km1 km1Var = new km1("ON_CONFIGURE", 0);
        I = km1Var;
        km1 km1Var2 = new km1("ON_CREATE", 1);
        J = km1Var2;
        km1 km1Var3 = new km1("ON_UPGRADE", 2);
        K = km1Var3;
        km1 km1Var4 = new km1("ON_DOWNGRADE", 3);
        L = km1Var4;
        km1 km1Var5 = new km1("ON_OPEN", 4);
        M = km1Var5;
        N = new km1[]{km1Var, km1Var2, km1Var3, km1Var4, km1Var5};
    }

    public static km1 valueOf(String str) {
        return (km1) Enum.valueOf(km1.class, str);
    }

    public static km1[] values() {
        return (km1[]) N.clone();
    }
}

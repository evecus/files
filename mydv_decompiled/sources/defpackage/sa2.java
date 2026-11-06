package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class sa2 {
    public static final sa2 I;
    public static final sa2 J;
    public static final sa2 K;
    public static final sa2 L;
    public static final sa2 M;
    public static final /* synthetic */ sa2[] N;

    static {
        sa2 sa2Var = new sa2("Measuring", 0);
        I = sa2Var;
        sa2 sa2Var2 = new sa2("LookaheadMeasuring", 1);
        J = sa2Var2;
        sa2 sa2Var3 = new sa2("LayingOut", 2);
        K = sa2Var3;
        sa2 sa2Var4 = new sa2("LookaheadLayingOut", 3);
        L = sa2Var4;
        sa2 sa2Var5 = new sa2("Idle", 4);
        M = sa2Var5;
        N = new sa2[]{sa2Var, sa2Var2, sa2Var3, sa2Var4, sa2Var5};
    }

    public static sa2 valueOf(String str) {
        return (sa2) Enum.valueOf(sa2.class, str);
    }

    public static sa2[] values() {
        return (sa2[]) N.clone();
    }
}

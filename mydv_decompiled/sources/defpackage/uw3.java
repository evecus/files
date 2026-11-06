package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class uw3 {
    public static final uw3 I;
    public static final uw3 J;
    public static final uw3 K;
    public static final uw3 L;
    public static final uw3 M;
    public static final uw3 N;
    public static final uw3 O;
    public static final uw3 P;
    public static final /* synthetic */ uw3[] Q;

    static {
        uw3 uw3Var = new uw3("VIDEOS", 0);
        I = uw3Var;
        uw3 uw3Var2 = new uw3("FAVORITES", 1);
        J = uw3Var2;
        uw3 uw3Var3 = new uw3("FOLLOWERS", 2);
        K = uw3Var3;
        uw3 uw3Var4 = new uw3("FOLLOWING", 3);
        L = uw3Var4;
        uw3 uw3Var5 = new uw3("HISTORY", 4);
        M = uw3Var5;
        uw3 uw3Var6 = new uw3("COLLECTIONS", 5);
        N = uw3Var6;
        uw3 uw3Var7 = new uw3("WATCH_LATER", 6);
        O = uw3Var7;
        uw3 uw3Var8 = new uw3("MIXES", 7);
        P = uw3Var8;
        Q = new uw3[]{uw3Var, uw3Var2, uw3Var3, uw3Var4, uw3Var5, uw3Var6, uw3Var7, uw3Var8};
    }

    public static uw3 valueOf(String str) {
        return (uw3) Enum.valueOf(uw3.class, str);
    }

    public static uw3[] values() {
        return (uw3[]) Q.clone();
    }
}

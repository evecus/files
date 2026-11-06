package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ho2 {
    public static final ho2 I;
    public static final ho2 J;
    public static final ho2 K;
    public static final ho2 L;
    public static final ho2 M;
    public static final /* synthetic */ ho2[] N;

    static {
        ho2 ho2Var = new ho2("USER_RETRY", 0);
        I = ho2Var;
        ho2 ho2Var2 = new ho2("FIRST_FRAME_TIMEOUT", 1);
        J = ho2Var2;
        ho2 ho2Var3 = new ho2("PLAYER_ERROR", 2);
        K = ho2Var3;
        ho2 ho2Var4 = new ho2("BUFFERING_TIMEOUT", 3);
        L = ho2Var4;
        ho2 ho2Var5 = new ho2("POSITION_STALL", 4);
        M = ho2Var5;
        N = new ho2[]{ho2Var, ho2Var2, ho2Var3, ho2Var4, ho2Var5};
    }

    public static ho2 valueOf(String str) {
        return (ho2) Enum.valueOf(ho2.class, str);
    }

    public static ho2[] values() {
        return (ho2[]) N.clone();
    }
}

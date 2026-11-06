package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ms2 {
    public static final ms2 I;
    public static final ms2 J;
    public static final ms2 K;
    public static final /* synthetic */ ms2[] L;

    static {
        ms2 ms2Var = new ms2("IsPlacedInLookahead", 0);
        I = ms2Var;
        ms2 ms2Var2 = new ms2("IsPlacedInApproach", 1);
        J = ms2Var2;
        ms2 ms2Var3 = new ms2("IsNotPlaced", 2);
        K = ms2Var3;
        L = new ms2[]{ms2Var, ms2Var2, ms2Var3};
    }

    public static ms2 valueOf(String str) {
        return (ms2) Enum.valueOf(ms2.class, str);
    }

    public static ms2[] values() {
        return (ms2[]) L.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class pg3 {
    public static final pg3 I;
    public static final pg3 J;
    public static final /* synthetic */ pg3[] K;

    static {
        pg3 pg3Var = new pg3("Vertical", 0);
        I = pg3Var;
        pg3 pg3Var2 = new pg3("Horizontal", 1);
        J = pg3Var2;
        K = new pg3[]{pg3Var, pg3Var2};
    }

    public static pg3 valueOf(String str) {
        return (pg3) Enum.valueOf(pg3.class, str);
    }

    public static pg3[] values() {
        return (pg3[]) K.clone();
    }
}

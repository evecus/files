package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ro0 {
    public static final ro0 J;
    public static final /* synthetic */ ro0[] K;
    public static final /* synthetic */ za1 L;
    public final float I;

    static {
        ro0 ro0Var = new ro0(0.1f, 0, "AREA_10");
        ro0 ro0Var2 = new ro0(0.25f, 1, "AREA_25");
        ro0 ro0Var3 = new ro0(0.5f, 2, "AREA_50");
        ro0 ro0Var4 = new ro0(0.75f, 3, "AREA_75");
        ro0 ro0Var5 = new ro0(1.0f, 4, "AREA_100");
        J = ro0Var5;
        ro0[] ro0VarArr = {ro0Var, ro0Var2, ro0Var3, ro0Var4, ro0Var5};
        K = ro0VarArr;
        L = new za1(ro0VarArr);
    }

    public ro0(float f, int i, String str) {
        this.I = f;
    }

    public static ro0 valueOf(String str) {
        return (ro0) Enum.valueOf(ro0.class, str);
    }

    public static ro0[] values() {
        return (ro0[]) K.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class vo0 {
    public static final vo0 K;
    public static final /* synthetic */ vo0[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final float J;

    static {
        vo0 vo0Var = new vo0("SLOW", 0, "慢", 0.5f);
        vo0 vo0Var2 = new vo0("NORMAL", 1, "中", 1.0f);
        K = vo0Var2;
        vo0[] vo0VarArr = {vo0Var, vo0Var2, new vo0("FAST", 2, "快", 1.5f)};
        L = vo0VarArr;
        M = new za1(vo0VarArr);
    }

    public vo0(String str, int i, String str2, float f) {
        this.I = str2;
        this.J = f;
    }

    public static vo0 valueOf(String str) {
        return (vo0) Enum.valueOf(vo0.class, str);
    }

    public static vo0[] values() {
        return (vo0[]) L.clone();
    }
}

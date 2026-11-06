package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class so0 {
    public static final so0 K;
    public static final /* synthetic */ so0[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final float J;

    static {
        so0 so0Var = new so0("EXTRA_SMALL", 0, "超小", 1.0f);
        so0 so0Var2 = new so0("SMALL", 1, "小", 1.5f);
        so0 so0Var3 = new so0("MEDIUM", 2, "中", 2.0f);
        K = so0Var3;
        so0[] so0VarArr = {so0Var, so0Var2, so0Var3, new so0("LARGE", 3, "大", 2.5f), new so0("EXTRA_LARGE", 4, "超大", 3.0f)};
        L = so0VarArr;
        M = new za1(so0VarArr);
    }

    public so0(String str, int i, String str2, float f) {
        this.I = str2;
        this.J = f;
    }

    public static so0 valueOf(String str) {
        return (so0) Enum.valueOf(so0.class, str);
    }

    public static so0[] values() {
        return (so0[]) L.clone();
    }
}

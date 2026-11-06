package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rm2 {
    public static final rm2 K;
    public static final /* synthetic */ rm2[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final float J;

    static {
        rm2 rm2Var = new rm2("SMALL", 0, "小", 0.8f);
        rm2 rm2Var2 = new rm2("NORMAL", 1, "中", 1.0f);
        K = rm2Var2;
        rm2[] rm2VarArr = {rm2Var, rm2Var2, new rm2("LARGE", 2, "大", 1.2f), new rm2("EXTRA_LARGE", 3, "超大", 1.5f)};
        L = rm2VarArr;
        M = new za1(rm2VarArr);
    }

    public rm2(String str, int i, String str2, float f) {
        this.I = str2;
        this.J = f;
    }

    public static rm2 valueOf(String str) {
        return (rm2) Enum.valueOf(rm2.class, str);
    }

    public static rm2[] values() {
        return (rm2[]) L.clone();
    }
}

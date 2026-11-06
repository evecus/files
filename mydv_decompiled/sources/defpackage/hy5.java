package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class hy5 {
    public static final hy5 K;
    public static final /* synthetic */ hy5[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final String J;

    static {
        hy5 hy5Var = new hy5("NEWEST", "最新在前", "最新", 0);
        K = hy5Var;
        hy5[] hy5VarArr = {hy5Var, new hy5("OLDEST", "最早在前", "最早", 1)};
        L = hy5VarArr;
        M = new za1(hy5VarArr);
    }

    public hy5(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static hy5 valueOf(String str) {
        return (hy5) Enum.valueOf(hy5.class, str);
    }

    public static hy5[] values() {
        return (hy5[]) L.clone();
    }
}

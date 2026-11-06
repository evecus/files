package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class br3 {
    public static final br3 I;
    public static final br3 J;
    public static final br3 K;
    public static final /* synthetic */ br3[] L;

    static {
        br3 br3Var = new br3("None", 0);
        I = br3Var;
        br3 br3Var2 = new br3("TopBottom", 1);
        J = br3Var2;
        br3 br3Var3 = new br3("SideBySide", 2);
        K = br3Var3;
        L = new br3[]{br3Var, br3Var2, br3Var3};
    }

    public static br3 valueOf(String str) {
        return (br3) Enum.valueOf(br3.class, str);
    }

    public static br3[] values() {
        return (br3[]) L.clone();
    }
}

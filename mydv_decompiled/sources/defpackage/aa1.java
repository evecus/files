package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class aa1 {
    public static final aa1 I;
    public static final aa1 J;
    public static final aa1 K;
    public static final /* synthetic */ aa1[] L;

    static {
        aa1 aa1Var = new aa1("PreEnter", 0);
        I = aa1Var;
        aa1 aa1Var2 = new aa1("Visible", 1);
        J = aa1Var2;
        aa1 aa1Var3 = new aa1("PostExit", 2);
        K = aa1Var3;
        L = new aa1[]{aa1Var, aa1Var2, aa1Var3};
    }

    public static aa1 valueOf(String str) {
        return (aa1) Enum.valueOf(aa1.class, str);
    }

    public static aa1[] values() {
        return (aa1[]) L.clone();
    }
}

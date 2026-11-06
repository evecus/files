package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class wm3 {
    public static final wm3 I;
    public static final wm3 J;
    public static final /* synthetic */ wm3[] K;

    static {
        wm3 wm3Var = new wm3("Success", 0);
        I = wm3Var;
        wm3 wm3Var2 = new wm3("Failure", 1);
        J = wm3Var2;
        K = new wm3[]{wm3Var, wm3Var2};
    }

    public static wm3 valueOf(String str) {
        return (wm3) Enum.valueOf(wm3.class, str);
    }

    public static wm3[] values() {
        return (wm3[]) K.clone();
    }
}

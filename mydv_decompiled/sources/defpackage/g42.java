package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class g42 {
    public static final g42 I;
    public static final g42 J;
    public static final /* synthetic */ g42[] K;

    static {
        g42 g42Var = new g42("Width", 0);
        I = g42Var;
        g42 g42Var2 = new g42("Height", 1);
        J = g42Var2;
        K = new g42[]{g42Var, g42Var2};
    }

    public static g42 valueOf(String str) {
        return (g42) Enum.valueOf(g42.class, str);
    }

    public static g42[] values() {
        return (g42[]) K.clone();
    }
}

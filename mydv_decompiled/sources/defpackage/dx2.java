package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dx2 {
    public static final dx2 I;
    public static final dx2 J;
    public static final /* synthetic */ dx2[] K;

    static {
        dx2 dx2Var = new dx2("Min", 0);
        I = dx2Var;
        dx2 dx2Var2 = new dx2("Max", 1);
        J = dx2Var2;
        K = new dx2[]{dx2Var, dx2Var2};
    }

    public static dx2 valueOf(String str) {
        return (dx2) Enum.valueOf(dx2.class, str);
    }

    public static dx2[] values() {
        return (dx2[]) K.clone();
    }
}

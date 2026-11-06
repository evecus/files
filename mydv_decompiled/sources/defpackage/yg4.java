package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class yg4 {
    public static final yg4 I;
    public static final yg4 J;
    public static final /* synthetic */ yg4[] K;

    static {
        yg4 yg4Var = new yg4("Inherit", 0);
        I = yg4Var;
        yg4 yg4Var2 = new yg4("SecureOn", 1);
        J = yg4Var2;
        K = new yg4[]{yg4Var, yg4Var2, new yg4("SecureOff", 2)};
    }

    public static yg4 valueOf(String str) {
        return (yg4) Enum.valueOf(yg4.class, str);
    }

    public static yg4[] values() {
        return (yg4[]) K.clone();
    }
}

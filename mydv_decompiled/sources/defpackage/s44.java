package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class s44 {
    public static final s44 I;
    public static final s44 J;
    public static final /* synthetic */ s44[] K;

    static {
        s44 s44Var = new s44("Ltr", 0);
        I = s44Var;
        s44 s44Var2 = new s44("Rtl", 1);
        J = s44Var2;
        K = new s44[]{s44Var, s44Var2};
    }

    public static s44 valueOf(String str) {
        return (s44) Enum.valueOf(s44.class, str);
    }

    public static s44[] values() {
        return (s44[]) K.clone();
    }
}

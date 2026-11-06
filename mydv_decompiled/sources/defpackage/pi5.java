package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class pi5 {
    public static final pi5 I;
    public static final pi5 J;
    public static final /* synthetic */ pi5[] K;

    /* JADX INFO: Fake field, exist only in values array */
    pi5 EF0;

    static {
        pi5 pi5Var = new pi5("STRICT", 0);
        pi5 pi5Var2 = new pi5("LOG", 1);
        I = pi5Var2;
        pi5 pi5Var3 = new pi5("QUIET", 2);
        J = pi5Var3;
        K = new pi5[]{pi5Var, pi5Var2, pi5Var3};
    }

    public static pi5 valueOf(String str) {
        return (pi5) Enum.valueOf(pi5.class, str);
    }

    public static pi5[] values() {
        return (pi5[]) K.clone();
    }
}

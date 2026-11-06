package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class c42 {
    public static final c42 I;
    public static final c42 J;
    public static final /* synthetic */ c42[] K;

    static {
        c42 c42Var = new c42("Min", 0);
        I = c42Var;
        c42 c42Var2 = new c42("Max", 1);
        J = c42Var2;
        K = new c42[]{c42Var, c42Var2};
    }

    public static c42 valueOf(String str) {
        return (c42) Enum.valueOf(c42.class, str);
    }

    public static c42[] values() {
        return (c42[]) K.clone();
    }
}

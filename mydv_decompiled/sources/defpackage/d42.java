package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d42 {
    public static final d42 I;
    public static final d42 J;
    public static final /* synthetic */ d42[] K;

    static {
        d42 d42Var = new d42("Min", 0);
        I = d42Var;
        d42 d42Var2 = new d42("Max", 1);
        J = d42Var2;
        K = new d42[]{d42Var, d42Var2};
    }

    public static d42 valueOf(String str) {
        return (d42) Enum.valueOf(d42.class, str);
    }

    public static d42[] values() {
        return (d42[]) K.clone();
    }
}

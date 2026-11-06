package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d44 {
    public static final d44 I;
    public static final d44 J;
    public static final /* synthetic */ d44[] K;

    static {
        d44 d44Var = new d44("Restart", 0);
        I = d44Var;
        d44 d44Var2 = new d44("Reverse", 1);
        J = d44Var2;
        K = new d44[]{d44Var, d44Var2};
    }

    public static d44 valueOf(String str) {
        return (d44) Enum.valueOf(d44.class, str);
    }

    public static d44[] values() {
        return (d44[]) K.clone();
    }
}

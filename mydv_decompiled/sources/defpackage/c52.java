package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class c52 {
    public static final c52 I;
    public static final c52 J;
    public static final c52 K;
    public static final c52 L;
    public static final /* synthetic */ c52[] M;

    static {
        c52 c52Var = new c52("IGNORED", 0);
        I = c52Var;
        c52 c52Var2 = new c52("SCHEDULED", 1);
        J = c52Var2;
        c52 c52Var3 = new c52("DEFERRED", 2);
        K = c52Var3;
        c52 c52Var4 = new c52("IMMINENT", 3);
        L = c52Var4;
        M = new c52[]{c52Var, c52Var2, c52Var3, c52Var4};
    }

    public static c52 valueOf(String str) {
        return (c52) Enum.valueOf(c52.class, str);
    }

    public static c52[] values() {
        return (c52[]) M.clone();
    }
}

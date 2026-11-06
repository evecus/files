package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class d14 {
    public static final d14 I;
    public static final d14 J;
    public static final d14 K;
    public static final d14 L;
    public static final d14 M;
    public static final d14 N;
    public static final /* synthetic */ d14[] O;

    static {
        d14 d14Var = new d14("ShutDown", 0);
        I = d14Var;
        d14 d14Var2 = new d14("ShuttingDown", 1);
        J = d14Var2;
        d14 d14Var3 = new d14("Inactive", 2);
        K = d14Var3;
        d14 d14Var4 = new d14("InactivePendingWork", 3);
        L = d14Var4;
        d14 d14Var5 = new d14("Idle", 4);
        M = d14Var5;
        d14 d14Var6 = new d14("PendingWork", 5);
        N = d14Var6;
        O = new d14[]{d14Var, d14Var2, d14Var3, d14Var4, d14Var5, d14Var6};
    }

    public static d14 valueOf(String str) {
        return (d14) Enum.valueOf(d14.class, str);
    }

    public static d14[] values() {
        return (d14[]) O.clone();
    }
}

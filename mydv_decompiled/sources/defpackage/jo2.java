package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class jo2 {
    public static final jo2 I;
    public static final jo2 J;
    public static final jo2 K;
    public static final jo2 L;
    public static final /* synthetic */ jo2[] M;

    static {
        jo2 jo2Var = new jo2("IDLE", 0);
        I = jo2Var;
        jo2 jo2Var2 = new jo2("BUFFERING", 1);
        J = jo2Var2;
        jo2 jo2Var3 = new jo2("READY", 2);
        K = jo2Var3;
        jo2 jo2Var4 = new jo2("ENDED", 3);
        L = jo2Var4;
        M = new jo2[]{jo2Var, jo2Var2, jo2Var3, jo2Var4};
    }

    public static jo2 valueOf(String str) {
        return (jo2) Enum.valueOf(jo2.class, str);
    }

    public static jo2[] values() {
        return (jo2[]) M.clone();
    }
}

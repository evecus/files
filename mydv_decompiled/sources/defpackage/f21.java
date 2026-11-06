package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class f21 {
    public static final f21 I;
    public static final f21 J;
    public static final f21 K;
    public static final /* synthetic */ f21[] L;

    static {
        f21 f21Var = new f21("Yes", 0);
        I = f21Var;
        f21 f21Var2 = new f21("No", 1);
        J = f21Var2;
        f21 f21Var3 = new f21("NotInitialized", 2);
        K = f21Var3;
        L = new f21[]{f21Var, f21Var2, f21Var3};
    }

    public static f21 valueOf(String str) {
        return (f21) Enum.valueOf(f21.class, str);
    }

    public static f21[] values() {
        return (f21[]) L.clone();
    }
}

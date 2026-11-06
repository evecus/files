package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class yp3 {
    public static final yp3 I;
    public static final yp3 J;
    public static final yp3 K;
    public static final /* synthetic */ yp3[] L;

    static {
        yp3 yp3Var = new yp3("Unknown", 0);
        I = yp3Var;
        yp3 yp3Var2 = new yp3("Dispatching", 1);
        J = yp3Var2;
        yp3 yp3Var3 = new yp3("NotDispatching", 2);
        K = yp3Var3;
        L = new yp3[]{yp3Var, yp3Var2, yp3Var3};
    }

    public static yp3 valueOf(String str) {
        return (yp3) Enum.valueOf(yp3.class, str);
    }

    public static yp3[] values() {
        return (yp3[]) L.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dx5 {
    public static final dx5 I;
    public static final dx5 J;
    public static final dx5 K;
    public static final dx5 L;
    public static final dx5 M;
    public static final dx5 N;
    public static final dx5 O;
    public static final dx5 P;
    public static final dx5 Q;
    public static final /* synthetic */ dx5[] R;

    static {
        dx5 dx5Var = new dx5("INT", 0);
        I = dx5Var;
        dx5 dx5Var2 = new dx5("LONG", 1);
        J = dx5Var2;
        dx5 dx5Var3 = new dx5("FLOAT", 2);
        K = dx5Var3;
        dx5 dx5Var4 = new dx5("DOUBLE", 3);
        L = dx5Var4;
        dx5 dx5Var5 = new dx5("BOOLEAN", 4);
        M = dx5Var5;
        dx5 dx5Var6 = new dx5("STRING", 5);
        N = dx5Var6;
        f00 f00Var = f00.K;
        dx5 dx5Var7 = new dx5("BYTE_STRING", 6);
        O = dx5Var7;
        dx5 dx5Var8 = new dx5("ENUM", 7);
        P = dx5Var8;
        dx5 dx5Var9 = new dx5("MESSAGE", 8);
        Q = dx5Var9;
        R = new dx5[]{dx5Var, dx5Var2, dx5Var3, dx5Var4, dx5Var5, dx5Var6, dx5Var7, dx5Var8, dx5Var9};
    }

    public static dx5 valueOf(String str) {
        return (dx5) Enum.valueOf(dx5.class, str);
    }

    public static dx5[] values() {
        return (dx5[]) R.clone();
    }
}

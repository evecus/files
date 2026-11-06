package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class d7 {
    public static final d7 I;
    public static final d7 J;
    public static final /* synthetic */ d7[] K;

    /* JADX INFO: Fake field, exist only in values array */
    d7 EF0;

    static {
        d7 d7Var = new d7("ACTIVITY", 0);
        d7 d7Var2 = new d7("BROADCAST", 1);
        I = d7Var2;
        d7 d7Var3 = new d7("SERVICE", 2);
        d7 d7Var4 = new d7("FOREGROUND_SERVICE", 3);
        d7 d7Var5 = new d7("CALLBACK", 4);
        J = d7Var5;
        K = new d7[]{d7Var, d7Var2, d7Var3, d7Var4, d7Var5};
    }

    public static d7 valueOf(String str) {
        return (d7) Enum.valueOf(d7.class, str);
    }

    public static d7[] values() {
        return (d7[]) K.clone();
    }
}

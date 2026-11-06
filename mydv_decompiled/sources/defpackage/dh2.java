package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class dh2 {
    public static final dh2 I;
    public static final dh2 J;
    public static final /* synthetic */ dh2[] K;

    /* JADX INFO: Fake field, exist only in values array */
    dh2 EF0;

    static {
        dh2 dh2Var = new dh2("SYNCHRONIZED", 0);
        dh2 dh2Var2 = new dh2("PUBLICATION", 1);
        I = dh2Var2;
        dh2 dh2Var3 = new dh2("NONE", 2);
        J = dh2Var3;
        K = new dh2[]{dh2Var, dh2Var2, dh2Var3};
    }

    public static dh2 valueOf(String str) {
        return (dh2) Enum.valueOf(dh2.class, str);
    }

    public static dh2[] values() {
        return (dh2[]) K.clone();
    }
}

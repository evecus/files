package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class dh1 {
    public static final dh1 I;
    public static final /* synthetic */ dh1[] J;

    /* JADX INFO: Fake field, exist only in values array */
    dh1 EF0;

    static {
        dh1 dh1Var = new dh1("Visible", 0);
        dh1 dh1Var2 = new dh1("Clip", 1);
        I = dh1Var2;
        J = new dh1[]{dh1Var, dh1Var2, new dh1("ExpandIndicator", 2), new dh1("ExpandOrCollapseIndicator", 3)};
    }

    public static dh1 valueOf(String str) {
        return (dh1) Enum.valueOf(dh1.class, str);
    }

    public static dh1[] values() {
        return (dh1[]) J.clone();
    }
}

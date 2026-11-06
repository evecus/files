package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class rh4 {
    public static final rh4 I;
    public static final /* synthetic */ rh4[] J;

    static {
        rh4 rh4Var = new rh4("EditableText", 0);
        I = rh4Var;
        J = new rh4[]{rh4Var, new rh4("StaticText", 1)};
    }

    public static rh4 valueOf(String str) {
        return (rh4) Enum.valueOf(rh4.class, str);
    }

    public static rh4[] values() {
        return (rh4[]) J.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class v85 {
    public static final v85 I;
    public static final v85 J;
    public static final v85 K;
    public static final /* synthetic */ v85[] L;

    static {
        v85 v85Var = new v85("Uninitialized", 0);
        I = v85Var;
        v85 v85Var2 = new v85("Detached", 1);
        J = v85Var2;
        v85 v85Var3 = new v85("Attached", 2);
        K = v85Var3;
        L = new v85[]{v85Var, v85Var2, v85Var3};
    }

    public static v85 valueOf(String str) {
        return (v85) Enum.valueOf(v85.class, str);
    }

    public static v85[] values() {
        return (v85[]) L.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class s90 {
    public static final r90 Companion;
    public static final s90 K;
    public static final /* synthetic */ s90[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final String J;

    static {
        s90 s90Var = new s90("BY_SCENE", "按场景", "by_scene", 0);
        K = s90Var;
        s90[] s90VarArr = {s90Var, new s90("VIBRANT", "鲜明", "vibrant", 1), new s90("SOFT", "柔和", "soft", 2), new s90("FIDELITY", "忠实", "fidelity", 3)};
        L = s90VarArr;
        M = new za1(s90VarArr);
        Companion = new r90();
    }

    public s90(String str, String str2, String str3, int i) {
        this.I = str2;
        this.J = str3;
    }

    public static s90 valueOf(String str) {
        return (s90) Enum.valueOf(s90.class, str);
    }

    public static s90[] values() {
        return (s90[]) L.clone();
    }
}

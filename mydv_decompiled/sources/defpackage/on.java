package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class on {
    public static final on K;
    public static final /* synthetic */ on[] L;
    public static final /* synthetic */ za1 M;
    public final String I;
    public final float J;

    static {
        on onVar = new on("STANDARD", 0, "标准", 1.0f);
        K = onVar;
        on[] onVarArr = {onVar, new on("LARGE", 1, "大", 1.15f), new on("EXTRA_LARGE", 2, "特大", 1.3f), new on("HUGE", 3, "超大", 1.5f)};
        L = onVarArr;
        M = new za1(onVarArr);
    }

    public on(String str, int i, String str2, float f) {
        this.I = str2;
        this.J = f;
    }

    public static za1 a() {
        return M;
    }

    public static on valueOf(String str) {
        return (on) Enum.valueOf(on.class, str);
    }

    public static on[] values() {
        return (on[]) L.clone();
    }

    public final float b() {
        return this.J;
    }
}

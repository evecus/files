package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class xi {
    public static final xi I;
    public static final xi J;
    public static final /* synthetic */ xi[] K;

    static {
        xi xiVar = new xi("BoundReached", 0);
        I = xiVar;
        xi xiVar2 = new xi("Finished", 1);
        J = xiVar2;
        K = new xi[]{xiVar, xiVar2};
    }

    public static xi valueOf(String str) {
        return (xi) Enum.valueOf(xi.class, str);
    }

    public static xi[] values() {
        return (xi[]) K.clone();
    }
}

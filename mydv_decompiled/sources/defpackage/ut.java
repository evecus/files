package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ut {
    public static final ut I;
    public static final ut J;
    public static final /* synthetic */ ut[] K;

    static {
        ut utVar = new ut("EXPONENTIAL", 0);
        I = utVar;
        ut utVar2 = new ut("LINEAR", 1);
        J = utVar2;
        K = new ut[]{utVar, utVar2};
    }

    public static ut valueOf(String str) {
        return (ut) Enum.valueOf(ut.class, str);
    }

    public static ut[] values() {
        return (ut[]) K.clone();
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ez {
    public static final ez I;
    public static final ez J;
    public static final ez K;
    public static final /* synthetic */ ez[] L;

    static {
        ez ezVar = new ez("SUSPEND", 0);
        I = ezVar;
        ez ezVar2 = new ez("DROP_OLDEST", 1);
        J = ezVar2;
        ez ezVar3 = new ez("DROP_LATEST", 2);
        K = ezVar3;
        L = new ez[]{ezVar, ezVar2, ezVar3};
    }

    public static ez valueOf(String str) {
        return (ez) Enum.valueOf(ez.class, str);
    }

    public static ez[] values() {
        return (ez[]) L.clone();
    }
}

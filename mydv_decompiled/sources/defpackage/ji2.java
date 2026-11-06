package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class ji2 {
    private static final /* synthetic */ ya1 $ENTRIES;
    private static final /* synthetic */ ji2[] $VALUES;
    public static final hi2 Companion;
    public static final ji2 ON_ANY;
    public static final ji2 ON_CREATE;
    public static final ji2 ON_DESTROY;
    public static final ji2 ON_PAUSE;
    public static final ji2 ON_RESUME;
    public static final ji2 ON_START;
    public static final ji2 ON_STOP;

    static {
        ji2 ji2Var = new ji2("ON_CREATE", 0);
        ON_CREATE = ji2Var;
        ji2 ji2Var2 = new ji2("ON_START", 1);
        ON_START = ji2Var2;
        ji2 ji2Var3 = new ji2("ON_RESUME", 2);
        ON_RESUME = ji2Var3;
        ji2 ji2Var4 = new ji2("ON_PAUSE", 3);
        ON_PAUSE = ji2Var4;
        ji2 ji2Var5 = new ji2("ON_STOP", 4);
        ON_STOP = ji2Var5;
        ji2 ji2Var6 = new ji2("ON_DESTROY", 5);
        ON_DESTROY = ji2Var6;
        ji2 ji2Var7 = new ji2("ON_ANY", 6);
        ON_ANY = ji2Var7;
        ji2[] ji2VarArr = {ji2Var, ji2Var2, ji2Var3, ji2Var4, ji2Var5, ji2Var6, ji2Var7};
        $VALUES = ji2VarArr;
        $ENTRIES = new za1(ji2VarArr);
        Companion = new hi2();
    }

    public static ji2 valueOf(String str) {
        return (ji2) Enum.valueOf(ji2.class, str);
    }

    public static ji2[] values() {
        return (ji2[]) $VALUES.clone();
    }

    public final ki2 a() {
        switch (ii2.a[ordinal()]) {
            case 1:
            case 2:
                return ki2.K;
            case 3:
            case 4:
                return ki2.L;
            case 5:
                return ki2.M;
            case 6:
                return ki2.I;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                s83.v();
                return null;
        }
    }
}

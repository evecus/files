package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class sb2 extends ap1 {
    private static final sb2 DEFAULT_INSTANCE;
    private static volatile mk3 PARSER;

    static {
        sb2 sb2Var = new sb2();
        DEFAULT_INSTANCE = sb2Var;
        ap1.j(sb2.class, sb2Var);
    }

    public static rb2 m() {
        return (rb2) DEFAULT_INSTANCE.b();
    }

    @Override // defpackage.ap1
    public final Object c(int i) {
        mk3 mk3Var;
        switch (pt1.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new i04(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new sb2();
            case 4:
                return new rb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (sb2.class) {
                    try {
                        mk3Var = PARSER;
                        if (mk3Var == null) {
                            mk3Var = new yo1();
                            PARSER = mk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return mk3Var;
            default:
                e1.a();
                return null;
        }
    }
}

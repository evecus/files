package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class qb2 extends ap1 {
    public static final int ACTIONKEY_FIELD_NUMBER = 3;
    public static final int APP_WIDGET_ID_FIELD_NUMBER = 2;
    private static final qb2 DEFAULT_INSTANCE;
    private static volatile mk3 PARSER = null;
    public static final int RECEIVER_FIELD_NUMBER = 1;
    private int appWidgetId_;
    private String receiver_ = "";
    private String actionKey_ = "";

    static {
        qb2 qb2Var = new qb2();
        DEFAULT_INSTANCE = qb2Var;
        ap1.j(qb2.class, qb2Var);
    }

    public static qb2 o() {
        return DEFAULT_INSTANCE;
    }

    public static pb2 q() {
        return (pb2) DEFAULT_INSTANCE.b();
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
                return new i04(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"receiver_", "appWidgetId_", "actionKey_"});
            case 3:
                return new qb2();
            case 4:
                return new pb2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                mk3 mk3Var2 = PARSER;
                if (mk3Var2 != null) {
                    return mk3Var2;
                }
                synchronized (qb2.class) {
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

    public final String m() {
        return this.actionKey_;
    }

    public final int n() {
        return this.appWidgetId_;
    }

    public final String p() {
        return this.receiver_;
    }

    public final void r(String str) {
        this.actionKey_ = str;
    }

    public final void s(int i) {
        this.appWidgetId_ = i;
    }

    public final void t(String str) {
        str.getClass();
        this.receiver_ = str;
    }
}
